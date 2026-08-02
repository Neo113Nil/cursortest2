package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class lv implements wv {
    public static final kv Companion = new kv();
    public final String a;

    public /* synthetic */ lv(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, jv.a.getDescriptor());
            throw null;
        }
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv) && jl40.l(this.a, ((lv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Deeplink(deeplink="), this.a, ')');
    }

    public lv(String str) {
        this.a = str;
    }
}
