package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import android.webkit.WebView;
import io.jsonwebtoken.JwtParser;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.izs;
import xsna.msy;
import xsna.tyx;
import xsna.uqi;
import xsna.wzs;

/* loaded from: classes7.dex */
public final class j {
    public volatile wzs a;

    public static final /* synthetic */ void a(j jVar, Window window, Rect rect, Bitmap bitmap, izs izsVar) {
        jVar.getClass();
        a(window, rect, bitmap, izsVar);
    }

    public final void a(WebView webView, int i, com.vungle.ads.internal.ui.q qVar) {
        Activity activity;
        this.a = qVar;
        if (webView == null) {
            boolean z = u.a;
            t.c("BlackScreenDetector", "Black screen detection failed: View not available");
            wzs wzsVar = this.a;
            if (wzsVar != null) {
                wzsVar.invoke(-1, "View not available");
            }
            this.a = null;
            return;
        }
        i iVar = new i(webView, this, i);
        if (this.a == null) {
            return;
        }
        Context context = webView.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        Window window = activity != null ? activity.getWindow() : null;
        if (window == null) {
            boolean z2 = u.a;
            t.c("BlackScreenDetector", "Activity/Window not found for PixelCopy");
            iVar.invoke(null);
        } else {
            Lazy a = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new f(webView.getContext()));
            Handler handler = y.a;
            y.a(new g(webView, a, this, window, iVar));
        }
    }

    public static final com.vungle.ads.internal.executor.a a(Lazy lazy) {
        return (com.vungle.ads.internal.executor.a) lazy.getValue();
    }

    public static void a(Window window, Rect rect, final Bitmap bitmap, final izs izsVar) {
        try {
            PixelCopy.request(window, rect, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: xsna.f1z0
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    com.vungle.ads.internal.util.j.a(izs.this, bitmap, i);
                }
            }, new Handler(Looper.getMainLooper()));
        } catch (Throwable th) {
            boolean z = u.a;
            t.a("BlackScreenDetector", "PixelCopy request failed", th);
            bitmap.recycle();
            izsVar.invoke(null);
        }
    }

    public static final void a(izs izsVar, Bitmap bitmap, int i) {
        if (i == 0) {
            izsVar.invoke(bitmap);
            return;
        }
        boolean z = u.a;
        t.c("BlackScreenDetector", "PixelCopy failed: " + i);
        bitmap.recycle();
        izsVar.invoke(null);
    }

    public static Pair a(Bitmap bitmap, int i) {
        if (bitmap != null) {
            int a = a(bitmap, 0.1d, i, 0.5d);
            return new Pair(Integer.valueOf(a), a == -1 ? "Internal calculation error" : "");
        }
        boolean z = u.a;
        t.c("BlackScreenDetector", "Black screen detection failed: Snapshot capture failure");
        return new Pair(-1, "Snapshot capture failure");
    }

    public static int a(Bitmap bitmap, double d, int i, double d2) {
        int i2;
        int i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = (int) (width * d);
        int i5 = (int) (height * d);
        int i6 = width - (i4 * 2);
        int i7 = height - (i5 * 2);
        if (i6 <= 0 || i7 <= 0) {
            return -1;
        }
        long j = i6 * i7;
        if (j > 2147483647L) {
            if (d >= d2) {
                return -1;
            }
            return a(bitmap, d * 2, i, d2);
        }
        int i8 = (int) j;
        int[] iArr = new int[i8];
        bitmap.getPixels(iArr, 0, i6, i4, i5, i6, i7);
        int i9 = i8 - 1;
        if (i > 0) {
            int b = tyx.b(0, i9, i);
            if (b >= 0) {
                int i10 = 0;
                i2 = 0;
                i3 = 0;
                while (true) {
                    i2++;
                    int i11 = iArr[i10];
                    int i12 = (i11 >> 24) & 255;
                    int i13 = (i11 >> 16) & 255;
                    int i14 = (i11 >> 8) & 255;
                    int i15 = i11 & 255;
                    if (i12 > 0 && i13 < 10 && i14 < 10 && i15 < 10) {
                        i3++;
                    }
                    if (i10 == b) {
                        break;
                    }
                    i10 += i;
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            if (i2 > 0) {
                return (int) ((i3 * 100) / i2);
            }
            return 0;
        }
        throw new IllegalArgumentException(uqi.a("Step must be positive, was: ", i, JwtParser.SEPARATOR_CHAR));
    }
}
