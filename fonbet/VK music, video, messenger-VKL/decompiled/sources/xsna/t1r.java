package xsna;

import android.os.SystemClock;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.c2r;
import xsna.ea90;
import xsna.mke;
import xsna.mtf0;
import xsna.q4r;
import xsna.qvq;
import xsna.wk50;

/* compiled from: FeedLoadPageActionDelegate.kt */
/* loaded from: classes17.dex */
public abstract class t1r implements oj50<q4r, qvq, c2r> {

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class a extends t1r {
        public final mke.b a;
        public final ClipFeedTab b;
        public final i4r c;
        public final bpn0 d;

        public a(mke.b bVar, ClipFeedTab clipFeedTab, i4r i4rVar, bpn0 bpn0Var) {
            this.a = bVar;
            this.b = clipFeedTab;
            this.c = i4rVar;
            this.d = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.d;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.c.g(this.a, t1r.f(aVar2, iVar).a, this.b instanceof ClipFeedTab.CatalogClip.MusicTemplateCatalogClip), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class b extends t1r {
        public final mke.c a;
        public final i4r b;
        public final bpn0 c;

        public b(mke.c cVar, i4r i4rVar, bpn0 bpn0Var) {
            this.a = cVar;
            this.b = i4rVar;
            this.c = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.b.i(this.a.a, t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class c extends t1r {
        public final mke.e a;
        public final i4r b;
        public final bpn0 c;
        public final p8e d;

        public c(mke.e eVar, i4r i4rVar, bpn0 bpn0Var, p8e p8eVar) {
            this.a = eVar;
            this.b = i4rVar;
            this.c = bpn0Var;
            this.d = p8eVar;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            List<o8e> list;
            PaginationKey paginationKey = t1r.f(aVar2, iVar).a;
            boolean z = paginationKey instanceof PaginationKey.NextPageWithDecoration;
            i4r i4rVar = this.b;
            if (z) {
                return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(i4rVar.j(((PaginationKey.NextPageWithDecoration) paginationKey).b, iVar.n()).m(yiz.f(com.vk.mvi.core.internal.executors.a.a)), new tp0(new mp3(this, aVar, iVar), 28)));
            }
            mke.e eVar = this.a;
            mke.y yVar = (mke.y) t1r.c(new mke.y(eVar.a, eVar.b, eVar.c, 4), aVar2);
            p8e p8eVar = this.d;
            if (p8eVar == null || (list = p8eVar.b()) == null) {
                list = EmptyList.b;
            }
            return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(i4rVar.h(yVar, paginationKey, null, list).m(yiz.f(com.vk.mvi.core.internal.executors.a.a)), new pf1(new ng3(this, aVar, iVar, 18), 18)));
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class d extends t1r {
        public final mke.f a;
        public final i4r b;
        public final bpn0 c;
        public final p8e d;

        public d(mke.f fVar, i4r i4rVar, bpn0 bpn0Var, p8e p8eVar) {
            this.a = fVar;
            this.b = i4rVar;
            this.c = bpn0Var;
            this.d = p8eVar;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            List<o8e> list;
            PaginationKey paginationKey = t1r.f(aVar2, iVar).a;
            mke.f fVar = this.a;
            mke.y yVar = (mke.y) t1r.c(new mke.y(fVar.a, fVar.b, fVar.c, 4), aVar2);
            p8e p8eVar = this.d;
            if (p8eVar == null || (list = p8eVar.b()) == null) {
                list = EmptyList.b;
            }
            return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(this.b.h(yVar, paginationKey, null, list).m(yiz.f(com.vk.mvi.core.internal.executors.a.a)), new kl6(new az2(this, aVar, iVar, 14), 18)));
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class e extends t1r {
        public final mke.h a;
        public final i4r b;
        public final bpn0 c;

        public e(mke.h hVar, i4r i4rVar, bpn0 bpn0Var) {
            this.a = hVar;
            this.b = i4rVar;
            this.c = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.b.k(this.a, t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static abstract class f extends t1r {

        /* compiled from: FeedLoadPageActionDelegate.kt */
        public static final class a extends f {
            public final mke.a a;
            public final i4r b;
            public final bpn0 c;

            public a(mke.a aVar, i4r i4rVar, bpn0 bpn0Var) {
                this.a = aVar;
                this.b = i4rVar;
                this.c = bpn0Var;
            }

            @Override // xsna.t1r
            public final Lazy<b6e> e() {
                return this.c;
            }

            @Override // xsna.t1r.f
            public final mke i() {
                return this.a;
            }

            @Override // xsna.t1r.f
            public final t8e j() {
                return this.b;
            }
        }

        /* compiled from: FeedLoadPageActionDelegate.kt */
        public static final class b extends f {
            public final mke.d a;
            public final i4r b;
            public final bpn0 c;

            public b(mke.d dVar, i4r i4rVar, bpn0 bpn0Var) {
                this.a = dVar;
                this.b = i4rVar;
                this.c = bpn0Var;
            }

            @Override // xsna.t1r
            public final Lazy<b6e> e() {
                return this.c;
            }

            @Override // xsna.t1r.f
            public final mke i() {
                return this.a;
            }

            @Override // xsna.t1r.f
            public final t8e j() {
                return this.b;
            }
        }

        /* compiled from: FeedLoadPageActionDelegate.kt */
        public static final class c extends f {
            public final mke.i a;
            public final i4r b;
            public final bpn0 c;

            public c(mke.i iVar, i4r i4rVar, bpn0 bpn0Var) {
                this.a = iVar;
                this.b = i4rVar;
                this.c = bpn0Var;
            }

            @Override // xsna.t1r
            public final Lazy<b6e> e() {
                return this.c;
            }

            @Override // xsna.t1r.f
            public final mke i() {
                return this.a;
            }

            @Override // xsna.t1r.f
            public final t8e j() {
                return this.b;
            }
        }

        /* compiled from: FeedLoadPageActionDelegate.kt */
        public static final class d extends f {
            public final mke.j a;
            public final i4r b;
            public final bpn0 c;

            public d(mke.j jVar, i4r i4rVar, bpn0 bpn0Var) {
                this.a = jVar;
                this.b = i4rVar;
                this.c = bpn0Var;
            }

            @Override // xsna.t1r
            public final Lazy<b6e> e() {
                return this.c;
            }

            @Override // xsna.t1r.f
            public final mke i() {
                return this.a;
            }

            @Override // xsna.t1r.f
            public final t8e j() {
                return this.b;
            }
        }

        /* compiled from: FeedLoadPageActionDelegate.kt */
        public static final class e extends f {
            public final mke.m a;
            public final i4r b;
            public final bpn0 c;

            public e(mke.m mVar, i4r i4rVar, bpn0 bpn0Var) {
                this.a = mVar;
                this.b = i4rVar;
                this.c = bpn0Var;
            }

            @Override // xsna.t1r
            public final Lazy<b6e> e() {
                return this.c;
            }

            @Override // xsna.t1r.f
            public final mke i() {
                return this.a;
            }

            @Override // xsna.t1r.f
            public final t8e j() {
                return this.b;
            }
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(j().a(t1r.c(i(), aVar2), t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }

        public abstract mke i();

        public abstract t8e j();
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class g extends t1r {
        public final i4r a;
        public final bpn0 b;

        public g(i4r i4rVar, bpn0 bpn0Var) {
            this.a = i4rVar;
            this.b = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.b;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.a.l(t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class h extends t1r {
        public final i4r a;
        public final bpn0 b;

        public h(i4r i4rVar, bpn0 bpn0Var) {
            this.a = i4rVar;
            this.b = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.b;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.a.m(t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class i extends t1r {
        public final mke.n a;
        public final i4r b;
        public final bpn0 c;

        public i(mke.n nVar, i4r i4rVar, bpn0 bpn0Var) {
            this.a = nVar;
            this.b = i4rVar;
            this.c = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.b.n(this.a, t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class j extends t1r {
        public final mke.o a;
        public final i4r b;
        public final bpn0 c;

        public j(mke.o oVar, i4r i4rVar, bpn0 bpn0Var) {
            this.a = oVar;
            this.b = i4rVar;
            this.c = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.b.o(this.a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class k extends t1r {
        public final i4r a;
        public final bpn0 b;

        public k(mke.p pVar, i4r i4rVar, bpn0 bpn0Var) {
            this.a = i4rVar;
            this.b = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.b;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.a.q(t1r.f(aVar2, iVar).a), aVar, iVar, true);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class l extends t1r {
        public final mke.q a;
        public final i4r b;
        public final bpn0 c;

        public l(mke.q qVar, i4r i4rVar, bpn0 bpn0Var) {
            this.a = qVar;
            this.b = i4rVar;
            this.c = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.b.d((mke.q) t1r.c(this.a, aVar2), t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class m extends t1r {
        public final mke.r a;
        public final i4r b;
        public final bpn0 c;

        public m(mke.r rVar, i4r i4rVar, bpn0 bpn0Var) {
            this.a = rVar;
            this.b = i4rVar;
            this.c = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.b.r(this.a, iVar.n(), t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class n extends t1r {
        public final mke.s a;
        public final i4r b;
        public final bpn0 c;

        public n(mke.s sVar, i4r i4rVar, bpn0 bpn0Var) {
            this.a = sVar;
            this.b = i4rVar;
            this.c = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.b.s(this.a, t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class o extends t1r {
        public final mke.t a;
        public final i4r b;
        public final bpn0 c;

        public o(mke.t tVar, i4r i4rVar, bpn0 bpn0Var) {
            this.a = tVar;
            this.b = i4rVar;
            this.c = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.b.t(this.a, t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class q extends t1r {
        public final mke.u a;
        public final i4r b;
        public final bpn0 c;

        public q(mke.u uVar, i4r i4rVar, bpn0 bpn0Var) {
            this.a = uVar;
            this.b = i4rVar;
            this.c = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.b.u(this.a, t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class r extends t1r {
        public final bpn0 a;

        public r(bpn0 bpn0Var) {
            this.a = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.a;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class s extends t1r {
        public final i4r a;
        public final bpn0 b;

        public s(i4r i4rVar, bpn0 bpn0Var) {
            this.a = i4rVar;
            this.b = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.b;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.a.p(t1r.f(aVar2, iVar).a), aVar, iVar, false);
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class t extends t1r {
        public final mke.x a;
        public final i4r b;
        public final bpn0 c;
        public final p8e d;

        public t(mke.x xVar, i4r i4rVar, bpn0 bpn0Var, p8e p8eVar) {
            this.a = xVar;
            this.b = i4rVar;
            this.c = bpn0Var;
            this.d = p8eVar;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            List<o8e> list;
            mke.x xVar = (mke.x) t1r.c(this.a, aVar2);
            PaginationKey paginationKey = t1r.f(aVar2, iVar).a;
            zv8 zv8Var = iVar instanceof qvq.i.a ? ((qvq.i.a) iVar).b : null;
            p8e p8eVar = this.d;
            if (p8eVar == null || (list = p8eVar.b()) == null) {
                list = EmptyList.b;
            }
            return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(this.b.h(xVar, paginationKey, zv8Var, list), new y50(new qt5(this, aVar, iVar), 24)));
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class u extends t1r {
        public final mke.y a;
        public final i4r b;
        public final bpn0 c;
        public final p8e d;

        public u(mke.y yVar, i4r i4rVar, bpn0 bpn0Var, p8e p8eVar) {
            this.a = yVar;
            this.b = i4rVar;
            this.c = bpn0Var;
            this.d = p8eVar;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            List<o8e> list;
            mke.y yVar = (mke.y) t1r.c(this.a, aVar2);
            PaginationKey paginationKey = t1r.f(aVar2, iVar).a;
            p8e p8eVar = this.d;
            if (p8eVar == null || (list = p8eVar.b()) == null) {
                list = EmptyList.b;
            }
            return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(this.b.h(yVar, paginationKey, null, list).m(yiz.f(com.vk.mvi.core.internal.executors.a.a)), new st0(new com.vk.im.engine.commands.messages.a(this, aVar, iVar), 18)));
        }
    }

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class v extends t1r {
        public final mke.z a;
        public final i4r b;
        public final bpn0 c;

        public v(mke.z zVar, i4r i4rVar, bpn0 bpn0Var) {
            this.a = zVar;
            this.b = i4rVar;
            this.c = bpn0Var;
        }

        @Override // xsna.t1r
        public final Lazy<b6e> e() {
            return this.c;
        }

        @Override // xsna.t1r
        public final io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar) {
            return b(this.b.x(this.a, t1r.f(aVar2, iVar).a), aVar, iVar, true);
        }
    }

    public static mke c(mke mkeVar, q4r.a aVar) {
        if (!(mkeVar instanceof mke.g)) {
            return mkeVar;
        }
        if (mkeVar instanceof mke.x) {
            mke.x xVar = (mke.x) mkeVar;
            return new mke.x(d(aVar), xVar.b, xVar.c);
        }
        if (mkeVar instanceof mke.y) {
            mke.y yVar = (mke.y) mkeVar;
            return new mke.y(yVar.a, yVar.b, d(aVar), yVar.d);
        }
        if (mkeVar instanceof mke.j) {
            return new mke.j(((mke.j) mkeVar).a, d(aVar));
        }
        if (mkeVar instanceof mke.m) {
            return new mke.m(((mke.m) mkeVar).a, d(aVar));
        }
        if (mkeVar instanceof mke.a) {
            return new mke.a(((mke.a) mkeVar).a, d(aVar));
        }
        if (mkeVar instanceof mke.d) {
            return new mke.d(((mke.d) mkeVar).a, d(aVar));
        }
        if (mkeVar instanceof mke.i) {
            return new mke.i(((mke.i) mkeVar).a, d(aVar));
        }
        if (!(mkeVar instanceof mke.q)) {
            throw new NoWhenBranchMatchedException();
        }
        mke.q qVar = (mke.q) mkeVar;
        return new mke.q(qVar.a, qVar.b, d(aVar));
    }

    public static final ArrayList d(q4r.a aVar) {
        List I0 = j5g.I0(400, aVar.b.a);
        if (I0.isEmpty()) {
            I0 = null;
        }
        if (I0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : I0) {
            if (obj instanceof FeedItem.d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((FeedItem.d) next).k().o0() != 0) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((FeedItem.d) it2.next()).k().a1());
        }
        return arrayList3;
    }

    public static ea90 f(q4r.a aVar, qvq.i iVar) {
        return iVar.n() ? aVar.e : aVar.d;
    }

    public static void g(nj50 nj50Var, qvq.i iVar, qih0 qih0Var, boolean z) {
        nj50Var.a(new qvq.b.C3576b(iVar, qih0Var, z));
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        q4r q4rVar = (q4r) km50Var;
        qvq qvqVar = (qvq) kj50Var;
        if ((q4rVar instanceof q4r.a) && (qvqVar instanceof qvq.i)) {
            q4r.a aVar2 = (q4r.a) q4rVar;
            qvq.i iVar = (qvq.i) qvqVar;
            ea90 f2 = f(aVar2, iVar);
            if (!aVar2.k || (f2.a instanceof PaginationKey.LoadedFull) || (aVar2.f instanceof mtf0.b)) {
                return;
            }
            boolean z = iVar instanceof qvq.i.e;
            if (!z || (f2.b instanceof ea90.a.b)) {
                if (z) {
                    Map<String, c1r> b2 = aVar2.b();
                    qvq.i.e eVar = (qvq.i.e) iVar;
                    boolean z2 = eVar.b;
                    c1r c1rVar = b2.get(eVar.c);
                    Integer valueOf = c1rVar != null ? Integer.valueOf(c1rVar.b) : null;
                    int i2 = e().getValue().b;
                    if (valueOf == null) {
                        return;
                    }
                    if ((!z2 || e43.h(aVar2.b.a) - valueOf.intValue() > i2) && (z2 || valueOf.intValue() > i2)) {
                        return;
                    }
                }
                aVar.b(new c2r.f.c(iVar.n()));
                a7f0.a.d(aVar, h(aVar, aVar2, iVar), null, new ma(this, aVar, qvqVar, 13), null, 5);
            }
        }
    }

    public final io.reactivex.rxjava3.internal.operators.completable.p b(io.reactivex.rxjava3.core.x xVar, nj50 nj50Var, qvq.i iVar, boolean z) {
        l50 l50Var = new l50(new kce(this, nj50Var, iVar, z), 25);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(xVar, l50Var));
    }

    public abstract Lazy<b6e> e();

    public abstract io.reactivex.rxjava3.core.a h(wk50.a aVar, q4r.a aVar2, qvq.i iVar);

    /* compiled from: FeedLoadPageActionDelegate.kt */
    public static final class p implements oj50<q4r, qvq, c2r> {
        public final gbq a;
        public final myc b;
        public final j8e c;

        /* compiled from: FeedLoadPageActionDelegate.kt */
        public static final class a extends Throwable {
        }

        public p(gbq gbqVar, myc mycVar, alk alkVar, j8e j8eVar) {
            this.a = gbqVar;
            this.b = mycVar;
            this.c = j8eVar;
        }

        public static Long b(q4r.a aVar, boolean z) {
            ea90.a aVar2 = z ? aVar.e.b : aVar.d.b;
            if (aVar2 instanceof ea90.a.c) {
                return Long.valueOf(SystemClock.elapsedRealtime() - ((ea90.a.c) aVar2).a);
            }
            return null;
        }

        public static final void d(p pVar, q4r.a aVar, boolean z, wk50.a aVar2, PaginationKey paginationKey) {
            Long b = b(aVar, z);
            if (b != null) {
                j8e j8eVar = pVar.c;
                long longValue = b.longValue();
                irk0 irk0Var = j8eVar.a;
                if (irk0Var != null) {
                    l5m l5mVar = new l5m(irk0Var, null, 2);
                    l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CLIPS_FEED_PAGINATION_METRICS.h(), null, "page_loading_retry", Integer.valueOf((int) longValue), (String) j8eVar.b.invoke(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -30, 3, null);
                    l5mVar.q();
                }
            }
            aVar2.b(new c2r.f.b(paginationKey, z));
            aVar2.a(new qvq.i.d(z));
        }

        @Override // xsna.oj50
        public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
            gbq gbqVar;
            q4r q4rVar = (q4r) km50Var;
            qvq qvqVar = (qvq) kj50Var;
            if ((q4rVar instanceof q4r.a) && (qvqVar instanceof qvq.b)) {
                qvq.b bVar = (qvq.b) qvqVar;
                boolean z = bVar instanceof qvq.b.C3576b;
                j8e j8eVar = this.c;
                myc mycVar = this.b;
                if (z) {
                    q4r.a aVar2 = (q4r.a) q4rVar;
                    qvq.b.C3576b c3576b = (qvq.b.C3576b) qvqVar;
                    qih0 qih0Var = c3576b.c;
                    qvq.i iVar = c3576b.b;
                    PaginationKey paginationKey = iVar.n() ? qih0Var.e : qih0Var.d;
                    List<FeedItem> f = mycVar.f(qih0Var.a);
                    if (c3576b.d && (gbqVar = this.a) != null) {
                        f = gbqVar.a(qih0Var, f);
                    }
                    int i = qih0Var.c;
                    if (i != 0) {
                        int i2 = qih0Var.b;
                        if (j8eVar.a != null) {
                            new SchemeStat$TypeDevNullItem(DevNullEventKey.CLIPS_FEED_BAD_RESPONSE.h(), null, "response_contains_clip_with_zero_id", Integer.valueOf(i2), (String) j8eVar.b.invoke(), Integer.valueOf(i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -62, 3, null);
                        }
                    }
                    c(aVar, aVar2, f, paginationKey, iVar.n(), qih0Var.h);
                    return;
                }
                if (bVar instanceof qvq.b.c) {
                    q4r.a aVar3 = (q4r.a) q4rVar;
                    qvq.b.c cVar = (qvq.b.c) qvqVar;
                    bpd bpdVar = cVar.c;
                    ArrayList e = mycVar.e(bpdVar.a);
                    qvq.i iVar2 = cVar.b;
                    boolean n = iVar2.n();
                    PaginationKey paginationKey2 = n ? bpdVar.c : bpdVar.b;
                    if (n && epx.f(paginationKey2, PaginationKey.LoadedFull.b)) {
                        paginationKey2 = PaginationKey.Initial.b;
                    }
                    c(aVar, aVar3, e, paginationKey2, iVar2.n(), null);
                    return;
                }
                if (!(bVar instanceof qvq.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                qvq.b.a aVar4 = (qvq.b.a) qvqVar;
                Throwable th = aVar4.c;
                com.vk.metrics.eventtracking.b.a.a(new a(th));
                qvq.i iVar3 = aVar4.b;
                Long b = b((q4r.a) q4rVar, iVar3.n());
                if (b != null) {
                    long longValue = b.longValue();
                    irk0 irk0Var = j8eVar.a;
                    if (irk0Var != null) {
                        l5m l5mVar = new l5m(irk0Var, null, 2);
                        String h = DevNullEventKey.CLIPS_FEED_PAGINATION_METRICS.h();
                        String str = (String) j8eVar.b.invoke();
                        StringBuilder sb = new StringBuilder();
                        Throwable th2 = th;
                        do {
                            sb.append(String.valueOf(th2));
                            sb.append("\n");
                            th2 = th2.getCause();
                            if (th2 == null) {
                                break;
                            }
                        } while (!th2.equals(th2.getCause()));
                        l5mVar.g = new SchemeStat$TypeDevNullItem(h, erm0.D0(1024, sb.toString()), "page_loading_error", Integer.valueOf((int) longValue), str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, 3, null);
                        l5mVar.q();
                    }
                }
                aVar.b(new c2r.f.a(th, iVar3.n()));
            }
        }

        public final void c(wk50.a aVar, q4r.a aVar2, List list, PaginationKey paginationKey, boolean z, wrr wrrVar) {
            d9l o = alk.o(aVar2.b.a, list);
            ArrayList arrayList = o.a;
            ArrayList arrayList2 = o.b;
            boolean isEmpty = list.isEmpty();
            j8e j8eVar = this.c;
            if (isEmpty && !(paginationKey instanceof PaginationKey.LoadedFull)) {
                d(this, aVar2, z, aVar, paginationKey);
            } else if (!arrayList.isEmpty() || (paginationKey instanceof PaginationKey.LoadedFull)) {
                Long b = b(aVar2, z);
                if (b != null) {
                    long longValue = b.longValue();
                    irk0 irk0Var = j8eVar.a;
                    if (irk0Var != null) {
                        l5m l5mVar = new l5m(irk0Var, null, 2);
                        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CLIPS_FEED_PAGINATION_METRICS.h(), null, "page_loading_success", Integer.valueOf((int) longValue), (String) j8eVar.b.invoke(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -30, 3, null);
                        l5mVar.q();
                    }
                }
                aVar.b(new c2r.f.d(arrayList, paginationKey, wrrVar, z));
                aVar.a(new qvq.a.C3575a(list));
            } else {
                d(this, aVar2, z, aVar, paginationKey);
            }
            if (list.isEmpty() && !(paginationKey instanceof PaginationKey.LoadedFull)) {
                irk0 irk0Var2 = j8eVar.a;
                if (irk0Var2 == null) {
                    return;
                }
                l5m l5mVar2 = new l5m(irk0Var2, null, 2);
                l5mVar2.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CLIPS_FEED_BAD_RESPONSE.h(), null, "page_empty", null, (String) j8eVar.b.invoke(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -22, 3, null);
                l5mVar2.q();
                return;
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            int size = list.size();
            int size2 = arrayList2.size();
            irk0 irk0Var3 = j8eVar.a;
            if (irk0Var3 == null) {
                return;
            }
            l5m l5mVar3 = new l5m(irk0Var3, null, 2);
            l5mVar3.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CLIPS_FEED_BAD_RESPONSE.h(), null, "page_contains_duplicates", Integer.valueOf(size), (String) j8eVar.b.invoke(), Integer.valueOf(size2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -62, 3, null);
            l5mVar3.q();
        }

        @Override // xsna.oj50
        public final void onDestroy() {
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
