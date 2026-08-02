package defpackage;

/* loaded from: classes13.dex */
public final class om10 {
    public static c6a0 a(nea0 nea0Var) {
        u0k u0kVar = nea0Var.a;
        bw90 bw90Var = nea0Var.b;
        if (u0kVar instanceof vi0) {
            return new r5a0((vi0) u0kVar);
        }
        if (!(u0kVar instanceof lea0)) {
            w511.b();
            return null;
        }
        lea0 lea0Var = (lea0) u0kVar;
        if (!(lea0Var instanceof fl8) && !(lea0Var instanceof bjm0)) {
            return t5a0.a;
        }
        return new w5a0(lea0Var, bw90Var);
    }
}
