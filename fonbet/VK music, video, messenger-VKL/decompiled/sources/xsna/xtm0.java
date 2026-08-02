package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;
import xsna.ci50;
import xsna.cri;
import xsna.q630;
import xsna.woy;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes11.dex */
public final class xtm0 {
    public static final a a = new a();
    public static final Object b = new Object();

    /* compiled from: SubcomposeLayout.kt */
    public static final class a {
        public final String toString() {
            return "ReusedSlotId";
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    public static final class b extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wzs<ztm0, o6j, dp10> $measurePolicy;
        final /* synthetic */ q630 $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q630 q630Var, wzs<? super ztm0, ? super o6j, ? extends dp10> wzsVar, int i, int i2) {
            super(2);
            this.$modifier = q630Var;
            this.$measurePolicy = wzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            xtm0.a(this.$modifier, this.$measurePolicy, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    public static final class c extends Lambda implements gzs<s3q0> {
        final /* synthetic */ ytm0 $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ytm0 ytm0Var) {
            super(0);
            this.$state = ytm0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            woy a = this.$state.a();
            LayoutNode layoutNode = a.b;
            if (a.o != ((ci50.a) layoutNode.C()).b.d) {
                ph50<LayoutNode, woy.b> ph50Var = a.g;
                Object[] objArr = ph50Var.c;
                long[] jArr = ph50Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((woy.b) objArr[(i << 3) + i3]).d = true;
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                if (layoutNode.i != null) {
                    if (!layoutNode.H.e) {
                        LayoutNode.d0(layoutNode, false, 7);
                    }
                } else if (!layoutNode.E()) {
                    LayoutNode.f0(layoutNode, false, 7);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    public static final class d extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wzs<ztm0, o6j, dp10> $measurePolicy;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ ytm0 $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(ytm0 ytm0Var, q630 q630Var, wzs<? super ztm0, ? super o6j, ? extends dp10> wzsVar, int i, int i2) {
            super(2);
            this.$state = ytm0Var;
            this.$modifier = q630Var;
            this.$measurePolicy = wzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            xtm0.b(this.$state, this.$modifier, this.$measurePolicy, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    public static final void a(q630 q630Var, wzs<? super ztm0, ? super o6j, ? extends dp10> wzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        wzs<? super ztm0, ? super o6j, ? extends dp10> wzsVar2;
        androidx.compose.runtime.a M = aVar.M(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(wzsVar) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            q630 q630Var2 = q630Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1298353104, i3, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:95)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new ytm0();
                M.R(x);
            }
            wzsVar2 = wzsVar;
            b((ytm0) x, q630Var2, wzsVar2, M, (i3 << 3) & 1008, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630Var2;
        } else {
            wzsVar2 = wzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b(q630Var, wzsVar2, i, i2);
        }
    }

    public static final void b(ytm0 ytm0Var, q630 q630Var, wzs<? super ztm0, ? super o6j, ? extends dp10> wzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-511989831);
        if ((i & 6) == 0) {
            i3 = (M.y(ytm0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(wzsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-511989831, i3, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:128)");
            }
            int hashCode = Long.hashCode(n34.n(M));
            cvi z = n34.z(M);
            q630 c2 = qri.c(M, q630Var);
            sy90 D = M.D();
            LayoutNode.a aVar2 = LayoutNode.T;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, ytm0Var, ytm0Var.c);
            k9q0.w(M, z, ytm0Var.d);
            k9q0.w(M, wzsVar, ytm0Var.e);
            cri.h7.getClass();
            k9q0.w(M, D, cri.a.e);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            M.G();
            if (M.e()) {
                M.K(-1259187287);
                M.j();
            } else {
                M.K(-1259245908);
                boolean y = M.y(ytm0Var);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new c(ytm0Var);
                    M.R(x);
                }
                bap.i((gzs) x, M, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d(ytm0Var, q630Var2, wzsVar, i, i2);
        }
    }
}
