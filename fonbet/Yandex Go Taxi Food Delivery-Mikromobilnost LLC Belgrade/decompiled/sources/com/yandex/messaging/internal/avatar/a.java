package com.yandex.messaging.internal.avatar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import com.yandex.images.ImageManager$From;
import defpackage.ab4;
import defpackage.ad7;
import defpackage.ffx;
import defpackage.g020;
import defpackage.h3y;
import defpackage.hb4;
import defpackage.i3y;
import defpackage.ib4;
import defpackage.jb4;
import defpackage.kb4;
import defpackage.kjs0;
import defpackage.mfb1;
import defpackage.ny61;
import defpackage.w2b1;
import defpackage.w511;
import defpackage.xav;
import defpackage.xn50;
import defpackage.xyz;
import defpackage.yn50;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a {
    public final h3y a;
    public final ab4 b;
    public final i3y c;

    public a(ab4 ab4Var, h3y h3yVar) {
        this.a = h3yVar;
        this.b = ab4Var;
        kjs0.b(16);
        this.c = kotlin.a.a(new xyz(29, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(g020 g020Var, ContinuationImpl continuationImpl) {
        MessengerAvatarLoader$cachedBitmap$1 messengerAvatarLoader$cachedBitmap$1;
        int i;
        ad7 ad7Var;
        Bitmap bitmap;
        jb4 jb4Var;
        Bitmap createBitmap;
        if (continuationImpl instanceof MessengerAvatarLoader$cachedBitmap$1) {
            messengerAvatarLoader$cachedBitmap$1 = (MessengerAvatarLoader$cachedBitmap$1) continuationImpl;
            int i2 = messengerAvatarLoader$cachedBitmap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerAvatarLoader$cachedBitmap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = messengerAvatarLoader$cachedBitmap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerAvatarLoader$cachedBitmap$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = g020Var.a;
                    if (str != null) {
                        int i3 = g020Var.b;
                        yn50 yn50Var = (yn50) ((xav) this.c.getValue()).load(str);
                        xn50 xn50Var = yn50Var.b;
                        xn50Var.i = i3;
                        xn50Var.j = i3;
                        messengerAvatarLoader$cachedBitmap$1.L$0 = this;
                        messengerAvatarLoader$cachedBitmap$1.L$1 = g020Var;
                        messengerAvatarLoader$cachedBitmap$1.label = 1;
                        obj = mfb1.d(yn50Var, messengerAvatarLoader$cachedBitmap$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g020Var = (g020) messengerAvatarLoader$cachedBitmap$1.L$1;
                this = (a) messengerAvatarLoader$cachedBitmap$1.L$0;
                kotlin.b.b(obj);
                ad7Var = (ad7) obj;
                if (ad7Var != null && (bitmap = ad7Var.a) != null) {
                    jb4Var = g020Var.e;
                    int i4 = g020Var.b;
                    if (!(jb4Var instanceof hb4)) {
                        this.b.getClass();
                        createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint a = ab4.a(bitmap, i4);
                        float f = i4 / 2.0f;
                        canvas.drawCircle(f, f, f, a);
                    } else if (jb4Var instanceof ib4) {
                        float intValue = ((ib4) jb4Var).a != null ? r1.intValue() : new kb4(i4).b();
                        this.b.getClass();
                        createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                        float f2 = i4;
                        new Canvas(createBitmap).drawRoundRect(0.0f, 0.0f, f2, f2, intValue, intValue, ab4.a(bitmap, i4));
                    } else {
                        w511.b();
                    }
                    return new ad7(createBitmap, null, ad7Var.b, ad7Var.d);
                }
                return null;
            }
        }
        messengerAvatarLoader$cachedBitmap$1 = new MessengerAvatarLoader$cachedBitmap$1(this, continuationImpl);
        Object obj2 = messengerAvatarLoader$cachedBitmap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerAvatarLoader$cachedBitmap$1.label;
        if (i != 0) {
        }
        ad7Var = (ad7) obj2;
        if (ad7Var != null) {
            jb4Var = g020Var.e;
            int i42 = g020Var.b;
            if (!(jb4Var instanceof hb4)) {
            }
            return new ad7(createBitmap, null, ad7Var.b, ad7Var.d);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g020 g020Var, ContinuationImpl continuationImpl) {
        MessengerAvatarLoader$loadAvatarCachedBitmap$1 messengerAvatarLoader$loadAvatarCachedBitmap$1;
        int i;
        ad7 ad7Var;
        Bitmap c0;
        if (continuationImpl instanceof MessengerAvatarLoader$loadAvatarCachedBitmap$1) {
            messengerAvatarLoader$loadAvatarCachedBitmap$1 = (MessengerAvatarLoader$loadAvatarCachedBitmap$1) continuationImpl;
            int i2 = messengerAvatarLoader$loadAvatarCachedBitmap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerAvatarLoader$loadAvatarCachedBitmap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = messengerAvatarLoader$loadAvatarCachedBitmap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerAvatarLoader$loadAvatarCachedBitmap$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    messengerAvatarLoader$loadAvatarCachedBitmap$1.L$0 = this;
                    messengerAvatarLoader$loadAvatarCachedBitmap$1.L$1 = g020Var;
                    messengerAvatarLoader$loadAvatarCachedBitmap$1.label = 1;
                    obj = a(g020Var, messengerAvatarLoader$loadAvatarCachedBitmap$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g020Var = (g020) messengerAvatarLoader$loadAvatarCachedBitmap$1.L$1;
                    this = (a) messengerAvatarLoader$loadAvatarCachedBitmap$1.L$0;
                    kotlin.b.b(obj);
                }
                ad7Var = (ad7) obj;
                if (ad7Var == null) {
                    return ad7Var;
                }
                ab4 ab4Var = this.b;
                jb4 jb4Var = g020Var.e;
                String str = g020Var.c;
                String str2 = g020Var.d;
                int i3 = g020Var.b;
                if (jb4Var instanceof hb4) {
                    c0 = ffx.c0(ab4Var.a.l(str2, w2b1.a(str), null, hb4.a), i3, i3, Bitmap.Config.ARGB_8888);
                } else {
                    if (!(jb4Var instanceof ib4)) {
                        w511.b();
                        return null;
                    }
                    Integer num = ((ib4) jb4Var).a;
                    c0 = ffx.c0(ab4Var.a.l(str2, w2b1.a(str), null, new ib4(Integer.valueOf(num != null ? num.intValue() : new kb4(i3).a()))), i3, i3, Bitmap.Config.ARGB_8888);
                }
                return new ad7(c0, null, Uri.parse(g020Var.a), ImageManager$From.MEMORY);
            }
        }
        messengerAvatarLoader$loadAvatarCachedBitmap$1 = new MessengerAvatarLoader$loadAvatarCachedBitmap$1(this, continuationImpl);
        Object obj2 = messengerAvatarLoader$loadAvatarCachedBitmap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerAvatarLoader$loadAvatarCachedBitmap$1.label;
        if (i != 0) {
        }
        ad7Var = (ad7) obj2;
        if (ad7Var == null) {
        }
    }
}
