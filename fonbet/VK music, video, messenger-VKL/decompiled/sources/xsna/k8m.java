package xsna;

import com.vk.di.component.DiScopedWithParamsComponent;
import xsna.l9i;
import xsna.pwj0;

/* compiled from: DiComponentFactoryWrapper.kt */
/* loaded from: classes.dex */
public final class k8m<C2 extends DiScopedWithParamsComponent<SK, P>, SK extends pwj0, P extends l9i> implements d8m {
    public final zxp a;

    public k8m(zxp zxpVar) {
        this.a = zxpVar;
    }

    @Override // xsna.d8m
    public final a7m a(l9i l9iVar, g8m g8mVar, pwj0 pwj0Var) {
        return ((o8m) ((gzs) this.a.a).invoke()).a(l9iVar, g8mVar, pwj0Var);
    }
}
