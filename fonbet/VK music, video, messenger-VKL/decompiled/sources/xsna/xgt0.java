package xsna;

import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: VideoSize.java */
/* loaded from: classes12.dex */
public final class xgt0 {
    public static final xgt0 d = new xgt0(0, 0);
    public final int a;
    public final int b;
    public final float c;

    static {
        y2r0.L(0);
        y2r0.L(1);
        y2r0.L(3);
    }

    public xgt0(int i, int i2) {
        this(i, i2, 1.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xgt0) {
            xgt0 xgt0Var = (xgt0) obj;
            if (this.a == xgt0Var.a && this.b == xgt0Var.b && this.c == xgt0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.a) * 31) + this.b) * 31);
    }

    public xgt0(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }
}
