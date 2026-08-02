package com.yandex.go.drive.sdkintegration.domain.session.drive;

import com.yandex.go.drive.experiments.DriveLazyInitExperiment;
import defpackage.e2t;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.g92;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ncm;
import defpackage.ny61;
import defpackage.sxq0;
import defpackage.tpr;
import defpackage.u6r;
import defpackage.v6r;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.domain.session.drive.DriveSessionStateInteractor$needFetchDriveStateFlow$$inlined$flatMapLatest$1", f = "DriveSessionStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class DriveSessionStateInteractor$needFetchDriveStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveSessionStateInteractor$needFetchDriveStateFlow$$inlined$flatMapLatest$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DriveSessionStateInteractor$needFetchDriveStateFlow$$inlined$flatMapLatest$1 driveSessionStateInteractor$needFetchDriveStateFlow$$inlined$flatMapLatest$1 = new DriveSessionStateInteractor$needFetchDriveStateFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        driveSessionStateInteractor$needFetchDriveStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        driveSessionStateInteractor$needFetchDriveStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return driveSessionStateInteractor$needFetchDriveStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g92 g92Var;
        tpr tprVar;
        v6r v6rVar;
        u6r u6rVar;
        sxq0 sxq0Var;
        ncm ncmVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            DriveLazyInitExperiment driveLazyInitExperiment = (DriveLazyInitExperiment) obj2;
            boolean z = driveLazyInitExperiment.b;
            DriveLazyInitExperiment.InitType initType = driveLazyInitExperiment.c;
            if (z && initType == DriveLazyInitExperiment.InitType.DRIVE_FLOW_ENTERED) {
                tprVar = ((com.yandex.go.drive.sdkintegration.domain.a) this.this$0.c.get()).a();
            } else {
                if (z && initType == DriveLazyInitExperiment.InitType.DRIVE_FINAL_SUGGEST_AVAILABILITY) {
                    g2t a = ((f2t) ((e2t) this.this$0.d.get())).a();
                    g92Var = new g92(2, Boolean.valueOf((a == null || (v6rVar = a.a) == null || (u6rVar = v6rVar.a) == null || (sxq0Var = u6rVar.d) == null || (ncmVar = sxq0Var.b) == null) ? false : jl40.l(ncmVar.a, Boolean.TRUE)));
                } else {
                    g92Var = new g92(2, Boolean.TRUE);
                }
                tprVar = g92Var;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(tprVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
