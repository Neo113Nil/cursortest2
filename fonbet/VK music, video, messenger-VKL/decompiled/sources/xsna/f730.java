package xsna;

/* compiled from: CatalogBlockTaskId.kt */
/* loaded from: classes16.dex */
public final class f730 implements on50 {
    public final String a;

    public f730(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f730) && epx.f(this.a, ((f730) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ModifySectionTaskId(sectionId="), this.a, ')');
    }
}
