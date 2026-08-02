package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class c2y0 implements jms {
    public final /* synthetic */ x980 a;

    public c2y0(x980 x980Var) {
        this.a = x980Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c2y0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(3, this.a, x980.class, "changeSourceAddress", "changeSourceAddress(Lcom/yandex/go/taxi/order/models/api/TaxiOrderHolder;Lcom/yandex/go/taxi/order/models/api/deeplink/TaxiOrderDeeplink$ChangeSource;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
