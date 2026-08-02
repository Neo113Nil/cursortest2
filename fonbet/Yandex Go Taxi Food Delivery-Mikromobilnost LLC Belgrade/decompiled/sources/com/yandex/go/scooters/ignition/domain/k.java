package com.yandex.go.scooters.ignition.domain;

import androidx.core.app.v;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.brn0;
import defpackage.exr;
import defpackage.f9s;
import defpackage.jl40;
import defpackage.jsn0;
import defpackage.jst;
import defpackage.ky2;
import defpackage.m2o0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2o0;
import defpackage.psn0;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tsn0;
import defpackage.tt2;
import defpackage.ugo0;
import defpackage.uyj;
import defpackage.vqn0;
import defpackage.zy11;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.altbeacon.beacon.Identifier;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.service.BeaconService;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes8.dex */
public final class k {
    public static final Region p;
    public final tt2 a;
    public final ky2 b;
    public final m2o0 c;
    public final tsn0 d;
    public final m e;
    public final com.yandex.go.scooters.ignition.data.b f;
    public final com.yandex.go.scooters.ignition.analytics.a g;
    public final brn0 h;
    public final com.yandex.go.scooters.ignition.data.d i;
    public final com.yandex.go.scooters.ignition.data.a j;
    public final vqn0 k;
    public final com.yandex.go.scooters.ignition.data.c l;
    public final jsn0 m;
    public final com.yandex.go.scooters.ignition.data.i n;
    public final psn0 o;

    static {
        int i = com.yandex.go.scooters.ignition.data.b.e;
        int i2 = m.k;
        Identifier b = Identifier.b("00000000-0000-0000-0000-000000000000");
        p = new Region("00000000-0000-0000-0000-000000000000", b, b, b);
    }

    public k(tt2 tt2Var, ky2 ky2Var, m2o0 m2o0Var, tsn0 tsn0Var, m mVar, com.yandex.go.scooters.ignition.data.b bVar, com.yandex.go.scooters.ignition.analytics.a aVar, brn0 brn0Var, com.yandex.go.scooters.ignition.data.d dVar, com.yandex.go.scooters.ignition.data.a aVar2, vqn0 vqn0Var, com.yandex.go.scooters.ignition.data.c cVar, jsn0 jsn0Var, com.yandex.go.scooters.ignition.data.i iVar, psn0 psn0Var) {
        this.a = tt2Var;
        this.b = ky2Var;
        this.c = m2o0Var;
        this.d = tsn0Var;
        this.e = mVar;
        this.f = bVar;
        this.g = aVar;
        this.h = brn0Var;
        this.i = dVar;
        this.j = aVar2;
        this.k = vqn0Var;
        this.l = cVar;
        this.m = jsn0Var;
        this.n = iVar;
        this.o = psn0Var;
    }

    public final Object a(SuspendLambda suspendLambda) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ScootersIgnitionInteractor$isAllowed$2(this, null), suspendLambda);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (e(r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersIgnitionInteractor$safeRefresh$1 scootersIgnitionInteractor$safeRefresh$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersIgnitionInteractor$safeRefresh$1) {
            scootersIgnitionInteractor$safeRefresh$1 = (ScootersIgnitionInteractor$safeRefresh$1) continuationImpl;
            int i2 = scootersIgnitionInteractor$safeRefresh$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionInteractor$safeRefresh$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersIgnitionInteractor$safeRefresh$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionInteractor$safeRefresh$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersIgnitionInteractor$safeRefresh$1.label = 1;
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new ScootersIgnitionInteractor$isEnabled$2(this, null), scootersIgnitionInteractor$safeRefresh$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            scootersIgnitionInteractor$safeRefresh$1.label = 3;
                            Object d = d(scootersIgnitionInteractor$safeRefresh$1);
                            return d == obj2 ? obj2 : d;
                        }
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return zy11.a;
                }
                scootersIgnitionInteractor$safeRefresh$1.label = 2;
            }
        }
        scootersIgnitionInteractor$safeRefresh$1 = new ScootersIgnitionInteractor$safeRefresh$1(this, continuationImpl);
        obj = scootersIgnitionInteractor$safeRefresh$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionInteractor$safeRefresh$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(2:18|19))(1:22))(1:28)|23|(3:25|(2:27|21)|19)|13|14))|34|6|7|(0)(0)|23|(0)|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (g(r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        defpackage.jst.e.i("ScootersIgnition", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[Catch: all -> 0x0071, CancellationException -> 0x007a, TRY_ENTER, TryCatch #2 {CancellationException -> 0x007a, all -> 0x0071, blocks: (B:12:0x002a, B:18:0x0034, B:19:0x0068, B:25:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ScootersIgnitionInteractor$safeRefreshRegions$1 scootersIgnitionInteractor$safeRefreshRegions$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersIgnitionInteractor$safeRefreshRegions$1) {
            scootersIgnitionInteractor$safeRefreshRegions$1 = (ScootersIgnitionInteractor$safeRefreshRegions$1) continuationImpl;
            int i2 = scootersIgnitionInteractor$safeRefreshRegions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionInteractor$safeRefreshRegions$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersIgnitionInteractor$safeRefreshRegions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionInteractor$safeRefreshRegions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersIgnitionInteractor$safeRefreshRegions$1.label = 1;
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new ScootersIgnitionInteractor$isEnabled$2(this, null), scootersIgnitionInteractor$safeRefreshRegions$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    scootersIgnitionInteractor$safeRefreshRegions$1.label = 3;
                }
                if (((Boolean) obj).booleanValue()) {
                    scootersIgnitionInteractor$safeRefreshRegions$1.label = 2;
                    if (i(false, scootersIgnitionInteractor$safeRefreshRegions$1) == obj2) {
                        return obj2;
                    }
                    scootersIgnitionInteractor$safeRefreshRegions$1.label = 3;
                }
                return zy11.a;
            }
        }
        scootersIgnitionInteractor$safeRefreshRegions$1 = new ScootersIgnitionInteractor$safeRefreshRegions$1(this, continuationImpl);
        obj = scootersIgnitionInteractor$safeRefreshRegions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionInteractor$safeRefreshRegions$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(1:(3:14|15|16)(2:18|19))(3:20|21|22))(4:23|24|25|(1:27)(1:16)))(3:28|29|(1:31)(2:32|(1:47)(4:44|(2:46|27)|25|(0)(0)))))(1:48))(1:54)|49|(1:51)(1:52)))|66|6|7|(0)(0)|49|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0098, code lost:
    
        if (r13 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0079, code lost:
    
        if (r13 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0118, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0119, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0052, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fc, code lost:
    
        defpackage.jst.e.i("ScootersIgnition", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.Z$0 = r2;
        r0.label = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010d, code lost:
    
        if (h(r0) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0117, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0043, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0110, code lost:
    
        defpackage.jst.e.i("ScootersIgnition", r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersIgnitionInteractor$safeStart$1 scootersIgnitionInteractor$safeStart$1;
        Object obj;
        ?? r2;
        boolean booleanValue;
        if (continuationImpl instanceof ScootersIgnitionInteractor$safeStart$1) {
            scootersIgnitionInteractor$safeStart$1 = (ScootersIgnitionInteractor$safeStart$1) continuationImpl;
            int i = scootersIgnitionInteractor$safeStart$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scootersIgnitionInteractor$safeStart$1.label = i - Integer.MIN_VALUE;
                obj = scootersIgnitionInteractor$safeStart$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                r2 = scootersIgnitionInteractor$safeStart$1.label;
                tt2 tt2Var = this.a;
                zy11 zy11Var = zy11.a;
                if (r2 != 0) {
                    kotlin.b.b(obj);
                    tt2Var.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ScootersIgnitionInteractor$safeStart$2 scootersIgnitionInteractor$safeStart$2 = new ScootersIgnitionInteractor$safeStart$2(this, null);
                    scootersIgnitionInteractor$safeStart$1.label = 1;
                    obj = tje.k0(mdhVar, scootersIgnitionInteractor$safeStart$2, scootersIgnitionInteractor$safeStart$1);
                } else if (r2 == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (r2 != 2) {
                        if (r2 == 3) {
                            booleanValue = scootersIgnitionInteractor$safeStart$1.Z$0;
                            kotlin.b.b(obj);
                            tt2Var.getClass();
                            sjh sjhVar2 = uyj.a;
                            mdh mdhVar2 = mdh.b;
                            ScootersIgnitionInteractor$safeStart$3$1 scootersIgnitionInteractor$safeStart$3$1 = new ScootersIgnitionInteractor$safeStart$3$1(this, null);
                            scootersIgnitionInteractor$safeStart$1.Z$0 = booleanValue;
                            scootersIgnitionInteractor$safeStart$1.label = 4;
                            return tje.k0(mdhVar2, scootersIgnitionInteractor$safeStart$3$1, scootersIgnitionInteractor$safeStart$1) != obj2 ? obj2 : zy11Var;
                        }
                        if (r2 == 4) {
                            boolean z = scootersIgnitionInteractor$safeStart$1.Z$0;
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        if (r2 != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    kotlin.b.b(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                        return zy11Var;
                    }
                    jsn0 jsn0Var = this.m;
                    ugo0 ugo0Var = jsn0Var.d;
                    ugo0 ugo0Var2 = jsn0Var.d;
                    if (!ugo0Var.a.f() || !jsn0Var.a() || !ugo0Var2.a.g() || jsn0Var.b.c() || !ugo0Var2.a.h() || !jsn0Var.a.a()) {
                        return zy11Var;
                    }
                    scootersIgnitionInteractor$safeStart$1.Z$0 = booleanValue;
                    scootersIgnitionInteractor$safeStart$1.label = 3;
                    if (f(scootersIgnitionInteractor$safeStart$1) == obj2) {
                    }
                    tt2Var.getClass();
                    sjh sjhVar22 = uyj.a;
                    mdh mdhVar22 = mdh.b;
                    ScootersIgnitionInteractor$safeStart$3$1 scootersIgnitionInteractor$safeStart$3$12 = new ScootersIgnitionInteractor$safeStart$3$1(this, null);
                    scootersIgnitionInteractor$safeStart$1.Z$0 = booleanValue;
                    scootersIgnitionInteractor$safeStart$1.label = 4;
                    if (tje.k0(mdhVar22, scootersIgnitionInteractor$safeStart$3$12, scootersIgnitionInteractor$safeStart$1) != obj2) {
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    return zy11Var;
                }
                tt2Var.getClass();
                sjh sjhVar3 = uyj.a;
                mdh mdhVar3 = mdh.b;
                ScootersIgnitionInteractor$safeStart$needToReturn$1 scootersIgnitionInteractor$safeStart$needToReturn$1 = new ScootersIgnitionInteractor$safeStart$needToReturn$1(this, null);
                scootersIgnitionInteractor$safeStart$1.label = 2;
                obj = tje.k0(mdhVar3, scootersIgnitionInteractor$safeStart$needToReturn$1, scootersIgnitionInteractor$safeStart$1);
            }
        }
        scootersIgnitionInteractor$safeStart$1 = new ScootersIgnitionInteractor$safeStart$1(this, continuationImpl);
        obj = scootersIgnitionInteractor$safeStart$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = scootersIgnitionInteractor$safeStart$1.label;
        tt2 tt2Var2 = this.a;
        zy11 zy11Var2 = zy11.a;
        if (r2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(2:21|22))(5:23|24|25|26|(1:28)(1:20)))(1:35))(1:41)|36|(1:38)(1:39)))|49|6|7|(0)(0)|36|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (h(r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0078, code lost:
    
        if (r12 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005c, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005a, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        defpackage.jst.e.i("ScootersIgnition", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        r10.getClass();
        r12 = defpackage.uyj.a;
        r12 = defpackage.mdh.b;
        r3 = new com.yandex.go.scooters.ignition.domain.ScootersIgnitionInteractor$safeStop$4$1(r11, null);
        r0.L$0 = r8;
        r0.Z$0 = r2;
        r0.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        if (defpackage.tje.k0(r12, r3, r0) == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084 A[Catch: all -> 0x005a, CancellationException -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x005c, all -> 0x005a, blocks: (B:25:0x0056, B:39:0x0084), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        ScootersIgnitionInteractor$safeStop$1 scootersIgnitionInteractor$safeStop$1;
        boolean z;
        boolean booleanValue;
        if (continuationImpl instanceof ScootersIgnitionInteractor$safeStop$1) {
            scootersIgnitionInteractor$safeStop$1 = (ScootersIgnitionInteractor$safeStop$1) continuationImpl;
            int i = scootersIgnitionInteractor$safeStop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scootersIgnitionInteractor$safeStop$1.label = i - Integer.MIN_VALUE;
                Object obj = scootersIgnitionInteractor$safeStop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                z = scootersIgnitionInteractor$safeStop$1.label;
                zy11 zy11Var = zy11.a;
                tt2 tt2Var = this.a;
                if (z != 0) {
                    kotlin.b.b(obj);
                    tt2Var.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ScootersIgnitionInteractor$safeStop$enabled$1 scootersIgnitionInteractor$safeStop$enabled$1 = new ScootersIgnitionInteractor$safeStop$enabled$1(this, null);
                    scootersIgnitionInteractor$safeStop$1.label = 1;
                    obj = tje.k0(mdhVar, scootersIgnitionInteractor$safeStop$enabled$1, scootersIgnitionInteractor$safeStop$1);
                } else {
                    if (z != 1) {
                        if (z != 2) {
                            if (z == 3) {
                                kotlin.b.b(obj);
                                return zy11Var;
                            }
                            if (z == 4) {
                                kotlin.b.b(obj);
                            }
                            if (z != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) scootersIgnitionInteractor$safeStop$1.L$0;
                            kotlin.b.b(obj);
                            throw th;
                        }
                        boolean z2 = scootersIgnitionInteractor$safeStop$1.Z$0;
                        try {
                            kotlin.b.b(obj);
                            z = z2;
                            tt2Var.getClass();
                            sjh sjhVar2 = uyj.a;
                            mdh mdhVar2 = mdh.b;
                            ScootersIgnitionInteractor$safeStop$4$1 scootersIgnitionInteractor$safeStop$4$1 = new ScootersIgnitionInteractor$safeStop$4$1(this, null);
                            scootersIgnitionInteractor$safeStop$1.L$0 = zy11Var;
                            scootersIgnitionInteractor$safeStop$1.Z$0 = z;
                            scootersIgnitionInteractor$safeStop$1.label = 3;
                            this = tje.k0(mdhVar2, scootersIgnitionInteractor$safeStop$4$1, scootersIgnitionInteractor$safeStop$1);
                        } catch (Throwable th2) {
                            tt2Var.getClass();
                            sjh sjhVar3 = uyj.a;
                            mdh mdhVar3 = mdh.b;
                            ScootersIgnitionInteractor$safeStop$4$1 scootersIgnitionInteractor$safeStop$4$12 = new ScootersIgnitionInteractor$safeStop$4$1(this, null);
                            scootersIgnitionInteractor$safeStop$1.L$0 = th2;
                            scootersIgnitionInteractor$safeStop$1.Z$0 = z2;
                            scootersIgnitionInteractor$safeStop$1.label = 5;
                            if (tje.k0(mdhVar3, scootersIgnitionInteractor$safeStop$4$12, scootersIgnitionInteractor$safeStop$1) != coroutineSingletons) {
                                throw th2;
                            }
                        }
                        return this == coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    return zy11Var;
                }
                scootersIgnitionInteractor$safeStop$1.Z$0 = booleanValue;
                scootersIgnitionInteractor$safeStop$1.label = 2;
                z = booleanValue;
            }
        }
        scootersIgnitionInteractor$safeStop$1 = new ScootersIgnitionInteractor$safeStop$1(this, continuationImpl);
        Object obj2 = scootersIgnitionInteractor$safeStop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        z = scootersIgnitionInteractor$safeStop$1.label;
        zy11 zy11Var2 = zy11.a;
        tt2 tt2Var2 = this.a;
        if (z != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x014a, code lost:
    
        if (com.yandex.go.scooters.ignition.analytics.a.e(r1, "enable", null, r2, 6) != r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r1 == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        ScootersIgnitionInteractor$start$1 scootersIgnitionInteractor$start$1;
        Object obj;
        int i;
        ScootersIgnitionExperiment.Ui.SystemEnabledNotification systemEnabledNotification;
        Object a;
        ScootersIgnitionExperiment scootersIgnitionExperiment;
        Object a2;
        org.altbeacon.beacon.b bVar;
        org.altbeacon.beacon.b bVar2;
        org.altbeacon.beacon.b bVar3;
        if (continuationImpl instanceof ScootersIgnitionInteractor$start$1) {
            scootersIgnitionInteractor$start$1 = (ScootersIgnitionInteractor$start$1) continuationImpl;
            int i2 = scootersIgnitionInteractor$start$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionInteractor$start$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersIgnitionInteractor$start$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionInteractor$start$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ScootersIgnitionInteractor$start$experiment$1 scootersIgnitionInteractor$start$experiment$1 = new ScootersIgnitionInteractor$start$experiment$1(this, null);
                    scootersIgnitionInteractor$start$1.label = 1;
                    obj2 = tje.k0(mdhVar, scootersIgnitionInteractor$start$experiment$1, scootersIgnitionInteractor$start$1);
                } else if (i == 1) {
                    kotlin.b.b(obj2);
                } else {
                    if (i == 2) {
                        systemEnabledNotification = (ScootersIgnitionExperiment.Ui.SystemEnabledNotification) scootersIgnitionInteractor$start$1.L$1;
                        scootersIgnitionExperiment = (ScootersIgnitionExperiment) scootersIgnitionInteractor$start$1.L$0;
                        kotlin.b.b(obj2);
                        org.altbeacon.beacon.b bVar4 = (org.altbeacon.beacon.b) obj2;
                        com.yandex.go.scooters.ignition.data.g gVar = new com.yandex.go.scooters.ignition.data.g(scootersIgnitionExperiment.l, this.k.a(), new ScootersIgnitionInteractor$createRangeNotifier$1(this, null), this.f, this.e, this.g);
                        gVar.a();
                        bVar4.a(gVar);
                        FormattedText e = f9s.e(systemEnabledNotification.a, scootersIgnitionExperiment);
                        FormattedText e2 = f9s.e(systemEnabledNotification.b, scootersIgnitionExperiment);
                        scootersIgnitionInteractor$start$1.L$0 = null;
                        scootersIgnitionInteractor$start$1.L$1 = null;
                        scootersIgnitionInteractor$start$1.L$2 = bVar4;
                        scootersIgnitionInteractor$start$1.L$3 = null;
                        scootersIgnitionInteractor$start$1.L$4 = bVar4;
                        scootersIgnitionInteractor$start$1.label = 3;
                        a2 = this.l.a(e, e2, scootersIgnitionInteractor$start$1);
                        if (a2 != obj) {
                            bVar = bVar4;
                            obj2 = a2;
                            bVar2 = bVar;
                            bVar2.g(((v) obj2).b());
                            scootersIgnitionInteractor$start$1.L$0 = null;
                            scootersIgnitionInteractor$start$1.L$1 = null;
                            scootersIgnitionInteractor$start$1.L$2 = bVar;
                            scootersIgnitionInteractor$start$1.L$3 = null;
                            scootersIgnitionInteractor$start$1.L$4 = null;
                            scootersIgnitionInteractor$start$1.label = 4;
                            if (g(scootersIgnitionInteractor$start$1) != obj) {
                            }
                        }
                        return obj;
                    }
                    if (i == 3) {
                        bVar2 = (org.altbeacon.beacon.b) scootersIgnitionInteractor$start$1.L$4;
                        bVar = (org.altbeacon.beacon.b) scootersIgnitionInteractor$start$1.L$2;
                        kotlin.b.b(obj2);
                        bVar2.g(((v) obj2).b());
                        scootersIgnitionInteractor$start$1.L$0 = null;
                        scootersIgnitionInteractor$start$1.L$1 = null;
                        scootersIgnitionInteractor$start$1.L$2 = bVar;
                        scootersIgnitionInteractor$start$1.L$3 = null;
                        scootersIgnitionInteractor$start$1.L$4 = null;
                        scootersIgnitionInteractor$start$1.label = 4;
                        if (g(scootersIgnitionInteractor$start$1) != obj) {
                            bVar3 = bVar;
                            bVar3.r();
                            this.b.k(BeaconService.class);
                            scootersIgnitionInteractor$start$1.L$0 = null;
                            scootersIgnitionInteractor$start$1.L$1 = null;
                            scootersIgnitionInteractor$start$1.L$2 = null;
                            scootersIgnitionInteractor$start$1.L$3 = null;
                            scootersIgnitionInteractor$start$1.label = 5;
                            com.yandex.go.scooters.ignition.analytics.a aVar = this.g;
                            aVar.getClass();
                        }
                        return obj;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        this.n.a();
                        psn0 psn0Var = this.o;
                        psn0Var.a.registerComponentCallbacks(psn0Var.d);
                        return zy11.a;
                    }
                    bVar3 = (org.altbeacon.beacon.b) scootersIgnitionInteractor$start$1.L$2;
                    kotlin.b.b(obj2);
                    bVar3.r();
                    this.b.k(BeaconService.class);
                    scootersIgnitionInteractor$start$1.L$0 = null;
                    scootersIgnitionInteractor$start$1.L$1 = null;
                    scootersIgnitionInteractor$start$1.L$2 = null;
                    scootersIgnitionInteractor$start$1.L$3 = null;
                    scootersIgnitionInteractor$start$1.label = 5;
                    com.yandex.go.scooters.ignition.analytics.a aVar2 = this.g;
                    aVar2.getClass();
                }
                ScootersIgnitionExperiment scootersIgnitionExperiment2 = (ScootersIgnitionExperiment) obj2;
                systemEnabledNotification = scootersIgnitionExperiment2.r.d;
                scootersIgnitionInteractor$start$1.L$0 = scootersIgnitionExperiment2;
                scootersIgnitionInteractor$start$1.L$1 = systemEnabledNotification;
                scootersIgnitionInteractor$start$1.label = 2;
                a = this.j.c.a(scootersIgnitionInteractor$start$1);
                if (a != obj) {
                    scootersIgnitionExperiment = scootersIgnitionExperiment2;
                    obj2 = a;
                    org.altbeacon.beacon.b bVar42 = (org.altbeacon.beacon.b) obj2;
                    com.yandex.go.scooters.ignition.data.g gVar2 = new com.yandex.go.scooters.ignition.data.g(scootersIgnitionExperiment.l, this.k.a(), new ScootersIgnitionInteractor$createRangeNotifier$1(this, null), this.f, this.e, this.g);
                    gVar2.a();
                    bVar42.a(gVar2);
                    FormattedText e3 = f9s.e(systemEnabledNotification.a, scootersIgnitionExperiment);
                    FormattedText e22 = f9s.e(systemEnabledNotification.b, scootersIgnitionExperiment);
                    scootersIgnitionInteractor$start$1.L$0 = null;
                    scootersIgnitionInteractor$start$1.L$1 = null;
                    scootersIgnitionInteractor$start$1.L$2 = bVar42;
                    scootersIgnitionInteractor$start$1.L$3 = null;
                    scootersIgnitionInteractor$start$1.L$4 = bVar42;
                    scootersIgnitionInteractor$start$1.label = 3;
                    a2 = this.l.a(e3, e22, scootersIgnitionInteractor$start$1);
                    if (a2 != obj) {
                    }
                }
                return obj;
            }
        }
        scootersIgnitionInteractor$start$1 = new ScootersIgnitionInteractor$start$1(this, continuationImpl);
        Object obj22 = scootersIgnitionInteractor$start$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionInteractor$start$1.label;
        if (i != 0) {
        }
        ScootersIgnitionExperiment scootersIgnitionExperiment22 = (ScootersIgnitionExperiment) obj22;
        systemEnabledNotification = scootersIgnitionExperiment22.r.d;
        scootersIgnitionInteractor$start$1.L$0 = scootersIgnitionExperiment22;
        scootersIgnitionInteractor$start$1.L$1 = systemEnabledNotification;
        scootersIgnitionInteractor$start$1.label = 2;
        a = this.j.c.a(scootersIgnitionInteractor$start$1);
        if (a != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r15 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        if (r15 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ScootersIgnitionInteractor$startRangingBeacons$1 scootersIgnitionInteractor$startRangingBeacons$1;
        int i;
        org.altbeacon.beacon.b bVar;
        if (continuationImpl instanceof ScootersIgnitionInteractor$startRangingBeacons$1) {
            scootersIgnitionInteractor$startRangingBeacons$1 = (ScootersIgnitionInteractor$startRangingBeacons$1) continuationImpl;
            int i2 = scootersIgnitionInteractor$startRangingBeacons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionInteractor$startRangingBeacons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionInteractor$startRangingBeacons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionInteractor$startRangingBeacons$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersIgnitionInteractor$startRangingBeacons$1.label = 1;
                    obj = this.j.c.a(scootersIgnitionInteractor$startRangingBeacons$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        bVar = (org.altbeacon.beacon.b) scootersIgnitionInteractor$startRangingBeacons$1.L$0;
                        kotlin.b.b(obj);
                        Set<String> set = (Set) obj;
                        for (String str : set) {
                            try {
                                UUID fromString = UUID.fromString(str);
                                Pattern pattern = Identifier.a;
                                ByteBuffer allocate = ByteBuffer.allocate(16);
                                allocate.putLong(fromString.getMostSignificantBits());
                                allocate.putLong(fromString.getLeastSignificantBits());
                                bVar.A(new Region(str, new Identifier(allocate.array()), null, null));
                            } catch (Exception unused) {
                                jst.e.getClass();
                            }
                        }
                        scootersIgnitionInteractor$startRangingBeacons$1.L$0 = null;
                        scootersIgnitionInteractor$startRangingBeacons$1.L$1 = null;
                        scootersIgnitionInteractor$startRangingBeacons$1.label = 3;
                        com.yandex.go.scooters.ignition.analytics.a aVar = this.g;
                        aVar.getClass();
                        Object e = com.yandex.go.scooters.ignition.analytics.a.e(aVar, "start_ranging", new exr(i3, set), scootersIgnitionInteractor$startRangingBeacons$1, 2);
                        return e == coroutineSingletons ? coroutineSingletons : e;
                    }
                    kotlin.b.b(obj);
                }
                bVar = (org.altbeacon.beacon.b) obj;
                bVar.A(p);
                this.a.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                ScootersIgnitionInteractor$startRangingBeacons$regionsUuids$1 scootersIgnitionInteractor$startRangingBeacons$regionsUuids$1 = new ScootersIgnitionInteractor$startRangingBeacons$regionsUuids$1(this, null);
                scootersIgnitionInteractor$startRangingBeacons$1.L$0 = bVar;
                scootersIgnitionInteractor$startRangingBeacons$1.label = 2;
                obj = tje.k0(mdhVar, scootersIgnitionInteractor$startRangingBeacons$regionsUuids$1, scootersIgnitionInteractor$startRangingBeacons$1);
            }
        }
        scootersIgnitionInteractor$startRangingBeacons$1 = new ScootersIgnitionInteractor$startRangingBeacons$1(this, continuationImpl);
        Object obj2 = scootersIgnitionInteractor$startRangingBeacons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionInteractor$startRangingBeacons$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        bVar = (org.altbeacon.beacon.b) obj2;
        bVar.A(p);
        this.a.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        ScootersIgnitionInteractor$startRangingBeacons$regionsUuids$1 scootersIgnitionInteractor$startRangingBeacons$regionsUuids$12 = new ScootersIgnitionInteractor$startRangingBeacons$regionsUuids$1(this, null);
        scootersIgnitionInteractor$startRangingBeacons$1.L$0 = bVar;
        scootersIgnitionInteractor$startRangingBeacons$1.label = 2;
        obj2 = tje.k0(mdhVar2, scootersIgnitionInteractor$startRangingBeacons$regionsUuids$12, scootersIgnitionInteractor$startRangingBeacons$1);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(11:17|18|(4:21|(3:23|24|25)(1:27)|26|19)|28|29|(2:32|30)|33|34|(1:36)|37|(1:39)(1:40)))(1:41))(2:46|47)|42|43))|52|6|7|(0)(0)|42|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0057, code lost:
    
        if (r9 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
    
        if (i(true, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
    
        throw r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        ScootersIgnitionInteractor$stop$1 scootersIgnitionInteractor$stop$1;
        int i;
        if (continuationImpl instanceof ScootersIgnitionInteractor$stop$1) {
            scootersIgnitionInteractor$stop$1 = (ScootersIgnitionInteractor$stop$1) continuationImpl;
            int i2 = scootersIgnitionInteractor$stop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionInteractor$stop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionInteractor$stop$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionInteractor$stop$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersIgnitionInteractor$stop$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        kotlin.b.b(obj);
                        org.altbeacon.beacon.b bVar = (org.altbeacon.beacon.b) obj;
                        Set m = bVar.m();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : m) {
                            if (obj3 instanceof com.yandex.go.scooters.ignition.data.g) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((com.yandex.go.scooters.ignition.data.g) it.next()).b();
                        }
                        bVar.q();
                        bVar.f();
                        ((o2o0) this.c).c.i.a(bVar.i(), null);
                        this.b.m(BeaconService.class);
                        psn0 psn0Var = this.o;
                        psn0Var.a.unregisterComponentCallbacks(psn0Var.d);
                        com.yandex.go.scooters.ignition.data.i iVar = this.n;
                        pzt0 pzt0Var = iVar.e;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        iVar.e = null;
                        scootersIgnitionInteractor$stop$1.L$0 = null;
                        scootersIgnitionInteractor$stop$1.label = 3;
                        com.yandex.go.scooters.ignition.analytics.a aVar = this.g;
                        aVar.getClass();
                        Object e = com.yandex.go.scooters.ignition.analytics.a.e(aVar, "disable", null, scootersIgnitionInteractor$stop$1, 6);
                        return e == obj2 ? obj2 : e;
                    }
                    kotlin.b.b(obj);
                }
                scootersIgnitionInteractor$stop$1.label = 2;
                obj = this.j.c.a(scootersIgnitionInteractor$stop$1);
            }
        }
        scootersIgnitionInteractor$stop$1 = new ScootersIgnitionInteractor$stop$1(this, continuationImpl);
        Object obj4 = scootersIgnitionInteractor$stop$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionInteractor$stop$1.label;
        if (i != 0) {
        }
        scootersIgnitionInteractor$stop$1.label = 2;
        obj4 = this.j.c.a(scootersIgnitionInteractor$stop$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(boolean z, ContinuationImpl continuationImpl) {
        ScootersIgnitionInteractor$stopRangingBeacons$1 scootersIgnitionInteractor$stopRangingBeacons$1;
        int i;
        if (continuationImpl instanceof ScootersIgnitionInteractor$stopRangingBeacons$1) {
            scootersIgnitionInteractor$stopRangingBeacons$1 = (ScootersIgnitionInteractor$stopRangingBeacons$1) continuationImpl;
            int i2 = scootersIgnitionInteractor$stopRangingBeacons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionInteractor$stopRangingBeacons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersIgnitionInteractor$stopRangingBeacons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionInteractor$stopRangingBeacons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersIgnitionInteractor$stopRangingBeacons$1.Z$0 = z;
                    scootersIgnitionInteractor$stopRangingBeacons$1.label = 1;
                    obj = this.j.c.a(scootersIgnitionInteractor$stopRangingBeacons$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = scootersIgnitionInteractor$stopRangingBeacons$1.Z$0;
                    kotlin.b.b(obj);
                }
                org.altbeacon.beacon.b bVar = (org.altbeacon.beacon.b) obj;
                for (Region region : bVar.l()) {
                    if (z || !jl40.l(region, p)) {
                        bVar.C(region);
                    }
                }
                return zy11.a;
            }
        }
        scootersIgnitionInteractor$stopRangingBeacons$1 = new ScootersIgnitionInteractor$stopRangingBeacons$1(this, continuationImpl);
        Object obj2 = scootersIgnitionInteractor$stopRangingBeacons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionInteractor$stopRangingBeacons$1.label;
        if (i != 0) {
        }
        org.altbeacon.beacon.b bVar2 = (org.altbeacon.beacon.b) obj2;
        while (r4.hasNext()) {
        }
        return zy11.a;
    }
}
