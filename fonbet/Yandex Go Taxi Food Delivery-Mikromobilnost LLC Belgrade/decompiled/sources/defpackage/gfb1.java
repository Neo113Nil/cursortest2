package defpackage;

import com.ybsdk.feature.card.api.RetrofitProvider$Type;
import com.ybsdk.feature.card.internal.network.PciDssCardApi;

/* loaded from: classes3.dex */
public abstract class gfb1 {
    public static au2 a;

    public static sa8 a(cjm0 cjm0Var) {
        t0k0 t0k0Var;
        t0k0 t0k0Var2;
        yvf0 yvf0Var = (yvf0) cjm0Var.b;
        yvf0 yvf0Var2 = (yvf0) cjm0Var.c;
        int i = app0.a[RetrofitProvider$Type.PCI_DSS.ordinal()];
        if (i == 1) {
            t0k0Var = (t0k0) yvf0Var.get();
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            t0k0Var = (t0k0) yvf0Var2.get();
        }
        PciDssCardApi pciDssCardApi = (PciDssCardApi) t0k0Var.b(PciDssCardApi.class);
        int i2 = app0.a[RetrofitProvider$Type.REGULAR.ordinal()];
        if (i2 == 1) {
            t0k0Var2 = (t0k0) yvf0Var.get();
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            t0k0Var2 = (t0k0) yvf0Var2.get();
        }
        return new sa8(pciDssCardApi);
    }

    public static qxy b(ob0 ob0Var) {
        return new pxy(ob0Var);
    }

    public static final au2 c() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Spinner", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 e = nnm.e(12.0f, 5.0f);
        e.b(7.0f, 7.0f, false, false, -7.0f, 7.0f);
        e.b(1.0f, 1.0f, true, true, -2.0f, 0.0f);
        e.b(9.0f, 9.0f, false, true, 9.0f, -9.0f);
        e.b(1.0f, 1.0f, true, true, 0.0f, 2.0f);
        e.k(8.0f, 6.0f);
        e.b(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        e.b(9.0f, 9.0f, false, true, -9.0f, 9.0f);
        e.b(1.0f, 1.0f, true, true, 0.0f, -2.0f);
        e.b(7.0f, 7.0f, false, false, 7.0f, -7.0f);
        e.b(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }
}
