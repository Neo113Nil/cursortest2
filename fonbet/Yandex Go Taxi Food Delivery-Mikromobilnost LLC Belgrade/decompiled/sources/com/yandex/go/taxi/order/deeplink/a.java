package com.yandex.go.taxi.order.deeplink;

import android.net.Uri;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$PreferredScreenType;
import defpackage.h3y;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.k0y0;
import defpackage.l0y0;
import defpackage.m0y0;
import defpackage.m950;
import defpackage.n0y0;
import defpackage.ny61;
import defpackage.o0y0;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.p0y0;
import defpackage.pep0;
import defpackage.pre0;
import defpackage.q0y0;
import defpackage.r0y0;
import defpackage.s0y0;
import defpackage.v770;
import defpackage.w511;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class a extends s0y0 {
    public final com.yandex.go.taxi.order.multi.a b;
    public final yvf0 c;
    public final b d;
    public final h3y e;
    public boolean f = true;

    public a(com.yandex.go.taxi.order.multi.a aVar, yvf0 yvf0Var, b bVar, h3y h3yVar) {
        this.b = aVar;
        this.c = yvf0Var;
        this.d = bVar;
        this.e = h3yVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return this.f;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (r0y0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, r0y0 r0y0Var, ContinuationImpl continuationImpl) {
        TaxiOrderDeeplinkHandler$handleDeeplink$1 taxiOrderDeeplinkHandler$handleDeeplink$1;
        int i;
        p0y0 p0y0Var;
        if (continuationImpl instanceof TaxiOrderDeeplinkHandler$handleDeeplink$1) {
            taxiOrderDeeplinkHandler$handleDeeplink$1 = (TaxiOrderDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = taxiOrderDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderDeeplinkHandler$handleDeeplink$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Uri a = r0y0Var.a();
                    taxiOrderDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    taxiOrderDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    taxiOrderDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    taxiOrderDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    taxiOrderDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.d.b(a, taxiOrderDeeplinkHandler$handleDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    oep0Var = (oep0) taxiOrderDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                p0y0Var = (p0y0) obj;
                if (!(p0y0Var instanceof n0y0)) {
                    this.f = true;
                } else {
                    if (!(p0y0Var instanceof m0y0)) {
                        if (!(p0y0Var instanceof o0y0)) {
                            w511.b();
                            return null;
                        }
                        taxiOrderDeeplinkHandler$handleDeeplink$1.L$0 = null;
                        taxiOrderDeeplinkHandler$handleDeeplink$1.L$1 = null;
                        taxiOrderDeeplinkHandler$handleDeeplink$1.L$2 = null;
                        taxiOrderDeeplinkHandler$handleDeeplink$1.L$3 = null;
                        taxiOrderDeeplinkHandler$handleDeeplink$1.L$4 = null;
                        taxiOrderDeeplinkHandler$handleDeeplink$1.label = 2;
                        Object e = e((o0y0) p0y0Var, taxiOrderDeeplinkHandler$handleDeeplink$1);
                        return e == obj2 ? obj2 : e;
                    }
                    m0y0 m0y0Var = (m0y0) p0y0Var;
                    if (m0y0Var.a() != null) {
                        ((pep0) oep0Var).f((m950) this.c.get(), new pre0(m0y0Var.a()), hxx.a);
                        this.f = false;
                    } else {
                        this.f = true;
                    }
                }
                return zy11.a;
            }
        }
        taxiOrderDeeplinkHandler$handleDeeplink$1 = new TaxiOrderDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj3 = taxiOrderDeeplinkHandler$handleDeeplink$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        p0y0Var = (p0y0) obj3;
        if (!(p0y0Var instanceof n0y0)) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(o0y0 o0y0Var, ContinuationImpl continuationImpl) {
        TaxiOrderDeeplinkHandler$handleSuccess$1 taxiOrderDeeplinkHandler$handleSuccess$1;
        int i;
        if (continuationImpl instanceof TaxiOrderDeeplinkHandler$handleSuccess$1) {
            taxiOrderDeeplinkHandler$handleSuccess$1 = (TaxiOrderDeeplinkHandler$handleSuccess$1) continuationImpl;
            int i2 = taxiOrderDeeplinkHandler$handleSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderDeeplinkHandler$handleSuccess$1.label = i2 - Integer.MIN_VALUE;
                TaxiOrderDeeplinkHandler$handleSuccess$1 taxiOrderDeeplinkHandler$handleSuccess$12 = taxiOrderDeeplinkHandler$handleSuccess$1;
                Object obj = taxiOrderDeeplinkHandler$handleSuccess$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderDeeplinkHandler$handleSuccess$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o2y0 b = o0y0Var.b();
                    l0y0 a = o0y0Var.a();
                    TaxiOrder b2 = b.b();
                    boolean z = a.b() == TaxiOrderDeeplink$PreferredScreenType.ORDER_WITH_FEED;
                    DetailsOpenReason detailsOpenReason = DetailsOpenReason.DEEPLINK;
                    this.d.getClass();
                    TaxiCardNavigationAction taxiCardNavigationAction = a instanceof k0y0 ? jl40.l(((k0y0) a).d(), "custom") ? TaxiCardNavigationAction.OPEN_CUSTOM_TIPS_INPUT : TaxiCardNavigationAction.EXPAND_ORDER_CARD : TaxiCardNavigationAction.EMPTY;
                    taxiOrderDeeplinkHandler$handleSuccess$12.L$0 = o0y0Var;
                    taxiOrderDeeplinkHandler$handleSuccess$12.L$1 = null;
                    taxiOrderDeeplinkHandler$handleSuccess$12.L$2 = null;
                    taxiOrderDeeplinkHandler$handleSuccess$12.label = 1;
                    if (this.b.a(b2, z, detailsOpenReason, taxiCardNavigationAction, taxiOrderDeeplinkHandler$handleSuccess$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o0y0Var = (o0y0) taxiOrderDeeplinkHandler$handleSuccess$12.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                }
                ((q0y0) this.e.get()).a(o0y0Var);
                this.f = true;
                return zy11.a;
            }
        }
        taxiOrderDeeplinkHandler$handleSuccess$1 = new TaxiOrderDeeplinkHandler$handleSuccess$1(this, continuationImpl);
        TaxiOrderDeeplinkHandler$handleSuccess$1 taxiOrderDeeplinkHandler$handleSuccess$122 = taxiOrderDeeplinkHandler$handleSuccess$1;
        Object obj2 = taxiOrderDeeplinkHandler$handleSuccess$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderDeeplinkHandler$handleSuccess$122.label;
        if (i != 0) {
        }
        ((q0y0) this.e.get()).a(o0y0Var);
        this.f = true;
        return zy11.a;
    }
}
