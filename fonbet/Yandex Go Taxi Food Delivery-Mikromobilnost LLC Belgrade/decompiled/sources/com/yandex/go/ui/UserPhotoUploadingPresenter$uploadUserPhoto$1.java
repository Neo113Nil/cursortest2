package com.yandex.go.ui;

import android.net.Uri;
import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xq21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ui.UserPhotoUploadingPresenter$uploadUserPhoto$1", f = "UserPhotoUploadingPresenter.kt", l = {327, 330, 331, 333, 333}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UserPhotoUploadingPresenter$uploadUserPhoto$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $photoUri;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoUploadingPresenter$uploadUserPhoto$1(d dVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$photoUri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserPhotoUploadingPresenter$uploadUserPhoto$1(this.this$0, this.$photoUri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserPhotoUploadingPresenter$uploadUserPhoto$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r10.a(r5, r1, r9) != r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        if (r10 == r0) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xq21 xq21Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (Throwable th) {
            r0 r0Var = this.this$0.M;
            Boolean bool = Boolean.FALSE;
            this.L$0 = null;
            this.L$1 = th;
            this.label = 5;
            r0Var.emit(bool, this);
            if (zy11Var != coroutineSingletons) {
                throw th;
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            gci0 gci0Var = this.this$0.z.b.j;
            this.label = 1;
            obj = e.y(gci0Var, this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    r0 r0Var2 = this.this$0.M;
                    Boolean bool2 = Boolean.FALSE;
                    this.L$0 = null;
                    this.label = 4;
                    r0Var2.emit(bool2, this);
                    return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i == 4) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = (Throwable) this.L$1;
                kotlin.b.b(obj);
                throw th2;
            }
            xq21Var = (xq21) this.L$0;
            kotlin.b.b(obj);
            com.yandex.go.domain.interactor.d dVar = this.this$0.z;
            Uri uri = this.$photoUri;
            this.L$0 = null;
            this.label = 3;
        }
        Result result = (Result) obj;
        if (result != null) {
            Object value = result.getValue();
            if (value instanceof Result.Failure) {
                value = null;
            }
            xq21Var = (xq21) value;
        } else {
            xq21Var = null;
        }
        r0 r0Var3 = this.this$0.M;
        Boolean bool3 = Boolean.TRUE;
        this.L$0 = xq21Var;
        this.label = 2;
        r0Var3.emit(bool3, this);
        if (zy11Var == coroutineSingletons) {
        }
        com.yandex.go.domain.interactor.d dVar2 = this.this$0.z;
        Uri uri2 = this.$photoUri;
        this.L$0 = null;
        this.label = 3;
    }
}
