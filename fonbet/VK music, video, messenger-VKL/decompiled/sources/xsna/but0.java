package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ViewBlur.kt */
/* loaded from: classes17.dex */
public final class but0 {
    public static final void a(xqo xqoVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1668760008);
        int i2 = (M.J(xqoVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1668760008, i2, -1, "com.vk.core.tool.compose.blur.DynamicViewBlur (ViewBlur.kt:42)");
            }
            ja8.a(bu00.f(egi.o(q630Var, new qhg0(xqoVar, 25)), new gqq0(xqoVar, 4)), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r21(xqoVar, q630Var, i, 10);
        }
    }

    public static final void b(View view, xqo xqoVar, ulo uloVar) {
        Bitmap bitmap = uloVar.c;
        d52 d52Var = uloVar.b;
        bitmap.eraseColor(0);
        view.getLocationOnScreen(xqoVar.b);
        long k = uloVar.a.k(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (k >> 32)) - r3[0];
        float intBitsToFloat2 = Float.intBitsToFloat((int) (k & 4294967295L)) - r3[1];
        try {
            d52Var.e();
            d52Var.p(-intBitsToFloat, -intBitsToFloat2);
            Canvas canvas = e52.a;
            view.draw(d52Var.a);
            d52Var.a();
            yk8 yk8Var = (yk8) ((zak0) xqoVar.e).getValue();
            if (yk8Var != null) {
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                long floatToRawIntBits = (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L);
                yk8Var.a(1.0f, floatToRawIntBits, xqoVar.c);
                d52Var.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), xqoVar.c);
            }
        } catch (Throwable th) {
            d52Var.a();
            throw th;
        }
    }
}
