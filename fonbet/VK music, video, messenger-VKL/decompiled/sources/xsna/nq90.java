package xsna;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class nq90 extends phy<PointF> {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public mq90 m;

    public nq90(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.tf6
    public final Object g(nhy nhyVar, float f) {
        float f2;
        mq90 mq90Var = (mq90) nhyVar;
        Path path = mq90Var.q;
        a900<A> a900Var = this.e;
        if (a900Var == 0 || nhyVar.h == null) {
            f2 = f;
        } else {
            f2 = f;
            PointF pointF = (PointF) a900Var.b(mq90Var.g, mq90Var.h.floatValue(), (PointF) mq90Var.b, (PointF) mq90Var.c, e(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) nhyVar.b;
        }
        mq90 mq90Var2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (mq90Var2 != mq90Var) {
            pathMeasure.setPath(path, false);
            this.m = mq90Var;
        }
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        float f4 = fArr[0];
        float f5 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f4, f5);
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 > length) {
            float f6 = f3 - length;
            pointF2.offset(fArr2[0] * f6, fArr2[1] * f6);
        }
        return pointF2;
    }
}
