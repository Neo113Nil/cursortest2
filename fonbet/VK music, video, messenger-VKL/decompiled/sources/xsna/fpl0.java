package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.stat.scheme.CommonMarketStat$TypeCtaButtonPositionType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.dpl0;
import xsna.jm50;
import xsna.oml0;
import xsna.r1r0;
import xsna.xll0;
import xsna.yqu;

/* compiled from: StorefrontTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class fpl0 extends evg0<apl0, on50, dpl0, dpl0, oml0, xll0> {
    public final lml0 f;

    public fpl0(lml0 lml0Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = lml0Var;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        List<b5u> list;
        List<b5u> list2;
        dpl0 dpl0Var = (dpl0) hn50Var;
        boolean z = dpl0Var instanceof dpl0.b;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        Object obj = null;
        lml0 lml0Var = this.f;
        if (z) {
            b5u b5uVar = ((dpl0.b) dpl0Var).b;
            t8u t8uVar = ((apl0) nn50Var.getCurrentState()).f;
            if (t8uVar != null && (list2 = t8uVar.a) != null) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((b5u) next).a.b == b5uVar.a.b) {
                        obj = next;
                        break;
                    }
                }
                b5u b5uVar2 = (b5u) obj;
                if (b5uVar2 != null) {
                    b5uVar = b5uVar2;
                }
                lml0Var.getClass();
                return g(new io.reactivex.rxjava3.internal.operators.single.b(new wll(b5uVar, lml0Var, list2)), new cp50(this, 15), new o330(this, 15));
            }
        } else {
            if (dpl0Var instanceof dpl0.a) {
                e(new oml0.f(((dpl0.a) dpl0Var).b));
                return null;
            }
            if (dpl0Var instanceof dpl0.d) {
                return s(oml0.n.a);
            }
            if (dpl0Var instanceof dpl0.g) {
                return g(rsg0.w0(yfb.x(lml0Var.b.a.f(qml0.g))), new j3z(this, 19), new ljs(this, 27));
            }
            if (dpl0Var instanceof dpl0.h) {
                return g(rsg0.w0(yfb.x(yqu.a.c(lml0Var.b.b, fkq0.a(lml0Var.a), null, qml0.i, null, null, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE))).l(new s1j0(new l140(17), 3)), new pdw(this, 25), new lkz(this, 19));
            }
            if (dpl0Var instanceof dpl0.i) {
                dpl0.i iVar = (dpl0.i) dpl0Var;
                return g(rsg0.w0(yfb.x(yqu.a.e(lml0Var.b.b, fkq0.a(lml0Var.a), iVar.c, qml0.i, null, null, 120))).l(new z8(new cd10(18), 28)), new lw30(this, 13), new ir60(1, iVar, this));
            }
            if (dpl0Var instanceof dpl0.f) {
                return s(oml0.k.a.a);
            }
            if (dpl0Var instanceof dpl0.c) {
                t8u t8uVar2 = ((apl0) nn50Var.getCurrentState()).f;
                if (t8uVar2 != null && (list = t8uVar2.a) != null) {
                    lml0Var.getClass();
                    return g(new io.reactivex.rxjava3.internal.operators.single.v(new tpa(3, list, lml0Var)), new b0y(this, 25), new fsq(this, 27));
                }
            } else {
                if (dpl0Var instanceof dpl0.k) {
                    dpl0.k kVar = (dpl0.k) dpl0Var;
                    ja9 ja9Var = kVar.b;
                    final CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType = kVar.c;
                    return g(rsg0.w0(yfb.x(r1r0.a.b(lml0Var.b.c, Collections.singletonList(ja9Var.c), qml0.h, null, null, 58))).l(new si60(new ev60(12), 6)), new rt10(this, 15), new io.reactivex.rxjava3.functions.f() { // from class: xsna.epl0
                        @Override // io.reactivex.rxjava3.functions.f
                        public final void accept(Object obj2) {
                            fpl0.this.c(new xll0.a.b.c((UsersUserFullDto) obj2, commonMarketStat$TypeCtaButtonPositionType));
                        }
                    });
                }
                if (dpl0Var instanceof dpl0.e) {
                    t8u t8uVar3 = ((apl0) nn50Var.getCurrentState()).f;
                    int i = t8uVar3 != null ? t8uVar3.c : 0;
                    return g(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(xd10.A(lml0Var.b.a, lml0Var.a, null, 20, Integer.valueOf(i), qml0.e, 498))).l(new zj0(new rj60(lml0Var, 26), 28)), new cl30(new arb0(this, 21), 12)), new skz(this, 28), new bqs(this, 28));
                }
                if (dpl0Var instanceof dpl0.j) {
                    List<w4p0> list3 = ((apl0) nn50Var.getCurrentState()).h;
                    HintId hintId = ((dpl0.j) dpl0Var).b;
                    lml0Var.getClass();
                    return g(new io.reactivex.rxjava3.internal.operators.single.b(new lph(3, list3, hintId)), io.reactivex.rxjava3.internal.functions.a.f, new bdz(this, 22));
                }
            }
        }
        return null;
    }

    public final zvg0 s(oml0 oml0Var) {
        lml0 lml0Var = this.f;
        qml0 qml0Var = lml0Var.b;
        UserId userId = lml0Var.a;
        yd10 yd10Var = qml0Var.a;
        return g(new io.reactivex.rxjava3.internal.operators.single.n(io.reactivex.rxjava3.core.x.B(rsg0.w0(yfb.x(yd10Var.i(userId, qml0.d))), rsg0.w0(yfb.x(yd10Var.f(qml0.f))), new n5j0(new hd4(lml0Var, 8), 1)), new hdi0(new b7(29, this, oml0Var), 1)), new h4f0(this, 4), new fl30(this, 24));
    }
}
