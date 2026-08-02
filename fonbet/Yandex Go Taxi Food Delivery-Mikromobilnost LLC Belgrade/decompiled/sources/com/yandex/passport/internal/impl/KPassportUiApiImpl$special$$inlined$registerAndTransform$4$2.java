package com.yandex.passport.internal.impl;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportActionForbiddenException;
import com.yandex.passport.api.exception.PassportDeprecatedApiUsageException;
import com.yandex.passport.api.exception.PassportLoginException;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.w;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.impl.KPassportUiApiImpl$special$$inlined$registerAndTransform$4$2", f = "KPassportUiApiImpl.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class KPassportUiApiImpl$special$$inlined$registerAndTransform$4$2 extends SuspendLambda implements wls {
    final /* synthetic */ Object $result$inlined;
    final /* synthetic */ vpr $this_emitOn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPassportUiApiImpl$special$$inlined$registerAndTransform$4$2(vpr vprVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$this_emitOn = vprVar;
        this.$result$inlined = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KPassportUiApiImpl$special$$inlined$registerAndTransform$4$2(this.$this_emitOn, this.$result$inlined, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KPassportUiApiImpl$special$$inlined$registerAndTransform$4$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = this.$this_emitOn;
            w wVar = (w) this.$result$inlined;
            if (jl40.l(wVar, com.yandex.passport.api.q.a)) {
                failure = new Result.Failure(new PassportLoginException());
            } else if (wVar instanceof com.yandex.passport.api.s) {
                failure = new Result.Failure(((com.yandex.passport.api.s) wVar).a);
            } else if (jl40.l(wVar, com.yandex.passport.api.t.a)) {
                failure = new Result.Failure(new PassportActionForbiddenException());
            } else if (wVar instanceof com.yandex.passport.api.u) {
                com.yandex.passport.api.u uVar = (com.yandex.passport.api.u) wVar;
                PassportUidImpl passportUidImpl = uVar.a;
                PassportUidImpl.Companion.getClass();
                failure = new com.yandex.passport.internal.entities.j(l2.a(passportUidImpl), uVar.c, uVar.d);
            } else {
                if (!(wVar instanceof com.yandex.passport.api.v)) {
                    w511.b();
                    return null;
                }
                failure = new Result.Failure(new PassportDeprecatedApiUsageException("OpenUrl"));
            }
            Result result = new Result(failure);
            this.label = 1;
            if (vprVar.emit(result, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
