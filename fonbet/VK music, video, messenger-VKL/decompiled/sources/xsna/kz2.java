package xsna;

/* compiled from: ApiMethodPriorityChainCall.kt */
/* loaded from: classes.dex */
public final class kz2<T> extends ara<T> {
    public final ara<T> b;
    public final com.vk.api.sdk.a c;
    public final jz2 d;
    public final bpn0 e;

    /* JADX WARN: Multi-variable type inference failed */
    public kz2(l7r0 l7r0Var, ara<? extends T> araVar, com.vk.api.sdk.a aVar, jz2 jz2Var) {
        super(l7r0Var);
        this.b = araVar;
        this.c = aVar;
        this.d = jz2Var;
        this.e = new bpn0(new np(this, 1));
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        jz2 jz2Var = this.d;
        boolean isActive = jz2Var.isActive();
        ara<T> araVar = this.b;
        if (!isActive) {
            return araVar.a(zqaVar);
        }
        String str = this.c.c;
        while (jz2Var.c(str)) {
            if (Thread.interrupted()) {
                throw new InterruptedException("request interrupted");
            }
            jz2Var.b(((Number) this.e.getValue()).intValue(), str);
        }
        try {
            T a = araVar.a(zqaVar);
            jz2Var.d(str);
            return a;
        } catch (Exception e) {
            jz2Var.d(str);
            throw e;
        }
    }
}
