package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class fov implements gov {
    public static final eov Companion = new eov();
    public final String a;

    public /* synthetic */ fov(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, dov.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fov) && jl40.l(this.a, ((fov) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("WebViewHasStoppedBeingOverlapped(trackId="), this.a, ')');
    }

    public fov() {
        this.a = null;
    }
}
