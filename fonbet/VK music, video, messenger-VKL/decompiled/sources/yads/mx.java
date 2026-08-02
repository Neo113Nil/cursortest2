package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import xsna.bjl0;

/* loaded from: classes10.dex */
public final class mx implements xq {
    public static final wq g = new bjl0(8);
    public final int b;
    public final int c;
    public final int d;
    public final byte[] e;
    public int f;

    public mx(int i, int i2, int i3, byte[] bArr) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bArr;
    }

    public static mx a(Bundle bundle) {
        return new mx(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mx.class == obj.getClass()) {
            mx mxVar = (mx) obj;
            if (this.b == mxVar.b && this.c == mxVar.c && this.d == mxVar.d && Arrays.equals(this.e, mxVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.e) + ((((((this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c) * 31) + this.d) * 31);
        }
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        return xsna.n23.b(sb, this.e != null, ")");
    }
}
