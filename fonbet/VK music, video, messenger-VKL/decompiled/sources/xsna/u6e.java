package xsna;

import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c2r;
import xsna.ea90;
import xsna.q4r;
import xsna.qvq;
import xsna.uyq;

/* compiled from: ClipsFeedFeature.kt */
/* loaded from: classes17.dex */
public final class u6e extends wk50<e5r, q4r, qvq, c2r> {
    public final wyq f;
    public final p8e g;
    public final f4z h;
    public final d80 i;
    public final mj50<q4r, qvq, c2r> j;
    public final mj50<q4r, qvq, c2r> k;
    public final mj50<q4r, qvq, c2r> l;
    public final mj50<q4r, qvq, c2r> m;
    public final mj50<q4r, qvq, c2r> n;
    public final mj50<q4r, qvq, c2r> o;
    public final mj50<q4r, qvq, c2r> p;
    public final mj50<q4r, qvq, c2r> q;
    public final mj50<q4r, qvq, c2r> r;
    public final mj50<q4r, qvq, c2r> s;
    public final mj50<q4r, qvq, c2r> t;
    public final mj50<q4r, qvq, c2r> u;
    public final mj50<q4r, qvq, c2r> v;
    public final mj50<q4r, qvq, c2r> w;
    public final mj50<q4r, qvq, c2r> x;
    public final mj50<q4r, qvq, c2r> y;
    public final mj50<q4r, qvq, c2r> z;

    /* compiled from: ClipsFeedFeature.kt */
    public static final class a {
        public static SdkVideoFile a(v6e v6eVar) {
            ClipFeedTab clipFeedTab = v6eVar.b;
            kwc kwcVar = v6eVar.a;
            if (kwcVar != null) {
                List<SdkVideoFile> list = kwcVar.a;
                if (!list.isEmpty()) {
                    return list.get(kwcVar.c);
                }
            }
            if (clipFeedTab instanceof ClipFeedTab.SingleAdv) {
                return ((ClipFeedTab.SingleAdv) clipFeedTab).b;
            }
            if (clipFeedTab instanceof ClipFeedTab.SingleClip) {
                return ((ClipFeedTab.SingleClip) clipFeedTab).b;
            }
            if (clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) {
                ClipFeedTab.SingleClipWithDecoration singleClipWithDecoration = (ClipFeedTab.SingleClipWithDecoration) clipFeedTab;
                if (singleClipWithDecoration.i == ClipFeedTab.SingleClipWithDecoration.FeedType.SingleClipWithRecom) {
                    return singleClipWithDecoration.b;
                }
            }
            if (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) {
                return ((ClipFeedTab.SingleClipFromBlock) clipFeedTab).b;
            }
            if (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) {
                return ((ClipFeedTab.NewsfeedDiscoverMedia) clipFeedTab).b;
            }
            if (clipFeedTab instanceof ClipFeedTab.ClipsFromShopsSource.WithVideo) {
                return ((ClipFeedTab.ClipsFromShopsSource.WithVideo) clipFeedTab).c;
            }
            if (clipFeedTab instanceof ClipFeedTab.NewsMonotheme) {
                return ((ClipFeedTab.NewsMonotheme) clipFeedTab).d;
            }
            return null;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r10v40 ??), method size: 3075
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public u6e(xsna.v6e r32, xsna.s8e r33, xsna.i4r r34, xsna.myc r35, xsna.wyq r36, xsna.qvq.f r37, xsna.p8e r38) {
        /*
            Method dump skipped, instructions count: 3075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.u6e.<init>(xsna.v6e, xsna.s8e, xsna.i4r, xsna.myc, xsna.wyq, xsna.qvq$f, xsna.p8e):void");
    }

    @Override // xsna.wk50
    public final void N(q4r q4rVar, qvq qvqVar) {
        FeedItem feedItem;
        int o0;
        SdkOwner s;
        UserId userId;
        SdkOwner s2;
        UserId userId2;
        q4r q4rVar2 = q4rVar;
        qvq qvqVar2 = qvqVar;
        if (qvqVar2 instanceof qvq.f) {
            this.j.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.n) {
            this.h.b(uyq.d.a);
            p8e p8eVar = this.g;
            if (p8eVar != null) {
                synchronized (p8eVar) {
                    p8eVar.c.clear();
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            this.n.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.i) {
            this.k.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.b) {
            this.m.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.r) {
            qvq.r rVar = (qvq.r) qvqVar2;
            mj50<q4r, qvq, c2r> mj50Var = this.k;
            if (q4rVar2 instanceof q4r.b) {
                this.j.a(q4rVar2, qvq.f.a.b);
                return;
            }
            if (q4rVar2 instanceof q4r.a) {
                boolean z = rVar.b;
                if (z && (((q4r.a) q4rVar2).e.b instanceof ea90.a.C2790a)) {
                    mj50Var.a(q4rVar2, new qvq.i.c(true));
                    return;
                } else {
                    if (z || !(((q4r.a) q4rVar2).d.b instanceof ea90.a.C2790a)) {
                        return;
                    }
                    mj50Var.a(q4rVar2, new qvq.i.c(false));
                    return;
                }
            }
            return;
        }
        if (qvqVar2 instanceof qvq.o) {
            this.o.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.v) {
            this.p.a(q4rVar2, qvqVar2);
            return;
        }
        long j = 0;
        String str = null;
        if (qvqVar2 instanceof qvq.h) {
            qvq.h hVar = (qvq.h) qvqVar2;
            if (q4rVar2 instanceof q4r.a) {
                T(new c2r.b(hVar.b));
                q4r.a aVar = (q4r.a) q4rVar2;
                if (aVar.l != null) {
                    c1r c1rVar = aVar.b().get(hVar.b);
                    int i = c1rVar != null ? c1rVar.b : -1;
                    c1r c1rVar2 = aVar.b().get(aVar.l.a);
                    if (i >= (c1rVar2 != null ? c1rVar2.b : -1)) {
                        FeedItem feedItem2 = aVar.b.a.get(i);
                        SdkClipVideoFile k = feedItem2 instanceof FeedItem.l ? ((FeedItem.l) feedItem2).k() : null;
                        if (feedItem2 instanceof FeedItem.n) {
                            str = ((FeedItem.n) feedItem2).k().r();
                        } else if (feedItem2 instanceof FeedItem.j) {
                            str = ((FeedItem.j) feedItem2).h;
                        } else if (feedItem2 instanceof FeedItem.m) {
                            str = ((FeedItem.m) feedItem2).g;
                        }
                        if (str == null) {
                            str = "";
                        }
                        f4z f4zVar = this.h;
                        xgq xgqVar = aVar.l.b;
                        o0 = k != null ? k.o0() : 0;
                        if (k != null && (s2 = k.s()) != null && (userId2 = s2.b) != null) {
                            j = userId2.b;
                        }
                        f4zVar.b(new uyq.i(xgqVar, new ClipViewerAnalyticsEvent.FloatingButtonEvent.a(o0, j, str)));
                        T(c2r.c.b);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (qvqVar2 instanceof qvq.x) {
            this.q.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.u) {
            this.r.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.q) {
            this.s.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.w) {
            this.t.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.g) {
            this.u.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.c) {
            this.x.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.t) {
            ((bjh0) this.f.g.getValue()).a();
            return;
        }
        if (qvqVar2 instanceof qvq.d) {
            this.v.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.m) {
            this.w.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.l) {
            this.y.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.j) {
            this.z.a(q4rVar2, qvqVar2);
            return;
        }
        if (qvqVar2 instanceof qvq.p) {
            T(new e2r(((qvq.p) qvqVar2).b));
            return;
        }
        if (qvqVar2 instanceof qvq.s) {
            qvq.s sVar = (qvq.s) qvqVar2;
            f4z f4zVar2 = this.h;
            if (q4rVar2 instanceof q4r.a) {
                if (sVar instanceof qvq.s.b) {
                    f4zVar2.b(new uyq.g.a.C3857a(new qvq.s.a(((qvq.s.b) sVar).b)));
                    return;
                } else {
                    if (!(sVar instanceof qvq.s.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f4zVar2.b(new uyq.b(((qvq.s.a) sVar).b));
                    return;
                }
            }
            return;
        }
        if (qvqVar2 instanceof qvq.k) {
            qvq.k kVar = (qvq.k) qvqVar2;
            f4z f4zVar3 = this.h;
            if (q4rVar2 instanceof q4r.a) {
                if (kVar instanceof qvq.k.a) {
                    qvq.k.a aVar2 = (qvq.k.a) kVar;
                    f4zVar3.b(new uyq.h(aVar2.c, aVar2.b));
                    return;
                } else {
                    if (!(kVar instanceof qvq.k.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qvq.k.b bVar = (qvq.k.b) kVar;
                    f4zVar3.b(new uyq.j(bVar.c, bVar.b));
                    return;
                }
            }
            return;
        }
        if (!(qvqVar2 instanceof qvq.e)) {
            if (!(qvqVar2 instanceof qvq.a)) {
                throw new NoWhenBranchMatchedException();
            }
            mj50<q4r, qvq, c2r> mj50Var2 = this.l;
            if (mj50Var2 != null) {
                mj50Var2.a(q4rVar2, qvqVar2);
                return;
            }
            return;
        }
        qvq.e eVar = (qvq.e) qvqVar2;
        if (q4rVar2 instanceof q4r.a) {
            q4r.a aVar3 = (q4r.a) q4rVar2;
            c1r c1rVar3 = aVar3.b().get(aVar3.g);
            if (c1rVar3 == null || (feedItem = c1rVar3.a) == null) {
                return;
            }
            SdkClipVideoFile k2 = feedItem instanceof FeedItem.l ? ((FeedItem.l) feedItem).k() : null;
            if (feedItem instanceof FeedItem.n) {
                str = ((FeedItem.n) feedItem).k().r();
            } else if (feedItem instanceof FeedItem.j) {
                str = ((FeedItem.j) feedItem).h;
            } else if (feedItem instanceof FeedItem.m) {
                str = ((FeedItem.m) feedItem).g;
            }
            if (str == null) {
                str = "";
            }
            f4z f4zVar4 = this.h;
            String str2 = eVar.b;
            ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType eventType = eVar.c;
            o0 = k2 != null ? k2.o0() : 0;
            if (k2 != null && (s = k2.s()) != null && (userId = s.b) != null) {
                j = userId.b;
            }
            f4zVar4.b(new uyq.c(str2, eventType, new ClipViewerAnalyticsEvent.FloatingButtonEvent.a(o0, j, str)));
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        wyq wyqVar = this.f;
        b25 b25Var = wyqVar.f.a;
        b25Var.B(new e180(this.i, new e25(b25Var)));
        ((bjh0) wyqVar.g.getValue()).a();
        super.onDestroy();
    }
}
