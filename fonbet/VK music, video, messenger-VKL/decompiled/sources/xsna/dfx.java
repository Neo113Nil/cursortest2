package xsna;

/* compiled from: InterestingStoryItem.kt */
/* loaded from: classes6.dex */
public final class dfx {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dfx(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfx)) {
            return false;
        }
        dfx dfxVar = (dfx) obj;
        return epx.f(this.a, dfxVar.a) && epx.f(this.b, dfxVar.b) && epx.f(this.c, dfxVar.c) && epx.f(this.d, dfxVar.d);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InterestingStoryItem(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append(", thumbHash=");
        return ho8.a(sb, this.d, ')');
    }
}
