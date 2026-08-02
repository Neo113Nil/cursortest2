package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class cov implements gov {
    public static final bov Companion = new bov();
    public final String a;

    public /* synthetic */ cov(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, aov.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cov) && jl40.l(this.a, ((cov) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("WebViewHasStartedBeingOverlapped(trackId="), this.a, ')');
    }

    public cov() {
        this.a = null;
    }
}
