package xsna;

import android.content.Context;
import com.vk.dto.common.im.ImageList;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallHighlightItem;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vk.voip.userid.CallsUserId;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.fxw0;
import xsna.tww0;

/* compiled from: VoipScheduleCallReducer.kt */
/* loaded from: classes7.dex */
public final class www0 extends dm50<VoipScheduleCallViewState, tww0, fxw0> {
    public final Context d;
    public final kww0 e;
    public final long f;
    public final long g;

    public www0(Context context, lnw0 lnw0Var, kcx0 kcx0Var) {
        super(fxw0.d.b);
        this.d = context;
        this.e = lnw0Var;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f = timeUnit.toMillis(30L);
        this.g = timeUnit.toMillis(5L);
    }

    public static fxw0 i(fxw0 fxw0Var, izs izsVar) {
        fxw0.a aVar;
        fxw0.a aVar2 = fxw0Var instanceof fxw0.a ? (fxw0.a) fxw0Var : null;
        return (aVar2 == null || (aVar = (fxw0.a) izsVar.invoke(aVar2)) == null) ? fxw0Var : aVar;
    }

    @Override // xsna.dm50
    public final fxw0 c(fxw0 fxw0Var, tww0 tww0Var) {
        fxw0 fxw0Var2 = fxw0Var;
        tww0 tww0Var2 = tww0Var;
        if (tww0Var2 instanceof tww0.j) {
            tww0.j jVar = (tww0.j) tww0Var2;
            if (jVar instanceof tww0.j.b) {
                return fxw0.f.b;
            }
            if (jVar instanceof tww0.j.c) {
                return fxw0.e.b;
            }
            if (jVar instanceof tww0.j.a) {
                return new fxw0.b(((tww0.j.a) jVar).b);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (tww0Var2 instanceof tww0.k) {
            tww0.k kVar = (tww0.k) tww0Var2;
            if (kVar instanceof tww0.k.b) {
                return fxw0.c.b;
            }
            if (!(kVar instanceof tww0.k.c)) {
                if (!(kVar instanceof tww0.k.d)) {
                    if (kVar instanceof tww0.k.a) {
                        return new fxw0.b(((tww0.k.a) kVar).b);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                tww0.k.d dVar = (tww0.k.d) kVar;
                x5h0 x5h0Var = dVar.d;
                CallId callId = x5h0Var.a;
                CallsUserId callsUserId = x5h0Var.c;
                return new fxw0.a(callId, EmptyList.b, x5h0Var.b, x5h0Var.g, new mvo0(x5h0Var.s), x5h0Var.h, dVar.b, dVar.c, x5h0Var.e, x5h0Var.f, com.vk.voip.userid.a.a(callsUserId) ? new fxw0.a.AbstractC2899a.b(new rww0(callsUserId, x5h0Var.d, new ImageList(null, 1, null), false)) : fxw0.a.AbstractC2899a.C2900a.a, x5h0Var.k, x5h0Var.m, !x5h0Var.q, x5h0Var.l, x5h0Var.i, x5h0Var.n, x5h0Var.o, x5h0Var.p, x5h0Var.t, x5h0Var.u, x5h0Var.v, 2097152);
            }
            CallId callId2 = CallId.e;
            tww0.k.c cVar = (tww0.k.c) kVar;
            m6h0 m6h0Var = cVar.e;
            List<rww0> list = cVar.b;
            fxw0.a.AbstractC2899a.C2900a c2900a = fxw0.a.AbstractC2899a.C2900a.a;
            boolean z = m6h0Var.a;
            boolean z2 = m6h0Var.b;
            boolean z3 = m6h0Var.c;
            String string = this.d.getString(R.string.voip_schedule_call_default_title);
            long currentTimeMillis = System.currentTimeMillis();
            long millis = TimeUnit.MINUTES.toMillis(30L);
            return new fxw0.a(callId2, list, string, currentTimeMillis + (millis - (currentTimeMillis % millis)), null, this.f, cVar.c, cVar.d, ScheduledCallRecurrence.NEVER, null, c2900a, z, false, z2, z3, null, m6h0Var.d, m6h0Var.e, m6h0Var.f, m6h0Var.g, m6h0Var.h, m6h0Var.i, 2162688);
        }
        if (tww0Var2 instanceof tww0.c) {
            return i(fxw0Var2, new qyi0(this, tww0Var2));
        }
        if (tww0Var2 instanceof tww0.u) {
            return i(fxw0Var2, new fvq0(this, tww0Var2));
        }
        if (tww0Var2 instanceof tww0.v) {
            return i(fxw0Var2, new cim0(this, tww0Var2));
        }
        if (tww0Var2 instanceof tww0.m) {
            fxw0.a aVar = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
            return aVar != null ? fxw0.a.a(aVar, null, null, 0L, 0L, null, null, null, null, false, ((tww0.m) tww0Var2).b, false, false, false, null, null, null, null, false, null, null, false, false, 33550335) : fxw0Var2;
        }
        if (tww0Var2 instanceof tww0.a) {
            return i(fxw0Var2, new r0r0(this, tww0Var2));
        }
        if (tww0Var2 instanceof tww0.i) {
            return i(fxw0Var2, new gqw0(this, tww0Var2));
        }
        if (tww0Var2 instanceof tww0.s) {
            fxw0.a aVar2 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
            return aVar2 != null ? fxw0.a.a(aVar2, null, null, 0L, 0L, ((tww0.s) tww0Var2).b, null, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33554367) : fxw0Var2;
        }
        if (tww0Var2 instanceof tww0.o) {
            fxw0.a aVar3 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
            return aVar3 != null ? fxw0.a.a(aVar3, null, null, 0L, 0L, null, ((tww0.o) tww0Var2).b, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33554175) : fxw0Var2;
        }
        if (tww0Var2 instanceof tww0.n) {
            fxw0.a aVar4 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
            return aVar4 != null ? fxw0.a.a(aVar4, null, null, 0L, 0L, null, null, ((tww0.n) tww0Var2).b, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33553919) : fxw0Var2;
        }
        if (tww0Var2 instanceof tww0.q) {
            fxw0.a aVar5 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
            return aVar5 != null ? fxw0.a.a(aVar5, null, null, ((tww0.q) tww0Var2).b, 0L, null, null, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33554423) : fxw0Var2;
        }
        if (tww0Var2 instanceof tww0.p) {
            return i(fxw0Var2, new js00(16, this, tww0Var2));
        }
        if (tww0Var2 instanceof tww0.e) {
            fxw0.a aVar6 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
            return aVar6 != null ? fxw0.a.a(aVar6, null, ((tww0.e) tww0Var2).b, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33554427) : fxw0Var2;
        }
        if (tww0Var2 instanceof tww0.f) {
            fxw0.a aVar7 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
            return aVar7 != null ? fxw0.a.a(aVar7, null, null, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, null, null, ((tww0.f) tww0Var2).b, null, null, false, false, 32505855) : fxw0Var2;
        }
        if (tww0Var2 instanceof tww0.l) {
            return i(fxw0Var2, new mmm0(this, tww0Var2));
        }
        if (tww0Var2 instanceof tww0.b) {
            fxw0.a aVar8 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
            return aVar8 != null ? fxw0.a.a(aVar8, null, null, 0L, 0L, null, null, null, null, false, false, false, false, false, null, ((tww0.b) tww0Var2).b, null, null, false, null, null, false, false, 33423359) : fxw0Var2;
        }
        if (tww0Var2 instanceof tww0.t) {
            fxw0.a aVar9 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
            return aVar9 != null ? fxw0.a.a(aVar9, null, null, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, ((tww0.t) tww0Var2).b, null, false, null, null, false, false, 33292287) : fxw0Var2;
        }
        if (tww0Var2 instanceof tww0.d) {
            return i(fxw0Var2, new uww0(this, tww0Var2));
        }
        if (tww0Var2 instanceof tww0.g) {
            fxw0.a aVar10 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
            return aVar10 != null ? fxw0.a.a(aVar10, null, null, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, null, null, false, ScheduledCallHighlightItem.NAME, null, false, false, 30408703) : fxw0Var2;
        }
        if (tww0Var2.equals(tww0.h.b)) {
            fxw0.a aVar11 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
            return aVar11 != null ? fxw0.a.a(aVar11, null, null, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 31457279) : fxw0Var2;
        }
        if (!(tww0Var2 instanceof tww0.r)) {
            throw new NoWhenBranchMatchedException();
        }
        fxw0.a aVar12 = fxw0Var2 instanceof fxw0.a ? (fxw0.a) fxw0Var2 : null;
        if (aVar12 == null) {
            return fxw0Var2;
        }
        m6h0 m6h0Var2 = ((tww0.r) tww0Var2).b;
        return fxw0.a.a(aVar12, null, null, 0L, 0L, null, null, null, null, m6h0Var2.a, false, m6h0Var2.b, m6h0Var2.c, false, null, m6h0Var2.d, m6h0Var2.e, m6h0Var2.f, false, null, m6h0Var2.g, m6h0Var2.h, m6h0Var2.i, 3250175);
    }

    @Override // xsna.dm50
    public final VoipScheduleCallViewState d() {
        return new VoipScheduleCallViewState(e(new wlw0(this, 3)));
    }

    @Override // xsna.dm50
    public final void h(fxw0 fxw0Var, VoipScheduleCallViewState voipScheduleCallViewState) {
        f(voipScheduleCallViewState.a, fxw0Var);
    }
}
