package com.yandex.passport.internal.usecase.authorize;

import com.yandex.passport.api.exception.PassportCredentialsNotFoundException;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.data.models.UserInfoData;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.report.f1;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.usecase.a1;
import com.yandex.passport.internal.usecase.b1;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class j extends com.yandex.passport.common.domain.a {
    public final b1 b;
    public final com.yandex.passport.data.network.l c;
    public final com.yandex.passport.internal.report.reporters.i d;
    public final p e;
    public final com.yandex.passport.internal.network.mappers.b f;
    public final com.yandex.passport.internal.network.mappers.a g;

    public j(com.yandex.passport.common.coroutine.a aVar, b1 b1Var, com.yandex.passport.data.network.l lVar, com.yandex.passport.internal.report.reporters.i iVar, p pVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.network.mappers.a aVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = b1Var;
        this.c = lVar;
        this.d = iVar;
        this.e = pVar;
        this.f = bVar;
        this.g = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0102, code lost:
    
        if (r1 == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0104, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r4 == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(i iVar, ContinuationImpl continuationImpl) {
        AuthorizeByPasswordUseCase$run$1 authorizeByPasswordUseCase$run$1;
        int i;
        i iVar2;
        Object a;
        Object value;
        j jVar = this;
        if (continuationImpl instanceof AuthorizeByPasswordUseCase$run$1) {
            authorizeByPasswordUseCase$run$1 = (AuthorizeByPasswordUseCase$run$1) continuationImpl;
            int i2 = authorizeByPasswordUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizeByPasswordUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizeByPasswordUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizeByPasswordUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Environment d = iVar.d();
                    ClientCredentials r = jVar.e.r(d);
                    if (r == null) {
                        throw new PassportCredentialsNotFoundException(com.yandex.passport.internal.util.p.y(d));
                    }
                    String f = iVar.f();
                    com.yandex.passport.internal.report.reporters.i iVar3 = jVar.d;
                    iVar3.getClass();
                    iVar3.f(f1.w, new yd(f, 12));
                    Environment d2 = iVar.d();
                    jVar.f.getClass();
                    com.yandex.passport.data.network.e eVar = new com.yandex.passport.data.network.e(com.yandex.passport.internal.network.mappers.b.a(d2), iVar.f(), iVar.e(), iVar.b(), iVar.c(), r.getDecryptedId(), iVar.a().getFromValue());
                    authorizeByPasswordUseCase$run$1.L$0 = jVar;
                    iVar2 = iVar;
                    authorizeByPasswordUseCase$run$1.L$1 = iVar2;
                    authorizeByPasswordUseCase$run$1.label = 1;
                    a = jVar.c.a(eVar, authorizeByPasswordUseCase$run$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        value = (ModernAccount) obj;
                        return new Result(value);
                    }
                    i iVar4 = (i) authorizeByPasswordUseCase$run$1.L$1;
                    j jVar2 = (j) authorizeByPasswordUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    iVar2 = iVar4;
                    jVar = jVar2;
                    a = obj;
                }
                value = ((Result) a).getValue();
                if (!(value instanceof Result.Failure)) {
                    com.yandex.passport.data.models.c cVar = (com.yandex.passport.data.models.c) value;
                    b1 b1Var = jVar.b;
                    Environment d3 = iVar2.d();
                    com.yandex.passport.internal.network.mappers.a aVar = jVar.g;
                    MasterToken b = cVar.b();
                    com.yandex.passport.data.mapper.a aVar2 = aVar.a;
                    UserInfoData c = cVar.c();
                    aVar2.getClass();
                    UserInfo a2 = com.yandex.passport.data.mapper.a.a(c);
                    com.yandex.passport.data.models.e a3 = cVar.a();
                    a1 a1Var = new a1(d3, new com.yandex.passport.internal.network.response.e(b, a2, a3 != null ? new ClientToken(a3.b(), a3.a()) : null), iVar2.a());
                    authorizeByPasswordUseCase$run$1.L$0 = null;
                    authorizeByPasswordUseCase$run$1.L$1 = null;
                    authorizeByPasswordUseCase$run$1.label = 2;
                    obj = b1Var.a(a1Var, authorizeByPasswordUseCase$run$1);
                }
                return new Result(value);
            }
        }
        authorizeByPasswordUseCase$run$1 = new AuthorizeByPasswordUseCase$run$1(jVar, continuationImpl);
        Object obj2 = authorizeByPasswordUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizeByPasswordUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) a).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }
}
