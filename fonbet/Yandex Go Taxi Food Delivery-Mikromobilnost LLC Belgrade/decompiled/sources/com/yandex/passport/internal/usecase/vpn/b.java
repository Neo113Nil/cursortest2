package com.yandex.passport.internal.usecase.vpn;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.common.h;
import com.yandex.passport.internal.config.o;
import com.yandex.passport.internal.entities.VpnStatus;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.properties.q;
import com.yandex.passport.internal.report.bc;
import com.yandex.passport.internal.report.f;
import com.yandex.passport.internal.report.fc;
import com.yandex.passport.internal.report.reporters.g1;
import com.yandex.passport.internal.sloth.ConnectionType;
import com.yandex.passport.internal.util.p;
import defpackage.bvf0;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.g050;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class b {
    public final com.yandex.passport.common.coroutine.a a;
    public final com.yandex.passport.common.coroutine.e b;
    public final d c;
    public final h d;
    public final o e;
    public final j f;
    public final com.yandex.passport.internal.account.b g;
    public final com.yandex.passport.internal.sloth.c h;
    public final q i;
    public final g1 j;
    public final r0 k;
    public final gci0 l;
    public final n0 m;
    public final eci0 n;
    public volatile boolean o;
    public volatile com.yandex.passport.internal.sloth.a p;
    public final kotlinx.coroutines.sync.a q;
    public final kotlinx.coroutines.sync.a r;

    public b(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.coroutine.e eVar, d dVar, h hVar, o oVar, j jVar, com.yandex.passport.internal.account.b bVar, com.yandex.passport.internal.sloth.c cVar, q qVar, g1 g1Var) {
        this.a = aVar;
        this.b = eVar;
        this.c = dVar;
        this.d = hVar;
        this.e = oVar;
        this.f = jVar;
        this.g = bVar;
        this.h = cVar;
        this.i = qVar;
        this.j = g1Var;
        r0 c = bvf0.c(VpnStatus.Allowed.INSTANCE);
        this.k = c;
        this.l = kotlinx.coroutines.flow.e.d(c);
        n0 c2 = ffx.c(0, 0, null, 7);
        this.m = c2;
        this.n = kotlinx.coroutines.flow.e.c(c2);
        this.q = gtq0.a();
        this.r = gtq0.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0071, code lost:
    
        if (r13 == r2) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:18:0x008b, B:20:0x009a), top: B:17:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, ContinuationImpl continuationImpl) {
        CheckVpnStatusUseCase$publishActualStatusIfConnectionChanged$1 checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1;
        Object obj;
        int i;
        com.yandex.passport.internal.sloth.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        b bVar2;
        g050 g050Var;
        boolean z;
        bVar.getClass();
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof CheckVpnStatusUseCase$publishActualStatusIfConnectionChanged$1) {
            checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1 = (CheckVpnStatusUseCase$publishActualStatusIfConnectionChanged$1) continuationImpl;
            int i2 = checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "publishActualStatusIfConnectionChanged", 8);
                    }
                    com.yandex.passport.internal.sloth.c cVar2 = bVar.h;
                    checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$0 = bVar;
                    checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.label = 1;
                    obj2 = cVar2.a();
                } else if (i == 1) {
                    bVar = (b) checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$0;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj2);
                            return zy11Var;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = (g050) checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$2;
                    aVar = (com.yandex.passport.internal.sloth.a) checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$1;
                    bVar2 = (b) checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$0;
                    kotlin.b.b(obj2);
                    try {
                        com.yandex.passport.internal.sloth.a aVar3 = bVar2.p;
                        bVar2.p = aVar;
                        if (aVar.a != ConnectionType.CONNECTION_UNDEFINED.getCode()) {
                            if (jl40.l(aVar3, aVar)) {
                                z = false;
                                if (!z) {
                                    g1 g1Var = bVar2.j;
                                    String aVar4 = aVar.toString();
                                    g1Var.getClass();
                                    g1Var.i(fc.w, new f("network_state", aVar4));
                                    return zy11Var;
                                }
                                com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "start publishActualStatus", 8);
                                }
                                checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$0 = null;
                                checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$1 = null;
                                checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$2 = null;
                                checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.label = 3;
                                return bVar2.e("data_changed", checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1) == obj ? obj : zy11Var;
                            }
                        }
                        z = true;
                        if (!z) {
                        }
                    } finally {
                        g050Var.d(null);
                    }
                }
                aVar = (com.yandex.passport.internal.sloth.a) obj2;
                aVar2 = bVar.r;
                checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$0 = bVar;
                checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$1 = aVar;
                checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$2 = aVar2;
                checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.label = 2;
                if (aVar2.a(checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1) != obj) {
                    bVar2 = bVar;
                    g050Var = aVar2;
                    com.yandex.passport.internal.sloth.a aVar32 = bVar2.p;
                    bVar2.p = aVar;
                    if (aVar.a != ConnectionType.CONNECTION_UNDEFINED.getCode()) {
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
        }
        checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1 = new CheckVpnStatusUseCase$publishActualStatusIfConnectionChanged$1(bVar, continuationImpl);
        Object obj22 = checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.label;
        if (i != 0) {
        }
        aVar = (com.yandex.passport.internal.sloth.a) obj22;
        aVar2 = bVar.r;
        checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$0 = bVar;
        checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$1 = aVar;
        checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.L$2 = aVar2;
        checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1.label = 2;
        if (aVar2.a(checkVpnStatusUseCase$publishActualStatusIfConnectionChanged$1) != obj) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(6:11|12|13|(2:15|(1:17))|18|19)(2:22|23))(1:24))(1:30)|25|(1:27)|18|19))|34|6|7|(0)(0)|25|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0069, B:27:0x0057), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.passport.internal.usecase.vpn.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(final b bVar, ContinuationImpl continuationImpl) {
        CheckVpnStatusUseCase$registerNetworkCallbackIfNeeded$1 checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1;
        Object obj;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof CheckVpnStatusUseCase$registerNetworkCallbackIfNeeded$1) {
            checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1 = (CheckVpnStatusUseCase$registerNetworkCallbackIfNeeded$1) continuationImpl;
            int i2 = checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                obj = checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = bVar.d;
                    checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1.L$0 = bVar;
                    checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1.label = 1;
                    obj = hVar.a(checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Object failure = (Boolean) obj;
                        failure.getClass();
                        Throwable a = Result.a(failure);
                        if (a != null) {
                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Failed to register vpn network callback", a);
                            }
                        }
                        return zy11.a;
                    }
                    bVar = (b) checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    h hVar2 = bVar.d;
                    ?? r2 = new sls() { // from class: com.yandex.passport.internal.usecase.vpn.a
                        @Override // defpackage.sls
                        public final Object invoke() {
                            b bVar2 = b.this;
                            ((com.yandex.passport.common.coroutine.f) bVar2.b).getClass();
                            sjh sjhVar = uyj.a;
                            tje.N(bvf0.a(mdh.b.plus(p.o("io"))), ((com.yandex.passport.common.coroutine.b) bVar2.a).c, null, new CheckVpnStatusUseCase$registerNetworkCallbackIfNeeded$2$1$1(bVar2, null), 2);
                            return zy11.a;
                        }
                    };
                    checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1.L$0 = null;
                    checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1.label = 2;
                    obj = hVar2.b(r2, checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1);
                }
                return zy11.a;
            }
        }
        checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1 = new CheckVpnStatusUseCase$registerNetworkCallbackIfNeeded$1(bVar, continuationImpl);
        obj = checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkVpnStatusUseCase$registerNetworkCallbackIfNeeded$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }

    public final Object c(ContinuationImpl continuationImpl) {
        Object k0 = tje.k0(((com.yandex.passport.common.coroutine.b) this.a).c, new CheckVpnStatusUseCase$execute$2(this, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object d(Continuation continuation) {
        return tje.k0(((com.yandex.passport.common.coroutine.b) this.a).c, new CheckVpnStatusUseCase$isVpnChallengeActivityDisabled$2(this, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0072, code lost:
    
        if (r13.a(r1) == r2) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0034, B:20:0x004b, B:21:0x0091, B:24:0x009c, B:26:0x00a0, B:27:0x00a2, B:29:0x00ac, B:30:0x00bf, B:32:0x00e6, B:35:0x00ee), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0034, B:20:0x004b, B:21:0x0091, B:24:0x009c, B:26:0x00a0, B:27:0x00a2, B:29:0x00ac, B:30:0x00bf, B:32:0x00e6, B:35:0x00ee), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0034, B:20:0x004b, B:21:0x0091, B:24:0x009c, B:26:0x00a0, B:27:0x00a2, B:29:0x00ac, B:30:0x00bf, B:32:0x00e6, B:35:0x00ee), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0034, B:20:0x004b, B:21:0x0091, B:24:0x009c, B:26:0x00a0, B:27:0x00a2, B:29:0x00ac, B:30:0x00bf, B:32:0x00e6, B:35:0x00ee), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r11v12, types: [g050] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, Continuation continuation) {
        CheckVpnStatusUseCase$publishActualStatus$1 checkVpnStatusUseCase$publishActualStatus$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        String str2;
        Object a;
        g050 g050Var;
        Object value;
        VpnStatus vpnStatus;
        r0 r0Var;
        VpnStatus vpnStatus2;
        try {
            try {
                if (continuation instanceof CheckVpnStatusUseCase$publishActualStatus$1) {
                    checkVpnStatusUseCase$publishActualStatus$1 = (CheckVpnStatusUseCase$publishActualStatus$1) continuation;
                    int i2 = checkVpnStatusUseCase$publishActualStatus$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        checkVpnStatusUseCase$publishActualStatus$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = checkVpnStatusUseCase$publishActualStatus$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = checkVpnStatusUseCase$publishActualStatus$1.label;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            checkVpnStatusUseCase$publishActualStatus$1.L$0 = this;
                            checkVpnStatusUseCase$publishActualStatus$1.L$1 = str;
                            aVar = this.q;
                            checkVpnStatusUseCase$publishActualStatus$1.L$2 = aVar;
                            checkVpnStatusUseCase$publishActualStatus$1.label = 1;
                            str2 = str;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    vpnStatus2 = (VpnStatus) checkVpnStatusUseCase$publishActualStatus$1.L$1;
                                    g050Var = (g050) checkVpnStatusUseCase$publishActualStatus$1.L$0;
                                    kotlin.b.b(obj);
                                    g050Var.d(null);
                                    return vpnStatus2;
                                }
                                g050Var = (g050) checkVpnStatusUseCase$publishActualStatus$1.L$1;
                                this = (b) checkVpnStatusUseCase$publishActualStatus$1.L$0;
                                kotlin.b.b(obj);
                                value = ((Result) obj).getValue();
                                if (value instanceof Result.Failure) {
                                    value = null;
                                }
                                vpnStatus = (VpnStatus) value;
                                if (vpnStatus == null) {
                                    vpnStatus = VpnStatus.Allowed.INSTANCE;
                                }
                                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getAntirobotAnswerUseCase: " + vpnStatus, 8);
                                }
                                g1 g1Var = this.j;
                                r0Var = this.k;
                                String obj2 = vpnStatus.toString();
                                g1Var.getClass();
                                g1Var.i(bc.w, new f("vpn_status", obj2));
                                if (!jl40.l(r0Var.getValue(), vpnStatus)) {
                                    Object value2 = r0Var.getValue();
                                    g050Var.d(null);
                                    return value2;
                                }
                                checkVpnStatusUseCase$publishActualStatus$1.L$0 = g050Var;
                                checkVpnStatusUseCase$publishActualStatus$1.L$1 = vpnStatus;
                                checkVpnStatusUseCase$publishActualStatus$1.label = 3;
                                r0Var.emit(vpnStatus, checkVpnStatusUseCase$publishActualStatus$1);
                                if (zy11.a != coroutineSingletons) {
                                    vpnStatus2 = vpnStatus;
                                    g050Var.d(null);
                                    return vpnStatus2;
                                }
                                return coroutineSingletons;
                            }
                            ?? r11 = (g050) checkVpnStatusUseCase$publishActualStatus$1.L$2;
                            String str3 = (String) checkVpnStatusUseCase$publishActualStatus$1.L$1;
                            b bVar = (b) checkVpnStatusUseCase$publishActualStatus$1.L$0;
                            kotlin.b.b(obj);
                            aVar = r11;
                            this = bVar;
                            str2 = str3;
                        }
                        d dVar = this.c;
                        c cVar2 = new c(str2, Environment.PRODUCTION);
                        checkVpnStatusUseCase$publishActualStatus$1.L$0 = this;
                        checkVpnStatusUseCase$publishActualStatus$1.L$1 = aVar;
                        checkVpnStatusUseCase$publishActualStatus$1.L$2 = null;
                        checkVpnStatusUseCase$publishActualStatus$1.label = 2;
                        a = dVar.a(cVar2, checkVpnStatusUseCase$publishActualStatus$1);
                        if (a != coroutineSingletons) {
                            kotlinx.coroutines.sync.a aVar2 = aVar;
                            obj = a;
                            g050Var = aVar2;
                            value = ((Result) obj).getValue();
                            if (value instanceof Result.Failure) {
                            }
                            vpnStatus = (VpnStatus) value;
                            if (vpnStatus == null) {
                            }
                            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            }
                            g1 g1Var2 = this.j;
                            r0Var = this.k;
                            String obj22 = vpnStatus.toString();
                            g1Var2.getClass();
                            g1Var2.i(bc.w, new f("vpn_status", obj22));
                            if (!jl40.l(r0Var.getValue(), vpnStatus)) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                d dVar2 = this.c;
                c cVar22 = new c(str2, Environment.PRODUCTION);
                checkVpnStatusUseCase$publishActualStatus$1.L$0 = this;
                checkVpnStatusUseCase$publishActualStatus$1.L$1 = aVar;
                checkVpnStatusUseCase$publishActualStatus$1.L$2 = null;
                checkVpnStatusUseCase$publishActualStatus$1.label = 2;
                a = dVar2.a(cVar22, checkVpnStatusUseCase$publishActualStatus$1);
                if (a != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (Throwable th) {
                th = th;
                str = aVar;
                str.d(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        checkVpnStatusUseCase$publishActualStatus$1 = new CheckVpnStatusUseCase$publishActualStatus$1(this, continuation);
        Object obj3 = checkVpnStatusUseCase$publishActualStatus$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkVpnStatusUseCase$publishActualStatus$1.label;
    }

    public final Object f(Continuation continuation) {
        Object k0 = tje.k0(((com.yandex.passport.common.coroutine.b) this.a).c, new CheckVpnStatusUseCase$setStatusAllowed$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object g(boolean z, Continuation continuation) {
        Object k0 = tje.k0(((com.yandex.passport.common.coroutine.b) this.a).c, new CheckVpnStatusUseCase$setVpnChallengeActivityDisabled$2(this, z, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
