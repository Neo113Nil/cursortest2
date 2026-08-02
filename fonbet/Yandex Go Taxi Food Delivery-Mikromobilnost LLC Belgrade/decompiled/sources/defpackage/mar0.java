package defpackage;

/* loaded from: classes5.dex */
public final class mar0 implements nar0 {
    public final int a;

    public mar0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mar0) && this.a == ((mar0) obj).a;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return "SpacerVertical";
    }

    public final int hashCode() {
        return (Integer.hashCode(this.a) * 31) + 134601698;
    }

    public final String toString() {
        return oyr.j(this.a, "SpacerVertical(height=", ", id=SpacerVertical)");
    }
}
