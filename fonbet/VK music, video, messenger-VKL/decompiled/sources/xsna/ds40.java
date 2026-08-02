package xsna;

/* compiled from: MusicPickerAction.kt */
/* loaded from: classes4.dex */
public final class ds40 implements lr40 {
    public final String b;

    public ds40(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds40) && epx.f(this.b, ((ds40) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Update(query="), this.b, ')');
    }
}
