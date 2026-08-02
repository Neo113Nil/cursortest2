package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.chargers.multiorder.ui.h;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.ui.items.DefaultOfferHeaderView;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes6.dex */
public final /* synthetic */ class jt6 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pav b;

    public /* synthetic */ jt6(pav pavVar, int i) {
        this.a = i;
        this.b = pavVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        View O;
        int i = this.a;
        int i2 = 1;
        int i3 = 2;
        int i4 = 0;
        pav pavVar = this.b;
        switch (i) {
            case 0:
                View inflate = ((LayoutInflater) obj).inflate(zrh0.popup_modal_bullet_item, (ViewGroup) obj2, false);
                if (inflate != null) {
                    return new kt6(new e9e0((ListItemComponent) inflate), pavVar, i4);
                }
                ny61.t("rootView");
                return null;
            case 1:
                return new fz8(dy8.o((LayoutInflater) obj, (ViewGroup) obj2), pavVar, 0);
            case 2:
                return new gz8(dy8.o((LayoutInflater) obj, (ViewGroup) obj2), pavVar);
            case 3:
                return new fz8(dy8.o((LayoutInflater) obj, (ViewGroup) obj2), pavVar, 1);
            case 4:
                return new fz8(dy8.o((LayoutInflater) obj, (ViewGroup) obj2), pavVar, 2);
            case 5:
                View inflate2 = ((LayoutInflater) obj).inflate(zrh0.popup_modal_header_item, (ViewGroup) obj2, false);
                int i5 = agh0.bullets_order_popup_header_big_image;
                RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) cma1.O(i5, inflate2);
                if (roundedCornersImageView != null) {
                    i5 = agh0.bullets_order_popup_header_image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i5, inflate2);
                    if (appCompatImageView != null) {
                        i5 = agh0.bullets_order_popup_header_subtitle;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i5, inflate2);
                        if (robotoTextView != null) {
                            i5 = agh0.bullets_order_popup_header_title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i5, inflate2);
                            if (robotoTextView2 != null) {
                                i5 = agh0.divider;
                                DividerAwareComponent dividerAwareComponent = (DividerAwareComponent) cma1.O(i5, inflate2);
                                if (dividerAwareComponent != null) {
                                    i5 = agh0.driver_avatar_badge;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i5, inflate2);
                                    if (appCompatImageView2 != null) {
                                        i5 = agh0.driver_avatar_container;
                                        FrameLayout frameLayout = (FrameLayout) cma1.O(i5, inflate2);
                                        if (frameLayout != null) {
                                            i5 = agh0.driver_avatar_image;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i5, inflate2);
                                            if (appCompatImageView3 != null) {
                                                return new kt6(new g9e0((ConstraintLayout) inflate2, roundedCornersImageView, appCompatImageView, robotoTextView, robotoTextView2, dividerAwareComponent, appCompatImageView2, frameLayout, appCompatImageView3), pavVar, i2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i5)));
                return null;
            case 6:
                View inflate3 = ((LayoutInflater) obj).inflate(rsh0.chargers_multi_order_leasing_item, (ViewGroup) obj2, false);
                int i6 = rhh0.chevron;
                GoImageView goImageView = (GoImageView) cma1.O(i6, inflate3);
                if (goImageView != null) {
                    i6 = rhh0.powerbank_type;
                    GoImageView goImageView2 = (GoImageView) cma1.O(i6, inflate3);
                    if (goImageView2 != null) {
                        i6 = rhh0.primary_label;
                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i6, inflate3);
                        if (robotoTextView3 != null) {
                            i6 = rhh0.secondary_label;
                            RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i6, inflate3);
                            if (robotoTextView4 != null && (O = cma1.O((i6 = rhh0.separator), inflate3)) != null) {
                                return new h(new h4a((GoFrameLayout) inflate3, goImageView, goImageView2, robotoTextView3, robotoTextView4, O), pavVar);
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i6)));
                return null;
            case 7:
                View inflate4 = ((LayoutInflater) obj).inflate(clh0.hub_default_offer_tariff_class_view_holder, (ViewGroup) obj2, false);
                int i7 = s8h0.body_button;
                RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i7, inflate4);
                if (robotoTextView5 != null) {
                    i7 = s8h0.header_layout;
                    DefaultOfferHeaderView defaultOfferHeaderView = (DefaultOfferHeaderView) cma1.O(i7, inflate4);
                    if (defaultOfferHeaderView != null) {
                        i7 = s8h0.tariff_icon;
                        GoImageView goImageView3 = (GoImageView) cma1.O(i7, inflate4);
                        if (goImageView3 != null) {
                            return new lo4(new oxu((GoConstraintLayout) inflate4, robotoTextView5, defaultOfferHeaderView, goImageView3), pavVar);
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i7)));
                return null;
            case 8:
                View inflate5 = ((LayoutInflater) obj).inflate(clh0.hub_default_offer_transport_route_view_holder, (ViewGroup) obj2, false);
                int i8 = s8h0.body_button;
                RobotoTextView robotoTextView6 = (RobotoTextView) cma1.O(i8, inflate5);
                if (robotoTextView6 != null) {
                    i8 = s8h0.fade;
                    GoImageView goImageView4 = (GoImageView) cma1.O(i8, inflate5);
                    if (goImageView4 != null) {
                        i8 = s8h0.header_layout;
                        DefaultOfferHeaderView defaultOfferHeaderView2 = (DefaultOfferHeaderView) cma1.O(i8, inflate5);
                        if (defaultOfferHeaderView2 != null) {
                            i8 = s8h0.route;
                            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i8, inflate5);
                            if (goLinearLayout != null) {
                                return new yt60(new pxu((GoConstraintLayout) inflate5, robotoTextView6, goImageView4, defaultOfferHeaderView2, goLinearLayout), pavVar);
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i8)));
                return null;
            default:
                return new kt6(j9e0.o((LayoutInflater) obj, (ViewGroup) obj2), pavVar, i3);
        }
    }
}
