package androidx.compose.ui.layout;

import defpackage.n8e;
import defpackage.ter;
import defpackage.x910;

/* loaded from: classes10.dex */
public final class l implements x910 {
    public final x910 a;
    public final MeasuringIntrinsics$IntrinsicMinMax b;
    public final MeasuringIntrinsics$IntrinsicWidthHeight c;

    public l(x910 x910Var, MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax, MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight) {
        this.a = x910Var;
        this.b = measuringIntrinsics$IntrinsicMinMax;
        this.c = measuringIntrinsics$IntrinsicWidthHeight;
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
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight = MeasuringIntrinsics$IntrinsicWidthHeight.Width;
        x910 x910Var = this.a;
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight2 = this.c;
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = this.b;
        if (measuringIntrinsics$IntrinsicWidthHeight2 == measuringIntrinsics$IntrinsicWidthHeight) {
            return new ter(measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? x910Var.k0(n8e.h(j)) : x910Var.e0(n8e.h(j)), n8e.d(j) ? n8e.h(j) : 32767, 1);
        }
        return new ter(n8e.e(j) ? n8e.i(j) : 32767, measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? x910Var.y(n8e.i(j)) : x910Var.V(n8e.i(j)), 1);
    }

    @Override // defpackage.x910
    public final int y(int i) {
        return this.a.y(i);
    }
}
