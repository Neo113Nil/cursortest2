package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportActionForbiddenException;
import com.yandex.passport.common.core.AuthCookie;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.network.q6;
import com.yandex.passport.data.network.u6;
import com.yandex.passport.data.network.v6;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.k5;
import com.yandex.passport.internal.report.l5;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.m5;
import defpackage.d6z;
import defpackage.ny61;
import java.io.Serializable;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class j0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final v6 c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.r e;

    public j0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, v6 v6Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.r rVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = dVar;
        this.c = v6Var;
        this.d = bVar;
        this.e = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Uid uid, String str, ContinuationImpl continuationImpl) {
        GetCookieByTokenUseCase$execute$1 getCookieByTokenUseCase$execute$1;
        int i;
        if (continuationImpl instanceof GetCookieByTokenUseCase$execute$1) {
            getCookieByTokenUseCase$execute$1 = (GetCookieByTokenUseCase$execute$1) continuationImpl;
            int i2 = getCookieByTokenUseCase$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getCookieByTokenUseCase$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getCookieByTokenUseCase$execute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getCookieByTokenUseCase$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object i0Var = new i0(uid, str);
                    getCookieByTokenUseCase$execute$1.label = 1;
                    obj = a(i0Var, getCookieByTokenUseCase$execute$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        getCookieByTokenUseCase$execute$1 = new GetCookieByTokenUseCase$execute$1(this, continuationImpl);
        Object obj3 = getCookieByTokenUseCase$execute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getCookieByTokenUseCase$execute$1.label;
        if (i != 0) {
        }
        return ((Result) obj3).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(i0 i0Var, ContinuationImpl continuationImpl) {
        GetCookieByTokenUseCase$run$1 getCookieByTokenUseCase$run$1;
        int i;
        try {
            if (continuationImpl instanceof GetCookieByTokenUseCase$run$1) {
                getCookieByTokenUseCase$run$1 = (GetCookieByTokenUseCase$run$1) continuationImpl;
                int i2 = getCookieByTokenUseCase$run$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    getCookieByTokenUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = getCookieByTokenUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = getCookieByTokenUseCase$run$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Uid b = i0Var.b();
                        String a = i0Var.a();
                        com.yandex.passport.internal.report.reporters.r rVar = this.e;
                        rVar.getClass();
                        rVar.f(l5.w, new jd(Long.valueOf(b.getValue())), new com.yandex.passport.internal.report.i(a, 7));
                        ModernAccount e = this.b.a().e(i0Var.b());
                        if (e == null) {
                            throw new PassportAccountNotFoundException(i0Var.b());
                        }
                        if (e.isMailish() || e.isPhonish()) {
                            throw new PassportActionForbiddenException();
                        }
                        v6 v6Var = this.c;
                        com.yandex.passport.internal.network.mappers.b bVar = this.d;
                        Environment environment = i0Var.b().getEnvironment();
                        bVar.getClass();
                        q6 q6Var = new q6(com.yandex.passport.internal.network.mappers.b.a(environment), e.getLocationId(), e.getMasterToken().getNonNullValueOrThrow(), i0Var.a());
                        getCookieByTokenUseCase$run$1.L$0 = this;
                        getCookieByTokenUseCase$run$1.L$1 = i0Var;
                        getCookieByTokenUseCase$run$1.label = 1;
                        obj = v6Var.a(q6Var, getCookieByTokenUseCase$run$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i0Var = (i0) getCookieByTokenUseCase$run$1.L$1;
                        this = (j0) getCookieByTokenUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                    }
                    Object value = ((Result) obj).getValue();
                    kotlin.b.b(value);
                    List list = ((u6) value).b;
                    com.yandex.passport.internal.report.reporters.r rVar2 = this.e;
                    Uid b2 = i0Var.b();
                    String a2 = i0Var.a();
                    rVar2.getClass();
                    rVar2.f(m5.w, new jd(Long.valueOf(b2.getValue())), new com.yandex.passport.internal.report.i(a2, 7));
                    return new Result(d6z.d(new AuthCookie(i0Var.b(), list, i0Var.a())));
                }
            }
            if (i != 0) {
            }
            Object value2 = ((Result) obj).getValue();
            kotlin.b.b(value2);
            List list2 = ((u6) value2).b;
            com.yandex.passport.internal.report.reporters.r rVar22 = this.e;
            Uid b22 = i0Var.b();
            String a22 = i0Var.a();
            rVar22.getClass();
            rVar22.f(m5.w, new jd(Long.valueOf(b22.getValue())), new com.yandex.passport.internal.report.i(a22, 7));
            return new Result(d6z.d(new AuthCookie(i0Var.b(), list2, i0Var.a())));
        } catch (Exception e2) {
            com.yandex.passport.internal.report.reporters.r rVar3 = this.e;
            Uid b3 = i0Var.b();
            String a3 = i0Var.a();
            rVar3.getClass();
            rVar3.f(k5.w, new jd(Long.valueOf(b3.getValue())), new com.yandex.passport.internal.report.i(a3, 7), new ld(e2));
            throw e2;
        }
        getCookieByTokenUseCase$run$1 = new GetCookieByTokenUseCase$run$1(this, continuationImpl);
        Object obj2 = getCookieByTokenUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getCookieByTokenUseCase$run$1.label;
    }
}
