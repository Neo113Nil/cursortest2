package xsna;

import com.vk.metrics.eventtracking.Event;

/* compiled from: VkAppOpenReporterImpl.kt */
/* loaded from: classes5.dex */
public final class mau0 implements lau0 {
    public static final mau0 a = new mau0();

    @Override // xsna.lau0
    public final void a() {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("vkapp_open");
        aVar.c("entry_point", "group_profile");
        aVar.a(Boolean.valueOf(dy2.i("com.vkontakte.android")), "vk_app_installed");
        com.vk.movika.sdk.base.model.n.c(aVar, thp0.c, bVar);
    }
}
