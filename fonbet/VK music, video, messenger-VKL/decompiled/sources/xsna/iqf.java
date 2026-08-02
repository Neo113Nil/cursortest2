package xsna;

import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.viewer.impl.feed.wrapper.presentation.event.ClipsWrapperHintButtonPosition;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.msf;
import xsna.npf;
import xsna.ruf;
import xsna.ttf;
import xsna.wrf;

/* compiled from: ClipsWrapperFeature.kt */
/* loaded from: classes17.dex */
public final class iqf extends wk50<uuf, isf, npf, ttf> {
    public final f4z<huf> A;
    public final f4z<otf> B;
    public final String f;
    public final urf g;
    public final ClipsInterestsComponent h;
    public final itf i;
    public final iaf j;
    public final fyu k;
    public final ptf l;
    public final qsf m;
    public final muf n;
    public final spf o;
    public final tsf p;
    public final puf q;
    public final bqf r;
    public final f4z<qpf> s;
    public final f4z<msf> t;
    public final f4z<ypf> u;
    public final f4z<ruf> v;
    public final f4z<luf> w;
    public final f4z<qtf> x;
    public final f4z<rtf> y;
    public final f4z<ssf> z;

    /* compiled from: ClipsWrapperFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsInterestsStatusProvider.Status.values().length];
            try {
                iArr[ClipsInterestsStatusProvider.Status.SHOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsInterestsStatusProvider.Status.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsInterestsStatusProvider.Status.NEED_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public iqf(String str, urf urfVar, ClipsInterestsComponent clipsInterestsComponent, itf itfVar, iaf iafVar, fyu fyuVar, ptf ptfVar, npf.g gVar) {
        super(gVar, itfVar);
        this.f = str;
        this.g = urfVar;
        this.h = clipsInterestsComponent;
        this.i = itfVar;
        this.j = iafVar;
        this.k = fyuVar;
        this.l = ptfVar;
        this.m = new qsf(urfVar);
        this.n = new muf();
        this.o = new spf();
        tsf tsfVar = new tsf();
        tsfVar.b = true;
        this.p = tsfVar;
        this.q = new puf();
        this.r = new bqf();
        this.s = new f4z<>();
        this.t = new f4z<>();
        this.u = new f4z<>();
        this.v = new f4z<>();
        this.w = new f4z<>();
        this.x = new f4z<>();
        this.y = new f4z<>();
        this.z = new f4z<>();
        this.A = new f4z<>();
        this.B = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(isf isfVar, npf npfVar) {
        int i;
        npf npfVar2 = npfVar;
        int i2 = 0;
        if (npfVar2 instanceof npf.g) {
            npf.g gVar = (npf.g) npfVar2;
            this.e.e();
            urf urfVar = this.g;
            String str = this.f;
            io.reactivex.rxjava3.core.q<Integer> i3 = urfVar.i(str);
            a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
            i3.getClass();
            b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.y(i3, qVar, aVar).U(new j6a(lqf.b, 1)), null, new ud8(1, this, iqf.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 5), null, null, 13);
            io.reactivex.rxjava3.core.q<tqf> v = urfVar.v(str);
            com.vk.movika.sdk.base.ui.p0 p0Var = new com.vk.movika.sdk.base.ui.p0(new xx0(17), 12);
            v.getClass();
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(v, p0Var), qVar, aVar).U(new i6a(mqf.b, 1)), null, new wi3(1, this, iqf.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 4), null, null, 13);
            if (this.j.a) {
                io.reactivex.rxjava3.core.q<tqf> v2 = urfVar.v(str);
                v2.getClass();
                a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.y(v2, qVar, aVar).U(new e7(new pf(15), 15)), null, new ae8(1, this, iqf.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 2), null, null, 13);
            }
            io.reactivex.rxjava3.core.q<quf> o = urfVar.o(str);
            o.getClass();
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.y(o, qVar, aVar).U(new op0(qqf.b, 9)).U(new fqf(rqf.b, 0)), null, new ug8(1, this, iqf.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 4), null, null, 13);
            io.reactivex.rxjava3.core.q<guf> h = urfVar.h(str);
            hqf hqfVar = new hqf(oqf.b, 0);
            h.getClass();
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.y(h, hqfVar, aVar).U(new qa(new com.vk.movika.sdk.base.utils.b(14), 13)), null, new bi6(1, this, iqf.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 4), null, null, 13);
            io.reactivex.rxjava3.core.q<guf> h2 = urfVar.h(str);
            k7 k7Var = new k7(new tb4(8), 9);
            h2.getClass();
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.y(h2, k7Var, aVar).U(new com.vk.movika.sdk.base.hooks.k(new x50(9), 14)), null, new ee8(1, this, iqf.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 5), null, null, 13);
            a7f0.a.e(this, urfVar.q(str).U(new e05(pqf.b, 13)), null, new gy(1, this, iqf.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 9), null, null, 13);
            a7f0.a.e(this, urfVar.k(str).U(new vr(new ak(11), 8)), null, new ie8(1, this, iqf.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 4), null, null, 13);
            a7f0.a.e(this, urfVar.g(str).U(new gqf(nqf.b, 0)), null, new ai6(1, this, iqf.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 3), null, null, 13);
            a7f0.a.e(this, urfVar.p(str).U(new dqf(kqf.b, 0)), null, new qi3(1, this, iqf.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 7), null, null, 13);
            io.reactivex.rxjava3.core.q w = urfVar.w();
            asu0 asu0Var = asu0.a;
            a7f0.a.e(this, w, asu0Var.d(), new wd8(this.u, 4), null, null, 12);
            ClipsInterestsComponent clipsInterestsComponent = this.h;
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.q2(clipsInterestsComponent.Re().d().d(clipsInterestsComponent.n5().a()), new nm3(new x90(7), 7)), qVar, aVar), null, new ha(this, 19), null, null, 13);
            io.reactivex.rxjava3.core.q<vsf> a2 = urfVar.a(str);
            a2.getClass();
            a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.y(a2, qVar, aVar).U(new mj1(new oj(11), 13)), null, new cqf(this, i2), null, null, 13);
            a7f0.a.e(this, urfVar.A(str).U(new rx0(new xd8(this.r, 2), 13)), null, new t6(this, 23), null, null, 13);
            if (gVar.b) {
                a7f0.a.e(this, urfVar.u(), asu0Var.d(), new wg8(this.v, 3), null, null, 12);
            }
            T(ttf.g.b);
            if (gVar.d) {
                fyu fyuVar = this.k;
                ClipFeedTab.WithPayload.Payload payload = gVar.c;
                io.reactivex.rxjava3.subjects.d<List<String>> dVar = fyuVar.e;
                if (fyuVar.c.compareAndSet(false, true)) {
                    Object obj = fyuVar.b.b;
                    int i4 = 26;
                    int i5 = 18;
                    itg0.h(rsg0.w0(yfb.x(new vfx("shortVideo.getHeaderTabs", new br(28), new cr(i4)))).l(new xb20(new nc90(i5), i5)), new yve(fyuVar, i4), new t3h(fyuVar, 24));
                }
                a7f0.a.e(this, (dVar.Q0() ? new io.reactivex.rxjava3.internal.operators.observable.j2(new io.reactivex.rxjava3.internal.operators.observable.z0(dVar)) : new io.reactivex.rxjava3.internal.operators.observable.z0(dVar)).U(new q40(new eaa(16, fyuVar, payload), 19)), null, new yve(this, 3), null, null, 13);
                return;
            }
            return;
        }
        if (npfVar2 instanceof npf.b) {
            this.g.j(((npf.b) npfVar2).b, this.f);
            return;
        }
        if (npfVar2 instanceof npf.a) {
            this.g.t(this.f, ((npf.a) npfVar2).b);
            return;
        }
        if (npfVar2 instanceof npf.n) {
            npf.n nVar = (npf.n) npfVar2;
            isf isfVar2 = (isf) this.i.c;
            zrf zrfVar = isfVar2.b;
            wrf wrfVar = (wrf) j5g.b0(zrfVar.d, zrfVar.b);
            ClipFeedTab c = wrfVar != null ? wrfVar.c() : null;
            int indexOf = nVar.b.indexOf(c);
            Integer valueOf = indexOf != -1 ? Integer.valueOf(indexOf) : null;
            if (valueOf != null) {
                i = valueOf.intValue();
            } else {
                i = isfVar2.b.d;
                int h3 = e43.h(nVar.b);
                if (i > h3) {
                    i = h3;
                }
            }
            this.g.z(i, this.f, nVar.b);
            List<wrf> list = isfVar2.b.b;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((wrf) it.next()).c().getClass());
            }
            Set S0 = j5g.S0(arrayList);
            List<ClipFeedTab> list2 = nVar.b;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ClipFeedTab) it2.next()).getClass());
            }
            Set S02 = j5g.S0(arrayList2);
            boolean z = (c == null || S02.contains(c.getClass()) || !S02.contains(ClipFeedTab.TopVideo.class)) ? false : true;
            if (epx.f(S0, S02) || z) {
                T(new ttf.i.c(nVar.b));
            } else {
                T(new ttf.i.d(nVar.b));
            }
            if (isfVar2.f.k) {
                T(ttf.i.b.b);
                return;
            }
            return;
        }
        if (npfVar2 instanceof npf.h) {
            npf.h hVar = (npf.h) npfVar2;
            if (hVar instanceof npf.h.i) {
                this.t.b(msf.h.a);
                return;
            }
            if (hVar instanceof npf.h.j) {
                this.t.b(new msf.i(((npf.h.j) hVar).b));
                return;
            }
            if (hVar instanceof npf.h.l) {
                this.t.b(msf.k.a);
                return;
            }
            if (hVar instanceof npf.h.a) {
                zrf zrfVar2 = ((isf) this.i.c).b;
                int i6 = zrfVar2.c;
                if (i6 != zrfVar2.d) {
                    this.g.j(i6, this.f);
                    return;
                } else {
                    this.s.b(qpf.a);
                    return;
                }
            }
            if (hVar instanceof npf.h.m) {
                this.t.b(msf.l.a);
                return;
            }
            if (hVar instanceof npf.h.b) {
                this.t.b(msf.a.a);
                return;
            }
            if (hVar instanceof npf.h.e) {
                npf.h.e eVar = (npf.h.e) hVar;
                this.t.b(new msf.d(eVar.d, eVar.b, eVar.c));
                return;
            }
            if (hVar instanceof npf.h.C3409h) {
                this.t.b(msf.g.a);
                return;
            }
            if (hVar instanceof npf.h.f) {
                this.t.b(msf.e.a);
                return;
            }
            if (hVar instanceof npf.h.k) {
                this.t.b(msf.j.a);
                return;
            }
            if (hVar instanceof npf.h.d) {
                this.t.b(new msf.c(((npf.h.d) hVar).b));
                return;
            } else if (hVar instanceof npf.h.g) {
                this.t.b(new msf.f());
                return;
            } else {
                if (!(hVar instanceof npf.h.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.t.b(new msf.b(((npf.h.c) hVar).b));
                return;
            }
        }
        if (npfVar2 instanceof npf.d) {
            if (!(((npf.d) npfVar2) instanceof npf.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.g.y();
            return;
        }
        if (npfVar2 instanceof npf.o) {
            this.w.b(new luf(((npf.o) npfVar2).b));
            return;
        }
        if (npfVar2 instanceof npf.k) {
            this.x.b(new qtf(((npf.k) npfVar2).b));
            return;
        }
        if (npfVar2 instanceof npf.l) {
            this.y.b(rtf.a);
            return;
        }
        if (npfVar2 instanceof npf.i) {
            npf.i iVar = (npf.i) npfVar2;
            tsf tsfVar = this.p;
            if (iVar instanceof npf.i.a) {
                this.z.b(new ssf(((npf.i.a) iVar).b));
                return;
            }
            if (iVar instanceof npf.i.b) {
                tsfVar.b = true;
                return;
            }
            if (!(iVar instanceof npf.i.c)) {
                throw new NoWhenBranchMatchedException();
            }
            tsfVar.b = false;
            npf.i.a aVar2 = tsfVar.a;
            tsfVar.a = null;
            if (aVar2 != null) {
                C(aVar2);
                return;
            }
            return;
        }
        if (npfVar2 instanceof npf.c) {
            npf.c cVar = (npf.c) npfVar2;
            if (!(cVar instanceof opf)) {
                throw new NoWhenBranchMatchedException();
            }
            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.v(new eqf(cVar, i2)), new jqf(1, this, iqf.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), null, 5);
            return;
        }
        if (npfVar2 instanceof npf.e) {
            npf.e eVar2 = (npf.e) npfVar2;
            if (!(eVar2 instanceof npf.e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            T(new vtf(((npf.e.a) eVar2).b));
            return;
        }
        if (npfVar2 instanceof npf.p) {
            npf.p pVar = (npf.p) npfVar2;
            f4z<ruf> f4zVar = this.v;
            if (epx.f(pVar, npf.p.a.b)) {
                f4zVar.b(ruf.b.a);
                return;
            } else {
                if (!epx.f(pVar, npf.p.b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(ruf.c.a);
                return;
            }
        }
        if (!(npfVar2 instanceof npf.f)) {
            if (npfVar2 instanceof npf.j) {
                T(new ttf.d());
                return;
            } else {
                if (!(npfVar2 instanceof npf.m)) {
                    throw new NoWhenBranchMatchedException();
                }
                npf.m mVar = (npf.m) npfVar2;
                this.B.b(new otf(mVar.b, mVar.c));
                return;
            }
        }
        npf.f fVar = (npf.f) npfVar2;
        if (fVar instanceof npf.f.b) {
            npf.f.b bVar = (npf.f.b) fVar;
            this.A.b(new huf(bVar.b, bVar.c));
        } else {
            if (!(fVar instanceof npf.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            puf pufVar = this.q;
            Hint hint = ((npf.f.a) fVar).b;
            pufVar.getClass();
            bpn0 bpn0Var = pla.a;
            ((wvw) (bpn0Var != null ? bpn0Var : null).getValue()).b().b(hint.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0217 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<npf> Q(isf isfVar, isf isfVar2, ttf ttfVar) {
        npf.o oVar;
        List singletonList;
        List<? extends npf> singletonList2;
        ClipFeedOpenAction andSet;
        npf.i.a aVar;
        List singletonList3;
        List singletonList4;
        ptf ptfVar;
        String id;
        bpn0 bpn0Var;
        l7v b;
        Hint p;
        String str;
        List singletonList5;
        a7j<ClipFeedOpenAction> a7jVar;
        ClipFeedOpenAction andSet2;
        ClipFeedTab c;
        isf isfVar3 = isfVar2;
        ttf ttfVar2 = ttfVar;
        zrf zrfVar = isfVar3.b;
        zrf zrfVar2 = isfVar3.b;
        ArrayList arrayList = new ArrayList();
        super.Q(isfVar, isfVar3, ttfVar2);
        this.n.getClass();
        boolean z = ttfVar2 instanceof ttf.c.a;
        if (z) {
            if (!(((ttf.c.a) ttfVar2).b.c instanceof FeedItem.Pagination.b)) {
                wrf wrfVar = (wrf) j5g.b0(zrfVar2.d, zrfVar2.b);
                if (wrfVar != null && (c = wrfVar.c()) != null) {
                    oVar = new npf.o(c);
                }
            }
            oVar = null;
        } else {
            if (ttfVar2 instanceof ttf.i.a) {
                wrf wrfVar2 = (wrf) j5g.b0(zrfVar2.d, zrfVar2.b);
                if (wrfVar2 != null && !(wrfVar2 instanceof wrf.b)) {
                    oVar = new npf.o(wrfVar2.c());
                }
            }
            oVar = null;
        }
        List singletonList6 = oVar != null ? Collections.singletonList(oVar) : null;
        this.o.getClass();
        boolean z2 = ttfVar2 instanceof ttf.i.a;
        if (z2) {
            wrf wrfVar3 = (wrf) j5g.b0(((ttf.i.a) ttfVar2).b, zrfVar.b);
            ClipFeedTab c2 = wrfVar3 != null ? wrfVar3.c() : null;
            singletonList = Collections.singletonList((c2 == null || !c2.Cb()) ? npf.p.a.b : npf.p.b.b);
        } else {
            singletonList = null;
        }
        qsf qsfVar = this.m;
        qsfVar.getClass();
        if (z) {
            singletonList2 = Collections.singletonList(new npf.k(((ttf.c.a) ttfVar2).b));
            if (!qsfVar.b) {
                qsfVar.c = singletonList2;
            }
            tsf tsfVar = this.p;
            tsfVar.getClass();
            if (z) {
                if (ttfVar2 instanceof ttf.a) {
                    ttf.a aVar2 = (ttf.a) ttfVar2;
                    if (!tsfVar.b && (andSet = aVar2.b.a.getAndSet(null)) != null) {
                        aVar = new npf.i.a(andSet);
                    }
                }
                aVar = null;
            } else {
                if (!(((ttf.c.a) ttfVar2).b.c instanceof FeedItem.Pagination.b) && (a7jVar = isfVar3.i.b) != null && (andSet2 = a7jVar.a.getAndSet(null)) != null) {
                    aVar = new npf.i.a(andSet2);
                }
                aVar = null;
            }
            if (aVar == null && tsfVar.b) {
                tsfVar.a = aVar;
            } else if (aVar != null) {
                singletonList3 = Collections.singletonList(aVar);
                this.q.getClass();
                if (z) {
                    wrf h = zrfVar.h();
                    ClipFeedTab c3 = h != null ? h.c() : null;
                    ClipFeedTab.Hashtag hashtag = c3 instanceof ClipFeedTab.Hashtag ? (ClipFeedTab.Hashtag) c3 : null;
                    boolean z3 = false;
                    boolean z4 = hashtag != null && hashtag.c;
                    wrf h2 = zrfVar.h();
                    ClipFeedTab c4 = h2 != null ? h2.c() : null;
                    ClipFeedTab.Music music = c4 instanceof ClipFeedTab.Music ? (ClipFeedTab.Music) c4 : null;
                    if (music != null && music.e) {
                        z3 = true;
                    }
                    if (z4 || z3) {
                        bpn0 bpn0Var2 = pla.a;
                        if (bpn0Var2 == null) {
                            bpn0Var2 = null;
                        }
                        l7v b2 = ((wvw) bpn0Var2.getValue()).b();
                        String id2 = HintId.CLIPS_TREND_VIEWER_CAMERA.getId();
                        Hint p2 = b2.p(id2);
                        if (p2 != null && b2.a(id2)) {
                            singletonList4 = Collections.singletonList(new npf.f.b(p2, ClipsWrapperHintButtonPosition.Main));
                            ptfVar = this.l;
                            if (!ptfVar.d && ((ttfVar2 instanceof ttf.i.b) || z2)) {
                                ptfVar.d = true;
                                if (ptfVar.c && ptfVar.a.D() && ptfVar.b.f().c()) {
                                    id = HintId.CLIPS_HEADER_SHOPS_TAB_ONBOARDING.getId();
                                    bpn0Var = pla.a;
                                    if (bpn0Var == null) {
                                        bpn0Var = null;
                                    }
                                    b = ((wvw) bpn0Var.getValue()).b();
                                    if (b.a(id) && (p = b.p(id)) != null) {
                                        str = p.c;
                                        if (str == null) {
                                            str = "";
                                        }
                                        singletonList5 = Collections.singletonList(new npf.m(str, id));
                                        if (singletonList6 != null) {
                                            arrayList.addAll(singletonList6);
                                        }
                                        if (singletonList != null) {
                                            arrayList.addAll(singletonList);
                                        }
                                        if (singletonList2 != null) {
                                            arrayList.addAll(singletonList2);
                                        }
                                        if (singletonList3 != null) {
                                            arrayList.addAll(singletonList3);
                                        }
                                        if (singletonList4 != null) {
                                            arrayList.addAll(singletonList4);
                                        }
                                        if (singletonList5 != null) {
                                            arrayList.addAll(singletonList5);
                                        }
                                        if (arrayList.isEmpty()) {
                                            return arrayList;
                                        }
                                        return null;
                                    }
                                }
                            }
                            singletonList5 = null;
                            if (singletonList6 != null) {
                            }
                            if (singletonList != null) {
                            }
                            if (singletonList2 != null) {
                            }
                            if (singletonList3 != null) {
                            }
                            if (singletonList4 != null) {
                            }
                            if (singletonList5 != null) {
                            }
                            if (arrayList.isEmpty()) {
                            }
                        }
                    }
                }
                singletonList4 = null;
                ptfVar = this.l;
                if (!ptfVar.d) {
                    ptfVar.d = true;
                    if (ptfVar.c) {
                        id = HintId.CLIPS_HEADER_SHOPS_TAB_ONBOARDING.getId();
                        bpn0Var = pla.a;
                        if (bpn0Var == null) {
                        }
                        b = ((wvw) bpn0Var.getValue()).b();
                        if (b.a(id)) {
                            str = p.c;
                            if (str == null) {
                            }
                            singletonList5 = Collections.singletonList(new npf.m(str, id));
                            if (singletonList6 != null) {
                            }
                            if (singletonList != null) {
                            }
                            if (singletonList2 != null) {
                            }
                            if (singletonList3 != null) {
                            }
                            if (singletonList4 != null) {
                            }
                            if (singletonList5 != null) {
                            }
                            if (arrayList.isEmpty()) {
                            }
                        }
                    }
                }
                singletonList5 = null;
                if (singletonList6 != null) {
                }
                if (singletonList != null) {
                }
                if (singletonList2 != null) {
                }
                if (singletonList3 != null) {
                }
                if (singletonList4 != null) {
                }
                if (singletonList5 != null) {
                }
                if (arrayList.isEmpty()) {
                }
            }
            singletonList3 = null;
            this.q.getClass();
            if (z) {
            }
            singletonList4 = null;
            ptfVar = this.l;
            if (!ptfVar.d) {
            }
            singletonList5 = null;
            if (singletonList6 != null) {
            }
            if (singletonList != null) {
            }
            if (singletonList2 != null) {
            }
            if (singletonList3 != null) {
            }
            if (singletonList4 != null) {
            }
            if (singletonList5 != null) {
            }
            if (arrayList.isEmpty()) {
            }
        }
        singletonList2 = null;
        tsf tsfVar2 = this.p;
        tsfVar2.getClass();
        if (z) {
        }
        if (aVar == null) {
        }
        if (aVar != null) {
        }
        singletonList3 = null;
        this.q.getClass();
        if (z) {
        }
        singletonList4 = null;
        ptfVar = this.l;
        if (!ptfVar.d) {
        }
        singletonList5 = null;
        if (singletonList6 != null) {
        }
        if (singletonList != null) {
        }
        if (singletonList2 != null) {
        }
        if (singletonList3 != null) {
        }
        if (singletonList4 != null) {
        }
        if (singletonList5 != null) {
        }
        if (arrayList.isEmpty()) {
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.g.x(this.f);
    }
}
