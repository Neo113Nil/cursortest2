package xsna;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PathKeyframe.java */
/* loaded from: classes12.dex */
public final class mq90 extends nhy<PointF> {

    @Nullable
    public Path q;
    public final nhy<PointF> r;

    public mq90(i700 i700Var, nhy<PointF> nhyVar) {
        super(i700Var, nhyVar.b, nhyVar.c, nhyVar.d, nhyVar.e, nhyVar.f, nhyVar.g, nhyVar.h);
        this.r = nhyVar;
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        T t;
        T t2 = this.c;
        T t3 = this.b;
        boolean z = (t2 == 0 || t3 == 0 || !((PointF) t3).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        if (t3 == 0 || (t = this.c) == 0 || z) {
            return;
        }
        PointF pointF = (PointF) t3;
        PointF pointF2 = (PointF) t;
        nhy<PointF> nhyVar = this.r;
        PointF pointF3 = nhyVar.o;
        PointF pointF4 = nhyVar.p;
        Matrix matrix = b3r0.a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && pointF4.length() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.q = path;
    }
}
