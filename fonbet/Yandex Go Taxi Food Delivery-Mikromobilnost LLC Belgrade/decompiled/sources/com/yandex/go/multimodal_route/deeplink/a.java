package com.yandex.go.multimodal_route.deeplink;

import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderDto;
import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderPartDto;
import defpackage.evu0;
import defpackage.gs40;
import defpackage.hs40;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.m950;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.q911;
import defpackage.s730;
import defpackage.v770;
import defpackage.xes0;
import defpackage.yu40;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes8.dex */
public final class a extends hs40 {
    public final yvf0 b;
    public final p c;
    public final xes0 d;
    public final yu40 e;
    public final n20 f;

    public a(s730 s730Var, p pVar, xes0 xes0Var, yu40 yu40Var, n20 n20Var) {
        this.b = s730Var;
        this.c = pVar;
        this.d = xes0Var;
        this.e = yu40Var;
        this.f = n20Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (gs40) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6 A[EDGE_INSN: B:28:0x00f6->B:23:0x00f6 BREAK  A[LOOP:0: B:12:0x00ce->B:26:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, gs40 gs40Var, ContinuationImpl continuationImpl) {
        MultimodalRouteDeeplinkHandler$handleDeeplink$1 multimodalRouteDeeplinkHandler$handleDeeplink$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        SimpleSpinnerModalView simpleSpinnerModalView;
        Object k;
        String str;
        oep0 oep0Var2;
        String str2;
        MultimodalRoutesOrderDto multimodalRoutesOrderDto;
        Iterator it;
        MultimodalRoutesOrderPartDto b;
        if (continuationImpl instanceof MultimodalRouteDeeplinkHandler$handleDeeplink$1) {
            multimodalRouteDeeplinkHandler$handleDeeplink$1 = (MultimodalRouteDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = multimodalRouteDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRouteDeeplinkHandler$handleDeeplink$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteDeeplinkHandler$handleDeeplink$1.label;
                Object obj2 = null;
                if (i != 0) {
                    b.b(obj);
                    SimpleSpinnerModalView a = this.d.a();
                    multimodalRouteDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    multimodalRouteDeeplinkHandler$handleDeeplink$1.L$1 = gs40Var;
                    multimodalRouteDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    multimodalRouteDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    multimodalRouteDeeplinkHandler$handleDeeplink$1.L$4 = a;
                    multimodalRouteDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.c.c(multimodalRouteDeeplinkHandler$handleDeeplink$1) != coroutineSingletons) {
                        simpleSpinnerModalView = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) multimodalRouteDeeplinkHandler$handleDeeplink$1.L$8;
                    multimodalRoutesOrderDto = (MultimodalRoutesOrderDto) multimodalRouteDeeplinkHandler$handleDeeplink$1.L$7;
                    str = (String) multimodalRouteDeeplinkHandler$handleDeeplink$1.L$6;
                    simpleSpinnerModalView = (SimpleSpinnerModalView) multimodalRouteDeeplinkHandler$handleDeeplink$1.L$4;
                    oep0Var2 = (oep0) multimodalRouteDeeplinkHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                    it = ((Iterable) obj).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (jl40.l(((o2y0) next).b().a, (multimodalRoutesOrderDto == null || (b = multimodalRoutesOrderDto.getB()) == null) ? null : b.getB())) {
                            obj2 = next;
                            break;
                        }
                    }
                    simpleSpinnerModalView.dismiss();
                    ((pep0) oep0Var2).f((m950) this.b.get(), new q911((o2y0) obj2, str, str2, false), hxx.a);
                    return zy11.a;
                }
                SimpleSpinnerModalView simpleSpinnerModalView2 = (SimpleSpinnerModalView) multimodalRouteDeeplinkHandler$handleDeeplink$1.L$4;
                gs40Var = (gs40) multimodalRouteDeeplinkHandler$handleDeeplink$1.L$1;
                oep0 oep0Var3 = (oep0) multimodalRouteDeeplinkHandler$handleDeeplink$1.L$0;
                b.b(obj);
                simpleSpinnerModalView = simpleSpinnerModalView2;
                oep0Var = oep0Var3;
                String Q = evu0.Q("mm_route_", gs40Var.a());
                MultimodalRoutesOrderDto c = this.e.c(Q);
                String b2 = gs40Var.b();
                multimodalRouteDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                multimodalRouteDeeplinkHandler$handleDeeplink$1.L$1 = null;
                multimodalRouteDeeplinkHandler$handleDeeplink$1.L$2 = null;
                multimodalRouteDeeplinkHandler$handleDeeplink$1.L$3 = null;
                multimodalRouteDeeplinkHandler$handleDeeplink$1.L$4 = simpleSpinnerModalView;
                multimodalRouteDeeplinkHandler$handleDeeplink$1.L$5 = null;
                multimodalRouteDeeplinkHandler$handleDeeplink$1.L$6 = Q;
                multimodalRouteDeeplinkHandler$handleDeeplink$1.L$7 = c;
                multimodalRouteDeeplinkHandler$handleDeeplink$1.L$8 = b2;
                multimodalRouteDeeplinkHandler$handleDeeplink$1.label = 2;
                k = ((com.yandex.go.taxi.order.provider.a) this.f).k(multimodalRouteDeeplinkHandler$handleDeeplink$1);
                if (k != coroutineSingletons) {
                    str = Q;
                    obj = k;
                    oep0Var2 = oep0Var;
                    str2 = b2;
                    multimodalRoutesOrderDto = c;
                    it = ((Iterable) obj).iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    simpleSpinnerModalView.dismiss();
                    ((pep0) oep0Var2).f((m950) this.b.get(), new q911((o2y0) obj2, str, str2, false), hxx.a);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        multimodalRouteDeeplinkHandler$handleDeeplink$1 = new MultimodalRouteDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj3 = multimodalRouteDeeplinkHandler$handleDeeplink$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteDeeplinkHandler$handleDeeplink$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        String Q2 = evu0.Q("mm_route_", gs40Var.a());
        MultimodalRoutesOrderDto c2 = this.e.c(Q2);
        String b22 = gs40Var.b();
        multimodalRouteDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
        multimodalRouteDeeplinkHandler$handleDeeplink$1.L$1 = null;
        multimodalRouteDeeplinkHandler$handleDeeplink$1.L$2 = null;
        multimodalRouteDeeplinkHandler$handleDeeplink$1.L$3 = null;
        multimodalRouteDeeplinkHandler$handleDeeplink$1.L$4 = simpleSpinnerModalView;
        multimodalRouteDeeplinkHandler$handleDeeplink$1.L$5 = null;
        multimodalRouteDeeplinkHandler$handleDeeplink$1.L$6 = Q2;
        multimodalRouteDeeplinkHandler$handleDeeplink$1.L$7 = c2;
        multimodalRouteDeeplinkHandler$handleDeeplink$1.L$8 = b22;
        multimodalRouteDeeplinkHandler$handleDeeplink$1.label = 2;
        k = ((com.yandex.go.taxi.order.provider.a) this.f).k(multimodalRouteDeeplinkHandler$handleDeeplink$1);
        if (k != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
