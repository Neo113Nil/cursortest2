package defpackage;

import android.util.Size;
import androidx.camera.camera2.internal.p;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class dyq0 extends cyq0 {
    public static dyq0 e(xi21 xi21Var, Size size) {
        if (((p) xi21Var.g(xi21.l4, null)) != null) {
            dyq0 dyq0Var = new dyq0();
            p.a(size, xi21Var, dyq0Var);
            return dyq0Var;
        }
        yci0.t((String) xi21Var.g(max0.e4, xi21Var.toString()), "Implementation is missing option unpacker for ");
        return null;
    }

    public final void a(uo7 uo7Var) {
        this.b.b(uo7Var);
        ArrayList arrayList = this.e;
        if (arrayList.contains(uo7Var)) {
            return;
        }
        arrayList.add(uo7Var);
    }

    public final void b(szd szdVar) {
        this.b.c(szdVar);
    }

    public final void c(DeferrableSurface deferrableSurface, q8n q8nVar, int i) {
        g84 a = gyq0.a(deferrableSurface);
        a.c = null;
        if (q8nVar == null) {
            ny61.t("Null dynamicRange");
            return;
        }
        a.f = q8nVar;
        a.d = Integer.valueOf(i);
        this.a.add(a.a());
        this.b.d(deferrableSurface);
    }

    public final jyq0 d() {
        return new jyq0(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.e(), this.f, this.g, this.h, this.i);
    }
}
