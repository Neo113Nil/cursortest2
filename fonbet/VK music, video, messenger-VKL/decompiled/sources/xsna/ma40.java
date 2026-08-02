package xsna;

/* compiled from: MusicAttachUiDto.kt */
/* loaded from: classes4.dex */
public final class ma40 {
    public final us2 a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public ma40() {
        this(null, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma40)) {
            return false;
        }
        ma40 ma40Var = (ma40) obj;
        return epx.f(this.a, ma40Var.a) && epx.f(this.b, ma40Var.b) && this.c == ma40Var.c && epx.f(this.d, ma40Var.d) && epx.f(this.e, ma40Var.e) && this.f == ma40Var.f && this.g == ma40Var.g;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.g) + qoy.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicAttachUiDto(title=");
        sb.append((Object) this.a);
        sb.append(", titleContentDescription=");
        sb.append(this.b);
        sb.append(", shouldShowErrorAfterTitle=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", photoUrl=");
        sb.append(this.e);
        sb.append(", canDelete=");
        sb.append(this.f);
        sb.append(", isPlaylist=");
        return defpackage.q0.a(sb, this.g, ')');
    }

    public /* synthetic */ ma40(us2 us2Var, String str, int i) {
        this((i & 1) != 0 ? new us2("") : us2Var, (i & 2) != 0 ? "" : str, false, null, null, false, false);
    }

    public ma40(us2 us2Var, String str, boolean z, String str2, String str3, boolean z2, boolean z3) {
        this.a = us2Var;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = z3;
    }
}
