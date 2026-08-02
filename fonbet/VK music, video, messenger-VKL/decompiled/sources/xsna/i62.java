package xsna;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import xsna.b72;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class i62 implements ViewTranslationCallback {
    public static final i62 a = new i62();

    public final boolean onClearTranslation(View view) {
        ck ckVar;
        gzs gzsVar;
        b72 contentCaptureManager$ui = ((p52) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.g = b72.a.SHOW_ORIGINAL;
        f9x<lgi0> d = contentCaptureManager$ui.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        xfi0 xfi0Var = ((lgi0) objArr[(i << 3) + i3]).a.d;
                        if (zfi0.a(xfi0Var, ngi0.E) != null && (ckVar = (ck) zfi0.a(xfi0Var, wfi0.n)) != null && (gzsVar = (gzs) ckVar.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        ck ckVar;
        izs izsVar;
        b72 contentCaptureManager$ui = ((p52) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.g = b72.a.SHOW_ORIGINAL;
        f9x<lgi0> d = contentCaptureManager$ui.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        xfi0 xfi0Var = ((lgi0) objArr[(i << 3) + i3]).a.d;
                        if (epx.f(zfi0.a(xfi0Var, ngi0.E), Boolean.TRUE) && (ckVar = (ck) zfi0.a(xfi0Var, wfi0.m)) != null && (izsVar = (izs) ckVar.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        ck ckVar;
        izs izsVar;
        b72 contentCaptureManager$ui = ((p52) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.g = b72.a.SHOW_TRANSLATED;
        f9x<lgi0> d = contentCaptureManager$ui.d();
        Object[] objArr = d.c;
        long[] jArr = d.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        xfi0 xfi0Var = ((lgi0) objArr[(i << 3) + i3]).a.d;
                        if (epx.f(zfi0.a(xfi0Var, ngi0.E), Boolean.FALSE) && (ckVar = (ck) zfi0.a(xfi0Var, wfi0.m)) != null && (izsVar = (izs) ckVar.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
