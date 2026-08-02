package defpackage;

import java.util.Collections;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.requirements.analytics.RequirementRemoveSource;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes6.dex */
public final class oo6 {
    public final SummaryStateTracker a;
    public final ajj0 b;
    public final ldj0 c;
    public final bxi0 d;
    public final f580 e;

    public oo6(SummaryStateTracker summaryStateTracker, ajj0 ajj0Var, ldj0 ldj0Var, bxi0 bxi0Var, f580 f580Var) {
        this.a = summaryStateTracker;
        this.b = ajj0Var;
        this.c = ldj0Var;
        this.d = bxi0Var;
        this.e = f580Var;
    }

    public final void a(ndj0 ndj0Var) {
        String str = ndj0Var.b;
        String str2 = ndj0Var.a;
        this.e.e(str2, evu0.J(str) ? EmptyList.a : Collections.singletonList(str), RequirementRemoveSource.BUBBLE, null);
        ((yjj0) this.d).a(str2, str, null, "");
    }
}
