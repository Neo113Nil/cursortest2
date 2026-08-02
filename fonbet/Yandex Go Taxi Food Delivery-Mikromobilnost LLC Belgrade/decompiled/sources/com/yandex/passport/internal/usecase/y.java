package com.yandex.passport.internal.usecase;

import android.net.Uri;
import com.yandex.passport.api.PassportUrlType;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.ModernAccount;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.w511;
import defpackage.zy11;
import java.io.Closeable;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class y extends x1 {
    public final com.yandex.passport.internal.core.accounts.d d;
    public final com.yandex.passport.internal.network.e e;
    public final com.yandex.passport.data.network.s f;
    public final com.yandex.passport.internal.report.reporters.i g;
    public final com.yandex.passport.internal.network.mappers.b h;
    public final com.yandex.passport.internal.ui.domik.n i;

    public y(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.network.e eVar, com.yandex.passport.data.network.s sVar, com.yandex.passport.internal.report.reporters.i iVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.d = dVar;
        this.e = eVar;
        this.f = sVar;
        this.g = iVar;
        this.h = bVar;
        this.i = new com.yandex.passport.internal.ui.domik.n();
    }

    public final Uri c(Environment environment, long j, com.yandex.passport.data.network.r rVar, String str, boolean z, FrontendUrlType frontendUrlType) {
        String f;
        String str2;
        if (z && ((str2 = rVar.c) == null || evu0.J(str2))) {
            throw new FailedResponseException("authUrlResult.host == null");
        }
        String str3 = rVar.c;
        String str4 = rVar.b;
        if (str3 != null && !evu0.J(str3)) {
            return Uri.parse(rVar.c).buildUpon().appendEncodedPath("auth/session").appendQueryParameter("track_id", str4).build();
        }
        int i = x.a[frontendUrlType.ordinal()];
        com.yandex.passport.internal.network.e eVar = this.e;
        if (i == 1) {
            f = ((com.yandex.passport.internal.network.l) eVar).f(environment, Long.valueOf(j), str);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            com.yandex.passport.internal.network.l lVar = (com.yandex.passport.internal.network.l) eVar;
            lVar.getClass();
            f = lVar.j(environment, PassportUrlType.FRONTEND_ID, Long.valueOf(j), com.yandex.passport.internal.flags.p.c, new com.yandex.passport.internal.network.j(lVar, environment, str, j)).a;
        }
        return Uri.parse(f).buildUpon().appendEncodedPath("auth/session").appendQueryParameter("track_id", str4).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0122 A[Catch: all -> 0x0063, TryCatch #2 {all -> 0x0063, blocks: (B:30:0x005a, B:32:0x0118, B:34:0x0122, B:35:0x0138, B:61:0x0178, B:37:0x017e, B:39:0x0184, B:40:0x019b, B:42:0x01a1, B:48:0x01c0, B:64:0x0072, B:66:0x007a, B:67:0x00b2, B:71:0x0081, B:73:0x0085, B:75:0x0098, B:79:0x01d1, B:80:0x01d6), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0184 A[Catch: all -> 0x0063, TryCatch #2 {all -> 0x0063, blocks: (B:30:0x005a, B:32:0x0118, B:34:0x0122, B:35:0x0138, B:61:0x0178, B:37:0x017e, B:39:0x0184, B:40:0x019b, B:42:0x01a1, B:48:0x01c0, B:64:0x0072, B:66:0x007a, B:67:0x00b2, B:71:0x0081, B:73:0x0085, B:75:0x0098, B:79:0x01d1, B:80:0x01d6), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1 A[Catch: all -> 0x0063, TryCatch #2 {all -> 0x0063, blocks: (B:30:0x005a, B:32:0x0118, B:34:0x0122, B:35:0x0138, B:61:0x0178, B:37:0x017e, B:39:0x0184, B:40:0x019b, B:42:0x01a1, B:48:0x01c0, B:64:0x0072, B:66:0x007a, B:67:0x00b2, B:71:0x0081, B:73:0x0085, B:75:0x0098, B:79:0x01d1, B:80:0x01d6), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(w wVar, ContinuationImpl continuationImpl) {
        GetAuthorizationUrlUseCase$run$1 getAuthorizationUrlUseCase$run$1;
        ?? r4;
        Throwable th;
        Closeable closeable;
        Closeable w1Var;
        ModernAccount modernAccount;
        w wVar2;
        y yVar;
        com.yandex.passport.internal.ui.g gVar;
        long j;
        x1 x1Var;
        Object value;
        Object failure;
        y yVar2;
        long j2;
        Throwable a;
        Throwable a2;
        try {
            if (continuationImpl instanceof GetAuthorizationUrlUseCase$run$1) {
                getAuthorizationUrlUseCase$run$1 = (GetAuthorizationUrlUseCase$run$1) continuationImpl;
                int i = getAuthorizationUrlUseCase$run$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getAuthorizationUrlUseCase$run$1.label = i - Integer.MIN_VALUE;
                    Object obj = getAuthorizationUrlUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r4 = getAuthorizationUrlUseCase$run$1.label;
                    if (r4 != 0) {
                        kotlin.b.b(obj);
                        com.yandex.passport.internal.ui.domik.n nVar = this.i;
                        w1Var = new w1(this);
                        com.yandex.passport.internal.ui.sloth.e a3 = wVar.a();
                        if (a3 instanceof u) {
                            modernAccount = ((u) a3).s();
                        } else {
                            if (!(a3 instanceof v)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ModernAccount e = this.d.a().e(((v) a3).s());
                            if (e == null) {
                                Result result = new Result(new Result.Failure(new PassportAccountNotFoundException(((v) a3).s())));
                                w1Var.close();
                                return result;
                            }
                            modernAccount = e;
                        }
                        long locationId = modernAccount.getLocationId();
                        this.g.m(modernAccount.getUid(), locationId, wVar.b());
                        com.yandex.passport.data.network.s sVar = this.f;
                        com.yandex.passport.internal.network.mappers.b bVar = this.h;
                        Environment environment = modernAccount.getUid().getEnvironment();
                        bVar.getClass();
                        com.yandex.passport.data.network.n nVar2 = new com.yandex.passport.data.network.n(locationId, modernAccount.getMasterToken(), com.yandex.passport.internal.network.mappers.b.a(environment), wVar.d(), (String) wVar.b().get("yandexuid"));
                        getAuthorizationUrlUseCase$run$1.L$0 = this;
                        wVar2 = wVar;
                        getAuthorizationUrlUseCase$run$1.L$1 = wVar2;
                        getAuthorizationUrlUseCase$run$1.L$2 = this;
                        getAuthorizationUrlUseCase$run$1.L$3 = nVar;
                        getAuthorizationUrlUseCase$run$1.L$4 = w1Var;
                        getAuthorizationUrlUseCase$run$1.L$5 = modernAccount;
                        getAuthorizationUrlUseCase$run$1.J$0 = locationId;
                        getAuthorizationUrlUseCase$run$1.label = 1;
                        Object a4 = sVar.a(nVar2, getAuthorizationUrlUseCase$run$1);
                        if (a4 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        yVar = this;
                        gVar = nVar;
                        obj = a4;
                        j = locationId;
                        x1Var = yVar;
                    } else {
                        if (r4 != 1) {
                            if (r4 != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            value = getAuthorizationUrlUseCase$run$1.L$1;
                            closeable = (Closeable) getAuthorizationUrlUseCase$run$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                w1Var = closeable;
                                ooc.g(w1Var, null);
                                return new Result(value);
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    ooc.g(closeable, th);
                                    throw th3;
                                }
                            }
                        }
                        long j3 = getAuthorizationUrlUseCase$run$1.J$0;
                        ModernAccount modernAccount2 = (ModernAccount) getAuthorizationUrlUseCase$run$1.L$5;
                        w1Var = (Closeable) getAuthorizationUrlUseCase$run$1.L$4;
                        gVar = (com.yandex.passport.internal.ui.g) getAuthorizationUrlUseCase$run$1.L$3;
                        x1Var = (x1) getAuthorizationUrlUseCase$run$1.L$2;
                        w wVar3 = (w) getAuthorizationUrlUseCase$run$1.L$1;
                        yVar = (y) getAuthorizationUrlUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                        j = j3;
                        wVar2 = wVar3;
                        modernAccount = modernAccount2;
                    }
                    value = ((Result) obj).getValue();
                    if (!(value instanceof Result.Failure)) {
                        yVar.g.l(j, modernAccount.getUid(), ((com.yandex.passport.data.network.r) value).b, wVar2.b());
                    }
                    if (!(value instanceof Result.Failure)) {
                        try {
                            yVar2 = yVar;
                            j2 = j;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        try {
                            Uri c = yVar2.c(modernAccount.getUid().getEnvironment(), j2, (com.yandex.passport.data.network.r) value, wVar2.e(), wVar2.f(), wVar2.c());
                            yVar = yVar2;
                            j = j2;
                            com.yandex.passport.common.url.b.Companion.getClass();
                            failure = new com.yandex.passport.common.url.b(c.toString());
                        } catch (Throwable th5) {
                            th = th5;
                            yVar = yVar2;
                            j = j2;
                            failure = new Result.Failure(th);
                            value = failure;
                            a = Result.a(value);
                            if (a != null) {
                            }
                            a2 = Result.a(value);
                            if (a2 != null) {
                            }
                            ooc.g(w1Var, null);
                            return new Result(value);
                        }
                        value = failure;
                    }
                    a = Result.a(value);
                    if (a != null) {
                        yVar.g.k(j, modernAccount.getUid(), String.valueOf(a.getMessage()), wVar2.b());
                    }
                    a2 = Result.a(value);
                    if (a2 != null) {
                        getAuthorizationUrlUseCase$run$1.L$0 = w1Var;
                        getAuthorizationUrlUseCase$run$1.L$1 = value;
                        getAuthorizationUrlUseCase$run$1.L$2 = null;
                        getAuthorizationUrlUseCase$run$1.L$3 = null;
                        getAuthorizationUrlUseCase$run$1.L$4 = null;
                        getAuthorizationUrlUseCase$run$1.L$5 = null;
                        getAuthorizationUrlUseCase$run$1.label = 2;
                        Object emit = x1Var.b.emit(gVar.a(a2), getAuthorizationUrlUseCase$run$1);
                        if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            emit = zy11.a;
                        }
                        if (emit != coroutineSingletons) {
                            closeable = w1Var;
                            w1Var = closeable;
                        }
                        return coroutineSingletons;
                    }
                    ooc.g(w1Var, null);
                    return new Result(value);
                }
            }
            if (r4 != 0) {
            }
            value = ((Result) obj).getValue();
            if (!(value instanceof Result.Failure)) {
            }
            if (!(value instanceof Result.Failure)) {
            }
            a = Result.a(value);
            if (a != null) {
            }
            a2 = Result.a(value);
            if (a2 != null) {
            }
            ooc.g(w1Var, null);
            return new Result(value);
        } catch (Throwable th6) {
            th = th6;
            closeable = r4;
        }
        getAuthorizationUrlUseCase$run$1 = new GetAuthorizationUrlUseCase$run$1(this, continuationImpl);
        Object obj2 = getAuthorizationUrlUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r4 = getAuthorizationUrlUseCase$run$1.label;
    }
}
