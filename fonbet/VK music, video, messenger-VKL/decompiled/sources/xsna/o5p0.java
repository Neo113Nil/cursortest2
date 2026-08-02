package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;

/* compiled from: ProductsPickerEntryPointCell.kt */
/* loaded from: classes4.dex */
public final class o5p0 implements Cell$Left.Main {
    public final String a;
    public final vgc0 b;
    public final gzs<s3q0> c;

    public o5p0(String str, vgc0 vgc0Var, gzs<s3q0> gzsVar) {
        this.a = str;
        this.b = vgc0Var;
        this.c = gzsVar;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Left
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1333097057);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(1333097057, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.TooltipIconWrapper.Content (ProductsPickerEntryPointCell.kt:162)");
            }
            if (this.a == null) {
                M.K(-1268064272);
                int i3 = i2 & 14;
                int i4 = i2 << 3;
                b(spg0Var, this.b, q630Var, M, (i4 & 7168) | i3 | (i4 & 896));
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new qhg(this, spg0Var, q630Var, i, 1);
                    return;
                }
                return;
            }
            M.K(-1274067391);
            M.j();
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new exi0(this, 12);
                M.R(x);
            }
            buv0 z2 = rdi.z(true, (izs) x, null, M, 6, 4);
            jai c = kai.c(-1732497932, new qq0(this, spg0Var, q630Var, 10), M);
            String str = this.a;
            gzs<s3q0> gzsVar = this.c;
            o9v0.a(str, z2, null, null, null, null, null, null, gzsVar, gzsVar, null, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, true, c, M, 0, 905969664, 261372);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new iu6(i, 5, this, spg0Var, q630Var);
        }
    }

    public final void b(spg0 spg0Var, vgc0 vgc0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2092296987);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(vgc0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2092296987, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.TooltipIconWrapper.Icon (ProductsPickerEntryPointCell.kt:188)");
            }
            vgc0Var.a(spg0Var, q630Var, M, (i2 & 14) | ((i2 >> 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sq0(this, spg0Var, vgc0Var, q630Var, i, 2);
        }
    }
}
