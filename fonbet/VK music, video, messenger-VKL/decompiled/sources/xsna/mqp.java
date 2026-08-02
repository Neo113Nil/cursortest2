package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.common.domain.model.AddLikeAction;
import com.vk.newsfeed.impl.util.NewsEntryWatcherMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.h0x;
import xsna.hb60;
import xsna.hux;

/* compiled from: EntriesListFieldsProviderDelegate.kt */
/* loaded from: classes4.dex */
public final class mqp implements w8i {
    public static final Object S;
    public static final Object T;
    public final n2r<u1c0> A;
    public final a B;
    public final cqp C;
    public qg1 D;
    public d3f0 E;
    public final Object F;
    public boolean G;
    public final hjf0 H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final b2c0 O;
    public final Object P;
    public final Object Q;
    public final mbs R;
    public final dqp b;
    public final Object c;
    public final FragmentImpl d;
    public final Object e;
    public final Object f;
    public final Object g;
    public RecyclerPaginatedView h;
    public final fa60 i;
    public final Object j;
    public final Object k;
    public final Object l;
    public ehv m;
    public qql0 n;
    public xdx o;
    public hbt0 p;
    public qt3 q;
    public rwc0<? extends pwc0> r;
    public VkContextMenu s;
    public boolean t;
    public xif0 u;
    public final ib60 v;
    public final h0x w;
    public final Object x;
    public final a4r y;
    public final Object z;

    /* compiled from: EntriesListFieldsProviderDelegate.kt */
    public final class a extends vw60 {
    }

    /* compiled from: EntriesListFieldsProviderDelegate.kt */
    public static final class b implements h7o {
        public b() {
        }

        @Override // xsna.h7o
        public final void a(Context context, NewsEntry newsEntry, String str) {
            c6z Q;
            String str2;
            ReactionMeta reactionMeta;
            Post R = di60.R(newsEntry);
            if ((R == null || !di60.p(R)) && !di60.q(newsEntry)) {
                return;
            }
            Post R2 = di60.R(newsEntry);
            if ((R2 == null || !R2.Z1()) && (Q = di60.Q(newsEntry)) != null) {
                if (Q.J()) {
                    str2 = str;
                    reactionMeta = null;
                } else {
                    o2f0 o2f0Var = Q instanceof o2f0 ? (o2f0) Q : null;
                    ReactionMeta R3 = o2f0Var != null ? o2f0Var.R3() : null;
                    str2 = str;
                    mqp.this.y.g(new hux.b.a(str2, newsEntry));
                    reactionMeta = R3;
                }
                boolean z = !Q.J();
                String h = AddLikeAction.TriggerType.DOUBLE_TAP.h();
                if (Q instanceof bss0) {
                    Serializer.c<Videos> cVar = Videos.CREATOR;
                    Q = Videos.a.a(((bss0) Q).t());
                }
                iuc0.b.f(context, new l6z(Q, z, reactionMeta, str2, null, h), null, null);
            }
        }
    }

    /* compiled from: EntriesListFieldsProviderDelegate.kt */
    public static final class c implements f5z {
        public final Object b;

        public c(mqp mqpVar) {
            this.b = msy.a(LazyThreadSafetyMode.NONE, new r5i(mqpVar, 13));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.f5z
        public final Lifecycle getLifecycle() {
            return (Lifecycle) this.b.getValue();
        }
    }

    /* compiled from: EntriesListFieldsProviderDelegate.kt */
    public static final class d extends z2f0 {
        public d() {
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void a() {
            hl60 hl60Var = hl60.a;
            hl60.b();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.z2f0, xsna.x2f0
        public final void b() {
            RecyclerView recyclerView;
            RecyclerPaginatedView recyclerPaginatedView = mqp.this.h;
            if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
                return;
            }
            hl60 hl60Var = hl60.a;
            hl60.j((ArrayList) mqp.S.getValue(), recyclerView, null, null, 28);
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void c() {
            hl60 hl60Var = hl60.a;
            hl60.b();
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void f(m3r m3rVar) {
            hl60 hl60Var = hl60.a;
            hl60.b();
            l7v b = pla.e().b();
            HintId hintId = HintId.BADGES_POST_FEED_NO_BADGES_UNSEEN;
            if (b.a(hintId.getId())) {
                m3rVar.post(new c5h(m3rVar, mqp.this, hintId.getId(), 1));
            }
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void i(Context context, u5f0 u5f0Var, ReactionMeta reactionMeta, a2f0 a2f0Var, p2f0 p2f0Var) {
            super.i(context, u5f0Var, reactionMeta, a2f0Var, p2f0Var);
            d3f0 d3f0Var = mqp.this.E;
            if (d3f0Var != null) {
                d3f0Var.a(new gii0(u5f0Var, reactionMeta, a2f0Var, p2f0Var));
            }
        }
    }

    /* compiled from: EntriesListFieldsProviderDelegate.kt */
    public static final class e implements h0x.a {
        public final float a = 75 / 100.0f;
        public final long b;
        public final long c;
        public final /* synthetic */ mqp d;

        public e(long j, long j2, mqp mqpVar) {
            this.d = mqpVar;
            this.b = j;
            this.c = j2;
        }

        @Override // xsna.h0x.a
        public final void a(List<? extends NewsEntry> list) {
            mqp mqpVar = this.d;
            mqpVar.y.i(new k75(6, list, mqpVar));
        }

        @Override // xsna.h0x.a
        public final void b(List<? extends NewsEntry> list) {
            mqp mqpVar = this.d;
            mqpVar.y.i(new com.vk.movika.sdk.android.defaultplayer.container.e(9, list, mqpVar));
        }

        @Override // xsna.h0x.a
        public final long c() {
            return this.b;
        }

        @Override // xsna.h0x.a
        public final long d() {
            return this.c;
        }

        @Override // xsna.h0x.a
        public final float e() {
            return this.a;
        }
    }

    static {
        com.vk.movika.sdk.base.ui.o0 o0Var = new com.vk.movika.sdk.base.ui.o0(15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        S = msy.a(lazyThreadSafetyMode, o0Var);
        T = msy.a(lazyThreadSafetyMode, new jg0(19));
    }

    public mqp(dqp dqpVar, fqp fqpVar, FragmentImpl fragmentImpl, zqw zqwVar) {
        this.b = dqpVar;
        this.c = fqpVar;
        this.d = fragmentImpl;
        mxj mxjVar = new mxj(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, mxjVar);
        this.f = msy.a(lazyThreadSafetyMode, new foi(this, 5));
        this.g = msy.a(lazyThreadSafetyMode, new tbg(this, 17));
        fa60 fa60Var = new fa60();
        this.i = fa60Var;
        new m3a(fa60Var);
        this.j = msy.a(lazyThreadSafetyMode, new f20(14));
        this.k = msy.a(lazyThreadSafetyMode, new wb1(12));
        this.l = msy.a(lazyThreadSafetyMode, new dv2(16));
        this.v = new ib60();
        this.w = new h0x();
        this.x = msy.a(lazyThreadSafetyMode, new pvh(this, 5));
        a4r a4rVar = new a4r();
        this.y = a4rVar;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new kk1(9));
        this.z = a2;
        n2r<u1c0> n2rVar = new n2r<>(Collections.singletonList(new fac0()));
        this.A = n2rVar;
        a aVar = new a();
        aVar.l(new lqp(this));
        this.B = aVar;
        this.C = new cqp(fqpVar, dqpVar, a4rVar);
        this.F = msy.a(lazyThreadSafetyMode, new ig(9));
        this.H = new hjf0(new nef(this, 10));
        b bVar = new b();
        this.I = msy.a(lazyThreadSafetyMode, new jcg(this, 15));
        this.J = msy.a(lazyThreadSafetyMode, new g4g(this, 14));
        int i = 11;
        this.K = msy.a(lazyThreadSafetyMode, new z0h(this, i));
        this.L = msy.a(lazyThreadSafetyMode, new drg(this, i));
        this.M = msy.a(lazyThreadSafetyMode, new wqf(this, 16));
        this.N = msy.a(lazyThreadSafetyMode, new trf(this, 21));
        b2c0 b2c0Var = new b2c0(dqpVar.r0(), (Lazy<? extends g3f0>) msy.a(lazyThreadSafetyMode, new pce(this, 23)));
        b2c0Var.l = new com.vk.movika.sdk.base.ui.p0(this, 19);
        b2c0Var.m = fqpVar;
        bkf0 bkf0Var = new bkf0(new m1o(this, 1), new btm(this, 3), new tbh(this, 12), dqpVar, new wv2(1, this, mqp.class, "trackViewPostEvent", "trackViewPostEvent(Lcom/vk/newsfeed/api/data/PostDisplayItem;)V", 0, 5), bVar);
        n2rVar.b(bkf0Var);
        b2c0Var.n = bkf0Var;
        fgm fgmVar = new fgm(this, 5);
        b2c0Var.f = fgmVar;
        y1c0 y1c0Var = b2c0Var.p;
        y1c0Var.Q = fgmVar;
        maj majVar = new maj(this, 11);
        b2c0Var.g = majVar;
        y1c0Var.P = majVar;
        y1c0Var.O = zqwVar;
        b2c0Var.j = (com.vk.stat.recycler.d) a2.getValue();
        this.O = b2c0Var;
        this.P = msy.a(lazyThreadSafetyMode, new n1i(this, 5));
        this.Q = msy.a(lazyThreadSafetyMode, new sbg(this, 16));
        this.R = new mbs();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final gqp a() {
        return (gqp) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final jhv b() {
        return (jhv) this.j.getValue();
    }

    public final RecyclerView c() {
        RecyclerPaginatedView recyclerPaginatedView = this.h;
        if (recyclerPaginatedView != null) {
            return recyclerPaginatedView.getRecyclerView();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final AudienceResearchComponent d() {
        return (AudienceResearchComponent) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final w5r0 e() {
        return (w5r0) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(FragmentActivity fragmentActivity) {
        uah0 uah0Var = new uah0(0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 13);
        hbt0 hbt0Var = new hbt0(fragmentActivity, this.C, (androidx.lifecycle.m) this.P.getValue(), uah0Var, null, 131056);
        this.B.l(hbt0Var);
        this.p = hbt0Var;
    }

    public final void g() {
        qt3 qt3Var = this.q;
        rwc0<? extends pwc0> rwc0Var = this.r;
        FragmentActivity activity = this.d.getActivity();
        if (activity == null || qt3Var == null) {
            return;
        }
        a().e(activity, qt3Var, rwc0Var);
    }

    public final void h(FragmentActivity fragmentActivity) {
        ehv ehvVar = new ehv(fragmentActivity, this.C, b());
        this.B.l(ehvVar);
        this.m = ehvVar;
    }

    public final void i() {
        RecyclerView c2 = c();
        if (c2 != null) {
            this.u = new xif0(c2);
        }
    }

    public final boolean j() {
        Bundle arguments = this.d.getArguments();
        return arguments != null && arguments.getBoolean("tab_mode");
    }

    public final void k(s1c0 s1c0Var) {
        boolean z = s1c0Var.w || s1c0Var.v;
        this.w.c = new e(z ? 0L : 1500L, z ? 1500L : 4500L, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void l() {
        hb60.a aVar = (hb60.a) this.K.getValue();
        NewsEntryWatcherMode newsEntryWatcherMode = NewsEntryWatcherMode.FAST;
        ib60 ib60Var = this.v;
        ib60Var.a(aVar, newsEntryWatcherMode);
        ib60Var.a((hb60.a) this.J.getValue(), NewsEntryWatcherMode.NORMAL);
        ib60Var.a((td60) this.L.getValue(), NewsEntryWatcherMode.NORMAL);
        ib60Var.a((gsi) this.M.getValue(), NewsEntryWatcherMode.NORMAL);
        ib60Var.a((bb4) this.N.getValue(), NewsEntryWatcherMode.HALF);
    }
}
