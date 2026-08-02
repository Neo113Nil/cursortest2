package xsna;

/* compiled from: NewsfeedPlaceholderDto.kt */
/* loaded from: classes4.dex */
public final class mv60 {
    public final int a;

    public mv60(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mv60) && this.a == ((mv60) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("NewsfeedPlaceholderDto(listId="), this.a, ')');
    }
}
