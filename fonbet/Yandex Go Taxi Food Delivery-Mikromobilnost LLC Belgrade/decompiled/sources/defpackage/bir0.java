package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class bir0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* loaded from: classes11.dex */
    public static class a extends b {
        public float b;
        public float c;

        @Override // bir0.b
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes11.dex */
    public static abstract class b {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public bir0() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
        zhr0 zhr0Var = new zhr0(f, f2, f3, f4);
        zhr0.b(zhr0Var, f5);
        zhr0.c(zhr0Var, f6);
        this.g.add(zhr0Var);
        xhr0 xhr0Var = new xhr0(zhr0Var);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        b(f5);
        this.h.add(xhr0Var);
        this.e = f8;
        double d = f7;
        this.c = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.d = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    public final void b(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        zhr0 zhr0Var = new zhr0(f4, f5, f4, f5);
        zhr0.b(zhr0Var, this.e);
        zhr0.c(zhr0Var, f3);
        this.h.add(new xhr0(zhr0Var));
        this.e = f;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        a aVar = new a();
        aVar.b = f;
        aVar.c = f2;
        this.g.add(aVar);
        yhr0 yhr0Var = new yhr0(aVar, this.c, this.d);
        float c = yhr0Var.c() + 270.0f;
        float c2 = yhr0Var.c() + 270.0f;
        b(c);
        this.h.add(yhr0Var);
        this.e = c2;
        this.c = f;
        this.d = f2;
    }

    public final void e(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = (f3 + f4) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
