package xsna;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import xsna.as50;
import xsna.laz0;
import xsna.s3z0;
import xsna.vtl0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class zu50 extends t46 implements vlv {
    public final Context e;
    public final laz0.a f;
    public final i620 g;
    public ckz0 h;
    public c i;
    public as50.a j;
    public d k;
    public b l;
    public aeq m;
    public a n;
    public vtl0.b o;
    public vtl0.c p;
    public final long q;
    public int r;
    public final boolean s;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        boolean a(int i);
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface b {
        boolean e();

        void g(@NonNull zu50 zu50Var);

        void h(@NonNull zu50 zu50Var);
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface c {
        void a(@Nullable View view, @NonNull zu50 zu50Var);

        void b(@NonNull zu50 zu50Var);

        void c(@NonNull iaz0 iaz0Var, @NonNull zu50 zu50Var);

        void d(@NonNull cw50 cw50Var, @NonNull zu50 zu50Var);

        @Deprecated
        void onClick();

        @Deprecated
        void onVideoComplete();

        @Deprecated
        void onVideoPause();

        @Deprecated
        void onVideoPlay();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface d {
        void a();
    }

    public zu50(int i, @NonNull Context context) {
        super(context, i, "nativeads");
        this.f = new laz0.a();
        this.q = 5000L;
        this.r = 0;
        this.s = true;
        this.e = context.getApplicationContext();
        this.g = null;
        String str = gt50.a;
        gu8.d("Native ad created. Version - 5.50.2");
    }

    @Override // xsna.vlv
    public final void a() {
        afz0.b(this);
        ckz0 ckz0Var = this.h;
        if (ckz0Var != null) {
            ckz0Var.a();
        }
    }

    public final void c(rjz0 rjz0Var, xla xlaVar) {
        c cVar = this.i;
        if (cVar == null) {
            return;
        }
        iaz0 iaz0Var = (iaz0) xlaVar.b;
        if (rjz0Var == null) {
            if (iaz0Var == null) {
                iaz0Var = iaz0.o;
            }
            cVar.c(iaz0Var, this);
            return;
        }
        ArrayList arrayList = rjz0Var.b;
        x1z0 x1z0Var = arrayList.size() > 0 ? (x1z0) arrayList.get(0) : null;
        wcy0 wcy0Var = rjz0Var.a;
        u6z0 u6z0Var = this.a;
        Context context = this.e;
        if (x1z0Var == null) {
            if (wcy0Var != null) {
                kuy0 kuy0Var = new kuy0(this, wcy0Var, this.a, this.b, this.g);
                this.h = kuy0Var;
                kuy0Var.v(context);
                u6z0Var.j.c(3);
                return;
            }
            c cVar2 = this.i;
            if (iaz0Var == null) {
                iaz0Var = iaz0.v;
            }
            cVar2.c(iaz0Var, this);
            return;
        }
        c9z0 c9z0Var = new c9z0(this, x1z0Var, this.g, context);
        this.h = c9z0Var;
        c9z0Var.i = this.k;
        c9z0Var.j = this.m;
        c9z0Var.l(this.n);
        this.h.i(this.o);
        this.h.k(this.p);
        this.h.p();
        this.h.o();
        this.h.a(this.q);
        if (this.h.g() != null) {
            this.i.d(this.h.g(), this);
            u6z0Var.j.c(3);
        }
    }

    @Nullable
    public final cw50 d() {
        ckz0 ckz0Var = this.h;
        if (ckz0Var == null) {
            return null;
        }
        return ckz0Var.g();
    }

    public final void e(@NonNull Context context) {
        ckz0 ckz0Var = this.h;
        if (ckz0Var == null) {
            return;
        }
        ckz0Var.b(context);
    }

    public final void f(@NonNull String str) {
        udz0 udz0Var = new udz0(this.d, UUID.randomUUID().toString(), -1, 1, 1, v5z0.a);
        this.a.b(udz0Var);
        udz0Var.c(0);
        s3z0 a2 = this.b.a();
        laz0 laz0Var = new laz0(this.f, this.a, this.b, null, str);
        laz0Var.d = new yzt(this, 9);
        laz0Var.e(a2, this.e);
    }

    public final void g() {
        boolean compareAndSet = this.c.compareAndSet(false, true);
        u6z0 u6z0Var = this.a;
        if (!compareAndSet) {
            gu8.c(null, "NativeAd: Doesn't support multiple load");
            u6z0Var.j.a(0, 0, 1, null, null);
            c(null, xla.a(iaz0.t));
            return;
        }
        int i = u6z0Var.g;
        z5z0 z5z0Var = v5z0.a;
        udz0 udz0Var = new udz0(this.d, null, Integer.valueOf(i), 1, 0, z5z0Var);
        u6z0Var.b(udz0Var);
        udz0Var.c(0);
        s3z0.a aVar = this.b;
        s3z0 a2 = aVar.a();
        laz0 laz0Var = new laz0(this.f, u6z0Var, aVar, null, null);
        laz0Var.d = new yzt(this, 9);
        laz0Var.e(a2, this.e);
    }

    public final void h(@NonNull lv50 lv50Var, @Nullable List<View> list) {
        afz0.a(lv50Var.d(), this);
        ckz0 ckz0Var = this.h;
        if (ckz0Var != null) {
            ckz0Var.r(lv50Var, list, this.r);
        }
    }

    public final void i(@NonNull Object obj) {
        String packageName = this.e.getPackageName();
        for (int i = 0; i < 13; i++) {
            if (b920.b[i].equals(packageName)) {
                if (!(obj instanceof aeq)) {
                    gu8.e(null, "'setInternalObject' method error. Wrong object type.");
                    return;
                }
                aeq aeqVar = (aeq) obj;
                this.m = aeqVar;
                ckz0 ckz0Var = this.h;
                if (ckz0Var == null) {
                    return;
                }
                ckz0Var.f(aeqVar);
                return;
            }
        }
        gu8.e(null, "Method 'setInternalObject' is for internal partners only.");
    }

    public zu50(int i, @Nullable i620 i620Var, @NonNull Context context) {
        this(i, context);
        this.g = i620Var;
    }
}
