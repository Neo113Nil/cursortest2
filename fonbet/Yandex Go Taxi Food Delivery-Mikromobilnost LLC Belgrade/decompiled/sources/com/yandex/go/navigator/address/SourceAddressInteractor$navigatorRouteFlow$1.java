package com.yandex.go.navigator.address;

import android.graphics.drawable.Drawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pe50;
import defpackage.qe50;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpe50;", "route", "Lkotlin/Pair;", "Landroid/graphics/drawable/Drawable;", "<destruct>", "Lqe50;", "<anonymous>", "(Lpe50;Lkotlin/Pair;)Lqe50;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.address.SourceAddressInteractor$navigatorRouteFlow$1", f = "SourceAddressInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SourceAddressInteractor$navigatorRouteFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SourceAddressInteractor$navigatorRouteFlow$1 sourceAddressInteractor$navigatorRouteFlow$1 = new SourceAddressInteractor$navigatorRouteFlow$1(3, (Continuation) obj3);
        sourceAddressInteractor$navigatorRouteFlow$1.L$0 = (pe50) obj;
        sourceAddressInteractor$navigatorRouteFlow$1.L$1 = (Pair) obj2;
        return sourceAddressInteractor$navigatorRouteFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pe50 pe50Var = (pe50) this.L$0;
        Pair pair = (Pair) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new qe50(pe50Var, (Drawable) pair.getFirst(), (Drawable) pair.getSecond(), null);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
