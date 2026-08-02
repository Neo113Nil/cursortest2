package xsna;

/* compiled from: ClipsDraftParams.kt */
/* loaded from: classes17.dex */
public final class htd implements l9i {
    public final String a;

    public htd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof htd) && epx.f(this.a, ((htd) obj).a);
    }

    @Override // xsna.l9i
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ClipsDraftParams(tableName="), this.a, ')');
    }
}
