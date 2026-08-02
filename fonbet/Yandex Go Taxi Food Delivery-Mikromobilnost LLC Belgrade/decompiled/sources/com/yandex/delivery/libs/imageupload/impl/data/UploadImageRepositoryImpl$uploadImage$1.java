package com.yandex.delivery.libs.imageupload.impl.data;

import defpackage.ac21;
import defpackage.an2;
import defpackage.but0;
import defpackage.cc21;
import defpackage.go2;
import defpackage.ho2;
import defpackage.ijf0;
import defpackage.io2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Ldc21;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.libs.imageupload.impl.data.UploadImageRepositoryImpl$uploadImage$1", f = "UploadImageRepositoryImpl.kt", l = {44, 50}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class UploadImageRepositoryImpl$uploadImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ byte[] $imageBytes;
    final /* synthetic */ String $mimeType;
    final /* synthetic */ String $uploadUrl;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadImageRepositoryImpl$uploadImage$1(byte[] bArr, String str, a aVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.$imageBytes = bArr;
        this.$mimeType = str;
        this.this$0 = aVar;
        this.$uploadUrl = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UploadImageRepositoryImpl$uploadImage$1 uploadImageRepositoryImpl$uploadImage$1 = new UploadImageRepositoryImpl$uploadImage$1(this.$imageBytes, this.$mimeType, this.this$0, this.$uploadUrl, continuation);
        uploadImageRepositoryImpl$uploadImage$1.L$0 = obj;
        return uploadImageRepositoryImpl$uploadImage$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UploadImageRepositoryImpl$uploadImage$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        if (((defpackage.x6f0) r0).y.o(r10, r9) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r10 == r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object ac21Var;
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            an2<zy11> a = ((UploadImageApi) this.this$0.a.get()).a(this.$uploadUrl, new ijf0(this.$imageBytes, this.$mimeType, new but0(27, y6f0Var)));
            this.L$0 = y6f0Var;
            this.L$1 = null;
            this.label = 1;
            ru.yandex.taxi.logistics.sdk.network.b bVar = (ru.yandex.taxi.logistics.sdk.network.b) a;
            obj = bVar.e(bVar.a, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
        }
        io2 io2Var = (io2) obj;
        if (io2Var instanceof ho2) {
            ac21Var = cc21.a;
        } else {
            if (!(io2Var instanceof go2)) {
                w511.b();
                return null;
            }
            ac21Var = new ac21(((go2) io2Var).a);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
    }
}
