package com.yandex.go.scooters.ignition.domain;

import android.os.SystemClock;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionResponse;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.brn0;
import defpackage.gsn0;
import defpackage.ief;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qh2;
import defpackage.qsn0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionRequestInteractor$request$2", f = "ScootersIgnitionRequestInteractor.kt", l = {48, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 59, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 64, 65, 69, 72, 74, 74, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionRequestInteractor$request$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $refreshRegionsCallback;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionRequestInteractor$request$2(m mVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$refreshRegionsCallback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionRequestInteractor$request$2(this.this$0, this.$refreshRegionsCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionRequestInteractor$request$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        if (r12.d("request", java.lang.Boolean.valueOf(r3.isEmpty()), new defpackage.qh2(r3, 13), r18) == r2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0169, code lost:
    
        if (r3 == r2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x013b, code lost:
    
        if (r3 == r2) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0045: MOVE (r12 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:99:0x0045 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023e A[Catch: CancellationException -> 0x00cc, all -> 0x02c3, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x00cc, all -> 0x02c3, blocks: (B:32:0x023a, B:34:0x023e, B:40:0x00c7, B:41:0x01f7, B:43:0x01fb, B:45:0x0207, B:50:0x00ea, B:51:0x01dc, B:58:0x01bf), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fb A[Catch: CancellationException -> 0x00cc, all -> 0x02c3, TryCatch #10 {CancellationException -> 0x00cc, all -> 0x02c3, blocks: (B:32:0x023a, B:34:0x023e, B:40:0x00c7, B:41:0x01f7, B:43:0x01fb, B:45:0x0207, B:50:0x00ea, B:51:0x01dc, B:58:0x01bf), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f1  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.yandex.go.scooters.ignition.domain.m] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12, types: [long] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m mVar;
        long j;
        m mVar2;
        com.yandex.go.scooters.ignition.analytics.a aVar;
        EmptyList emptyList;
        m mVar3;
        ?? r3;
        gsn0 gsn0Var;
        Object b;
        Object f;
        List list;
        tls tlsVar;
        Object a;
        m mVar4;
        m mVar5;
        ScootersIgnitionResponse scootersIgnitionResponse;
        com.yandex.go.scooters.ignition.data.b bVar;
        m mVar6;
        List list2;
        m mVar7;
        ScootersIgnitionResponse.RideParams rideParams;
        m mVar8;
        long j2;
        m mVar9;
        m mVar10;
        ScootersIgnitionResponse.Notification notification;
        m mVar11;
        long j3;
        m mVar12;
        long j4;
        m mVar13;
        Object d;
        m mVar14;
        m mVar15;
        com.yandex.go.scooters.ignition.analytics.a aVar2;
        List list3;
        m mVar16;
        zy11 zy11Var = zy11.a;
        ?? r2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        long j5 = 3;
        ?? r7 = 1;
        r7 = 1;
        try {
            try {
                try {
                    try {
                        try {
                        } catch (Throwable unused) {
                            mVar = mVar2;
                            j = 3;
                            r3 = i;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    th = th;
                    r2.i.b = SystemClock.elapsedRealtime();
                    r2.i.a = false;
                    throw th;
                }
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable unused2) {
            }
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable unused3) {
            mVar = mVar14;
            r7 = mVar15;
            j = j5;
        }
        switch (i) {
            case 0:
                kotlin.b.b(obj);
                brn0 brn0Var = this.this$0.g;
                this.label = 1;
                b = brn0Var.a.b(this);
                break;
            case 1:
                kotlin.b.b(obj);
                b = obj;
                j = ((ScootersIgnitionExperiment) b).g;
                if (SystemClock.elapsedRealtime() - this.this$0.i.b >= j && !this.this$0.i.a) {
                    com.yandex.go.scooters.ignition.data.b bVar2 = this.this$0.e;
                    this.J$0 = j;
                    this.label = 2;
                    f = bVar2.f(this);
                    break;
                }
                return zy11Var;
            case 2:
                j = this.J$0;
                kotlin.b.b(obj);
                f = obj;
                list = (List) f;
                if (!list.isEmpty()) {
                    com.yandex.go.scooters.ignition.analytics.a aVar3 = this.this$0.f;
                    this.L$0 = list;
                    this.J$0 = j;
                    this.label = 3;
                    aVar3.getClass();
                    break;
                }
                return zy11Var;
            case 3:
                j = this.J$0;
                list = (List) this.L$0;
                kotlin.b.b(obj);
                mVar = this.this$0;
                tlsVar = this.$refreshRegionsCallback;
                try {
                    mVar.i.a = true;
                    com.yandex.go.scooters.ignition.data.e eVar = mVar.d;
                    this.L$0 = null;
                    this.L$1 = mVar;
                    this.L$2 = tlsVar;
                    this.L$3 = mVar;
                    this.L$4 = mVar;
                    this.J$0 = j;
                    this.label = 4;
                    a = eVar.a(list, this);
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable unused4) {
                    r7 = mVar;
                    try {
                        jst.e.getClass();
                        aVar = mVar.f;
                        this.L$0 = null;
                        this.L$1 = r7;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.J$0 = j;
                        this.label = 11;
                        emptyList = EmptyList.a;
                        aVar.getClass();
                        if (aVar.d("response", Boolean.TRUE, new qh2(emptyList, 14), this) != r2) {
                        }
                        return r2;
                    } catch (Throwable th2) {
                        th = th2;
                        r2 = r7;
                        r2.i.b = SystemClock.elapsedRealtime();
                        r2.i.a = false;
                        throw th;
                    }
                }
                if (a != r2) {
                    m mVar17 = mVar;
                    mVar4 = mVar17;
                    mVar5 = mVar17;
                    scootersIgnitionResponse = (ScootersIgnitionResponse) a;
                    bVar = mVar4.e;
                    this.L$0 = null;
                    this.L$1 = mVar4;
                    this.L$2 = tlsVar;
                    this.L$3 = mVar;
                    this.L$4 = mVar5;
                    this.L$5 = scootersIgnitionResponse;
                    this.J$0 = j;
                    this.label = 5;
                    mVar6 = mVar5;
                    if (bVar.c(this) == r2) {
                    }
                    list2 = scootersIgnitionResponse.c;
                    this.L$0 = null;
                    this.L$1 = mVar4;
                    this.L$2 = tlsVar;
                    this.L$3 = mVar;
                    this.L$4 = mVar6;
                    this.L$5 = scootersIgnitionResponse;
                    this.J$0 = j;
                    this.label = 6;
                    mVar7 = mVar6;
                    if (m.b(mVar4, list2, this) == r2) {
                    }
                    rideParams = scootersIgnitionResponse.d;
                    r7 = mVar7;
                    if (rideParams != null) {
                        r7 = mVar7;
                        if (mVar4.c.b(rideParams.a, rideParams.b)) {
                            qsn0 qsn0Var = mVar4.h;
                            tje.N(qsn0Var.a, null, null, new ScootersIgnitionUpdateSessionsInteractor$update$1(qsn0Var, null), 3);
                            this.L$0 = null;
                            this.L$1 = mVar4;
                            this.L$2 = mVar;
                            this.L$3 = mVar7;
                            this.L$4 = scootersIgnitionResponse;
                            this.L$5 = null;
                            this.J$0 = j;
                            this.label = 7;
                            if (tlsVar.invoke(this) != r2) {
                                long j6 = j;
                                mVar8 = mVar7;
                                j2 = j6;
                                mVar9 = mVar;
                                mVar10 = mVar4;
                                mVar4 = mVar10;
                                mVar = mVar9;
                                r7 = mVar8;
                                j = j2;
                            }
                        }
                    }
                    notification = scootersIgnitionResponse.b;
                    if (notification != null) {
                        ief iefVar = scootersIgnitionResponse.a;
                        this.L$0 = null;
                        this.L$1 = mVar4;
                        this.L$2 = mVar;
                        this.L$3 = r7;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.J$0 = j;
                        this.label = 8;
                        if (m.a(mVar4, notification, iefVar, this) != r2) {
                            mVar11 = r7;
                            j4 = j;
                            mVar12 = mVar;
                            mVar13 = mVar4;
                            mVar4 = mVar13;
                            j3 = j4;
                            com.yandex.go.scooters.ignition.analytics.a aVar4 = mVar4.f;
                            com.yandex.go.scooters.ignition.data.b bVar3 = mVar4.e;
                            this.L$0 = null;
                            this.L$1 = mVar12;
                            this.L$2 = mVar11;
                            this.L$3 = null;
                            this.L$4 = aVar4;
                            this.L$5 = null;
                            this.J$0 = j3;
                            this.label = 9;
                            d = bVar3.d(this);
                            if (d != r2) {
                                mVar14 = mVar12;
                                mVar15 = mVar11;
                                aVar2 = aVar4;
                                j5 = j3;
                                list3 = (List) d;
                                this.L$0 = null;
                                this.L$1 = mVar14;
                                this.L$2 = mVar15;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.J$0 = j5;
                                this.label = 10;
                                aVar2.getClass();
                                if (aVar2.d("response", Boolean.valueOf(list3.isEmpty()), new qh2(list3, 14), this) != r2) {
                                    mVar16 = mVar15;
                                    mVar16.i.b = SystemClock.elapsedRealtime();
                                    gsn0Var = mVar16.i;
                                    gsn0Var.a = false;
                                    return zy11Var;
                                }
                            }
                        }
                    } else {
                        mVar11 = r7;
                        j3 = j;
                        mVar12 = mVar;
                        com.yandex.go.scooters.ignition.analytics.a aVar42 = mVar4.f;
                        com.yandex.go.scooters.ignition.data.b bVar32 = mVar4.e;
                        this.L$0 = null;
                        this.L$1 = mVar12;
                        this.L$2 = mVar11;
                        this.L$3 = null;
                        this.L$4 = aVar42;
                        this.L$5 = null;
                        this.J$0 = j3;
                        this.label = 9;
                        d = bVar32.d(this);
                        if (d != r2) {
                        }
                    }
                }
                return r2;
            case 4:
                j = this.J$0;
                m mVar18 = (m) this.L$4;
                m mVar19 = (m) this.L$3;
                tls tlsVar2 = (tls) this.L$2;
                m mVar20 = (m) this.L$1;
                try {
                    kotlin.b.b(obj);
                    mVar4 = mVar20;
                    tlsVar = tlsVar2;
                    mVar = mVar19;
                    mVar5 = mVar18;
                    a = obj;
                    scootersIgnitionResponse = (ScootersIgnitionResponse) a;
                    bVar = mVar4.e;
                    this.L$0 = null;
                    this.L$1 = mVar4;
                    this.L$2 = tlsVar;
                    this.L$3 = mVar;
                    this.L$4 = mVar5;
                    this.L$5 = scootersIgnitionResponse;
                    this.J$0 = j;
                    this.label = 5;
                    mVar6 = mVar5;
                    if (bVar.c(this) == r2) {
                    }
                    list2 = scootersIgnitionResponse.c;
                    this.L$0 = null;
                    this.L$1 = mVar4;
                    this.L$2 = tlsVar;
                    this.L$3 = mVar;
                    this.L$4 = mVar6;
                    this.L$5 = scootersIgnitionResponse;
                    this.J$0 = j;
                    this.label = 6;
                    mVar7 = mVar6;
                    if (m.b(mVar4, list2, this) == r2) {
                    }
                    rideParams = scootersIgnitionResponse.d;
                    r7 = mVar7;
                    if (rideParams != null) {
                    }
                    notification = scootersIgnitionResponse.b;
                    if (notification != null) {
                    }
                } catch (Throwable unused5) {
                    mVar = mVar19;
                    r3 = mVar18;
                    r7 = r3;
                    jst.e.getClass();
                    aVar = mVar.f;
                    this.L$0 = null;
                    this.L$1 = r7;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = j;
                    this.label = 11;
                    emptyList = EmptyList.a;
                    aVar.getClass();
                    if (aVar.d("response", Boolean.TRUE, new qh2(emptyList, 14), this) != r2) {
                        mVar3 = r7;
                        mVar3.i.b = SystemClock.elapsedRealtime();
                        gsn0Var = mVar3.i;
                        gsn0Var.a = false;
                        return zy11Var;
                    }
                    return r2;
                }
                break;
            case 5:
                j = this.J$0;
                scootersIgnitionResponse = (ScootersIgnitionResponse) this.L$5;
                m mVar21 = (m) this.L$4;
                mVar = (m) this.L$3;
                tlsVar = (tls) this.L$2;
                mVar4 = (m) this.L$1;
                kotlin.b.b(obj);
                mVar6 = mVar21;
                list2 = scootersIgnitionResponse.c;
                this.L$0 = null;
                this.L$1 = mVar4;
                this.L$2 = tlsVar;
                this.L$3 = mVar;
                this.L$4 = mVar6;
                this.L$5 = scootersIgnitionResponse;
                this.J$0 = j;
                this.label = 6;
                mVar7 = mVar6;
                if (m.b(mVar4, list2, this) == r2) {
                }
                rideParams = scootersIgnitionResponse.d;
                r7 = mVar7;
                if (rideParams != null) {
                }
                notification = scootersIgnitionResponse.b;
                if (notification != null) {
                }
                break;
            case 6:
                j = this.J$0;
                scootersIgnitionResponse = (ScootersIgnitionResponse) this.L$5;
                m mVar22 = (m) this.L$4;
                mVar = (m) this.L$3;
                tlsVar = (tls) this.L$2;
                mVar4 = (m) this.L$1;
                kotlin.b.b(obj);
                mVar7 = mVar22;
                rideParams = scootersIgnitionResponse.d;
                r7 = mVar7;
                if (rideParams != null) {
                }
                notification = scootersIgnitionResponse.b;
                if (notification != null) {
                }
                break;
            case 7:
                j2 = this.J$0;
                scootersIgnitionResponse = (ScootersIgnitionResponse) this.L$4;
                mVar8 = (m) this.L$3;
                mVar9 = (m) this.L$2;
                mVar10 = (m) this.L$1;
                kotlin.b.b(obj);
                mVar4 = mVar10;
                mVar = mVar9;
                r7 = mVar8;
                j = j2;
                notification = scootersIgnitionResponse.b;
                if (notification != null) {
                }
                break;
            case 8:
                long j7 = this.J$0;
                mVar11 = (m) this.L$3;
                mVar12 = (m) this.L$2;
                mVar13 = (m) this.L$1;
                kotlin.b.b(obj);
                j4 = j7;
                mVar4 = mVar13;
                j3 = j4;
                com.yandex.go.scooters.ignition.analytics.a aVar422 = mVar4.f;
                com.yandex.go.scooters.ignition.data.b bVar322 = mVar4.e;
                this.L$0 = null;
                this.L$1 = mVar12;
                this.L$2 = mVar11;
                this.L$3 = null;
                this.L$4 = aVar422;
                this.L$5 = null;
                this.J$0 = j3;
                this.label = 9;
                d = bVar322.d(this);
                if (d != r2) {
                }
                return r2;
            case 9:
                long j8 = this.J$0;
                aVar2 = (com.yandex.go.scooters.ignition.analytics.a) this.L$4;
                mVar15 = (m) this.L$2;
                mVar14 = (m) this.L$1;
                kotlin.b.b(obj);
                d = obj;
                j5 = j8;
                list3 = (List) d;
                this.L$0 = null;
                this.L$1 = mVar14;
                this.L$2 = mVar15;
                this.L$3 = null;
                this.L$4 = null;
                this.J$0 = j5;
                this.label = 10;
                aVar2.getClass();
                if (aVar2.d("response", Boolean.valueOf(list3.isEmpty()), new qh2(list3, 14), this) != r2) {
                }
                return r2;
            case 10:
                long j9 = this.J$0;
                mVar16 = (m) this.L$2;
                kotlin.b.b(obj);
                mVar16.i.b = SystemClock.elapsedRealtime();
                gsn0Var = mVar16.i;
                gsn0Var.a = false;
                return zy11Var;
            case 11:
                mVar3 = (m) this.L$1;
                kotlin.b.b(obj);
                mVar3.i.b = SystemClock.elapsedRealtime();
                gsn0Var = mVar3.i;
                gsn0Var.a = false;
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
