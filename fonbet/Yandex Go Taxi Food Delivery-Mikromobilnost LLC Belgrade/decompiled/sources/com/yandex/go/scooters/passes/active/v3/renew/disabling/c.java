package com.yandex.go.scooters.passes.active.v3.renew.disabling;

import com.yandex.go.scooters.passes.active.domain.f;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.avm0;
import defpackage.bsm0;
import defpackage.csm0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qu;
import defpackage.umm0;
import defpackage.w511;
import defpackage.wqm0;
import defpackage.yrm0;
import defpackage.yum0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.r;

/* loaded from: classes13.dex */
public final class c {
    public final f a;
    public final r b;

    public c(f fVar, r rVar) {
        this.a = fVar;
        this.b = rVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|8|(1:(1:(5:12|13|14|15|16)(2:19|20))(2:21|22))(4:28|(1:30)(2:31|(2:33|(1:35)(2:36|(2:38|27)))(2:39|40))|15|16)|23|(1:25)|14|15|16))|47|6|7|8|(0)(0)|23|(0)|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
    
        if (r0.a(r7) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0041, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
    
        defpackage.zgz.a(null, r0);
        r11 = r14.a;
        r12 = (defpackage.m950) r11.I.get();
        r13 = new defpackage.zjn0(r0, (java.util.List) null, 6);
        defpackage.ujn0.a4.getClass();
        r11.A(r12, r13, defpackage.tjn0.b);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba A[Catch: all -> 0x0041, CancellationException -> 0x00f8, TryCatch #2 {CancellationException -> 0x00f8, all -> 0x0041, blocks: (B:13:0x003c, B:14:0x00cb, B:22:0x005c, B:23:0x00b0, B:25:0x00ba, B:36:0x0092), top: B:8:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(csm0 csm0Var, avm0 avm0Var, ScootersPassesFromScreen scootersPassesFromScreen, yrm0 yrm0Var, ContinuationImpl continuationImpl) {
        ScootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1 scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1;
        int i;
        r rVar = this.b;
        if (continuationImpl instanceof ScootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1) {
            scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1 = (ScootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1) continuationImpl;
            int i2 = scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                ScootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1 scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12 = scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1;
                Object obj = scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(csm0Var, bsm0.a)) {
                        yrm0Var.a.r(new qu(9));
                    } else {
                        if (!jl40.l(csm0Var, bsm0.b)) {
                            w511.b();
                            return null;
                        }
                        if (avm0Var.i != null) {
                            yrm0Var.a.r(new umm0(13));
                        } else {
                            f fVar = this.a;
                            String str = avm0Var.a;
                            yum0 yum0Var = avm0Var.g;
                            boolean z = !yum0Var.g;
                            wqm0 wqm0Var = yum0Var.e;
                            scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.L$0 = null;
                            scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.L$1 = null;
                            scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.L$2 = null;
                            scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.L$3 = yrm0Var;
                            scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.label = 1;
                            if (fVar.a(scootersPassesFromScreen, str, z, wqm0Var, scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yrm0Var = (yrm0) scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.L$3;
                    kotlin.b.b(obj);
                    yrm0Var.a.r(new umm0(14));
                    return zy11.a;
                }
                yrm0Var = (yrm0) scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.L$3;
                kotlin.b.b(obj);
                if (rVar.b.a().h != null) {
                    scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.L$0 = null;
                    scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.L$1 = null;
                    scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.L$2 = null;
                    scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.L$3 = yrm0Var;
                    scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$12.label = 2;
                }
                yrm0Var.a.r(new umm0(14));
                return zy11.a;
            }
        }
        scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1 = new ScootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1(this, continuationImpl);
        ScootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1 scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$122 = scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1;
        Object obj2 = scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$122.label;
        if (i != 0) {
        }
        if (rVar.b.a().h != null) {
        }
        yrm0Var.a.r(new umm0(14));
        return zy11.a;
    }
}
