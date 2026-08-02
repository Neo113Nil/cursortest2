package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.live.chat.ChatChangeVisibilityView;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.live.LiveEventModel;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.libvideo.live.impl.views.chat.LiveRecycleView;
import com.vk.libvideo.live.impl.views.chat.a;
import com.vk.libvideo.live.impl.views.chat.c;
import com.vk.libvideo.live.impl.views.chat.elements.Comment;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import xsna.av20;
import xsna.dw20;
import xsna.h30;

/* compiled from: ChatView.java */
/* loaded from: classes16.dex */
public final class nzb extends LinearLayout implements rpb, c30 {
    public final LiveRecycleView b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final LinearLayoutManager e;
    public final ChatChangeVisibilityView f;
    public final View g;
    public final Comment h;
    public qpb i;
    public boolean j;
    public boolean k;
    public final kzb l;
    public int m;
    public izs<Integer, s3q0> n;
    public b30 o;
    public int p;
    public final f q;
    public final int r;
    public final int s;

    /* compiled from: ChatView.java */
    public class d implements gzs<s3q0> {
        public d() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            h30 h30Var = (h30) nzb.this.o;
            if (h30Var.q != null && !h30Var.r.a()) {
                if (h30Var.d) {
                    Context context = h30Var.b;
                    Activity h = e3m.h(context);
                    dhr0.a.getClass();
                    int i = dhr0.u().c;
                    l7s l7sVar = new l7s(h, dhr0.u().c);
                    av20.a aVar = new av20.a();
                    aVar.d(R.layout.actions_popup_item, LayoutInflater.from(l7sVar));
                    aVar.d = new i30(l7sVar);
                    aVar.e = new j30(h30Var, h);
                    av20 b = aVar.b();
                    ArrayList arrayList = new ArrayList();
                    ActionLink actionLink = h30Var.q;
                    if (actionLink != null && epx.f(actionLink.c, "poll")) {
                        arrayList.add(h30.a.GOTO);
                    }
                    arrayList.add(h30.a.CHANGE);
                    arrayList.add(h30.a.DELETE);
                    b.setItems(arrayList);
                    h30Var.p = ((dw20.b) dw20.a.k(new dw20.b(e3m.h(context), null), b, 4)).I0("ALPRESENTER");
                    return null;
                }
                h30Var.a();
            }
            return null;
        }
    }

    /* compiled from: ChatView.java */
    public class e implements gzs<s3q0> {
        public e() {
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.gzs
        public final s3q0 invoke() {
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
            h30 h30Var = (h30) nzb.this.o;
            VideoFile videoFile = h30Var.c;
            ActionLink actionLink = h30Var.q;
            if (actionLink == null || h30Var.r.a()) {
                return null;
            }
            ActionLinkSnippet actionLinkSnippet = actionLink.f;
            Good good = actionLinkSnippet != null ? actionLinkSnippet.j : null;
            String str = good != null ? good.K : null;
            if (str == null || !myc0.f(str)) {
                h30Var.a();
                return null;
            }
            d30 d30Var = h30Var.l;
            int o0 = videoFile.o0();
            UserId I0 = videoFile.I0();
            lt00 lt00Var = (lt00) d30Var.b.getValue();
            MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType = MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK;
            long j = good.b;
            UserId userId = good.c;
            UiTrackingScreen b = UiTracker.j.b();
            if (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
            }
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = mobileOfficialAppsCoreNavStat$EventScreen;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.LIVES_SNIPPET;
            lt00Var.f(new MarketCtaButtonAnalyticsParams(eventType, j, userId, null, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen2, null, null, null, null, null, null, null, null, Integer.valueOf(o0), Long.valueOf(I0.b), CommonMarketStat$TypeMarketContextContent.Type.LIVE, null, null, null, null, 1982400, null));
            maz.c(h30Var.k, h30Var.b, str, new LaunchContext(false, false, false, null, null, null, null, null, str, "stream", null, false, false, false, null, null, null, null, commonMarketStat$TypeRefSource, false, false, null, null, null, 66059519), null, null, 24);
            return null;
        }
    }

    /* compiled from: ChatView.java */
    public class f extends RecyclerView.i {
        public f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            nzb.c(nzb.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            nzb.c(nzb.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            nzb.c(nzb.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            nzb.c(nzb.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            nzb.c(nzb.this);
        }
    }

    public nzb(Context context, boolean z) {
        super(context, null, 0);
        this.k = false;
        this.p = 0;
        this.r = iah0.a(54.0f);
        this.s = iah0.a(430.0f);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_chat, (ViewGroup) this, true);
        setOrientation(1);
        setGravity(80);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        ChatChangeVisibilityView chatChangeVisibilityView = (ChatChangeVisibilityView) inflate.findViewById(R.id.live_chat_change_visibility);
        this.f = chatChangeVisibilityView;
        LiveRecycleView liveRecycleView = (LiveRecycleView) inflate.findViewById(R.id.liveChatRecycle);
        this.b = liveRecycleView;
        this.d = (FrameLayout) inflate.findViewById(R.id.liveChatActionLinkHolder);
        this.g = inflate.findViewById(R.id.live_chat_comments_container);
        Comment comment = (Comment) inflate.findViewById(R.id.live_pinned_comment);
        this.h = comment;
        comment.setLikesEnabled(false);
        liveRecycleView.setHasFixedSize(true);
        liveRecycleView.getItemAnimator().s();
        liveRecycleView.getItemAnimator().v();
        liveRecycleView.setOverScrollMode(2);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.liveChatNewComments);
        this.c = frameLayout;
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.e = linearLayoutManager;
        linearLayoutManager.L(true);
        linearLayoutManager.l = true;
        liveRecycleView.setVerticalFadingEdgeEnabled(true);
        if (z) {
            liveRecycleView.setTopFadingEdgeMode(new c.b(0.5f, -1));
            liveRecycleView.setBottomFadingEdgeMode(new c.b(0.3f, 1));
        } else {
            liveRecycleView.setTopFadingEdgeMode(new c.a());
            liveRecycleView.setBottomFadingEdgeMode(c.C1238c.a);
        }
        liveRecycleView.setFadingEdgeLength(iah0.a(30.0f));
        liveRecycleView.setLayoutManager(linearLayoutManager);
        this.q = new f();
        chatChangeVisibilityView.setOnClickListener(new x16(this, 3));
        if (z) {
            inflate.findViewById(R.id.liveChatNewCommentsTextDark).setVisibility(0);
        } else {
            inflate.findViewById(R.id.liveChatNewCommentsTextLight).setVisibility(0);
        }
        this.l = new kzb(this);
        frameLayout.setOnClickListener(new lzb(this));
        liveRecycleView.addOnScrollListener(new mzb(this));
    }

    public static void a(nzb nzbVar) {
        nzbVar.setNewCommentsVisibility(false);
        nzbVar.j = false;
        nzbVar.c4();
    }

    public static void c(nzb nzbVar) {
        RecyclerView.Adapter adapter = nzbVar.b.getAdapter();
        if (adapter != null) {
            nzbVar.f.setVisibility(adapter.getItemCount() > 0 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewCommentsVisibility(boolean z) {
        FrameLayout frameLayout = this.c;
        if (bwt0.K(frameLayout) == z) {
            return;
        }
        if (!z) {
            frameLayout.clearAnimation();
            frameLayout.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).setListener(new b()).start();
        } else {
            frameLayout.clearAnimation();
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(1.0f).setDuration(300L).start();
        }
    }

    @Override // xsna.rpb
    public final void C4(UserId userId, a.j jVar) {
        Context context = getContext();
        if (context != null) {
            xwk.e().h0().m(context, userId, new tb(jVar, 27), null);
        }
    }

    @Override // xsna.rpb
    public final void N1(LiveEventModel liveEventModel) {
        Comment comment = this.h;
        comment.setModel(liveEventModel);
        comment.setVisibility(0);
    }

    @Override // xsna.c30
    public final void P() {
        d1();
    }

    @Override // xsna.rpb
    public final void V1() {
        this.h.setVisibility(8);
    }

    @Override // xsna.rpb
    public final void b1(final boolean z, boolean z2) {
        int i = z ? 0 : 8;
        LiveRecycleView liveRecycleView = this.b;
        liveRecycleView.clearAnimation();
        if (z2) {
            if (z) {
                liveRecycleView.setVisibility(0);
            }
            this.g.animate().setDuration(300L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.jzb
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    nzb nzbVar = nzb.this;
                    View view = nzbVar.g;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    LiveRecycleView liveRecycleView2 = nzbVar.b;
                    boolean z3 = z;
                    liveRecycleView2.setAlpha(z3 ? animatedFraction : 1.0f - animatedFraction);
                    if (z3) {
                        animatedFraction = 1.0f - animatedFraction;
                    }
                    view.setTranslationY(animatedFraction * (view.getMeasuredHeight() - nzbVar.f.getMeasuredHeight()));
                }
            }).setListener(new a(z)).start();
        } else {
            liveRecycleView.setVisibility(i);
            liveRecycleView.setAlpha(1.0f);
        }
        if (z != this.j) {
            this.c.setVisibility(i);
        }
        ChatChangeVisibilityView chatChangeVisibilityView = this.f;
        if (chatChangeVisibilityView != null) {
            if (z) {
                chatChangeVisibilityView.setText(chatChangeVisibilityView.getContext().getString(R.string.live_chat_hide));
                his0.v(chatChangeVisibilityView, R.drawable.vk_icon_cancel_24, R.color.vk_white);
            } else {
                chatChangeVisibilityView.setText(chatChangeVisibilityView.getContext().getString(R.string.live_chat_show));
                his0.v(chatChangeVisibilityView, R.drawable.vk_icon_chevron_up_24, R.color.vk_white);
            }
        }
    }

    @Override // xsna.rpb
    public final void c4() {
        LiveRecycleView liveRecycleView = this.b;
        if (liveRecycleView != null) {
            if (!this.j) {
                liveRecycleView.scrollToPosition(liveRecycleView.getAdapter().getItemCount() - 1);
                liveRecycleView.postDelayed(this.l, 50L);
            } else if (this.i.A0()) {
                setNewCommentsVisibility(true);
            }
        }
        i0q0.d(1000L, new c());
    }

    public final void d() {
        if (this.o != null) {
            FrameLayout frameLayout = this.d;
            frameLayout.removeAllViews();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            marginLayoutParams.bottomMargin = this.p;
            marginLayoutParams.topMargin = iah0.a(10);
            t20 a2 = qhp0.a();
            Context context = getContext();
            boolean isStreaming = this.i.isStreaming();
            h30 h30Var = (h30) this.o;
            ActionLink actionLink = h30Var.q;
            Integer num = (Integer) h30Var.s.get(actionLink != null ? actionLink.e : null);
            this.n = a2.d(context, this.d, isStreaming, actionLink, num != null ? num.intValue() : 0, new d(), new e(), ((h30) this.o).c.o0(), ((h30) this.o).c.I0());
        }
    }

    @Override // xsna.rpb
    public final void d1() {
        boolean isStreaming = this.i.isStreaming();
        FrameLayout frameLayout = this.d;
        if (isStreaming) {
            if (((h30) this.o).q != null) {
                d();
                return;
            }
            frameLayout.removeAllViews();
            this.n = null;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.topMargin = 0;
            return;
        }
        boolean z = this.i.l0() || !o25.a().b();
        if (((h30) this.o).q != null && z) {
            d();
            return;
        }
        frameLayout.removeAllViews();
        this.n = null;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams2.bottomMargin = 0;
        marginLayoutParams2.topMargin = 0;
    }

    @Override // xsna.rpb
    public final void f2() {
        int w = this.e.w();
        LiveRecycleView liveRecycleView = this.b;
        int itemCount = liveRecycleView.getAdapter().getItemCount();
        if (liveRecycleView.getScrollState() == 0 && (itemCount == 0 || w == itemCount - 1)) {
            this.j = false;
        }
        liveRecycleView.requestLayout();
    }

    public b30 getActionLinksPresenter() {
        return this.o;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rpb
    public final void l3() {
        izs<Integer, s3q0> izsVar;
        b30 b30Var = this.o;
        if (b30Var == null || (izsVar = this.n) == null) {
            return;
        }
        h30 h30Var = (h30) b30Var;
        LinkedHashMap linkedHashMap = h30Var.s;
        ActionLink actionLink = h30Var.q;
        Integer num = (Integer) linkedHashMap.get(actionLink != null ? actionLink.e : null);
        izsVar.invoke(Integer.valueOf(num != null ? num.intValue() : 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int a2;
        measureChildWithMargins(this.d, i, 0, i2, 0);
        FrameLayout frameLayout = this.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        int measuredHeight = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + frameLayout.getMeasuredHeight();
        Comment comment = this.h;
        int i4 = 0;
        if (comment.getVisibility() != 8) {
            measureChildWithMargins(this.h, i, 0, i2, 0);
            i3 = comment.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        measureChildWithMargins(this.f, i, 0, i2, 0);
        int measuredHeight2 = this.f.getMeasuredHeight();
        Context context = getContext();
        HashSet hashSet = iah0.a;
        int a3 = iah0.a(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE) * (fnj.d(context) ? 2 : 1);
        if (iah0.r(getContext()) && !fnj.d(getContext())) {
            int i5 = ify.a;
            if (ify.e(ify.c) || this.k) {
                a2 = 0;
                int min = Math.min(lr.a(measuredHeight, i3, measuredHeight2, a3), (View.MeasureSpec.getSize(i2) - i4) - a2);
                float size = View.MeasureSpec.getSize(i);
                int min2 = Math.min(this.s, (int) (size - this.r));
                this.m = (int) (size * 0.085f);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(min2, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
            }
        }
        i4 = iah0.a(64.0f);
        a2 = iah0.a(35.0f);
        int min3 = Math.min(lr.a(measuredHeight, i3, measuredHeight2, a3), (View.MeasureSpec.getSize(i2) - i4) - a2);
        float size2 = View.MeasureSpec.getSize(i);
        int min22 = Math.min(this.s, (int) (size2 - this.r));
        this.m = (int) (size2 * 0.085f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min22, 1073741824), View.MeasureSpec.makeMeasureSpec(min3, 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i4 != i2) {
            this.c.setTranslationX(this.m);
        }
    }

    @Override // xsna.rr6
    public final void pause() {
        qpb qpbVar = this.i;
        if (qpbVar != null) {
            qpbVar.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        qpb qpbVar = this.i;
        if (qpbVar != null) {
            qpbVar.release();
        }
        this.f.setVisibility(8);
        this.c.animate().setListener(null).cancel();
        kzb kzbVar = this.l;
        LiveRecycleView liveRecycleView = this.b;
        liveRecycleView.removeCallbacks(kzbVar);
        RecyclerView.Adapter adapter = liveRecycleView.getAdapter();
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.q);
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        qpb qpbVar = this.i;
        if (qpbVar != null) {
            qpbVar.resume();
        }
        LiveRecycleView liveRecycleView = this.b;
        if (liveRecycleView != null) {
            liveRecycleView.scrollBy(0, 1);
        }
    }

    @Override // xsna.c30
    public final void s() {
        d1();
    }

    @Override // xsna.c30
    public void setActionButtonClickCount(int i) {
        izs<Integer, s3q0> izsVar = this.n;
        if (izsVar != null) {
            izsVar.invoke(Integer.valueOf(i));
        }
    }

    public void setActionLinkMarginBottom(int i) {
        this.p = i;
    }

    @Override // xsna.rpb, xsna.c30
    public void setActionLinksPresenter(b30 b30Var) {
        this.o = b30Var;
    }

    @Override // xsna.rpb
    public void setAdapter(RecyclerView.Adapter<RecyclerView.e0> adapter) {
        this.b.setAdapter(adapter);
        adapter.registerAdapterDataObserver(this.q);
    }

    public void setIsEmojiKeyboardVisibility(boolean z) {
        this.k = z;
    }

    @Override // xsna.rpb
    public final void update() {
        LiveRecycleView liveRecycleView = this.b;
        if (liveRecycleView != null) {
            liveRecycleView.scrollBy(0, 1);
        }
    }

    @Override // xsna.rr6
    public qpb getPresenter() {
        return this.i;
    }

    @Override // xsna.rr6
    public void setPresenter(qpb qpbVar) {
        this.i = qpbVar;
        this.h.setPresenter(qpbVar);
    }

    /* compiled from: ChatView.java */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    @Override // xsna.c30
    public final void L() {
    }

    @Override // xsna.c30
    public final void O() {
    }

    @Override // xsna.c30
    public final void d0() {
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    /* compiled from: ChatView.java */
    public class a implements Animator.AnimatorListener {
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            this.b = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z = this.b;
            nzb nzbVar = nzb.this;
            if (!z) {
                nzbVar.b.setVisibility(8);
            }
            nzbVar.b.setAlpha(1.0f);
            nzbVar.g.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: ChatView.java */
    public class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            nzb nzbVar = nzb.this;
            FrameLayout frameLayout = nzbVar.c;
            if (frameLayout == null || frameLayout.getContext() == null) {
                return;
            }
            nzbVar.c.setVisibility(8);
            nzbVar.c.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(null).start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
