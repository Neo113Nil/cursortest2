package xsna;

/* compiled from: RetryChainCall.kt */
/* loaded from: classes.dex */
public abstract class dfg0<T> extends ara<T> {
    public final int b;

    public dfg0(l7r0 l7r0Var, int i) {
        super(l7r0Var);
        this.b = i;
        if (i < 0) {
            throw new IllegalArgumentException("retryLimit must be >= 0");
        }
    }
}
