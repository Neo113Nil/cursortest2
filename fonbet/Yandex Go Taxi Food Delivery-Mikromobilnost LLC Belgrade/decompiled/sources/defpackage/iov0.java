package defpackage;

import com.yandex.go.taxi.summary.api.repository.SummaryRouterType;
import com.yandex.go.taxi.summary.shared.analytics.TrapModeCloseReason;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class iov0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ jov0 b;

    public /* synthetic */ iov0(jov0 jov0Var, int i) {
        this.a = i;
        this.b = jov0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        jov0 jov0Var = this.b;
        switch (i) {
            case 0:
                jov0Var.J.a(TrapModeCloseReason.UNKNOWN);
                break;
            default:
                SummaryRouterType summaryRouterType = (SummaryRouterType) obj;
                if (summaryRouterType != jov0Var.b0.getValue()) {
                    jov0Var.b0.l(summaryRouterType);
                    jov0Var.W.b("SummaryType.Changed", g8e.z("summary_type", summaryRouterType.getText()));
                    biv0 biv0Var = jov0Var.E;
                    bov0 a = biv0Var.a();
                    biv0Var.b.l(new bov0(false, (khv0) null, a != null ? a.c : null, 10));
                    jov0Var.P();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
