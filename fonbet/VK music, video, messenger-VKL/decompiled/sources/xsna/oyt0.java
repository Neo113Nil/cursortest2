package xsna;

import androidx.lifecycle.e0;
import xsna.nyt0;
import xsna.nzw;

/* compiled from: ViewModelFactory.kt */
/* loaded from: classes3.dex */
public final class oyt0<VM extends nyt0> implements e0.c {
    @Override // androidx.lifecycle.e0.c
    public final <T extends nyt0> T a(Class<T> cls) {
        nzw.a aVar = new nzw.a();
        if (cls.isAssignableFrom(aVar.getClass())) {
            return aVar;
        }
        throw new IllegalArgumentException("Unknown ViewModel class " + fpf0.a(aVar.getClass()).l() + " need " + cls.getCanonicalName());
    }

    @Override // androidx.lifecycle.e0.c
    public final nyt0 c(Class cls, fg50 fg50Var) {
        return a(cls);
    }
}
