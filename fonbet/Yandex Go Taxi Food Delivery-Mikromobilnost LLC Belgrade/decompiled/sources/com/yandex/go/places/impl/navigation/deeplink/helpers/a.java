package com.yandex.go.places.impl.navigation.deeplink.helpers;

import android.content.Intent;
import android.net.Uri;
import defpackage.ffx;
import defpackage.hxx;
import defpackage.kgw0;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ngw0;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.rfc0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.lifecycle.a a;
    public final rfc0 b;

    public a(com.yandex.go.lifecycle.a aVar, rfc0 rfc0Var) {
        this.a = aVar;
        this.b = rfc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Intent intent, ContinuationImpl continuationImpl) {
        PlacesSuperappSearchDeeplinkHelper$processIntent$1 placesSuperappSearchDeeplinkHelper$processIntent$1;
        int i;
        Uri uri;
        if (continuationImpl instanceof PlacesSuperappSearchDeeplinkHelper$processIntent$1) {
            placesSuperappSearchDeeplinkHelper$processIntent$1 = (PlacesSuperappSearchDeeplinkHelper$processIntent$1) continuationImpl;
            int i2 = placesSuperappSearchDeeplinkHelper$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesSuperappSearchDeeplinkHelper$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesSuperappSearchDeeplinkHelper$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesSuperappSearchDeeplinkHelper$processIntent$1.label;
                if (i != 0) {
                    b.b(obj);
                    Uri data = intent.getData();
                    if (data != null) {
                        DeeplinkSource deeplinkSource = (DeeplinkSource) ffx.R(intent, "deeplink_source", DeeplinkSource.class);
                        if (deeplinkSource == null) {
                            deeplinkSource = DeeplinkSource.UNSPECIFIED;
                        }
                        if (deeplinkSource == DeeplinkSource.PLACES) {
                            placesSuperappSearchDeeplinkHelper$processIntent$1.L$0 = null;
                            placesSuperappSearchDeeplinkHelper$processIntent$1.L$1 = data;
                            placesSuperappSearchDeeplinkHelper$processIntent$1.label = 1;
                            if (this.a.a(placesSuperappSearchDeeplinkHelper$processIntent$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            uri = data;
                        }
                    }
                    return n5u.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) placesSuperappSearchDeeplinkHelper$processIntent$1.L$1;
                b.b(obj);
                rfc0 rfc0Var = this.b;
                ngw0 ngw0Var = (ngw0) rfc0Var.a.get();
                rfc0Var.c = ngw0Var;
                ((pep0) rfc0Var.b).f(ngw0Var, new kgw0(uri), hxx.a);
                return new m5u(false, false);
            }
        }
        placesSuperappSearchDeeplinkHelper$processIntent$1 = new PlacesSuperappSearchDeeplinkHelper$processIntent$1(this, continuationImpl);
        Object obj2 = placesSuperappSearchDeeplinkHelper$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesSuperappSearchDeeplinkHelper$processIntent$1.label;
        if (i != 0) {
        }
        rfc0 rfc0Var2 = this.b;
        ngw0 ngw0Var2 = (ngw0) rfc0Var2.a.get();
        rfc0Var2.c = ngw0Var2;
        ((pep0) rfc0Var2.b).f(ngw0Var2, new kgw0(uri), hxx.a);
        return new m5u(false, false);
    }
}
