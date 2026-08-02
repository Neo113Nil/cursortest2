package xsna;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes11.dex */
public final class c8i implements spj<Object> {
    public static final c8i b = new c8i();

    @Override // xsna.spj
    public final kotlin.coroutines.d getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // xsna.spj
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
