package xsna;

/* compiled from: ClipsOnboardingProvider.kt */
/* loaded from: classes16.dex */
public final class jne {
    public final String a;
    public final String b;

    public jne(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jne)) {
            return false;
        }
        jne jneVar = (jne) obj;
        return epx.f(this.a, jneVar.a) && epx.f(this.b, jneVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TooltipData(title=");
        sb.append(this.a);
        sb.append(", id=");
        return ho8.a(sb, this.b, ')');
    }
}
