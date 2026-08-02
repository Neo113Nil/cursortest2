package xsna;

/* compiled from: TtsAnnotation.kt */
/* loaded from: classes11.dex */
public final class smr0 extends ysp0 {
    public final String a;

    public smr0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof smr0) {
            return epx.f(this.a, ((smr0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
