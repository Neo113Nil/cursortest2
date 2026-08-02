package com.yandex.go.drive.sdkintegration.domain.session.drive;

import com.yandex.go.drive.DriveSdkExperiment;
import com.yandex.mobile.drive.sdk.full.SessionState;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.e3n;
import defpackage.kfm;
import defpackage.kp50;
import defpackage.lqn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.qfm;
import defpackage.v3x;
import defpackage.vhf;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "Llqn;", "Luhf;", "Lvhf;", "Lcom/yandex/go/drive/sdkintegration/domain/session/DriveSdkSessionState;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.domain.session.drive.DriveSessionStateInteractor$sessionStateFlow$1", f = "DriveSessionStateInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 64, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 72}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DriveSessionStateInteractor$sessionStateFlow$1 extends SuspendLambda implements wls {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveSessionStateInteractor$sessionStateFlow$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DriveSessionStateInteractor$sessionStateFlow$1 driveSessionStateInteractor$sessionStateFlow$1 = new DriveSessionStateInteractor$sessionStateFlow$1(this.this$0, continuation);
        driveSessionStateInteractor$sessionStateFlow$1.L$0 = obj;
        return driveSessionStateInteractor$sessionStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveSessionStateInteractor$sessionStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0105, code lost:
    
        if (kotlinx.coroutines.a.j(r8, r12) != r1) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0105 -> B:8:0x0026). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lqn lqnVar;
        lqn lqnVar2;
        DriveSdkExperiment driveSdkExperiment;
        lqn lqnVar3;
        vhf vhfVar;
        int i;
        lqn lqnVar4;
        Object c;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            lqnVar = null;
            if (kotlinx.coroutines.a.p(get_context())) {
            }
        } else {
            if (i2 == 1) {
                lqn lqnVar5 = (lqn) this.L$1;
                kotlin.b.b(obj);
                lqnVar2 = lqnVar5;
                DriveSdkExperiment driveSdkExperiment2 = (DriveSdkExperiment) obj;
                c cVar = this.this$0;
                this.L$0 = vprVar;
                this.L$1 = lqnVar2;
                this.L$2 = driveSdkExperiment2;
                this.label = 2;
                c = c.c(cVar, lqnVar2, this);
                if (c != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 2) {
                driveSdkExperiment = (DriveSdkExperiment) this.L$2;
                lqnVar2 = (lqn) this.L$1;
                kotlin.b.b(obj);
                lqnVar4 = (lqn) obj;
                if (lqnVar4 != null) {
                }
                DriveSdkExperiment driveSdkExperiment3 = driveSdkExperiment;
                lqnVar3 = lqnVar2;
                this.this$0.getClass();
                if (lqnVar3 != null) {
                }
                if (vhfVar != null) {
                }
                i = driveSdkExperiment3.d;
                v3x.a.getClass();
                o430 o430Var = e3n.b;
                long U = kp50.U(i, DurationUnit.SECONDS);
                this.L$0 = vprVar;
                this.L$1 = lqnVar3;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i;
                this.label = 4;
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lqnVar3 = (lqn) this.L$1;
                    kotlin.b.b(obj);
                    lqnVar = lqnVar3;
                    if (kotlinx.coroutines.a.p(get_context())) {
                        return zy11.a;
                    }
                    kfm kfmVar = this.this$0.a;
                    this.L$0 = vprVar;
                    this.L$1 = lqnVar;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 1;
                    Object b = kfmVar.a.b(this);
                    if (b != coroutineSingletons) {
                        lqnVar2 = lqnVar;
                        obj = b;
                        DriveSdkExperiment driveSdkExperiment22 = (DriveSdkExperiment) obj;
                        c cVar2 = this.this$0;
                        this.L$0 = vprVar;
                        this.L$1 = lqnVar2;
                        this.L$2 = driveSdkExperiment22;
                        this.label = 2;
                        c = c.c(cVar2, lqnVar2, this);
                        if (c != coroutineSingletons) {
                            driveSdkExperiment = driveSdkExperiment22;
                            obj = c;
                            lqnVar4 = (lqn) obj;
                            if (lqnVar4 != null) {
                                v3x.a.getClass();
                                this.L$0 = vprVar;
                                this.L$1 = lqnVar4;
                                this.L$2 = driveSdkExperiment;
                                this.L$3 = null;
                                this.label = 3;
                                if (vprVar.emit(lqnVar4, this) != coroutineSingletons) {
                                    lqnVar2 = lqnVar4;
                                }
                            }
                            DriveSdkExperiment driveSdkExperiment32 = driveSdkExperiment;
                            lqnVar3 = lqnVar2;
                            this.this$0.getClass();
                            vhfVar = lqnVar3 != null ? (vhf) lqnVar3.a() : null;
                            if (vhfVar != null) {
                                ArrayList arrayList = vhfVar.b;
                                if (!arrayList.isEmpty()) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        if (((qfm) it.next()).a() == SessionState.unrecognized) {
                                            break;
                                        }
                                    }
                                }
                                i = driveSdkExperiment32.e;
                                v3x.a.getClass();
                                o430 o430Var2 = e3n.b;
                                long U2 = kp50.U(i, DurationUnit.SECONDS);
                                this.L$0 = vprVar;
                                this.L$1 = lqnVar3;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.I$0 = i;
                                this.label = 4;
                            }
                            i = driveSdkExperiment32.d;
                            v3x.a.getClass();
                            o430 o430Var22 = e3n.b;
                            long U22 = kp50.U(i, DurationUnit.SECONDS);
                            this.L$0 = vprVar;
                            this.L$1 = lqnVar3;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.I$0 = i;
                            this.label = 4;
                        }
                    }
                    return coroutineSingletons;
                }
                driveSdkExperiment = (DriveSdkExperiment) this.L$2;
                lqnVar2 = (lqn) this.L$1;
                kotlin.b.b(obj);
                DriveSdkExperiment driveSdkExperiment322 = driveSdkExperiment;
                lqnVar3 = lqnVar2;
                this.this$0.getClass();
                if (lqnVar3 != null) {
                }
                if (vhfVar != null) {
                }
                i = driveSdkExperiment322.d;
                v3x.a.getClass();
                o430 o430Var222 = e3n.b;
                long U222 = kp50.U(i, DurationUnit.SECONDS);
                this.L$0 = vprVar;
                this.L$1 = lqnVar3;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i;
                this.label = 4;
            }
        }
    }
}
