package xsna;

/* compiled from: DiDependency.kt */
/* loaded from: classes.dex */
public abstract class iqy<Dep, Holder> {
    public final gzs<Dep> a;
    public volatile Holder b;

    /* JADX WARN: Multi-variable type inference failed */
    public iqy(gzs<? extends Dep> gzsVar) {
        this.a = gzsVar;
    }

    public abstract Holder a(Dep dep);

    public abstract Dep b();

    public final Dep c() {
        Dep b = b();
        if (b != null) {
            return b;
        }
        synchronized (this) {
            Dep b2 = b();
            if (b2 != null) {
                return b2;
            }
            Dep invoke = this.a.invoke();
            this.b = a(invoke);
            return invoke;
        }
    }
}
