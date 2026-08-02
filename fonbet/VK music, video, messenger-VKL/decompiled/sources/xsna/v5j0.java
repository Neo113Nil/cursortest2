package xsna;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* loaded from: classes12.dex */
public final class v5j0 {
    public final ArrayList a;
    public PointF b;
    public boolean c;

    public v5j0(PointF pointF, boolean z, List<qkk> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public final void a(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.a.size());
        sb.append("closed=");
        return defpackage.q0.a(sb, this.c, '}');
    }

    public v5j0() {
        this.a = new ArrayList();
    }
}
