package xsna;

/* compiled from: VkCellButtonGroupItem.kt */
/* loaded from: classes17.dex */
public abstract class ima {

    /* compiled from: VkCellButtonGroupItem.kt */
    public static final class a extends ima {
        public final wh50 a = androidx.compose.runtime.k.b("Button");

        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(-338074534);
            if ((i & 6) == 0) {
                i2 = i | (M.J(q630Var) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-338074534, i2, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Middle.Text.Content (VkCellButtonGroupItem.kt:144)");
                }
                String str = (String) ((zak0) this.a).getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.h0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.c(str, q630Var, ylu0Var.getText().c, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar2, ((i2 << 3) & 112) | 100663296, 48, 5880);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new ct3(this, q630Var, i, 1);
            }
        }
    }
}
