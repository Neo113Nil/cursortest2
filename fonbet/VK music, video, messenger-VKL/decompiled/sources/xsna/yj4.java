package xsna;

/* compiled from: AudioBookToChaptersEntity.kt */
/* loaded from: classes3.dex */
public final class yj4 {
    public final String a;
    public final String b;
    public final int c;

    public yj4(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj4)) {
            return false;
        }
        yj4 yj4Var = (yj4) obj;
        return epx.f(this.a, yj4Var.a) && epx.f(this.b, yj4Var.b) && this.c == yj4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookToChaptersEntity(uid=");
        sb.append(this.a);
        sb.append(", chapterId=");
        sb.append(this.b);
        sb.append(", bookId=");
        return vu5.b(sb, this.c, ')');
    }
}
