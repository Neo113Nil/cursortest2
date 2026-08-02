package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: MiniInfoCell.kt */
/* loaded from: classes17.dex */
public final class zq20 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);

    /* compiled from: MiniInfoCell.kt */
    public static final class a {
        public static zq20 a(lg90 lg90Var, l5g l5gVar, String str, androidx.compose.runtime.a aVar, int i, int i2) {
            if ((i2 & 2) != 0) {
                l5gVar = null;
            }
            if ((i2 & 4) != 0) {
                str = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1579513725, i, -1, "com.vk.core.compose.component.cell.miniinfo.MiniInfoCell.Icon.Companion.invoke (MiniInfoCell.kt:174)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new zq20(lg90Var, l5gVar, str);
                aVar.R(x);
            }
            zq20 zq20Var = (zq20) x;
            ((zak0) zq20Var.a).setValue(lg90Var);
            ((zak0) zq20Var.b).setValue(l5gVar);
            ((zak0) zq20Var.c).setValue(str);
            ((zak0) zq20Var.d).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return zq20Var;
        }
    }

    public zq20(lg90 lg90Var, l5g l5gVar, String str) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(l5gVar);
        this.c = androidx.compose.runtime.k.b(str);
    }

    public final void a(MiniInfoCell$Mode miniInfoCell$Mode, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-971987643);
        if ((i & 6) == 0) {
            i2 = (M.o(miniInfoCell$Mode.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-971987643, i2, -1, "com.vk.core.compose.component.cell.miniinfo.MiniInfoCell.Icon.Content (MiniInfoCell.kt:157)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue());
            lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
            l5g l5gVar = (l5g) ((zak0) this.b).getValue();
            if (l5gVar == null) {
                M.K(-2072212109);
                int i3 = (i2 & 14) | 48;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-763350108, i3, -1, "com.vk.core.compose.component.defaults.VkMiniInfoCellDefaults.iconTint (VkMiniInfoCellDefaults.kt:46)");
                }
                M.K(888932418);
                int i4 = z3v0.$EnumSwitchMapping$0[miniInfoCell$Mode.ordinal()];
                if (i4 == 1) {
                    j = vcl0.a(M, 859961201, M).l;
                    M.j();
                } else if (i4 == 2) {
                    j = vcl0.a(M, 859963249, M).l;
                    M.j();
                } else if (i4 == 3) {
                    j = vcl0.a(M, 859965105, M).l;
                    M.j();
                } else if (i4 == 4) {
                    j = vcl0.a(M, 859967054, M).a;
                    M.j();
                } else {
                    if (i4 != 5) {
                        throw alb0.c(859959656, M);
                    }
                    j = vcl0.a(M, 859968942, M).a;
                    M.j();
                }
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-2072213194);
                M.j();
                j = l5gVar.a;
            }
            vqv.a(lg90Var, (String) ((zak0) this.c).getValue(), b, j, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q37(i, 1, this, miniInfoCell$Mode, q630Var);
        }
    }
}
