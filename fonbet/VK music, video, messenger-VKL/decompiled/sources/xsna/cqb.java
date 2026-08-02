package xsna;

import com.vk.toggle.features.ImFeatures;
import xsna.iqb;
import xsna.spb;

/* compiled from: ChatControlsAdapter.kt */
/* loaded from: classes2.dex */
public final class cqb extends qul {
    public final boolean h;

    public cqb(iqb.a aVar) {
        super(true);
        ImFeatures imFeatures = ImFeatures.IM_CHAT_SETTINGS_REDESIGN;
        imFeatures.getClass();
        this.h = com.vk.toggle.b.A.a(imFeatures);
        setHasStableIds(true);
        x0(spb.a.class, new hl1(6, this, aVar));
        x0(spb.b.class, new com.vk.im.ui.fragments.b(aVar, 22));
    }
}
