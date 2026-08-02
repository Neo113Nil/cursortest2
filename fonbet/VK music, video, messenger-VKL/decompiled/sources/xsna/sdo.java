package xsna;

import com.vk.dto.newsfeed.entries.Post;

/* compiled from: DraftsListAction.kt */
/* loaded from: classes18.dex */
public interface sdo extends lj50 {

    /* compiled from: DraftsListAction.kt */
    public static final class a implements sdo {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1808748065;
        }

        public final String toString() {
            return "BackPress";
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class b implements sdo {
        public final int b;
        public final int c;

        public b(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CopyLinkClick(postId=");
            sb.append(this.b);
            sb.append(", listPosition=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class c implements sdo {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2132240881;
        }

        public final String toString() {
            return "CreatePostClick";
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class d implements sdo {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("DeleteDraftClick(postId="), this.b, ')');
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class e implements sdo {
        public final int b;

        public e(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("DraftClick(postId="), this.b, ')');
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class f implements sdo {
        public final int b;

        public f(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("EditDraftClick(postId="), this.b, ')');
        }
    }

    /* compiled from: DraftsListAction.kt */
    public interface g extends sdo {

        /* compiled from: DraftsListAction.kt */
        public static final class a implements g {
            public final Post b;

            public a(Post post) {
                this.b = post;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Add(post=" + this.b + ')';
            }
        }

        /* compiled from: DraftsListAction.kt */
        public static final class b implements g {
            public final int b;

            public b(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Delete(postId="), this.b, ')');
            }
        }

        /* compiled from: DraftsListAction.kt */
        public static final class c implements g {
            public final Post b;

            public c(Post post) {
                this.b = post;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Update(post=" + this.b + ')';
            }
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class h implements sdo {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 223191683;
        }

        public final String toString() {
            return "LoadNextPage";
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class i implements sdo {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -636514508;
        }

        public final String toString() {
            return "OnScrolledToTop";
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class j implements sdo {
        public final int b;

        public j(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.b == ((j) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PublishDraftClick(postId="), this.b, ')');
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class k implements sdo {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1546447200;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class l implements sdo {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1036909781;
        }

        public final String toString() {
            return "RetryInitialLoadClick";
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class m implements sdo {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 973102808;
        }

        public final String toString() {
            return "RetryPadinationLoadClick";
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class n implements sdo {
        public static final n b = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 88965908;
        }

        public final String toString() {
            return "ScreenResume";
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class o implements sdo {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -164469999;
        }

        public final String toString() {
            return "SnackbarShown";
        }
    }

    /* compiled from: DraftsListAction.kt */
    public static final class p implements sdo {
        public static final p b = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1472856449;
        }

        public final String toString() {
            return "ToolbarBackClick";
        }
    }
}
