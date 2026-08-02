package xsna;

/* compiled from: VoipJoinLinkCopiedEvent.kt */
/* loaded from: classes7.dex */
public final class hrw0 {
    public final String a;

    public hrw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hrw0) && epx.f(this.a, ((hrw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VoipJoinLinkCopiedEvent(joinLink="), this.a, ')');
    }
}
