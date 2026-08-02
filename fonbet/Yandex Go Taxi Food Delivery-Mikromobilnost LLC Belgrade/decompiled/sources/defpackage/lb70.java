package defpackage;

/* loaded from: classes.dex */
public final class lb70 extends gc70 {
    public static final lb70 c = new lb70(0, 3, 1);

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        ht10 d;
        sus0 sus0Var = (sus0) vc70Var.b(1);
        yss yssVar = (yss) vc70Var.b(0);
        ver verVar = (ver) vc70Var.b(2);
        ows0 k = sus0Var.k();
        if (jc70Var != null) {
            try {
                d = wub1.d(jc70Var, ows0Var);
            } catch (Throwable th) {
                k.e(false);
                throw th;
            }
        } else {
            d = null;
        }
        if (!verVar.b.c()) {
            lid.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        verVar.a.b(o13Var, k, zti0Var, d);
        k.e(true);
        ows0Var.d();
        yssVar.getClass();
        ows0Var.A(sus0Var, sus0Var.g(yssVar));
        ows0Var.k();
    }
}
