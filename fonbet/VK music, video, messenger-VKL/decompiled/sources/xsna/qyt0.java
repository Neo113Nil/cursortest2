package xsna;

import androidx.lifecycle.e0;

/* compiled from: ViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class qyt0<T> implements e0.c {
    public final Class<T> a;
    public final gzs<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public qyt0(Class<T> cls, gzs<? extends T> gzsVar) {
        this.a = cls;
        this.b = gzsVar;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Lxsna/nyt0;>(Ljava/lang/Class<TT;>;)TT; */
    @Override // androidx.lifecycle.e0.c
    public final nyt0 a(Class cls) {
        if (cls.isAssignableFrom(this.a)) {
            return (nyt0) this.b.invoke();
        }
        throw new IllegalArgumentException("Unknown ViewModel '" + cls.getCanonicalName() + "' class");
    }

    @Override // androidx.lifecycle.e0.c
    public final nyt0 c(Class cls, fg50 fg50Var) {
        return a(cls);
    }
}
