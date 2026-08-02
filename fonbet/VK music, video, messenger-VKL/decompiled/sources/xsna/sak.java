package xsna;

/* compiled from: CreateVkEmailContract.kt */
/* loaded from: classes15.dex */
public final class sak {
    public final String a;

    public sak(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sak) && epx.f(this.a, ((sak) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SuggestItem(suggest="), this.a, ')');
    }
}
