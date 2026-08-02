package xsna;

/* compiled from: ChipContent.kt */
/* loaded from: classes3.dex */
public final class lac {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ lac(String str) {
        this(false, str, "", null);
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lac)) {
            return false;
        }
        lac lacVar = (lac) obj;
        return this.a == lacVar.a && epx.f(this.b, lacVar.b) && epx.f(this.c, lacVar.c) && epx.f(this.d, lacVar.d);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChipContent(isVisible=");
        sb.append(this.a);
        sb.append(", caption=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", trackCode=");
        return ho8.a(sb, this.d, ')');
    }

    public lac(boolean z, String str, String str2, String str3) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
