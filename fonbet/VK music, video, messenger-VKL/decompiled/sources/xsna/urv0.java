package xsna;

/* compiled from: ClipCarouselAttachUiDto.kt */
/* loaded from: classes18.dex */
public final class urv0 implements omc {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public urv0(int i, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urv0)) {
            return false;
        }
        urv0 urv0Var = (urv0) obj;
        return epx.f(this.a, urv0Var.a) && epx.f(this.b, urv0Var.b) && epx.f(this.c, urv0Var.c) && this.d == urv0Var.d && this.e == urv0Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return Boolean.hashCode(this.e) + shy.a(this.d, (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkTicketClipAttachUiDto(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", marginStart=");
        sb.append(this.d);
        sb.append(", isDarkBackground=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
