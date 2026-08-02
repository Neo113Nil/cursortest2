package defpackage;

/* loaded from: classes4.dex */
public final class h87 extends o2 {
    public final xr1 a;
    public final xr1 b;
    public final xr1 c;

    public h87(i3 i3Var) {
        if (i3Var.size() != 2) {
            ny61.g("Sequence wrong size: One of signatureAlgorithm or macAlgorithm must be present");
            throw null;
        }
        this.a = xr1.m(i3Var.A(0));
        s3 A = s3.A(i3Var.A(1));
        int i = A.c;
        if (i == 1) {
            this.b = xr1.m(i3.y(A, false));
            this.c = null;
        } else {
            if (i != 2) {
                ny61.e(A.c, "Unknown tag found: ");
                throw null;
            }
            this.b = null;
            this.c = xr1.m(i3.y(A, false));
        }
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        c2Var.a(this.a);
        xr1 xr1Var = this.b;
        if (xr1Var != null) {
            c2Var.a(new oqf(false, 1, xr1Var, 0));
        }
        xr1 xr1Var2 = this.c;
        if (xr1Var2 != null) {
            c2Var.a(new oqf(false, 2, xr1Var2, 0));
        }
        return new jqf(c2Var);
    }

    public h87(xr1 xr1Var, xr1 xr1Var2) {
        if (xr1Var == null || xr1Var2 == null) {
            ny61.t("AlgorithmIdentifiers cannot be null");
            throw null;
        }
        this.a = xr1Var;
        this.b = xr1Var2;
        this.c = null;
    }
}
