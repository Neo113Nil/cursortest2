package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.cell.content.Cell$Middle;

/* compiled from: MusicPickerItems.kt */
/* loaded from: classes4.dex */
public final class gbx0 implements Cell$Middle.d.a {
    public final wh50 a;
    public final wh50 b;

    public gbx0(lg90 lg90Var) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        float f = 12;
        this.b = androidx.compose.runtime.k.b(new uco(byc0.b(f, f)));
    }

    @Override // com.vk.core.compose.component.cell.content.Cell.Middle.d.a
    public final void c(spg0 spg0Var, q630 q630Var, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2114885471);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION) != 1040)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2114885471, i2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.WarningAlong.Content (MusicPickerItems.kt:884)");
            }
            q630 r = txj0.r(((uco) ((zak0) this.b).getValue()).a, q630Var);
            lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(lg90Var, null, r, ylu0Var.getIcon().l, M, 56, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cbt(this, spg0Var, q630Var, size, i, 1);
        }
    }
}
