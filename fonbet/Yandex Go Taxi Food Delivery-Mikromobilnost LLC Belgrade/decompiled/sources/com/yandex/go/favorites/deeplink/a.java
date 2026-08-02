package com.yandex.go.favorites.deeplink;

import com.yandex.go.address.models.PlaceType;
import defpackage.evu0;
import defpackage.fx60;
import defpackage.hip;
import defpackage.hxx;
import defpackage.i3c0;
import defpackage.iip;
import defpackage.m950;
import defpackage.mip;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.tka1;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class a extends iip {
    public final yvf0 b;
    public final fx60 c;

    public a(fx60 fx60Var, yvf0 yvf0Var) {
        this.b = yvf0Var;
        this.c = fx60Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (hip) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, hip hipVar, ContinuationImpl continuationImpl) {
        FavoritesDeeplinkHandler$handleDeeplink$1 favoritesDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        mip i2;
        if (continuationImpl instanceof FavoritesDeeplinkHandler$handleDeeplink$1) {
            favoritesDeeplinkHandler$handleDeeplink$1 = (FavoritesDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i3 = favoritesDeeplinkHandler$handleDeeplink$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                favoritesDeeplinkHandler$handleDeeplink$1.label = i3 - Integer.MIN_VALUE;
                obj = favoritesDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoritesDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                    favoritesDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    favoritesDeeplinkHandler$handleDeeplink$1.L$1 = hipVar;
                    favoritesDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    favoritesDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    favoritesDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.c.c(events$Zalogin$LoginContext, favoritesDeeplinkHandler$handleDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hipVar = (hip) favoritesDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) favoritesDeeplinkHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    m950 m950Var = (m950) this.b.get();
                    String d = hipVar.d();
                    String e = hipVar.e();
                    Boolean i4 = hipVar.i();
                    boolean booleanValue = i4 != null ? i4.booleanValue() : false;
                    if (d == null || evu0.J(d) || e == null || evu0.J(e)) {
                        i2 = tka1.i(booleanValue);
                    } else {
                        String g = hipVar.g();
                        if (g == null) {
                            g = "";
                        }
                        String f = hipVar.f();
                        if (f == null) {
                            f = "";
                        }
                        String c = hipVar.c();
                        if (c == null) {
                            c = "";
                        }
                        String a = hipVar.a();
                        if (a == null) {
                            a = "";
                        }
                        String b = hipVar.b();
                        if (b == null) {
                            b = "";
                        }
                        i3c0 i3c0Var = PlaceType.Companion;
                        String h = hipVar.h();
                        i3c0Var.getClass();
                        i2 = tka1.c(d, e, g, f, c, a, b, i3c0.a(h), booleanValue);
                    }
                    ((pep0) oep0Var).f(m950Var, i2, hxx.a);
                }
                return zy11.a;
            }
        }
        favoritesDeeplinkHandler$handleDeeplink$1 = new FavoritesDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = favoritesDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoritesDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
