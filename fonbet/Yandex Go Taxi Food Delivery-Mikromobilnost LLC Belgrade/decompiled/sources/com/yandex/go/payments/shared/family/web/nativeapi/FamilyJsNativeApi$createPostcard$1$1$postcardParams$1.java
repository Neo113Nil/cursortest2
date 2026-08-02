package com.yandex.go.payments.shared.family.web.nativeapi;

import com.yandex.go.payments.shared.family.web.nativeapi.request.PostcardParams;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/payments/shared/family/web/nativeapi/request/PostcardParams;", "<anonymous>", "(Ltse;)Lcom/yandex/go/payments/shared/family/web/nativeapi/request/PostcardParams;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.web.nativeapi.FamilyJsNativeApi$createPostcard$1$1$postcardParams$1", f = "FamilyJsNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class FamilyJsNativeApi$createPostcard$1$1$postcardParams$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    int label;
    final /* synthetic */ FamilyJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyJsNativeApi$createPostcard$1$1$postcardParams$1(FamilyJsNativeApi familyJsNativeApi, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.this$0 = familyJsNativeApi;
        this.$params = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyJsNativeApi$createPostcard$1$1$postcardParams$1(this.this$0, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyJsNativeApi$createPostcard$1$1$postcardParams$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object deserialize;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        deserialize = this.this$0.deserialize(this.$params[0], PostcardParams.Companion.serializer());
        return deserialize;
    }
}
