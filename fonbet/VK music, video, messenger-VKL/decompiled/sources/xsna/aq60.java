package xsna;

/* compiled from: NewsfeedListEvent.kt */
/* loaded from: classes4.dex */
public final class aq60 implements yo60 {
    public final String a;

    public aq60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq60) && epx.f(this.a, ((aq60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Hide(trigger="), this.a, ')');
    }
}
