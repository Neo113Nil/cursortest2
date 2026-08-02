package com.yandex.go.taxi.order.details.v2.state.elements.photo;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Photo;
import defpackage.jgv;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zuj0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final e b;
    public final jgv c;
    public final zuj0 d;

    public a(tt2 tt2Var, e eVar, jgv jgvVar, zuj0 zuj0Var) {
        this.a = tt2Var;
        this.b = eVar;
        this.c = jgvVar;
        this.d = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, RideCardItemDto$Photo rideCardItemDto$Photo, int i, ContinuationImpl continuationImpl) {
        RideCardPhotoDataSource$tryLoadImage$1 rideCardPhotoDataSource$tryLoadImage$1;
        int i2;
        String str;
        aVar.getClass();
        if (continuationImpl instanceof RideCardPhotoDataSource$tryLoadImage$1) {
            rideCardPhotoDataSource$tryLoadImage$1 = (RideCardPhotoDataSource$tryLoadImage$1) continuationImpl;
            int i3 = rideCardPhotoDataSource$tryLoadImage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rideCardPhotoDataSource$tryLoadImage$1.label = i3 - Integer.MIN_VALUE;
                Object obj = rideCardPhotoDataSource$tryLoadImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = rideCardPhotoDataSource$tryLoadImage$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    String a = aVar.c.a(rideCardItemDto$Photo.d);
                    if (a == null) {
                        return null;
                    }
                    rideCardPhotoDataSource$tryLoadImage$1.L$0 = null;
                    rideCardPhotoDataSource$tryLoadImage$1.L$1 = null;
                    rideCardPhotoDataSource$tryLoadImage$1.L$2 = a;
                    rideCardPhotoDataSource$tryLoadImage$1.I$0 = i;
                    rideCardPhotoDataSource$tryLoadImage$1.label = 1;
                    aVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new RideCardPhotoDataSource$loadCompanionImageByUrl$2(aVar, a, i, null), rideCardPhotoDataSource$tryLoadImage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = a;
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) rideCardPhotoDataSource$tryLoadImage$1.L$2;
                    b.b(obj);
                }
                return pkf.g((Drawable) obj, str, null);
            }
        }
        rideCardPhotoDataSource$tryLoadImage$1 = new RideCardPhotoDataSource$tryLoadImage$1(aVar, continuationImpl);
        Object obj2 = rideCardPhotoDataSource$tryLoadImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = rideCardPhotoDataSource$tryLoadImage$1.label;
        if (i2 != 0) {
        }
        return pkf.g((Drawable) obj2, str, null);
    }

    public final rol0 b(RideCardItemDto$Photo rideCardItemDto$Photo) {
        return new rol0(new RideCardPhotoDataSource$stateFlow$1(this, rideCardItemDto$Photo, null));
    }
}
