package xsna;

import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: VkCellButtonGroupItem.kt */
/* loaded from: classes17.dex */
public abstract class kma {

    /* compiled from: VkCellButtonGroupItem.kt */
    public static final class a extends kma {
        public final wh50 a = androidx.compose.runtime.k.b(null);

        @Override // xsna.kma
        public final void a(int i, androidx.compose.runtime.a aVar) {
            int i2;
            long j;
            androidx.compose.runtime.a M = aVar.M(-2001440595);
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
                    androidx.compose.runtime.b.f(-2001440595, i2, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Right.Dropdown.Content (VkCellButtonGroupItem.kt:210)");
                }
                q630 q = txj0.q(aVar2, 16);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1793527244, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DropdownOutline16> (VkSdkIcons.kt:762)");
                }
                lg90 b = or.b(M, 1577142419, R.drawable.vk_icon_dropdown_outline_16, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                l5g l5gVar = (l5g) ((zak0) this.a).getValue();
                if (l5gVar == null) {
                    M.K(760945085);
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
                    M.K(760944217);
                    M.j();
                    j = l5gVar.a;
                }
                vqv.a(b, null, q, j, M, 56, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new jma(this, i);
            }
        }
    }

    public abstract void a(int i, androidx.compose.runtime.a aVar);
}
