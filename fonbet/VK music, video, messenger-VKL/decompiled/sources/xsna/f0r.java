package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationPaginationKey;
import com.vk.clips.sdk.shared.feed.controller.mvi.model.NoDecoration;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.c2r;
import xsna.mke;
import xsna.q9d;
import xsna.qvq;
import xsna.s4r;
import xsna.t8e;
import xsna.ubx;
import xsna.uyq;
import xsna.wk50;

/* compiled from: FeedInitActionDelegate.kt */
/* loaded from: classes17.dex */
public abstract class f0r implements oj50<q4r, qvq, c2r> {

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class a extends f0r {
        public final kaf a = kaf.a;
        public final mke.b b;
        public final ClipFeedTab c;
        public final i4r d;
        public final f4z e;
        public final myc f;
        public final okh0 g;

        public a(mke.b bVar, ClipFeedTab clipFeedTab, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = bVar;
            this.c = clipFeedTab;
            this.d = i4rVar;
            this.e = f4zVar;
            this.f = mycVar;
            this.g = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.d;
            io.reactivex.rxjava3.internal.operators.maybe.u l = l(aVar, i4rVar);
            boolean z = this.c instanceof ClipFeedTab.CatalogClip.MusicTemplateCatalogClip;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l, f0r.c(this, i4rVar.g(this.b, PaginationKey.Initial.b, z), aVar, null, 6)), null, new defpackage.h0(14, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.e;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.f;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.g;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class b extends f0r {
        public final kaf a = kaf.a;
        public final ClipFeedTab b;
        public final i4r c;
        public final f4z d;
        public final myc e;
        public final okh0 f;
        public final com.vk.im.ui.components.viewcontrollers.dialog_header.info.a g;

        public b(ClipFeedTab clipFeedTab, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var, com.vk.im.ui.components.viewcontrollers.dialog_header.info.a aVar) {
            this.b = clipFeedTab;
            this.c = i4rVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = okh0Var;
            this.g = aVar;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            io.reactivex.rxjava3.core.x j;
            io.reactivex.rxjava3.core.x j2;
            ClipFeedTab clipFeedTab = this.b;
            if ((clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) && (fVar instanceof qvq.f.d)) {
                qvq.f.d dVar = (qvq.f.d) fVar;
                PaginationKey paginationKey = dVar.e;
                PaginationKey.NextPageWithDecoration nextPageWithDecoration = paginationKey instanceof PaginationKey.NextPageWithDecoration ? (PaginationKey.NextPageWithDecoration) paginationKey : null;
                PaginationKey paginationKey2 = dVar.f;
                PaginationKey.NextPageWithDecoration nextPageWithDecoration2 = paginationKey2 instanceof PaginationKey.NextPageWithDecoration ? (PaginationKey.NextPageWithDecoration) paginationKey2 : null;
                ClipFeedTab.SingleClipWithDecoration singleClipWithDecoration = (ClipFeedTab.SingleClipWithDecoration) clipFeedTab;
                SdkVideoFile sdkVideoFile = singleClipWithDecoration.b;
                Object obj = singleClipWithDecoration.f;
                if (obj == null) {
                    obj = NoDecoration.b;
                }
                io.reactivex.rxjava3.internal.operators.single.x k = io.reactivex.rxjava3.core.x.k(new Pair(sdkVideoFile, obj));
                ClipsDecorationPaginationKey clipsDecorationPaginationKey = nextPageWithDecoration != null ? nextPageWithDecoration.b : null;
                i4r i4rVar = this.c;
                if (clipsDecorationPaginationKey == null) {
                    EmptyList emptyList = EmptyList.b;
                    PaginationKey.LoadedFull loadedFull = PaginationKey.LoadedFull.b;
                    j = io.reactivex.rxjava3.core.x.k(new bpd(emptyList, loadedFull, loadedFull));
                } else {
                    j = i4rVar.j(clipsDecorationPaginationKey, true);
                }
                ClipsDecorationPaginationKey clipsDecorationPaginationKey2 = nextPageWithDecoration2 != null ? nextPageWithDecoration2.b : null;
                if (clipsDecorationPaginationKey2 == null) {
                    EmptyList emptyList2 = EmptyList.b;
                    PaginationKey.LoadedFull loadedFull2 = PaginationKey.LoadedFull.b;
                    j2 = io.reactivex.rxjava3.core.x.k(new bpd(emptyList2, loadedFull2, loadedFull2));
                } else {
                    j2 = i4rVar.j(clipsDecorationPaginationKey2, false);
                }
                a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.single.o(io.reactivex.rxjava3.core.x.A(k, j, j2, new q9(new hx9(this, 1), 9)), new wn(new mh4(12, this, aVar), 28)), null, new g6(13, this, aVar), 3);
            }
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.d;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.f;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class c extends f0r {
        public final mke.f a;
        public final i4r b;
        public final kaf c = kaf.a;
        public final f4z d;
        public final myc e;
        public final okh0 f;

        public c(mke.f fVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.a = fVar;
            this.b = i4rVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            mke.f fVar2 = this.a;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.single.o(t8e.a.b(this.b, new mke.y(fVar2.a, fVar2.b, fVar2.c, 4), PaginationKey.Initial.b, 4), new js1(new z5a(9, this, aVar), 29)), null, new fo6(12, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.d;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.f;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.c;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class d extends f0r {
        public final kaf a = kaf.a;
        public final mke.c b;
        public final i4r c;
        public final f4z d;
        public final myc e;
        public final okh0 f;

        public d(mke.c cVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = cVar;
            this.c = i4rVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            a7f0.a.f(aVar, f0r.c(this, this.c.i(this.b.a, PaginationKey.Initial.b), aVar, null, 6), null, new d05(19, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.d;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.f;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class e extends f0r {
        public final kaf a = kaf.a;
        public final mke.h b;
        public final i4r c;
        public final okh0 d;
        public final f4z e;
        public final myc f;

        public e(mke.h hVar, i4r i4rVar, okh0 okh0Var, f4z f4zVar, myc mycVar) {
            this.b = hVar;
            this.c = i4rVar;
            this.d = okh0Var;
            this.e = f4zVar;
            this.f = mycVar;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.c;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l(aVar, i4rVar), f0r.c(this, i4rVar.k(this.b, PaginationKey.Initial.b), aVar, null, 6)), null, new he3(23, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.e;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.f;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.d;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static abstract class f extends f0r {

        /* compiled from: FeedInitActionDelegate.kt */
        public static final class a extends f {
            public final kaf a = kaf.a;
            public final mke.a b;
            public final i4r c;
            public final f4z d;
            public final myc e;
            public final okh0 f;

            public a(mke.a aVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
                this.b = aVar;
                this.c = i4rVar;
                this.d = f4zVar;
                this.e = mycVar;
                this.f = okh0Var;
            }

            @Override // xsna.f0r
            public final wj50<uyq> d() {
                return this.d;
            }

            @Override // xsna.f0r
            public final myc e() {
                return this.e;
            }

            @Override // xsna.f0r
            public final okh0 f() {
                return this.f;
            }

            @Override // xsna.f0r
            public final hlh0 g() {
                return this.a;
            }

            @Override // xsna.f0r.f
            public final mke m() {
                return this.b;
            }

            @Override // xsna.f0r.f
            public final t8e n() {
                return this.c;
            }
        }

        /* compiled from: FeedInitActionDelegate.kt */
        public static final class b extends f {
            public final kaf a = kaf.a;
            public final mke.d b;
            public final i4r c;
            public final f4z d;
            public final myc e;
            public final okh0 f;

            public b(mke.d dVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
                this.b = dVar;
                this.c = i4rVar;
                this.d = f4zVar;
                this.e = mycVar;
                this.f = okh0Var;
            }

            @Override // xsna.f0r
            public final wj50<uyq> d() {
                return this.d;
            }

            @Override // xsna.f0r
            public final myc e() {
                return this.e;
            }

            @Override // xsna.f0r
            public final okh0 f() {
                return this.f;
            }

            @Override // xsna.f0r
            public final hlh0 g() {
                return this.a;
            }

            @Override // xsna.f0r.f
            public final mke m() {
                return this.b;
            }

            @Override // xsna.f0r.f
            public final t8e n() {
                return this.c;
            }
        }

        /* compiled from: FeedInitActionDelegate.kt */
        public static final class c extends f {
            public final kaf a = kaf.a;
            public final mke.i b;
            public final i4r c;
            public final f4z d;
            public final myc e;
            public final okh0 f;

            public c(mke.i iVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
                this.b = iVar;
                this.c = i4rVar;
                this.d = f4zVar;
                this.e = mycVar;
                this.f = okh0Var;
            }

            @Override // xsna.f0r
            public final wj50<uyq> d() {
                return this.d;
            }

            @Override // xsna.f0r
            public final myc e() {
                return this.e;
            }

            @Override // xsna.f0r
            public final okh0 f() {
                return this.f;
            }

            @Override // xsna.f0r
            public final hlh0 g() {
                return this.a;
            }

            @Override // xsna.f0r.f
            public final mke m() {
                return this.b;
            }

            @Override // xsna.f0r.f
            public final t8e n() {
                return this.c;
            }
        }

        /* compiled from: FeedInitActionDelegate.kt */
        public static final class d extends f {
            public final kaf a = kaf.a;
            public final mke.j b;
            public final i4r c;
            public final f4z d;
            public final myc e;
            public final okh0 f;

            public d(mke.j jVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
                this.b = jVar;
                this.c = i4rVar;
                this.d = f4zVar;
                this.e = mycVar;
                this.f = okh0Var;
            }

            @Override // xsna.f0r
            public final wj50<uyq> d() {
                return this.d;
            }

            @Override // xsna.f0r
            public final myc e() {
                return this.e;
            }

            @Override // xsna.f0r
            public final okh0 f() {
                return this.f;
            }

            @Override // xsna.f0r
            public final hlh0 g() {
                return this.a;
            }

            @Override // xsna.f0r.f
            public final mke m() {
                return this.b;
            }

            @Override // xsna.f0r.f
            public final t8e n() {
                return this.c;
            }
        }

        /* compiled from: FeedInitActionDelegate.kt */
        public static final class e extends f {
            public final kaf a = kaf.a;
            public final mke.m b;
            public final i4r c;
            public final f4z d;
            public final myc e;
            public final okh0 f;

            public e(mke.m mVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
                this.b = mVar;
                this.c = i4rVar;
                this.d = f4zVar;
                this.e = mycVar;
                this.f = okh0Var;
            }

            @Override // xsna.f0r
            public final wj50<uyq> d() {
                return this.d;
            }

            @Override // xsna.f0r
            public final myc e() {
                return this.e;
            }

            @Override // xsna.f0r
            public final okh0 f() {
                return this.f;
            }

            @Override // xsna.f0r
            public final hlh0 g() {
                return this.a;
            }

            @Override // xsna.f0r.f
            public final mke m() {
                return this.b;
            }

            @Override // xsna.f0r.f
            public final t8e n() {
                return this.c;
            }
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l(aVar, n()), f0r.c(this, n().a(m(), PaginationKey.Initial.b), aVar, null, 6)), null, new bp7(11, this, aVar), 3);
        }

        public abstract mke m();

        public abstract t8e n();
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class g extends f0r {
        public final kaf a = kaf.a;
        public final i4r b;
        public final f4z c;
        public final myc d;
        public final okh0 e;

        public g(i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = i4rVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.b;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l(aVar, i4rVar), f0r.c(this, i4rVar.l(PaginationKey.Initial.b), aVar, null, 6)), null, new jp5(11, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.c;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.e;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class h extends f0r {
        public final kaf a = kaf.a;
        public final i4r b;
        public final f4z c;
        public final myc d;
        public final okh0 e;

        public h(i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = i4rVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.b;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l(aVar, i4rVar), f0r.c(this, i4rVar.m(PaginationKey.Initial.b), aVar, null, 6)), null, new b1a(17, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.c;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.e;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class i extends f0r {
        public final kaf a = kaf.a;
        public final mke.n b;
        public final i4r c;
        public final f4z d;
        public final myc e;
        public final okh0 f;

        public i(mke.n nVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = nVar;
            this.c = i4rVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.c;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l(aVar, i4rVar), f0r.c(this, i4rVar.n(this.b, PaginationKey.Initial.b), aVar, null, 6)), null, new h57(10, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.d;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.f;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class j extends f0r {
        public final kaf a = kaf.a;
        public final mke.o b;
        public final i4r c;
        public final f4z d;
        public final myc e;
        public final okh0 f;

        public j(mke.o oVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = oVar;
            this.c = i4rVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.c;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l(aVar, i4rVar), f0r.c(this, i4rVar.o(this.b), aVar, null, 6)), null, new na7(16, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.d;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.f;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class k extends f0r {
        public final kaf a = kaf.a;
        public final i4r b;
        public final gbq c;
        public final f4z d;
        public final myc e;
        public final okh0 f;

        public k(mke.p pVar, i4r i4rVar, gbq gbqVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = i4rVar;
            this.c = gbqVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.b;
            io.reactivex.rxjava3.internal.operators.maybe.u l = l(aVar, i4rVar);
            io.reactivex.rxjava3.internal.operators.single.y q = i4rVar.q(PaginationKey.Initial.b);
            gbq gbqVar = this.c;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l, f0r.c(this, q, aVar, gbqVar != null ? new g0r(2, gbqVar, gbq.class, "extendFeedItemsWithBlocks", "extendFeedItemsWithBlocks(Lcom/vk/clips/sdk/shared/api/feed/data/SdkClipListResponse;Ljava/util/List;)Ljava/util/List;", 0) : null, 4)), null, new u6(19, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.d;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.f;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class l extends f0r {
        public final kaf a = kaf.a;
        public final mke.q b;
        public final ClipFeedTab c;
        public final i4r d;
        public final f4z e;
        public final myc f;
        public final okh0 g;

        public l(mke.q qVar, ClipFeedTab clipFeedTab, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = qVar;
            this.c = clipFeedTab;
            this.d = i4rVar;
            this.e = f4zVar;
            this.f = mycVar;
            this.g = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            io.reactivex.rxjava3.core.k kVar;
            SdkVideoFile sdkVideoFile;
            ClipFeedTab clipFeedTab = this.c;
            ClipFeedTab.NewsMonotheme newsMonotheme = clipFeedTab instanceof ClipFeedTab.NewsMonotheme ? (ClipFeedTab.NewsMonotheme) clipFeedTab : null;
            if (newsMonotheme == null || (sdkVideoFile = newsMonotheme.d) == null) {
                kVar = io.reactivex.rxjava3.internal.operators.maybe.i.b;
            } else {
                io.reactivex.rxjava3.internal.operators.maybe.t i = io.reactivex.rxjava3.core.k.i(sdkVideoFile);
                ga gaVar = new ga(new kp5(12, this, aVar), 28);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar2 = io.reactivex.rxjava3.internal.functions.a.c;
                kVar = new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.b0(i, lVar, gaVar, lVar, kVar2, kVar2), new rf3(new com.vk.movika.sdk.base.logic.interactor.f(24), 11));
            }
            io.reactivex.rxjava3.internal.operators.single.y c = f0r.c(this, this.d.d(this.b, PaginationKey.Initial.b), aVar, null, 6);
            kVar.getClass();
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(kVar, c), null, new d50(16, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.e;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.f;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.g;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class m {
        public final PaginationKey a;
        public final PaginationKey b;

        public m(PaginationKey paginationKey, PaginationKey paginationKey2) {
            this.a = paginationKey;
            this.b = paginationKey2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.a, mVar.a) && epx.f(this.b, mVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PaginationKeys(backward=" + this.a + ", forward=" + this.b + ')';
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class n extends f0r {
        public final kaf a = kaf.a;
        public final ClipFeedTab.Playlist b;
        public final mke.r c;
        public final i4r d;
        public final f4z e;
        public final myc f;
        public final okh0 g;

        public n(ClipFeedTab.Playlist playlist, mke.r rVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = playlist;
            this.c = rVar;
            this.d = i4rVar;
            this.e = f4zVar;
            this.f = mycVar;
            this.g = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            io.reactivex.rxjava3.internal.operators.single.y c;
            mke.r rVar = this.c;
            boolean z = rVar instanceof mke.r.b;
            i4r i4rVar = this.d;
            if (z) {
                mke.r.b bVar = (mke.r.b) rVar;
                int i = i4rVar.f.g0().a / 2;
                c = new io.reactivex.rxjava3.internal.operators.single.o(io.reactivex.rxjava3.core.x.B(new q9d.a(bVar, i, false).b(), new q9d.a(bVar, i, true).b(), new rt0(new f21(3), 13)), new mf1(new v63(this, aVar, bVar, 9), 24)).l(new t11(new ci3(28), 17));
            } else {
                if (!(rVar instanceof mke.r.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c = f0r.c(this, new io.reactivex.rxjava3.internal.operators.single.o(i4rVar.r(rVar, true, PaginationKey.Initial.b), new l50(new nfj(this, 18), 24)), aVar, null, 6);
            }
            a7f0.a.f(aVar, c, null, new yl0(9, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.e;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.f;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.g;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class o extends f0r {
        public final kaf a = kaf.a;
        public final mke.s b;
        public final i4r c;
        public final f4z d;
        public final myc e;
        public final okh0 f;

        public o(mke.s sVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = sVar;
            this.c = i4rVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.c;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l(aVar, i4rVar), f0r.c(this, i4rVar.s(this.b, PaginationKey.Initial.b), aVar, null, 6)), null, new mp3(12, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.d;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.f;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class p extends f0r {
        public final kaf a = kaf.a;
        public final mke.t b;
        public final i4r c;
        public final f4z d;
        public final myc e;
        public final okh0 f;

        public p(mke.t tVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = tVar;
            this.c = i4rVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.c;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l(aVar, i4rVar), f0r.c(this, i4rVar.t(this.b, PaginationKey.Initial.b), aVar, null, 6)), null, new g84(15, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.d;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.f;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class q extends f0r {
        public final kaf a = kaf.a;
        public final mke.u b;
        public final i4r c;
        public final f4z d;
        public final myc e;
        public final okh0 f;

        public q(mke.u uVar, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = uVar;
            this.c = i4rVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.c;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l(aVar, i4rVar), f0r.c(this, i4rVar.u(this.b, PaginationKey.Initial.b), aVar, null, 6)), null, new ng3(17, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.d;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.f;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class r extends f0r {
        public final kaf a = kaf.a;
        public final ClipFeedTab b;
        public final i4r c;
        public final f4z d;
        public final myc e;
        public final okh0 f;

        public r(ClipFeedTab clipFeedTab, i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = clipFeedTab;
            this.c = i4rVar;
            this.d = f4zVar;
            this.e = mycVar;
            this.f = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            io.reactivex.rxjava3.core.k kVar;
            io.reactivex.rxjava3.internal.operators.maybe.u l = l(aVar, this.c);
            ClipFeedTab clipFeedTab = this.b;
            if (clipFeedTab instanceof ClipFeedTab.SingleAdv) {
                ClipFeedTab.SingleAdv singleAdv = (ClipFeedTab.SingleAdv) clipFeedTab;
                kVar = io.reactivex.rxjava3.core.k.i(new Pair(singleAdv.b, singleAdv.c));
            } else {
                kVar = io.reactivex.rxjava3.internal.operators.maybe.i.b;
            }
            io.reactivex.rxjava3.core.k kVar2 = kVar;
            kl6 kl6Var = new kl6(new az2(13, this, aVar), 17);
            kVar2.getClass();
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar3 = io.reactivex.rxjava3.internal.functions.a.c;
            a7f0.a.g(aVar, new io.reactivex.rxjava3.internal.operators.maybe.d0(l, new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.b0(kVar2, lVar, kl6Var, lVar, kVar3, kVar3), new eq0(new x50(15), 12))), null, new com.vk.movika.sdk.base.logic.processor.d(15, this, aVar), null, 11);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.d;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.e;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.f;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class s extends f0r {
        public final kaf a = kaf.a;
        public final i4r b;
        public final f4z c;
        public final myc d;
        public final okh0 e;

        public s(i4r i4rVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = i4rVar;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.b;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l(aVar, i4rVar), f0r.c(this, i4rVar.p(PaginationKey.Initial.b), aVar, null, 6)), null, new com.vk.im.engine.commands.messages.a(19, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.c;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.e;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class t extends f0r {
        public final kaf a = kaf.a;
        public final mke.x b;
        public final i4r c;
        public final gbq d;
        public final f4z e;
        public final myc f;
        public final okh0 g;

        public t(mke.x xVar, i4r i4rVar, gbq gbqVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = xVar;
            this.c = i4rVar;
            this.d = gbqVar;
            this.e = f4zVar;
            this.f = mycVar;
            this.g = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            i4r i4rVar = this.c;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(l(aVar, i4rVar), new io.reactivex.rxjava3.internal.operators.single.o(t8e.a.a(i4rVar, this.b), new m20(new aq1(10, this, aVar), 21)).l(new vp(new jt(23), 17))), null, new j20(13, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.e;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.f;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.g;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class u extends f0r {
        public final kaf a = kaf.a;
        public final mke.y b;
        public final ClipFeedTab c;
        public final i4r d;
        public final gbq e;
        public final f4z f;
        public final myc g;
        public final okh0 h;

        public u(mke.y yVar, ClipFeedTab clipFeedTab, i4r i4rVar, gbq gbqVar, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = yVar;
            this.c = clipFeedTab;
            this.d = i4rVar;
            this.e = gbqVar;
            this.f = f4zVar;
            this.g = mycVar;
            this.h = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            io.reactivex.rxjava3.core.k kVar;
            io.reactivex.rxjava3.core.k uVar;
            ClipFeedTab clipFeedTab = this.c;
            boolean z = clipFeedTab instanceof ClipFeedTab.SingleAdv;
            i4r i4rVar = this.d;
            if (z) {
                kVar = io.reactivex.rxjava3.core.k.i(new Pair(((ClipFeedTab.SingleAdv) clipFeedTab).b, PaginationKey.LoadedFull.b));
            } else if (clipFeedTab instanceof ClipFeedTab.SingleClip) {
                kVar = io.reactivex.rxjava3.core.k.i(new Pair(((ClipFeedTab.SingleClip) clipFeedTab).b, PaginationKey.Initial.b));
            } else if (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) {
                kVar = io.reactivex.rxjava3.core.k.i(new Pair(((ClipFeedTab.NewsfeedDiscoverMedia) clipFeedTab).b, PaginationKey.Initial.b));
            } else if (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource.WithVideo) {
                kVar = io.reactivex.rxjava3.core.k.i(new Pair(((ClipFeedTab.ClipsFromShopsSource.WithVideo) clipFeedTab).c, PaginationKey.Initial.b));
            } else {
                if (clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) {
                    ClipFeedTab.SingleClipByVideoId singleClipByVideoId = (ClipFeedTab.SingleClipByVideoId) clipFeedTab;
                    int i = singleClipByVideoId.b;
                    UserId userId = singleClipByVideoId.c;
                    i4rVar.getClass();
                    uVar = new io.reactivex.rxjava3.internal.operators.maybe.u(i4rVar.w(r11.b(new StringBuilder(), userId.b, '_', i)).v(), new v20(new j0r(0), 21));
                    eu0 eu0Var = new eu0(new l0r(this, aVar), 24);
                    uVar.getClass();
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar2 = io.reactivex.rxjava3.internal.functions.a.c;
                    a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.b0(uVar, lVar, eu0Var, lVar, kVar2, kVar2), new fq(13)), new io.reactivex.rxjava3.internal.operators.single.o(t8e.a.b(i4rVar, this.b, null, 6), new tf1(new ab(12, this, aVar), 21)).l(new eq(new i0r(0), 13))), null, new by5(13, this, aVar), 3);
                }
                kVar = io.reactivex.rxjava3.internal.operators.maybe.i.b;
            }
            uVar = kVar;
            eu0 eu0Var2 = new eu0(new l0r(this, aVar), 24);
            uVar.getClass();
            a.l lVar2 = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar22 = io.reactivex.rxjava3.internal.functions.a.c;
            a7f0.a.f(aVar, new io.reactivex.rxjava3.internal.operators.maybe.e0(new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.b0(uVar, lVar2, eu0Var2, lVar2, kVar22, kVar22), new fq(13)), new io.reactivex.rxjava3.internal.operators.single.o(t8e.a.b(i4rVar, this.b, null, 6), new tf1(new ab(12, this, aVar), 21)).l(new eq(new i0r(0), 13))), null, new by5(13, this, aVar), 3);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.f;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.g;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.h;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    /* compiled from: FeedInitActionDelegate.kt */
    public static final class v extends f0r {
        public final kaf a = kaf.a;
        public final ClipFeedTab.SingleClipFromBlock b;
        public final f4z c;
        public final myc d;
        public final okh0 e;

        public v(ClipFeedTab.SingleClipFromBlock singleClipFromBlock, f4z f4zVar, myc mycVar, okh0 okh0Var) {
            this.b = singleClipFromBlock;
            this.c = f4zVar;
            this.d = mycVar;
            this.e = okh0Var;
        }

        @Override // xsna.f0r
        public final void b(wk50.a aVar, qvq.f fVar) {
            a7f0.a.g(aVar, new io.reactivex.rxjava3.internal.operators.maybe.p(new uhc(1, this, aVar)), null, new nv2(17, this, aVar), null, 11);
        }

        @Override // xsna.f0r
        public final wj50<uyq> d() {
            return this.c;
        }

        @Override // xsna.f0r
        public final myc e() {
            return this.d;
        }

        @Override // xsna.f0r
        public final okh0 f() {
            return this.e;
        }

        @Override // xsna.f0r
        public final hlh0 g() {
            return this.a;
        }
    }

    public static io.reactivex.rxjava3.internal.operators.single.y c(f0r f0rVar, io.reactivex.rxjava3.core.x xVar, nj50 nj50Var, g0r g0rVar, int i2) {
        if ((i2 & 2) != 0) {
            g0rVar = null;
        }
        f0rVar.getClass();
        k41 k41Var = new k41(new ed5(f0rVar, nj50Var, g0rVar, 1), 18);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.o(xVar, k41Var).l(new jr(new wr0(16)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(f0r f0rVar, nj50 nj50Var, qih0 qih0Var, wzs wzsVar, String str, int i2) {
        if ((i2 & 2) != 0) {
            wzsVar = null;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        f0rVar.j(nj50Var, qih0Var, wzsVar, str);
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        qvq qvqVar = (qvq) kj50Var;
        if (qvqVar instanceof qvq.f) {
            f().d();
            qvq.f fVar = (qvq.f) qvqVar;
            if (fVar instanceof qvq.f.b) {
                qvq.f.b bVar = (qvq.f.b) qvqVar;
                ArrayList arrayList = bVar.b;
                int i2 = bVar.c;
                f().f();
                aVar.b(new c2r.d.c(arrayList, PaginationKey.LoadedFull.b, PaginationKey.Initial.b, s4r.a.a, ubx.b.a, null, null));
                aVar.a(new qvq.i.a(new zv8(i2, arrayList.size())));
                d().b(uyq.f.a);
                return;
            }
            if (fVar instanceof qvq.f.d) {
                qvq.f.d dVar = (qvq.f.d) qvqVar;
                aVar.b(new c2r.d.b(dVar.c, dVar.d, dVar.e, dVar.f));
                b(aVar, fVar);
            } else if (fVar.equals(qvq.f.a.b)) {
                aVar.b(new c2r.d.b());
                b(aVar, fVar);
            } else {
                if (!(fVar instanceof qvq.f.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.b(new c2r.d.b());
                b(aVar, fVar);
            }
        }
    }

    public abstract void b(wk50.a aVar, qvq.f fVar);

    public abstract wj50<uyq> d();

    public abstract myc e();

    public abstract okh0 f();

    public abstract hlh0 g();

    public final void h(nj50<? super qvq, ? super c2r> nj50Var, Throwable th) {
        g().a(th);
        f().e();
        nj50Var.b(new c2r.d.a(th));
    }

    public final void i(nj50<? super qvq, ? super c2r> nj50Var, List<? extends FeedItem> list, m mVar, s4r s4rVar, ubx ubxVar, String str, wrr wrrVar) {
        f().f();
        nj50Var.b(new c2r.d.c(list, mVar.a, mVar.b, s4rVar, ubxVar, str, wrrVar));
        if (list.size() <= 3) {
            nj50Var.a(new qvq.i.b(false));
            nj50Var.a(new qvq.i.b(true));
        }
        nj50Var.a(new qvq.a.C3575a(list));
        d().b(uyq.f.a);
    }

    public final void j(nj50<? super qvq, ? super c2r> nj50Var, qih0 qih0Var, wzs<? super qih0, ? super List<? extends FeedItem>, ? extends List<? extends FeedItem>> wzsVar, String str) {
        List<? extends FeedItem> invoke;
        ArrayList f2 = e().f(qih0Var.a);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = f2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((FeedItem) next).b1())) {
                arrayList.add(next);
            }
        }
        List<? extends FeedItem> list = (wzsVar == null || (invoke = wzsVar.invoke(qih0Var, arrayList)) == null) ? arrayList : invoke;
        String str2 = qih0Var.f;
        i(nj50Var, list, new m(qih0Var.d, qih0Var.e), (str2 == null || str2.length() == 0) ? s4r.a.a : new s4r.b(str2), ubx.b.a, str, qih0Var.h);
    }

    public final io.reactivex.rxjava3.internal.operators.maybe.u l(nj50 nj50Var, t8e t8eVar) {
        io.reactivex.rxjava3.core.k<vw50> c2 = t8eVar.c();
        cw cwVar = new cw(new fd5(this, nj50Var, s4r.a.a, 3), 21);
        c2.getClass();
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.b0(c2, lVar, cwVar, lVar, kVar, kVar), new mr(new amp(1), 17));
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
