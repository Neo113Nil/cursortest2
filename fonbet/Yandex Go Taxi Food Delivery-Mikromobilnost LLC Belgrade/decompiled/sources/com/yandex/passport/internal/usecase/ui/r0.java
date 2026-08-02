package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.dc;
import com.yandex.passport.data.network.xb;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class r0 extends com.yandex.passport.common.domain.a {
    public final dc b;
    public final com.yandex.passport.common.common.a c;
    public final com.yandex.passport.internal.network.mappers.b d;

    public r0(com.yandex.passport.common.coroutine.a aVar, dc dcVar, com.yandex.passport.common.common.a aVar2, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = dcVar;
        this.c = aVar2;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(q0 q0Var, ContinuationImpl continuationImpl) {
        SmsCodeSendingUseCase$run$1 smsCodeSendingUseCase$run$1;
        int i;
        if (continuationImpl instanceof SmsCodeSendingUseCase$run$1) {
            smsCodeSendingUseCase$run$1 = (SmsCodeSendingUseCase$run$1) continuationImpl;
            int i2 = smsCodeSendingUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                smsCodeSendingUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = smsCodeSendingUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = smsCodeSendingUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "execute", 8);
                    }
                    Environment environment = q0Var.a;
                    this.d.getClass();
                    xb xbVar = new xb(com.yandex.passport.internal.network.mappers.b.a(environment), q0Var.b, q0Var.c, q0Var.d, q0Var.e, ((com.yandex.passport.internal.common.e) this.c).a(), q0Var.f.getValue(), q0Var.g);
                    smsCodeSendingUseCase$run$1.label = 1;
                    obj = this.b.a(xbVar, smsCodeSendingUseCase$run$1);
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
                return new Result(((Result) obj).getValue());
            }
        }
        smsCodeSendingUseCase$run$1 = new SmsCodeSendingUseCase$run$1(this, continuationImpl);
        Object obj2 = smsCodeSendingUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smsCodeSendingUseCase$run$1.label;
        if (i != 0) {
        }
        return new Result(((Result) obj2).getValue());
    }
}
