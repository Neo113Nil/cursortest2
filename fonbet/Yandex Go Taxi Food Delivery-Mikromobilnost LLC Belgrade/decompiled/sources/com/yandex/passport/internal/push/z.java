package com.yandex.passport.internal.push;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.resources.DeviceDensity;
import defpackage.bev;
import defpackage.nev;
import defpackage.ny61;
import defpackage.u3v0;
import defpackage.w511;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class z {
    public final Context a;
    public final com.yandex.passport.internal.network.e b;

    public z(Context context, com.yandex.passport.internal.network.e eVar) {
        this.a = context;
        this.b = eVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:23|24))(5:25|26|(1:28)|29|(1:31))|11|(3:13|(1:15)(1:21)|(2:17|18))|22))|36|6|7|(0)(0)|11|(0)|22) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        r8 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.LogLevel.DEBUG, null, "getBitmapFromCache ex: " + r7, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:10:0x0028, B:11:0x0074, B:13:0x007a, B:15:0x0084, B:17:0x008a, B:26:0x0037, B:28:0x0041, B:29:0x0056), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PictureIdToBitmapMapper$getBitmapFromCache$1 pictureIdToBitmapMapper$getBitmapFromCache$1;
        int i;
        nev nevVar;
        if (continuationImpl instanceof PictureIdToBitmapMapper$getBitmapFromCache$1) {
            pictureIdToBitmapMapper$getBitmapFromCache$1 = (PictureIdToBitmapMapper$getBitmapFromCache$1) continuationImpl;
            int i2 = pictureIdToBitmapMapper$getBitmapFromCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pictureIdToBitmapMapper$getBitmapFromCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pictureIdToBitmapMapper$getBitmapFromCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pictureIdToBitmapMapper$getBitmapFromCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "url " + ((Object) com.yandex.passport.common.url.b.l(str)), 8);
                    }
                    bev bevVar = new bev(this.a);
                    bevVar.f(str);
                    PictureIdToBitmapMapper$getBitmapFromCache$result$1 pictureIdToBitmapMapper$getBitmapFromCache$result$1 = new PictureIdToBitmapMapper$getBitmapFromCache$result$1(this, bevVar.d(), null);
                    pictureIdToBitmapMapper$getBitmapFromCache$1.label = 1;
                    obj = kotlinx.coroutines.a.u(1000L, pictureIdToBitmapMapper$getBitmapFromCache$result$1, pictureIdToBitmapMapper$getBitmapFromCache$1);
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
                nevVar = (nev) obj;
                if (nevVar instanceof u3v0) {
                    Drawable a = ((u3v0) nevVar).a();
                    BitmapDrawable bitmapDrawable = a instanceof BitmapDrawable ? (BitmapDrawable) a : null;
                    if (bitmapDrawable != null) {
                        return bitmapDrawable.getBitmap();
                    }
                }
                return null;
            }
        }
        pictureIdToBitmapMapper$getBitmapFromCache$1 = new PictureIdToBitmapMapper$getBitmapFromCache$1(this, continuationImpl);
        Object obj2 = pictureIdToBitmapMapper$getBitmapFromCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pictureIdToBitmapMapper$getBitmapFromCache$1.label;
        if (i != 0) {
        }
        nevVar = (nev) obj2;
        if (nevVar instanceof u3v0) {
        }
        return null;
    }

    public final Object b(Environment environment, int i, Continuation continuation) {
        String str;
        com.yandex.passport.internal.network.l lVar = (com.yandex.passport.internal.network.l) this.b;
        String str2 = lVar.c(environment, null) + "/1/yakey/pictures/" + i;
        int i2 = lVar.d.a.getDisplayMetrics().densityDpi;
        int i3 = com.yandex.passport.internal.network.h.b[(i2 != 120 ? i2 != 160 ? i2 != 240 ? i2 != 320 ? (i2 == 480 || i2 == 640) ? DeviceDensity.EXTRA_EXTRA_HIGH : DeviceDensity.MEDIUM : DeviceDensity.EXTRA_HIGH : DeviceDensity.HIGH : DeviceDensity.MEDIUM : DeviceDensity.LOW).ordinal()];
        if (i3 == 1) {
            str = "ldpi";
        } else if (i3 == 2) {
            str = "mdpi";
        } else if (i3 == 3) {
            str = "hdpi";
        } else if (i3 == 4) {
            str = "xhdpi";
        } else {
            if (i3 != 5) {
                w511.b();
                return null;
            }
            str = "xxhdpi";
        }
        return a(com.yandex.passport.common.url.b.b(str2, new Pair("density", str)), (ContinuationImpl) continuation);
    }
}
