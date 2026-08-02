package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class omv implements gov {
    public static final nmv Companion = new nmv();
    public final String a;

    public /* synthetic */ omv(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, mmv.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omv) && jl40.l(this.a, ((omv) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OptionStatusesChanged(trackId="), this.a, ')');
    }

    public omv() {
        this.a = null;
    }
}
