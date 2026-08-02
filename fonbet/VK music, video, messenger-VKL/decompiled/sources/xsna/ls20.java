package xsna;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: MiscUtils.java */
/* loaded from: classes12.dex */
public final class ls20 {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static int d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void e(v5j0 v5j0Var, Path path) {
        Path path2;
        path.reset();
        PointF pointF = v5j0Var.b;
        ArrayList arrayList = v5j0Var.a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            qkk qkkVar = (qkk) arrayList.get(i);
            PointF pointF3 = qkkVar.a;
            PointF pointF4 = qkkVar.b;
            PointF pointF5 = qkkVar.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (v5j0Var.c) {
            path3.close();
        }
    }

    public static float f(float f, float f2, float f3) {
        return u11.b(f2, f, f3, f);
    }

    public static void g(udy udyVar, int i, ArrayList arrayList, udy udyVar2, wdy wdyVar) {
        if (udyVar.a(i, wdyVar.getName())) {
            String name = wdyVar.getName();
            udy udyVar3 = new udy(udyVar2);
            udyVar3.a.add(name);
            udy udyVar4 = new udy(udyVar3);
            udyVar4.b = wdyVar;
            arrayList.add(udyVar4);
        }
    }
}
