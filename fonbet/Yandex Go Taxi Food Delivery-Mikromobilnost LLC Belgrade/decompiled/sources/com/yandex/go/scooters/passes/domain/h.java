package com.yandex.go.scooters.passes.domain;

import com.yandex.go.flex.common.api.actions.CloseAction;
import com.yandex.go.flex.common.api.actions.OpenWebAction;
import com.yandex.go.scooters.bdui.api.ScootersBduiNavigationAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersAcceptWinbackAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersBroadcastAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersBuyPassAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersChangeAutorenewPaymentMethod;
import com.yandex.go.scooters.passes.data.model.actions.ScootersDisableAutorenewAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersEnableAutorenewAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersFreezePassAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersOpenPaymentMethodsAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersUnfreezePassAction;
import com.yandex.go.scooters.passes.exception.ScootersNoSelectedPaymentMethodException;
import com.yandex.go.scooters.passes.model.PassPayment;
import com.yandex.go.scooters.passes.model.PassPaymentType;
import com.yandex.go.scooters.passes.model.PassType;
import defpackage.cwn0;
import defpackage.ehn0;
import defpackage.gqy;
import defpackage.gz;
import defpackage.jl40;
import defpackage.joo0;
import defpackage.keo0;
import defpackage.kr;
import defpackage.leo0;
import defpackage.m3b1;
import defpackage.meo0;
import defpackage.moo0;
import defpackage.ndo0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.rdo0;
import defpackage.sls;
import defpackage.tco0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vfo0;
import defpackage.wdo0;
import defpackage.xco0;
import defpackage.yfo0;
import defpackage.ysi0;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes13.dex */
public final class h implements cwn0 {
    public final tse a;
    public final yfo0 b;
    public final com.yandex.go.scooters.passes.data.jason.a c;
    public final i d;
    public final tco0 e;
    public final vfo0 f;
    public final com.yandex.go.scooters.payments.domain.a g;
    public final g h;
    public final xco0 i;
    public final ndo0 j;
    public final rdo0 k;
    public pzt0 l;
    public pzt0 m;
    public pzt0 n;
    public pzt0 o;
    public final AtomicReference p = new AtomicReference(null);

    public h(tse tseVar, yfo0 yfo0Var, com.yandex.go.scooters.passes.data.jason.a aVar, i iVar, tco0 tco0Var, vfo0 vfo0Var, com.yandex.go.scooters.payments.domain.a aVar2, g gVar, xco0 xco0Var, ndo0 ndo0Var, rdo0 rdo0Var) {
        this.a = tseVar;
        this.b = yfo0Var;
        this.c = aVar;
        this.d = iVar;
        this.e = tco0Var;
        this.f = vfo0Var;
        this.g = aVar2;
        this.h = gVar;
        this.i = xco0Var;
        this.j = ndo0Var;
        this.k = rdo0Var;
    }

    public static final Object a(h hVar, String str, String str2, String str3, boolean z, SuspendLambda suspendLambda) {
        Object obj;
        yfo0 yfo0Var = hVar.b;
        Iterator<E> it = PassPaymentType.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((PassPaymentType) obj).name(), str3)) {
                break;
            }
        }
        PassPaymentType passPaymentType = (PassPaymentType) obj;
        if (passPaymentType == null) {
            passPaymentType = PassPaymentType.CARD;
        }
        return ((com.yandex.go.scooters.passes.data.d) yfo0Var).g(str, true, new PassPayment(passPaymentType, str2, z), suspendLambda);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (r6.a.emit(r8, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(h hVar, Object obj, Continuation continuation) {
        ScootersPassesDocumentsInteractor$handlePurchasingStatus$1 scootersPassesDocumentsInteractor$handlePurchasingStatus$1;
        int i;
        Object emit;
        hVar.getClass();
        if (continuation instanceof ScootersPassesDocumentsInteractor$handlePurchasingStatus$1) {
            scootersPassesDocumentsInteractor$handlePurchasingStatus$1 = (ScootersPassesDocumentsInteractor$handlePurchasingStatus$1) continuation;
            int i2 = scootersPassesDocumentsInteractor$handlePurchasingStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesDocumentsInteractor$handlePurchasingStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPassesDocumentsInteractor$handlePurchasingStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesDocumentsInteractor$handlePurchasingStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Throwable a = Result.a(obj);
                    if (a != null) {
                        scootersPassesDocumentsInteractor$handlePurchasingStatus$1.L$0 = null;
                        scootersPassesDocumentsInteractor$handlePurchasingStatus$1.L$1 = obj;
                        scootersPassesDocumentsInteractor$handlePurchasingStatus$1.L$2 = null;
                        scootersPassesDocumentsInteractor$handlePurchasingStatus$1.label = 1;
                        if (a instanceof ScootersNoSelectedPaymentMethodException) {
                            rdo0 rdo0Var = hVar.k;
                            emit = rdo0Var.a.emit(keo0.b, scootersPassesDocumentsInteractor$handlePurchasingStatus$1);
                        } else {
                            emit = hVar.j.a.emit(a, scootersPassesDocumentsInteractor$handlePurchasingStatus$1);
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    obj = scootersPassesDocumentsInteractor$handlePurchasingStatus$1.L$1;
                    kotlin.b.b(obj2);
                }
                if (!(obj instanceof Result.Failure)) {
                    boolean l = jl40.l((moo0) obj, joo0.a);
                    com.yandex.go.scooters.passes.data.jason.a aVar = hVar.c;
                    if (l) {
                        aVar.c(true);
                    } else {
                        aVar.c(false);
                        kr krVar = (kr) hVar.p.getAndSet(null);
                        if (krVar != null) {
                            tco0 tco0Var = hVar.e;
                            scootersPassesDocumentsInteractor$handlePurchasingStatus$1.L$0 = null;
                            scootersPassesDocumentsInteractor$handlePurchasingStatus$1.L$1 = obj;
                            scootersPassesDocumentsInteractor$handlePurchasingStatus$1.L$2 = null;
                            scootersPassesDocumentsInteractor$handlePurchasingStatus$1.L$3 = null;
                            scootersPassesDocumentsInteractor$handlePurchasingStatus$1.label = 2;
                        }
                    }
                }
                return zy11.a;
            }
        }
        scootersPassesDocumentsInteractor$handlePurchasingStatus$1 = new ScootersPassesDocumentsInteractor$handlePurchasingStatus$1(hVar, continuation);
        Object obj22 = scootersPassesDocumentsInteractor$handlePurchasingStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesDocumentsInteractor$handlePurchasingStatus$1.label;
        if (i != 0) {
        }
        if (!(obj instanceof Result.Failure)) {
        }
        return zy11.a;
    }

    @Override // defpackage.cwn0
    public final void b() {
        tpr d;
        tco0 tco0Var = this.e;
        ScootersPassesDocumentsInteractor$listenBduiActions$$inlined$collectIn$1 scootersPassesDocumentsInteractor$listenBduiActions$$inlined$collectIn$1 = new ScootersPassesDocumentsInteractor$listenBduiActions$$inlined$collectIn$1(kotlinx.coroutines.flow.e.c(tco0Var.a), null, this);
        tse tseVar = this.a;
        this.m = tje.N(tseVar, null, null, scootersPassesDocumentsInteractor$listenBduiActions$$inlined$collectIn$1, 3);
        g gVar = this.h;
        this.n = tje.N(tseVar, null, null, new ScootersPassesDocumentsInteractor$listenPurchasingState$$inlined$collectIn$1(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new b(gVar.a.f("package")), new d(gVar.a.f("superpass"))}, 2)), null, this), 3);
        this.o = tje.N(tseVar, null, null, new ScootersPassesDocumentsInteractor$listenBroadcastActions$$inlined$collectIn$1(kotlinx.coroutines.flow.e.c(this.i.a), null, tco0Var), 3);
        d = this.g.d(null, true);
        this.l = tje.N(tseVar, null, null, new ScootersPassesDocumentsInteractor$startPaymentMethodListening$$inlined$collectLatestIn$1(d, null, this), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(5:12|13|14|(1:16)|17)(2:24|25))(5:26|27|28|(1:30)|17))(2:33|34))(3:41|42|(2:44|39))|35|(1:37)(1:40)))|60|6|7|(0)(0)|35|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e4, code lost:
    
        r9.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if ((r12 == null ? r3.a.emit(r12, r0) : r4) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0063, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0061, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        r10 = r10.getF();
        r13 = new com.yandex.go.scooters.passes.domain.ScootersPassesDocumentsInteractor$executeWithCallbacks$3$1(r9, r12, null);
        r0.L$0 = null;
        r0.L$1 = r11;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.L$4 = null;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        if (r10 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        r9 = r3.a.emit(r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
    
        if (r9 != r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        r9 = r13.invoke(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
    
        if (r9 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[Catch: all -> 0x0061, CancellationException -> 0x0063, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x0063, all -> 0x0061, blocks: (B:28:0x005d, B:34:0x0073, B:35:0x0089, B:37:0x0097, B:42:0x007a), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ehn0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [sls] */
    /* JADX WARN: Type inference failed for: r11v7, types: [sls] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [tls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(gz gzVar, ehn0 ehn0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        ScootersPassesDocumentsInteractor$executeWithCallbacks$1 scootersPassesDocumentsInteractor$executeWithCallbacks$1;
        int i;
        Throwable th;
        sls slsVar;
        if (continuationImpl instanceof ScootersPassesDocumentsInteractor$executeWithCallbacks$1) {
            scootersPassesDocumentsInteractor$executeWithCallbacks$1 = (ScootersPassesDocumentsInteractor$executeWithCallbacks$1) continuationImpl;
            int i2 = scootersPassesDocumentsInteractor$executeWithCallbacks$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesDocumentsInteractor$executeWithCallbacks$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassesDocumentsInteractor$executeWithCallbacks$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesDocumentsInteractor$executeWithCallbacks$1.label;
                tco0 tco0Var = this.e;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$0 = gzVar;
                    scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$1 = ehn0Var;
                    scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$2 = null;
                    scootersPassesDocumentsInteractor$executeWithCallbacks$1.label = 1;
                    ehn0Var = ehn0Var;
                    if (tlsVar.invoke(scootersPassesDocumentsInteractor$executeWithCallbacks$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ehn0Var = (sls) scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                if (ehn0Var != 0) {
                                    ehn0Var.invoke();
                                }
                                return zy11Var;
                            } catch (Throwable th2) {
                                th = th2;
                                slsVar = ehn0Var;
                                if (slsVar != null) {
                                }
                                throw th;
                            }
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        slsVar = (sls) scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            if (slsVar != null) {
                                slsVar.invoke();
                            }
                            return zy11Var;
                        } catch (Throwable th3) {
                            th = th3;
                            if (slsVar != null) {
                            }
                            throw th;
                        }
                    }
                    sls slsVar2 = (sls) scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$1;
                    gzVar = (gz) scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$0;
                    kotlin.b.b(obj);
                    ehn0Var = slsVar2;
                }
                kr e = gzVar.getE();
                scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$0 = gzVar;
                scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$1 = ehn0Var;
                scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$2 = null;
                scootersPassesDocumentsInteractor$executeWithCallbacks$1.label = 2;
            }
        }
        scootersPassesDocumentsInteractor$executeWithCallbacks$1 = new ScootersPassesDocumentsInteractor$executeWithCallbacks$1(this, continuationImpl);
        Object obj2 = scootersPassesDocumentsInteractor$executeWithCallbacks$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesDocumentsInteractor$executeWithCallbacks$1.label;
        tco0 tco0Var2 = this.e;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        kr e2 = gzVar.getE();
        scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$0 = gzVar;
        scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$1 = ehn0Var;
        scootersPassesDocumentsInteractor$executeWithCallbacks$1.L$2 = null;
        scootersPassesDocumentsInteractor$executeWithCallbacks$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kr krVar, Continuation continuation) {
        ScootersPassesDocumentsInteractor$handleBduiAction$1 scootersPassesDocumentsInteractor$handleBduiAction$1;
        int i;
        Iterator it;
        if (continuation instanceof ScootersPassesDocumentsInteractor$handleBduiAction$1) {
            scootersPassesDocumentsInteractor$handleBduiAction$1 = (ScootersPassesDocumentsInteractor$handleBduiAction$1) continuation;
            int i2 = scootersPassesDocumentsInteractor$handleBduiAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesDocumentsInteractor$handleBduiAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassesDocumentsInteractor$handleBduiAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesDocumentsInteractor$handleBduiAction$1.label;
                zy11 zy11Var = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        if (krVar instanceof ScootersBuyPassAction) {
                            scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                            scootersPassesDocumentsInteractor$handleBduiAction$1.label = 1;
                            Object f = f((ScootersBuyPassAction) krVar, scootersPassesDocumentsInteractor$handleBduiAction$1);
                            if (f != obj2) {
                                return f;
                            }
                        } else if (krVar instanceof ScootersUnfreezePassAction) {
                            ScootersUnfreezePassAction scootersUnfreezePassAction = (ScootersUnfreezePassAction) krVar;
                            scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                            scootersPassesDocumentsInteractor$handleBduiAction$1.label = 2;
                            Object d = d(scootersUnfreezePassAction, new ehn0(15, this), new ScootersPassesDocumentsInteractor$handleUnfreeze$3(this, scootersUnfreezePassAction, null), scootersPassesDocumentsInteractor$handleBduiAction$1);
                            if (d != obj2) {
                                return d;
                            }
                        } else if (krVar instanceof ScootersFreezePassAction) {
                            ScootersFreezePassAction scootersFreezePassAction = (ScootersFreezePassAction) krVar;
                            scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                            scootersPassesDocumentsInteractor$handleBduiAction$1.label = 3;
                            Object d2 = d(scootersFreezePassAction, null, new ScootersPassesDocumentsInteractor$handleFreeze$2(this, scootersFreezePassAction, null), scootersPassesDocumentsInteractor$handleBduiAction$1);
                            if (d2 != obj2) {
                                return d2;
                            }
                        } else if (krVar instanceof ScootersDisableAutorenewAction) {
                            ScootersDisableAutorenewAction scootersDisableAutorenewAction = (ScootersDisableAutorenewAction) krVar;
                            scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                            scootersPassesDocumentsInteractor$handleBduiAction$1.label = 4;
                            Object d3 = d(scootersDisableAutorenewAction, null, new ScootersPassesDocumentsInteractor$handleDisableAutorenew$2(this, scootersDisableAutorenewAction, null), scootersPassesDocumentsInteractor$handleBduiAction$1);
                            if (d3 != obj2) {
                                return d3;
                            }
                        } else if (krVar instanceof ScootersEnableAutorenewAction) {
                            ScootersEnableAutorenewAction scootersEnableAutorenewAction = (ScootersEnableAutorenewAction) krVar;
                            scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                            scootersPassesDocumentsInteractor$handleBduiAction$1.label = 5;
                            Object d4 = d(scootersEnableAutorenewAction, null, new ScootersPassesDocumentsInteractor$handleEnableAutorenew$2(this, scootersEnableAutorenewAction, null), scootersPassesDocumentsInteractor$handleBduiAction$1);
                            if (d4 != obj2) {
                                return d4;
                            }
                        } else if (krVar instanceof ScootersAcceptWinbackAction) {
                            ScootersAcceptWinbackAction scootersAcceptWinbackAction = (ScootersAcceptWinbackAction) krVar;
                            scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                            scootersPassesDocumentsInteractor$handleBduiAction$1.label = 6;
                            Object d5 = d(scootersAcceptWinbackAction, null, new ScootersPassesDocumentsInteractor$handleAcceptWinback$2(this, scootersAcceptWinbackAction, null), scootersPassesDocumentsInteractor$handleBduiAction$1);
                            if (d5 != obj2) {
                                return d5;
                            }
                        } else {
                            if (krVar instanceof ScootersBroadcastAction) {
                                this.i.a(((ScootersBroadcastAction) krVar).a);
                                return zy11Var;
                            }
                            if (krVar instanceof ScootersChangeAutorenewPaymentMethod) {
                                ScootersChangeAutorenewPaymentMethod scootersChangeAutorenewPaymentMethod = (ScootersChangeAutorenewPaymentMethod) krVar;
                                scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                                scootersPassesDocumentsInteractor$handleBduiAction$1.label = 7;
                                Object d6 = d(scootersChangeAutorenewPaymentMethod, null, new ScootersPassesDocumentsInteractor$handleAutorenewPaymentMethodChange$2(this, scootersChangeAutorenewPaymentMethod, null), scootersPassesDocumentsInteractor$handleBduiAction$1);
                                if (d6 != obj2) {
                                    return d6;
                                }
                            } else {
                                boolean z = krVar instanceof ScootersBduiNavigationAction;
                                rdo0 rdo0Var = this.k;
                                if (z) {
                                    leo0 a = m3b1.a((ScootersBduiNavigationAction) krVar);
                                    scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                                    scootersPassesDocumentsInteractor$handleBduiAction$1.label = 8;
                                    Object emit = rdo0Var.a.emit(a, scootersPassesDocumentsInteractor$handleBduiAction$1);
                                    if (emit != obj2) {
                                        return emit;
                                    }
                                } else if (krVar instanceof ScootersOpenPaymentMethodsAction) {
                                    keo0 keo0Var = keo0.b;
                                    scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                                    scootersPassesDocumentsInteractor$handleBduiAction$1.label = 9;
                                    Object emit2 = rdo0Var.a.emit(keo0Var, scootersPassesDocumentsInteractor$handleBduiAction$1);
                                    if (emit2 != obj2) {
                                        return emit2;
                                    }
                                } else if (krVar instanceof OpenWebAction) {
                                    OpenWebAction openWebAction = (OpenWebAction) krVar;
                                    meo0 meo0Var = new meo0(openWebAction.a, openWebAction.b == OpenWebAction.AuthType.TOKEN);
                                    scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                                    scootersPassesDocumentsInteractor$handleBduiAction$1.label = 10;
                                    Object emit3 = rdo0Var.a.emit(meo0Var, scootersPassesDocumentsInteractor$handleBduiAction$1);
                                    if (emit3 != obj2) {
                                        return emit3;
                                    }
                                } else if (krVar instanceof ysi0) {
                                    scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                                    scootersPassesDocumentsInteractor$handleBduiAction$1.label = 11;
                                    Object emit4 = this.f.a.emit(zy11Var, scootersPassesDocumentsInteractor$handleBduiAction$1);
                                    if (emit4 != obj2) {
                                        return emit4;
                                    }
                                } else {
                                    if (!(krVar instanceof CloseAction)) {
                                        if (krVar instanceof gqy) {
                                            it = ((gqy) krVar).a.iterator();
                                            while (it.hasNext()) {
                                                kr krVar2 = (kr) it.next();
                                                scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                                                scootersPassesDocumentsInteractor$handleBduiAction$1.L$1 = null;
                                                scootersPassesDocumentsInteractor$handleBduiAction$1.L$2 = it;
                                                scootersPassesDocumentsInteractor$handleBduiAction$1.L$3 = null;
                                                scootersPassesDocumentsInteractor$handleBduiAction$1.L$4 = null;
                                                scootersPassesDocumentsInteractor$handleBduiAction$1.label = 13;
                                                if (e(krVar2, scootersPassesDocumentsInteractor$handleBduiAction$1) == obj2) {
                                                }
                                            }
                                        }
                                        return zy11Var;
                                    }
                                    keo0 keo0Var2 = keo0.a;
                                    scootersPassesDocumentsInteractor$handleBduiAction$1.L$0 = null;
                                    scootersPassesDocumentsInteractor$handleBduiAction$1.label = 12;
                                    Object emit5 = rdo0Var.a.emit(keo0Var2, scootersPassesDocumentsInteractor$handleBduiAction$1);
                                    if (emit5 != obj2) {
                                        return emit5;
                                    }
                                }
                            }
                        }
                        return obj2;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        kotlin.b.b(obj);
                        return obj;
                    case 13:
                        it = (Iterator) scootersPassesDocumentsInteractor$handleBduiAction$1.L$2;
                        kotlin.b.b(obj);
                        while (it.hasNext()) {
                        }
                        return zy11Var;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        scootersPassesDocumentsInteractor$handleBduiAction$1 = new ScootersPassesDocumentsInteractor$handleBduiAction$1(this, continuation);
        Object obj3 = scootersPassesDocumentsInteractor$handleBduiAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesDocumentsInteractor$handleBduiAction$1.label;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:11)(2:15|16))(2:17|18))(4:19|20|(1:(1:23)(2:27|28))(1:29)|24)|12|13))|38|6|7|(0)(0)|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r10.a(r2, r9, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0047, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r3.c(false);
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if ((r9 instanceof com.yandex.go.scooters.passes.exception.ScootersNoSelectedPaymentMethodException) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        r8 = r8.k.a.emit(defpackage.keo0.b, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r8 = r8.j.a.emit(r9, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ScootersBuyPassAction scootersBuyPassAction, ContinuationImpl continuationImpl) {
        ScootersPassesDocumentsInteractor$purchasePass$1 scootersPassesDocumentsInteractor$purchasePass$1;
        int i;
        PassType passType;
        if (continuationImpl instanceof ScootersPassesDocumentsInteractor$purchasePass$1) {
            scootersPassesDocumentsInteractor$purchasePass$1 = (ScootersPassesDocumentsInteractor$purchasePass$1) continuationImpl;
            int i2 = scootersPassesDocumentsInteractor$purchasePass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesDocumentsInteractor$purchasePass$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassesDocumentsInteractor$purchasePass$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesDocumentsInteractor$purchasePass$1.label;
                com.yandex.go.scooters.passes.data.jason.a aVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar.c(true);
                    this.p.set(scootersBuyPassAction.c);
                    i iVar = this.d;
                    String str = scootersBuyPassAction.a;
                    int i3 = wdo0.a[scootersBuyPassAction.b.ordinal()];
                    if (i3 == 1) {
                        passType = PassType.PACKAGE;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        passType = PassType.SUPER_PASS;
                    }
                    scootersPassesDocumentsInteractor$purchasePass$1.L$0 = null;
                    scootersPassesDocumentsInteractor$purchasePass$1.label = 1;
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersPassesDocumentsInteractor$purchasePass$1 = new ScootersPassesDocumentsInteractor$purchasePass$1(this, continuationImpl);
        Object obj2 = scootersPassesDocumentsInteractor$purchasePass$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesDocumentsInteractor$purchasePass$1.label;
        com.yandex.go.scooters.passes.data.jason.a aVar2 = this.c;
        if (i != 0) {
        }
        return zy11.a;
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        pzt0 pzt0Var = this.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.m;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.n;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        pzt0 pzt0Var4 = this.o;
        if (pzt0Var4 != null) {
            pzt0Var4.a(null);
        }
    }
}
