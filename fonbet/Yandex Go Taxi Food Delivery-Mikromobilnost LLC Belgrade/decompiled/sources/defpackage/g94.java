package defpackage;

/* loaded from: classes10.dex */
public final class g94 extends km31 {
    public final String a;
    public final int b;
    public final lzn c;

    public g94(String str, int i, lzn lznVar) {
        this.a = str;
        this.b = i;
        this.c = lznVar;
    }

    @Override // defpackage.dh20
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dh20
    public final int b() {
        return this.b;
    }

    @Override // defpackage.km31
    public final lzn c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof km31)) {
            return false;
        }
        km31 km31Var = (km31) obj;
        if (!this.a.equals(km31Var.a()) || this.b != km31Var.b()) {
            return false;
        }
        lzn lznVar = this.c;
        return lznVar == null ? km31Var.c() == null : lznVar.equals(km31Var.c());
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        lzn lznVar = this.c;
        return (lznVar == null ? 0 : lznVar.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.c + "}";
    }
}
