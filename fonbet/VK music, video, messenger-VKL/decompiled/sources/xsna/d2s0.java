package xsna;

import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.toggle.features.ImFeatures;

/* compiled from: VideoAttachAdapter.kt */
/* loaded from: classes2.dex */
public final class d2s0 extends qul {
    public final p1u0<SimpleAttachListItem> h;

    public d2s0(kkm kkmVar) {
        super(false);
        ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_ATTACHES;
        imFeatures.getClass();
        p1u0<SimpleAttachListItem> h2s0Var = com.vk.toggle.b.A.a(imFeatures) ? new h2s0() : new g2s0();
        this.h = h2s0Var;
        y0(h2s0Var);
        y0(new tsz(kkmVar));
    }
}
