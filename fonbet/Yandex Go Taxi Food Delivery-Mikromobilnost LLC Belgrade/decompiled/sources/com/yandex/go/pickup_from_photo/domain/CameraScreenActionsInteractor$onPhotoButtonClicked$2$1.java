package com.yandex.go.pickup_from_photo.domain;

import defpackage.aob0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omb0;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.domain.CameraScreenActionsInteractor$onPhotoButtonClicked$2$1", f = "CameraScreenActionsInteractor.kt", l = {162}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CameraScreenActionsInteractor$onPhotoButtonClicked$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ aob0 $navigator;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraScreenActionsInteractor$onPhotoButtonClicked$2$1(c cVar, aob0 aob0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$navigator = aob0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraScreenActionsInteractor$onPhotoButtonClicked$2$1(this.this$0, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraScreenActionsInteractor$onPhotoButtonClicked$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        aob0 aob0Var;
        aob0 aob0Var2;
        c cVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                cVar = this.this$0;
                aob0 aob0Var3 = this.$navigator;
                try {
                    i iVar = cVar.e;
                    this.L$0 = cVar;
                    this.L$1 = aob0Var3;
                    this.L$2 = cVar;
                    this.L$3 = aob0Var3;
                    this.label = 1;
                    Object a = iVar.a(this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aob0Var = aob0Var3;
                    aob0Var2 = aob0Var;
                    obj = a;
                    cVar2 = cVar;
                } catch (Throwable th) {
                    th = th;
                    aob0Var = aob0Var3;
                    c.b(cVar, th, aob0Var);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aob0Var = (aob0) this.L$3;
                cVar = (c) this.L$2;
                aob0Var2 = (aob0) this.L$1;
                cVar2 = (c) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    c.b(cVar, th, aob0Var);
                    return zy11.a;
                }
            }
            cVar2.d(new omb0((pv0) obj), aob0Var2);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
