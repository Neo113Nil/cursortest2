package com.yandex.go.explorer.impl.geofencing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.internal.identity.zzek;
import com.yandex.go.explorer.impl.experiments.ExplorerExperiment;
import com.yandex.go.explorer.impl.experiments.g;
import defpackage.h6r;
import defpackage.hst;
import defpackage.hwa1;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2t;
import defpackage.p300;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tse;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;
import defpackage.zzf;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.geofencing.ExplorerGeofenceReceiver$onReceive$1", f = "ExplorerGeofenceReceiver.kt", l = {39, 41, 42, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ExplorerGeofenceReceiver$onReceive$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ ExplorerGeofenceReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerGeofenceReceiver$onReceive$1(Intent intent, Context context, ExplorerGeofenceReceiver explorerGeofenceReceiver, BroadcastReceiver.PendingResult pendingResult, Continuation continuation) {
        super(2, continuation);
        this.$intent = intent;
        this.$context = context;
        this.this$0 = explorerGeofenceReceiver;
        this.$pendingResult = pendingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerGeofenceReceiver$onReceive$1(this.$intent, this.$context, this.this$0, this.$pendingResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerGeofenceReceiver$onReceive$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01ce, code lost:
    
        if (r0.b(r15, r13) == r1) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b6 A[Catch: all -> 0x0032, CancellationException -> 0x0036, TRY_LEAVE, TryCatch #13 {CancellationException -> 0x0036, all -> 0x0032, blocks: (B:9:0x002d, B:22:0x01b0, B:24:0x01b6), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01af  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        BroadcastReceiver.PendingResult pendingResult;
        ExplorerGeofenceReceiver explorerGeofenceReceiver;
        BroadcastReceiver.PendingResult pendingResult2;
        CancellationException cancellationException;
        List list;
        h6r h6rVar;
        Throwable th2;
        CancellationException cancellationException2;
        o2t o2tVar;
        BroadcastReceiver.PendingResult pendingResult3;
        String e;
        CancellationException cancellationException3;
        Throwable th3;
        CancellationException cancellationException4;
        BroadcastReceiver.PendingResult pendingResult4;
        CancellationException cancellationException5;
        p300 p300Var;
        ExplorerGeofenceReceiver$onReceive$1 explorerGeofenceReceiver$onReceive$1;
        BroadcastReceiver.PendingResult pendingResult5;
        p300 p300Var2;
        Location location;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
            } catch (Throwable th4) {
                finish();
                throw th4;
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th5) {
            th = th5;
            pendingResult = this;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            Intent intent = this.$intent;
            Context context = this.$context;
            explorerGeofenceReceiver = this.this$0;
            pendingResult2 = this.$pendingResult;
            try {
                o2t a = o2t.a(intent);
                if (a != null) {
                    int i2 = a.a;
                    if (i2 != -1) {
                        hst hstVar = jst.e;
                        switch (i2) {
                            case 1000:
                                e = "GEOFENCE_NOT_AVAILABLE";
                                hstVar.c("GeofencingEvent error: ".concat(e));
                                break;
                            case 1001:
                                e = "GEOFENCE_TOO_MANY_GEOFENCES";
                                hstVar.c("GeofencingEvent error: ".concat(e));
                                break;
                            case 1002:
                                e = "GEOFENCE_TOO_MANY_PENDING_INTENTS";
                                hstVar.c("GeofencingEvent error: ".concat(e));
                                break;
                            case 1003:
                            default:
                                try {
                                    e = hwa1.e(i2);
                                    hstVar.c("GeofencingEvent error: ".concat(e));
                                    break;
                                } catch (CancellationException e3) {
                                    cancellationException2 = e3;
                                    cancellationException = cancellationException2;
                                    throw cancellationException;
                                } catch (Throwable th6) {
                                    th2 = th6;
                                    th = th2;
                                    pendingResult = pendingResult2;
                                    jst.e.k(th, "ExplorerGeofenceReceiver onReceive handler failed");
                                    pendingResult.finish();
                                    return zy11.a;
                                }
                            case 1004:
                                e = "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
                                hstVar.c("GeofencingEvent error: ".concat(e));
                                break;
                        }
                    } else if (a.b == 2 && (list = a.c) != null) {
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (jl40.l(((zzek) it.next()).getRequestId(), "explorer_geofence")) {
                                    h6rVar = (h6r) wwg.e(context, h6r.class);
                                    try {
                                        a s = ((zzf) h6rVar).s();
                                        this.L$0 = explorerGeofenceReceiver;
                                        this.L$1 = pendingResult2;
                                        this.L$2 = null;
                                        this.L$3 = a;
                                        this.L$4 = h6rVar;
                                        this.label = 1;
                                        Object c = s.c(this);
                                        if (c != coroutineSingletons) {
                                            o2tVar = a;
                                            obj = c;
                                            pendingResult3 = pendingResult2;
                                        }
                                        return coroutineSingletons;
                                    } catch (CancellationException e4) {
                                        cancellationException2 = e4;
                                        cancellationException = cancellationException2;
                                        throw cancellationException;
                                    } catch (Throwable th7) {
                                        th2 = th7;
                                        th = th2;
                                        pendingResult = pendingResult2;
                                        jst.e.k(th, "ExplorerGeofenceReceiver onReceive handler failed");
                                        pendingResult.finish();
                                        return zy11.a;
                                    }
                                }
                            }
                        }
                    }
                }
                pendingResult2.finish();
            } catch (CancellationException e5) {
                cancellationException = e5;
            } catch (Throwable th8) {
                th = th8;
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    BroadcastReceiver.PendingResult pendingResult6 = (BroadcastReceiver.PendingResult) this.L$0;
                    kotlin.b.b(obj);
                    this = pendingResult6;
                    pendingResult2 = this;
                    pendingResult2.finish();
                    return zy11.a;
                }
                p300 p300Var3 = (h6r) this.L$3;
                BroadcastReceiver.PendingResult pendingResult7 = (BroadcastReceiver.PendingResult) this.L$0;
                try {
                    kotlin.b.b(obj);
                    explorerGeofenceReceiver$onReceive$1 = this;
                    pendingResult5 = pendingResult7;
                    p300Var2 = p300Var3;
                    location = (Location) obj;
                    this = pendingResult5;
                    if (location != null) {
                        a s2 = ((zzf) p300Var2).s();
                        explorerGeofenceReceiver$onReceive$1.L$0 = pendingResult5;
                        explorerGeofenceReceiver$onReceive$1.L$1 = null;
                        explorerGeofenceReceiver$onReceive$1.L$2 = null;
                        explorerGeofenceReceiver$onReceive$1.L$3 = null;
                        explorerGeofenceReceiver$onReceive$1.L$4 = null;
                        explorerGeofenceReceiver$onReceive$1.L$5 = null;
                        explorerGeofenceReceiver$onReceive$1.label = 4;
                        this = pendingResult5;
                    }
                    pendingResult2 = this;
                    pendingResult2.finish();
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th9) {
                    th = th9;
                    pendingResult = pendingResult7;
                    jst.e.k(th, "ExplorerGeofenceReceiver onReceive handler failed");
                    pendingResult.finish();
                    return zy11.a;
                }
                return zy11.a;
            }
            p300 p300Var4 = (h6r) this.L$4;
            o2tVar = (o2t) this.L$3;
            pendingResult4 = (BroadcastReceiver.PendingResult) this.L$1;
            ExplorerGeofenceReceiver explorerGeofenceReceiver2 = (ExplorerGeofenceReceiver) this.L$0;
            try {
                kotlin.b.b(obj);
                explorerGeofenceReceiver = explorerGeofenceReceiver2;
                p300Var = p300Var4;
                ExplorerExperiment.GeofenceParams geofenceParams = ((ExplorerExperiment) obj).f;
                Location location2 = o2tVar.d;
                try {
                    b bVar = (b) ((zzf) p300Var).ug.get();
                    int i3 = geofenceParams.b;
                    int i4 = geofenceParams.c;
                    this.L$0 = pendingResult4;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = p300Var;
                    this.L$4 = null;
                    this.label = 3;
                    explorerGeofenceReceiver$onReceive$1 = this;
                    obj = explorerGeofenceReceiver.resolveLocation(location2, bVar, i3, i4, explorerGeofenceReceiver$onReceive$1);
                } catch (CancellationException e7) {
                    cancellationException5 = e7;
                    throw cancellationException5;
                } catch (Throwable th10) {
                    th = th10;
                    pendingResult = pendingResult4;
                    jst.e.k(th, "ExplorerGeofenceReceiver onReceive handler failed");
                    pendingResult.finish();
                    return zy11.a;
                }
            } catch (CancellationException e8) {
                cancellationException5 = e8;
                throw cancellationException5;
            } catch (Throwable th11) {
                th = th11;
                pendingResult = pendingResult4;
                jst.e.k(th, "ExplorerGeofenceReceiver onReceive handler failed");
                pendingResult.finish();
                return zy11.a;
            }
            if (obj != coroutineSingletons) {
                pendingResult5 = pendingResult4;
                p300Var2 = p300Var;
                location = (Location) obj;
                this = pendingResult5;
                if (location != null) {
                }
                pendingResult2 = this;
                pendingResult2.finish();
                return zy11.a;
            }
            return coroutineSingletons;
        }
        h6rVar = (h6r) this.L$4;
        o2tVar = (o2t) this.L$3;
        pendingResult3 = (BroadcastReceiver.PendingResult) this.L$1;
        explorerGeofenceReceiver = (ExplorerGeofenceReceiver) this.L$0;
        try {
            kotlin.b.b(obj);
        } catch (CancellationException e9) {
            cancellationException3 = e9;
            throw cancellationException3;
        } catch (Throwable th12) {
            th = th12;
            pendingResult = pendingResult3;
            jst.e.k(th, "ExplorerGeofenceReceiver onReceive handler failed");
            pendingResult.finish();
            return zy11.a;
        }
        if (((Boolean) obj).booleanValue()) {
            pendingResult2 = pendingResult3;
            pendingResult2.finish();
            return zy11.a;
        }
        try {
            zzf zzfVar = (zzf) h6rVar;
            g gVar = new g((rqo) zzfVar.C.get());
            this.L$0 = explorerGeofenceReceiver;
            this.L$1 = pendingResult3;
            this.L$2 = null;
            this.L$3 = o2tVar;
            this.L$4 = zzfVar;
            this.label = 2;
            try {
                obj = ((t1b0) gVar.b.getValue()).b(this);
                if (obj != coroutineSingletons) {
                    pendingResult4 = pendingResult3;
                    p300Var = zzfVar;
                    ExplorerExperiment.GeofenceParams geofenceParams2 = ((ExplorerExperiment) obj).f;
                    Location location22 = o2tVar.d;
                    b bVar2 = (b) ((zzf) p300Var).ug.get();
                    int i32 = geofenceParams2.b;
                    int i42 = geofenceParams2.c;
                    this.L$0 = pendingResult4;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = p300Var;
                    this.L$4 = null;
                    this.label = 3;
                    explorerGeofenceReceiver$onReceive$1 = this;
                    obj = explorerGeofenceReceiver.resolveLocation(location22, bVar2, i32, i42, explorerGeofenceReceiver$onReceive$1);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            } catch (CancellationException e10) {
                cancellationException4 = e10;
                cancellationException3 = cancellationException4;
                throw cancellationException3;
            } catch (Throwable th13) {
                th3 = th13;
                th = th3;
                pendingResult = pendingResult3;
                jst.e.k(th, "ExplorerGeofenceReceiver onReceive handler failed");
                pendingResult.finish();
                return zy11.a;
            }
        } catch (CancellationException e11) {
            cancellationException4 = e11;
        } catch (Throwable th14) {
            th3 = th14;
        }
    }
}
