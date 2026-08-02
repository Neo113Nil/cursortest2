package xsna;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class snn0 extends n3a {
    public final String a;

    public snn0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof snn0) && epx.f(this.a, ((snn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SwitchSectionCmd(sectionId="), this.a, ')');
    }
}
