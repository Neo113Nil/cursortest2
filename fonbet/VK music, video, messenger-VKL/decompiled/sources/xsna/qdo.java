package xsna;

/* compiled from: DraftViewItem.kt */
/* loaded from: classes18.dex */
public final class qdo {
    public final int a;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final Integer g;

    public qdo(int i, CharSequence charSequence, String str, String str2, int i2, int i3, Integer num) {
        this.a = i;
        this.b = charSequence;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdo)) {
            return false;
        }
        qdo qdoVar = (qdo) obj;
        return this.a == qdoVar.a && epx.f(this.b, qdoVar.b) && epx.f(this.c, qdoVar.c) && epx.f(this.d, qdoVar.d) && this.e == qdoVar.e && this.f == qdoVar.f && epx.f(this.g, qdoVar.g);
    }

    public final int hashCode() {
        int a = urd0.a(u11.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int a2 = shy.a(this.f, shy.a(this.e, (a + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Integer num = this.g;
        return a2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftViewItem(postId=");
        sb.append(this.a);
        sb.append(", postText=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", imageUrl=");
        sb.append(this.d);
        sb.append(", photoCount=");
        sb.append(this.e);
        sb.append(", videoCount=");
        sb.append(this.f);
        sb.append(", videoDurationSeconds=");
        return uqi.b(sb, this.g, ')');
    }
}
