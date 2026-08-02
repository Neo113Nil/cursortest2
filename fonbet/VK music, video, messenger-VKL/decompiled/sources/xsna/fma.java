package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;

/* compiled from: VkCellButtonGroupItem.kt */
/* loaded from: classes17.dex */
public abstract class fma {

    /* compiled from: VkCellButtonGroupItem.kt */
    public static final class a extends fma {
        public final wh50 a = androidx.compose.runtime.k.b(1);
        public final wh50 b;
        public final wh50 c;

        /* compiled from: VkCellButtonGroupItem.kt */
        /* renamed from: xsna.fma$a$a, reason: collision with other inner class name */
        public static final class C2884a {
            public static a a(CounterMode counterMode, CounterAppearance.Design design, androidx.compose.runtime.a aVar) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1740684181, 3510, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Indicator.Counter.Companion.invoke (VkCellButtonGroupItem.kt:292)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new a(counterMode, design);
                    aVar.R(x);
                }
                a aVar2 = (a) x;
                ((zak0) aVar2.a).setValue(1);
                ((zak0) aVar2.b).setValue(counterMode);
                ((zak0) aVar2.c).setValue(design);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return aVar2;
            }
        }

        public a(CounterMode counterMode, CounterAppearance.Design design) {
            this.b = androidx.compose.runtime.k.b(counterMode);
            this.c = androidx.compose.runtime.k.b(design);
        }

        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            q630 q630Var2;
            androidx.compose.runtime.a M = aVar.M(-1316463467);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1316463467, i2, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Indicator.Counter.Content (VkCellButtonGroupItem.kt:276)");
                }
                q630Var2 = q630Var;
                nou0.a(((Number) ((zak0) this.a).getValue()).intValue(), CounterSize.Small, (CounterAppearance) ((zak0) this.c).getValue(), q630Var2, (CounterMode) ((zak0) this.b).getValue(), false, M, ((i2 << 9) & 7168) | 48, 32);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                q630Var2 = q630Var;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new ema(this, q630Var2, i, 0);
            }
        }
    }
}
