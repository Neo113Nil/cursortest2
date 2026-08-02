package xsna;

/* compiled from: AudiobookChapterProgressEntity.kt */
/* loaded from: classes3.dex */
public final class o05 {
    public final String a;
    public final int b;
    public final String c;

    public o05(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o05)) {
            return false;
        }
        o05 o05Var = (o05) obj;
        return epx.f(this.a, o05Var.a) && this.b == o05Var.b && epx.f(this.c, o05Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudiobookChapterProgressEntity(chapterId=");
        sb.append(this.a);
        sb.append(", positionMs=");
        sb.append(this.b);
        sb.append(", launchOrigin=");
        return ho8.a(sb, this.c, ')');
    }
}
