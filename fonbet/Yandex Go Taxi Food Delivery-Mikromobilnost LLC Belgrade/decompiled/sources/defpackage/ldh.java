package defpackage;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.o;

/* loaded from: classes10.dex */
public final class ldh implements x910 {
    public final x910 a;
    public final IntrinsicMinMax b;
    public final IntrinsicWidthHeight c;

    public ldh(x910 x910Var, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.a = x910Var;
        this.b = intrinsicMinMax;
        this.c = intrinsicWidthHeight;
    }

    @Override // defpackage.x910
    public final int V(int i) {
        return this.a.V(i);
    }

    @Override // defpackage.x910
    public final Object a() {
        return this.a.a();
    }

    @Override // defpackage.x910
    public final int e0(int i) {
        return this.a.e0(i);
    }

    @Override // defpackage.x910
    public final int k0(int i) {
        return this.a.k0(i);
    }

    @Override // defpackage.x910
    public final o l0(long j) {
        IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.Width;
        x910 x910Var = this.a;
        IntrinsicWidthHeight intrinsicWidthHeight2 = this.c;
        IntrinsicMinMax intrinsicMinMax = this.b;
        if (intrinsicWidthHeight2 == intrinsicWidthHeight) {
            return new ter(intrinsicMinMax == IntrinsicMinMax.Max ? x910Var.k0(n8e.h(j)) : x910Var.e0(n8e.h(j)), n8e.d(j) ? n8e.h(j) : 32767, 0);
        }
        return new ter(n8e.e(j) ? n8e.i(j) : 32767, intrinsicMinMax == IntrinsicMinMax.Max ? x910Var.y(n8e.i(j)) : x910Var.V(n8e.i(j)), 0);
    }

    @Override // defpackage.x910
    public final int y(int i) {
        return this.a.y(i);
    }
}
