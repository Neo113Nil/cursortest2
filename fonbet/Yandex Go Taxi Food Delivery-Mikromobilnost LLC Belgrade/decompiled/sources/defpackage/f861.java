package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class f861 implements zo31 {
    public final FrameLayout a;
    public final LinearLayoutCompat b;
    public final ErrorView c;
    public final wz51 d;
    public final CustomSwipeRefreshLayout e;
    public final ToolbarView f;
    public final RecyclerView g;

    public f861(FrameLayout frameLayout, LinearLayoutCompat linearLayoutCompat, ErrorView errorView, wz51 wz51Var, CustomSwipeRefreshLayout customSwipeRefreshLayout, ToolbarView toolbarView, RecyclerView recyclerView) {
        this.a = frameLayout;
        this.b = linearLayoutCompat;
        this.c = errorView;
        this.d = wz51Var;
        this.e = customSwipeRefreshLayout;
        this.f = toolbarView;
        this.g = recyclerView;
    }

    public static f861 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View O;
        View inflate = layoutInflater.inflate(loh0.ybsdk_screen_transactions, viewGroup, false);
        int i = ach0.contentContainer;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) cma1.O(i, inflate);
        if (linearLayoutCompat != null) {
            i = ach0.error;
            ErrorView errorView = (ErrorView) cma1.O(i, inflate);
            if (errorView != null && (O = cma1.O((i = ach0.shimmer), inflate)) != null) {
                int i2 = ach0.amount1;
                if (((SkeletonView) cma1.O(i2, O)) != null) {
                    i2 = ach0.amount2;
                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                        i2 = ach0.amount3;
                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                            i2 = ach0.amount4;
                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                i2 = ach0.amount5;
                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                    i2 = ach0.amount6;
                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                        i2 = ach0.amount7;
                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                            i2 = ach0.icon1;
                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                i2 = ach0.icon2;
                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                    i2 = ach0.icon3;
                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                        i2 = ach0.icon4;
                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                            i2 = ach0.icon5;
                                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                i2 = ach0.icon6;
                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                    i2 = ach0.icon7;
                                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                        i2 = ach0.text1;
                                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                            i2 = ach0.text2;
                                                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                i2 = ach0.text3;
                                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                    i2 = ach0.text4;
                                                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                        i2 = ach0.text5;
                                                                                        if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                            i2 = ach0.text6;
                                                                                            if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                i2 = ach0.text7;
                                                                                                if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                    i2 = ach0.titleSkeleton;
                                                                                                    if (((SkeletonView) cma1.O(i2, O)) != null) {
                                                                                                        wz51 wz51Var = new wz51((ShimmerFrameLayout) O, 14);
                                                                                                        i = ach0.swipeRefresh;
                                                                                                        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) cma1.O(i, inflate);
                                                                                                        if (customSwipeRefreshLayout != null) {
                                                                                                            i = ach0.toolbar;
                                                                                                            ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                                                                            if (toolbarView != null) {
                                                                                                                i = ach0.transactions;
                                                                                                                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                                                                                                if (recyclerView != null) {
                                                                                                                    return new f861((FrameLayout) inflate, linearLayoutCompat, errorView, wz51Var, customSwipeRefreshLayout, toolbarView, recyclerView);
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
                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                return null;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
