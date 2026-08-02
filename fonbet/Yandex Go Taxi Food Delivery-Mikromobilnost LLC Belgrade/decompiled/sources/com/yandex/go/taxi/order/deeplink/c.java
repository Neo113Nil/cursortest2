package com.yandex.go.taxi.order.deeplink;

import android.content.Intent;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a780;
import defpackage.c1x0;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.k0y0;
import defpackage.l0y0;
import defpackage.m0y0;
import defpackage.m5u;
import defpackage.mw40;
import defpackage.n0y0;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.o0y0;
import defpackage.p0y0;
import defpackage.q0y0;
import defpackage.q870;
import defpackage.t0y0;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class c {
    public final ru.yandex.taxi.deeplinks.b a;
    public final b b;
    public final mw40 c;
    public final h3y d;
    public final c1x0 e;

    public c(ru.yandex.taxi.deeplinks.b bVar, b bVar2, mw40 mw40Var, h3y h3yVar, c1x0 c1x0Var) {
        this.a = bVar;
        this.b = bVar2;
        this.c = mw40Var;
        this.d = h3yVar;
        this.e = c1x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, Intent intent, ContinuationImpl continuationImpl) {
        TaxiOrderHotDeeplinkHandler$handleIntent$1 taxiOrderHotDeeplinkHandler$handleIntent$1;
        int i;
        p0y0 p0y0Var;
        cVar.getClass();
        if (continuationImpl instanceof TaxiOrderHotDeeplinkHandler$handleIntent$1) {
            taxiOrderHotDeeplinkHandler$handleIntent$1 = (TaxiOrderHotDeeplinkHandler$handleIntent$1) continuationImpl;
            int i2 = taxiOrderHotDeeplinkHandler$handleIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderHotDeeplinkHandler$handleIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderHotDeeplinkHandler$handleIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderHotDeeplinkHandler$handleIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = cVar.b;
                    taxiOrderHotDeeplinkHandler$handleIntent$1.L$0 = null;
                    taxiOrderHotDeeplinkHandler$handleIntent$1.label = 1;
                    bVar.getClass();
                    obj = bVar.b(intent.getData(), taxiOrderHotDeeplinkHandler$handleIntent$1);
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
                p0y0Var = (p0y0) obj;
                if (!(p0y0Var instanceof n0y0)) {
                    return n5u.a;
                }
                if (p0y0Var instanceof m0y0) {
                    return new m5u(false, false);
                }
                if (!(p0y0Var instanceof o0y0)) {
                    w511.b();
                    return null;
                }
                c1x0 c1x0Var = cVar.e;
                o0y0 o0y0Var = (o0y0) p0y0Var;
                c1x0Var.getClass();
                TaxiOrder b = o0y0Var.b.b();
                boolean z = b.h.b == DriveState.COMPLETE && !b.l.A;
                String str = b.a;
                String x = b.x();
                boolean z2 = b.b.g0;
                DriveState driveState = b.h.b;
                b bVar2 = (b) c1x0Var.a;
                l0y0 l0y0Var = o0y0Var.a;
                bVar2.getClass();
                q870 q870Var = new q870(new t0y0(str, x, z2, true, driveState, z, l0y0Var instanceof k0y0 ? jl40.l(((k0y0) l0y0Var).d(), "custom") ? TaxiCardNavigationAction.OPEN_CUSTOM_TIPS_INPUT : TaxiCardNavigationAction.EXPAND_ORDER_CARD : TaxiCardNavigationAction.EMPTY, false, DetailsOpenReason.DEEPLINK));
                mw40 mw40Var = cVar.c;
                a780 a780Var = mw40Var.a;
                if (a780Var != null) {
                    a780Var.a(q870Var);
                } else {
                    mw40Var.b = q870Var;
                }
                ((q0y0) cVar.d.get()).a(o0y0Var);
                return new m5u(true, false);
            }
        }
        taxiOrderHotDeeplinkHandler$handleIntent$1 = new TaxiOrderHotDeeplinkHandler$handleIntent$1(cVar, continuationImpl);
        Object obj2 = taxiOrderHotDeeplinkHandler$handleIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderHotDeeplinkHandler$handleIntent$1.label;
        if (i != 0) {
        }
        p0y0Var = (p0y0) obj2;
        if (!(p0y0Var instanceof n0y0)) {
        }
    }
}
