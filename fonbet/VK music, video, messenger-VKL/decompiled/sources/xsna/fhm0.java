package xsna;

import xsna.dhk0;

/* compiled from: StoryStatisticsStickersMviView.kt */
/* loaded from: classes6.dex */
public final class fhm0 implements dhk0.b {
    public final /* synthetic */ com.vk.stories.design.view.stats.tabs.stickers.mvi.c a;

    public fhm0(com.vk.stories.design.view.stats.tabs.stickers.mvi.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.dhk0.b
    public final boolean a(int i) {
        dhm0 dhm0Var = this.a.g;
        if (i >= 0) {
            return i < dhm0Var.h.f.size() && dhm0Var.getItemViewType(i) != 2;
        }
        dhm0Var.getClass();
        return false;
    }
}
