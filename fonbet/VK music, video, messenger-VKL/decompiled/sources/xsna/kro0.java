package xsna;

/* compiled from: ThreadShowMoreItem.kt */
/* loaded from: classes16.dex */
public abstract class kro0 implements hfz {
    public final int b;

    /* compiled from: ThreadShowMoreItem.kt */
    public static final class a extends kro0 {
        public final int c;

        public a(int i) {
            super(i);
            this.c = i;
        }

        @Override // xsna.kro0
        public final int a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.c == ((a) obj).c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Loading(parentCommentId="), this.c, ')');
        }
    }

    /* compiled from: ThreadShowMoreItem.kt */
    public static final class b extends kro0 {
        public final int c;
        public final int d;

        public b(int i, int i2) {
            super(i);
            this.c = i;
            this.d = i2;
        }

        @Override // xsna.kro0
        public final int a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + (Integer.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowMore(parentCommentId=");
            sb.append(this.c);
            sb.append(", showMoreCount=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: ThreadShowMoreItem.kt */
    public static final class c extends kro0 {
        public final int c;
        public final String d;

        public c(int i, String str) {
            super(i);
            this.c = i;
            this.d = str;
        }

        @Override // xsna.kro0
        public final int a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.c == cVar.c && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowNegativeComments(parentCommentId=");
            sb.append(this.c);
            sb.append(", title=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public kro0(int i) {
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(a());
    }
}
