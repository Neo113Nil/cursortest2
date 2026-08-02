package xsna;

import com.vk.dto.music.Thumb;

/* compiled from: RelatedAudioInfo.kt */
/* loaded from: classes6.dex */
public final class asf0 {
    public final String a;
    public final String b;
    public final Thumb c;
    public final boolean d;
    public final boolean e;

    public asf0(Thumb thumb, String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = thumb;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asf0)) {
            return false;
        }
        asf0 asf0Var = (asf0) obj;
        return epx.f(this.a, asf0Var.a) && epx.f(this.b, asf0Var.b) && epx.f(this.c, asf0Var.c) && this.d == asf0Var.d && this.e == asf0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelatedAudioInfo(title=");
        sb.append(this.a);
        sb.append(", artist=");
        sb.append(this.b);
        sb.append(", thumb=");
        sb.append(this.c);
        sb.append(", isAdded=");
        sb.append(this.d);
        sb.append(", isRestricted=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
