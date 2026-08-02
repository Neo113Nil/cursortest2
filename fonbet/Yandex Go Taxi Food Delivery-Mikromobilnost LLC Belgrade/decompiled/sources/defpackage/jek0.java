package defpackage;

import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class jek0 implements hpf0, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad5 b;

    public /* synthetic */ jek0(ad5 ad5Var, int i) {
        this.a = i;
        this.b = ad5Var;
    }

    @Override // defpackage.hpf0
    public final void a(fpf0 fpf0Var) {
        int i = this.a;
        ad5 ad5Var = this.b;
        switch (i) {
            case 0:
                ((gpf0) ((eek0) ad5Var).B.get()).a(fpf0Var, PromoPlaqueAnalytics$Screen.MULTI_ORDER);
                break;
            default:
                ((gpf0) ((ukk0) ad5Var).F.get()).a(fpf0Var, PromoPlaqueAnalytics$Screen.RIDE_CARD);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof hpf0) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof hpf0) && (obj instanceof jms)) {
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
                return new FunctionReferenceImpl(1, (eek0) this.b, eek0.class, "handlePromoPlaqueAction", "handlePromoPlaqueAction(Lcom/yandex/go/taxi/order/api/action/PromoPlaqueAction;)V", 0);
            default:
                return new FunctionReferenceImpl(1, (ukk0) this.b, ukk0.class, "handlePromoPlaqueAction", "handlePromoPlaqueAction(Lcom/yandex/go/taxi/order/api/action/PromoPlaqueAction;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
