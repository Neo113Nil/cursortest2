package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.c8;
import com.yandex.passport.data.network.d8;
import com.yandex.passport.data.network.y7;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.na;
import com.yandex.passport.internal.report.pa;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.usecase.GetOtpByTrackUseCase$run$2$1", f = "GetOtpByTrackUseCase.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetOtpByTrackUseCase$run$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ p0 $this_with;
    int label;
    final /* synthetic */ q0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOtpByTrackUseCase$run$2$1(q0 q0Var, p0 p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = q0Var;
        this.$this_with = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetOtpByTrackUseCase$run$2$1(this.this$0, this.$this_with, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetOtpByTrackUseCase$run$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.report.reporters.u0 u0Var = this.this$0.e;
            p0 p0Var = this.$this_with;
            long j = p0Var.a;
            String str = p0Var.c;
            String str2 = p0Var.b;
            u0Var.getClass();
            u0Var.f(na.w, new jd(Long.valueOf(j)), new md(str, 7), new yd(str2, 12));
            if (this.$this_with.b == null) {
                return new Result(null);
            }
            ModernAccount d = this.this$0.c.a().d(this.$this_with.a);
            if (d == null) {
                PassportAccountNotFoundException passportAccountNotFoundException = new PassportAccountNotFoundException(new PassportUidImpl(PassportEnvironmentImpl.from(KPassportEnvironment.PRODUCTION), this.$this_with.a));
                com.yandex.passport.internal.report.reporters.u0 u0Var2 = this.this$0.e;
                p0 p0Var2 = this.$this_with;
                u0Var2.j(p0Var2.a, p0Var2.c, p0Var2.b, passportAccountNotFoundException);
                return new Result(new Result.Failure(passportAccountNotFoundException));
            }
            q0 q0Var = this.this$0;
            d8 d8Var = q0Var.b;
            com.yandex.passport.internal.network.mappers.b bVar = q0Var.d;
            Environment environment = d.getUid().getEnvironment();
            bVar.getClass();
            y7 y7Var = new y7(d.getLocationId(), d.getMasterToken(), com.yandex.passport.internal.network.mappers.b.a(environment), this.$this_with.b);
            this.label = 1;
            a = d8Var.a(y7Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        Object value = ((Result) a).getValue();
        q0 q0Var2 = this.this$0;
        p0 p0Var3 = this.$this_with;
        boolean z = value instanceof Result.Failure;
        if (!z) {
            com.yandex.passport.internal.report.reporters.u0 u0Var3 = q0Var2.e;
            long j2 = p0Var3.a;
            String str3 = p0Var3.c;
            String str4 = p0Var3.b;
            u0Var3.getClass();
            u0Var3.f(pa.w, new jd(Long.valueOf(j2)), new md(str3, 7), new yd(str4, 12));
        }
        q0 q0Var3 = this.this$0;
        p0 p0Var4 = this.$this_with;
        Throwable a2 = Result.a(value);
        if (a2 != null) {
            q0Var3.e.j(p0Var4.a, p0Var4.c, p0Var4.b, a2);
        }
        if (!z) {
            value = ((c8) value).b;
        }
        return new Result(value);
    }
}
