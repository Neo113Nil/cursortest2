package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class gu50 implements k260 {
    public static final fu50 Companion = new fu50();
    public final String a;

    public /* synthetic */ gu50(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, eu50.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gu50) && jl40.l(this.a, ((gu50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("NetworkFitWidthTypeModel(type="), this.a, ')');
    }
}
