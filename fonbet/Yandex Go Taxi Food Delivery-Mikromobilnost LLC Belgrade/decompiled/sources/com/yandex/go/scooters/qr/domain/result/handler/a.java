package com.yandex.go.scooters.qr.domain.result.handler;

import android.net.Uri;
import com.yandex.go.scooters.qr.domain.c;
import defpackage.aqo0;
import defpackage.bqo0;
import defpackage.cqo0;
import defpackage.ero0;
import defpackage.fro0;
import defpackage.g92;
import defpackage.hro0;
import defpackage.jl40;
import defpackage.m7p0;
import defpackage.mo21;
import defpackage.n7p0;
import defpackage.ny61;
import defpackage.o7p0;
import defpackage.opo0;
import defpackage.po21;
import defpackage.qoo0;
import defpackage.qpo0;
import defpackage.r7p0;
import defpackage.suo0;
import defpackage.w511;
import defpackage.zpo0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes13.dex */
public final class a implements suo0 {
    public final po21 a;
    public final qoo0 b;
    public final c c;

    public a(po21 po21Var, qoo0 qoo0Var, c cVar) {
        this.a = po21Var;
        this.b = qoo0Var;
        this.c = cVar;
    }

    @Override // defpackage.suo0
    public final Object a(hro0 hro0Var, Uri uri, SuspendLambda suspendLambda) {
        if (hro0Var instanceof ero0) {
            return c((ero0) hro0Var, uri, suspendLambda);
        }
        if (jl40.l(hro0Var, fro0.a)) {
            return b(hro0Var, suspendLambda);
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hro0 hro0Var, ContinuationImpl continuationImpl) {
        ScootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1 scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1;
        int i;
        if (continuationImpl instanceof ScootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1) {
            scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1 = (ScootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1) continuationImpl;
            int i2 = scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1.label;
                int i3 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(((qpo0) ((r0) this.b.b).getValue()) instanceof opo0)) {
                        return new g92(i3, new bqo0(hro0Var, false));
                    }
                    scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1.L$0 = null;
                    scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1.label = 1;
                    obj = this.c.c(false, scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new g92(i3, new zpo0((n7p0) obj));
            }
        }
        scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1 = new ScootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1(this, continuationImpl);
        Object obj2 = scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMultiorderPreviewFlowResultHandler$handleAlienVehicle$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        return new g92(i32, new zpo0((n7p0) obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ero0 ero0Var, Uri uri, ContinuationImpl continuationImpl) {
        ScootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1 scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1;
        int i;
        ero0 ero0Var2;
        int i2;
        o7p0 o7p0Var;
        int i3;
        r7p0 r7p0Var;
        Object cqo0Var;
        if (continuationImpl instanceof ScootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1) {
            scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1 = (ScootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1) continuationImpl;
            int i4 = scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.label = i4 - Integer.MIN_VALUE;
                Object obj = scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.label;
                int i5 = 2;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(((qpo0) ((r0) this.b.b).getValue()) instanceof opo0)) {
                        return new g92(i5, new bqo0(ero0Var, uri == null));
                    }
                    ?? r10 = uri == null ? 1 : 0;
                    r7p0 r7p0Var2 = ero0Var.a;
                    scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.L$0 = ero0Var;
                    scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.L$1 = null;
                    scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.I$0 = r10;
                    scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.label = 1;
                    obj = this.c.b(r7p0Var2, r10, true, scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1);
                    if (obj != coroutineSingletons) {
                        int i6 = r10;
                        ero0Var2 = ero0Var;
                        i2 = i6;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.I$0;
                    r7p0Var = (r7p0) scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.L$3;
                    kotlin.b.b(obj);
                    cqo0Var = new aqo0(r7p0Var, ((mo21) obj).a(), i3 != 0);
                    return new g92(i5, cqo0Var);
                }
                i2 = scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.I$0;
                ero0Var2 = (ero0) scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.L$0;
                kotlin.b.b(obj);
                o7p0Var = (o7p0) obj;
                if (!(o7p0Var instanceof m7p0)) {
                    cqo0Var = new aqo0(ero0Var2.a, ((m7p0) o7p0Var).a, i2 != 0);
                } else {
                    if (!(o7p0Var instanceof n7p0)) {
                        if (o7p0Var != null) {
                            w511.b();
                            return null;
                        }
                        r7p0 r7p0Var3 = ero0Var2.a;
                        scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.L$0 = null;
                        scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.L$1 = null;
                        scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.L$2 = null;
                        scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.L$3 = r7p0Var3;
                        scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.I$0 = i2;
                        scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.label = 2;
                        obj = ((e) this.a).h(scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1);
                        if (obj != coroutineSingletons) {
                            i3 = i2;
                            r7p0Var = r7p0Var3;
                            cqo0Var = new aqo0(r7p0Var, ((mo21) obj).a(), i3 != 0);
                        }
                        return coroutineSingletons;
                    }
                    cqo0Var = new cqo0((n7p0) o7p0Var);
                }
                return new g92(i5, cqo0Var);
            }
        }
        scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1 = new ScootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1(this, continuationImpl);
        Object obj2 = scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMultiorderPreviewFlowResultHandler$handleOurVehicle$1.label;
        int i52 = 2;
        if (i != 0) {
        }
        o7p0Var = (o7p0) obj2;
        if (!(o7p0Var instanceof m7p0)) {
        }
        return new g92(i52, cqo0Var);
    }
}
