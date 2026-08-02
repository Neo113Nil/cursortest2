package xsna;

/* compiled from: ClipsDraftComponent.kt */
/* loaded from: classes17.dex */
public final class gdo {
    public final String a;

    public gdo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gdo) && epx.f(this.a, ((gdo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Removed(draftId="), this.a, ')');
    }
}
