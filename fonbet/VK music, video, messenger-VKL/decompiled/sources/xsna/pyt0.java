package xsna;

import androidx.lifecycle.e0;
import kotlin.Lazy;
import xsna.nyt0;

/* compiled from: ViewModelFactory.kt */
/* loaded from: classes3.dex */
public final class pyt0<VM extends nyt0> implements e0.c {
    public final Object a;

    public pyt0(Lazy<? extends VM> lazy) {
        this.a = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.lifecycle.e0.c
    public final <T extends nyt0> T a(Class<T> cls) {
        ?? r0 = this.a;
        T t = (T) r0.getValue();
        if (cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        throw new IllegalArgumentException("Unknown ViewModel class " + r0.getClass().getCanonicalName() + " need " + cls.getCanonicalName());
    }

    @Override // androidx.lifecycle.e0.c
    public final nyt0 c(Class cls, fg50 fg50Var) {
        return a(cls);
    }
}
