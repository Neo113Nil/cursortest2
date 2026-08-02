package com.yandex.passport.internal.ui.domik.username;

import com.yandex.passport.api.exception.PassportException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import com.yandex.passport.data.exceptions.InvalidTrackException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.domik.DomikResult;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.usecase.ui.w0;
import com.yandex.passport.internal.usecase.ui.x0;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.domik.username.UsernameInputViewModel$upgradePhonish$1", f = "UsernameInputViewModel.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UsernameInputViewModel$upgradePhonish$1 extends SuspendLambda implements wls {
    final /* synthetic */ ModernAccount $account;
    final /* synthetic */ String $firstName;
    final /* synthetic */ String $lastName;
    final /* synthetic */ String $trackId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameInputViewModel$upgradePhonish$1(String str, b bVar, ModernAccount modernAccount, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.$trackId = str;
        this.this$0 = bVar;
        this.$account = modernAccount;
        this.$firstName = str2;
        this.$lastName = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UsernameInputViewModel$upgradePhonish$1(this.$trackId, this.this$0, this.$account, this.$firstName, this.$lastName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UsernameInputViewModel$upgradePhonish$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$trackId;
            b bVar = this.this$0;
            if (str == null) {
                bVar.b.l(new EventError("phone.not_confirmed", new InvalidTrackException("Null trackId")));
                return zy11Var;
            }
            bVar.c.m(Boolean.TRUE);
            x0 x0Var = this.this$0.B;
            w0 w0Var = new w0(this.$account.getUid(), this.$account.getMasterToken(), this.$trackId, this.$firstName, this.$lastName);
            this.label = 1;
            obj = x0Var.a(w0Var, this);
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
        b bVar2 = this.this$0;
        Throwable a = Result.a(value);
        if (a != null) {
            c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "failed upgradePhonish " + a, 8);
            }
            bVar2.c.l(Boolean.FALSE);
            if (a instanceof PassportException) {
                PassportException passportException = (PassportException) a;
                e eVar = bVar2.C.a;
                eVar.getClass();
                eVar.N = new EventError("unknown error", passportException);
                eVar.F.m(passportException);
            } else {
                bVar2.b.l(new EventError("phone.not_confirmed", a));
            }
        }
        b bVar3 = this.this$0;
        if (!(value instanceof Result.Failure)) {
            bVar3.C.a.E.m((DomikResult) value);
        }
        return zy11Var;
    }
}
