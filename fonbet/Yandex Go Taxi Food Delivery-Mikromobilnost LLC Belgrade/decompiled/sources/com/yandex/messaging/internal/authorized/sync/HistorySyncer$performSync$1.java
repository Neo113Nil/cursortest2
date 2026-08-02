package com.yandex.messaging.internal.authorized.sync;

import defpackage.jhu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t0x0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x22;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.HistorySyncer$performSync$1", f = "HistorySyncer.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class HistorySyncer$performSync$1 extends SuspendLambda implements wls {
    final /* synthetic */ t0x0 $callback;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistorySyncer$performSync$1(e eVar, t0x0 t0x0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$callback = t0x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HistorySyncer$performSync$1(this.this$0, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HistorySyncer$performSync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                e eVar = this.this$0;
                t0x0 t0x0Var = this.$callback;
                this.label = 1;
                if (e.b(eVar, t0x0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            ((jhu0) this.$callback).g();
        } catch (HistoryLoader$HistoryException e) {
            x22 x22Var = this.this$0.r.a.a;
            x22Var.e("sync failed", e);
            x22Var.reportError("sync failed", e);
            ((jhu0) this.$callback).f(SyncController$SyncErrorSource.HISTORY);
        } catch (WhoamiLoader$ForbiddenException e2) {
            x22 x22Var2 = this.this$0.r.a.a;
            x22Var2.e("sync failed", e2);
            x22Var2.reportError("sync failed", e2);
            ((jhu0) this.$callback).f(SyncController$SyncErrorSource.WHOAMI);
            this.this$0.x.m();
        } catch (WhoamiLoader$WhoamiException e3) {
            x22 x22Var3 = this.this$0.r.a.a;
            x22Var3.e("sync failed", e3);
            x22Var3.reportError("sync failed", e3);
            ((jhu0) this.$callback).f(SyncController$SyncErrorSource.WHOAMI);
        }
        return zy11.a;
    }
}
