package com.yandex.go.taxi.order.multi.feed.domain;

import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.api.multi.TaxiOrderPresentationType;
import defpackage.clk0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.u4y0;
import defpackage.wl40;
import defpackage.x0y0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class a {
    public final x0y0 a;
    public final g b;
    public final clk0 c;

    public a(x0y0 x0y0Var, g gVar, clk0 clk0Var) {
        this.a = x0y0Var;
        this.b = gVar;
        this.c = clk0Var;
    }

    public final u4y0 a() {
        clk0 clk0Var = this.c;
        if (!clk0Var.d()) {
            return this.a.a();
        }
        o2y0 o2y0Var = (o2y0) kotlin.collections.a.b0(this.b.a().a);
        if (o2y0Var == null) {
            return null;
        }
        return new u4y0(o2y0Var.b().b.g0, clk0Var.g(), o2y0Var.b().a, o2y0Var.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(ContinuationImpl continuationImpl) {
        SingleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1 singleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1;
        int i;
        wl40 wl40Var;
        if (continuationImpl instanceof SingleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1) {
            singleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1 = (SingleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1) continuationImpl;
            int i2 = singleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = singleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1.label;
                if (i != 0) {
                    b.b(obj);
                    kotlinx.coroutines.flow.internal.g h = this.b.h();
                    singleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1.label = 1;
                    obj = e.A(h, singleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                wl40Var = (wl40) obj;
                if (wl40Var == null) {
                    wl40Var = wl40.j;
                }
                if (wl40Var.j() == 1) {
                    return TaxiOrderPresentationType.DETAILS;
                }
                o2y0 o2y0Var = (o2y0) kotlin.collections.a.R(wl40Var.a);
                if (o2y0Var == null) {
                    if (this.c.d()) {
                        return this.c.g() ? TaxiOrderPresentationType.DETAILS : TaxiOrderPresentationType.TRACKING;
                    }
                    x0y0 x0y0Var = this.a;
                    u4y0 a = x0y0Var.a();
                    return x0y0Var.b(a != null ? a.b() : null) ? TaxiOrderPresentationType.TRACKING : TaxiOrderPresentationType.DETAILS;
                }
                if (o2y0Var.b().l.getA() && o2y0Var.b().l.getY()) {
                    return TaxiOrderPresentationType.DETAILS;
                }
                boolean g = this.c.d() ? this.c.g() : o2y0Var.b().l.getY();
                String str = o2y0Var.b().a;
                String d = o2y0Var.d();
                boolean z = o2y0Var.b().b.g0;
                clk0 clk0Var = this.c;
                return g ? TaxiOrderPresentationType.DETAILS : clk0Var.d() ? clk0Var.g() ? TaxiOrderPresentationType.DETAILS : TaxiOrderPresentationType.TRACKING : this.a.b(d) ? TaxiOrderPresentationType.TRACKING : TaxiOrderPresentationType.DETAILS;
            }
        }
        singleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1 = new SingleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1(this, continuationImpl);
        Object obj2 = singleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleOrderWithContentContainerExperimentInteractor$getPresentationTypeConsiderMultiOrder$1.label;
        if (i != 0) {
        }
        wl40Var = (wl40) obj2;
        if (wl40Var == null) {
        }
        if (wl40Var.j() == 1) {
        }
    }

    public final TaxiOrderPresentationType c(u4y0 u4y0Var) {
        String b;
        if (u4y0Var == null || (b = u4y0Var.b()) == null) {
            return TaxiOrderPresentationType.DETAILS;
        }
        if (u4y0Var.a()) {
            return TaxiOrderPresentationType.DETAILS;
        }
        clk0 clk0Var = this.c;
        return clk0Var.d() ? clk0Var.g() ? TaxiOrderPresentationType.DETAILS : TaxiOrderPresentationType.TRACKING : this.a.b(b) ? TaxiOrderPresentationType.TRACKING : TaxiOrderPresentationType.DETAILS;
    }
}
