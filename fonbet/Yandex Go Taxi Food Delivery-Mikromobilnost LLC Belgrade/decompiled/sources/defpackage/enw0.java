package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class enw0 {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final lru0 g;
    public int h;
    public int i;
    public znw0 k;
    public dnw0 l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public enw0(int i, int i2, lru0 lru0Var, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = lru0Var;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new dnw0(i2, lru0Var.f());
    }

    public final void a(Runnable runnable) {
        tob1.b();
        b();
        this.m.add(runnable);
    }

    public final void b() {
        d6z.y("Edge is already closed.", !this.n);
    }

    public final void c() {
        tob1.b();
        this.l.a();
        this.n = true;
        this.o.clear();
        this.m.clear();
    }

    public final znw0 d(br7 br7Var, boolean z) {
        tob1.b();
        b();
        lru0 lru0Var = this.g;
        Size f = lru0Var.f();
        q8n b = lru0Var.b();
        int g = lru0Var.g();
        Range c = lru0Var.c();
        int i = 0;
        znw0 znw0Var = new znw0(f, br7Var, z, b, g, c, new bnw0(this, i));
        try {
            iiv iivVar = znw0Var.m;
            dnw0 dnw0Var = this.l;
            Objects.requireNonNull(dnw0Var);
            if (dnw0Var.g(iivVar, new cnw0(dnw0Var, i))) {
                ni91.g(dnw0Var.e).c(new f6f0(iivVar, 1), geb1.b());
            }
            this.k = znw0Var;
            f();
            return znw0Var;
        } catch (DeferrableSurface.SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            znw0Var.d();
            throw e2;
        }
    }

    public final void e() {
        boolean z;
        tob1.b();
        b();
        dnw0 dnw0Var = this.l;
        dnw0Var.getClass();
        tob1.b();
        if (dnw0Var.q == null) {
            synchronized (dnw0Var.a) {
                z = dnw0Var.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new dnw0(this.a, this.g.f());
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        ynw0 ynw0Var;
        Executor executor;
        tob1.b();
        w84 w84Var = new w84(this.d, this.i, this.h, this.c, this.b, this.e);
        znw0 znw0Var = this.k;
        if (znw0Var != null) {
            synchronized (znw0Var.a) {
                znw0Var.n = w84Var;
                ynw0Var = znw0Var.o;
                executor = znw0Var.p;
            }
            if (ynw0Var != null && executor != null) {
                executor.execute(new tpt0(26, ynw0Var, w84Var));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((e9e) it.next()).accept(w84Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.f);
        sb.append(", format=");
        sb.append(this.a);
        sb.append(", resolution=");
        sb.append(this.g.f());
        sb.append(", cropRect=");
        sb.append(this.d);
        sb.append(", rotationDegrees=");
        sb.append(this.i);
        sb.append(", mirroring=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.b;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(lw01.b(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(lw01.f(matrix));
        sb.append(", isClosed=");
        return unr0.u(sb, this.n, '}');
    }
}
