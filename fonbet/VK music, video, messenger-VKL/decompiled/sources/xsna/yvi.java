package xsna;

/* compiled from: CompoundCoroutineApiRequest.kt */
/* loaded from: classes15.dex */
public abstract class yvi<T> extends evj<T> {

    /* compiled from: CompoundCoroutineApiRequest.kt */
    public static final class a extends RuntimeException {
    }

    public yvi() {
        super("no_method");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        throw new a("CompoundCoroutineApiRequest should never call parse(...)");
    }
}
