package com.yandex.go.yb.domain;

import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import com.yandex.go.zone.model.Zone;
import defpackage.bvf0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class o {
    public final com.yandex.go.yb.data.u a;
    public final tt2 b;
    public final com.yandex.go.taxi.tariffs.interactor.g c;
    public final hit d;
    public final h3y e;
    public volatile pzt0 f;
    public volatile String g = "";

    public o(com.yandex.go.yb.data.u uVar, tt2 tt2Var, com.yandex.go.taxi.tariffs.interactor.g gVar, hit hitVar, h3y h3yVar) {
        this.a = uVar;
        this.b = tt2Var;
        this.c = gVar;
        this.d = hitVar;
        this.e = h3yVar;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        pzt0 pzt0Var = this.f;
        if (!jl40.l(str, this.g) || pzt0Var == null || !pzt0Var.isActive()) {
            pzt0Var = null;
        }
        return pzt0Var == null ? bvf0.n(new UpdateYbWalletsInteractor$startUpdatePaymentMethodsIfNeed$3(this, str, null), continuationImpl) : pzt0Var;
    }

    public final void b() {
        hbp0 hbp0Var = this.d.a;
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new UpdateYbWalletsInteractor$updatePaymentMethods$1(this, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        UpdateYbWalletsInteractor$updatePaymentMethodsSynchronously$1 updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1;
        int i;
        YbWalletEntryPointExperiment ybWalletEntryPointExperiment;
        if (continuationImpl instanceof UpdateYbWalletsInteractor$updatePaymentMethodsSynchronously$1) {
            updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1 = (UpdateYbWalletsInteractor$updatePaymentMethodsSynchronously$1) continuationImpl;
            int i2 = updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(new com.yandex.go.taxi.tariffs.interactor.f(this.c.d.k()), updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1);
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
                        updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1.L$0 = null;
                        updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1.label = 3;
                        Object u0 = ((l8x) obj).u0(updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1);
                        return u0 == obj2 ? obj2 : u0;
                    }
                    kotlin.b.b(obj);
                }
                Zone zone = (Zone) obj;
                ybWalletEntryPointExperiment = (YbWalletEntryPointExperiment) zone.b(YbWalletEntryPointExperiment.class);
                if (ybWalletEntryPointExperiment != null || !ybWalletEntryPointExperiment.b) {
                    return zy11.a;
                }
                String str = zone.B;
                updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1.L$0 = null;
                updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1.label = 2;
                obj = a(str, updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1);
            }
        }
        updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1 = new UpdateYbWalletsInteractor$updatePaymentMethodsSynchronously$1(this, continuationImpl);
        Object obj3 = updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateYbWalletsInteractor$updatePaymentMethodsSynchronously$1.label;
        if (i != 0) {
        }
        Zone zone2 = (Zone) obj3;
        ybWalletEntryPointExperiment = (YbWalletEntryPointExperiment) zone2.b(YbWalletEntryPointExperiment.class);
        if (ybWalletEntryPointExperiment != null) {
        }
        return zy11.a;
    }
}
