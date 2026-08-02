package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.s1;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.methods.x2;
import defpackage.ny61;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes8.dex */
public final class a implements w0 {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.common.ui.lang.b b;
    public final s1 c;
    public final com.yandex.passport.data.network.m1 w;
    public final com.yandex.passport.internal.credentials.d x;
    public final com.yandex.passport.internal.methods.performer.error.a y;
    public final com.yandex.passport.internal.network.mappers.b z;

    public a(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.common.ui.lang.b bVar, s1 s1Var, com.yandex.passport.data.network.m1 m1Var, com.yandex.passport.internal.credentials.d dVar2, com.yandex.passport.internal.methods.performer.error.a aVar, com.yandex.passport.internal.network.mappers.b bVar2) {
        this.a = dVar;
        this.b = bVar;
        this.c = s1Var;
        this.w = m1Var;
        this.x = dVar2;
        this.y = aVar;
        this.z = bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0131, code lost:
    
        if (r3 != r5) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3 A[Catch: all -> 0x0157, CancellationException -> 0x015e, TimeoutCancellationException -> 0x0160, TryCatch #2 {TimeoutCancellationException -> 0x0160, CancellationException -> 0x015e, all -> 0x0157, blocks: (B:11:0x0034, B:12:0x0134, B:14:0x0147, B:15:0x014e, B:21:0x0057, B:23:0x00d0, B:25:0x00e3, B:26:0x00ea, B:28:0x0109, B:29:0x010d, B:33:0x0063, B:35:0x006f, B:37:0x009a, B:38:0x00a3, B:43:0x0151, B:44:0x0156), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109 A[Catch: all -> 0x0157, CancellationException -> 0x015e, TimeoutCancellationException -> 0x0160, TryCatch #2 {TimeoutCancellationException -> 0x0160, CancellationException -> 0x015e, all -> 0x0157, blocks: (B:11:0x0034, B:12:0x0134, B:14:0x0147, B:15:0x014e, B:21:0x0057, B:23:0x00d0, B:25:0x00e3, B:26:0x00ea, B:28:0x0109, B:29:0x010d, B:33:0x0063, B:35:0x006f, B:37:0x009a, B:38:0x00a3, B:43:0x0151, B:44:0x0156), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, Uid uid, String str, String str2, ContinuationImpl continuationImpl) {
        AcceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1 acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1;
        int i;
        com.yandex.passport.internal.j g;
        a aVar2;
        ModernAccount modernAccount;
        String str3;
        Uid uid2 = uid;
        String str4 = str2;
        aVar.getClass();
        try {
            if (continuationImpl instanceof AcceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1) {
                acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1 = (AcceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1) continuationImpl;
                int i2 = acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ModernAccount e = aVar.a.a().e(uid2);
                        if (e == null) {
                            throw new PassportAccountNotFoundException(uid2);
                        }
                        g = com.yandex.passport.internal.util.p.g(aVar.x.a, uid2.getEnvironment());
                        s1 s1Var = aVar.c;
                        com.yandex.passport.internal.network.mappers.b bVar = aVar.z;
                        Environment environment = uid2.getEnvironment();
                        bVar.getClass();
                        com.yandex.passport.data.network.n1 n1Var = new com.yandex.passport.data.network.n1(com.yandex.passport.internal.network.mappers.b.a(environment), e.getLocationId(), e.getMasterToken().getNonNullValueOrThrow(), str, str4 == null ? g.getDecryptedId() : str4, com.yandex.passport.common.ui.lang.a.b(((com.yandex.passport.internal.ui.lang.a) aVar.b).b()));
                        acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$0 = aVar;
                        acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$1 = uid2;
                        acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$2 = str;
                        acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$3 = str4;
                        acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$4 = g;
                        acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$5 = e;
                        acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.label = 1;
                        Object a = s1Var.a(n1Var, acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar2 = aVar;
                        modernAccount = e;
                        str3 = str;
                        obj = a;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            kotlin.b.b(((Result) obj).getValue());
                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "deviceAuthorizationCommitRequest ok", 8);
                            }
                            return zy11.a;
                        }
                        modernAccount = (ModernAccount) acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$5;
                        com.yandex.passport.internal.j jVar = (com.yandex.passport.internal.j) acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$4;
                        str4 = (String) acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$3;
                        String str5 = (String) acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$2;
                        Uid uid3 = (Uid) acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$1;
                        aVar2 = (a) acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$0;
                        kotlin.b.b(obj);
                        str3 = str5;
                        g = jVar;
                        uid2 = uid3;
                    }
                    kotlin.b.b(((Result) obj).getValue());
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "deviceAuthorizationSubmitRequest ok", 8);
                    }
                    com.yandex.passport.data.network.m1 m1Var = aVar2.w;
                    com.yandex.passport.internal.network.mappers.b bVar2 = aVar2.z;
                    Environment environment2 = uid2.getEnvironment();
                    bVar2.getClass();
                    com.yandex.passport.data.models.g a2 = com.yandex.passport.internal.network.mappers.b.a(environment2);
                    long locationId = modernAccount.getLocationId();
                    String nonNullValueOrThrow = modernAccount.getMasterToken().getNonNullValueOrThrow();
                    if (str4 == null) {
                        str4 = g.getDecryptedId();
                    }
                    com.yandex.passport.data.network.h1 h1Var = new com.yandex.passport.data.network.h1(a2, locationId, nonNullValueOrThrow, str3, str4, com.yandex.passport.common.ui.lang.a.b(((com.yandex.passport.internal.ui.lang.a) aVar2.b).b()));
                    acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$0 = null;
                    acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$1 = null;
                    acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$2 = null;
                    acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$3 = null;
                    acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$4 = null;
                    acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$5 = null;
                    acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.label = 2;
                    obj = m1Var.a(h1Var, acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1);
                }
            }
            if (i != 0) {
            }
            kotlin.b.b(((Result) obj).getValue());
            com.yandex.passport.common.logger.c cVar22 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            }
            com.yandex.passport.data.network.m1 m1Var2 = aVar2.w;
            com.yandex.passport.internal.network.mappers.b bVar22 = aVar2.z;
            Environment environment22 = uid2.getEnvironment();
            bVar22.getClass();
            com.yandex.passport.data.models.g a22 = com.yandex.passport.internal.network.mappers.b.a(environment22);
            long locationId2 = modernAccount.getLocationId();
            String nonNullValueOrThrow2 = modernAccount.getMasterToken().getNonNullValueOrThrow();
            if (str4 == null) {
            }
            com.yandex.passport.data.network.h1 h1Var2 = new com.yandex.passport.data.network.h1(a22, locationId2, nonNullValueOrThrow2, str3, str4, com.yandex.passport.common.ui.lang.a.b(((com.yandex.passport.internal.ui.lang.a) aVar2.b).b()));
            acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$0 = null;
            acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$1 = null;
            acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$2 = null;
            acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$3 = null;
            acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$4 = null;
            acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.L$5 = null;
            acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.label = 2;
            obj = m1Var2.a(h1Var2, acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1);
        } catch (TimeoutCancellationException e2) {
            return new Result.Failure(e2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1 = new AcceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1(aVar, continuationImpl);
        Object obj2 = acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = acceptDeviceAuthorizationPerformer$acceptDeviceAuthorization$1.label;
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new AcceptDeviceAuthorizationPerformer$performMethod$1((com.yandex.passport.internal.methods.w) x2Var, this, null));
    }
}
