package defpackage;

import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public abstract class jab implements e1k {
    public z4b a;
    public e1k b;
    public final /* synthetic */ oab c;

    public jab(oab oabVar) {
        e1k z4bVar;
        this.c = oabVar;
        rln rlnVar = oabVar.B;
        z83.g(null, rlnVar.b, Looper.myLooper());
        this.a = new z4b(rlnVar);
        b5b b5bVar = oabVar.C;
        x0j0 x0j0Var = b5bVar.c;
        z83.g(null, b5bVar.a, Looper.myLooper());
        if (b5bVar.b.e() == null) {
            z4bVar = e1k.M1;
        } else {
            int i = 1;
            b5bVar.f++;
            w0j0 w0j0Var = b5bVar.g;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (w0j0Var == null) {
                b5bVar.g = x0j0Var.a(25L, timeUnit, new a5b(b5bVar, 0));
            }
            if (b5bVar.h == null) {
                b5bVar.h = x0j0Var.a(25L, timeUnit, new a5b(b5bVar, i));
            }
            z4bVar = new z4b(b5bVar);
        }
        this.b = z4bVar;
        z83.g(null, oabVar.c, Looper.myLooper());
        oabVar.P.b(this);
    }

    public abstract void c(iaz0 iaz0Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        oab oabVar = this.c;
        z83.g(null, oabVar.c, Looper.myLooper());
        e1k e1kVar = this.b;
        if (e1kVar != null) {
            e1kVar.close();
        }
        this.b = null;
        z4b z4bVar = this.a;
        if (z4bVar != null) {
            z4bVar.close();
        }
        this.a = null;
        oabVar.P.d(this);
    }
}
