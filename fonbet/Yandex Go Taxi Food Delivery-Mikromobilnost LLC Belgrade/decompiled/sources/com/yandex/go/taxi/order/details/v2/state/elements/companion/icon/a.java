package com.yandex.go.taxi.order.details.v2.state.elements.companion.icon;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mdh;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.oek0;
import defpackage.pek0;
import defpackage.pkf;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final e b;

    public a(tt2 tt2Var, e eVar) {
        this.a = tt2Var;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        RideCardCompanionIconDataSource$tryLoadImage$1 rideCardCompanionIconDataSource$tryLoadImage$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof RideCardCompanionIconDataSource$tryLoadImage$1) {
            rideCardCompanionIconDataSource$tryLoadImage$1 = (RideCardCompanionIconDataSource$tryLoadImage$1) continuationImpl;
            int i2 = rideCardCompanionIconDataSource$tryLoadImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardCompanionIconDataSource$tryLoadImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardCompanionIconDataSource$tryLoadImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardCompanionIconDataSource$tryLoadImage$1.label;
                if (i != 0) {
                    b.b(obj);
                    rideCardCompanionIconDataSource$tryLoadImage$1.L$0 = str;
                    rideCardCompanionIconDataSource$tryLoadImage$1.label = 1;
                    aVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new RideCardCompanionIconDataSource$loadCompanionImageByTag$2(aVar, str, null), rideCardCompanionIconDataSource$tryLoadImage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) rideCardCompanionIconDataSource$tryLoadImage$1.L$0;
                    b.b(obj);
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                return bitmapDrawable == null ? new oek0(pkf.g(bitmapDrawable, str, null)) : pek0.a;
            }
        }
        rideCardCompanionIconDataSource$tryLoadImage$1 = new RideCardCompanionIconDataSource$tryLoadImage$1(aVar, continuationImpl);
        Object obj2 = rideCardCompanionIconDataSource$tryLoadImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardCompanionIconDataSource$tryLoadImage$1.label;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
        if (bitmapDrawable2 == null) {
        }
    }

    public final rol0 b(n7v n7vVar) {
        return new rol0(new RideCardCompanionIconDataSource$collectIconState$1(n7vVar, this, null));
    }
}
