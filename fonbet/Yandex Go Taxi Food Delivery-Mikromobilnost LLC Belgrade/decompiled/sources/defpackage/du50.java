package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class du50 implements k260 {
    public static final cu50 Companion = new cu50();
    public final String a;

    public /* synthetic */ du50(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, bu50.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du50) && jl40.l(this.a, ((du50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("NetworkFillWidthTypeModel(type="), this.a, ')');
    }
}
