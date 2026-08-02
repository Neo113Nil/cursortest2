package xsna;

/* compiled from: VideoVariantsResolver.kt */
/* loaded from: classes3.dex */
public final class lpt0 {
    public final String a;
    public final String b;
    public final String c;

    public lpt0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpt0)) {
            return false;
        }
        lpt0 lpt0Var = (lpt0) obj;
        return epx.f(this.a, lpt0Var.a) && epx.f(this.b, lpt0Var.b) && epx.f(this.c, lpt0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChapterIdToOvid(chapterId=");
        sb.append(this.a);
        sb.append(", ovid=");
        sb.append(this.b);
        sb.append(", vid=");
        return ho8.a(sb, this.c, ')');
    }
}
