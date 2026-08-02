package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.models.UserInfoData;
import com.yandex.passport.data.network.ab;
import com.yandex.passport.data.network.bb;
import com.yandex.passport.data.network.gb;
import com.yandex.passport.internal.entities.ClientToken;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class g0 extends com.yandex.passport.common.domain.a {
    public final gb b;
    public final com.yandex.passport.internal.network.mappers.b c;
    public final com.yandex.passport.data.mapper.a d;

    public g0(com.yandex.passport.common.coroutine.a aVar, gb gbVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.data.mapper.a aVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = gbVar;
        this.c = bVar;
        this.d = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(f0 f0Var, ContinuationImpl continuationImpl) {
        RegisterPhonishUseCase$run$1 registerPhonishUseCase$run$1;
        int i;
        Object value;
        if (continuationImpl instanceof RegisterPhonishUseCase$run$1) {
            registerPhonishUseCase$run$1 = (RegisterPhonishUseCase$run$1) continuationImpl;
            int i2 = registerPhonishUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registerPhonishUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = registerPhonishUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registerPhonishUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Environment environment = f0Var.a;
                    this.c.getClass();
                    ab abVar = new ab(com.yandex.passport.internal.network.mappers.b.a(environment), f0Var.b);
                    registerPhonishUseCase$run$1.L$0 = this;
                    registerPhonishUseCase$run$1.L$1 = f0Var;
                    registerPhonishUseCase$run$1.label = 1;
                    obj = this.b.a(abVar, registerPhonishUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f0Var = (f0) registerPhonishUseCase$run$1.L$1;
                    this = (g0) registerPhonishUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    bb bbVar = (bb) value;
                    com.yandex.passport.common.account.b bVar = MasterToken.Companion;
                    String str = bbVar.b;
                    bVar.getClass();
                    MasterToken a = com.yandex.passport.common.account.b.a(str);
                    String str2 = bbVar.c;
                    ClientToken clientToken = str2 != null ? new ClientToken(str2, f0Var.c) : null;
                    com.yandex.passport.data.mapper.a aVar = this.d;
                    UserInfoData userInfoData = bbVar.d;
                    aVar.getClass();
                    value = new com.yandex.passport.internal.network.response.e(a, com.yandex.passport.data.mapper.a.a(userInfoData), clientToken);
                }
                return new Result(value);
            }
        }
        registerPhonishUseCase$run$1 = new RegisterPhonishUseCase$run$1(this, continuationImpl);
        Object obj2 = registerPhonishUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registerPhonishUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }
}
