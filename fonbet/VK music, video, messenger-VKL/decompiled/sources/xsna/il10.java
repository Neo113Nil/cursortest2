package xsna;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import androidx.annotation.NonNull;

/* compiled from: MaterialArcMotion.java */
/* loaded from: classes13.dex */
public final class il10 extends PathMotion {
    @Override // android.transition.PathMotion
    @NonNull
    public final Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF pointF = f2 > f4 ? new PointF(f3, f2) : new PointF(f, f4);
        path.quadTo(pointF.x, pointF.y, f3, f4);
        return path;
    }
}
