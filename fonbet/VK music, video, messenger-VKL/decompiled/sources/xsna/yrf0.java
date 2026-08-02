package xsna;

import com.vk.core.view.components.button.VkButton;
import kotlin.Pair;
import xsna.c5v0;

/* compiled from: RelatedAudioDetailsModalCard.kt */
/* loaded from: classes6.dex */
public final class yrf0 implements bsf0 {
    public static final int b = iah0.a(96);
    public dw20 a;

    public final c5v0.a.C2643a a(int i, gzs gzsVar, boolean z, boolean z2) {
        Pair pair = z ? new Pair(VkButton.Mode.Primary, VkButton.Appearance.Accent) : new Pair(VkButton.Mode.Secondary, VkButton.Appearance.Neutral);
        return new c5v0.a.C2643a(tq.h(tlo0.Companion, i), new rs0(18, gzsVar, this), VkButton.Size.Large, (VkButton.Mode) pair.d(), (VkButton.Appearance) pair.g(), z2, 28);
    }

    @Override // xsna.bsf0
    public final void close() {
        dw20 dw20Var = this.a;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }
}
