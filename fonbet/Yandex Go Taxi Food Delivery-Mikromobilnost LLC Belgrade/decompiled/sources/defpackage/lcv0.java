package defpackage;

import java.util.HashMap;
import kotlin.text.Regex;
import ru.yandex.taxi.analytics.Events$Summary$SummaryState;

/* loaded from: classes6.dex */
public final class lcv0 {
    public final xcv0 a;
    public final arv0 b;

    public lcv0(xcv0 xcv0Var, arv0 arv0Var) {
        this.a = xcv0Var;
        this.b = arv0Var;
    }

    public final void a() {
        String str = ((a7t0) this.b).a().b;
        xcv0 xcv0Var = this.a;
        HashMap m = nnm.m(xcv0Var, "summary_state", str);
        HashMap hashMap = new HashMap();
        Regex regex = sho.a;
        xcv0Var.a.a(sb2.q("Summary.AddDestination", m), m, 1, hashMap);
    }

    public final void b(Events$Summary$SummaryState events$Summary$SummaryState) {
        String value = events$Summary$SummaryState != null ? events$Summary$SummaryState.getValue() : null;
        xcv0 xcv0Var = this.a;
        HashMap q = tse0.q(xcv0Var);
        if (value != null) {
            q.put("summary_expanding_state", value);
        }
        HashMap hashMap = new HashMap();
        Regex regex = sho.a;
        xcv0Var.a.a(sb2.q("Summary.StartingPoint", q), q, 1, hashMap);
    }
}
