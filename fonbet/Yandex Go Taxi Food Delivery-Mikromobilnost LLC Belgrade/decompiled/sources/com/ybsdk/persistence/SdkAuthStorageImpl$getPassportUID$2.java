package com.ybsdk.persistence;

import android.content.SharedPreferences;
import defpackage.fcy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)J"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.persistence.SdkAuthStorageImpl$getPassportUID$2", f = "SdkAuthStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SdkAuthStorageImpl$getPassportUID$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkAuthStorageImpl$getPassportUID$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkAuthStorageImpl$getPassportUID$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkAuthStorageImpl$getPassportUID$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Long l = new Long(this.this$0.b.getLong("uid", 0L));
        if (l.longValue() == 0) {
            l = null;
        }
        fcy0 fcy0Var = this.this$0.c.m0;
        boolean z = l == null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("is_uid_null", Boolean.valueOf(z));
        fcy0Var.a.a("tech.auth_storage.get_passport_uid", linkedHashMap);
        if (l != null) {
            return l;
        }
        a aVar = this.this$0;
        SharedPreferences sharedPreferences = aVar.a;
        SharedPreferences sharedPreferences2 = aVar.b;
        if (!sharedPreferences2.getBoolean("migrated", false)) {
            long j = sharedPreferences.getLong("uid", 0L);
            Long valueOf = Long.valueOf(j);
            if (j == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.putBoolean("migrated", true);
                edit.putLong("uid", longValue);
                edit.apply();
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.remove("uid");
                edit2.apply();
                return valueOf;
            }
        }
        return null;
    }
}
