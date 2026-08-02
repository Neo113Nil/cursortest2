package com.yandex.go.multimodal_route.ui.detailed_card;

import defpackage.ah00;
import defpackage.b4g;
import defpackage.bvf0;
import defpackage.gh00;
import defpackage.hxx;
import defpackage.mo21;
import defpackage.nc60;
import defpackage.ny61;
import defpackage.oc60;
import defpackage.oep0;
import defpackage.pc60;
import defpackage.pep0;
import defpackage.po21;
import defpackage.v7j0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class g {
    public final ah00 a;
    public final v7j0 b;
    public final po21 c;
    public final b4g d;
    public final oep0 e;
    public final r0 f = bvf0.c(MultimodalRouteFabState.FOCUS_USER_LOCATION);

    public g(ah00 ah00Var, v7j0 v7j0Var, po21 po21Var, b4g b4gVar, oep0 oep0Var) {
        this.a = ah00Var;
        this.b = v7j0Var;
        this.c = po21Var;
        this.d = b4gVar;
        this.e = oep0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MultimodalRouteFocusCoordinator$focusUserLocation$1 multimodalRouteFocusCoordinator$focusUserLocation$1;
        int i;
        boolean booleanValue;
        g gVar;
        if (continuationImpl instanceof MultimodalRouteFocusCoordinator$focusUserLocation$1) {
            multimodalRouteFocusCoordinator$focusUserLocation$1 = (MultimodalRouteFocusCoordinator$focusUserLocation$1) continuationImpl;
            int i2 = multimodalRouteFocusCoordinator$focusUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteFocusCoordinator$focusUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRouteFocusCoordinator$focusUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteFocusCoordinator$focusUserLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    multimodalRouteFocusCoordinator$focusUserLocation$1.label = 1;
                    obj = ((com.yandex.go.permission.b) this.b).d(1, multimodalRouteFocusCoordinator$focusUserLocation$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gVar = (g) multimodalRouteFocusCoordinator$focusUserLocation$1.L$0;
                        kotlin.b.b(obj);
                        ((gh00) gVar.a).D(ru.yandex.taxi.map.utils.a.G((mo21) obj), 17.0f, 300.0f, null);
                        this.f.l(MultimodalRouteFabState.FOCUS_ROUTE);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    ((pep0) this.e).f(((pc60) ((oc60) this.d.get())).b(true), new nc60((String) null), hxx.a);
                    this.f.l(MultimodalRouteFabState.FOCUS_ROUTE);
                    return zy11.a;
                }
                multimodalRouteFocusCoordinator$focusUserLocation$1.L$0 = this;
                multimodalRouteFocusCoordinator$focusUserLocation$1.Z$0 = booleanValue;
                multimodalRouteFocusCoordinator$focusUserLocation$1.label = 2;
                obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.c).f(multimodalRouteFocusCoordinator$focusUserLocation$1);
                if (obj != coroutineSingletons) {
                    gVar = this;
                    ((gh00) gVar.a).D(ru.yandex.taxi.map.utils.a.G((mo21) obj), 17.0f, 300.0f, null);
                    this.f.l(MultimodalRouteFabState.FOCUS_ROUTE);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        multimodalRouteFocusCoordinator$focusUserLocation$1 = new MultimodalRouteFocusCoordinator$focusUserLocation$1(this, continuationImpl);
        Object obj2 = multimodalRouteFocusCoordinator$focusUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteFocusCoordinator$focusUserLocation$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
    }
}
