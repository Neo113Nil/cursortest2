package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SingleShimmeringBar;

/* loaded from: classes14.dex */
public final class ho4 implements zo31 {
    public final /* synthetic */ int a;
    public final View b;
    public final ViewGroup c;
    public final Object d;

    public ho4(LinearLayoutCompat linearLayoutCompat, ListItemComponent listItemComponent, LinearLayout linearLayout) {
        this.a = 15;
        this.b = linearLayoutCompat;
        this.d = listItemComponent;
        this.c = linearLayout;
    }

    public static ho4 o(View view) {
        int i = j8h0.price_loading_placeholder;
        SingleShimmeringBar singleShimmeringBar = (SingleShimmeringBar) cma1.O(i, view);
        if (singleShimmeringBar != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            int i2 = j8h0.tariff_price_view;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, view);
            if (robotoTextView != null) {
                return new ho4((ViewGroup) frameLayout, (View) singleShimmeringBar, (Object) robotoTextView, 7);
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ho4 p(View view) {
        int i = q6h0.retry_icon;
        GoImageView goImageView = (GoImageView) cma1.O(i, view);
        if (goImageView != null) {
            i = q6h0.shimmer;
            PlaceholderView placeholderView = (PlaceholderView) cma1.O(i, view);
            if (placeholderView != null) {
                return new ho4((FrameLayout) view, goImageView, placeholderView, 11);
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ho4 q(View view) {
        int i = ufh0.summary_dialog_header_item;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, view);
        if (listItemComponent != null) {
            i = ufh0.summary_dialog_header_loading;
            PlaceholderView placeholderView = (PlaceholderView) cma1.O(i, view);
            if (placeholderView != null) {
                return new ho4((FrameLayout) view, listItemComponent, placeholderView, 16);
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.c;
        switch (i) {
            case 0:
                return (LinearLayout) viewGroup;
            case 1:
                return (GoConstraintLayout) viewGroup;
            case 2:
                return (GoLinearLayout) viewGroup;
            case 3:
                return (LinearLayout) viewGroup;
            case 4:
                return (ConstraintLayout) viewGroup;
            case 5:
                return (LinearLayout) viewGroup;
            case 6:
                return (LinearLayout) viewGroup;
            case 7:
                return (FrameLayout) viewGroup;
            case 8:
                return (ConstraintLayout) viewGroup;
            case 9:
                return (GoFrameLayout) viewGroup;
            case 10:
                return (GoLinearLayout) viewGroup;
            case 11:
                return (FrameLayout) viewGroup;
            case 12:
                return (GoLinearLayout) viewGroup;
            case 13:
                return (GoConstraintLayout) viewGroup;
            case 14:
                return (GoLinearLayout) viewGroup;
            case 15:
                return (LinearLayoutCompat) this.b;
            case 16:
                return (FrameLayout) viewGroup;
            case 17:
                return (GoFrameLayout) viewGroup;
            case 18:
                return (LinearLayout) viewGroup;
            case 19:
                return (GoFrameLayout) viewGroup;
            case 20:
                return (GoConstraintLayout) viewGroup;
            case 21:
                return (FrameLayout) viewGroup;
            case 22:
                return (GoConstraintLayout) viewGroup;
            case 23:
                return (GoConstraintLayout) viewGroup;
            case 24:
                return (LinearLayout) viewGroup;
            case 25:
                return (LinearLayout) viewGroup;
            case 26:
                return (ShimmerFrameLayout) viewGroup;
            default:
                return (LinearLayout) viewGroup;
        }
    }

    public LinearLayout r() {
        return (LinearLayout) this.c;
    }

    public ShimmerFrameLayout s() {
        return (ShimmerFrameLayout) this.c;
    }

    public /* synthetic */ ho4(ViewGroup viewGroup, View view, RobotoTextView robotoTextView, int i) {
        this.a = i;
        this.c = viewGroup;
        this.d = view;
        this.b = robotoTextView;
    }

    public /* synthetic */ ho4(ViewGroup viewGroup, View view, Object obj, int i) {
        this.a = i;
        this.c = viewGroup;
        this.b = view;
        this.d = obj;
    }

    public ho4(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, RobotoTextView robotoTextView) {
        this.a = 8;
        this.c = constraintLayout;
        this.b = buttonComponent2;
        this.d = robotoTextView;
    }
}
