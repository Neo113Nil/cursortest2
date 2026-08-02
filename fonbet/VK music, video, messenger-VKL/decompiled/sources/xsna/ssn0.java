package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.TabMode;
import xsna.q630;

/* compiled from: VkTabItem.kt */
/* loaded from: classes17.dex */
public abstract class ssn0 {
    public final wh50<Float> a = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));

    /* compiled from: VkTabItem.kt */
    public static final class a extends ssn0 {
        public final wh50 b;

        public a(lg90 lg90Var) {
            this.b = androidx.compose.runtime.k.b(lg90Var);
        }

        @Override // xsna.ssn0
        public final void a(TabMode tabMode, androidx.compose.runtime.a aVar, int i) {
            int i2;
            a aVar2;
            l5g l5gVar;
            if2 if2Var;
            androidx.compose.runtime.a M = aVar.M(40133240);
            int i3 = i & 6;
            q630.a aVar3 = q630.a.a;
            if (i3 == 0) {
                i2 = (M.J(aVar3) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.o(tabMode.ordinal()) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(40133240, i2, -1, "com.vk.core.compose.component.tabs.TabItem.Right.Icon.Content (VkTabItem.kt:205)");
                }
                int i4 = (i2 >> 3) & 14;
                boolean z = false;
                long a = npv0.a(tabMode, M, i4);
                long l = npv0.l(tabMode, M, i4);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = lwj0.a(l);
                    M.R(x);
                }
                if2 if2Var2 = (if2) x;
                Object value = ((zak0) this.a).getValue();
                l5g l5gVar2 = new l5g(a);
                l5g l5gVar3 = new l5g(l);
                boolean y = M.y(if2Var2) | M.p(l) | M.p(a);
                if ((i2 & 896) == 256) {
                    z = true;
                }
                boolean z2 = y | z;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    l5gVar = l5gVar3;
                    rsn0 rsn0Var = new rsn0(if2Var2, l, a, this, null);
                    if2Var = if2Var2;
                    aVar2 = this;
                    M.R(rsn0Var);
                    x2 = rsn0Var;
                } else {
                    if2Var = if2Var2;
                    l5gVar = l5gVar3;
                    aVar2 = this;
                }
                bap.e(value, l5gVar2, l5gVar, (wzs) x2, M, 0);
                vqv.a((lg90) ((zak0) aVar2.b).getValue(), null, txj0.m(aVar3, 24), ((l5g) if2Var.d()).a, M, 56, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = this;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new nv1(aVar2, tabMode, i);
            }
        }
    }

    public abstract void a(TabMode tabMode, androidx.compose.runtime.a aVar, int i);
}
