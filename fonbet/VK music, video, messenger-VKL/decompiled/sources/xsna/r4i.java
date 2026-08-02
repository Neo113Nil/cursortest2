package xsna;

/* compiled from: CommunityUnpublishedPostsBottomSheetModel.kt */
/* loaded from: classes5.dex */
public final class r4i {
    public final a a;
    public final boolean b;
    public final qgc0 c;

    /* compiled from: CommunityUnpublishedPostsBottomSheetModel.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Counters(drafts=");
            sb.append(this.a);
            sb.append(", suggested=");
            sb.append(this.b);
            sb.append(", postponed=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public r4i(a aVar, boolean z, qgc0 qgc0Var) {
        this.a = aVar;
        this.b = z;
        this.c = qgc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4i)) {
            return false;
        }
        r4i r4iVar = (r4i) obj;
        return this.a.equals(r4iVar.a) && this.b == r4iVar.b && this.c.equals(r4iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "CommunityUnpublishedPostsBottomSheetModel(counters=" + this.a + ", redesigned=" + this.b + ", clickListener=" + this.c + ')';
    }
}
