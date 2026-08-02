package defpackage;

/* loaded from: classes15.dex */
public final class nyf0 extends zij {
    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        return ((lyf0) obj).equals((lyf0) obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        lyf0 lyf0Var = (lyf0) obj;
        lyf0 lyf0Var2 = (lyf0) obj2;
        return lyf0Var.getClass() == lyf0Var2.getClass() && lyf0Var.a() == lyf0Var2.a();
    }
}
