package defpackage;

import com.yandex.go.flex.common.analytics.models.AdjustEventPayload;
import com.yandex.go.flex.common.analytics.models.Revenue;
import kotlin.Result;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes5.dex */
public final class fa1 implements jv2 {
    public final wnt a;
    public final lx4 b;

    public fa1(lx4 lx4Var, wnt wntVar) {
        this.a = wntVar;
        this.b = lx4Var;
    }

    @Override // defpackage.e52
    public final void a(String str, c cVar) {
        Object failure;
        Revenue revenue;
        try {
            failure = (AdjustEventPayload) ((xnt) this.a).d(cVar, AdjustEventPayload.Companion.serializer());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        AdjustEventPayload adjustEventPayload = (AdjustEventPayload) failure;
        jx4 jx4Var = new jx4(str);
        jx4Var.b = adjustEventPayload != null ? adjustEventPayload.b : null;
        jx4Var.c = adjustEventPayload != null ? adjustEventPayload.c : null;
        if (adjustEventPayload != null && (revenue = adjustEventPayload.f) != null) {
            jx4Var.d = new ix4(revenue.a, revenue.b);
        }
        jx4Var.e = adjustEventPayload != null ? adjustEventPayload.d : null;
        jx4Var.f = adjustEventPayload != null ? adjustEventPayload.e : null;
        ((j) this.b).i().a(jx4Var);
    }
}
