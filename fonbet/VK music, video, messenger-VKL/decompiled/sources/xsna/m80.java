package xsna;

/* compiled from: ActiveSnippetEntity.kt */
/* loaded from: classes3.dex */
public final class m80 implements jx4 {
    public static final m80 i = new m80("", "", 0, 0, 0, false, wbk0.e);
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final wbk0 h;

    public m80(String str, String str2, int i2, int i3, int i4, boolean z, wbk0 wbk0Var) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = wbk0Var;
    }

    @Override // xsna.jx4
    public final long a() {
        return this.h.b;
    }

    @Override // xsna.jx4
    public final long b() {
        this.h.getClass();
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m80)) {
            return false;
        }
        m80 m80Var = (m80) obj;
        return epx.f(this.b, m80Var.b) && epx.f(this.c, m80Var.c) && this.d == m80Var.d && this.e == m80Var.e && this.f == m80Var.f && this.g == m80Var.g && epx.f(this.h, m80Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + qoy.b(shy.a(this.f, shy.a(this.e, shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31), 31), 31, this.g);
    }

    public final String toString() {
        return "ActiveSnippetEntity(sectionId=" + this.b + ", sectionTrackCode=" + this.c + ", sectionPosition=" + this.d + ", snippetPosition=" + this.e + ", flowDirection=" + this.f + ", isLastSnippetInSection=" + this.g + ", snippet=" + this.h + ')';
    }
}
