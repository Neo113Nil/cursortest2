package one.video.calls.sdk.internal.stat.webrtc.config;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.collections.EmptySet;
import one.video.calls.sdk.internal.stat.webrtc.config.WebRTCStatConfig;
import org.json.JSONArray;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.config.BaseConfigProvider;
import xsna.epx;
import xsna.lhx0;

/* compiled from: WebRTCStatConfigProviderImpl.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public final class a extends BaseConfigProvider<WebRTCStatConfig> implements lhx0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ok.android.externcalls.sdk.config.BaseConfigProvider
    public final WebRTCStatConfig parseConfig(String str) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray(str);
            EnumSet noneOf = EnumSet.noneOf(WebRTCStatConfig.LogItemType.class);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                WebRTCStatConfig.LogItemType.a aVar = WebRTCStatConfig.LogItemType.Companion;
                String optString = jSONArray.optString(i);
                aVar.getClass();
                WebRTCStatConfig.LogItemType logItemType = null;
                if (optString != null) {
                    Iterator<E> it = WebRTCStatConfig.LogItemType.h().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        str2 = ((WebRTCStatConfig.LogItemType) next).key;
                        if (epx.f(str2, optString)) {
                            logItemType = next;
                            break;
                        }
                    }
                    logItemType = logItemType;
                }
                if (logItemType != null) {
                    noneOf.add(logItemType);
                }
            }
            return new WebRTCStatConfig(noneOf);
        } catch (Throwable th) {
            getLog().logException("BitrateDumpGatheringConfigProviderImpl", "Can't parse configuration string ".concat(str), th);
            return new WebRTCStatConfig(EmptySet.b);
        }
    }
}
