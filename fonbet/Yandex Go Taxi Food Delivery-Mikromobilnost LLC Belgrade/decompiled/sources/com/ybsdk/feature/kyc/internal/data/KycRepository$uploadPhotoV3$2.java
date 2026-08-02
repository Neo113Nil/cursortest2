package com.ybsdk.feature.kyc.internal.data;

import com.ybsdk.feature.kyc.internal.entities.UploadException;
import com.ybsdk.feature.kyc.internal.network.KycApi;
import com.ybsdk.feature.kyc.internal.network.dto.KycActionResponse;
import com.ybsdk.feature.kyc.internal.network.dto.UploadInfoDto;
import com.ybsdk.feature.kyc.internal.network.dto.UploadInfoRequest;
import defpackage.c03;
import defpackage.fzq;
import defpackage.g8e;
import defpackage.m5j0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tls;
import defpackage.tnx;
import defpackage.wg10;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$uploadPhotoV3$2", f = "KycRepository.kt", l = {227, 244}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycRepository$uploadPhotoV3$2 extends SuspendLambda implements tls {
    final /* synthetic */ c03 $applicationInfo;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ File $photoFile;
    final /* synthetic */ tnx $type;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycRepository$uploadPhotoV3$2(File file, a aVar, String str, tnx tnxVar, c03 c03Var, Continuation continuation) {
        super(1, continuation);
        this.$photoFile = file;
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$type = tnxVar;
        this.$applicationInfo = c03Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new KycRepository$uploadPhotoV3$2(this.$photoFile, this.this$0, this.$idempotencyToken, this.$type, this.$applicationInfo, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((KycRepository$uploadPhotoV3$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object j;
        m5j0 m5j0Var;
        Object obj2;
        UploadInfoDto uploadInfoDto;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int i2 = m5j0.a;
            File file = this.$photoFile;
            Regex regex = wg10.e;
            fzq fzqVar = new fzq(qje.o("image/jpeg"), file);
            KycApi kycApi = this.this$0.a;
            String str = this.$idempotencyToken;
            String name = this.$photoFile.getName();
            String a = a.a(this.this$0, this.$type);
            long length = file.length();
            c03 c03Var = this.$applicationInfo;
            UploadInfoRequest uploadInfoRequest = new UploadInfoRequest(c03Var.a, c03Var.b, a, "JPEG", name, length);
            this.L$0 = fzqVar;
            this.label = 1;
            j = kycApi.j(str, uploadInfoRequest, this);
            if (j != coroutineSingletons) {
                m5j0Var = fzqVar;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uploadInfoDto = (UploadInfoDto) this.L$0;
            b.b(obj);
            obj2 = ((Result) obj).getValue();
            Throwable a2 = Result.a(obj2);
            return a2 == null ? new Result(new Result.Failure(a2)) : new Result(uploadInfoDto.getDocumentId());
        }
        m5j0Var = (m5j0) this.L$0;
        b.b(obj);
        j = ((Result) obj).getValue();
        Throwable a3 = Result.a(j);
        if (a3 != null) {
            return new Result(new Result.Failure(a3));
        }
        Object m442extractResultd1pmJ48 = ((KycActionResponse) j).m442extractResultd1pmJ48();
        Throwable a4 = Result.a(m442extractResultd1pmJ48);
        if (a4 != null) {
            return new Result(new Result.Failure(new UploadException(g8e.o("Failed to get upload info. Details: ", a4.getMessage()))));
        }
        UploadInfoDto uploadInfoDto2 = (UploadInfoDto) m442extractResultd1pmJ48;
        KycApi kycApi2 = this.this$0.a;
        String url = uploadInfoDto2.getUrl();
        this.L$0 = uploadInfoDto2;
        this.label = 2;
        Object a5 = kycApi2.a(url, m5j0Var, "image/jpeg", this);
        if (a5 != coroutineSingletons) {
            obj2 = a5;
            uploadInfoDto = uploadInfoDto2;
            Throwable a22 = Result.a(obj2);
            if (a22 == null) {
            }
        }
        return coroutineSingletons;
    }
}
