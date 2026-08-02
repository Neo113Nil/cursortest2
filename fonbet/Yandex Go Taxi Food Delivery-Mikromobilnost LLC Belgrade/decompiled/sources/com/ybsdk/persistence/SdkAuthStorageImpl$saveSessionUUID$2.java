package com.ybsdk.persistence;

import android.content.SharedPreferences;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.persistence.SdkAuthStorageImpl$saveSessionUUID$2", f = "SdkAuthStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SdkAuthStorageImpl$saveSessionUUID$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $sessionUUID;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkAuthStorageImpl$saveSessionUUID$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$sessionUUID = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkAuthStorageImpl$saveSessionUUID$2(this.this$0, this.$sessionUUID, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SdkAuthStorageImpl$saveSessionUUID$2 sdkAuthStorageImpl$saveSessionUUID$2 = (SdkAuthStorageImpl$saveSessionUUID$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sdkAuthStorageImpl$saveSessionUUID$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        SharedPreferences sharedPreferences = this.this$0.a;
        String str = this.$sessionUUID;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("sessionId", str);
        edit.apply();
        return zy11.a;
    }
}
