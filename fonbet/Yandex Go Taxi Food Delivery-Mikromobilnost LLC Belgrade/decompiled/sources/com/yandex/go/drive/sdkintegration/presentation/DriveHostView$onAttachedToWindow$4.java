package com.yandex.go.drive.sdkintegration.presentation;

import defpackage.c0g;
import defpackage.idm;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w7j0;
import defpackage.wls;
import defpackage.ydm;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.presentation.DriveHostView$onAttachedToWindow$4", f = "DriveHostView.kt", l = {204}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class DriveHostView$onAttachedToWindow$4 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ DriveHostView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveHostView$onAttachedToWindow$4(DriveHostView driveHostView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = driveHostView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveHostView$onAttachedToWindow$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveHostView$onAttachedToWindow$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        idm idmVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            idmVar = this.this$0.driveDependencies;
            n0 n0Var = ((w7j0) ((c0g) idmVar).J0.get()).a;
            ydm ydmVar = new ydm(this.this$0, 0);
            this.label = 1;
            n0Var.getClass();
            if (n0.m(n0Var, ydmVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ny61.A();
        return null;
    }
}
