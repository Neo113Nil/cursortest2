package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ig61 {
    public final String a;
    public final float b;

    public ig61(String str) {
        this.a = str;
        this.b = 0.12f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig61)) {
            return false;
        }
        ig61 ig61Var = (ig61) obj;
        return jl40.l(this.a, ig61Var.a) && Float.compare(this.b, ig61Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CoreNativeAdWarning(value=" + this.a + ", minimumRequiredArea=" + this.b + Extension.C_BRAKE;
    }

    public ig61(String str, float f) {
        this.a = str;
        this.b = f;
    }
}
