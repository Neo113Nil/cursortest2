package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StorefrontAlbumsFeature.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class dkl0 implements wb0, g0t {
    public static final dkl0 b = new dkl0();

    public final boolean equals(Object obj) {
        if ((obj instanceof wb0) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, ujl0.class, "<init>", "<init>(Lcom/vk/mvi/actor/MviActorStoreGateway;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return new ujl0((sj50) obj);
    }

    @Override // xsna.wb0
    /* renamed from: j */
    public final qj50 invoke(sj50 sj50Var) {
        return new ujl0(sj50Var);
    }
}
