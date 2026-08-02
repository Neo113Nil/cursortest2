package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.due_timetable.presentation.widget.day_selector.DaySelectorItemView;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperAppMainScreenHeader;
import com.yandex.go.transfer_requirement.ui.date_selector.TransferDateSelectorItemView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.requirements.ui.bubbles.RequirementsBubblesContainer;
import ru.yandex.taxi.settings.MainMenuButton;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class nzm implements zo31 {
    public final /* synthetic */ int a;
    public final View b;
    public final Object c;

    public nzm(GoFrameLayout goFrameLayout, GoFrameLayout goFrameLayout2, zuq0 zuq0Var) {
        this.a = 9;
        this.b = goFrameLayout;
        this.c = goFrameLayout2;
    }

    public static nzm o(View view) {
        int i = k7h0.button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, view);
        if (buttonComponent != null) {
            return new nzm(buttonComponent, 8, (FrameLayout) view);
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static nzm q(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        View inflate = layoutInflater.inflate(dmh0.finsdk_banner_shimmer_default, (ViewGroup) frameLayout, false);
        int i = tgh0.finsdkShimmerCards;
        View O = cma1.O(i, inflate);
        if (O != null) {
            return new nzm(O, 1, (ShimmerFrameLayout) inflate);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static nzm r(LayoutInflater layoutInflater, SuperAppMainScreenHeader superAppMainScreenHeader) {
        View O;
        layoutInflater.inflate(wth0.super_app_main_screen_header, superAppMainScreenHeader);
        int i = yih0.address_logo_container;
        if (((GoLinearLayout) cma1.O(i, superAppMainScreenHeader)) != null) {
            i = yih0.clarify_address_actions;
            if (((LinearLayout) cma1.O(i, superAppMainScreenHeader)) != null) {
                i = yih0.clarify_address_hint;
                if (((ListItemComponent) cma1.O(i, superAppMainScreenHeader)) != null) {
                    i = yih0.clarify_address_major_button;
                    if (((ButtonComponent) cma1.O(i, superAppMainScreenHeader)) != null) {
                        i = yih0.clarify_address_minor_button;
                        if (((ButtonComponent) cma1.O(i, superAppMainScreenHeader)) != null) {
                            i = yih0.clarify_address_view;
                            if (((ConstraintLayout) cma1.O(i, superAppMainScreenHeader)) != null) {
                                i = yih0.current_address;
                                if (((RobotoTextView) cma1.O(i, superAppMainScreenHeader)) != null) {
                                    i = yih0.header_container;
                                    if (((GoLinearLayout) cma1.O(i, superAppMainScreenHeader)) != null) {
                                        i = yih0.logo_view;
                                        if (((ViewStub) cma1.O(i, superAppMainScreenHeader)) != null) {
                                            i = yih0.menu_button;
                                            if (((MainMenuButton) cma1.O(i, superAppMainScreenHeader)) != null && (O = cma1.O((i = yih0.plus_badge), superAppMainScreenHeader)) != null) {
                                                return new nzm(O, 11, superAppMainScreenHeader);
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
        ny61.t("Missing required view with ID: ".concat(superAppMainScreenHeader.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                return (DaySelectorItemView) view;
            case 1:
                return (ShimmerFrameLayout) view;
            case 2:
                return (RobotoTextView) view;
            case 3:
                return (AnimatedListItemInputComponent) view;
            case 4:
                return (TransferDateSelectorItemView) view;
            case 5:
                return (GoFrameLayout) view;
            case 6:
                return (AppCompatImageView) view;
            case 7:
                return (LinearLayout) view;
            case 8:
                return (FrameLayout) view;
            case 9:
                return (GoFrameLayout) view;
            case 10:
                return (ConstraintLayout) view;
            case 11:
                return (SuperAppMainScreenHeader) view;
            case 12:
                return (GoFrameLayout) view;
            case 13:
                return (ConstraintLayout) view;
            case 14:
                return (LinearLayout) view;
            case 15:
                return view;
            case 16:
                return (com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout) view;
            case 17:
                return (ConstraintLayout) view;
            default:
                return (com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout) view;
        }
    }

    public com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout p() {
        int i = this.a;
        View view = this.b;
        switch (i) {
        }
        return (com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout) view;
    }

    public /* synthetic */ nzm(Object obj, int i, View view) {
        this.a = i;
        this.b = view;
        this.c = obj;
    }

    public nzm(ConstraintLayout constraintLayout, ViewStub viewStub, Space space, RequirementsBubblesContainer requirementsBubblesContainer, win winVar, FrameLayout frameLayout, qdj0 qdj0Var, FrameLayout frameLayout2) {
        this.a = 10;
        this.b = constraintLayout;
        this.c = space;
    }
}
