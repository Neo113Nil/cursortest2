package com.yandex.passport.internal.link_auth;

import android.content.SharedPreferences;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.link_auth.PollingStorage$update$2", f = "PollingStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PollingStorage$update$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingStorage$update$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PollingStorage$update$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PollingStorage$update$2 pollingStorage$update$2 = (PollingStorage$update$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pollingStorage$update$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        SharedPreferences sharedPreferences = aVar.d;
        long j = sharedPreferences.getLong("link_auth_last_update", 0L);
        aVar.c.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - j;
        boolean z = j2 < 86400000;
        if (j2 < 0) {
            SharedPreferences.Editor edit = aVar.d.edit();
            edit.putInt("link_auth_current_count", 1);
            edit.putLong("link_auth_last_update", currentTimeMillis);
            edit.commit();
        } else if (z) {
            sharedPreferences.edit().putInt("link_auth_current_count", sharedPreferences.getInt("link_auth_current_count", 0) + 1).commit();
        } else {
            sharedPreferences.edit().putInt("link_auth_current_count", 1).commit();
            sharedPreferences.edit().putLong("link_auth_last_update", System.currentTimeMillis()).commit();
        }
        a aVar2 = this.this$0;
        SharedPreferences sharedPreferences2 = aVar2.d;
        long j3 = sharedPreferences2.getLong("link_auth_one_time_last_update", 0L);
        aVar2.c.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        long j4 = currentTimeMillis2 - j3;
        if (j4 < 0) {
            SharedPreferences.Editor edit2 = aVar2.d.edit();
            edit2.putInt("link_auth_one_time_count", 1);
            edit2.putLong("link_auth_one_time_last_update", currentTimeMillis2);
            edit2.commit();
        } else if (j4 < 600000) {
            sharedPreferences2.edit().putInt("link_auth_one_time_count", sharedPreferences2.getInt("link_auth_one_time_count", 0) + 1).commit();
        } else {
            sharedPreferences2.edit().putLong("link_auth_one_time_last_update", System.currentTimeMillis()).commit();
            sharedPreferences2.edit().putInt("link_auth_one_time_count", 1).commit();
        }
        return zy11.a;
    }
}
