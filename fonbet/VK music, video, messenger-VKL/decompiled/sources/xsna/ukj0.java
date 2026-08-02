package xsna;

import xsna.cdl;
import xsna.tkj0;

/* compiled from: SDKViewerSideControlConfig.kt */
/* loaded from: classes16.dex */
public interface ukj0 {

    /* compiled from: SDKViewerSideControlConfig.kt */
    public static final class a implements ukj0 {
        public final cdl<tkj0.b> a;

        public a() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Comments(commentsConfig=" + this.a + ')';
        }

        public a(Object obj) {
            this.a = cdl.b.a;
        }
    }

    /* compiled from: SDKViewerSideControlConfig.kt */
    public static final class b implements ukj0 {
    }

    /* compiled from: SDKViewerSideControlConfig.kt */
    public static final class c implements ukj0 {
        public final cdl<tkj0.a> a;

        public c() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Dislike(dislikesConfig=" + this.a + ')';
        }

        public c(Object obj) {
            this.a = cdl.b.a;
        }
    }

    /* compiled from: SDKViewerSideControlConfig.kt */
    public static final class d implements ukj0 {
        public final cdl<tkj0.a> a;

        public d() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Favorites(favoritesConfig=" + this.a + ')';
        }

        public d(Object obj) {
            this.a = cdl.b.a;
        }
    }

    /* compiled from: SDKViewerSideControlConfig.kt */
    public static final class e implements ukj0 {
        public final cdl<tkj0.a> a;

        public e() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Like(likesConfig=" + this.a + ')';
        }

        public e(Object obj) {
            this.a = cdl.b.a;
        }
    }

    /* compiled from: SDKViewerSideControlConfig.kt */
    public static final class f implements ukj0 {
        public final cdl<tkj0.b> a;

        public f() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "More(moreConfig=" + this.a + ')';
        }

        public f(Object obj) {
            this.a = cdl.b.a;
        }
    }

    /* compiled from: SDKViewerSideControlConfig.kt */
    public static final class g implements ukj0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -504144580;
        }

        public final String toString() {
            return "Separator";
        }
    }

    /* compiled from: SDKViewerSideControlConfig.kt */
    public static final class h implements ukj0 {
        public final cdl<tkj0.b> a;

        public h() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Share(sharesConfig=" + this.a + ')';
        }

        public h(cdl<tkj0.b> cdlVar) {
            this.a = cdlVar;
        }

        public /* synthetic */ h(int i) {
            this(cdl.b.a);
        }
    }
}
