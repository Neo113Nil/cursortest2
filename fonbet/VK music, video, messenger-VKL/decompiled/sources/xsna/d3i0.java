package xsna;

/* compiled from: SeekBarAppearance.kt */
/* loaded from: classes16.dex */
public final class d3i0 {
    public static final d3i0 c = new d3i0(b.d, a.d);
    public final b a;
    public final a b;

    /* compiled from: SeekBarAppearance.kt */
    public static final class a {
        public static final a d = new a(0, 0, null);
        public final int a;
        public final int b;
        public final cut0 c;

        public a(int i, int i2, cut0 cut0Var) {
            this.a = i;
            this.b = i2;
            this.c = cut0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [xsna.cut0] */
        public static a a(a aVar, int i, z7g z7gVar, int i2) {
            if ((i2 & 1) != 0) {
                i = aVar.a;
            }
            int i3 = aVar.b;
            z7g z7gVar2 = z7gVar;
            if ((i2 & 4) != 0) {
                z7gVar2 = aVar.c;
            }
            return new a(i, i3, z7gVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
            cut0 cut0Var = this.c;
            return a + (cut0Var == null ? 0 : cut0Var.hashCode());
        }

        public final String toString() {
            return "Thumb(radius=" + this.a + ", strokeWidth=" + this.b + ", color=" + this.c + ')';
        }
    }

    /* compiled from: SeekBarAppearance.kt */
    public static final class b {
        public static final b d = new b(0, null, null);
        public final int a;
        public final cut0 b;
        public final cut0 c;

        public b(int i, cut0 cut0Var, cut0 cut0Var2) {
            this.a = i;
            this.b = cut0Var;
            this.c = cut0Var2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [xsna.cut0] */
        /* JADX WARN: Type inference failed for: r4v2, types: [xsna.cut0] */
        public static b a(b bVar, int i, z7g z7gVar, z7g z7gVar2, int i2) {
            if ((i2 & 1) != 0) {
                i = bVar.a;
            }
            z7g z7gVar3 = z7gVar;
            if ((i2 & 2) != 0) {
                z7gVar3 = bVar.b;
            }
            z7g z7gVar4 = z7gVar2;
            if ((i2 & 4) != 0) {
                z7gVar4 = bVar.c;
            }
            return new b(i, z7gVar3, z7gVar4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            cut0 cut0Var = this.b;
            int hashCode2 = (hashCode + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
            cut0 cut0Var2 = this.c;
            return hashCode2 + (cut0Var2 != null ? cut0Var2.hashCode() : 0);
        }

        public final String toString() {
            return "Track(height=" + this.a + ", activeColor=" + this.b + ", inactiveColor=" + this.c + ')';
        }
    }

    public d3i0(b bVar, a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3i0)) {
            return false;
        }
        d3i0 d3i0Var = (d3i0) obj;
        return epx.f(this.a, d3i0Var.a) && epx.f(this.b, d3i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SeekBarAppearance(track=" + this.a + ", thumb=" + this.b + ')';
    }
}
