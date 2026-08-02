package com.yandex.delivery.libs.imageupload.impl.domain;

import com.yandex.delivery.libs.imageupload.api.UploadImageType;
import com.yandex.delivery.libs.imageupload.impl.data.UploadImageApi;
import com.yandex.delivery.libs.imageupload.impl.data.UploadImageTypeDto;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import defpackage.fc21;
import defpackage.fi9;
import defpackage.go2;
import defpackage.ho2;
import defpackage.io2;
import defpackage.kc21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rzo;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryimagegenerateuploadlink.GenerateUploadLinkRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryimagegenerateuploadlink.Responses$GenerateUploadLinkResponseDto;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lic21;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.libs.imageupload.impl.domain.UploadImageTaskImpl$invokeWithProgress$1", f = "UploadImageTaskImpl.kt", l = {40, 44, 66}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class UploadImageTaskImpl$invokeWithProgress$1 extends SuspendLambda implements wls {
    final /* synthetic */ InputStream $inputStream;
    final /* synthetic */ String $mimeType;
    final /* synthetic */ UploadImageType $uploadImageType;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadImageTaskImpl$invokeWithProgress$1(b bVar, UploadImageType uploadImageType, String str, InputStream inputStream, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$uploadImageType = uploadImageType;
        this.$mimeType = str;
        this.$inputStream = inputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UploadImageTaskImpl$invokeWithProgress$1 uploadImageTaskImpl$invokeWithProgress$1 = new UploadImageTaskImpl$invokeWithProgress$1(this.this$0, this.$uploadImageType, this.$mimeType, this.$inputStream, continuation);
        uploadImageTaskImpl$invokeWithProgress$1.L$0 = obj;
        return uploadImageTaskImpl$invokeWithProgress$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UploadImageTaskImpl$invokeWithProgress$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.delivery.libs.imageupload.impl.data.a aVar = this.this$0.a;
            UploadImageType uploadImageType = this.$uploadImageType;
            String str = this.$mimeType;
            this.L$0 = vprVar;
            this.label = 1;
            aVar.b.getClass();
            if (kc21.a[uploadImageType.ordinal()] != 1) {
                w511.b();
                return null;
            }
            obj = ((ru.yandex.taxi.logistics.sdk.network.b) ((UploadImageApi) aVar.a.get()).b(new GenerateUploadLinkRequestDto(str), UploadImageTypeDto.PHOTOCOMMENT)).c((r9 & 1) != 0 ? Integer.MAX_VALUE : 3, 10000L, MapiClientImpl.RETRIES_TIME_MILLIS, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        io2 io2Var = (io2) obj;
        if (io2Var instanceof ho2) {
            Responses$GenerateUploadLinkResponseDto responses$GenerateUploadLinkResponseDto = (Responses$GenerateUploadLinkResponseDto) ((ho2) io2Var).a;
            fi9 a = this.this$0.a.a(responses$GenerateUploadLinkResponseDto.getUploadUrl(), this.$mimeType, rzo.R(this.$inputStream));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            e.w(vprVar);
            Object collect = a.collect(new a(vprVar, responses$GenerateUploadLinkResponseDto), this);
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (!(io2Var instanceof go2)) {
            w511.b();
            return null;
        }
        fc21 fc21Var = new fc21(((go2) io2Var).a);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (vprVar.emit(fc21Var, this) == coroutineSingletons) {
        }
    }
}
