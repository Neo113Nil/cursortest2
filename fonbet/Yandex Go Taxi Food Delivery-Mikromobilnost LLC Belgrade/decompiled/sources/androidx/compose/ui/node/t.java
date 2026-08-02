package androidx.compose.ui.node;

import defpackage.n8e;
import defpackage.ter;
import defpackage.x910;

/* loaded from: classes10.dex */
public final class t implements x910 {
    public final x910 a;
    public final NodeMeasuringIntrinsics$IntrinsicMinMax b;
    public final NodeMeasuringIntrinsics$IntrinsicWidthHeight c;

    public t(x910 x910Var, NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax, NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
        this.a = x910Var;
        this.b = nodeMeasuringIntrinsics$IntrinsicMinMax;
        this.c = nodeMeasuringIntrinsics$IntrinsicWidthHeight;
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
    public final androidx.compose.ui.layout.o l0(long j) {
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight = NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width;
        x910 x910Var = this.a;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight2 = this.c;
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax = this.b;
        if (nodeMeasuringIntrinsics$IntrinsicWidthHeight2 == nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
            return new ter(nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? x910Var.k0(n8e.h(j)) : x910Var.e0(n8e.h(j)), n8e.d(j) ? n8e.h(j) : 32767, 2);
        }
        return new ter(n8e.e(j) ? n8e.i(j) : 32767, nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.Max ? x910Var.y(n8e.i(j)) : x910Var.V(n8e.i(j)), 2);
    }

    @Override // defpackage.x910
    public final int y(int i) {
        return this.a.y(i);
    }
}
