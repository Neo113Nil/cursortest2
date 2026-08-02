package xsna;

/* compiled from: ReviewBlockHeader.kt */
/* loaded from: classes18.dex */
public final class qgg0 {
    public final String a;
    public final String b;
    public final float c;
    public final boolean d;

    public qgg0(String str, String str2, float f, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgg0)) {
            return false;
        }
        qgg0 qgg0Var = (qgg0) obj;
        return epx.f(this.a, qgg0Var.a) && epx.f(this.b, qgg0Var.b) && Float.compare(this.c, qgg0Var.c) == 0 && this.d == qgg0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewBlockHeader(avatar=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", rating=");
        sb.append(this.c);
        sb.append(", isPinned=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
