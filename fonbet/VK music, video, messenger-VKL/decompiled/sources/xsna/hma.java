package xsna;

import xsna.q630;

/* compiled from: VkCellButtonGroupItem.kt */
/* loaded from: classes17.dex */
public abstract class hma {

    /* compiled from: VkCellButtonGroupItem.kt */
    public static final class a extends hma {
        public final wh50 a;
        public final wh50 b = androidx.compose.runtime.k.b(null);

        public a(lg90 lg90Var) {
            this.a = androidx.compose.runtime.k.b(lg90Var);
        }

        @Override // xsna.hma
        public final void a(int i, androidx.compose.runtime.a aVar) {
            int i2;
            long j;
            androidx.compose.runtime.a M = aVar.M(-654434816);
            int i3 = i & 6;
            q630.a aVar2 = q630.a.a;
            if (i3 == 0) {
                i2 = (M.J(aVar2) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-654434816, i2, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Left.Icon.Content (VkCellButtonGroupItem.kt:108)");
                }
                q630 q = txj0.q(aVar2, 20);
                lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
                l5g l5gVar = (l5g) ((zak0) this.b).getValue();
                if (l5gVar == null) {
                    M.K(-1846625456);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getIcon().b;
                    M.j();
                } else {
                    M.K(-1846626324);
                    M.j();
                    j = l5gVar.a;
                }
                vqv.a(lg90Var, null, q, j, M, 56, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new gma(this, i);
            }
        }
    }

    public abstract void a(int i, androidx.compose.runtime.a aVar);
}
