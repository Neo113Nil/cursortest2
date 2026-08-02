package defpackage;

/* loaded from: classes.dex */
public interface f531 {
    boolean b();

    long e(sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3);

    default sj2 i(sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        return k(e(sj2Var, sj2Var2, sj2Var3), sj2Var, sj2Var2, sj2Var3);
    }

    sj2 k(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3);

    sj2 n(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3);
}
