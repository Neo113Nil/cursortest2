package yads;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import xsna.bkh0;

/* loaded from: classes10.dex */
public final class o43 extends rm2 {
    public static final wq e = new bkh0(10);
    public final int c;
    public final float d;

    public o43(int i) {
        ni.a("maxStars must be a positive integer", i > 0);
        this.c = i;
        this.d = -1.0f;
    }

    public static o43 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
            throw new IllegalArgumentException();
        }
        int i = bundle.getInt(Integer.toString(1, 36), 5);
        float f = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f == -1.0f ? new o43(i) : new o43(i, f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o43)) {
            return false;
        }
        o43 o43Var = (o43) obj;
        return this.c == o43Var.c && this.d == o43Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Float.valueOf(this.d)});
    }

    public o43(int i, float f) {
        boolean z = false;
        ni.a("maxStars must be a positive integer", i > 0);
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= i) {
            z = true;
        }
        ni.a("starRating is out of range [0, maxStars]", z);
        this.c = i;
        this.d = f;
    }
}
