package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import xsna.ln50;
import xsna.on50;

/* compiled from: NewsfeedListTask.kt */
/* loaded from: classes4.dex */
public interface ds60 extends hn50 {

    /* compiled from: NewsfeedListTask.kt */
    public interface a extends ds60 {

        /* compiled from: NewsfeedListTask.kt */
        /* renamed from: xsna.ds60$a$a, reason: collision with other inner class name */
        public static final class C2747a implements a {
            public static final C2747a b = new C2747a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class b implements a {
            public static final b b = new b();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }
    }

    /* compiled from: NewsfeedListTask.kt */
    public static final class b implements ds60 {
        public final NewsfeedExternalAction.c b;

        public b(NewsfeedExternalAction.c cVar) {
            this.b = cVar;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }
    }

    /* compiled from: NewsfeedListTask.kt */
    public interface c extends ds60 {

        /* compiled from: NewsfeedListTask.kt */
        public static final class a implements c {
            public final NewsEntry b;
            public final UserId c;

            public a(UserId userId, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = userId;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class b implements c {
            public final Post b;

            public b(Post post) {
                this.b = post;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        /* renamed from: xsna.ds60$c$c, reason: collision with other inner class name */
        public static final class C2748c implements c {
            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class d implements c {
            public final NewsEntry b;
            public final aw0 c;

            public d(NewsEntry newsEntry, aw0 aw0Var) {
                this.b = newsEntry;
                this.c = aw0Var;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class e implements c {
            public final MyTargetNativeAdEntry b;

            public e(MyTargetNativeAdEntry myTargetNativeAdEntry) {
                this.b = myTargetNativeAdEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class f implements c {
            public final NewsEntry b;

            public f(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public interface g extends c {

            /* compiled from: NewsfeedListTask.kt */
            public static final class a implements g {
                public final UserId b;
                public final int c;
                public final iag d;

                public a(int i, UserId userId, iag iagVar) {
                    this.b = userId;
                    this.c = i;
                    this.d = iagVar;
                }

                @Override // xsna.hn50
                public final ln50<on50> d() {
                    return ln50.a.a;
                }

                @Override // xsna.hn50
                public final on50 getId() {
                    return on50.a.a;
                }
            }

            /* compiled from: NewsfeedListTask.kt */
            public static final class b implements g {
                public final Post b;

                public b(Post post) {
                    this.b = post;
                }

                @Override // xsna.hn50
                public final ln50<on50> d() {
                    return ln50.a.a;
                }

                @Override // xsna.hn50
                public final on50 getId() {
                    return on50.a.a;
                }
            }

            /* compiled from: NewsfeedListTask.kt */
            /* renamed from: xsna.ds60$c$g$c, reason: collision with other inner class name */
            public static final class C2749c implements g {
                public final Post b;

                public C2749c(Post post) {
                    this.b = post;
                }

                @Override // xsna.hn50
                public final ln50<on50> d() {
                    return ln50.a.a;
                }

                @Override // xsna.hn50
                public final on50 getId() {
                    return on50.a.a;
                }
            }

            /* compiled from: NewsfeedListTask.kt */
            public static final class d implements g {
                public final Post b;

                public d(Post post) {
                    this.b = post;
                }

                @Override // xsna.hn50
                public final ln50<on50> d() {
                    return ln50.a.a;
                }

                @Override // xsna.hn50
                public final on50 getId() {
                    return on50.a.a;
                }
            }

            /* compiled from: NewsfeedListTask.kt */
            public static final class e implements g {
                public final Post b;

                public e(Post post) {
                    this.b = post;
                }

                @Override // xsna.hn50
                public final ln50<on50> d() {
                    return ln50.a.a;
                }

                @Override // xsna.hn50
                public final on50 getId() {
                    return on50.a.a;
                }
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class h implements c {
            public final NewsEntry b;
            public final NewsEntry c;

            public h(NewsEntry newsEntry, NewsEntry newsEntry2) {
                this.b = newsEntry;
                this.c = newsEntry2;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class i implements c {
            public final Post b;

            public i(Post post) {
                this.b = post;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class j implements c {
            public final NewsEntry b;

            public j(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class k implements c {
            public final Post b;

            public k(Post post) {
                this.b = post;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class l implements c {
            public final Post b;
            public final String c;

            public l(String str, Post post) {
                this.b = post;
                this.c = str;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }
    }

    /* compiled from: NewsfeedListTask.kt */
    public interface d extends ds60 {

        /* compiled from: NewsfeedListTask.kt */
        public static final class a implements d {
            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class b implements d {
            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class c implements d {
            public final NewsEntry b;
            public final int c;

            public c(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        /* renamed from: xsna.ds60$d$d, reason: collision with other inner class name */
        public static final class C2750d implements d {
            public final NewsEntry b;
            public final NewsEntry c;
            public final int d;

            public C2750d(NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
                this.b = newsEntry;
                this.c = newsEntry2;
                this.d = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class e implements d {
            public final NewsEntry b;

            public e(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class f implements d {
            public final NewsEntry b;
            public final int c;

            public f(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class g implements d {
            public final Post b;
            public final PostingCreationEntryPoint c;

            public g(Post post, PostingCreationEntryPoint postingCreationEntryPoint) {
                this.b = post;
                this.c = postingCreationEntryPoint;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }
    }

    /* compiled from: NewsfeedListTask.kt */
    public interface e extends ds60 {

        /* compiled from: NewsfeedListTask.kt */
        public static final class a implements e {
            public final NewsEntry b;

            public a(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class a0 implements e {
            public final NewsEntry b;

            public a0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class b implements e {
            public final NewsEntry b;

            public b(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class b0 implements e {
            public final NewsEntry b;

            public b0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class c implements e {
            public final NewsEntry b;

            public c(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class c0 implements e {
            public final NewsEntry b;

            public c0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class d implements e {
            public final NewsEntry b;

            public d(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class d0 implements e {
            public final NewsEntry b;
            public final int c;

            public d0(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        /* renamed from: xsna.ds60$e$e, reason: collision with other inner class name */
        public static final class C2751e implements e {
            public final NewsEntry b;
            public final int c;

            public C2751e(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class e0 implements e {
            public final NewsEntry b;
            public final int c;

            public e0(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class f implements e {
            public final NewsEntry b;
            public final int c;

            public f(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class f0 implements e {
            public final NewsEntry b;
            public final int c;

            public f0(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class g implements e {
            public final NewsEntry b;

            public g(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class g0 implements e {
            public final NewsEntry b;

            public g0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class h implements e {
            public final NewsEntry b;
            public final int c;

            public h(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class h0 implements e {
            public final NewsEntry b;

            public h0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class i implements e {
            public final NewsEntry b;

            public i(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class i0 implements e {
            public final NewsEntry b;
            public final int c;

            public i0(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class j implements e {
            public final NewsEntry b;
            public final int c;

            public j(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class j0 implements e {
            public final NewsEntry b;

            public j0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class k implements e {
            public final NewsEntry b;

            public k(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class k0 implements e {
            public final NewsEntry b;

            public k0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class l implements e {
            public final NewsEntry b;

            public l(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class l0 implements e {
            public final NewsEntry b;
            public final int c;

            public l0(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class m implements e {
            public final NewsEntry b;
            public final int c;

            public m(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class m0 implements e {
            public final NewsEntry b;
            public final int c;

            public m0(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class n implements e {
            public final NewsEntry b;
            public final int c;

            public n(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class n0 implements e {
            public final NewsEntry b;
            public final NewsEntry c;

            public n0(NewsEntry newsEntry, NewsEntry newsEntry2) {
                this.b = newsEntry;
                this.c = newsEntry2;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class o implements e {
            public final NewsEntry b;

            public o(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class o0 implements e {
            public final NewsEntry b;

            public o0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class p implements e {
            public final NewsEntry b;
            public final int c;

            public p(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class p0 implements e {
            public final NewsEntry b;
            public final int c;

            public p0(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class q implements e {
            public final NewsEntry b;
            public final int c;

            public q(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class q0 implements e {
            public final NewsEntry b;

            public q0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class r implements e {
            public final NewsEntry b;

            public r(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class r0 implements e {
            public final NewsEntry b;

            public r0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class s implements e {
            public final NewsEntry b;

            public s(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class s0 implements e {
            public final NewsEntry b;

            public s0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class t implements e {
            public final NewsEntry b;
            public final int c;

            public t(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class t0 implements e {
            public final NewsEntry b;

            public t0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class u implements e {
            public final NewsEntry b;
            public final NewsEntry c;
            public final int d;

            public u(NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
                this.b = newsEntry;
                this.c = newsEntry2;
                this.d = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class u0 implements e {
            public final NewsEntry b;

            public u0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class v implements e {
            public final NewsEntry b;

            public v(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class v0 implements e {
            public final NewsEntry b;

            public v0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class w implements e {
            public final NewsEntry b;
            public final NewsEntry c;

            public w(NewsEntry newsEntry, NewsEntry newsEntry2) {
                this.b = newsEntry;
                this.c = newsEntry2;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class w0 implements e {
            public final NewsEntry b;

            public w0(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class x implements e {
            public final NewsEntry b;

            public x(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class x0 implements e {
            public final NewsEntry b;
            public final int c;

            public x0(int i, NewsEntry newsEntry) {
                this.b = newsEntry;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class y implements e {
            public final NewsEntry b;

            public y(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class z implements e {
            public final NewsEntry b;

            public z(NewsEntry newsEntry) {
                this.b = newsEntry;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }
    }

    /* compiled from: NewsfeedListTask.kt */
    public interface f extends ds60 {

        /* compiled from: NewsfeedListTask.kt */
        public static final class a implements f {
            public static final a b = new a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return qjf.b;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class b implements f {
            public static final b b = new b();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return rjf.b;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class c implements f {
            public static final c b = new c();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return sjf.b;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class d implements f {
            public static final d b = new d();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return tjf.b;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class e implements f {
            public static final e b = new e();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return ujf.b;
            }
        }
    }

    /* compiled from: NewsfeedListTask.kt */
    public interface g extends ds60 {

        /* compiled from: NewsfeedListTask.kt */
        public static final class a implements g {
            public final UserId b;

            public a(UserId userId) {
                this.b = userId;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }
    }

    /* compiled from: NewsfeedListTask.kt */
    public interface h extends ds60 {

        /* compiled from: NewsfeedListTask.kt */
        public static final class a implements h {
            public final UserId b;
            public final int c;

            public a(UserId userId, int i) {
                this.b = userId;
                this.c = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: NewsfeedListTask.kt */
        public static final class b implements h {
            public final UserId b;
            public final Image c;

            public b(UserId userId, Image image) {
                this.b = userId;
                this.c = image;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }
    }
}
