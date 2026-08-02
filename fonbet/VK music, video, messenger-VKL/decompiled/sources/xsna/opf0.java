package xsna;

import androidx.lifecycle.e0;
import xsna.vy1;

/* compiled from: RefreshableViewModelFactory.kt */
/* loaded from: classes4.dex */
public abstract class opf0<ViewModelType extends vy1> extends e0.e implements e0.c {
    @Override // androidx.lifecycle.e0.c
    public final <Type extends nyt0> Type a(Class<Type> cls) {
        return e();
    }

    @Override // androidx.lifecycle.e0.c
    public final nyt0 c(Class cls, fg50 fg50Var) {
        return e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.e0.e
    public final void d(nyt0 nyt0Var) {
        f((vy1) nyt0Var);
    }

    public abstract ViewModelType e();

    public abstract void f(ViewModelType viewmodeltype);
}
