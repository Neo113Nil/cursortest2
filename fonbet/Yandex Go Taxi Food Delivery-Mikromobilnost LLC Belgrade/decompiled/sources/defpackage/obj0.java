package defpackage;

/* loaded from: classes6.dex */
public final class obj0 extends zij {
    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        wu0 wu0Var = (wu0) obj;
        wu0 wu0Var2 = (wu0) obj2;
        if ((wu0Var instanceof j2c) && (wu0Var2 instanceof j2c)) {
            return jl40.l(((j2c) wu0Var).b, ((j2c) wu0Var2).b);
        }
        if ((wu0Var instanceof s41) && (wu0Var2 instanceof s41)) {
            return wu0Var.equals(wu0Var2);
        }
        return true;
    }

    @Override // defpackage.zij
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return true;
    }

    @Override // defpackage.zij
    public final Object c(Object obj, Object obj2) {
        return ((((wu0) obj) instanceof j2c) && (((wu0) obj2) instanceof j2c)) ? 0 : null;
    }
}
