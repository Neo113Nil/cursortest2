package yads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes10.dex */
public final class sk3 implements xq {
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public sk3(int i, int i2, int i3, float f) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sk3) {
            sk3 sk3Var = (sk3) obj;
            if (this.b == sk3Var.b && this.c == sk3Var.c && this.d == sk3Var.d && this.e == sk3Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.e) + ((((((this.b + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.c) * 31) + this.d) * 31);
    }
}
