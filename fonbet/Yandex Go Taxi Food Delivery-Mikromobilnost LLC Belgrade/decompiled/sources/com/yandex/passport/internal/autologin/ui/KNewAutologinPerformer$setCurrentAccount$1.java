package com.yandex.passport.internal.autologin.ui;

import com.yandex.passport.api.k2;
import com.yandex.passport.internal.report.q1;
import com.yandex.passport.internal.report.r1;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.autologin.ui.KNewAutologinPerformer$setCurrentAccount$1", f = "KNewAutologinPerformer.kt", l = {199}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class KNewAutologinPerformer$setCurrentAccount$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.api.i $account;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KNewAutologinPerformer$setCurrentAccount$1(j jVar, com.yandex.passport.api.i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$account = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KNewAutologinPerformer$setCurrentAccount$1(this.this$0, this.$account, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KNewAutologinPerformer$setCurrentAccount$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wls wlsVar = this.this$0.g;
            k2 uid = this.$account.getUid();
            this.label = 1;
            obj = wlsVar.invoke(uid, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Object value = ((Result) obj).getValue();
        j jVar = this.this$0;
        com.yandex.passport.api.i iVar = this.$account;
        if (!(value instanceof Result.Failure)) {
            jVar.d.b.reportEvent((String) r1.w.c, gw00.e(new Pair("uid", String.valueOf(iVar.getUid().getValue()))));
        }
        j jVar2 = this.this$0;
        com.yandex.passport.api.i iVar2 = this.$account;
        Throwable a = Result.a(value);
        if (a != null) {
            jVar2.d.b.reportEvent((String) q1.w.c, kotlin.collections.b.i(new Pair("throwable-message", a.getMessage()), new Pair("uid", String.valueOf(iVar2.getUid().getValue()))));
        }
        j jVar3 = this.this$0;
        tje.N(jVar3.e, null, null, new KNewAutologinPerformer$setCurrentAccount$1$invokeSuspend$$inlined$emitOn$1(jVar3.f, null, this.$account), 3);
        return zy11.a;
    }
}
