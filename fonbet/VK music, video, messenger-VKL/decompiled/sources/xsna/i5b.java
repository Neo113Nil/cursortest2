package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.channels.impl.channel_screen.search.ChannelMsgSearchFragment;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.im.engine.models.messages.Msg;
import com.vk.lists.DefaultErrorView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.r5b;

/* compiled from: ChannelMsgSearchComponent.kt */
/* loaded from: classes16.dex */
public final class i5b extends j8i implements s5b {
    public static final /* synthetic */ qcy<Object>[] t;
    public final a1w i;
    public final Context j;
    public final long k;
    public final Object l;
    public final Object m;
    public final g9e0 n;
    public final Handler o;
    public io.reactivex.rxjava3.disposables.c p;
    public io.reactivex.rxjava3.disposables.c q;
    public final p5b r;
    public ChannelMsgSearchFragment.b s;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(i5b.class, "vc", "getVc()Lcom/vk/channels/impl/channel_screen/search/ChannelMsgSearchVc;", 0);
        fpf0.a.getClass();
        t = new qcy[]{propertyReference1Impl};
    }

    public i5b(a1w a1wVar, Context context, long j) {
        this.i = a1wVar;
        this.j = context;
        this.k = j;
        s5 s5Var = new s5(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, s5Var);
        this.m = msy.a(lazyThreadSafetyMode, new t5(this, 16));
        this.n = new g9e0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 15));
        this.o = new Handler(Looper.getMainLooper());
        this.r = new p5b(0);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = ((lxa) this.m.getValue()).e.a0(io.reactivex.rxjava3.android.schedulers.a.b());
        defpackage.x xVar = new defpackage.x(new ix2(this, 14), 9);
        int i = kwg0.a;
        I0(a0.subscribe(xVar, new jwg0("ChannelMsgSearchComponent")));
        final r5b Y0 = Y0();
        Context context = Y0.b;
        View inflate = Y0.c.inflate(R.layout.im_channel_msg_search_fragment, viewGroup, false);
        Y0.f = inflate;
        VkSearchView vkSearchView = (VkSearchView) inflate.findViewById(R.id.channel_msg_search_view);
        Y0.g = vkSearchView;
        vkSearchView.setHint(R.string.vkim_msg_search_hint);
        VkSearchView vkSearchView2 = Y0.g;
        if (vkSearchView2 == null) {
            vkSearchView2 = null;
        }
        vkSearchView2.setOnBackClickListener(new h6(Y0, 14));
        View view = Y0.f;
        if (view == null) {
            view = null;
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.channel_msg_search_recycler_view);
        Y0.h = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = Y0.h;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(Y0.d);
        RecyclerView recyclerView3 = Y0.h;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setItemAnimator(null);
        RecyclerView recyclerView4 = Y0.h;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        int i2 = 8;
        recyclerView4.addItemDecoration(new ujq(iah0.a(8), iah0.a(12), 5));
        j5b j5bVar = new j5b(context);
        Y0.e = j5bVar;
        RecyclerView recyclerView5 = Y0.h;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        recyclerView5.addItemDecoration(j5bVar);
        RecyclerView recyclerView6 = Y0.h;
        if (recyclerView6 == null) {
            recyclerView6 = null;
        }
        recyclerView6.addOnScrollListener(new r5b.a(Y0.a));
        View view2 = Y0.f;
        if (view2 == null) {
            view2 = null;
        }
        Y0.i = view2.findViewById(R.id.channel_msg_search_progress);
        View view3 = Y0.f;
        if (view3 == null) {
            view3 = null;
        }
        Y0.j = view3.findViewById(R.id.channel_msg_search_empty);
        View view4 = Y0.f;
        if (view4 == null) {
            view4 = null;
        }
        DefaultErrorView defaultErrorView = (DefaultErrorView) view4.findViewById(R.id.channel_msg_search_error_view);
        Y0.k = defaultErrorView;
        defaultErrorView.setRetryClickListener(new xa80() { // from class: xsna.q5b
            @Override // xsna.xa80
            public final void b() {
                r5b.this.a.e();
            }
        });
        io.reactivex.rxjava3.disposables.c cVar = Y0.n;
        if (cVar != null) {
            cVar.dispose();
        }
        VkSearchView vkSearchView3 = Y0.g;
        if (vkSearchView3 == null) {
            vkSearchView3 = null;
        }
        Y0.n = d02.y(vkSearchView3, 300L, 2).subscribe(new t00(Y0, i2), new jwg0("ChannelMsgSearchVc"));
        View view5 = Y0.f;
        if (view5 == null) {
            return null;
        }
        return view5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j8i
    public final void M0() {
        ((lxa) this.m.getValue()).destroy();
    }

    @Override // xsna.j8i
    public final void N0() {
        this.o.removeCallbacksAndMessages(null);
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.p = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.q;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.q = null;
        r5b Y0 = Y0();
        Y0.l.removeCallbacksAndMessages(null);
        io.reactivex.rxjava3.disposables.c cVar3 = Y0.n;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        Y0.n = null;
        this.n.a();
    }

    @Override // xsna.s5b
    public final void S() {
        ChannelMsgSearchFragment.b bVar = this.s;
        if (bVar != null) {
            ChannelMsgSearchFragment.this.finish();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void X0(boolean z, Integer num) {
        io.reactivex.rxjava3.core.x l;
        String str = this.r.b;
        m5b m5bVar = (m5b) this.l.getValue();
        m5bVar.getClass();
        if (str.length() == 0) {
            l = io.reactivex.rxjava3.core.x.k(new o5b(0));
        } else {
            l = m5bVar.a.C(m5bVar, new o3b(this.k, str, num)).q(asu0.a.c()).l(new com.vk.movika.sdk.base.hooks.f(new dj1(6), 6));
        }
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(l.q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.schedulers.a.b()).l(new com.vk.movika.sdk.base.flow.binding.c(new g5b(str, 0), 12)).m(asu0.a.d()), new defpackage.p(new h5b(this, z, 0), 8)), new u30(this, 1)).subscribe(new tz(new mt2(z, this, 1), 8), new c40(new lz0(this, 12), 8));
        this.p = subscribe;
        I0(subscribe);
    }

    public final r5b Y0() {
        qcy<Object> qcyVar = t[0];
        return (r5b) this.n.b();
    }

    public final void Z0(String str) {
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.p = null;
        p5b p5bVar = this.r;
        p5bVar.a.clear();
        p5bVar.g.clear();
        p5bVar.c = null;
        p5bVar.d = false;
        p5bVar.e = false;
        p5bVar.b = str;
        if (str.length() == 0) {
            Y0().a(p5bVar);
            return;
        }
        p5bVar.e = true;
        Y0().c();
        X0(true, null);
    }

    @Override // xsna.s5b
    public final void a(String str) {
        String obj = drm0.p0(str).toString();
        if (epx.f(this.r.b, obj)) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.q;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = io.reactivex.rxjava3.core.q.B0(300L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        m5 m5Var = new m5(new defpackage.o(7, this, obj), 11);
        int i = kwg0.a;
        io.reactivex.rxjava3.disposables.c subscribe = a0.subscribe(m5Var, new jwg0("ChannelMsgSearchComponent"));
        this.q = subscribe;
        if (subscribe != null) {
            I0(subscribe);
        }
    }

    @Override // xsna.s5b
    public final void c() {
        if (this.p != null) {
            return;
        }
        p5b p5bVar = this.r;
        if (p5bVar.d && p5bVar.b.length() != 0) {
            X0(false, p5bVar.c);
        }
    }

    @Override // xsna.s5b
    public final void e() {
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.p = null;
        p5b p5bVar = this.r;
        String str = p5bVar.b;
        p5bVar.a.clear();
        p5bVar.g.clear();
        p5bVar.c = null;
        p5bVar.d = false;
        p5bVar.e = false;
        p5bVar.b = str;
        if (str.length() > 0) {
            X0(true, null);
        }
    }

    @Override // xsna.s5b
    public final void x(Msg msg) {
        ChannelMsgSearchFragment.b bVar = this.s;
        if (bVar != null) {
            ChannelMsgSearchFragment channelMsgSearchFragment = ChannelMsgSearchFragment.this;
            zdw zdwVar = i7o0.b;
            if (zdwVar == null) {
                zdwVar = null;
            }
            zdwVar.d().a().c(channelMsgSearchFragment.requireContext(), ((Number) channelMsgSearchFragment.O.getValue()).longValue(), new ChannelHistoryOpenMode.OpenAtMsgByCnvId(msg.d), null);
        }
    }
}
