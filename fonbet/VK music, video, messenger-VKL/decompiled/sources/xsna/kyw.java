package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: InitElectionsEvent.kt */
/* loaded from: classes5.dex */
public final class kyw extends BaseAnalyticsEvent {
    public final nta b;

    /* compiled from: InitElectionsEvent.kt */
    public static final class a {
        public static kyw a(nta ntaVar) {
            return new kyw(ntaVar);
        }
    }

    public kyw(nta ntaVar) {
        super("vkcm_sdk_host_elections_init");
        this.b = ntaVar;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        nta ntaVar = this.b;
        mapBuilder.put("changes_type", ntaVar.a);
        String str = ntaVar.b;
        if (str != null) {
            mapBuilder.put("oldValue", str);
        }
        String str2 = ntaVar.c;
        if (str2 != null) {
            mapBuilder.put("newValue", str2);
        }
        return mapBuilder.h();
    }
}
