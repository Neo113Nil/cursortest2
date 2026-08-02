package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;

/* compiled from: NewsfeedListAction.kt */
/* loaded from: classes4.dex */
public interface xn60 extends lj50 {

    /* compiled from: NewsfeedListAction.kt */
    public static final class a implements xn60 {
        public final NewsfeedExternalAction b;

        public a(NewsfeedExternalAction newsfeedExternalAction) {
            this.b = newsfeedExternalAction;
        }
    }

    /* compiled from: NewsfeedListAction.kt */
    public interface b extends xn60 {

        /* compiled from: NewsfeedListAction.kt */
        public static final class a implements b {
            public final NewsEntry b;
            public final UserId c;

            public a(UserId userId, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = userId;
            }
        }

        /* compiled from: NewsfeedListAction.kt */
        /* renamed from: xsna.xn60$b$b, reason: collision with other inner class name */
        public static final class C4020b implements b {
        }

        /* compiled from: NewsfeedListAction.kt */
        public static final class c implements b {
        }

        /* compiled from: NewsfeedListAction.kt */
        public static final class d implements b {
        }

        /* compiled from: NewsfeedListAction.kt */
        public static final class e implements b {
        }

        /* compiled from: NewsfeedListAction.kt */
        public static final class f implements b {
            public final Post b;

            public f(Post post) {
                this.b = post;
            }
        }

        /* compiled from: NewsfeedListAction.kt */
        public static final class g implements b {
            public final NewsEntry b;

            public g(NewsEntry newsEntry) {
                this.b = newsEntry;
            }
        }

        /* compiled from: NewsfeedListAction.kt */
        public static final class h implements b {
            public final Post b;
            public final String c;

            public h(String str, Post post) {
                this.b = post;
                this.c = str;
            }
        }
    }

    /* compiled from: NewsfeedListAction.kt */
    public interface c extends xn60 {

        /* compiled from: NewsfeedListAction.kt */
        public interface a extends c {

            /* compiled from: NewsfeedListAction.kt */
            /* renamed from: xsna.xn60$c$a$a, reason: collision with other inner class name */
            public static final class C4021a implements a {
                public static final C4021a b = new C4021a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C4021a);
                }

                public final int hashCode() {
                    return 592360486;
                }

                public final String toString() {
                    return "Create";
                }
            }

            /* compiled from: NewsfeedListAction.kt */
            public static final class b implements a {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -749856555;
                }

                public final String toString() {
                    return "DestroyView";
                }
            }

            /* compiled from: NewsfeedListAction.kt */
            /* renamed from: xsna.xn60$c$a$c, reason: collision with other inner class name */
            public static final class C4022c implements a {
                public static final C4022c b = new C4022c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C4022c);
                }

                public final int hashCode() {
                    return -523565684;
                }

                public final String toString() {
                    return "Pause";
                }
            }

            /* compiled from: NewsfeedListAction.kt */
            public static final class d implements a {
                public static final d b = new d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return 1010228055;
                }

                public final String toString() {
                    return "Resume";
                }
            }
        }

        /* compiled from: NewsfeedListAction.kt */
        public interface b extends c {

            /* compiled from: NewsfeedListAction.kt */
            public static final class a implements b {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -324246635;
                }

                public final String toString() {
                    return "ActivityPause";
                }
            }

            /* compiled from: NewsfeedListAction.kt */
            /* renamed from: xsna.xn60$c$b$b, reason: collision with other inner class name */
            public static final class C4023b implements b {
                public static final C4023b b = new C4023b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C4023b);
                }

                public final int hashCode() {
                    return -1400816018;
                }

                public final String toString() {
                    return "ActivityResume";
                }
            }

            /* compiled from: NewsfeedListAction.kt */
            /* renamed from: xsna.xn60$c$b$c, reason: collision with other inner class name */
            public static final class C4024c implements b {
                public static final C4024c b = new C4024c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C4024c);
                }

                public final int hashCode() {
                    return -263098034;
                }

                public final String toString() {
                    return "Create";
                }
            }

            /* compiled from: NewsfeedListAction.kt */
            public static final class d implements b {
                public static final d b = new d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return 962714088;
                }

                public final String toString() {
                    return "Destroy";
                }
            }

            /* compiled from: NewsfeedListAction.kt */
            public static final class e implements b {
                public final boolean b;

                public e(boolean z) {
                    this.b = z;
                }
            }

            /* compiled from: NewsfeedListAction.kt */
            public static final class f implements b {
                public final boolean b;

                public f(boolean z) {
                    this.b = z;
                }
            }

            /* compiled from: NewsfeedListAction.kt */
            public static final class g implements b {
            }

            /* compiled from: NewsfeedListAction.kt */
            public static final class h implements b {
                public static final h b = new h();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof h);
                }

                public final int hashCode() {
                    return 154769535;
                }

                public final String toString() {
                    return "Resume";
                }
            }
        }

        /* compiled from: NewsfeedListAction.kt */
        /* renamed from: xsna.xn60$c$c, reason: collision with other inner class name */
        public interface InterfaceC4025c extends c {

            /* compiled from: NewsfeedListAction.kt */
            /* renamed from: xsna.xn60$c$c$a */
            public static final class a implements InterfaceC4025c {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 642298603;
                }

                public final String toString() {
                    return "Pause";
                }
            }

            /* compiled from: NewsfeedListAction.kt */
            /* renamed from: xsna.xn60$c$c$b */
            public static final class b implements InterfaceC4025c {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -1502684712;
                }

                public final String toString() {
                    return "Resume";
                }
            }
        }
    }

    /* compiled from: NewsfeedListAction.kt */
    public interface d extends xn60 {

        /* compiled from: NewsfeedListAction.kt */
        public static final class a implements d {
            public static final a b = new a();
        }

        /* compiled from: NewsfeedListAction.kt */
        public static final class b implements d {
            public static final b b = new b();
        }

        /* compiled from: NewsfeedListAction.kt */
        public static final class c implements d {
            public static final c b = new c();
        }
    }
}
