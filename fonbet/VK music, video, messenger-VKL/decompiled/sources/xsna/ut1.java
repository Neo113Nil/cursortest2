package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.AppBarExpandableControllerBehaviour;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.search.integration.followers.api.FollowersSearchState;
import com.vkontakte.android.R;

/* compiled from: AllFollowersSearchDelegateCallback.kt */
/* loaded from: classes15.dex */
public final class ut1 implements fth0 {
    public final AppBarLayout a;
    public final AppBarShadowView b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final AppBarExpandableControllerBehaviour e;

    /* compiled from: AllFollowersSearchDelegateCallback.kt */
    public static final class a extends View {
        public a(Context context) {
            super(context);
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                mhy.b(getContext());
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public ut1(View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        this.a = appBarLayout;
        this.b = (AppBarShadowView) view.findViewById(R.id.shadow);
        this.c = (FrameLayout) view.findViewById(R.id.search_feature_overlay_container);
        this.d = (FrameLayout) view.findViewById(R.id.followers_list_container);
        AppBarExpandableControllerBehaviour appBarExpandableControllerBehaviour = new AppBarExpandableControllerBehaviour();
        this.e = appBarExpandableControllerBehaviour;
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
        fVar.c(appBarExpandableControllerBehaviour);
        appBarLayout.setLayoutParams(fVar);
    }

    @Override // xsna.fth0
    public final void a(FollowersSearchState followersSearchState) {
        boolean z = followersSearchState == FollowersSearchState.ACTIVE_QUERY;
        int i = z ? 0 : 8;
        FrameLayout frameLayout = this.c;
        frameLayout.setVisibility(i);
        int i2 = z ? 8 : 0;
        FrameLayout frameLayout2 = this.d;
        frameLayout2.setVisibility(i2);
        boolean z2 = followersSearchState == FollowersSearchState.INACTIVE;
        this.a.g(z2, true, true);
        this.e.q = z2;
        if (!z) {
            frameLayout = frameLayout2;
        }
        this.b.V(frameLayout);
    }

    @Override // xsna.fth0
    public final void b(View view, VkSearchView vkSearchView) {
        AppBarLayout.d dVar = new AppBarLayout.d(-2);
        dVar.a = 0;
        this.a.addView(vkSearchView, dVar);
        dhr0.a.e0(R.attr.vk_ui_header_background, vkSearchView);
        FrameLayout frameLayout = this.c;
        frameLayout.addView(view);
        frameLayout.addView(new a(frameLayout.getContext()));
        FrameLayout frameLayout2 = this.d;
        frameLayout2.addView(new a(frameLayout2.getContext()), 1);
        this.b.setSeparatorAllowed(false);
    }
}
