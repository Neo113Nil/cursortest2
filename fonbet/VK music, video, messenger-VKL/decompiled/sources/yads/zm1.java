package yads;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import xsna.x6t0;

/* loaded from: classes10.dex */
public final class zm1 implements xq {
    public static final zm1 g = new zm1(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f);
    public static final wq h = new x6t0(6);
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final float f;

    public zm1(long j, long j2, long j3, float f, float f2) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = f;
        this.f = f2;
    }

    public static zm1 a(Bundle bundle) {
        return new zm1(bundle.getLong(Integer.toString(0, 36), C.TIME_UNSET), bundle.getLong(Integer.toString(1, 36), C.TIME_UNSET), bundle.getLong(Integer.toString(2, 36), C.TIME_UNSET), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm1)) {
            return false;
        }
        zm1 zm1Var = (zm1) obj;
        return this.b == zm1Var.b && this.c == zm1Var.c && this.d == zm1Var.d && this.e == zm1Var.e && this.f == zm1Var.f;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.e;
        int floatToIntBits = (i2 + (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f;
        return floatToIntBits + (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f2) : 0);
    }
}
