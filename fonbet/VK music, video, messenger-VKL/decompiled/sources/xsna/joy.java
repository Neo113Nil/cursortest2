package xsna;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.cri;
import xsna.q630;

/* compiled from: Layout.kt */
/* loaded from: classes11.dex */
public final class joy {

    /* compiled from: Layout.kt */
    public static final class a extends Lambda implements izs<LayoutNode, s3q0> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final s3q0 invoke(LayoutNode layoutNode) {
            layoutNode.F = true;
            return s3q0.a;
        }
    }

    /* compiled from: Layout.kt */
    public static final class b extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ cp10 $measurePolicy;
        final /* synthetic */ q630 $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q630 q630Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, cp10 cp10Var, int i, int i2) {
            super(2);
            this.$modifier = q630Var;
            this.$content = wzsVar;
            this.$measurePolicy = cp10Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            joy.a(this.$modifier, this.$content, this.$measurePolicy, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    @ozl
    public static final void a(q630 q630Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, cp10 cp10Var, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1663319424);
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
        if ((i & 384) == 0) {
            i3 |= M.J(cp10Var) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1663319424, i3, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:241)");
            }
            int hashCode = Integer.hashCode(n34.m(M));
            q630 c = qri.c(M, q630Var);
            sy90 D = M.D();
            LayoutNode.a aVar2 = LayoutNode.T;
            int i5 = ((i3 << 3) & 896) | 6;
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
            cri.h7.getClass();
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            if (M.L()) {
                M.b(s3q0.a, new uog(a.i, 10));
            }
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            wzsVar.invoke(M, Integer.valueOf((i5 >> 6) & 14));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b(q630Var2, wzsVar, cp10Var, i, i2);
        }
    }

    public static final jai b(List list) {
        return new jai(1271844412, new koy(list), true);
    }
}
