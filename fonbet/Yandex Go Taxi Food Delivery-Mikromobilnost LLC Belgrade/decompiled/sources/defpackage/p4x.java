package defpackage;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class p4x extends o4x {
    public final oes p;

    public p4x(l4x l4xVar, View view, Window window) {
        super(l4xVar, view, window);
        oes oesVar = new oes(this.h);
        oesVar.f = 0L;
        oesVar.g = 0L;
        this.p = oesVar;
    }

    @Override // defpackage.o4x
    public final long a0(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(13);
    }

    @Override // defpackage.o4x
    public final nes b0(long j, long j2, FrameMetrics frameMetrics) {
        long j3;
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j4 = j + metric;
        this.m = j4;
        yuf0 yuf0Var = this.g.a;
        if (yuf0Var != null) {
            j3 = j;
            yuf0Var.x(j3, j4, this.h);
        } else {
            j3 = j;
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(8);
        long metric3 = frameMetrics.getMetric(7) + (metric2 - frameMetrics.getMetric(12));
        long metric4 = metric2 - frameMetrics.getMetric(13);
        oes oesVar = this.p;
        oesVar.b = j3;
        oesVar.c = metric;
        oesVar.d = z;
        oesVar.e = metric3;
        oesVar.f = metric2;
        oesVar.g = metric4;
        return oesVar;
    }
}
