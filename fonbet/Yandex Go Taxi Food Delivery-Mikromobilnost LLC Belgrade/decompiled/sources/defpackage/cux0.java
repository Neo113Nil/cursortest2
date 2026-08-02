package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cux0 implements su00 {
    public final ju6 a;

    public cux0(ju6 ju6Var) {
        this.a = ju6Var;
    }

    @Override // defpackage.su00
    public final Object getHost(Continuation continuation) {
        return ((not) this.a).d();
    }
}
