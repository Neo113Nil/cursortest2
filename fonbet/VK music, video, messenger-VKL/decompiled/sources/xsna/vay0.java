package xsna;

import com.google.gson.JsonIOException;

/* loaded from: classes12.dex */
public final class vay0 implements jp70, is8, aey {
    public static final vay0 c = new vay0();
    public Object b;

    public static void a(String str, Object... objArr) {
        lnv lnvVar = (lnv) c.b;
        if (lnvVar != null) {
            lnvVar.d(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        lnv lnvVar = (lnv) c.b;
        if (lnvVar != null) {
            lnvVar.w(str, objArr);
        }
    }

    @Override // xsna.aey
    public void a0() {
        u6m0 u6m0Var = ((q6m0) this.b).p;
        if (u6m0Var != null) {
            u6m0Var.k();
        }
    }

    @Override // xsna.aey
    public void b() {
        u6m0 u6m0Var = ((q6m0) this.b).p;
        if (u6m0Var != null) {
            u6m0Var.k();
        }
    }

    @Override // xsna.is8
    public void c() {
        dw20 dw20Var = ((ddl0) this.b).f;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }

    @Override // xsna.jp70
    public Object h() {
        throw new JsonIOException((String) this.b);
    }
}
