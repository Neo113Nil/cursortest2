package defpackage;

@gsq0
/* loaded from: classes8.dex */
public final class lir0 implements nir0 {
    public static final kir0 Companion = new kir0();
    public final int a;

    public /* synthetic */ lir0(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            qje.Z(i, 1, jir0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lir0) && this.a == ((lir0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Fix(value="), this.a, ')');
    }

    public lir0(int i) {
        this.a = i;
    }
}
