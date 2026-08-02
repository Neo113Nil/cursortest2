package com.yandex.messaging.internal.storage;

import android.content.SharedPreferences;
import android.os.Looper;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.z83;
import defpackage.zy11;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.storage.StorageCleaner$scheduleCleanupProfile$1", f = "StorageCleaner.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class StorageCleaner$scheduleCleanupProfile$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $profileId;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageCleaner$scheduleCleanupProfile$1(i iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$profileId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StorageCleaner$scheduleCleanupProfile$1(this.this$0, this.$profileId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StorageCleaner$scheduleCleanupProfile$1 storageCleaner$scheduleCleanupProfile$1 = (StorageCleaner$scheduleCleanupProfile$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        storageCleaner$scheduleCleanupProfile$1.invokeSuspend(zy11Var);
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
        this.this$0.f.getClass();
        Looper.myLooper();
        z83.i();
        this.this$0.d.c("tech_new_outdated_profile", "profile", this.$profileId);
        i iVar = this.this$0;
        LinkedHashSet i = v4r0.i(iVar.c(), this.$profileId);
        SharedPreferences.Editor edit = iVar.e.edit();
        edit.putStringSet("OUTDATED_PROFILES", i);
        edit.commit();
        return zy11.a;
    }
}
