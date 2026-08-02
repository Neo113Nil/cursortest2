package defpackage;

import java.io.InputStream;

/* loaded from: classes4.dex */
public final class l87 extends x3 {
    public final pgi0 c;
    public final tis0 w;
    public xc3 x;
    public boolean y;

    public l87(InputStream inputStream) {
        super(inputStream);
        this.y = true;
        j3 j3Var = (j3) ((yfa) this.b).d();
        tis0 tis0Var = new tis0();
        tis0Var.c = j3Var;
        l2.u(j3Var.readObject());
        this.w = tis0Var;
        tis0Var.O();
        if (!tis0Var.b) {
            tis0Var.O();
        }
        if (((a2) tis0Var.w) == null) {
            tis0Var.w = j3Var.readObject();
        }
        n3 n3Var = (n3) ((a2) tis0Var.w);
        jdj jdjVar = null;
        tis0Var.w = null;
        m3 x = m3.x(n3Var.toASN1Primitive());
        if (((a2) tis0Var.w) == null) {
            tis0Var.w = j3Var.readObject();
        }
        a2 a2Var = (a2) tis0Var.w;
        if (a2Var != null) {
            j3 j3Var2 = (j3) a2Var;
            tis0Var.w = null;
            jdjVar = new jdj(13);
            jdjVar.c = (u2) j3Var2.readObject();
            jdjVar.b = xr1.m(j3Var2.readObject().toASN1Primitive());
            jdjVar.w = (t3) j3Var2.readObject();
        }
        xr1 xr1Var = (xr1) jdjVar.b;
        t3 t3Var = (t3) jdjVar.w;
        z3.a(t3Var, 0);
        InputStream d = ((y2) t3Var.j(4)).d();
        wvb1 wvb1Var = new wvb1();
        wvb1Var.a = false;
        wvb1Var.b = d;
        this.c = edb1.a(x, xr1Var, new c06((u2) jdjVar.c, wvb1Var));
    }
}
