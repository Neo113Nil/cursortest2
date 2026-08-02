package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ChannelMixingMatrix.java */
/* loaded from: classes12.dex */
public final class w3b {
    public final int a;
    public final int b;
    public final float[] c;
    public final boolean d;
    public final boolean e;

    public w3b(float[] fArr, int i, int i2) {
        boolean z = false;
        fxc0.q(i > 0, "Input channel count must be positive.");
        fxc0.q(i2 > 0, "Output channel count must be positive.");
        fxc0.q(fArr.length == i * i2, "Coefficient array length is invalid.");
        this.a = i;
        this.b = i2;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (fArr[i3] < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                throw new IllegalArgumentException(tgw.b(i3, "Coefficient at index ", " is negative."));
            }
        }
        this.c = fArr;
        int i4 = 0;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        while (i4 < i) {
            int i5 = 0;
            while (i5 < i2) {
                float f = this.c[(this.b * i4) + i5];
                boolean z5 = i4 == i5;
                if (f != 1.0f && z5) {
                    z4 = false;
                }
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    z2 = false;
                    if (!z5) {
                        z3 = false;
                    }
                }
                i5++;
            }
            i4++;
        }
        this.d = z2;
        if (this.a == this.b && z3 && z4) {
            z = true;
        }
        this.e = z;
    }

    public static w3b a(int i, int i2) {
        float[] fArr;
        if (i == i2) {
            fArr = new float[i2 * i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr[(i2 * i3) + i3] = 1.0f;
            }
        } else if (i == 1 && i2 == 2) {
            fArr = new float[]{1.0f, 1.0f};
        } else {
            if (i != 2 || i2 != 1) {
                throw new UnsupportedOperationException(sl9.c(i, i2, "Default channel mixing coefficients for ", "->", " are not yet implemented."));
            }
            fArr = new float[]{0.5f, 0.5f};
        }
        return new w3b(fArr, i, i2);
    }
}
