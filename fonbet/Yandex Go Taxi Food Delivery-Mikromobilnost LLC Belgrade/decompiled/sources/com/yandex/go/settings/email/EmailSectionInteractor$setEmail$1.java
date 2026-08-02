package com.yandex.go.settings.email;

import defpackage.avj0;
import defpackage.ksn;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tse;
import defpackage.u1n;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.settings.email.EmailSectionInteractor$setEmail$1", f = "EmailSectionInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class EmailSectionInteractor$setEmail$1 extends SuspendLambda implements wls {
    final /* synthetic */ ksn $callback;
    final /* synthetic */ String $email;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSectionInteractor$setEmail$1(c cVar, String str, ksn ksnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$email = str;
        this.$callback = ksnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EmailSectionInteractor$setEmail$1(this.this$0, this.$email, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EmailSectionInteractor$setEmail$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        String h;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z2 = true;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.settings.email.a aVar = this.this$0.a;
            String str = this.$email;
            this.label = 1;
            e = aVar.e(str, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        c cVar = this.this$0;
        ksn ksnVar = this.$callback;
        if (!(e instanceof Result.Failure)) {
            int intValue = ((Number) e).intValue();
            cVar.e = false;
            if (intValue == 1) {
                ((u1n) ksnVar).l(null);
                z = false;
            } else {
                ((u1n) ksnVar).l(((avj0) cVar.b).h(kyh0.email_change_status_not_confirmed));
                z = true;
            }
            cVar.c = z;
        }
        c cVar2 = this.this$0;
        ksn ksnVar2 = this.$callback;
        Throwable a = Result.a(e);
        if (a != null) {
            cVar2.e = false;
            Integer M = s8o.M(a);
            if (M != null && M.intValue() == 400) {
                h = ((avj0) cVar2.b).h(kyh0.email_change_error_send_400);
                z2 = false;
            } else if (M != null && M.intValue() == 429) {
                h = ((avj0) cVar2.b).h(kyh0.email_change_error_send_too_often);
            } else {
                h = ((avj0) cVar2.b).h(kyh0.email_change_error_send_general);
            }
            ((u1n) ksnVar2).j(h, z2);
        }
        return zy11.a;
    }
}
