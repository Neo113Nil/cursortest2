package com.ybsdk.feature.kyc.internal.interactor;

import defpackage.c03;
import defpackage.dib1;
import defpackage.g8e;
import defpackage.if8;
import defpackage.lnx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qq7;
import defpackage.tnx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lj3m;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.interactor.KycInteractor$uploadPhotoV3$2", f = "KycInteractor.kt", l = {110, 119}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycInteractor$uploadPhotoV3$2 extends SuspendLambda implements wls {
    final /* synthetic */ c03 $applicationInfo;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ File $photoFile;
    final /* synthetic */ File $photoScaledFile;
    final /* synthetic */ tnx $type;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycInteractor$uploadPhotoV3$2(a aVar, File file, File file2, tnx tnxVar, c03 c03Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$photoFile = file;
        this.$photoScaledFile = file2;
        this.$type = tnxVar;
        this.$applicationInfo = c03Var;
        this.$idempotencyToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KycInteractor$uploadPhotoV3$2(this.this$0, this.$photoFile, this.$photoScaledFile, this.$type, this.$applicationInfo, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KycInteractor$uploadPhotoV3$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00d9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object failure;
        Object j;
        a aVar;
        tnx tnxVar;
        c03 c03Var;
        tnx tnxVar2;
        a aVar2;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Serializable a2 = a.a(this.this$0, this.$photoFile, this.$photoScaledFile);
            a aVar3 = this.this$0;
            tnx tnxVar3 = this.$type;
            c03 c03Var2 = this.$applicationInfo;
            str = this.$idempotencyToken;
            Throwable a3 = Result.a(a2);
            if (a3 != null) {
                failure = new Result.Failure(a3);
                return new Result(failure);
            }
            File file = (File) a2;
            aVar3.e.F.i((int) file.length(), dib1.d(tnxVar3));
            if (((if8) aVar3.d).d()) {
                lnx lnxVar = aVar3.c;
                dib1.d(tnxVar3);
                lnxVar.getClass();
            }
            com.ybsdk.feature.kyc.internal.data.a aVar4 = aVar3.b;
            this.L$0 = aVar3;
            this.L$1 = tnxVar3;
            this.L$2 = c03Var2;
            this.L$3 = str;
            this.label = 1;
            j = aVar4.j(tnxVar3, file, c03Var2, str, this);
            if (j != coroutineSingletons) {
                aVar = aVar3;
                tnxVar = tnxVar3;
                c03Var = c03Var2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tnxVar2 = (tnx) this.L$1;
            aVar2 = (a) this.L$0;
            b.b(obj);
            failure = ((Result) obj).getValue();
            a = Result.a(failure);
            if (a != null) {
                qq7 qq7Var = aVar2.e.j;
                qq7Var.a.a("camera_flow.photo.validate.error", g8e.w(1, "document_type", tnxVar2.a));
                return new Result(new Result.Failure(a));
            }
            return new Result(failure);
        }
        String str2 = (String) this.L$3;
        c03Var = (c03) this.L$2;
        tnx tnxVar4 = (tnx) this.L$1;
        a aVar5 = (a) this.L$0;
        b.b(obj);
        str = str2;
        j = ((Result) obj).getValue();
        tnxVar = tnxVar4;
        aVar = aVar5;
        Throwable a4 = Result.a(j);
        if (a4 != null) {
            return new Result(new Result.Failure(a4));
        }
        Object obj2 = j;
        com.ybsdk.feature.kyc.internal.data.a aVar6 = aVar.b;
        String str3 = c03Var.a;
        String str4 = c03Var.b;
        b.b(obj2);
        this.L$0 = aVar;
        this.L$1 = tnxVar;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        failure = aVar6.k(str3, str4, (String) obj2, str, this);
        if (failure != coroutineSingletons) {
            tnxVar2 = tnxVar;
            aVar2 = aVar;
            a = Result.a(failure);
            if (a != null) {
            }
            return new Result(failure);
        }
        return coroutineSingletons;
    }
}
