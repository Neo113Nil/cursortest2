package xsna;

/* compiled from: LiveStreamingCommentState.kt */
/* loaded from: classes3.dex */
public final class jmz {
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmz)) {
            return false;
        }
        jmz jmzVar = (jmz) obj;
        jmzVar.getClass();
        return this.a == jmzVar.a && this.b == jmzVar.b && this.c == jmzVar.c && this.d == jmzVar.d && this.e == jmzVar.e && this.f == jmzVar.f && this.g == jmzVar.g && this.h == jmzVar.h && this.i == jmzVar.i && this.j == jmzVar.j && this.k == jmzVar.k && this.l == jmzVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveStreamingCommentState(showAddRemove=false, canAdd=");
        sb.append(this.a);
        sb.append(", showLikeUnlike=");
        sb.append(this.b);
        sb.append(", canLike=");
        sb.append(this.c);
        sb.append(", showBlockUnblock=");
        sb.append(this.d);
        sb.append(", canBlock=");
        sb.append(this.e);
        sb.append(", showReport=");
        sb.append(this.f);
        sb.append(", showCopy=");
        sb.append(this.g);
        sb.append(", showProfile=");
        sb.append(this.h);
        sb.append(", showDelete=");
        sb.append(this.i);
        sb.append(", canReply=");
        sb.append(this.j);
        sb.append(", canPin=");
        sb.append(this.k);
        sb.append(", canUnpin=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
