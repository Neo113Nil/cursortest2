package com.yandex.go.superapp.order_tracking.eats.presentation.ui.overlay;

import defpackage.f190;
import defpackage.g190;
import defpackage.h190;
import defpackage.h2f;
import defpackage.ny61;
import defpackage.ren;
import defpackage.ten;
import defpackage.vpr;
import defpackage.xfn;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h2f b;

    public b(vpr vprVar, h2f h2fVar) {
        this.a = vprVar;
        this.b = h2fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00df, code lost:
    
        if (r11.emit(r13, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CourierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof CourierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) {
            courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 = (CourierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$4 = vprVar2;
                    courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                    courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
                    courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    this.b.getClass();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (ren renVar : (List) obj) {
                        ten tenVar = renVar.k;
                        if (tenVar != null) {
                            arrayList.add(new f190(tenVar.a, tenVar.d, tenVar.b));
                        }
                        zzs zzsVar = renVar.n;
                        if (zzsVar != null) {
                            arrayList2.add(new g190(zzsVar, renVar.o));
                        }
                        zzs zzsVar2 = renVar.l;
                        if (zzsVar2 != null) {
                            arrayList3.add(new h190(renVar.m, zzsVar2, renVar.b));
                        }
                    }
                    xfn xfnVar = new xfn(arrayList, arrayList3, arrayList2);
                    if (xfnVar != coroutineSingletons) {
                        vprVar = vprVar2;
                        obj2 = xfnVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
                courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
            }
        }
        courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 = new CourierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
        courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
        courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
        courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
        courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
        courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
        courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
        courierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
    }
}
