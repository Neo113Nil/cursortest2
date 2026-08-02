package xsna;

import xsna.xn60;

/* compiled from: DiscoverMediaAction.kt */
/* loaded from: classes4.dex */
public interface m2n extends lj50 {

    /* compiled from: DiscoverMediaAction.kt */
    public static final class a implements m2n, pj50<xn60.a> {
        public final xn60.a b;

        public a(xn60.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        @Override // xsna.pj50
        public final xn60.a h() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ExternalAction(action=" + this.b + ')';
        }
    }

    /* compiled from: DiscoverMediaAction.kt */
    public static final class b implements m2n, pj50<xn60.b> {
        public final xn60.b b;

        public b(xn60.b bVar) {
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        @Override // xsna.pj50
        public final xn60.b h() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Item(action=" + this.b + ')';
        }
    }

    /* compiled from: DiscoverMediaAction.kt */
    public interface c extends m2n {

        /* compiled from: DiscoverMediaAction.kt */
        public static final class a implements c, pj50<xn60.c> {
            public final xn60.c b;

            public a(xn60.c cVar) {
                this.b = cVar;
            }

            @Override // xsna.pj50
            public final xn60.c h() {
                return this.b;
            }
        }
    }

    /* compiled from: DiscoverMediaAction.kt */
    public static final class d implements m2n, pj50<xn60.d> {
        public final xn60.d b;

        public d(xn60.d dVar) {
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        @Override // xsna.pj50
        public final xn60.d h() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "List(action=" + this.b + ')';
        }
    }

    /* compiled from: DiscoverMediaAction.kt */
    public interface e extends m2n {

        /* compiled from: DiscoverMediaAction.kt */
        public static final class a implements e {
            public final boolean b;

            public a(boolean z) {
                this.b = z;
            }
        }
    }
}
