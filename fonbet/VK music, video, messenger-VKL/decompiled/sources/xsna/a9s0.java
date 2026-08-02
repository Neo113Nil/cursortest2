package xsna;

/* compiled from: VideoCatalogCommands.kt */
/* loaded from: classes16.dex */
public final class a9s0 extends beq {
    public final String a;

    public a9s0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9s0) && epx.f(this.a, ((a9s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SwitchSection(targetSectionId="), this.a, ')');
    }
}
