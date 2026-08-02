package defpackage;

/* loaded from: classes8.dex */
public final class jjv0 {
    public static ijv0 a(ynv0 ynv0Var) {
        if (ynv0Var == null) {
            return null;
        }
        return b(ynv0Var);
    }

    public static ijv0 b(ynv0 ynv0Var) {
        if (jl40.l(ynv0Var, snv0.a)) {
            return bjv0.a;
        }
        if (ynv0Var instanceof vnv0) {
            vnv0 vnv0Var = (vnv0) ynv0Var;
            qnv0 a = vnv0Var.a();
            return new fjv0(a != null ? new ajv0(a.a()) : null, vnv0Var.b());
        }
        if (jl40.l(ynv0Var, unv0.a)) {
            return djv0.a;
        }
        if (jl40.l(ynv0Var, wnv0.a)) {
            return gjv0.a;
        }
        if (jl40.l(ynv0Var, rnv0.a)) {
            return ziv0.a;
        }
        if (jl40.l(ynv0Var, tnv0.a)) {
            return cjv0.a;
        }
        if (jl40.l(ynv0Var, xnv0.a)) {
            return hjv0.a;
        }
        w511.b();
        return null;
    }
}
