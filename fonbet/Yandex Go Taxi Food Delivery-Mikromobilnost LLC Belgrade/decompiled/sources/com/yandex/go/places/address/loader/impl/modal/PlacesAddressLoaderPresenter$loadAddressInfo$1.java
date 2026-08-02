package com.yandex.go.places.address.loader.impl.modal;

import defpackage.da0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.t71;
import defpackage.tje;
import defpackage.tse;
import defpackage.u4c0;
import defpackage.uyj;
import defpackage.w4c0;
import defpackage.wls;
import defpackage.z4c0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.address.loader.impl.modal.PlacesAddressLoaderPresenter$loadAddressInfo$1", f = "PlacesAddressLoaderPresenter.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PlacesAddressLoaderPresenter$loadAddressInfo$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ w4c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesAddressLoaderPresenter$loadAddressInfo$1(w4c0 w4c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = w4c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesAddressLoaderPresenter$loadAddressInfo$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesAddressLoaderPresenter$loadAddressInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.C.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            PlacesAddressLoaderPresenter$loadAddressInfo$1$addressInfo$1 placesAddressLoaderPresenter$loadAddressInfo$1$addressInfo$1 = new PlacesAddressLoaderPresenter$loadAddressInfo$1$addressInfo$1(this.this$0, null);
            this.label = 1;
            obj = tje.k0(mdhVar, placesAddressLoaderPresenter$loadAddressInfo$1$addressInfo$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        pv0 pv0Var = (pv0) obj;
        w4c0 w4c0Var = this.this$0;
        if (pv0Var != null) {
            ((da0) w4c0Var.A.a).r(new t71(pv0Var, 14));
        } else {
            ((u4c0) w4c0Var.Dg()).render(z4c0.a);
        }
        return zy11.a;
    }
}
