package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.a7f0;
import xsna.c2r;
import xsna.mke;
import xsna.q4r;
import xsna.qvq;
import xsna.t8e;
import xsna.uyq;
import xsna.wk50;

/* compiled from: FeedPtrActionDelegate.kt */
/* loaded from: classes17.dex */
public abstract class y2r implements oj50<q4r, qvq, c2r> {

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class a extends y2r {
        public final mke.b a;
        public final ClipFeedTab b;
        public final i4r c;
        public final f4z d;
        public final myc e;
        public final hlh0 f;

        public a(mke.b bVar, ClipFeedTab clipFeedTab, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = bVar;
            this.b = clipFeedTab;
            this.c = i4rVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.d;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.f;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            boolean z = this.b instanceof ClipFeedTab.CatalogClip.MusicTemplateCatalogClip;
            return b(this.c.g(this.a, PaginationKey.Initial.b, z), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class b extends y2r {
        public final mke.c a;
        public final i4r b;
        public final myc c;
        public final f4z d;
        public final hlh0 e;

        public b(mke.c cVar, i4r i4rVar, myc mycVar, f4z f4zVar, hlh0 hlh0Var) {
            this.a = cVar;
            this.b = i4rVar;
            this.c = mycVar;
            this.d = f4zVar;
            this.e = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.d;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.e;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.c;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.b.i(this.a.a, PaginationKey.Initial.b), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class c extends y2r {
        public final f4z a;
        public final myc b;
        public final hlh0 c;

        public c(f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = f4zVar;
            this.b = mycVar;
            this.c = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.a;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.c;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.b;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class d extends y2r {
        public final f4z a;
        public final myc b;
        public final hlh0 c;

        public d(f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = f4zVar;
            this.b = mycVar;
            this.c = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.a;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.c;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.b;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class e extends y2r {
        public final mke.h a;
        public final i4r b;
        public final f4z c;
        public final myc d;
        public final hlh0 e;

        public e(mke.h hVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = hVar;
            this.b = i4rVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.c;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.e;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.b.k(this.a, PaginationKey.Initial.b), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static abstract class f extends y2r {

        /* compiled from: FeedPtrActionDelegate.kt */
        public static final class a extends f {
            public final mke.a a;
            public final i4r b;
            public final f4z c;
            public final myc d;
            public final hlh0 e;

            public a(mke.a aVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
                this.a = aVar;
                this.b = i4rVar;
                this.c = f4zVar;
                this.d = mycVar;
                this.e = hlh0Var;
            }

            @Override // xsna.y2r
            public final wj50<uyq> c() {
                return this.c;
            }

            @Override // xsna.y2r
            public final hlh0 d() {
                return this.e;
            }

            @Override // xsna.y2r
            public final myc e() {
                return this.d;
            }

            @Override // xsna.y2r.f
            public final mke h() {
                return this.a;
            }

            @Override // xsna.y2r.f
            public final t8e i() {
                return this.b;
            }
        }

        /* compiled from: FeedPtrActionDelegate.kt */
        public static final class b extends f {
            public final mke.d a;
            public final i4r b;
            public final f4z c;
            public final myc d;
            public final hlh0 e;

            public b(mke.d dVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
                this.a = dVar;
                this.b = i4rVar;
                this.c = f4zVar;
                this.d = mycVar;
                this.e = hlh0Var;
            }

            @Override // xsna.y2r
            public final wj50<uyq> c() {
                return this.c;
            }

            @Override // xsna.y2r
            public final hlh0 d() {
                return this.e;
            }

            @Override // xsna.y2r
            public final myc e() {
                return this.d;
            }

            @Override // xsna.y2r.f
            public final mke h() {
                return this.a;
            }

            @Override // xsna.y2r.f
            public final t8e i() {
                return this.b;
            }
        }

        /* compiled from: FeedPtrActionDelegate.kt */
        public static final class c extends f {
            public final mke.i a;
            public final i4r b;
            public final f4z c;
            public final myc d;
            public final hlh0 e;

            public c(mke.i iVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
                this.a = iVar;
                this.b = i4rVar;
                this.c = f4zVar;
                this.d = mycVar;
                this.e = hlh0Var;
            }

            @Override // xsna.y2r
            public final wj50<uyq> c() {
                return this.c;
            }

            @Override // xsna.y2r
            public final hlh0 d() {
                return this.e;
            }

            @Override // xsna.y2r
            public final myc e() {
                return this.d;
            }

            @Override // xsna.y2r.f
            public final mke h() {
                return this.a;
            }

            @Override // xsna.y2r.f
            public final t8e i() {
                return this.b;
            }
        }

        /* compiled from: FeedPtrActionDelegate.kt */
        public static final class d extends f {
            public final mke.j a;
            public final i4r b;
            public final f4z c;
            public final myc d;
            public final hlh0 e;

            public d(mke.j jVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
                this.a = jVar;
                this.b = i4rVar;
                this.c = f4zVar;
                this.d = mycVar;
                this.e = hlh0Var;
            }

            @Override // xsna.y2r
            public final wj50<uyq> c() {
                return this.c;
            }

            @Override // xsna.y2r
            public final hlh0 d() {
                return this.e;
            }

            @Override // xsna.y2r
            public final myc e() {
                return this.d;
            }

            @Override // xsna.y2r.f
            public final mke h() {
                return this.a;
            }

            @Override // xsna.y2r.f
            public final t8e i() {
                return this.b;
            }
        }

        /* compiled from: FeedPtrActionDelegate.kt */
        public static final class e extends f {
            public final mke.m a;
            public final i4r b;
            public final f4z c;
            public final myc d;
            public final hlh0 e;

            public e(mke.m mVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
                this.a = mVar;
                this.b = i4rVar;
                this.c = f4zVar;
                this.d = mycVar;
                this.e = hlh0Var;
            }

            @Override // xsna.y2r
            public final wj50<uyq> c() {
                return this.c;
            }

            @Override // xsna.y2r
            public final hlh0 d() {
                return this.e;
            }

            @Override // xsna.y2r
            public final myc e() {
                return this.d;
            }

            @Override // xsna.y2r.f
            public final mke h() {
                return this.a;
            }

            @Override // xsna.y2r.f
            public final t8e i() {
                return this.b;
            }
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(i().a(h(), PaginationKey.Initial.b), aVar, null);
        }

        public abstract mke h();

        public abstract t8e i();
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class g extends y2r {
        public final i4r a;
        public final f4z b;
        public final myc c;
        public final hlh0 d;

        public g(i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = i4rVar;
            this.b = f4zVar;
            this.c = mycVar;
            this.d = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.b;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.d;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.c;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.a.l(PaginationKey.Initial.b), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class h extends y2r {
        public final i4r a;
        public final f4z b;
        public final myc c;
        public final hlh0 d;

        public h(i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = i4rVar;
            this.b = f4zVar;
            this.c = mycVar;
            this.d = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.b;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.d;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.c;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.a.m(PaginationKey.Initial.b), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class i extends y2r {
        public final mke.n a;
        public final i4r b;
        public final f4z c;
        public final myc d;
        public final hlh0 e;

        public i(mke.n nVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = nVar;
            this.b = i4rVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.c;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.e;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.b.n(this.a, PaginationKey.Initial.b), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class j extends y2r {
        public final mke.o a;
        public final i4r b;
        public final f4z c;
        public final myc d;
        public final hlh0 e;

        public j(mke.o oVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = oVar;
            this.b = i4rVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.c;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.e;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.b.o(this.a), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class k extends y2r {
        public final i4r a;
        public final gbq b;
        public final f4z c;
        public final myc d;
        public final hlh0 e;

        public k(mke.p pVar, i4r i4rVar, gbq gbqVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = i4rVar;
            this.b = gbqVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.c;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.e;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            io.reactivex.rxjava3.internal.operators.single.y q = this.a.q(PaginationKey.Initial.b);
            gbq gbqVar = this.b;
            return b(q, aVar, gbqVar != null ? new z2r(2, gbqVar, gbq.class, "extendFeedItemsWithBlocks", "extendFeedItemsWithBlocks(Lcom/vk/clips/sdk/shared/api/feed/data/SdkClipListResponse;Ljava/util/List;)Ljava/util/List;", 0) : null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class l extends y2r {
        public final mke.q a;
        public final i4r b;
        public final f4z c;
        public final myc d;
        public final hlh0 e;

        public l(mke.q qVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = qVar;
            this.b = i4rVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.c;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.e;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.b.d(this.a, PaginationKey.Initial.b), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class m extends y2r {
        public final mke.r a;
        public final i4r b;
        public final f4z c;
        public final myc d;
        public final hlh0 e;

        public m(mke.r rVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = rVar;
            this.b = i4rVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.c;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.e;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.b.r(this.a, true, PaginationKey.Initial.b), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class n extends y2r {
        public final mke.s a;
        public final i4r b;
        public final f4z c;
        public final myc d;
        public final hlh0 e;

        public n(mke.s sVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = sVar;
            this.b = i4rVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.c;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.e;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.b.s(this.a, PaginationKey.Initial.b), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class o extends y2r {
        public final mke.t a;
        public final i4r b;
        public final f4z c;
        public final myc d;
        public final hlh0 e;

        public o(mke.t tVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = tVar;
            this.b = i4rVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.c;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.e;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.b.t(this.a, PaginationKey.Initial.b), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class p extends y2r {
        public final mke.u a;
        public final i4r b;
        public final f4z c;
        public final myc d;
        public final hlh0 e;

        public p(mke.u uVar, i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = uVar;
            this.b = i4rVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.c;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.e;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.b.u(this.a, PaginationKey.Initial.b), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class q extends y2r {
        public final f4z a;
        public final myc b;
        public final hlh0 c;

        public q(f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = f4zVar;
            this.b = mycVar;
            this.c = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.a;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.c;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.b;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class r extends y2r {
        public final i4r a;
        public final f4z b;
        public final myc c;
        public final hlh0 d;

        public r(i4r i4rVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = i4rVar;
            this.b = f4zVar;
            this.c = mycVar;
            this.d = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.b;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.d;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.c;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return b(this.a.p(PaginationKey.Initial.b), aVar, null);
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class s extends y2r {
        public final mke.x a;
        public final i4r b;
        public final gbq c;
        public final f4z d;
        public final myc e;
        public final hlh0 f;

        public s(mke.x xVar, i4r i4rVar, gbq gbqVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = xVar;
            this.b = i4rVar;
            this.c = gbqVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.d;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.f;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(t8e.a.a(this.b, this.a), new hv(new cq3(10, this, aVar), 21)));
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class t extends y2r {
        public final mke.y a;
        public final i4r b;
        public final gbq c;
        public final f4z d;
        public final myc e;
        public final hlh0 f;

        public t(mke.y yVar, i4r i4rVar, gbq gbqVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = yVar;
            this.b = i4rVar;
            this.c = gbqVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.d;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.f;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(t8e.a.b(this.b, this.a, null, 6), new jv(new ku1(12, this, aVar), 20)));
        }
    }

    /* compiled from: FeedPtrActionDelegate.kt */
    public static final class u extends y2r {
        public final mke.z a;
        public final i4r b;
        public final gbq c;
        public final f4z d;
        public final myc e;
        public final hlh0 f;

        public u(mke.z zVar, i4r i4rVar, gbq gbqVar, f4z f4zVar, myc mycVar, hlh0 hlh0Var) {
            this.a = zVar;
            this.b = i4rVar;
            this.c = gbqVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = hlh0Var;
        }

        @Override // xsna.y2r
        public final wj50<uyq> c() {
            return this.d;
        }

        @Override // xsna.y2r
        public final hlh0 d() {
            return this.f;
        }

        @Override // xsna.y2r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.y2r
        public final io.reactivex.rxjava3.core.a g(wk50.a aVar) {
            io.reactivex.rxjava3.internal.operators.single.y x = this.b.x(this.a, PaginationKey.Initial.b);
            gbq gbqVar = this.c;
            return b(x, aVar, gbqVar != null ? new c3r(2, gbqVar, gbq.class, "extendFeedItemsWithBlocks", "extendFeedItemsWithBlocks(Lcom/vk/clips/sdk/shared/api/feed/data/SdkClipListResponse;Ljava/util/List;)Ljava/util/List;", 0) : null);
        }
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        q4r q4rVar = (q4r) km50Var;
        if (((qvq) kj50Var) instanceof qvq.n) {
            if (q4rVar instanceof q4r.b) {
                aVar.a(qvq.f.a.b);
            } else if (q4rVar instanceof q4r.a) {
                aVar.b(c2r.h.c.b);
                aVar.a(qvq.t.b);
                a7f0.a.d(aVar, g(aVar), null, new lh(12, this, aVar), null, 5);
            }
        }
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p b(io.reactivex.rxjava3.core.x xVar, nj50 nj50Var, wzs wzsVar) {
        defpackage.d dVar = new defpackage.d(new bwg(this, nj50Var, wzsVar, 1), 27);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(xVar, dVar));
    }

    public abstract wj50<uyq> c();

    public abstract hlh0 d();

    public abstract myc e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    public final void f(nj50<? super qvq, ? super c2r> nj50Var, qih0 qih0Var, wzs<? super qih0, ? super List<? extends FeedItem>, ? extends List<? extends FeedItem>> wzsVar) {
        ?? r8;
        ArrayList f2 = e().f(qih0Var.a);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = f2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((FeedItem) next).F())) {
                arrayList.add(next);
            }
        }
        if (wzsVar != null && (r8 = (List) wzsVar.invoke(qih0Var, arrayList)) != 0) {
            arrayList = r8;
        }
        PaginationKey paginationKey = qih0Var.e;
        nj50Var.b(c2r.h.b.b);
        nj50Var.b(new c2r.h.d(arrayList, paginationKey, null, qih0Var.h));
        c().b(uyq.f.a);
    }

    public abstract io.reactivex.rxjava3.core.a g(wk50.a aVar);

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
