package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class a2y0 implements jms {
    public final /* synthetic */ x980 a;

    public a2y0(x980 x980Var) {
        this.a = x980Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a2y0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, x980.class, "addPorchNumber", "addPorchNumber(Lcom/yandex/go/taxi/order/models/api/TaxiOrderHolder;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
