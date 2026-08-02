package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.address.models.Address;
import defpackage.avj0;
import defpackage.b81;
import defpackage.fcj0;
import defpackage.kyh0;
import defpackage.lct0;
import defpackage.mct0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.q5z;
import defpackage.vpr;
import defpackage.vwm;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.design.sourcedestination.DestinationTrailMode;

/* loaded from: classes14.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ fcj0 b;

    public p(vpr vprVar, fcj0 fcj0Var) {
        this.a = vprVar;
        this.b = fcj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1 sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1;
        int i;
        boolean z;
        mct0 a;
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
                    fcj0 fcj0Var = this.b;
                    com.yandex.go.route.interactor.c cVar = (com.yandex.go.route.interactor.c) fcj0Var.e;
                    Address g = cVar.g();
                    Address d = cVar.d();
                    mct0 mct0Var = mct0.m;
                    lct0 lct0Var = new lct0();
                    vwm vwmVar = (vwm) fcj0Var.c;
                    pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) vwmVar.a).m();
                    b81 b81Var = m != null ? m.B0.a : false ? new b81(q5z.x(g), q5z.F(g)) : new b81(q5z.F(g), 2);
                    lct0Var.a = b81Var.a;
                    lct0Var.b = b81Var.b;
                    List b = cVar.b();
                    if (!(b instanceof Collection) || !b.isEmpty()) {
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            String q0 = ((Address) it.next()).q0();
                            if (q0 == null || q0.length() == 0) {
                                break;
                            }
                        }
                    }
                    List b2 = cVar.b();
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : b2) {
                        if (hashSet.add(((Address) obj3).q0())) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.size() > 1) {
                        z = true;
                        pex0 m2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) vwmVar.a).m();
                        boolean z2 = m2 == null ? m2.B0.a : false;
                        String x = q5z.x(d);
                        b81 b81Var2 = (!z2 && z && (x.length() <= 0 ? x.equals(q5z.F(d)) : false)) ? new b81(q5z.x(d), 2) : (z2 || !z) ? new b81(q5z.F(d), 2) : new b81(q5z.x(d), q5z.F(d));
                        if (cVar.c().b.isEmpty()) {
                            lct0Var.f = DestinationTrailMode.NONE;
                        }
                        lct0Var.b(b81Var2.a);
                        lct0Var.e = b81Var2.b;
                        lct0Var.g = ((avj0) ((zuj0) fcj0Var.b)).h(kyh0.summary_destination_prompt);
                        a = lct0Var.a();
                        sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                        sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                        sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                        sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                        sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                        if (this.a.emit(a, sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    z = false;
                    pex0 m22 = ((com.yandex.go.taxi.tariffs.internal.repository.k) vwmVar.a).m();
                    if (m22 == null) {
                    }
                    String x2 = q5z.x(d);
                    if (!z2) {
                    }
                    if (cVar.c().b.isEmpty()) {
                    }
                    lct0Var.b(b81Var2.a);
                    lct0Var.e = b81Var2.b;
                    lct0Var.g = ((avj0) ((zuj0) fcj0Var.b)).h(kyh0.summary_destination_prompt);
                    a = lct0Var.a();
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, sourceDestinationStateInteractor$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
