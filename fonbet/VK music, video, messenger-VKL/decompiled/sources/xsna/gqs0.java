package xsna;

/* compiled from: VideoInfoViewParams.kt */
/* loaded from: classes16.dex */
public final class gqs0 {
    public final CharSequence a;

    public gqs0(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gqs0) && epx.f(this.a, ((gqs0) obj).a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return thl0.a(new StringBuilder("VideoInfoViewParams(donutChip="), this.a, ')');
    }
}
