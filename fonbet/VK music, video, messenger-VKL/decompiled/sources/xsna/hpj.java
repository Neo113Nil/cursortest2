package xsna;

/* compiled from: Scopes.kt */
/* loaded from: classes11.dex */
public final class hpj implements yvj {
    public final kotlin.coroutines.d b;

    public hpj(kotlin.coroutines.d dVar) {
        this.b = dVar;
    }

    @Override // xsna.yvj
    public final kotlin.coroutines.d getCoroutineContext() {
        return this.b;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.b + ')';
    }
}
