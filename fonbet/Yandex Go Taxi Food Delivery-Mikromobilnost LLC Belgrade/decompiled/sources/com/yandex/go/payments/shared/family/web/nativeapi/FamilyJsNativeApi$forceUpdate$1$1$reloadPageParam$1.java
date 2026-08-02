package com.yandex.go.payments.shared.family.web.nativeapi;

import defpackage.fti0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfti0;", "<anonymous>", "(Ltse;)Lfti0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.web.nativeapi.FamilyJsNativeApi$forceUpdate$1$1$reloadPageParam$1", f = "FamilyJsNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class FamilyJsNativeApi$forceUpdate$1$1$reloadPageParam$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    int label;
    final /* synthetic */ FamilyJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyJsNativeApi$forceUpdate$1$1$reloadPageParam$1(FamilyJsNativeApi familyJsNativeApi, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.$params = strArr;
        this.this$0 = familyJsNativeApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyJsNativeApi$forceUpdate$1$1$reloadPageParam$1(this.this$0, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyJsNativeApi$forceUpdate$1$1$reloadPageParam$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        String[] strArr = this.$params;
        if (strArr.length == 0) {
            return new fti0(null);
        }
        deserialize = this.this$0.deserialize(strArr[0], fti0.Companion.serializer());
        return (fti0) deserialize;
    }
}
