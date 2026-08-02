package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BookingMastersScreenStore.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class sr7 implements wb0, g0t {
    public static final sr7 b = new sr7();

    public final boolean equals(Object obj) {
        if ((obj instanceof wb0) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.b.class, "<init>", "<init>(Lcom/vk/mvi/actor/MviActorStoreGateway;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return new com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.b((sj50) obj);
    }

    @Override // xsna.wb0
    /* renamed from: j */
    public final qj50 invoke(sj50 sj50Var) {
        return new com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.b(sj50Var);
    }
}
