package defpackage;

/* loaded from: classes2.dex */
public final class oue0 implements pue0 {
    public final CharSequence a;

    public oue0(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oue0) && jl40.l(this.a, ((oue0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentLoading(text=" + ((Object) this.a) + ')';
    }
}
