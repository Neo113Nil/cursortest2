package com.yandex.go.taxi.order.domain;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.domain.interactors.s;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import defpackage.c58;
import defpackage.e58;
import defpackage.evu0;
import defpackage.f2z;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.k7x0;
import defpackage.lyx0;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final Context a;
    public final s b;
    public final h3y c;
    public final h3y d;
    public final k7x0 e;
    public final tt2 f;

    public a(Context context, s sVar, h3y h3yVar, h3y h3yVar2, k7x0 k7x0Var, tt2 tt2Var) {
        this.a = context;
        this.b = sVar;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = k7x0Var;
        this.f = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r1 == r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (r1 == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        TaxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1 taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1;
        int i;
        e58 e58Var;
        Bitmap bitmap;
        Bitmap d0;
        if (continuationImpl instanceof TaxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1) {
            taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1 = (TaxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1) continuationImpl;
            int i2 = taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.label;
                if (i != 0) {
                    b.b(obj);
                    taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.L$0 = null;
                    taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.label = 1;
                    obj = this.b.a(taxiOrder, taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return obj;
                        }
                        b.b(obj);
                        d0 = (Bitmap) obj;
                        bitmap = d0;
                        if (bitmap != null) {
                            Matrix matrix = new Matrix();
                            matrix.preScale(-1.0f, 1.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                            if (createBitmap != null) {
                                taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.L$0 = null;
                                taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.L$1 = null;
                                taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.L$2 = null;
                                taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.L$3 = null;
                                taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.label = 3;
                                this.f.getClass();
                                sjh sjhVar = uyj.a;
                                Object k0 = tje.k0(mdh.b, new TaxiOrderCarCallDataProviderImpl$toBase64OrNull$2(createBitmap, null), taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1);
                                return k0 == coroutineSingletons ? coroutineSingletons : k0;
                            }
                        }
                        return null;
                    }
                    b.b(obj);
                }
                e58Var = (e58) obj;
                if (e58Var != null) {
                    Integer num = e58Var.a;
                    if (num != null) {
                        f2z f2zVar = (f2z) this.c.get();
                        int intValue = num.intValue();
                        taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.L$0 = null;
                        taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.L$1 = null;
                        taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.L$2 = null;
                        taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.label = 2;
                        obj = ((com.yandex.go.order.ui.presentation.car.a) f2zVar).b(intValue, taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1);
                    } else {
                        Drawable drawable = this.a.getDrawable(e58Var.c);
                        if (drawable != null) {
                            h3y h3yVar = this.d;
                            d0 = ffx.d0(drawable, ((c58) h3yVar.get()).a, ((c58) h3yVar.get()).b, 4);
                            bitmap = d0;
                            if (bitmap != null) {
                            }
                        } else {
                            bitmap = null;
                            if (bitmap != null) {
                            }
                        }
                    }
                }
                return null;
            }
        }
        taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1 = new TaxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1(this, continuationImpl);
        Object obj2 = taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderCarCallDataProviderImpl$encodeCarImageBase64$1.label;
        if (i != 0) {
        }
        e58Var = (e58) obj2;
        if (e58Var != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        TaxiOrderCarCallDataProviderImpl$getCallDriverData$1 taxiOrderCarCallDataProviderImpl$getCallDriverData$1;
        int i;
        Driver driver;
        Object a;
        if (continuationImpl instanceof TaxiOrderCarCallDataProviderImpl$getCallDriverData$1) {
            taxiOrderCarCallDataProviderImpl$getCallDriverData$1 = (TaxiOrderCarCallDataProviderImpl$getCallDriverData$1) continuationImpl;
            int i2 = taxiOrderCarCallDataProviderImpl$getCallDriverData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderCarCallDataProviderImpl$getCallDriverData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderCarCallDataProviderImpl$getCallDriverData$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderCarCallDataProviderImpl$getCallDriverData$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (!taxiOrder.l.a) {
                        return null;
                    }
                    driver = taxiOrder.V().g;
                    taxiOrderCarCallDataProviderImpl$getCallDriverData$1.L$0 = taxiOrder;
                    taxiOrderCarCallDataProviderImpl$getCallDriverData$1.L$1 = driver;
                    taxiOrderCarCallDataProviderImpl$getCallDriverData$1.label = 1;
                    a = a(taxiOrder, taxiOrderCarCallDataProviderImpl$getCallDriverData$1);
                    if (a == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Driver driver2 = (Driver) taxiOrderCarCallDataProviderImpl$getCallDriverData$1.L$1;
                    TaxiOrder taxiOrder2 = (TaxiOrder) taxiOrderCarCallDataProviderImpl$getCallDriverData$1.L$0;
                    b.b(obj);
                    driver = driver2;
                    taxiOrder = taxiOrder2;
                    a = obj;
                }
                String str = (String) a;
                n7v a2 = taxiOrder.b().a();
                String str2 = a2.b;
                String a3 = (str2 != null || evu0.J(str2)) ? a2.a : ((m7x0) this.e).a(str2);
                String str3 = driver.b;
                String str4 = evu0.J(str3) ? str3 : null;
                String str5 = driver.d;
                return new lyx0(a3, str4, (str5 != null || evu0.J(str5)) ? null : str5, driver.c, str);
            }
        }
        taxiOrderCarCallDataProviderImpl$getCallDriverData$1 = new TaxiOrderCarCallDataProviderImpl$getCallDriverData$1(this, continuationImpl);
        Object obj3 = taxiOrderCarCallDataProviderImpl$getCallDriverData$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderCarCallDataProviderImpl$getCallDriverData$1.label;
        if (i != 0) {
        }
        String str6 = (String) a;
        n7v a22 = taxiOrder.b().a();
        String str22 = a22.b;
        String a32 = (str22 != null || evu0.J(str22)) ? a22.a : ((m7x0) this.e).a(str22);
        String str32 = driver.b;
        if (evu0.J(str32)) {
        }
        String str52 = driver.d;
        return new lyx0(a32, str4, (str52 != null || evu0.J(str52)) ? null : str52, driver.c, str6);
    }
}
