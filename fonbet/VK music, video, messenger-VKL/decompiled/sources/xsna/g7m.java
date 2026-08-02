package xsna;

import com.vk.di.component.DiUnscopedWithParamsComponent;
import xsna.l9i;

/* compiled from: DiComponentFactoryWrapper.kt */
/* loaded from: classes.dex */
public final class g7m<C extends DiUnscopedWithParamsComponent<P>, P extends l9i> implements c7m {
    public final w9e0<C, P> a;

    public g7m(w9e0<C, P> w9e0Var) {
        this.a = w9e0Var;
    }

    @Override // xsna.c7m
    public final a7m a(e7m e7mVar, l9i l9iVar) {
        return this.a.a.invoke().a(e7mVar, l9iVar);
    }
}
