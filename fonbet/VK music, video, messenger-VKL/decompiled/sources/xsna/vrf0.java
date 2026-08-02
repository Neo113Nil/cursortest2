package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;

/* compiled from: RelatedAudio.kt */
/* loaded from: classes6.dex */
public final class vrf0 {
    public final int a;
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final Thumb f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;

    public vrf0(int i, UserId userId, String str, String str2, String str3, Thumb thumb, boolean z, boolean z2, String str4, String str5) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = thumb;
        this.g = z;
        this.h = z2;
        this.i = str4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrf0)) {
            return false;
        }
        vrf0 vrf0Var = (vrf0) obj;
        return this.a == vrf0Var.a && epx.f(this.b, vrf0Var.b) && epx.f(this.c, vrf0Var.c) && epx.f(this.d, vrf0Var.d) && epx.f(this.e, vrf0Var.e) && epx.f(this.f, vrf0Var.f) && this.g == vrf0Var.g && this.h == vrf0Var.h && epx.f(this.i, vrf0Var.i) && epx.f(this.j, vrf0Var.j);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31, this.c);
        String str = this.d;
        int a2 = urd0.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Thumb thumb = this.f;
        int b = qoy.b(qoy.b((a2 + (thumb == null ? 0 : thumb.hashCode())) * 31, 31, this.g), 31, this.h);
        String str2 = this.i;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelatedAudio(audioId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", artist=");
        sb.append(this.e);
        sb.append(", thumb=");
        sb.append(this.f);
        sb.append(", isAdded=");
        sb.append(this.g);
        sb.append(", isRestricted=");
        sb.append(this.h);
        sb.append(", trackCode=");
        sb.append(this.i);
        sb.append(", accessKey=");
        return ho8.a(sb, this.j, ')');
    }
}
