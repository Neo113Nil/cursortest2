package com.ybsdk.di.modules;

import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.g3d0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.di.modules.DeeplinkModule$providePlusHomeDelegate$1$1", f = "DeeplinkModule.kt", l = {2759}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DeeplinkModule$providePlusHomeDelegate$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ DeeplinkAction.PlusHome $plusHome;
    final /* synthetic */ g3d0 $plusHomeFeature;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkModule$providePlusHomeDelegate$1$1(g3d0 g3d0Var, DeeplinkAction.PlusHome plusHome, Continuation continuation) {
        super(2, continuation);
        this.$plusHomeFeature = g3d0Var;
        this.$plusHome = plusHome;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeeplinkModule$providePlusHomeDelegate$1$1(this.$plusHomeFeature, this.$plusHome, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeeplinkModule$providePlusHomeDelegate$1$1 deeplinkModule$providePlusHomeDelegate$1$1 = (DeeplinkModule$providePlusHomeDelegate$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deeplinkModule$providePlusHomeDelegate$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.$plusHomeFeature.getClass();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
