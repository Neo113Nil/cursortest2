package com.yandex.go.taxi.order.multi.feed.ui;

import defpackage.a1y0;
import defpackage.d1y0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.z0y0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ a1y0 a;
    public final /* synthetic */ z0y0 b;

    public a(a1y0 a1y0Var, z0y0 z0y0Var) {
        this.a = a1y0Var;
        this.b = z0y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1 taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1;
        int i;
        d1y0 d1y0Var;
        DriveState driveState;
        o2y0 o2y0Var;
        if (continuation instanceof TaxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1) {
            taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1 = (TaxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1) continuation;
            int i2 = taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    d1y0Var = (d1y0) obj;
                    long j = d1y0Var.d;
                    taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1.L$0 = null;
                    taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1.L$1 = null;
                    taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1.L$2 = d1y0Var;
                    taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1.label = 1;
                    if (kotlinx.coroutines.a.i(j, taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d1y0Var = (d1y0) taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1.L$2;
                    kotlin.b.b(obj2);
                }
                a1y0 a1y0Var = this.a;
                driveState = d1y0Var.b;
                o2y0Var = (o2y0) a1y0Var.x.q.getValue();
                if ((o2y0Var != null ? false : kotlin.collections.a.G(o2y0Var.b().l.c0, driveState)) || d1y0Var.f) {
                    this.a.Kg(d1y0Var.b);
                    this.b.Hd(d1y0Var.a, d1y0Var.c);
                    this.b.La(d1y0Var.e);
                }
                return zy11.a;
            }
        }
        taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1 = new TaxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1(this, continuation);
        Object obj22 = taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderFeedPresenter$attachView$$inlined$collectIn$1$1$1.label;
        if (i != 0) {
        }
        a1y0 a1y0Var2 = this.a;
        driveState = d1y0Var.b;
        o2y0Var = (o2y0) a1y0Var2.x.q.getValue();
        if (o2y0Var != null ? false : kotlin.collections.a.G(o2y0Var.b().l.c0, driveState)) {
        }
        this.a.Kg(d1y0Var.b);
        this.b.Hd(d1y0Var.a, d1y0Var.c);
        this.b.La(d1y0Var.e);
        return zy11.a;
    }
}
