package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.exception.PassportCredentialsNotFoundException;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.data.network.b4;
import com.yandex.passport.data.network.g4;
import com.yandex.passport.data.network.i4;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.reporters.DropPlace;
import com.yandex.passport.internal.report.x4;
import com.yandex.passport.internal.report.y4;
import defpackage.ny61;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes8.dex */
public final class h0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.properties.p b;
    public final com.yandex.passport.internal.database.n c;
    public final com.yandex.passport.internal.core.accounts.g d;
    public final i4 e;
    public final DatabaseHelper f;
    public final com.yandex.passport.internal.push.k0 g;
    public final com.yandex.passport.internal.report.reporters.b1 h;
    public final com.yandex.passport.internal.push.i0 i;
    public final com.yandex.passport.internal.network.mappers.b j;

    public h0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.properties.p pVar, com.yandex.passport.internal.database.n nVar, com.yandex.passport.internal.core.accounts.g gVar, i4 i4Var, DatabaseHelper databaseHelper, com.yandex.passport.internal.push.k0 k0Var, com.yandex.passport.internal.report.reporters.b1 b1Var, com.yandex.passport.internal.push.i0 i0Var, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = pVar;
        this.c = nVar;
        this.d = gVar;
        this.e = i4Var;
        this.f = databaseHelper;
        this.g = k0Var;
        this.h = b1Var;
        this.i = i0Var;
        this.j = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r5 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r5 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable e(h0 h0Var, g0 g0Var, ContinuationImpl continuationImpl) {
        GetClientTokenUseCase$run$1 getClientTokenUseCase$run$1;
        int i;
        Object c;
        Object d;
        if (continuationImpl instanceof GetClientTokenUseCase$run$1) {
            getClientTokenUseCase$run$1 = (GetClientTokenUseCase$run$1) continuationImpl;
            int i2 = getClientTokenUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getClientTokenUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getClientTokenUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getClientTokenUseCase$run$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        d = ((Result) obj).getValue();
                        return new Result(d);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                    return new Result(c);
                }
                kotlin.b.b(obj);
                Environment environment = g0Var.a().getUid().getEnvironment();
                ClientCredentials b = g0Var.b();
                if (b == null && (b = h0Var.b.r(environment)) == null) {
                    throw new PassportCredentialsNotFoundException(com.yandex.passport.internal.util.p.y(environment));
                }
                if (g0Var.c()) {
                    ModernAccount a = g0Var.a();
                    com.yandex.passport.internal.properties.p pVar = h0Var.b;
                    getClientTokenUseCase$run$1.label = 1;
                    d = h0Var.d(a, b, pVar, getClientTokenUseCase$run$1);
                } else {
                    ModernAccount a2 = g0Var.a();
                    com.yandex.passport.internal.properties.p pVar2 = h0Var.b;
                    getClientTokenUseCase$run$1.label = 2;
                    c = h0Var.c(a2, b, pVar2, getClientTokenUseCase$run$1);
                }
                return coroutineSingletons;
            }
        }
        getClientTokenUseCase$run$1 = new GetClientTokenUseCase$run$1(h0Var, continuationImpl);
        Object obj2 = getClientTokenUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getClientTokenUseCase$run$1.label;
        if (i == 0) {
        }
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return e(this, (g0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:10:0x0023, B:11:0x0071, B:25:0x0068), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ModernAccount modernAccount, ClientCredentials clientCredentials, com.yandex.passport.internal.properties.p pVar, ContinuationImpl continuationImpl) {
        GetClientTokenUseCase$getClientToken$1 getClientTokenUseCase$getClientToken$1;
        int i;
        Result.Failure failure;
        Object obj;
        Object d;
        try {
            if (continuationImpl instanceof GetClientTokenUseCase$getClientToken$1) {
                getClientTokenUseCase$getClientToken$1 = (GetClientTokenUseCase$getClientToken$1) continuationImpl;
                int i2 = getClientTokenUseCase$getClientToken$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    getClientTokenUseCase$getClientToken$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = getClientTokenUseCase$getClientToken$1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = getClientTokenUseCase$getClientToken$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        try {
                            obj = this.c.b(modernAccount.getUid(), clientCredentials.getDecryptedId());
                        } catch (TimeoutCancellationException e) {
                            failure = new Result.Failure(e);
                            obj = failure;
                            if (Result.a(obj) == null) {
                            }
                        } catch (CancellationException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                            obj = failure;
                            if (Result.a(obj) == null) {
                            }
                        }
                        if (obj == null) {
                            throw new InvalidTokenException();
                        }
                        if (Result.a(obj) == null) {
                            return obj;
                        }
                        getClientTokenUseCase$getClientToken$1.label = 1;
                        d = d(modernAccount, clientCredentials, pVar, getClientTokenUseCase$getClientToken$1);
                        if (d == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        d = ((Result) obj2).getValue();
                    }
                    kotlin.b.b(d);
                    return (ClientToken) d;
                }
            }
            if (i != 0) {
            }
            kotlin.b.b(d);
            return (ClientToken) d;
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        getClientTokenUseCase$getClientToken$1 = new GetClientTokenUseCase$getClientToken$1(this, continuationImpl);
        Object obj22 = getClientTokenUseCase$getClientToken$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getClientTokenUseCase$getClientToken$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ModernAccount modernAccount, ClientCredentials clientCredentials, com.yandex.passport.internal.properties.p pVar, ContinuationImpl continuationImpl) {
        GetClientTokenUseCase$getNewToken$1 getClientTokenUseCase$getNewToken$1;
        int i;
        ModernAccount modernAccount2;
        h0 h0Var;
        ClientCredentials clientCredentials2;
        Object value;
        Throwable a;
        if (continuationImpl instanceof GetClientTokenUseCase$getNewToken$1) {
            getClientTokenUseCase$getNewToken$1 = (GetClientTokenUseCase$getNewToken$1) continuationImpl;
            int i2 = getClientTokenUseCase$getNewToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getClientTokenUseCase$getNewToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getClientTokenUseCase$getNewToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getClientTokenUseCase$getNewToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Environment environment = modernAccount.getUid().getEnvironment();
                    this.j.getClass();
                    b4 b4Var = new b4(com.yandex.passport.internal.network.mappers.b.a(environment), modernAccount.getLocationId(), modernAccount.getMasterToken(), clientCredentials.getDecryptedId(), clientCredentials.getDecryptedSecret(), pVar.c, pVar.d);
                    getClientTokenUseCase$getNewToken$1.L$0 = this;
                    modernAccount2 = modernAccount;
                    getClientTokenUseCase$getNewToken$1.L$1 = modernAccount2;
                    getClientTokenUseCase$getNewToken$1.L$2 = clientCredentials;
                    getClientTokenUseCase$getNewToken$1.label = 1;
                    Object a2 = this.e.a(b4Var, getClientTokenUseCase$getNewToken$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    h0Var = this;
                    clientCredentials2 = clientCredentials;
                    obj = a2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    clientCredentials2 = (ClientCredentials) getClientTokenUseCase$getNewToken$1.L$2;
                    modernAccount2 = (ModernAccount) getClientTokenUseCase$getNewToken$1.L$1;
                    h0Var = (h0) getClientTokenUseCase$getNewToken$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    try {
                        value = new ClientToken(((g4) value).a(), clientCredentials2.getDecryptedId());
                    } catch (Throwable th) {
                        value = new Result.Failure(th);
                    }
                }
                boolean z = false;
                if (!(value instanceof Result.Failure)) {
                    com.yandex.passport.internal.report.reporters.b1 b1Var = h0Var.h;
                    com.yandex.passport.internal.push.i0 i0Var = h0Var.i;
                    String valueOf = String.valueOf(modernAccount2.getUid().getValue());
                    b1Var.getClass();
                    b1Var.f(y4.w, new jd(valueOf, 3));
                    h0Var.f.putClientToken(modernAccount2.getUid(), (ClientToken) value);
                    if (!i0Var.d(modernAccount2.getUid())) {
                        i0Var.a(modernAccount2.getUid(), true);
                        h0Var.g.b(modernAccount2.getUid());
                    }
                }
                a = Result.a(value);
                if (a != null) {
                    com.yandex.passport.internal.report.reporters.b1 b1Var2 = h0Var.h;
                    String valueOf2 = String.valueOf(a.getMessage());
                    String valueOf3 = String.valueOf(modernAccount2.getUid().getValue());
                    b1Var2.getClass();
                    b1Var2.f(x4.w, new com.yandex.passport.internal.report.a(valueOf2, 26, z), new jd(valueOf3, 3));
                    if (a instanceof InvalidTokenException) {
                        h0Var.d.d(modernAccount2, DropPlace.GET_CLIENT_TOKEN);
                    }
                }
                return value;
            }
        }
        getClientTokenUseCase$getNewToken$1 = new GetClientTokenUseCase$getNewToken$1(this, continuationImpl);
        Object obj2 = getClientTokenUseCase$getNewToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getClientTokenUseCase$getNewToken$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        boolean z2 = false;
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        return value;
    }
}
