package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.merchant.offers.internal.view.MerchantOffersFloatingActionButtonView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;
import com.ybsdk.widgets.common.recycler.OrientationAwareRecyclerView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.storybar.YbSdkStoryProgressBar;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class g761 implements zo31 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final AppBarLayout c;
    public final ViewPager2 d;
    public final DivSkeletonsView e;
    public final ErrorView f;
    public final BottomBarNavigation g;
    public final MerchantOffersFloatingActionButtonView h;
    public final OrientationAwareRecyclerView i;
    public final nzm j;
    public final FrameLayout k;
    public final YbSdkStoryProgressBar l;
    public final CustomSwipeRefreshLayout m;
    public final Toolbar n;

    public g761(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppBarLayout appBarLayout, ViewPager2 viewPager2, DivSkeletonsView divSkeletonsView, ErrorView errorView, BottomBarNavigation bottomBarNavigation, MerchantOffersFloatingActionButtonView merchantOffersFloatingActionButtonView, OrientationAwareRecyclerView orientationAwareRecyclerView, nzm nzmVar, FrameLayout frameLayout, YbSdkStoryProgressBar ybSdkStoryProgressBar, CustomSwipeRefreshLayout customSwipeRefreshLayout, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = appBarLayout;
        this.d = viewPager2;
        this.e = divSkeletonsView;
        this.f = errorView;
        this.g = bottomBarNavigation;
        this.h = merchantOffersFloatingActionButtonView;
        this.i = orientationAwareRecyclerView;
        this.j = nzmVar;
        this.k = frameLayout;
        this.l = ybSdkStoryProgressBar;
        this.m = customSwipeRefreshLayout;
        this.n = toolbar;
    }

    public static g761 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View O2;
        View O3;
        View inflate = layoutInflater.inflate(nnh0.ybsdk_screen_merchant_offers, viewGroup, false);
        int i = fbh0.appBar;
        ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
        if (constraintLayout != null) {
            i = fbh0.appBarLayout;
            AppBarLayout appBarLayout = (AppBarLayout) cma1.O(i, inflate);
            if (appBarLayout != null) {
                i = fbh0.bannersPager;
                ViewPager2 viewPager2 = (ViewPager2) cma1.O(i, inflate);
                if (viewPager2 != null) {
                    i = fbh0.collapsingToolbar;
                    if (((CollapsingToolbarLayout) cma1.O(i, inflate)) != null) {
                        i = fbh0.coordinatorLayout;
                        if (((CoordinatorLayout) cma1.O(i, inflate)) != null) {
                            i = fbh0.divkitShimmerView;
                            DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i, inflate);
                            if (divSkeletonsView != null) {
                                i = fbh0.errorView;
                                ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                if (errorView != null) {
                                    i = fbh0.merchantOffersBottomBar;
                                    BottomBarNavigation bottomBarNavigation = (BottomBarNavigation) cma1.O(i, inflate);
                                    if (bottomBarNavigation != null) {
                                        i = fbh0.merchantOffersFloatingActionButton;
                                        MerchantOffersFloatingActionButtonView merchantOffersFloatingActionButtonView = (MerchantOffersFloatingActionButtonView) cma1.O(i, inflate);
                                        if (merchantOffersFloatingActionButtonView != null) {
                                            i = fbh0.screenItemsRecycler;
                                            OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) cma1.O(i, inflate);
                                            if (orientationAwareRecyclerView != null && (O = cma1.O((i = fbh0.shimmerLayout), inflate)) != null) {
                                                int i2 = fbh0.appBarShimmer;
                                                View O4 = cma1.O(i2, O);
                                                if (O4 != null) {
                                                    int i3 = fbh0.progressShimmer1;
                                                    SkeletonView skeletonView = (SkeletonView) cma1.O(i3, O4);
                                                    if (skeletonView != null) {
                                                        i3 = fbh0.progressShimmer2;
                                                        if (((SkeletonView) cma1.O(i3, O4)) != null) {
                                                            i3 = fbh0.progressShimmer3;
                                                            if (((SkeletonView) cma1.O(i3, O4)) != null) {
                                                                nzm nzmVar = new nzm(skeletonView, 17, (ConstraintLayout) O4);
                                                                int i4 = fbh0.bannerNotificationButtonShimmer;
                                                                if (((SkeletonView) cma1.O(i4, O)) != null) {
                                                                    i4 = fbh0.bannerNotificationIconShimmer;
                                                                    if (((SkeletonView) cma1.O(i4, O)) != null) {
                                                                        i4 = fbh0.bannerNotificationShimmer;
                                                                        if (((SkeletonView) cma1.O(i4, O)) != null) {
                                                                            i4 = fbh0.bannerNotificationSubtitleShimmer;
                                                                            if (((SkeletonView) cma1.O(i4, O)) != null) {
                                                                                i4 = fbh0.bannerNotificationTitleShimmer;
                                                                                if (((SkeletonView) cma1.O(i4, O)) != null) {
                                                                                    i4 = fbh0.bannerTextShimmer1;
                                                                                    if (((SkeletonView) cma1.O(i4, O)) != null) {
                                                                                        i4 = fbh0.bannerTextShimmer2;
                                                                                        if (((SkeletonView) cma1.O(i4, O)) != null) {
                                                                                            i4 = fbh0.bannerTextShimmer3;
                                                                                            if (((SkeletonView) cma1.O(i4, O)) != null && (O2 = cma1.O((i4 = fbh0.carouselOfferShimmer1), O)) != null) {
                                                                                                i4 = fbh0.carouselOfferShimmer2;
                                                                                                View O5 = cma1.O(i4, O);
                                                                                                if (O5 != null) {
                                                                                                    i4 = fbh0.carouselOfferShimmer3;
                                                                                                    View O6 = cma1.O(i4, O);
                                                                                                    if (O6 != null) {
                                                                                                        i4 = fbh0.carouselTitleShimmer;
                                                                                                        if (((SkeletonView) cma1.O(i4, O)) != null && (O3 = cma1.O((i4 = fbh0.categoryShimmer1), O)) != null) {
                                                                                                            i4 = fbh0.categoryShimmer2;
                                                                                                            View O7 = cma1.O(i4, O);
                                                                                                            if (O7 != null) {
                                                                                                                i4 = fbh0.categoryShimmer3;
                                                                                                                View O8 = cma1.O(i4, O);
                                                                                                                if (O8 != null) {
                                                                                                                    i4 = fbh0.categoryShimmer4;
                                                                                                                    View O9 = cma1.O(i4, O);
                                                                                                                    if (O9 != null) {
                                                                                                                        i4 = fbh0.categoryShimmer5;
                                                                                                                        View O10 = cma1.O(i4, O);
                                                                                                                        if (O10 != null) {
                                                                                                                            i4 = fbh0.offerShimmer1;
                                                                                                                            View O11 = cma1.O(i4, O);
                                                                                                                            if (O11 != null) {
                                                                                                                                wz51.o(O11);
                                                                                                                                i4 = fbh0.offerShimmer2;
                                                                                                                                View O12 = cma1.O(i4, O);
                                                                                                                                if (O12 != null) {
                                                                                                                                    wz51.o(O12);
                                                                                                                                    i4 = fbh0.offerShimmer3;
                                                                                                                                    View O13 = cma1.O(i4, O);
                                                                                                                                    if (O13 != null) {
                                                                                                                                        wz51.o(O13);
                                                                                                                                        i4 = fbh0.offersTitleShimmer;
                                                                                                                                        if (((SkeletonView) cma1.O(i4, O)) != null) {
                                                                                                                                            nzm nzmVar2 = new nzm(nzmVar, 16, (ShimmerFrameLayout) O);
                                                                                                                                            i = fbh0.storiesContainer;
                                                                                                                                            FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                                                                                                                                            if (frameLayout != null) {
                                                                                                                                                i = fbh0.storyProgressBar;
                                                                                                                                                YbSdkStoryProgressBar ybSdkStoryProgressBar = (YbSdkStoryProgressBar) cma1.O(i, inflate);
                                                                                                                                                if (ybSdkStoryProgressBar != null) {
                                                                                                                                                    i = fbh0.swipeRefreshContainer;
                                                                                                                                                    CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) cma1.O(i, inflate);
                                                                                                                                                    if (customSwipeRefreshLayout != null) {
                                                                                                                                                        i = fbh0.toolbar;
                                                                                                                                                        Toolbar toolbar = (Toolbar) cma1.O(i, inflate);
                                                                                                                                                        if (toolbar != null) {
                                                                                                                                                            return new g761((ConstraintLayout) inflate, constraintLayout, appBarLayout, viewPager2, divSkeletonsView, errorView, bottomBarNavigation, merchantOffersFloatingActionButtonView, orientationAwareRecyclerView, nzmVar2, frameLayout, ybSdkStoryProgressBar, customSwipeRefreshLayout, toolbar);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i2 = i4;
                                                            }
                                                        }
                                                    }
                                                    ny61.t("Missing required view with ID: ".concat(O4.getResources().getResourceName(i3)));
                                                    return null;
                                                }
                                                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final ConstraintLayout o() {
        return this.a;
    }
}
