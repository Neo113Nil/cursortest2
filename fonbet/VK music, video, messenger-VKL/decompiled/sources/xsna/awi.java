package xsna;

/* compiled from: CompoundRxApiRequest.kt */
/* loaded from: classes15.dex */
public abstract class awi<T> extends rsg0<T> {

    /* compiled from: CompoundRxApiRequest.kt */
    public static final class a extends RuntimeException {
    }

    public awi() {
        super("no_method");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        throw new a("CompoundRxApiRequest should never call parse(...)");
    }
}
