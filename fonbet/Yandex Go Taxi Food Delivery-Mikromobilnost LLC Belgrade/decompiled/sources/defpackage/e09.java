package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class e09 implements jms {
    public final /* synthetic */ f09 a;

    public e09(f09 f09Var) {
        this.a = f09Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e09) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, f09.class, "onStateChanged", "onStateChanged(Lcom/yandex/go/taxi/cars/api/transition/CarsOverlayTransitionManager$State;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
