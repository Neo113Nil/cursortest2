package yads;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import xsna.rft0;

/* loaded from: classes10.dex */
public final class fd2 extends rm2 {
    public static final wq d = new rft0(2);
    public final float c;

    public fd2() {
        this.c = -1.0f;
    }

    public static fd2 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) != 1) {
            throw new IllegalArgumentException();
        }
        float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f == -1.0f ? new fd2() : new fd2(f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fd2) && this.c == ((fd2) obj).c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c)});
    }

    public fd2(float f) {
        ni.a("percent must be in the range of [0, 100]", f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= 100.0f);
        this.c = f;
    }
}
