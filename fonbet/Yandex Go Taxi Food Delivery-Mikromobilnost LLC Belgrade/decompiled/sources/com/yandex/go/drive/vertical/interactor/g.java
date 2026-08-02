package com.yandex.go.drive.vertical.interactor;

import com.yandex.go.address.models.Address;
import defpackage.avj0;
import defpackage.cwb;
import defpackage.dwb;
import defpackage.evu0;
import defpackage.ihc0;
import defpackage.j0g;
import defpackage.jhc0;
import defpackage.jst;
import defpackage.khs0;
import defpackage.kyh0;
import defpackage.lct0;
import defpackage.mct0;
import defpackage.ny61;
import defpackage.o5v;
import defpackage.oox0;
import defpackage.pdc;
import defpackage.pex0;
import defpackage.pox0;
import defpackage.pqk0;
import defpackage.q5z;
import defpackage.ufu;
import defpackage.unr0;
import defpackage.uqk0;
import defpackage.vpr;
import defpackage.vqk0;
import defpackage.wiq0;
import defpackage.z4m0;
import defpackage.zuj0;
import defpackage.zxs0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.design.sourcedestination.DestinationTrailMode;

/* loaded from: classes6.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ z4m0 b;

    public g(vpr vprVar, z4m0 z4m0Var) {
        this.a = vprVar;
        this.b = z4m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1 sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1;
        int i;
        boolean z;
        pqk0 pqk0Var;
        if (continuation instanceof SourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1) {
            sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1 = (SourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    z4m0 z4m0Var = this.b;
                    j0g j0gVar = (j0g) z4m0Var.A;
                    mct0 mct0Var = mct0.m;
                    lct0 lct0Var = new lct0();
                    zxs0 zxs0Var = (zxs0) z4m0Var.z;
                    wiq0 wiq0Var = (wiq0) zxs0Var.a;
                    cwb cwbVar = (cwb) zxs0Var.b;
                    pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).m();
                    lct0Var.a = m != null ? m.B0.a : false ? q5z.x(((dwb) cwbVar).d()) : q5z.F(((dwb) cwbVar).d());
                    Address d = ((dwb) cwbVar).d();
                    boolean z2 = d == null;
                    pex0 m2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) ((wiq0) zxs0Var.a)).m();
                    String str = "";
                    lct0Var.b = (!z2 && (m2 != null ? m2.B0.a : false)) ? q5z.F(d) : "";
                    dwb dwbVar = (dwb) ((cwb) j0gVar.b);
                    if (dwbVar.a().isEmpty()) {
                        z = false;
                    } else {
                        Address address = (Address) dwbVar.a().get(0);
                        z = q5z.x(address).equals(q5z.F(address));
                    }
                    pex0 m3 = ((com.yandex.go.taxi.tariffs.internal.repository.k) ((wiq0) j0gVar.a)).m();
                    boolean z3 = m3 != null ? m3.B0.a : false;
                    if (z3 && j0gVar.v() && dwbVar.c()) {
                        str = j0g.g(dwbVar.a());
                    } else if ((!z3 || !j0gVar.v() || !dwbVar.b()) && ((!z3 || !j0gVar.v() || !z) && z3 && j0gVar.v())) {
                        str = j0g.g(dwbVar.a());
                    }
                    lct0Var.e = str;
                    List list = ((com.yandex.go.route.interactor.c) z4m0Var.y).c().b;
                    if (list.isEmpty()) {
                        lct0Var.b(null);
                    } else if (list.size() == 1) {
                        lct0Var.b(j0gVar.t());
                    } else {
                        String t = j0gVar.t();
                        int size = list.size();
                        lct0Var.d = t;
                        lct0Var.l = size;
                    }
                    lct0Var.g = ((avj0) ((zuj0) z4m0Var.c)).h(kyh0.summary_destination_prompt);
                    lct0Var.f = DestinationTrailMode.NONE;
                    pex0 m4 = ((com.yandex.go.taxi.tariffs.internal.repository.k) ((wiq0) z4m0Var.x)).m();
                    if (m4 != null) {
                        oox0 oox0Var = m4.r;
                        String str2 = oox0Var.a;
                        lct0Var.i = (str2 == null || evu0.J(str2)) ? null : oox0Var.a;
                        pox0 pox0Var = oox0Var.c;
                        lct0Var.j = pox0Var.a;
                        pdc pdcVar = (pdc) z4m0Var.b;
                        if (pox0Var instanceof jhc0) {
                            pqk0Var = ihc0.a;
                        } else if (pox0Var instanceof khs0) {
                            pqk0Var = new uqk0(null);
                        } else if (pox0Var instanceof o5v) {
                            o5v o5vVar = (o5v) pox0Var;
                            ufu ufuVar = (ufu) pdcVar;
                            pqk0Var = new vqk0(null, ufuVar.e(o5vVar.b), ufuVar.i(o5vVar.c), ufuVar.i(o5vVar.d));
                        } else {
                            unr0.z(jst.e, "Unknown tariff ride info appearance type");
                            pqk0Var = ihc0.a;
                        }
                        lct0Var.k = pqk0Var;
                    }
                    mct0 a = lct0Var.a();
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1 = new SourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
