package xsna;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.lists.c;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.c4e0;

/* compiled from: DiscoverStoryView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class y9n extends mkm0 implements c.m<GetStoriesResponse> {
    public static final /* synthetic */ int S = 0;
    public ViewGroup G;
    public NonBouncedAppBarLayout H;
    public View I;
    public TextView J;
    public VkRecyclerPaginatedView K;
    public final Object L;
    public k9n M;
    public final GestureDetector N;
    public boolean O;
    public final u9n P;
    public final v9n Q;
    public final w9n R;

    /* compiled from: DiscoverStoryView.kt */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(f2) > Math.abs(f);
        }
    }

    /* compiled from: DiscoverStoryView.kt */
    public static final class b extends n6s {
        @Override // xsna.n6s
        public final ee a(Context context, ViewGroup viewGroup) {
            aan aanVar = new aan(context, null, 6, 0);
            aanVar.addView(e3m.b(context).inflate(R.layout.stories_discover_footer_error, (ViewGroup) null));
            aanVar.findViewById(R.id.error_retry).setOnClickListener(new p01(aanVar, 4));
            return aanVar;
        }
    }

    /* compiled from: DiscoverStoryView.kt */
    public static final class c extends GridLayoutManager.c {
        public c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            List<? extends hfz> list;
            k9n k9nVar = y9n.this.M;
            Integer num = i < ((k9nVar == null || (list = k9nVar.h) == null) ? 0 : list.size()) ? null : 3;
            if (num != null) {
                return num.intValue();
            }
            return 1;
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [xsna.u9n] */
    /* JADX WARN: Type inference failed for: r11v2, types: [xsna.v9n] */
    /* JADX WARN: Type inference failed for: r11v3, types: [xsna.w9n] */
    public y9n(Context context, View.OnTouchListener onTouchListener, DiscoverStoriesContainer discoverStoriesContainer, final elm0 elm0Var, com.vk.story.api.a aVar, qlm0 qlm0Var) {
        super(context, onTouchListener, discoverStoriesContainer, elm0Var, aVar, null, qlm0Var, new WeakReference(null), 3584);
        this.L = msy.a(LazyThreadSafetyMode.NONE, new nuj(this, 4));
        this.N = new GestureDetector(context, new a());
        this.P = new bd70() { // from class: xsna.u9n
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                y9n.p1(y9n.this, (List) obj);
            }
        };
        this.Q = new bd70() { // from class: xsna.v9n
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                k9n k9nVar;
                List<? extends hfz> list;
                StoriesContainer storiesContainer = (StoriesContainer) obj;
                y9n y9nVar = y9n.this;
                k9n k9nVar2 = y9nVar.M;
                ArrayList arrayList = (k9nVar2 == null || (list = k9nVar2.h) == null) ? null : new ArrayList(list);
                if (epx.f(arrayList != null ? Boolean.valueOf(g5g.D(arrayList, true, new mre(storiesContainer, 15))) : null, Boolean.TRUE) && (k9nVar = y9nVar.M) != null) {
                    k9nVar.setItems(arrayList);
                }
                k9n k9nVar3 = y9nVar.M;
                if (k9nVar3 == null || k9nVar3.getItemCount() != 0) {
                    return;
                }
                y9nVar.E.a().c(y9nVar.r);
            }
        };
        this.R = new bd70() { // from class: xsna.w9n
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                elm0 elm0Var2 = elm0.this;
                if (elm0Var2 != null) {
                    elm0Var2.finish();
                }
            }
        };
    }

    private final b getFooterErrorViewProvider() {
        return new b();
    }

    private final c getGridSpanSizeLookup() {
        return new c();
    }

    private final List<StoriesContainer> getStoryContainers() {
        List<? extends hfz> list;
        k9n k9nVar = this.M;
        if (k9nVar == null || (list = k9nVar.h) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof rrl0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((rrl0) it.next()).b);
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final anm0 getStoryViewerAnalytics() {
        return (anm0) this.L.getValue();
    }

    public static void p1(y9n y9nVar, List list) {
        if (y9nVar.O) {
            List<StoriesContainer> storyContainers = y9nVar.getStoryContainers();
            if (storyContainers != null) {
                List<StoriesContainer> list2 = storyContainers;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StoriesContainer) it.next()).g);
                }
                ArrayList v = c5g.v(arrayList);
                int size = v.size();
                for (int i = 0; i < size; i++) {
                    StoryEntry storyEntry = (StoryEntry) v.get(i);
                    if (list.contains(storyEntry)) {
                        storyEntry.h = true;
                    }
                }
            }
            k9n k9nVar = y9nVar.M;
            if (k9nVar != null) {
                k9nVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q1(y9n y9nVar, StoriesContainer storiesContainer) {
        Activity h;
        if (y9nVar.f || (h = e3m.h(y9nVar.getContext())) == 0) {
            return;
        }
        List<StoriesContainer> storyContainers = y9nVar.getStoryContainers();
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = y9nVar.getStorySettings().e;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint2 = MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER_LINK;
        if (mobileOfficialAppsConStoriesStat$ViewEntryPoint != mobileOfficialAppsConStoriesStat$ViewEntryPoint2) {
            mobileOfficialAppsConStoriesStat$ViewEntryPoint2 = MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER;
        }
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint3 = mobileOfficialAppsConStoriesStat$ViewEntryPoint2;
        StoryViewerRouter storyViewerRouter = y9nVar.g.g;
        String Ob = storiesContainer.Ob();
        elm0 elm0Var = y9nVar.c;
        String ref = elm0Var != null ? elm0Var.getRef() : null;
        can canVar = new can(y9nVar);
        StoryViewerRouter.InOutAnimation inOutAnimation = StoryViewerRouter.InOutAnimation.RectToFullScreen;
        com.vk.story.api.a aVar = new com.vk.story.api.a();
        aVar.c = true;
        s3q0 s3q0Var = s3q0.a;
        storyViewerRouter.h(h, storyContainers, Ob, null, (r42 & 16) != 0, mobileOfficialAppsConStoriesStat$ViewEntryPoint3, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : mobileOfficialAppsConStoriesStat$ViewEntryPoint3, ref, null, (r42 & 512) != 0 ? null : null, canVar, (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : inOutAnimation, (r42 & 4096) != 0 ? new com.vk.story.api.a() : aVar, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : h instanceof f5z ? (f5z) h : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
    }

    public static final void r1(y9n y9nVar, StoriesContainer storiesContainer) {
        y9nVar.getStoryViewerAnalytics().O(storiesContainer, y9nVar.d);
    }

    @Override // xsna.po6, xsna.qo6
    public final void I() {
        s1();
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<GetStoriesResponse> O9(String str, com.vk.lists.c cVar) {
        if (T0()) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        m9n m9nVar = m9n.b;
        return m9n.a(Integer.valueOf(cVar.k()), getStorySettings().g, str);
    }

    @Override // xsna.mkm0, xsna.po6
    public final void V0(SourceTransitionStory sourceTransitionStory) {
        super.V0(sourceTransitionStory);
        s1();
    }

    @Override // xsna.mkm0, xsna.po6
    public final void X0(int i) {
        if (this.n) {
            return;
        }
        o3e0 a2 = new wmm0(o25.a()).a(this, null);
        umm0 umm0Var = this.b;
        if (umm0Var != null) {
            umm0Var.b(a2);
        }
        if (T0()) {
            return;
        }
        f1(StoryViewAction.DISCOVER_FEED_VIEW, null);
    }

    @Override // xsna.po6, xsna.umm0.a
    public int getSectionsCount() {
        return 1;
    }

    @Override // xsna.mkm0
    public final void h1() {
        LayoutInflater from = LayoutInflater.from(getContext());
        ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.stories_discover, (ViewGroup) this, false);
        addView(viewGroup, new FrameLayout.LayoutParams(-1, -1));
        this.G = (ViewGroup) viewGroup.findViewById(R.id.header_container);
        View inflate = from.inflate(R.layout.stories_discover_toolbar, (ViewGroup) this, false);
        this.J = (TextView) inflate.findViewById(R.id.toolbar_title);
        bwt0.i0(inflate.findViewById(R.id.close), new yad(this, 21));
        bwt0.i0(inflate, new pwk(this, 4));
        this.I = inflate;
        addView(inflate);
        setBackgroundResource(R.color.vk_black);
        float f = kz8.b(this.g.j, this, false, null, 14).c;
        viewGroup.setTranslationY(f);
        View view = this.I;
        if (view != null) {
            view.setTranslationY(f);
        }
        bwt0.p0(findViewById(R.id.iv_close), false);
        bwt0.p0(findViewById(R.id.iv_menu), false);
        NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) viewGroup.findViewById(R.id.appbar);
        nonBouncedAppBarLayout.a(new NonBouncedAppBarLayout.d() { // from class: xsna.x9n
            @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
            public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout2, int i) {
                View view2;
                int totalScrollRange = nonBouncedAppBarLayout2.getTotalScrollRange();
                y9n y9nVar = y9n.this;
                View view3 = y9nVar.I;
                int height = totalScrollRange - (view3 != null ? view3.getHeight() : 0);
                ViewGroup viewGroup2 = y9nVar.G;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(1 - Math.abs(i / height));
                }
                boolean z = Math.abs(i) >= totalScrollRange;
                float f2 = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                long j = z ? 100L : 0L;
                TextView textView = y9nVar.J;
                if (textView != null) {
                    textView.animate().alpha(f2).setDuration(120L).setListener(new z9n(textView, f2)).setDuration(j).start();
                }
                int color = z ? 0 : e43.a.getColor(R.color.vk_gray_900);
                int color2 = z ? e43.a.getColor(R.color.vk_gray_900) : 0;
                View view4 = y9nVar.I;
                Drawable background = view4 != null ? view4.getBackground() : null;
                ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
                Integer valueOf = colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null;
                if ((valueOf != null && color2 == valueOf.intValue()) || (view2 = y9nVar.I) == null) {
                    return;
                }
                ObjectAnimator.ofObject(view2, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(color2)).setDuration(j).start();
            }
        });
        nonBouncedAppBarLayout.setOnTouchListener(new wj5(this, 1));
        this.H = nonBouncedAppBarLayout;
        final VkRecyclerPaginatedView vkRecyclerPaginatedView = (VkRecyclerPaginatedView) getRootView().findViewById(R.id.grid);
        vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
        b footerErrorViewProvider = getFooterErrorViewProvider();
        vkRecyclerPaginatedView.setFooterLoadingViewProvider(new ban(from));
        vkRecyclerPaginatedView.setFooterErrorViewProvider(footerErrorViewProvider);
        vkRecyclerPaginatedView.getRecyclerView().addItemDecoration(new jgu(3, iah0.a(3), false, 0));
        RecyclerView recyclerView = vkRecyclerPaginatedView.getRecyclerView();
        vkRecyclerPaginatedView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
        gridLayoutManager.x = getGridSpanSizeLookup();
        recyclerView.setLayoutManager(gridLayoutManager);
        vkRecyclerPaginatedView.getRecyclerView().setHasFixedSize(true);
        vkRecyclerPaginatedView.getRecyclerView().addOnScrollListener(new ef90(new v1d0(15, new s0d0() { // from class: xsna.s9n
            @Override // xsna.s0d0
            public final u0d0 a(int i) {
                StoriesContainer storiesContainer;
                StoryEntry Lb;
                String Bb;
                List<? extends hfz> list;
                k9n k9nVar = y9n.this.M;
                Object obj = (k9nVar == null || (list = k9nVar.h) == null) ? null : (hfz) j5g.b0(i, list);
                rrl0 rrl0Var = obj instanceof rrl0 ? (rrl0) obj : null;
                if (rrl0Var == null || (storiesContainer = rrl0Var.b) == null || (Lb = storiesContainer.Lb()) == null || (Bb = Lb.Bb(iah0.f().widthPixels / 3)) == null) {
                    return u0d0.a;
                }
                io.reactivex.rxjava3.disposables.c subscribe = mcr0.s(Bb).subscribe();
                ver0.c(vkRecyclerPaginatedView.getContext(), subscribe);
                return new v0d0(subscribe);
            }
        })));
        bwt0.V(vkRecyclerPaginatedView, new nh3(11, this, vkRecyclerPaginatedView));
        vkRecyclerPaginatedView.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.t9n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                y9n.this.e.onTouch(view2, motionEvent);
                return false;
            }
        });
        this.K = vkRecyclerPaginatedView;
        int i = 0;
        int i2 = 1;
        k9n k9nVar = new k9n(new bw6(i2, this, y9n.class, "openStories", "openStories(Lcom/vk/dto/stories/model/StoriesContainer;)V", i, 4), new p99(1, this, y9n.class, "showOptionsMenu", "showOptionsMenu(Lcom/vk/dto/stories/model/StoriesContainer;)V", 0, 4), new lw3(i2, this, y9n.class, "trackPreview", "trackPreview(Lcom/vk/dto/stories/model/StoriesContainer;)V", i, 3));
        VkRecyclerPaginatedView vkRecyclerPaginatedView2 = this.K;
        if (vkRecyclerPaginatedView2 != null) {
            vkRecyclerPaginatedView2.setAdapter(k9nVar);
        }
        this.M = k9nVar;
        k9nVar.setItems(k9nVar.l);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c4e0.a(1, 1.5f));
        arrayList.add(new c4e0.a(2, 2.5f));
        arrayList.add(0, new c4e0.a(1, 1.0f));
        c4e0 c4e0Var = new c4e0(arrayList, 9, 9);
        new com.vk.lists.c(null, this, this.M, null, true, 15, true, 30, 1073741823, c4e0Var, "0", null, null, null, false, false, true, true, true).b(this.K, true, true, 0L, null);
        this.E.b().a();
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<GetStoriesResponse> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // xsna.po6, xsna.umm0.a
    public final boolean o() {
        return false;
    }

    @Override // xsna.mkm0, xsna.po6, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qlm0 qlm0Var = this.g;
        qlm0Var.q.b(100, this.P);
        p870 p870Var = qlm0Var.q;
        p870Var.b(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, this.Q);
        p870Var.b(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, this.R);
    }

    @Override // xsna.mkm0, xsna.po6, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        qlm0 qlm0Var = this.g;
        qlm0Var.q.g(this.P);
        p870 p870Var = qlm0Var.q;
        p870Var.g(this.Q);
        p870Var.g(this.R);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0010 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0010, B:11:0x001c, B:12:0x001f), top: B:2:0x0001 }] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        try {
            NonBouncedAppBarLayout nonBouncedAppBarLayout = this.H;
            if (nonBouncedAppBarLayout != null) {
                z = true;
                if (nonBouncedAppBarLayout.f()) {
                    if (!z) {
                        boolean onTouchEvent = this.N.onTouchEvent(motionEvent);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(onTouchEvent);
                        }
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }
            }
            z = false;
            if (!z) {
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void s1() {
        ArrayList<StoriesContainer> arrayList;
        getStoriesContainer().e = false;
        List<StoriesContainer> storyContainers = getStoryContainers();
        if (storyContainers == null) {
            storyContainers = EmptyList.b;
        }
        List<StoriesContainer> list = storyContainers;
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((StoriesContainer) it.next()).g);
        }
        this.g.b.f(c5g.v(arrayList2));
        GetStoriesResponse getStoriesResponse = m9n.f;
        if (getStoriesResponse == null || (arrayList = getStoriesResponse.c) == null) {
            return;
        }
        Iterator<StoriesContainer> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Iterator<StoryEntry> it3 = it2.next().g.iterator();
            while (it3.hasNext()) {
                it3.next().h = true;
            }
        }
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<GetStoriesResponse> qVar, boolean z, com.vk.lists.c cVar) {
        qVar.subscribe(new ph3(new r9n(cVar, this, z, 0), 26));
    }
}
