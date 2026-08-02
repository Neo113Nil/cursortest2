package xsna;

/* compiled from: PlaylistOwnerData.kt */
/* loaded from: classes3.dex */
public final class ybb0 {
    public final String a;
    public final String b;

    public ybb0() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybb0)) {
            return false;
        }
        ybb0 ybb0Var = (ybb0) obj;
        return epx.f(this.a, ybb0Var.a) && epx.f(this.b, ybb0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistOwnerData(photoUrl=");
        sb.append(this.a);
        sb.append(", name=");
        return ho8.a(sb, this.b, ')');
    }

    public ybb0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public /* synthetic */ ybb0(String str, int i) {
        this((String) null, (i & 2) != 0 ? "" : str);
    }
}
