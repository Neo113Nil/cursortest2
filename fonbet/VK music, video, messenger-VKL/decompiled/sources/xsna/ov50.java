package xsna;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import xsna.is50;
import xsna.laz0;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ov50 extends t46 implements vlv {
    public final Context e;
    public final laz0.b f;
    public qay0 g;
    public b h;
    public is50.a i;
    public a j;
    public int k;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        boolean e();

        void n(@NonNull ov50 ov50Var);

        void q(@NonNull ov50 ov50Var);
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface b {
        void a();

        void b();

        void c(@NonNull iaz0 iaz0Var);

        void d(@NonNull nv50 nv50Var);
    }

    public ov50(int i, @NonNull Context context) {
        super(context, i, "nativebanner");
        this.f = new laz0.b();
        this.k = 0;
        this.e = context.getApplicationContext();
        String str = gt50.a;
        gu8.d("Native banner ad created. Version - 5.50.2");
    }

    @Override // xsna.vlv
    public final void a() {
        afz0.b(this);
        qay0 qay0Var = this.g;
        if (qay0Var != null) {
            qay0Var.a();
        }
    }

    public final void c(rjz0 rjz0Var, xla xlaVar) {
        b bVar = this.h;
        if (bVar == null) {
            return;
        }
        iaz0 iaz0Var = (iaz0) xlaVar.b;
        if (rjz0Var == null) {
            if (iaz0Var == null) {
                iaz0Var = iaz0.o;
            }
            bVar.c(iaz0Var);
            return;
        }
        ArrayList arrayList = rjz0Var.b;
        x1z0 x1z0Var = arrayList.size() > 0 ? (x1z0) arrayList.get(0) : null;
        wcy0 wcy0Var = rjz0Var.a;
        u6z0 u6z0Var = this.a;
        Context context = this.e;
        if (x1z0Var != null) {
            b5z0 b5z0Var = new b5z0(this, x1z0Var, context);
            this.g = b5z0Var;
            nv50 nv50Var = b5z0Var.e;
            if (nv50Var != null) {
                this.h.d(nv50Var);
                u6z0Var.j.c(3);
                return;
            }
            return;
        }
        if (wcy0Var != null) {
            dwy0 dwy0Var = new dwy0(this, wcy0Var, u6z0Var, this.b);
            this.g = dwy0Var;
            dwy0Var.v(context);
            u6z0Var.j.c(3);
            return;
        }
        b bVar2 = this.h;
        if (iaz0Var == null) {
            iaz0Var = iaz0.v;
        }
        bVar2.c(iaz0Var);
    }

    public final void d() {
        boolean compareAndSet = this.c.compareAndSet(false, true);
        u6z0 u6z0Var = this.a;
        if (!compareAndSet) {
            gu8.c(null, "NativeBannerAd: Doesn't support multiple load");
            u6z0Var.j.a(0, 0, 1, null, null);
            c(null, xla.a(iaz0.t));
            return;
        }
        int i = u6z0Var.g;
        z5z0 z5z0Var = v5z0.a;
        udz0 udz0Var = new udz0(this.d, null, Integer.valueOf(i), 0, 0, z5z0Var);
        u6z0Var.b(udz0Var);
        udz0Var.c(0);
        s3z0.a aVar = this.b;
        s3z0 a2 = aVar.a();
        laz0 laz0Var = new laz0(this.f, u6z0Var, aVar, null, null);
        laz0Var.d = new com.vk.movika.sdk.base.ui.p0(this, 28);
        laz0Var.e(a2, this.e);
    }

    @Deprecated
    public final void e(@NonNull View view, @Nullable List<View> list) {
        afz0.a(view, this);
        qay0 qay0Var = this.g;
        if (qay0Var != null) {
            qay0Var.d(view, list, this.k);
        }
    }
}
