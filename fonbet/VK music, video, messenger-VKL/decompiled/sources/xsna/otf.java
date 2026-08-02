package xsna;

/* compiled from: ClipsWrapperShopsTabOnboardingEvent.kt */
/* loaded from: classes17.dex */
public final class otf {
    public final String a;
    public final String b;

    public otf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otf)) {
            return false;
        }
        otf otfVar = (otf) obj;
        return epx.f(this.a, otfVar.a) && epx.f(this.b, otfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsWrapperShopsTabOnboardingEvent(hintTitle=");
        sb.append(this.a);
        sb.append(", hintId=");
        return ho8.a(sb, this.b, ')');
    }
}
