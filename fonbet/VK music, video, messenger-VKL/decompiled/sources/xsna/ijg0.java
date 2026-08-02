package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import xsna.ff6;
import xsna.hjz0;
import xsna.hox;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ijg0 extends ff6 {

    @Nullable
    public a j;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void b();

        void d();

        void e(@NonNull iaz0 iaz0Var);

        void h(@NonNull ijg0 ijg0Var);

        void i();

        void j();

        void l(@NonNull fvr fvrVar);
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class c {
        public c() {
        }

        public final void a(fvr fvrVar) {
            a aVar = ijg0.this.j;
            if (aVar != null) {
                aVar.l(fvrVar);
            }
        }
    }

    public ijg0(int i, @NonNull Context context) {
        super(context, i, "rewarded");
        String str = gt50.a;
        gu8.d("Rewarded ad created. Version - 5.50.2");
    }

    @Override // xsna.ff6
    public final void c(ikz0 ikz0Var, xla xlaVar) {
        a aVar = this.j;
        if (aVar == null) {
            return;
        }
        iaz0 iaz0Var = (iaz0) xlaVar.b;
        if (ikz0Var == null) {
            if (iaz0Var == null) {
                iaz0Var = iaz0.o;
            }
            aVar.e(iaz0Var);
            return;
        }
        ArrayList arrayList = ikz0Var.b;
        wcy0 wcy0Var = ikz0Var.a;
        boolean isEmpty = arrayList.isEmpty();
        u6z0 u6z0Var = this.a;
        if (!isEmpty) {
            euy0 n = euy0.n(this, arrayList, ikz0Var, this.g, new b(), null);
            this.f = n;
            if (n == null) {
                this.j.e(iaz0.o);
                return;
            }
            n.i = new c();
            this.j.h(this);
            u6z0Var.j.c(3);
            return;
        }
        if (wcy0Var == null) {
            a aVar2 = this.j;
            if (iaz0Var == null) {
                iaz0Var = iaz0.v;
            }
            aVar2.e(iaz0Var);
            return;
        }
        t0z0 t0z0Var = new t0z0(wcy0Var, u6z0Var, this.b, new b());
        t0z0Var.k = new c();
        this.f = t0z0Var;
        t0z0Var.v(this.e);
        u6z0Var.j.c(3);
    }

    @Override // xsna.ff6
    public final void d() {
        super.d();
        this.j = null;
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b implements hjz0.a {
        public b() {
        }

        @Override // xsna.hjz0.a
        public final void a(hox.a aVar) {
            ff6.a aVar2 = ijg0.this.h;
            if (aVar2 != null) {
                aVar2.a();
            }
        }

        @Override // xsna.hjz0.a
        public final void b() {
            a aVar = ijg0.this.j;
            if (aVar != null) {
                aVar.j();
            }
        }

        @Override // xsna.hjz0.a
        public final void c() {
            a aVar = ijg0.this.j;
            if (aVar != null) {
                aVar.i();
            }
        }

        @Override // xsna.hjz0.a
        public final void d() {
            ijg0 ijg0Var = ijg0.this;
            s3z0.a aVar = ijg0Var.b;
            s3z0 s3z0Var = new s3z0(aVar.a, "myTarget", 4);
            s3z0Var.e = aVar.b;
            ijg0Var.i = s3z0Var;
        }

        @Override // xsna.hjz0.a
        public final void e() {
            ijg0 ijg0Var = ijg0.this;
            s3z0 s3z0Var = ijg0Var.i;
            if (s3z0Var != null) {
                s3z0Var.a(s3z0Var.d, System.currentTimeMillis() - s3z0Var.c);
                ijg0Var.i.b();
            }
            a aVar = ijg0Var.j;
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // xsna.hjz0.a
        public final void g(hox.a aVar) {
            a aVar2 = ijg0.this.j;
            if (aVar2 != null) {
                aVar2.b();
            }
        }

        @Override // xsna.hjz0.a
        public final void f() {
        }
    }
}
