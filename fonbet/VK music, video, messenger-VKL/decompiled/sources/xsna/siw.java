package xsna;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* compiled from: ImageFormat.kt */
/* loaded from: classes.dex */
public final class siw {
    public static final siw c = new siw(GrsBaseInfo.CountryCodeSource.UNKNOWN, null);
    public final String a;
    public final String b;

    /* compiled from: ImageFormat.kt */
    public interface a {
        siw a(int i, byte[] bArr);

        int b();
    }

    public siw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof siw)) {
            return false;
        }
        siw siwVar = (siw) obj;
        return epx.f(this.a, siwVar.a) && epx.f(this.b, siwVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.a;
    }
}
