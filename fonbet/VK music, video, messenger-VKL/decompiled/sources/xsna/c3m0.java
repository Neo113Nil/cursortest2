package xsna;

import java.util.List;

/* compiled from: StoryFullStatContainer.kt */
/* loaded from: classes18.dex */
public final class c3m0 {
    public final String a;
    public final String b;
    public final String c;
    public final List<vdm0> d;

    public c3m0(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3m0)) {
            return false;
        }
        c3m0 c3m0Var = (c3m0) obj;
        return this.a.equals(c3m0Var.a) && epx.f(this.b, c3m0Var.b) && epx.f(this.c, c3m0Var.c) && epx.f(this.d, c3m0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(false) + fw3.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryFullStatContainer(preview=");
        sb.append(this.a);
        sb.append(", achievement=");
        sb.append(this.b);
        sb.append(", achievementSubtitle=");
        sb.append(this.c);
        sb.append(", categories=");
        return vp.b(", needPrivacyBlock=false)", sb, this.d);
    }
}
