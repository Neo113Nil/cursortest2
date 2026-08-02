package xsna;

/* compiled from: ImEngineCmd.kt */
/* loaded from: classes.dex */
public abstract class e1w<V> implements isx0 {
    public volatile mla a;

    @Override // xsna.isx0
    public final mla b() {
        mla mlaVar = this.a;
        if (mlaVar != null) {
            return mlaVar;
        }
        return null;
    }

    public final String c() {
        return getClass().getName();
    }

    public final void d(Object obj) {
        this.a = pla.g(5, obj);
    }

    public abstract int hashCode();

    public abstract String toString();
}
