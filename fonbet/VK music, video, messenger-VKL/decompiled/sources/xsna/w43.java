package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
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
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.stories.model.AppGroupedStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.media.player.video.view.PlaylistPlayerVideoView;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AppGroupedStoryView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class w43 extends mkm0 {
    public static final /* synthetic */ int R = 0;
    public ViewGroup G;
    public ViewGroup H;
    public NonBouncedAppBarLayout I;
    public VKImageView J;
    public TextView K;
    public View L;
    public RecyclerView M;
    public lou N;
    public final GestureDetector O;
    public final l43 P;
    public final r43 Q;

    /* compiled from: AppGroupedStoryView.kt */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(f2) > Math.abs(f);
        }
    }

    /* compiled from: AppGroupedStoryView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<StoriesContainer, Integer, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(StoriesContainer storiesContainer, Integer num) {
            num.intValue();
            w43 w43Var = (w43) this.receiver;
            int i = w43.R;
            w43Var.g.f.O(storiesContainer, w43Var.d);
            return s3q0.a;
        }
    }

    /* compiled from: AppGroupedStoryView.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<StoriesContainer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(StoriesContainer storiesContainer) {
            Activity h;
            Dialog h2;
            StoriesContainer storiesContainer2 = storiesContainer;
            w43 w43Var = (w43) this.receiver;
            int i = w43.R;
            qlm0 qlm0Var = w43Var.g;
            if (!w43Var.f && (h = e3m.h(w43Var.getContext())) != null) {
                StoriesContainer storiesContainer3 = w43Var.getStoriesContainer();
                ArrayList<StoriesContainer> b = !(storiesContainer3 instanceof AppGroupedStoriesContainer) ? null : storiesContainer2.Cb() ? qlm0Var.i.b(((AppGroupedStoriesContainer) storiesContainer3).o) : qlm0Var.i.c(((AppGroupedStoriesContainer) storiesContainer3).o);
                if (b != null) {
                    w43Var.pause();
                    StoryViewerRouter storyViewerRouter = qlm0Var.g;
                    String Ob = storiesContainer2.Ob();
                    MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = w43Var.d;
                    elm0 elm0Var = w43Var.c;
                    String ref = elm0Var != null ? elm0Var.getRef() : null;
                    b53 b53Var = new b53(w43Var);
                    StoryViewerRouter.InOutAnimation inOutAnimation = StoryViewerRouter.InOutAnimation.RectToFullScreen;
                    com.vk.story.api.a aVar = new com.vk.story.api.a();
                    aVar.c = true;
                    s3q0 s3q0Var = s3q0.a;
                    h2 = storyViewerRouter.h(h, b, Ob, null, (r42 & 16) != 0, mobileOfficialAppsConStoriesStat$ViewEntryPoint, (r42 & 64) != 0 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER : null, ref, null, (r42 & 512) != 0 ? null : null, b53Var, (r42 & 2048) != 0 ? StoryViewerRouter.InOutAnimation.PointToFullScreen : inOutAnimation, (r42 & 4096) != 0 ? new com.vk.story.api.a() : aVar, -1, -1, (32768 & r42) != 0 ? null : null, (65536 & r42) != 0 ? null : null, (131072 & r42) != 0 ? null : null, (262144 & r42) != 0 ? null : null, (r42 & 524288) != 0 ? SystemClock.elapsedRealtime() : 0L);
                    h2.setOnDismissListener(new q43(w43Var, 0));
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: AppGroupedStoryView.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<androidx.appcompat.app.d, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(androidx.appcompat.app.d dVar) {
            androidx.appcompat.app.d dVar2 = dVar;
            w43 w43Var = (w43) this.receiver;
            int i = w43.R;
            w43Var.pause();
            if (dVar2 != null) {
                dVar2.setOnDismissListener(new p43(w43Var, 0));
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [xsna.l43] */
    public w43(Context context, View.OnTouchListener onTouchListener, final StoriesContainer storiesContainer, elm0 elm0Var, com.vk.story.api.a aVar, qlm0 qlm0Var) {
        super(context, onTouchListener, storiesContainer, elm0Var, aVar, null, qlm0Var, new WeakReference(null), 3584);
        this.O = new GestureDetector(context, new a());
        this.P = new bd70() { // from class: xsna.l43
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                List list = (List) obj;
                List<StoryEntry> O = fsk.O(StoriesContainer.this);
                if ((O instanceof List) && (O instanceof RandomAccess)) {
                    List list2 = O;
                    int size = list2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        StoryEntry storyEntry = (StoryEntry) list2.get(i3);
                        if (list.contains(storyEntry)) {
                            storyEntry.h = true;
                        }
                    }
                } else {
                    for (StoryEntry storyEntry2 : O) {
                        if (list.contains(storyEntry2)) {
                            storyEntry2.h = true;
                        }
                    }
                }
                lou louVar = this.N;
                if (louVar != null) {
                    louVar.notifyDataSetChanged();
                }
            }
        };
        this.Q = new r43(this, 0);
    }

    @Override // xsna.mkm0, xsna.qo6
    public final void L(int i, int i2) {
        if (T0()) {
            return;
        }
        R();
    }

    @Override // xsna.mkm0, xsna.po6
    public final void V0(SourceTransitionStory sourceTransitionStory) {
        if (p1()) {
            this.g.b.f(fsk.O(getStoriesContainer()));
        }
        super.V0(sourceTransitionStory);
    }

    @Override // xsna.mkm0, xsna.po6
    public final void X0(int i) {
        o3e0 o3e0Var;
        if (this.n) {
            return;
        }
        if (i != getStoriesContainer().g.size()) {
            ViewGroup viewGroup = this.G;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            StoryViewHeader headerView = getHeaderView();
            if (headerView != null) {
                bwt0.p0(headerView.i, true);
            }
            super.X0(i);
            return;
        }
        View deletedView = getDeletedView();
        if (deletedView != null) {
            deletedView.setVisibility(8);
        }
        View accessDeniedView = getAccessDeniedView();
        if (accessDeniedView != null) {
            accessDeniedView.setVisibility(8);
        }
        VKImageView imagePreview = getImagePreview();
        if (imagePreview != null) {
            imagePreview.clear();
        }
        xaj0 xaj0Var = this.E.a.v;
        if (xaj0Var != null) {
            L.e("VideoPlayer", "clearPlayer");
            PlaylistPlayerVideoView playlistPlayerVideoView = xaj0Var.a;
            playlistPlayerVideoView.setVisibility(8);
            playlistPlayerVideoView.e();
        }
        ViewGroup viewGroup2 = this.G;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        umm0 umm0Var = this.b;
        if (umm0Var != null) {
            umm0Var.b(this.y.a(this, null));
        }
        umm0 umm0Var2 = this.b;
        if (umm0Var2 != null && (o3e0Var = umm0Var2.c) != null) {
            o3e0Var.g(i, umm0Var2.b);
        }
        this.r = i;
        this.m = null;
        R();
        c1(true);
        StoryViewHeader headerView2 = getHeaderView();
        if (headerView2 != null) {
            bwt0.p0(headerView2.i, false);
        }
        if (T0()) {
            return;
        }
        StoryViewAction storyViewAction = StoryViewAction.GROUP_FEED_VIEW;
        f1(storyViewAction, new o43(0, this, storyViewAction));
    }

    @Override // xsna.po6
    public final void f1(StoryViewAction storyViewAction, izs<? super b.d, s3q0> izsVar) {
        super.f1(storyViewAction, new n43(izsVar, this, storyViewAction, 0));
    }

    @Override // xsna.po6, xsna.umm0.a
    public int getSectionsCount() {
        return getStoriesContainer().g.size() + 1;
    }

    @Override // xsna.mkm0
    @SuppressLint({"ResourceType"})
    public final void h1() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.stories_app_grouped, (ViewGroup) this, false);
        addView(viewGroup, new FrameLayout.LayoutParams(-1, -1));
        bringChildToFront(getHeaderView());
        this.H = (ViewGroup) viewGroup.findViewById(R.id.header_container);
        final NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) viewGroup.findViewById(R.id.appbar);
        nonBouncedAppBarLayout.a(new NonBouncedAppBarLayout.d() { // from class: xsna.s43
            @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
            public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout2, int i) {
                int totalScrollRange = nonBouncedAppBarLayout2.getTotalScrollRange() - gbg0.a(NonBouncedAppBarLayout.this.getResources(), 56.0f);
                ViewGroup viewGroup2 = this.H;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(1 - Math.abs(i / totalScrollRange));
                }
            }
        });
        pause();
        nonBouncedAppBarLayout.setOnTouchListener(new t43(this, 0));
        this.I = nonBouncedAppBarLayout;
        VKImageView vKImageView = (VKImageView) viewGroup.findViewById(R.id.app_icon);
        bwt0.i0(vKImageView, new com.vk.movika.sdk.base.observable.c(this, 5));
        this.J = vKImageView;
        TextView textView = (TextView) viewGroup.findViewById(R.id.app_title);
        bwt0.i0(textView, new go1(this, 3));
        this.K = textView;
        View findViewById = viewGroup.findViewById(R.id.goto_app);
        bwt0.i0(findViewById, new com.vk.movika.sdk.base.observable.e(this, 5));
        this.L = findViewById;
        final RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.grid);
        recyclerView.addItemDecoration(new jgu(3, iah0.a(3), false, 0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(3));
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnScrollListener(new ef90(new v1d0(15, new s0d0() { // from class: xsna.u43
            @Override // xsna.s0d0
            public final u0d0 a(int i) {
                StoriesContainer storiesContainer;
                StoryEntry Lb;
                String Bb;
                lou louVar = w43.this.N;
                if (louVar == null || (storiesContainer = (StoriesContainer) louVar.c.c(i)) == null || (Lb = storiesContainer.Lb()) == null || (Bb = Lb.Bb(iah0.f().widthPixels / 3)) == null) {
                    return u0d0.a;
                }
                io.reactivex.rxjava3.disposables.c subscribe = mcr0.s(Bb).subscribe();
                ver0.c(recyclerView.getContext(), subscribe);
                return new v0d0(subscribe);
            }
        })));
        bwt0.V(recyclerView, new v43(0, this, recyclerView));
        recyclerView.setOnTouchListener(new m43(this, 0));
        this.M = recyclerView;
        bwt0.i0(viewGroup.findViewById(R.id.back_area), new tm0(this, 5));
        bwt0.i0(viewGroup.findViewById(R.id.forward_area), new g60(this, 3));
        StoriesContainer storiesContainer = getStoriesContainer();
        AppGroupedStoriesContainer appGroupedStoriesContainer = storiesContainer instanceof AppGroupedStoriesContainer ? (AppGroupedStoriesContainer) storiesContainer : null;
        lou louVar = new lou(this.g.a, new c(1, this, w43.class, "openStories", "openStories(Lcom/vk/dto/stories/model/StoriesContainer;)V", 0), new d(1, this, w43.class, "dialogOpened", "dialogOpened(Landroidx/appcompat/app/AlertDialog;)V", 0), new b(2, this, w43.class, "trackPreview", "trackPreview(Lcom/vk/dto/stories/model/StoriesContainer;I)V", 0));
        louVar.setItems(appGroupedStoriesContainer != null ? appGroupedStoriesContainer.o : null);
        RecyclerView recyclerView2 = this.M;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(louVar);
        }
        this.N = louVar;
        if (appGroupedStoriesContainer != null) {
            ApiApplication apiApplication = appGroupedStoriesContainer.p;
            VKImageView vKImageView2 = this.J;
            if (vKImageView2 != null) {
                vKImageView2.load(apiApplication.d.Fb(iah0.a(64.0f), false).d.d);
            }
            TextView textView2 = this.K;
            if (textView2 != null) {
                textView2.setText(apiApplication.c);
            }
        }
        StoryViewHeader headerView = getHeaderView();
        if (headerView != null) {
            headerView.setOnCloseClickListener(new com.vk.movika.sdk.base.observable.a(this, 5));
        }
        this.G = viewGroup;
        viewGroup.setVisibility(4);
    }

    @Override // xsna.mkm0, xsna.po6, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qlm0 qlm0Var = this.g;
        qlm0Var.q.b(100, this.P);
        qlm0Var.q.b(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, this.Q);
    }

    @Override // xsna.mkm0, xsna.po6, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        qlm0 qlm0Var = this.g;
        qlm0Var.q.g(this.P);
        qlm0Var.q.g(this.Q);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        NonBouncedAppBarLayout nonBouncedAppBarLayout = this.I;
        if (nonBouncedAppBarLayout == null || !nonBouncedAppBarLayout.f()) {
            boolean onTouchEvent = this.O.onTouchEvent(motionEvent);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(onTouchEvent);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean p1() {
        elm0 elm0Var = this.c;
        return elm0Var != null && elm0Var.g() && this.r == getSectionsCount() - 1;
    }

    public final void q1() {
        ApiApplication apiApplication;
        Context context;
        StoriesContainer storiesContainer = getStoriesContainer();
        AppGroupedStoriesContainer appGroupedStoriesContainer = storiesContainer instanceof AppGroupedStoriesContainer ? (AppGroupedStoriesContainer) storiesContainer : null;
        if (appGroupedStoriesContainer == null || (apiApplication = appGroupedStoriesContainer.p) == null || (context = getContext()) == null) {
            return;
        }
        b6m.a().q(context, apiApplication);
    }
}
