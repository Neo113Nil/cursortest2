package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: classes10.dex */
public final class lb2 implements zq90 {
    public final PathMeasure a;

    public lb2(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    @Override // defpackage.zq90
    public final boolean a(float f, float f2, rq90 rq90Var) {
        if (rq90Var != null) {
            return this.a.getSegment(f, f2, ((jb2) rq90Var).a, true);
        }
        w511.x("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // defpackage.zq90
    public final void b(rq90 rq90Var) {
        Path path;
        if (rq90Var == null) {
            path = null;
        } else {
            if (!(rq90Var instanceof jb2)) {
                w511.x("Unable to obtain android.graphics.Path");
                return;
            }
            path = ((jb2) rq90Var).a;
        }
        this.a.setPath(path, false);
    }

    @Override // defpackage.zq90
    public final float getLength() {
        return this.a.getLength();
    }
}
