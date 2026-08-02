package com.ybsdk.feature.kyc.internal.data;

import com.ybsdk.feature.kyc.internal.entities.UploadException;
import com.ybsdk.feature.kyc.internal.network.KycApi;
import com.ybsdk.feature.kyc.internal.network.dto.KycActionResponse;
import com.ybsdk.feature.kyc.internal.network.dto.UploadInfoDto;
import com.ybsdk.feature.kyc.internal.network.dto.UploadInfoRequest;
import defpackage.c03;
import defpackage.em3;
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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lzy11;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$uploadPhotoV2$2", f = "KycRepository.kt", l = {263, 283, 292}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycRepository$uploadPhotoV2$2 extends SuspendLambda implements tls {
    final /* synthetic */ c03 $applicationInfo;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ File $photoFile;
    final /* synthetic */ tnx $type;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycRepository$uploadPhotoV2$2(File file, a aVar, String str, tnx tnxVar, c03 c03Var, Continuation continuation) {
        super(1, continuation);
        this.$photoFile = file;
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$type = tnxVar;
        this.$applicationInfo = c03Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new KycRepository$uploadPhotoV2$2(this.$photoFile, this.this$0, this.$idempotencyToken, this.$type, this.$applicationInfo, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((KycRepository$uploadPhotoV2$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0104, code lost:
    
        if (r0 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        m5j0 m5j0Var;
        long j;
        Object a;
        UploadInfoDto uploadInfoDto;
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int i2 = m5j0.a;
            File file = this.$photoFile;
            Regex regex = wg10.e;
            fzq fzqVar = new fzq(qje.o("image/jpeg"), file);
            long length = file.length();
            KycApi kycApi = this.this$0.a;
            String str = this.$idempotencyToken;
            String name = this.$photoFile.getName();
            String a2 = a.a(this.this$0, this.$type);
            long length2 = file.length();
            c03 c03Var = this.$applicationInfo;
            UploadInfoRequest uploadInfoRequest = new UploadInfoRequest(c03Var.a, c03Var.b, a2, "JPEG", name, length2);
            this.L$0 = fzqVar;
            this.J$0 = length;
            this.label = 1;
            Object j2 = kycApi.j(str, uploadInfoRequest, this);
            if (j2 != coroutineSingletons) {
                obj2 = j2;
                m5j0Var = fzqVar;
                j = length;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.J$0;
            m5j0Var = (m5j0) this.L$0;
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                g = ((Result) obj).getValue();
                Throwable a3 = Result.a(g);
                return a3 != null ? new Result(new Result.Failure(a3)) : new Result(zy11.a);
            }
            uploadInfoDto = (UploadInfoDto) this.L$0;
            b.b(obj);
            a = ((Result) obj).getValue();
            if (!(a instanceof Result.Failure)) {
                return new Result(a);
            }
            a aVar = this.this$0;
            List singletonList = Collections.singletonList(uploadInfoDto.getDocumentId());
            c03 c03Var2 = this.$applicationInfo;
            String str2 = this.$idempotencyToken;
            this.L$0 = null;
            this.label = 3;
            g = aVar.g(singletonList, c03Var2, str2, this);
        }
        Throwable a4 = Result.a(obj2);
        if (a4 != null) {
            return new Result(new Result.Failure(a4));
        }
        Object m442extractResultd1pmJ48 = ((KycActionResponse) obj2).m442extractResultd1pmJ48();
        Throwable a5 = Result.a(m442extractResultd1pmJ48);
        if (a5 != null) {
            return new Result(new Result.Failure(new UploadException(g8e.o("Failed to get upload info. Details: ", a5.getMessage()))));
        }
        UploadInfoDto uploadInfoDto2 = (UploadInfoDto) m442extractResultd1pmJ48;
        em3 em3Var = this.this$0.c.F;
        int a6 = (int) (m5j0Var.a() - j);
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("content_length_diff", Integer.valueOf(a6));
        em3Var.a.a("kyc_online.photo.upload.content.length.diff", linkedHashMap);
        KycApi kycApi2 = this.this$0.a;
        String url = uploadInfoDto2.getUrl();
        this.L$0 = uploadInfoDto2;
        this.label = 2;
        a = kycApi2.a(url, m5j0Var, "image/jpeg", this);
        if (a != coroutineSingletons) {
            uploadInfoDto = uploadInfoDto2;
            if (!(a instanceof Result.Failure)) {
            }
        }
        return coroutineSingletons;
    }
}
