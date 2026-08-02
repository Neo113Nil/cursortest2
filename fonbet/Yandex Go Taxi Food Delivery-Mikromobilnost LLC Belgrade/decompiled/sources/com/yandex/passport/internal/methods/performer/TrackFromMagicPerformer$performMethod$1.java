package com.yandex.passport.internal.methods.performer;

import android.content.SharedPreferences;
import com.yandex.passport.api.exception.PassportPollingExceptionType;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.GetTrackFromMagicRequest$Result;
import com.yandex.passport.data.network.d9;
import com.yandex.passport.data.network.x8;
import com.yandex.passport.internal.link_auth.PollingException;
import com.yandex.passport.internal.methods.q1;
import com.yandex.passport.internal.report.s7;
import com.yandex.passport.internal.report.t7;
import com.yandex.passport.internal.report.yd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/data/network/GetTrackFromMagicRequest$Result;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.TrackFromMagicPerformer$performMethod$1", f = "TrackFromMagicPerformer.kt", l = {33, 41}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TrackFromMagicPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ q1 $method;
    Object L$0;
    int label;
    final /* synthetic */ i1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackFromMagicPerformer$performMethod$1(q1 q1Var, i1 i1Var, Continuation continuation) {
        super(2, continuation);
        this.$method = q1Var;
        this.this$0 = i1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackFromMagicPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackFromMagicPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011d, code lost:
    
        if (r2 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0141  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object a;
        Throwable a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Environment u = com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) this.$method.b.c);
            com.yandex.passport.internal.link_auth.a aVar = this.this$0.c;
            SharedPreferences sharedPreferences = aVar.d;
            long j = sharedPreferences.getLong("link_auth_one_time_last_update", 0L);
            int i2 = sharedPreferences.getInt("link_auth_one_time_count", 0);
            aVar.c.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - j;
            if (j2 < 0) {
                SharedPreferences.Editor edit = aVar.d.edit();
                edit.putInt("link_auth_one_time_count", 1);
                edit.putLong("link_auth_one_time_last_update", currentTimeMillis);
                edit.commit();
            } else {
                boolean z = j2 < 600000;
                boolean z2 = ((Number) aVar.b.b(com.yandex.passport.internal.flags.n.a)).intValue() > i2;
                if (z && !z2) {
                    failure = new Result.Failure(new PollingException(PassportPollingExceptionType.ONE_TIME_LIMIT));
                    return new Result(failure);
                }
            }
            com.yandex.passport.internal.link_auth.a aVar2 = this.this$0.c;
            SharedPreferences sharedPreferences2 = aVar2.d;
            long j3 = sharedPreferences2.getLong("link_auth_last_update", 0L);
            int i3 = sharedPreferences2.getInt("link_auth_current_count", 0);
            aVar2.c.getClass();
            long currentTimeMillis2 = System.currentTimeMillis();
            long j4 = currentTimeMillis2 - j3;
            if (j4 < 0) {
                SharedPreferences.Editor edit2 = aVar2.d.edit();
                edit2.putInt("link_auth_current_count", 1);
                edit2.putLong("link_auth_last_update", currentTimeMillis2);
                edit2.commit();
            } else {
                boolean z3 = j4 < 86400000;
                boolean z4 = ((Number) aVar2.b.b(com.yandex.passport.internal.flags.n.b)).intValue() > i3;
                if (z3 && !z4) {
                    failure = new Result.Failure(new PollingException(PassportPollingExceptionType.DAILY_LIMIT));
                    return new Result(failure);
                }
            }
            i1 i1Var = this.this$0;
            d9 d9Var = i1Var.a;
            i1Var.x.getClass();
            com.yandex.passport.data.models.g a3 = com.yandex.passport.internal.network.mappers.b.a(u);
            q1 q1Var = this.$method;
            x8 x8Var = new x8(a3, (String) q1Var.c.c, (String) q1Var.d.c);
            this.label = 1;
            a = d9Var.a(x8Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                failure = this.L$0;
                kotlin.b.b(obj);
                com.yandex.passport.internal.report.reporters.d0 d0Var = this.this$0.w;
                d0Var.getClass();
                if (!(failure instanceof Result.Failure)) {
                    GetTrackFromMagicRequest$Result getTrackFromMagicRequest$Result = (GetTrackFromMagicRequest$Result) failure;
                    d0Var.f(t7.w, new yd(getTrackFromMagicRequest$Result.getTrackId(), 12), new yd(getTrackFromMagicRequest$Result.getState().toString(), 10, false));
                }
                a2 = Result.a(failure);
                if (a2 != null) {
                    d0Var.f(s7.w, new yd(a2));
                }
                return new Result(failure);
            }
            kotlin.b.b(obj);
            a = obj;
        }
        Object value = ((Result) a).getValue();
        com.yandex.passport.internal.link_auth.a aVar3 = this.this$0.c;
        this.L$0 = value;
        this.label = 2;
        if (aVar3.a(this) != coroutineSingletons) {
            failure = value;
            com.yandex.passport.internal.report.reporters.d0 d0Var2 = this.this$0.w;
            d0Var2.getClass();
            if (!(failure instanceof Result.Failure)) {
            }
            a2 = Result.a(failure);
            if (a2 != null) {
            }
            return new Result(failure);
        }
        return coroutineSingletons;
    }
}
