package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.xcc;

/* compiled from: MiniInfoCell.kt */
/* loaded from: classes17.dex */
public final class br20 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    /* compiled from: MiniInfoCell.kt */
    public static final class a {
        public static br20 a(UserStackSize userStackSize, izs izsVar, androidx.compose.runtime.a aVar, int i, int i2) {
            if ((i2 & 1) != 0) {
                userStackSize = UserStackSize.Medium;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-524039796, 6, -1, "com.vk.core.compose.component.defaults.VkMiniInfoCellDefaults.userStackAlign (VkMiniInfoCellDefaults.kt:18)");
            }
            xcc.a.g c = byv0.c();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(985696021, i, -1, "com.vk.core.compose.component.cell.miniinfo.MiniInfoCell.UserStack.Companion.invoke (MiniInfoCell.kt:221)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new br20(userStackSize, c, izsVar);
                aVar.R(x);
            }
            br20 br20Var = (br20) x;
            ((zak0) br20Var.a).setValue(userStackSize);
            ((zak0) br20Var.b).setValue(c);
            ((zak0) br20Var.c).setValue(null);
            ((zak0) br20Var.d).setValue(izsVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return br20Var;
        }
    }

    public br20() {
        throw null;
    }

    public br20(UserStackSize userStackSize, xcc.a.g gVar, izs izsVar) {
        this.a = androidx.compose.runtime.k.b(userStackSize);
        this.b = androidx.compose.runtime.k.b(gVar);
        this.c = androidx.compose.runtime.k.b(null);
        this.d = androidx.compose.runtime.k.b(izsVar);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1065760164);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.J(this) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1065760164, i3, -1, "com.vk.core.compose.component.cell.miniinfo.MiniInfoCell.UserStack.Content (MiniInfoCell.kt:204)");
            }
            hyv0.c(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.c).getValue()), (UserStackSize) ((zak0) this.a).getValue(), (xcc.a.AbstractC3993a) ((zak0) this.b).getValue(), (izs) ((zak0) this.d).getValue(), M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n5c(this, q630Var, i, 3);
        }
    }
}
