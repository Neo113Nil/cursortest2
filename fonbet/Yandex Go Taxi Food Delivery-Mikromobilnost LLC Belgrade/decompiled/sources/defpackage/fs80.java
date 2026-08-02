package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class fs80 implements pw80 {
    public static final es80 Companion = new es80();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ fs80(String str, int i, String str2, boolean z) {
        if (6 != (i & 6)) {
            qje.Z(i, 6, ds80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs80)) {
            return false;
        }
        fs80 fs80Var = (fs80) obj;
        return jl40.l(this.a, fs80Var.a) && jl40.l(this.b, fs80Var.b) && this.c == fs80Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeOptionStatusRequest(trackId=");
        sb.append(this.a);
        sb.append(", optionId=");
        sb.append(this.b);
        sb.append(", newStatus=");
        return unr0.u(sb, this.c, ')');
    }
}
