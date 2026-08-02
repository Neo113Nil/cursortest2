package xsna;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;

/* compiled from: DiComponentFactoryWrapper.kt */
/* loaded from: classes.dex */
public final class e8m<C1 extends DiScopedComponent<SK>, SK extends pwj0> implements d8m {
    public final x9e0<C1, SK> a;

    public e8m(x9e0<C1, SK> x9e0Var) {
        this.a = x9e0Var;
    }

    @Override // xsna.d8m
    public final a7m a(l9i l9iVar, g8m g8mVar, pwj0 pwj0Var) {
        return this.a.a.invoke().a(g8mVar, pwj0Var);
    }
}
