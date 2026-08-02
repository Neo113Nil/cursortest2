package xsna;

/* compiled from: NewsfeedHolderOffsets.kt */
@vby
/* loaded from: classes4.dex */
public final class nl60 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof nl60) {
            return this.a == ((nl60) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return q9k.d("NewsfeedHolderOffsets(packed=", this.a, ')');
    }
}
