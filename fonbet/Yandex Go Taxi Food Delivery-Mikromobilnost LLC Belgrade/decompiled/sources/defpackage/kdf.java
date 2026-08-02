package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class kdf {
    public final long a;
    public final long b;
    public final long c;
    public final Path d;
    public kdf e;
    public boolean f;

    public kdf(float f, float f2, float f3, float f4, float f5, float f6) {
        long a = ior.a(f, f2);
        long a2 = ior.a(f3, f4);
        long a3 = ior.a(f5, f6);
        this.a = a;
        this.b = a2;
        this.c = a3;
        this.d = new Path();
    }

    public final void a(List list, Region region) {
        Collection collection = (List) a.R(list);
        if (collection == null) {
            collection = EmptyList.a;
        }
        if (collection.isEmpty()) {
            collection = null;
        }
        boolean z = false;
        if (collection != null) {
            Collection<Point> collection2 = collection;
            if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                for (Point point : collection2) {
                    if (!region.contains(point.x, point.y)) {
                        break;
                    }
                }
            }
            z = true;
        }
        this.f = z;
        kdf kdfVar = this.e;
        if (kdfVar != null) {
            kdfVar.a(a.J(list, 1), region);
        }
    }

    public final void b(int i, int i2, Canvas canvas, Paint paint) {
        paint.setColor(this.f ? i : i2);
        canvas.drawPath(this.d, paint);
        kdf kdfVar = this.e;
        if (kdfVar != null) {
            kdfVar.b(i, i2, canvas, paint);
        }
    }

    public final boolean c() {
        if (!this.f) {
            return false;
        }
        kdf kdfVar = this.e;
        return kdfVar != null ? kdfVar.c() : true;
    }

    public final void d() {
        this.f = false;
        kdf kdfVar = this.e;
        if (kdfVar != null) {
            kdfVar.d();
        }
    }

    public final void e(long j, Rect rect, Matrix matrix, Path path) {
        float width = rect.width();
        float height = rect.height();
        Path path2 = new Path();
        path2.moveTo(htb1.b(j) * width, htb1.c(j) * height);
        long j2 = this.a;
        float b = htb1.b(j2) * width;
        float c = htb1.c(j2) * height;
        long j3 = this.b;
        float b2 = htb1.b(j3) * width;
        float c2 = htb1.c(j3) * height;
        long j4 = this.c;
        path2.cubicTo(b, c, b2, c2, htb1.b(j4) * width, htb1.c(j4) * height);
        path.cubicTo(htb1.b(j2) * width, htb1.c(j2) * height, htb1.b(j3) * width, htb1.c(j3) * height, htb1.b(j4) * width, htb1.c(j4) * height);
        path2.transform(matrix);
        this.d.set(path2);
        kdf kdfVar = this.e;
        if (kdfVar != null) {
            kdfVar.e(this.c, rect, matrix, path);
        }
    }

    public final void f(kdf kdfVar) {
        while (true) {
            kdf kdfVar2 = this.e;
            if (kdfVar2 == null) {
                this.e = kdfVar;
                return;
            }
            this = kdfVar2;
        }
    }
}
