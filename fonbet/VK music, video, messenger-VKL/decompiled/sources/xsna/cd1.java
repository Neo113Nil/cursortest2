package xsna;

/* compiled from: AlbumChooseAction.kt */
/* loaded from: classes7.dex */
public interface cd1 extends lj50 {

    /* compiled from: AlbumChooseAction.kt */
    public static final class a implements cd1 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 754688089;
        }

        public final String toString() {
            return "AddButtonClick";
        }
    }

    /* compiled from: AlbumChooseAction.kt */
    public static final class b implements cd1 {
        public final rl1 b;

        public b(rl1 rl1Var) {
            this.b = rl1Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AlbumClick(item=" + this.b + ')';
        }
    }

    /* compiled from: AlbumChooseAction.kt */
    public static final class c implements cd1 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1104212043;
        }

        public final String toString() {
            return "BackButtonClick";
        }
    }

    /* compiled from: AlbumChooseAction.kt */
    public static final class d implements cd1 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1235565272;
        }

        public final String toString() {
            return "BackPress";
        }
    }

    /* compiled from: AlbumChooseAction.kt */
    public static final class e implements cd1 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -508260507;
        }

        public final String toString() {
            return "CreateAlbumBottomSheetDismiss";
        }
    }

    /* compiled from: AlbumChooseAction.kt */
    public static final class f implements cd1 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1507912979;
        }

        public final String toString() {
            return "PaginationScrollTrigger";
        }
    }

    /* compiled from: AlbumChooseAction.kt */
    public static final class g implements cd1 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1529321193;
        }

        public final String toString() {
            return "ReadyButtonClick";
        }
    }

    /* compiled from: AlbumChooseAction.kt */
    public static final class h implements cd1 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1190348541;
        }

        public final String toString() {
            return "ScreenResume";
        }
    }
}
