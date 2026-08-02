package xsna;

/* compiled from: ImageUrlMorpheme.kt */
/* loaded from: classes18.dex */
public final class iqm0 implements hmw {
    public final String a;

    public iqm0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqm0) && epx.f(this.a, ((iqm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("StringMorpheme(string="), this.a, ')');
    }
}
