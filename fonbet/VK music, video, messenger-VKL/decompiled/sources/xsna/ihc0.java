package xsna;

/* compiled from: PostingMoreMenuParams.kt */
/* loaded from: classes4.dex */
public final class ihc0 {
    public a a;
    public a b;
    public a c;
    public a d;
    public a e;
    public a f;
    public a g;
    public a h;
    public a i;
    public a j;
    public a k;

    /* compiled from: PostingMoreMenuParams.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a() {
            this(false, 3);
        }

        public static a a(a aVar, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.b;
            }
            aVar.getClass();
            return new a(z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(isVisible=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public /* synthetic */ a(boolean z, int i) {
            this((i & 1) != 0 ? true : z, true);
        }

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public ihc0() {
        this(null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihc0)) {
            return false;
        }
        ihc0 ihc0Var = (ihc0) obj;
        return epx.f(this.a, ihc0Var.a) && epx.f(this.b, ihc0Var.b) && epx.f(this.c, ihc0Var.c) && epx.f(this.d, ihc0Var.d) && epx.f(this.e, ihc0Var.e) && epx.f(this.f, ihc0Var.f) && epx.f(this.g, ihc0Var.g) && epx.f(this.h, ihc0Var.h) && epx.f(this.i, ihc0Var.i) && epx.f(this.j, ihc0Var.j) && epx.f(this.k, ihc0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PostingMoreMenuParams(photoVk=" + this.a + ", videoVk=" + this.b + ", albumVk=" + this.c + ", document=" + this.d + ", location=" + this.e + ", poll=" + this.f + ", good=" + this.g + ", service=" + this.h + ", article=" + this.i + ", booking=" + this.j + ", marketInvolvementButton=" + this.k + ')';
    }

    public ihc0(a aVar, int i) {
        boolean z = false;
        int i2 = 3;
        a aVar2 = new a(z, i2);
        a aVar3 = new a(z, i2);
        a aVar4 = new a(z, i2);
        aVar = (i & 8) != 0 ? new a(z, i2) : aVar;
        a aVar5 = new a(z, i2);
        a aVar6 = new a(z, i2);
        a aVar7 = new a(z, i2);
        a aVar8 = new a(z, i2);
        a aVar9 = new a(z, i2);
        int i3 = 2;
        a aVar10 = new a(z, i3);
        a aVar11 = new a(z, i3);
        this.a = aVar2;
        this.b = aVar3;
        this.c = aVar4;
        this.d = aVar;
        this.e = aVar5;
        this.f = aVar6;
        this.g = aVar7;
        this.h = aVar8;
        this.i = aVar9;
        this.j = aVar10;
        this.k = aVar11;
    }
}
