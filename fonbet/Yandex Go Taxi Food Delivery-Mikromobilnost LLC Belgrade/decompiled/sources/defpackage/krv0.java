package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class krv0 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ jrv0 b;

    public /* synthetic */ krv0(jrv0 jrv0Var, int i) {
        this.a = i;
        this.b = jrv0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        jrv0 jrv0Var = this.b;
        switch (i) {
            case 0:
                jrv0Var.i8((prv0) obj);
                break;
            default:
                jrv0Var.W9((srv0) obj);
                break;
        }
        return zy11Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, this.b, jrv0.class, "render", "render(Lru/yandex/taxi/surge/widget/SummaryWidgetHolderState;)V", 4);
            default:
                return new AdaptedFunctionReference(2, this.b, jrv0.class, "renderOnBoarding", "renderOnBoarding(Lru/yandex/taxi/surge/widget/SummaryWidgetOnBoardingState;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
