package xsna;

import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.im.sync.api.di.ImSynchronizationComponent;
import com.vkontakte.android.data.b;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;

/* compiled from: VkPushBridge.kt */
/* loaded from: classes.dex */
public final class sev0 extends gll implements w8i {
    public static final sev0 d = new sev0();

    @Override // xsna.rmr0
    public final boolean e() {
        return ((ImSynchronizationComponent) ((k7m) m7m.f(this)).a(fpf0.a(ImSynchronizationComponent.class))).Ea().d();
    }

    @Override // xsna.rmr0
    public final void f(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        b.d dVar = new b.d("push_stat");
        dVar.b(str, "action");
        dVar.b(str2, "type");
        dVar.b(str5, "to_id");
        dVar.b(str3, AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT);
        xuo0.a.getClass();
        dVar.b(Long.valueOf(xuo0.a()), "ts");
        dVar.b(com.vk.core.utils.newtork.b.c().c(), StatCustomFieldKey.NETWORK_TYPE);
        dVar.b("v2", "stat_version");
        dVar.b(o25.a().c(), "active_user_id");
        dVar.b(Integer.valueOf(i), "push_priority");
        if (str4 != null) {
            dVar.b(str4, "error");
        }
        if (str6 != null && str6.length() != 0) {
            dVar.b(str6, "subtype");
        }
        dVar.i();
        dVar.h();
    }
}
