package xsna;

import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: StickyPlayerColors.kt */
/* loaded from: classes3.dex */
public final class tfl0 {
    public static final List a(long j, Bitmap bitmap) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        long c = c(bitmap.getPixel((int) (bitmap.getWidth() * 0.268f), (int) (bitmap.getWidth() * 0.153f)), j);
        b(c, ref$BooleanRef);
        Integer valueOf = Integer.valueOf(f870.H(c));
        long c2 = c(bitmap.getPixel((int) (bitmap.getWidth() * 0.781f), (int) (bitmap.getWidth() * 0.409f)), j);
        b(c2, ref$BooleanRef);
        Integer valueOf2 = Integer.valueOf(f870.H(c2));
        long c3 = c(bitmap.getPixel((int) (bitmap.getWidth() * 0.294f), (int) (bitmap.getWidth() * 0.689f)), j);
        b(c3, ref$BooleanRef);
        Integer valueOf3 = Integer.valueOf(f870.H(c3));
        long c4 = c(bitmap.getPixel((int) (bitmap.getWidth() * 0.806f), (int) (bitmap.getWidth() * 0.888f)), j);
        b(c4, ref$BooleanRef);
        List u0 = rl3.u0(new Integer[]{valueOf, valueOf2, valueOf3, Integer.valueOf(f870.H(c4))});
        if (ref$BooleanRef.element) {
            return sfl0.b;
        }
        List list = sfl0.b;
        return u0;
    }

    public static final void b(long j, Ref$BooleanRef ref$BooleanRef) {
        ref$BooleanRef.element = ref$BooleanRef.element && d(j) < 0.1f;
    }

    public static final long c(int i, long j) {
        long c = f870.c(i);
        if (l5g.e(c) == 1.0f) {
            return c;
        }
        int i2 = l5g.l;
        return l5g.d(j, l5g.j) ? c : f870.i(c, j);
    }

    public static final float d(long j) {
        float f = (float) ((l5g.f(j) * 0.114d) + (l5g.h(j) * 0.587d) + (l5g.i(j) * 0.299d));
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}
