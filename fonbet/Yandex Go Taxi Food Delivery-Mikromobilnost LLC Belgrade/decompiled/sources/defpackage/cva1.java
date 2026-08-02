package defpackage;

/* loaded from: classes11.dex */
public abstract class cva1 {
    public static final boolean a(ety0 ety0Var) {
        tvc0 tvc0Var;
        iwc0 iwc0Var = ety0Var.c;
        mun munVar = (iwc0Var == null || (tvc0Var = iwc0Var.b) == null) ? null : new mun(tvc0Var.b);
        boolean z = false;
        if (munVar != null && munVar.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final hhl0 b(x910 x910Var) {
        Object a = x910Var.a();
        if (a instanceof hhl0) {
            return (hhl0) a;
        }
        return null;
    }

    public static final float c(hhl0 hhl0Var) {
        if (hhl0Var != null) {
            return hhl0Var.a;
        }
        return 0.0f;
    }
}
