package com.yandex.go.ui;

import android.net.Uri;
import defpackage.hst;
import defpackage.jst;
import defpackage.ks7;
import defpackage.mr7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w8v;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ui.CameraPresenter$takePhoto$1", f = "CameraPresenter.kt", l = {20}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CameraPresenter$takePhoto$1 extends SuspendLambda implements wls {
    final /* synthetic */ w8v $imageCapture;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ks7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPresenter$takePhoto$1(ks7 ks7Var, w8v w8vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ks7Var;
        this.$imageCapture = w8vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CameraPresenter$takePhoto$1(this.this$0, this.$imageCapture, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CameraPresenter$takePhoto$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [zc5] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ks7] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ks7, zc5] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r1;
        ks7 ks7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ?? r12 = this.this$0;
                w8v w8vVar = this.$imageCapture;
                com.yandex.go.data.repositories.a aVar = r12.x;
                this.L$0 = r12;
                this.L$1 = r12;
                this.label = 1;
                obj = aVar.a(w8vVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ks7Var = r12;
                i = r12;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ?? r13 = (ks7) this.L$1;
                ks7Var = (ks7) this.L$0;
                try {
                    kotlin.b.b(obj);
                    i = r13;
                } finally {
                    ((mr7) r13.Dg()).setProgress(false);
                }
            }
            ((mr7) ks7Var.Dg()).showPreview((Uri) obj);
            r1 = i;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            hst hstVar = jst.e;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            xby.l(hstVar, "USER_PHOTO_UPLOAD:USER_PHOTO_CAMERA_ERROR", null, th, message, 2);
            r1 = i;
        }
        return zy11.a;
    }
}
