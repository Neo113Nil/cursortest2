package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.TabMode;
import xsna.npv0;
import xsna.q630;

/* compiled from: VkTabItem.kt */
/* loaded from: classes17.dex */
public abstract class psn0 {
    public final wh50<Float> a = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));

    /* compiled from: VkTabItem.kt */
    public static final class a extends psn0 {
        public final wh50 b;

        /* compiled from: VkTabItem.kt */
        /* renamed from: xsna.psn0$a$a, reason: collision with other inner class name */
        public static final class C3529a {
            public static a a(String str, androidx.compose.runtime.a aVar) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1591975853, 54, -1, "com.vk.core.compose.component.tabs.TabItem.Middle.Text.Companion.invoke (VkTabItem.kt:181)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new a(str);
                    aVar.R(x);
                }
                a aVar2 = (a) x;
                ((zak0) aVar2.b).setValue(str);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return aVar2;
            }
        }

        public a(String str) {
            this.b = androidx.compose.runtime.k.b(str);
        }

        @Override // xsna.psn0
        public final void a(TabMode tabMode, androidx.compose.runtime.a aVar, int i) {
            int i2;
            a aVar2;
            androidx.compose.runtime.a aVar3;
            long j;
            long j2;
            Object qsn0Var;
            l5g l5gVar;
            if2 if2Var;
            androidx.compose.runtime.a M = aVar.M(1000349995);
            int i3 = i & 6;
            q630.a aVar4 = q630.a.a;
            if (i3 == 0) {
                i2 = (M.J(aVar4) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.o(tabMode.ordinal()) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            int i4 = i2;
            if (M.t(i4 & 1, (i4 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1000349995, i4, -1, "com.vk.core.compose.component.tabs.TabItem.Middle.Text.Content (VkTabItem.kt:149)");
                }
                bpn0 bpn0Var = npv0.a;
                int i5 = (i4 >> 3) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(381327196, i5, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.selectedTextColor (VkTabsDefault.kt:149)");
                }
                M.K(-69849207);
                int[] iArr = npv0.a.$EnumSwitchMapping$0;
                int i6 = iArr[tabMode.ordinal()];
                if (i6 == 1) {
                    j = gub0.a(M, 1383222087, M).m;
                    M.j();
                } else if (i6 == 2) {
                    j = gub0.a(M, 1383224167, M).m;
                    M.j();
                } else {
                    if (i6 != 3) {
                        throw alb0.c(1383220121, M);
                    }
                    j = gub0.a(M, 1383226156, M).c;
                    M.j();
                }
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(371902453, i5, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.unselectedTextColor (VkTabsDefault.kt:140)");
                }
                M.K(-1669485713);
                int i7 = iArr[tabMode.ordinal()];
                if (i7 == 1) {
                    j2 = gub0.a(M, 915978914, M).p;
                    M.j();
                } else if (i7 == 2) {
                    j2 = gub0.a(M, 915981058, M).p;
                    M.j();
                } else {
                    if (i7 != 3) {
                        throw alb0.c(915976947, M);
                    }
                    j2 = gub0.a(M, 915983106, M).p;
                    M.j();
                }
                long j3 = j2;
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = lwj0.a(j3);
                    M.R(x);
                }
                if2 if2Var2 = (if2) x;
                Object value = ((zak0) this.a).getValue();
                l5g l5gVar2 = new l5g(j);
                l5g l5gVar3 = new l5g(j3);
                boolean y = M.y(if2Var2) | M.p(j3) | M.p(j) | ((i4 & 896) == 256);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    long j4 = j;
                    l5gVar = l5gVar2;
                    qsn0Var = new qsn0(if2Var2, j3, j4, this, null);
                    if2Var = if2Var2;
                    aVar2 = this;
                    M.R(qsn0Var);
                } else {
                    if2Var = if2Var2;
                    l5gVar = l5gVar2;
                    qsn0Var = x2;
                    aVar2 = this;
                }
                aVar3 = M;
                bap.e(value, l5gVar, l5gVar3, (wzs) qsn0Var, aVar3, 0);
                aVar3.K(-736302822);
                frv0 frv0Var = wlb0.l(aVar3).P;
                aVar3.j();
                yqv0.c((String) ((zak0) aVar2.b).getValue(), aVar4, ((l5g) if2Var.d()).a, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar3, ((i4 << 3) & 112) | 100663296, 48, 5880);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = this;
                aVar3 = M;
                aVar3.h();
            }
            androidx.compose.runtime.f s = aVar3.s();
            if (s != null) {
                s.d = new jh4(aVar2, tabMode, i);
            }
        }
    }

    public abstract void a(TabMode tabMode, androidx.compose.runtime.a aVar, int i);
}
