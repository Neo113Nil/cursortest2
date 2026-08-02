package com.yandex.passport.internal.usecase.vpn;

import android.content.SharedPreferences;
import com.yandex.passport.api.PassportAutoLoginMode;
import com.yandex.passport.api.PassportLatLng;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.l0;
import com.yandex.passport.data.network.m0;
import com.yandex.passport.data.network.n0;
import com.yandex.passport.data.network.o0;
import com.yandex.passport.data.network.p0;
import com.yandex.passport.data.network.q0;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.autologin.g;
import com.yandex.passport.internal.common.f;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.entities.VpnStatus;
import com.yandex.passport.internal.properties.c0;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.properties.q;
import com.yandex.passport.internal.provider.communication.i;
import com.yandex.passport.internal.provider.communication.k;
import com.yandex.passport.internal.usecase.g0;
import com.yandex.passport.internal.usecase.h0;
import defpackage.ny61;
import defpackage.tcc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes8.dex */
public final class d extends com.yandex.passport.common.domain.a {
    public final g b;
    public final com.yandex.passport.internal.account.a c;
    public final com.yandex.passport.internal.core.accounts.d d;
    public final p e;
    public final q f;
    public final h0 g;
    public final q0 h;
    public final com.yandex.passport.internal.network.mappers.b i;
    public final f j;
    public final com.yandex.passport.common.common.a k;
    public final com.yandex.passport.internal.config.p l;
    public final i m;

    public d(com.yandex.passport.common.coroutine.a aVar, g gVar, com.yandex.passport.internal.account.a aVar2, com.yandex.passport.internal.core.accounts.d dVar, p pVar, q qVar, h0 h0Var, q0 q0Var, com.yandex.passport.internal.network.mappers.b bVar, f fVar, com.yandex.passport.common.common.a aVar3, com.yandex.passport.internal.config.p pVar2, i iVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = gVar;
        this.c = aVar2;
        this.d = dVar;
        this.e = pVar;
        this.f = qVar;
        this.g = h0Var;
        this.h = q0Var;
        this.i = bVar;
        this.j = fVar;
        this.k = aVar3;
        this.l = pVar2;
        this.m = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r15 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r15 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Environment environment, ContinuationImpl continuationImpl) {
        GetAntirobotAnswerUseCase$getAuthToken$1 getAntirobotAnswerUseCase$getAuthToken$1;
        int i;
        ModernAccount a;
        ClientCredentials r;
        boolean z;
        if (continuationImpl instanceof GetAntirobotAnswerUseCase$getAuthToken$1) {
            getAntirobotAnswerUseCase$getAuthToken$1 = (GetAntirobotAnswerUseCase$getAuthToken$1) continuationImpl;
            int i2 = getAntirobotAnswerUseCase$getAuthToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getAntirobotAnswerUseCase$getAuthToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getAntirobotAnswerUseCase$getAuthToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getAntirobotAnswerUseCase$getAuthToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = this.c.a();
                    if (a == null) {
                        com.yandex.passport.internal.autologin.e eVar = new com.yandex.passport.internal.autologin.e(PassportAutoLoginMode.ONE_OR_MORE_ACCOUNT, this.d.a().f(), environment, null, null, 48);
                        getAntirobotAnswerUseCase$getAuthToken$1.L$0 = this;
                        getAntirobotAnswerUseCase$getAuthToken$1.label = 1;
                        obj = this.b.a(eVar, getAntirobotAnswerUseCase$getAuthToken$1);
                    }
                    r = this.e.r(a.getUid().getEnvironment());
                    if (r == null) {
                        return null;
                    }
                    h0 h0Var = this.g;
                    g0 g0Var = new g0(a, r, false);
                    getAntirobotAnswerUseCase$getAuthToken$1.L$0 = null;
                    getAntirobotAnswerUseCase$getAuthToken$1.label = 2;
                    obj = h0Var.a(g0Var, getAntirobotAnswerUseCase$getAuthToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Object value = ((Result) obj).getValue();
                        return (ClientToken) (value instanceof Result.Failure ? null : value);
                    }
                    this = (d) getAntirobotAnswerUseCase$getAuthToken$1.L$0;
                    kotlin.b.b(obj);
                }
                Object value2 = ((Result) obj).getValue();
                z = value2 instanceof Result.Failure;
                Object obj2 = value2;
                if (z) {
                    obj2 = null;
                }
                a = (ModernAccount) obj2;
                if (a == null) {
                    return null;
                }
                r = this.e.r(a.getUid().getEnvironment());
                if (r == null) {
                }
            }
        }
        getAntirobotAnswerUseCase$getAuthToken$1 = new GetAntirobotAnswerUseCase$getAuthToken$1(this, continuationImpl);
        Object obj3 = getAntirobotAnswerUseCase$getAuthToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getAntirobotAnswerUseCase$getAuthToken$1.label;
        if (i != 0) {
        }
        Object value22 = ((Result) obj3).getValue();
        z = value22 instanceof Result.Failure;
        Object obj22 = value22;
        if (z) {
        }
        a = (ModernAccount) obj22;
        if (a == null) {
        }
        r = this.e.r(a.getUid().getEnvironment());
        if (r == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|122|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0049, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x004a, code lost:
    
        r1 = "vpnBlockerProperties: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0045, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0046, code lost:
    
        r1 = "vpnBlockerProperties: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x008c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x008d, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0088, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0089, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x02cd, code lost:
    
        if (((com.yandex.passport.internal.provider.communication.k) r0).b(r2, r3) == r4) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0223 A[Catch: all -> 0x0112, TimeoutCancellationException -> 0x0115, CancellationException -> 0x028a, TryCatch #6 {CancellationException -> 0x028a, blocks: (B:16:0x0040, B:27:0x0055, B:29:0x0219, B:31:0x0223, B:33:0x0229, B:34:0x0237, B:36:0x023b, B:37:0x0257, B:38:0x025c, B:40:0x025d, B:43:0x0262, B:45:0x0266, B:46:0x026a, B:52:0x0068, B:54:0x00e4, B:56:0x0100, B:57:0x0118, B:59:0x0129, B:60:0x013d, B:61:0x0150, B:63:0x0156, B:65:0x0177, B:66:0x018e, B:68:0x0194, B:72:0x01b3, B:73:0x01bc, B:75:0x01e9, B:76:0x01f6, B:91:0x0082, B:93:0x00c9, B:98:0x0098, B:100:0x00b8, B:105:0x00a1), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0266 A[Catch: all -> 0x0112, TimeoutCancellationException -> 0x0115, CancellationException -> 0x028a, TryCatch #6 {CancellationException -> 0x028a, blocks: (B:16:0x0040, B:27:0x0055, B:29:0x0219, B:31:0x0223, B:33:0x0229, B:34:0x0237, B:36:0x023b, B:37:0x0257, B:38:0x025c, B:40:0x025d, B:43:0x0262, B:45:0x0266, B:46:0x026a, B:52:0x0068, B:54:0x00e4, B:56:0x0100, B:57:0x0118, B:59:0x0129, B:60:0x013d, B:61:0x0150, B:63:0x0156, B:65:0x0177, B:66:0x018e, B:68:0x0194, B:72:0x01b3, B:73:0x01bc, B:75:0x01e9, B:76:0x01f6, B:91:0x0082, B:93:0x00c9, B:98:0x0098, B:100:0x00b8, B:105:0x00a1), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100 A[Catch: all -> 0x0112, TimeoutCancellationException -> 0x0115, CancellationException -> 0x028a, TryCatch #6 {CancellationException -> 0x028a, blocks: (B:16:0x0040, B:27:0x0055, B:29:0x0219, B:31:0x0223, B:33:0x0229, B:34:0x0237, B:36:0x023b, B:37:0x0257, B:38:0x025c, B:40:0x025d, B:43:0x0262, B:45:0x0266, B:46:0x026a, B:52:0x0068, B:54:0x00e4, B:56:0x0100, B:57:0x0118, B:59:0x0129, B:60:0x013d, B:61:0x0150, B:63:0x0156, B:65:0x0177, B:66:0x018e, B:68:0x0194, B:72:0x01b3, B:73:0x01bc, B:75:0x01e9, B:76:0x01f6, B:91:0x0082, B:93:0x00c9, B:98:0x0098, B:100:0x00b8, B:105:0x00a1), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129 A[Catch: all -> 0x0112, TimeoutCancellationException -> 0x0115, CancellationException -> 0x028a, TryCatch #6 {CancellationException -> 0x028a, blocks: (B:16:0x0040, B:27:0x0055, B:29:0x0219, B:31:0x0223, B:33:0x0229, B:34:0x0237, B:36:0x023b, B:37:0x0257, B:38:0x025c, B:40:0x025d, B:43:0x0262, B:45:0x0266, B:46:0x026a, B:52:0x0068, B:54:0x00e4, B:56:0x0100, B:57:0x0118, B:59:0x0129, B:60:0x013d, B:61:0x0150, B:63:0x0156, B:65:0x0177, B:66:0x018e, B:68:0x0194, B:72:0x01b3, B:73:0x01bc, B:75:0x01e9, B:76:0x01f6, B:91:0x0082, B:93:0x00c9, B:98:0x0098, B:100:0x00b8, B:105:0x00a1), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156 A[Catch: all -> 0x0112, TimeoutCancellationException -> 0x0115, CancellationException -> 0x028a, LOOP:0: B:61:0x0150->B:63:0x0156, LOOP_END, TryCatch #6 {CancellationException -> 0x028a, blocks: (B:16:0x0040, B:27:0x0055, B:29:0x0219, B:31:0x0223, B:33:0x0229, B:34:0x0237, B:36:0x023b, B:37:0x0257, B:38:0x025c, B:40:0x025d, B:43:0x0262, B:45:0x0266, B:46:0x026a, B:52:0x0068, B:54:0x00e4, B:56:0x0100, B:57:0x0118, B:59:0x0129, B:60:0x013d, B:61:0x0150, B:63:0x0156, B:65:0x0177, B:66:0x018e, B:68:0x0194, B:72:0x01b3, B:73:0x01bc, B:75:0x01e9, B:76:0x01f6, B:91:0x0082, B:93:0x00c9, B:98:0x0098, B:100:0x00b8, B:105:0x00a1), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194 A[Catch: all -> 0x0112, TimeoutCancellationException -> 0x0115, CancellationException -> 0x028a, LOOP:1: B:66:0x018e->B:68:0x0194, LOOP_END, TryCatch #6 {CancellationException -> 0x028a, blocks: (B:16:0x0040, B:27:0x0055, B:29:0x0219, B:31:0x0223, B:33:0x0229, B:34:0x0237, B:36:0x023b, B:37:0x0257, B:38:0x025c, B:40:0x025d, B:43:0x0262, B:45:0x0266, B:46:0x026a, B:52:0x0068, B:54:0x00e4, B:56:0x0100, B:57:0x0118, B:59:0x0129, B:60:0x013d, B:61:0x0150, B:63:0x0156, B:65:0x0177, B:66:0x018e, B:68:0x0194, B:72:0x01b3, B:73:0x01bc, B:75:0x01e9, B:76:0x01f6, B:91:0x0082, B:93:0x00c9, B:98:0x0098, B:100:0x00b8, B:105:0x00a1), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b3 A[Catch: all -> 0x0112, TimeoutCancellationException -> 0x0115, CancellationException -> 0x028a, TryCatch #6 {CancellationException -> 0x028a, blocks: (B:16:0x0040, B:27:0x0055, B:29:0x0219, B:31:0x0223, B:33:0x0229, B:34:0x0237, B:36:0x023b, B:37:0x0257, B:38:0x025c, B:40:0x025d, B:43:0x0262, B:45:0x0266, B:46:0x026a, B:52:0x0068, B:54:0x00e4, B:56:0x0100, B:57:0x0118, B:59:0x0129, B:60:0x013d, B:61:0x0150, B:63:0x0156, B:65:0x0177, B:66:0x018e, B:68:0x0194, B:72:0x01b3, B:73:0x01bc, B:75:0x01e9, B:76:0x01f6, B:91:0x0082, B:93:0x00c9, B:98:0x0098, B:100:0x00b8, B:105:0x00a1), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e9 A[Catch: all -> 0x0112, TimeoutCancellationException -> 0x0115, CancellationException -> 0x028a, TryCatch #6 {CancellationException -> 0x028a, blocks: (B:16:0x0040, B:27:0x0055, B:29:0x0219, B:31:0x0223, B:33:0x0229, B:34:0x0237, B:36:0x023b, B:37:0x0257, B:38:0x025c, B:40:0x025d, B:43:0x0262, B:45:0x0266, B:46:0x026a, B:52:0x0068, B:54:0x00e4, B:56:0x0100, B:57:0x0118, B:59:0x0129, B:60:0x013d, B:61:0x0150, B:63:0x0156, B:65:0x0177, B:66:0x018e, B:68:0x0194, B:72:0x01b3, B:73:0x01bc, B:75:0x01e9, B:76:0x01f6, B:91:0x0082, B:93:0x00c9, B:98:0x0098, B:100:0x00b8, B:105:0x00a1), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(c cVar, ContinuationImpl continuationImpl) {
        GetAntirobotAnswerUseCase$run$1 getAntirobotAnswerUseCase$run$1;
        ?? r5;
        ?? r1;
        ?? r12;
        Result.Failure failure;
        d dVar;
        d dVar2;
        Object obj;
        Throwable a;
        Object obj2;
        i iVar;
        VpnStatus.Pending pending;
        c cVar2;
        d dVar3;
        d dVar4;
        com.yandex.passport.internal.common.g a2;
        ClientToken clientToken;
        c cVar3;
        d dVar5;
        com.yandex.passport.internal.common.g gVar;
        com.yandex.passport.common.common.a aVar;
        f fVar;
        o0 o0Var;
        d dVar6;
        Object value;
        Object obj3;
        VpnStatus vpnStatus;
        i iVar2;
        d dVar7 = this;
        try {
            if (continuationImpl instanceof GetAntirobotAnswerUseCase$run$1) {
                getAntirobotAnswerUseCase$run$1 = (GetAntirobotAnswerUseCase$run$1) continuationImpl;
                int i = getAntirobotAnswerUseCase$run$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getAntirobotAnswerUseCase$run$1.label = i - Integer.MIN_VALUE;
                    Object obj4 = getAntirobotAnswerUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r5 = getAntirobotAnswerUseCase$run$1.label;
                    switch (r5) {
                        case 0:
                            kotlin.b.b(obj4);
                            try {
                                iVar = dVar7.m;
                                pending = VpnStatus.Pending.INSTANCE;
                                getAntirobotAnswerUseCase$run$1.L$0 = dVar7;
                                cVar2 = cVar;
                                getAntirobotAnswerUseCase$run$1.L$1 = cVar2;
                                getAntirobotAnswerUseCase$run$1.label = 1;
                                dVar3 = dVar7;
                            } catch (TimeoutCancellationException e) {
                                e = e;
                                r12 = dVar7;
                                failure = new Result.Failure(e);
                                dVar = r12;
                                Result.Failure failure2 = failure;
                                dVar2 = dVar;
                                obj = failure2;
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                return new Result(obj);
                            } catch (Throwable th) {
                                th = th;
                                r1 = dVar7;
                                failure = new Result.Failure(th);
                                dVar = r1;
                                Result.Failure failure22 = failure;
                                dVar2 = dVar;
                                obj = failure22;
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                return new Result(obj);
                            }
                            if (((k) iVar).b(pending, getAntirobotAnswerUseCase$run$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            Environment environment = cVar2.a;
                            getAntirobotAnswerUseCase$run$1.L$0 = dVar3;
                            getAntirobotAnswerUseCase$run$1.L$1 = cVar2;
                            getAntirobotAnswerUseCase$run$1.label = 2;
                            obj4 = dVar3.c(environment, getAntirobotAnswerUseCase$run$1);
                            dVar4 = dVar3;
                            if (obj4 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ClientToken clientToken2 = (ClientToken) obj4;
                            f fVar2 = dVar4.j;
                            getAntirobotAnswerUseCase$run$1.L$0 = dVar4;
                            getAntirobotAnswerUseCase$run$1.L$1 = cVar2;
                            getAntirobotAnswerUseCase$run$1.L$2 = clientToken2;
                            getAntirobotAnswerUseCase$run$1.label = 3;
                            a2 = fVar2.a();
                            if (a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            c cVar4 = cVar2;
                            clientToken = clientToken2;
                            obj4 = a2;
                            cVar3 = cVar4;
                            dVar5 = dVar4;
                            gVar = (com.yandex.passport.internal.common.g) obj4;
                            q qVar = dVar5.f;
                            com.yandex.passport.common.common.a aVar2 = dVar5.k;
                            f fVar3 = dVar5.j;
                            c0 c0Var = (c0) qVar.f.a.getValue();
                            com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "vpnBlockerProperties: " + c0Var, 8);
                            }
                            q0 q0Var = dVar5.h;
                            com.yandex.passport.internal.network.mappers.b bVar = dVar5.i;
                            Environment environment2 = cVar3.a;
                            bVar.getClass();
                            com.yandex.passport.data.models.g a3 = com.yandex.passport.internal.network.mappers.b.a(environment2);
                            String str = cVar3.b;
                            if (gVar == null) {
                                aVar = aVar2;
                                fVar = fVar3;
                                o0Var = new o0(gVar.a, gVar.b);
                            } else {
                                aVar = aVar2;
                                fVar = fVar3;
                                o0Var = null;
                            }
                            List<PassportLatLng> list = c0Var.a;
                            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                            for (PassportLatLng passportLatLng : list) {
                                arrayList.add(new o0(passportLatLng.getLat(), passportLatLng.getLon()));
                                clientToken = clientToken;
                                str = str;
                            }
                            ClientToken clientToken3 = clientToken;
                            String str2 = str;
                            List<PassportLatLng> list2 = c0Var.b;
                            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                            for (PassportLatLng passportLatLng2 : list2) {
                                arrayList2.add(new o0(passportLatLng2.getLat(), passportLatLng2.getLon()));
                                aVar = aVar;
                            }
                            com.yandex.passport.common.common.a aVar3 = aVar;
                            String value2 = clientToken3 == null ? clientToken3.getValue() : null;
                            String a4 = ((com.yandex.passport.internal.common.e) aVar3).a();
                            String b = ((com.yandex.passport.internal.common.e) aVar3).b();
                            Pair pair = new Pair(fVar.b(), fVar.c());
                            String d = fVar.d();
                            SharedPreferences b2 = dVar5.l.a.b(cVar3.a);
                            p0 p0Var = new p0(a3, str2, o0Var, arrayList, arrayList2, value2, a4, b, pair, d, b2 == null ? b2.getString("vpn_cookie", null) : null, c0Var.c);
                            getAntirobotAnswerUseCase$run$1.L$0 = dVar5;
                            getAntirobotAnswerUseCase$run$1.L$1 = cVar3;
                            getAntirobotAnswerUseCase$run$1.L$2 = null;
                            getAntirobotAnswerUseCase$run$1.label = 4;
                            obj4 = q0Var.a(p0Var, getAntirobotAnswerUseCase$run$1);
                            dVar6 = dVar5;
                            if (obj4 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            value = ((Result) obj4).getValue();
                            if (!(value instanceof Result.Failure)) {
                                n0 n0Var = (n0) value;
                                if (n0Var instanceof l0) {
                                    dVar6.l.a(cVar3.a, ((l0) n0Var).a);
                                    value = VpnStatus.Allowed.INSTANCE;
                                } else {
                                    if (!(n0Var instanceof m0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar6.l.a(cVar3.a, ((m0) n0Var).a());
                                    value = new VpnStatus.Blocked(((m0) n0Var).b());
                                }
                            }
                            obj3 = value;
                            if (obj3 instanceof Result.Failure) {
                                obj3 = null;
                            }
                            VpnStatus vpnStatus2 = (VpnStatus) obj3;
                            vpnStatus = vpnStatus2 == null ? VpnStatus.Allowed.INSTANCE : vpnStatus2;
                            iVar2 = dVar6.m;
                            getAntirobotAnswerUseCase$run$1.L$0 = dVar6;
                            getAntirobotAnswerUseCase$run$1.L$1 = vpnStatus;
                            getAntirobotAnswerUseCase$run$1.label = 5;
                            if (((k) iVar2).b(vpnStatus, getAntirobotAnswerUseCase$run$1) != coroutineSingletons) {
                                dVar2 = dVar6;
                                obj = vpnStatus;
                                a = Result.a(obj);
                                if (a != null) {
                                    com.yandex.passport.common.logger.c cVar6 = com.yandex.passport.common.logger.a.a;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        obj2 = null;
                                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onFailure: " + a, 8);
                                    } else {
                                        obj2 = null;
                                    }
                                    i iVar3 = dVar2.m;
                                    VpnStatus.Allowed allowed = VpnStatus.Allowed.INSTANCE;
                                    getAntirobotAnswerUseCase$run$1.L$0 = obj;
                                    getAntirobotAnswerUseCase$run$1.L$1 = obj2;
                                    getAntirobotAnswerUseCase$run$1.L$2 = obj2;
                                    getAntirobotAnswerUseCase$run$1.label = 6;
                                    break;
                                }
                                return new Result(obj);
                            }
                            return coroutineSingletons;
                        case 1:
                            c cVar7 = (c) getAntirobotAnswerUseCase$run$1.L$1;
                            d dVar8 = (d) getAntirobotAnswerUseCase$run$1.L$0;
                            kotlin.b.b(obj4);
                            cVar2 = cVar7;
                            dVar3 = dVar8;
                            Environment environment3 = cVar2.a;
                            getAntirobotAnswerUseCase$run$1.L$0 = dVar3;
                            getAntirobotAnswerUseCase$run$1.L$1 = cVar2;
                            getAntirobotAnswerUseCase$run$1.label = 2;
                            obj4 = dVar3.c(environment3, getAntirobotAnswerUseCase$run$1);
                            dVar4 = dVar3;
                            if (obj4 == coroutineSingletons) {
                            }
                            ClientToken clientToken22 = (ClientToken) obj4;
                            f fVar22 = dVar4.j;
                            getAntirobotAnswerUseCase$run$1.L$0 = dVar4;
                            getAntirobotAnswerUseCase$run$1.L$1 = cVar2;
                            getAntirobotAnswerUseCase$run$1.L$2 = clientToken22;
                            getAntirobotAnswerUseCase$run$1.label = 3;
                            a2 = fVar22.a();
                            if (a2 == coroutineSingletons) {
                            }
                            break;
                        case 2:
                            c cVar8 = (c) getAntirobotAnswerUseCase$run$1.L$1;
                            d dVar9 = (d) getAntirobotAnswerUseCase$run$1.L$0;
                            kotlin.b.b(obj4);
                            cVar2 = cVar8;
                            dVar4 = dVar9;
                            ClientToken clientToken222 = (ClientToken) obj4;
                            f fVar222 = dVar4.j;
                            getAntirobotAnswerUseCase$run$1.L$0 = dVar4;
                            getAntirobotAnswerUseCase$run$1.L$1 = cVar2;
                            getAntirobotAnswerUseCase$run$1.L$2 = clientToken222;
                            getAntirobotAnswerUseCase$run$1.label = 3;
                            a2 = fVar222.a();
                            if (a2 == coroutineSingletons) {
                            }
                            break;
                        case 3:
                            ClientToken clientToken4 = (ClientToken) getAntirobotAnswerUseCase$run$1.L$2;
                            cVar3 = (c) getAntirobotAnswerUseCase$run$1.L$1;
                            d dVar10 = (d) getAntirobotAnswerUseCase$run$1.L$0;
                            try {
                                kotlin.b.b(obj4);
                                clientToken = clientToken4;
                                dVar5 = dVar10;
                                gVar = (com.yandex.passport.internal.common.g) obj4;
                                q qVar2 = dVar5.f;
                                com.yandex.passport.common.common.a aVar22 = dVar5.k;
                                f fVar32 = dVar5.j;
                                c0 c0Var2 = (c0) qVar2.f.a.getValue();
                                com.yandex.passport.common.logger.c cVar52 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                }
                                q0 q0Var2 = dVar5.h;
                                com.yandex.passport.internal.network.mappers.b bVar2 = dVar5.i;
                                Environment environment22 = cVar3.a;
                                bVar2.getClass();
                                com.yandex.passport.data.models.g a32 = com.yandex.passport.internal.network.mappers.b.a(environment22);
                                String str3 = cVar3.b;
                                if (gVar == null) {
                                }
                                List<PassportLatLng> list3 = c0Var2.a;
                                ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                                while (r0.hasNext()) {
                                }
                                ClientToken clientToken32 = clientToken;
                                String str22 = str3;
                                List<PassportLatLng> list22 = c0Var2.b;
                                ArrayList arrayList22 = new ArrayList(tcc.n(list22, 10));
                                while (r0.hasNext()) {
                                }
                                com.yandex.passport.common.common.a aVar32 = aVar;
                                if (clientToken32 == null) {
                                }
                                String a42 = ((com.yandex.passport.internal.common.e) aVar32).a();
                                String b3 = ((com.yandex.passport.internal.common.e) aVar32).b();
                                Pair pair2 = new Pair(fVar.b(), fVar.c());
                                String d2 = fVar.d();
                                SharedPreferences b22 = dVar5.l.a.b(cVar3.a);
                                p0 p0Var2 = new p0(a32, str22, o0Var, arrayList3, arrayList22, value2, a42, b3, pair2, d2, b22 == null ? b22.getString("vpn_cookie", null) : null, c0Var2.c);
                                getAntirobotAnswerUseCase$run$1.L$0 = dVar5;
                                getAntirobotAnswerUseCase$run$1.L$1 = cVar3;
                                getAntirobotAnswerUseCase$run$1.L$2 = null;
                                getAntirobotAnswerUseCase$run$1.label = 4;
                                obj4 = q0Var2.a(p0Var2, getAntirobotAnswerUseCase$run$1);
                                dVar6 = dVar5;
                                if (obj4 == coroutineSingletons) {
                                }
                                value = ((Result) obj4).getValue();
                                if (!(value instanceof Result.Failure)) {
                                }
                                obj3 = value;
                                if (obj3 instanceof Result.Failure) {
                                }
                                VpnStatus vpnStatus22 = (VpnStatus) obj3;
                                if (vpnStatus22 == null) {
                                }
                                iVar2 = dVar6.m;
                                getAntirobotAnswerUseCase$run$1.L$0 = dVar6;
                                getAntirobotAnswerUseCase$run$1.L$1 = vpnStatus;
                                getAntirobotAnswerUseCase$run$1.label = 5;
                                if (((k) iVar2).b(vpnStatus, getAntirobotAnswerUseCase$run$1) != coroutineSingletons) {
                                }
                            } catch (TimeoutCancellationException e2) {
                                e = e2;
                                r12 = dVar10;
                                failure = new Result.Failure(e);
                                dVar = r12;
                                Result.Failure failure222 = failure;
                                dVar2 = dVar;
                                obj = failure222;
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                return new Result(obj);
                            } catch (Throwable th2) {
                                th = th2;
                                r1 = dVar10;
                                failure = new Result.Failure(th);
                                dVar = r1;
                                Result.Failure failure2222 = failure;
                                dVar2 = dVar;
                                obj = failure2222;
                                a = Result.a(obj);
                                if (a != null) {
                                }
                                return new Result(obj);
                            }
                            return coroutineSingletons;
                        case 4:
                            c cVar9 = (c) getAntirobotAnswerUseCase$run$1.L$1;
                            d dVar11 = (d) getAntirobotAnswerUseCase$run$1.L$0;
                            kotlin.b.b(obj4);
                            cVar3 = cVar9;
                            dVar6 = dVar11;
                            value = ((Result) obj4).getValue();
                            if (!(value instanceof Result.Failure)) {
                            }
                            obj3 = value;
                            if (obj3 instanceof Result.Failure) {
                            }
                            VpnStatus vpnStatus222 = (VpnStatus) obj3;
                            if (vpnStatus222 == null) {
                            }
                            iVar2 = dVar6.m;
                            getAntirobotAnswerUseCase$run$1.L$0 = dVar6;
                            getAntirobotAnswerUseCase$run$1.L$1 = vpnStatus;
                            getAntirobotAnswerUseCase$run$1.label = 5;
                            if (((k) iVar2).b(vpnStatus, getAntirobotAnswerUseCase$run$1) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        case 5:
                            obj = (VpnStatus) getAntirobotAnswerUseCase$run$1.L$1;
                            dVar2 = (d) getAntirobotAnswerUseCase$run$1.L$0;
                            kotlin.b.b(obj4);
                            a = Result.a(obj);
                            if (a != null) {
                            }
                            return new Result(obj);
                        case 6:
                            obj = getAntirobotAnswerUseCase$run$1.L$0;
                            kotlin.b.b(obj4);
                            return new Result(obj);
                        default:
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (r5) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        getAntirobotAnswerUseCase$run$1 = new GetAntirobotAnswerUseCase$run$1(dVar7, continuationImpl);
        Object obj42 = getAntirobotAnswerUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r5 = getAntirobotAnswerUseCase$run$1.label;
    }
}
