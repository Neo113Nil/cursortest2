package com.ybsdk.feature.kyc.internal.interactor;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.dib1;
import defpackage.if8;
import defpackage.lnx;
import defpackage.mvg;
import defpackage.ny61;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.interactor.KycInteractor$uploadPhoto$2", f = "KycInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycInteractor$uploadPhoto$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ File $photoFile;
    final /* synthetic */ File $scaledFile;
    final /* synthetic */ tnx $type;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycInteractor$uploadPhoto$2(a aVar, File file, File file2, tnx tnxVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$photoFile = file;
        this.$scaledFile = file2;
        this.$type = tnxVar;
        this.$applicationId = str;
        this.$idempotencyToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KycInteractor$uploadPhoto$2(this.this$0, this.$photoFile, this.$scaledFile, this.$type, this.$applicationId, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KycInteractor$uploadPhoto$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Serializable a = a.a(this.this$0, this.$photoFile, this.$scaledFile);
            a aVar = this.this$0;
            tnx tnxVar = this.$type;
            String str = this.$applicationId;
            String str2 = this.$idempotencyToken;
            Throwable a2 = Result.a(a);
            if (a2 == null) {
                File file = (File) a;
                aVar.e.F.i((int) file.length(), dib1.d(tnxVar));
                if (((if8) aVar.d).d()) {
                    lnx lnxVar = aVar.c;
                    dib1.d(tnxVar);
                    lnxVar.getClass();
                }
                com.ybsdk.feature.kyc.internal.data.a aVar2 = aVar.b;
                this.label = 1;
                failure = aVar2.h(tnxVar, file, str, str2, this);
                if (failure == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                failure = new Result.Failure(a2);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            failure = ((Result) obj).getValue();
        }
        return new Result(failure);
    }
}
