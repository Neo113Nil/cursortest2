package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.m7;
import com.yandex.passport.data.network.r7;
import com.yandex.passport.data.network.t7;
import com.yandex.passport.internal.report.h8;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.n8;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.reporters.b1;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g extends com.yandex.passport.internal.usecase.authorize.n {
    public final t7 d;
    public final com.yandex.passport.internal.network.mappers.b e;
    public final com.yandex.passport.internal.credentials.d f;
    public final b1 g;

    public g(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.h hVar, com.yandex.passport.internal.usecase.n nVar, t7 t7Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.credentials.d dVar, b1 b1Var) {
        super(aVar, hVar, nVar);
        this.d = t7Var;
        this.e = bVar;
        this.f = dVar;
        this.g = b1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.yandex.passport.internal.usecase.authorize.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(f fVar, ContinuationImpl continuationImpl) {
        AuthByMuidTokenUseCase$getMasterToken$1 authByMuidTokenUseCase$getMasterToken$1;
        int i;
        f fVar2;
        Object a;
        Object value;
        char c;
        int i2;
        char c2;
        char c3;
        Throwable a2;
        g gVar = this;
        if (continuationImpl instanceof AuthByMuidTokenUseCase$getMasterToken$1) {
            authByMuidTokenUseCase$getMasterToken$1 = (AuthByMuidTokenUseCase$getMasterToken$1) continuationImpl;
            int i3 = authByMuidTokenUseCase$getMasterToken$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                authByMuidTokenUseCase$getMasterToken$1.label = i3 - Integer.MIN_VALUE;
                Object obj = authByMuidTokenUseCase$getMasterToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authByMuidTokenUseCase$getMasterToken$1.label;
                String str = "by_member_token";
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.j g = com.yandex.passport.internal.util.p.g(gVar.f.a, fVar.getEnvironment());
                    gVar.g.n(null, "by_member_token", new Long(fVar.b()));
                    Environment environment = fVar.getEnvironment();
                    gVar.e.getClass();
                    m7 m7Var = new m7(com.yandex.passport.internal.network.mappers.b.a(environment), fVar.b(), g.getDecryptedId(), g.getDecryptedSecret(), fVar.d(), fVar.c().getValue());
                    authByMuidTokenUseCase$getMasterToken$1.L$0 = gVar;
                    fVar2 = fVar;
                    authByMuidTokenUseCase$getMasterToken$1.L$1 = fVar2;
                    authByMuidTokenUseCase$getMasterToken$1.label = 1;
                    a = gVar.d.a(m7Var, authByMuidTokenUseCase$getMasterToken$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f fVar3 = (f) authByMuidTokenUseCase$getMasterToken$1.L$1;
                    g gVar2 = (g) authByMuidTokenUseCase$getMasterToken$1.L$0;
                    kotlin.b.b(obj);
                    fVar2 = fVar3;
                    gVar = gVar2;
                    a = obj;
                }
                value = ((Result) a).getValue();
                if (!(value instanceof Result.Failure)) {
                    com.yandex.passport.common.account.b bVar = MasterToken.Companion;
                    String a3 = ((r7) value).a();
                    bVar.getClass();
                    value = com.yandex.passport.common.account.b.a(a3);
                }
                boolean z = false;
                String str2 = "false";
                if (value instanceof Result.Failure) {
                    b1 b1Var = gVar.g;
                    long value2 = fVar2.c().getValue();
                    c2 = 4;
                    c3 = 3;
                    Long l = new Long(fVar2.e().getValue());
                    c = 1;
                    Long l2 = new Long(fVar2.f().getValue());
                    long b = fVar2.b();
                    b1Var.getClass();
                    i2 = 2;
                    b1Var.f(n8.w, new jd(Long.valueOf(value2)), new com.yandex.passport.internal.report.i(l), new ld(l2, 2), new com.yandex.passport.internal.report.i(str, 6, z), new com.yandex.passport.internal.report.i(str2, 5, z), new ld(Long.valueOf(b), 0));
                } else {
                    c = 1;
                    i2 = 2;
                    c2 = 4;
                    c3 = 3;
                }
                a2 = Result.a(value);
                if (a2 != null) {
                    b1 b1Var2 = gVar.g;
                    long value3 = fVar2.c().getValue();
                    Long l3 = new Long(fVar2.e().getValue());
                    Long l4 = new Long(fVar2.f().getValue());
                    String message = a2.getMessage();
                    if (message == null) {
                        message = a2.getClass().getSimpleName();
                    }
                    long b2 = fVar2.b();
                    b1Var2.getClass();
                    h8 h8Var = h8.w;
                    jd jdVar = new jd(Long.valueOf(value3));
                    com.yandex.passport.internal.report.i iVar = new com.yandex.passport.internal.report.i(l3);
                    ld ldVar = new ld(l4, i2);
                    com.yandex.passport.internal.report.a aVar = new com.yandex.passport.internal.report.a(message, 26, z);
                    com.yandex.passport.internal.report.i iVar2 = new com.yandex.passport.internal.report.i(str, 6, z);
                    com.yandex.passport.internal.report.i iVar3 = new com.yandex.passport.internal.report.i(str2, 5, z);
                    ld ldVar2 = new ld(Long.valueOf(b2), 0);
                    pd[] pdVarArr = new pd[7];
                    pdVarArr[0] = jdVar;
                    pdVarArr[c] = iVar;
                    pdVarArr[2] = ldVar;
                    pdVarArr[c3] = aVar;
                    pdVarArr[c2] = iVar2;
                    pdVarArr[5] = iVar3;
                    pdVarArr[6] = ldVar2;
                    b1Var2.f(h8Var, pdVarArr);
                }
                return value;
            }
        }
        authByMuidTokenUseCase$getMasterToken$1 = new AuthByMuidTokenUseCase$getMasterToken$1(gVar, continuationImpl);
        Object obj2 = authByMuidTokenUseCase$getMasterToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authByMuidTokenUseCase$getMasterToken$1.label;
        String str3 = "by_member_token";
        if (i != 0) {
        }
        value = ((Result) a).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        boolean z2 = false;
        String str22 = "false";
        if (value instanceof Result.Failure) {
        }
        a2 = Result.a(value);
        if (a2 != null) {
        }
        return value;
    }
}
