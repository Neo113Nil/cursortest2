package com.yandex.go.navigator.providers;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.avj0;
import defpackage.c0c0;
import defpackage.ny61;
import defpackage.sq00;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v2h0;
import defpackage.vng;
import defpackage.zuj0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final zuj0 a;
    public final com.yandex.go.pin.api.widget.b b;
    public final tt2 c;

    public a(zuj0 zuj0Var, com.yandex.go.pin.api.widget.b bVar, e eVar, tt2 tt2Var) {
        this.a = zuj0Var;
        this.b = bVar;
        this.c = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        NavigatorPinImageProvider$createPoiImageProvider$1 navigatorPinImageProvider$createPoiImageProvider$1;
        int i;
        Drawable drawable;
        if (continuationImpl instanceof NavigatorPinImageProvider$createPoiImageProvider$1) {
            navigatorPinImageProvider$createPoiImageProvider$1 = (NavigatorPinImageProvider$createPoiImageProvider$1) continuationImpl;
            int i2 = navigatorPinImageProvider$createPoiImageProvider$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorPinImageProvider$createPoiImageProvider$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorPinImageProvider$createPoiImageProvider$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorPinImageProvider$createPoiImageProvider$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    navigatorPinImageProvider$createPoiImageProvider$1.L$0 = null;
                    navigatorPinImageProvider$createPoiImageProvider$1.label = 1;
                    if (coroutineSingletons != null) {
                        obj = null;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                drawable = (BitmapDrawable) obj;
                if (drawable == null) {
                    drawable = vng.t(v2h0.ic_poi_pin_fill, ((avj0) this.a).a);
                }
                sq00 sq00Var = new sq00(null, drawable == null ? new c0c0(drawable) : null, true, null, null, null, null, false, false, null, null, 0.0f, 8185);
                navigatorPinImageProvider$createPoiImageProvider$1.L$0 = null;
                navigatorPinImageProvider$createPoiImageProvider$1.L$1 = null;
                navigatorPinImageProvider$createPoiImageProvider$1.label = 2;
                Object e = this.b.e(sq00Var, navigatorPinImageProvider$createPoiImageProvider$1);
                return e != coroutineSingletons ? coroutineSingletons : e;
            }
        }
        navigatorPinImageProvider$createPoiImageProvider$1 = new NavigatorPinImageProvider$createPoiImageProvider$1(this, continuationImpl);
        Object obj2 = navigatorPinImageProvider$createPoiImageProvider$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorPinImageProvider$createPoiImageProvider$1.label;
        if (i != 0) {
        }
        drawable = (BitmapDrawable) obj2;
        if (drawable == null) {
        }
        sq00 sq00Var2 = new sq00(null, drawable == null ? new c0c0(drawable) : null, true, null, null, null, null, false, false, null, null, 0.0f, 8185);
        navigatorPinImageProvider$createPoiImageProvider$1.L$0 = null;
        navigatorPinImageProvider$createPoiImageProvider$1.L$1 = null;
        navigatorPinImageProvider$createPoiImageProvider$1.label = 2;
        Object e2 = this.b.e(sq00Var2, navigatorPinImageProvider$createPoiImageProvider$1);
        if (e2 != coroutineSingletons2) {
        }
    }

    public final Object b(Continuation continuation) {
        this.c.getClass();
        return tje.k0(uyj.a, new NavigatorPinImageProvider$createStartImageProvider$2(this, null), continuation);
    }
}
