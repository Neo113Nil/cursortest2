package xsna;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class swx {
    public final String a;
    public final byte[] b;

    public swx(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!swx.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        swx swxVar = (swx) obj;
        return epx.f(this.a, swxVar.a) && Arrays.equals(this.b, swxVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
