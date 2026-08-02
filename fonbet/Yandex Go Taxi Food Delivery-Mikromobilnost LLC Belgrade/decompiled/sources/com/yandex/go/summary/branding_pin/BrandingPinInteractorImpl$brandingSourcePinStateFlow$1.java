package com.yandex.go.summary.branding_pin;

import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rj6;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfnx0;", "tariffSelection", "", "hasText", "Lrj6;", "<anonymous>", "(Lfnx0;Z)Lrj6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.branding_pin.BrandingPinInteractorImpl$brandingSourcePinStateFlow$1", f = "BrandingPinInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BrandingPinInteractorImpl$brandingSourcePinStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandingPinInteractorImpl$brandingSourcePinStateFlow$1(i iVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        BrandingPinInteractorImpl$brandingSourcePinStateFlow$1 brandingPinInteractorImpl$brandingSourcePinStateFlow$1 = new BrandingPinInteractorImpl$brandingSourcePinStateFlow$1(this.this$0, (Continuation) obj3);
        brandingPinInteractorImpl$brandingSourcePinStateFlow$1.L$0 = (fnx0) obj;
        brandingPinInteractorImpl$brandingSourcePinStateFlow$1.Z$0 = booleanValue;
        return brandingPinInteractorImpl$brandingSourcePinStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z) {
            return i.a(this.this$0, fnx0Var.c);
        }
        rj6 rj6Var = rj6.e;
        return rj6.e;
    }
}
