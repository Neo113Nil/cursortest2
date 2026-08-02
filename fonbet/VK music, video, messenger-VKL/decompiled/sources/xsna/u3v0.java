package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.metrics.eventtracking.Event;

/* compiled from: VkMePromoReporterImpl.kt */
/* loaded from: classes5.dex */
public final class u3v0 implements t3v0 {
    public static final u3v0 a = new u3v0();

    @Override // xsna.t3v0
    public final void a(String str, boolean z, boolean z2) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("vkm_install_vkme");
        aVar.c("entry_point", str);
        aVar.c("button_type", z ? "open" : "install");
        aVar.c("action", z2 ? "click" : CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        com.vk.movika.sdk.base.model.n.c(aVar, thp0.c, bVar);
    }
}
