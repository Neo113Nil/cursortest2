package xsna;

import com.vk.toggle.features.CoreFeatures;

/* compiled from: AppNetworkPrefs.kt */
/* loaded from: classes11.dex */
public final class s73 {
    public final boolean a() {
        o2l.a.getClass();
        return o2l.b("__dbg_api", false);
    }

    public final boolean b() {
        o2l.a.getClass();
        return o2l.b("__dbg_network_netlog_write", false);
    }

    public final String c() {
        o2l.a.getClass();
        CoreFeatures coreFeatures = CoreFeatures.SWITCH_VK_RU_DOMAIN;
        coreFeatures.getClass();
        return o2l.c("apiRemoteHost", com.vk.toggle.b.A.a(coreFeatures) ? "vk.ru" : "vk.com");
    }

    public final void d(boolean z) {
        o2l.a.getClass();
        o2l.h("__dbg_network_netlog_write", z);
    }

    public final void e(String str) {
        o2l.a.getClass();
        o2l.j("apiRemoteHost", str);
    }
}
