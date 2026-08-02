package com.yandex.go.scooters.misc.vehicle_actual_photo.data.mapper;

import com.yandex.go.scooters.misc.vehicle_actual_photo.data.model.ScootersVehicleActualPhotoV1Response;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.x6p0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class a {
    public final k7x0 a;
    public final c b;

    public a(k7x0 k7x0Var, c cVar) {
        this.a = k7x0Var;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder photoFromLastOrder, ContinuationImpl continuationImpl) {
        ScootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1 scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder photoFromLastOrder2;
        String str;
        Object e2;
        String str2;
        CharSequence charSequence;
        ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder photoFromLastOrder3;
        FormattedText formattedText;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        String str4;
        ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder photoFromLastOrder4;
        if (continuationImpl instanceof ScootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1) {
            scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1 = (ScootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1) continuationImpl;
            int i2 = scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1.label = i2 - Integer.MIN_VALUE;
                ScootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1 scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12 = scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1;
                Object obj = scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.label;
                CharSequence charSequence6 = null;
                if (i != 0) {
                    b.b(obj);
                    if (photoFromLastOrder == null) {
                        return null;
                    }
                    String str5 = photoFromLastOrder.a;
                    FormattedText formattedText2 = photoFromLastOrder.b;
                    scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$0 = null;
                    scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$1 = photoFromLastOrder;
                    scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$2 = str5;
                    scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.label = 1;
                    e = c.e(this.b, formattedText2, null, false, scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12, 30);
                    if (e != coroutineSingletons) {
                        photoFromLastOrder2 = photoFromLastOrder;
                        str = str5;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence5 = (CharSequence) scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$4;
                        charSequence4 = (CharSequence) scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$3;
                        str4 = (String) scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$2;
                        photoFromLastOrder4 = (ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder) scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$1;
                        b.b(obj);
                        charSequence6 = (CharSequence) obj;
                        charSequence3 = charSequence5;
                        charSequence2 = charSequence4;
                        str3 = str4;
                        photoFromLastOrder3 = photoFromLastOrder4;
                        return new x6p0(str3, charSequence2, charSequence3, charSequence6, ((m7x0) this.a).a(photoFromLastOrder3.e));
                    }
                    charSequence = (CharSequence) scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$3;
                    String str6 = (String) scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$2;
                    ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder photoFromLastOrder5 = (ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder) scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$1;
                    b.b(obj);
                    str2 = str6;
                    photoFromLastOrder3 = photoFromLastOrder5;
                    CharSequence charSequence7 = (CharSequence) obj;
                    formattedText = photoFromLastOrder3.d;
                    if (formattedText != null) {
                        charSequence2 = charSequence;
                        charSequence3 = charSequence7;
                        str3 = str2;
                        return new x6p0(str3, charSequence2, charSequence3, charSequence6, ((m7x0) this.a).a(photoFromLastOrder3.e));
                    }
                    scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$0 = null;
                    scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$1 = photoFromLastOrder3;
                    scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$2 = str2;
                    scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$3 = charSequence;
                    scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$4 = charSequence7;
                    scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$5 = null;
                    scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.label = 3;
                    Object e3 = c.e(this.b, formattedText, null, false, scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12, 30);
                    if (e3 != coroutineSingletons) {
                        charSequence4 = charSequence;
                        charSequence5 = charSequence7;
                        obj = e3;
                        str4 = str2;
                        photoFromLastOrder4 = photoFromLastOrder3;
                        charSequence6 = (CharSequence) obj;
                        charSequence3 = charSequence5;
                        charSequence2 = charSequence4;
                        str3 = str4;
                        photoFromLastOrder3 = photoFromLastOrder4;
                        return new x6p0(str3, charSequence2, charSequence3, charSequence6, ((m7x0) this.a).a(photoFromLastOrder3.e));
                    }
                    return coroutineSingletons;
                }
                str = (String) scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$2;
                ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder photoFromLastOrder6 = (ScootersVehicleActualPhotoV1Response.PhotoFromLastOrder) scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$1;
                b.b(obj);
                e = obj;
                photoFromLastOrder2 = photoFromLastOrder6;
                CharSequence charSequence8 = (CharSequence) e;
                FormattedText formattedText3 = photoFromLastOrder2.c;
                scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$0 = null;
                scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$1 = photoFromLastOrder2;
                scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$2 = str;
                scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.L$3 = charSequence8;
                scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12.label = 2;
                e2 = c.e(this.b, formattedText3, null, false, scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$12, 30);
                if (e2 != coroutineSingletons) {
                    str2 = str;
                    charSequence = charSequence8;
                    photoFromLastOrder3 = photoFromLastOrder2;
                    obj = e2;
                    CharSequence charSequence72 = (CharSequence) obj;
                    formattedText = photoFromLastOrder3.d;
                    if (formattedText != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1 = new ScootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1(this, continuationImpl);
        ScootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1 scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$122 = scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$1;
        Object obj2 = scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$122.label;
        CharSequence charSequence62 = null;
        if (i != 0) {
        }
        CharSequence charSequence82 = (CharSequence) e;
        FormattedText formattedText32 = photoFromLastOrder2.c;
        scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$122.L$0 = null;
        scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$122.L$1 = photoFromLastOrder2;
        scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$122.L$2 = str;
        scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$122.L$3 = charSequence82;
        scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$122.label = 2;
        e2 = c.e(this.b, formattedText32, null, false, scootersVehicleActualPhotoMapper$mapVehicleActualPhoto$122, 30);
        if (e2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
