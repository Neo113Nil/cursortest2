package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import com.vk.push.pushsdk.domain.model.ReceivedBy;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: PushReceivedAnalyticsEvent.kt */
/* loaded from: classes5.dex */
public final class gke0 extends BaseAnalyticsEvent {
    public final String b;
    public final ReceivedBy c;
    public final String d;
    public final String e;

    public gke0(String str, ReceivedBy receivedBy, String str2, String str3) {
        super("vkcm_sdk_master_receive_push");
        this.b = str;
        this.c = receivedBy;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.setClientPackageName(mapBuilder, this.e);
        Logger logger = v6g0.a;
        ExtensionsKt.setMasterPackageName(mapBuilder, v6g0.e().getPackageName());
        String str = this.b;
        ExtensionsKt.setPushToken(mapBuilder, str);
        ExtensionsKt.setPushId(mapBuilder, str, this.d);
        ExtensionsKt.setReceivedBy(mapBuilder, this.c.name().toLowerCase(Locale.ROOT));
        return mapBuilder.h();
    }
}
