package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardRequisiteFieldView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ListItemButton;
import com.ybsdk.widgets.common.PageIndicatorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.tabview.TabView;

/* loaded from: classes3.dex */
public final class g661 implements zo31 {
    public final ToolbarView A;
    public final FrameLayout a;
    public final ListItemButton b;
    public final YbButtonView c;
    public final YbButtonView d;
    public final ListItemButton e;
    public final ListItemButton f;
    public final YbButtonView g;
    public final YbButtonView h;
    public final YbButtonView i;
    public final AppCompatImageView j;
    public final ViewPager2 k;
    public final PageIndicatorView l;
    public final ErrorView m;
    public final CommunicationFullScreenView n;
    public final FrameLayout o;
    public final TextView p;
    public final Group q;
    public final RecyclerView r;
    public final TabView s;
    public final CardRequisiteFieldView t;
    public final CardRequisiteFieldView u;
    public final CardRequisiteFieldView v;
    public final NestedScrollView w;
    public final RecyclerView x;
    public final ShimmerFrameLayout y;
    public final TextView z;

    public g661(FrameLayout frameLayout, ListItemButton listItemButton, YbButtonView ybButtonView, YbButtonView ybButtonView2, ListItemButton listItemButton2, ListItemButton listItemButton3, YbButtonView ybButtonView3, YbButtonView ybButtonView4, YbButtonView ybButtonView5, AppCompatImageView appCompatImageView, ViewPager2 viewPager2, PageIndicatorView pageIndicatorView, ErrorView errorView, CommunicationFullScreenView communicationFullScreenView, FrameLayout frameLayout2, TextView textView, Group group, RecyclerView recyclerView, TabView tabView, CardRequisiteFieldView cardRequisiteFieldView, CardRequisiteFieldView cardRequisiteFieldView2, CardRequisiteFieldView cardRequisiteFieldView3, NestedScrollView nestedScrollView, RecyclerView recyclerView2, ShimmerFrameLayout shimmerFrameLayout, TextView textView2, ToolbarView toolbarView) {
        this.a = frameLayout;
        this.b = listItemButton;
        this.c = ybButtonView;
        this.d = ybButtonView2;
        this.e = listItemButton2;
        this.f = listItemButton3;
        this.g = ybButtonView3;
        this.h = ybButtonView4;
        this.i = ybButtonView5;
        this.j = appCompatImageView;
        this.k = viewPager2;
        this.l = pageIndicatorView;
        this.m = errorView;
        this.n = communicationFullScreenView;
        this.o = frameLayout2;
        this.p = textView;
        this.q = group;
        this.r = recyclerView;
        this.s = tabView;
        this.t = cardRequisiteFieldView;
        this.u = cardRequisiteFieldView2;
        this.v = cardRequisiteFieldView3;
        this.w = nestedScrollView;
        this.x = recyclerView2;
        this.y = shimmerFrameLayout;
        this.z = textView2;
        this.A = toolbarView;
    }

    public static g661 p(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(anh0.ybsdk_screen_card_details, (ViewGroup) null, false);
        int i = sah0.buttonAddToSamsungPaySettings;
        ListItemButton listItemButton = (ListItemButton) cma1.O(i, inflate);
        if (listItemButton != null) {
            i = sah0.buttonDeleteCard;
            YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
            if (ybButtonView != null) {
                i = sah0.buttonFreezeCard;
                YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i, inflate);
                if (ybButtonView2 != null) {
                    i = sah0.buttonNfcSettings;
                    ListItemButton listItemButton2 = (ListItemButton) cma1.O(i, inflate);
                    if (listItemButton2 != null) {
                        i = sah0.buttonPinCode;
                        ListItemButton listItemButton3 = (ListItemButton) cma1.O(i, inflate);
                        if (listItemButton3 != null) {
                            i = sah0.buttonPromoPrimary;
                            YbButtonView ybButtonView3 = (YbButtonView) cma1.O(i, inflate);
                            if (ybButtonView3 != null) {
                                i = sah0.buttonPromoSecondary;
                                YbButtonView ybButtonView4 = (YbButtonView) cma1.O(i, inflate);
                                if (ybButtonView4 != null) {
                                    i = sah0.buttonReissueCard;
                                    YbButtonView ybButtonView5 = (YbButtonView) cma1.O(i, inflate);
                                    if (ybButtonView5 != null) {
                                        i = sah0.buttonShowHideRequisites;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                                        if (appCompatImageView != null) {
                                            i = sah0.cardsBarrier;
                                            if (((Barrier) cma1.O(i, inflate)) != null) {
                                                i = sah0.cardsPager;
                                                ViewPager2 viewPager2 = (ViewPager2) cma1.O(i, inflate);
                                                if (viewPager2 != null) {
                                                    i = sah0.cardsPagerIndicators;
                                                    PageIndicatorView pageIndicatorView = (PageIndicatorView) cma1.O(i, inflate);
                                                    if (pageIndicatorView != null) {
                                                        i = sah0.errorView;
                                                        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
                                                        if (errorView != null) {
                                                            i = sah0.infoScreenView;
                                                            CommunicationFullScreenView communicationFullScreenView = (CommunicationFullScreenView) cma1.O(i, inflate);
                                                            if (communicationFullScreenView != null) {
                                                                i = sah0.layoutContent;
                                                                FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                                                                if (frameLayout != null) {
                                                                    i = sah0.layoutProgress;
                                                                    if (((ConstraintLayout) cma1.O(i, inflate)) != null) {
                                                                        i = sah0.promoAgreement;
                                                                        TextView textView = (TextView) cma1.O(i, inflate);
                                                                        if (textView != null) {
                                                                            i = sah0.promoGroup;
                                                                            Group group = (Group) cma1.O(i, inflate);
                                                                            if (group != null) {
                                                                                i = sah0.promoGroupBarrier;
                                                                                if (((Barrier) cma1.O(i, inflate)) != null) {
                                                                                    i = sah0.promoPointsRecycler;
                                                                                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                                                                    if (recyclerView != null) {
                                                                                        i = sah0.promoTabView;
                                                                                        TabView tabView = (TabView) cma1.O(i, inflate);
                                                                                        if (tabView != null) {
                                                                                            i = sah0.requisiteCardCvv;
                                                                                            CardRequisiteFieldView cardRequisiteFieldView = (CardRequisiteFieldView) cma1.O(i, inflate);
                                                                                            if (cardRequisiteFieldView != null) {
                                                                                                i = sah0.requisiteCardExpire;
                                                                                                CardRequisiteFieldView cardRequisiteFieldView2 = (CardRequisiteFieldView) cma1.O(i, inflate);
                                                                                                if (cardRequisiteFieldView2 != null) {
                                                                                                    i = sah0.requisiteCardNumber;
                                                                                                    CardRequisiteFieldView cardRequisiteFieldView3 = (CardRequisiteFieldView) cma1.O(i, inflate);
                                                                                                    if (cardRequisiteFieldView3 != null) {
                                                                                                        i = sah0.scrollContent;
                                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) cma1.O(i, inflate);
                                                                                                        if (nestedScrollView != null) {
                                                                                                            i = sah0.settingsView;
                                                                                                            RecyclerView recyclerView2 = (RecyclerView) cma1.O(i, inflate);
                                                                                                            if (recyclerView2 != null) {
                                                                                                                i = sah0.shimmerLayout;
                                                                                                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i, inflate);
                                                                                                                if (shimmerFrameLayout != null) {
                                                                                                                    i = sah0.skeletonCard;
                                                                                                                    if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                                                                                                        i = sah0.skeletonCardCvv;
                                                                                                                        if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                                                                                                            i = sah0.skeletonCardExpire;
                                                                                                                            if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                                                                                                                i = sah0.skeletonCardNumber;
                                                                                                                                if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                                                                                                                    i = sah0.skeletonDeleteCard;
                                                                                                                                    if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                                                                                                                        i = sah0.skeletonFreezeCard;
                                                                                                                                        if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                                                                                                                            i = sah0.skeletonPinCode;
                                                                                                                                            if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                                                                                                                                i = sah0.skeletonRequisites;
                                                                                                                                                if (((SkeletonView) cma1.O(i, inflate)) != null) {
                                                                                                                                                    i = sah0.textCardRequisites;
                                                                                                                                                    TextView textView2 = (TextView) cma1.O(i, inflate);
                                                                                                                                                    if (textView2 != null) {
                                                                                                                                                        i = sah0.toolbar;
                                                                                                                                                        ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                                                                                                                        if (toolbarView != null) {
                                                                                                                                                            return new g661((FrameLayout) inflate, listItemButton, ybButtonView, ybButtonView2, listItemButton2, listItemButton3, ybButtonView3, ybButtonView4, ybButtonView5, appCompatImageView, viewPager2, pageIndicatorView, errorView, communicationFullScreenView, frameLayout, textView, group, recyclerView, tabView, cardRequisiteFieldView, cardRequisiteFieldView2, cardRequisiteFieldView3, nestedScrollView, recyclerView2, shimmerFrameLayout, textView2, toolbarView);
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
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final FrameLayout o() {
        return this.a;
    }
}
