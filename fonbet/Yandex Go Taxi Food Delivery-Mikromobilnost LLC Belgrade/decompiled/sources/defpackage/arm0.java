package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.scooters.passes.active.ScootersActivePassesModalView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.view.SelectorListView;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import java.util.List;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.order.view.CostDetailsView;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;
import ru.yandex.taxi.scooters.presentation.finish_info.info.ScootersFinishInfoCard;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class arm0 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ arm0(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 initList$lambda$0$1;
        zy11 onItemsSelectionChangeListener$lambda$0;
        zy11 createV2RecyclerViewAdapter$lambda$2$0;
        zo31 selectorsAdapterDelegate$lambda$2;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                initList$lambda$0$1 = ScootersActivePassesModalView.initList$lambda$0$1((xqm0) obj, (uqm0) obj2);
                break;
            case 1:
                mo21 mo21Var = (mo21) obj;
                mo21 mo21Var2 = (mo21) obj2;
                break;
            case 2:
                r7p0 r7p0Var = (r7p0) obj;
                r7p0 r7p0Var2 = (r7p0) obj2;
                int compareTo = r7p0Var.a.compareTo(r7p0Var2.a);
                if (compareTo == 0) {
                    e8p0 e8p0Var = r7p0Var.b;
                    e8p0 e8p0Var2 = r7p0Var2.b;
                    boolean z = e8p0Var instanceof d8p0;
                    if (z && !(e8p0Var2 instanceof d8p0)) {
                        i2 = -1;
                    } else if (z || !(e8p0Var2 instanceof d8p0)) {
                        i2 = e8p0Var.k().compareTo(e8p0Var2.k());
                    }
                } else {
                    i2 = compareTo;
                }
                break;
            case 3:
                onItemsSelectionChangeListener$lambda$0 = ScootersFeedbackCard.onItemsSelectionChangeListener$lambda$0((List) obj, ((Boolean) obj2).booleanValue());
                break;
            case 4:
                createV2RecyclerViewAdapter$lambda$2$0 = ScootersFinishInfoCard.createV2RecyclerViewAdapter$lambda$2$0((CostDetailsView) obj, (dmn0) obj2);
                break;
            case 5:
                break;
            case 6:
                ((RobotoTextView) obj).setText(((g1j) obj2).a);
                break;
            case 7:
                ((ListGroupHeaderComponent) obj).setTitle(((h1j) obj2).a);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                w6o0 w6o0Var = (w6o0) obj2;
                w6o0Var.a.detach();
                w6o0Var.b.Hg();
                break;
            case 11:
                ((Integer) obj2).getClass();
                u3b1.c((fid) obj, vng.O(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                u3b1.e((fid) obj, vng.O(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                u3b1.f((fid) obj, vng.O(1));
                break;
            case 14:
                eaf0 eaf0Var = (eaf0) obj2;
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                View inflate = ((LayoutInflater) obj).inflate(uuh0.search_loading_favorite_item, (ViewGroup) obj2, false);
                if (inflate == null) {
                    ny61.t("rootView");
                    break;
                } else {
                    break;
                }
            case 18:
                View inflate2 = ((LayoutInflater) obj).inflate(poh0.ybsdk_item_select_payment_method, (ViewGroup) obj2, false);
                int i3 = fch0.checkboxBarrier;
                if (((Barrier) cma1.O(i3, inflate2)) != null) {
                    i3 = fch0.left_image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i3, inflate2);
                    if (appCompatImageView != null) {
                        i3 = fch0.leftSubImage;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i3, inflate2);
                        if (appCompatImageView2 != null) {
                            i3 = fch0.payment_method_subtitle;
                            SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i3, inflate2);
                            if (spoilerTextView != null) {
                                i3 = fch0.payment_method_title;
                                TextView textView = (TextView) cma1.O(i3, inflate2);
                                if (textView != null) {
                                    i3 = fch0.right_checkbox;
                                    CheckBoxView checkBoxView = (CheckBoxView) cma1.O(i3, inflate2);
                                    if (checkBoxView != null) {
                                        i3 = fch0.right_image;
                                        ImageView imageView = (ImageView) cma1.O(i3, inflate2);
                                        if (imageView != null) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                break;
            case 19:
                break;
            case 20:
                selectorsAdapterDelegate$lambda$2 = SelectorListView.selectorsAdapterDelegate$lambda$2((LayoutInflater) obj, (ViewGroup) obj2);
                break;
            case 21:
                ((Integer) obj).intValue();
                break;
            case 22:
                ((Integer) obj).getClass();
                break;
            case 23:
                ((Integer) obj).intValue();
                break;
            case 24:
                ((Integer) obj).intValue();
                break;
            case 25:
                View inflate3 = ((LayoutInflater) obj).inflate(yrh0.surge_info_content_separator_item, (ViewGroup) obj2, false);
                if (inflate3 == null) {
                    ny61.t("rootView");
                    break;
                } else {
                    break;
                }
            case 26:
                View inflate4 = ((LayoutInflater) obj).inflate(fuh0.settings_buttons_view, (ViewGroup) obj2, false);
                int i4 = z5h0.buttons_container;
                GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i4, inflate4);
                if (goLinearLayout != null) {
                    i4 = z5h0.title;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i4, inflate4);
                    if (robotoTextView != null) {
                        break;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i4)));
                break;
            case 27:
                View inflate5 = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_button, (ViewGroup) obj2, false);
                int i5 = ubh0.chevron;
                if (((AppCompatImageView) cma1.O(i5, inflate5)) != null) {
                    i5 = ubh0.itemRoot;
                    ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i5, inflate5);
                    if (constraintLayout != null) {
                        i5 = ubh0.subtitle;
                        TextView textView2 = (TextView) cma1.O(i5, inflate5);
                        if (textView2 != null) {
                            i5 = ubh0.title;
                            TextView textView3 = (TextView) cma1.O(i5, inflate5);
                            if (textView3 != null) {
                                break;
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i5)));
                break;
            case 28:
                View inflate6 = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_button_new, (ViewGroup) obj2, false);
                int i6 = ubh0.image;
                ImageView imageView2 = (ImageView) cma1.O(i6, inflate6);
                if (imageView2 != null) {
                    i6 = ubh0.itemRoot;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) cma1.O(i6, inflate6);
                    if (constraintLayout2 != null) {
                        i6 = ubh0.subtitle;
                        TextView textView4 = (TextView) cma1.O(i6, inflate6);
                        if (textView4 != null) {
                            i6 = ubh0.title;
                            TextView textView5 = (TextView) cma1.O(i6, inflate6);
                            if (textView5 != null) {
                                break;
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate6.getResources().getResourceName(i6)));
                break;
            default:
                View inflate7 = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_app_icon, (ViewGroup) obj2, false);
                int i7 = ubh0.iconImage;
                ImageView imageView3 = (ImageView) cma1.O(i7, inflate7);
                if (imageView3 != null) {
                    i7 = ubh0.iconImageContainer;
                    if (((CardView) cma1.O(i7, inflate7)) != null) {
                        i7 = ubh0.subtitle;
                        TextView textView6 = (TextView) cma1.O(i7, inflate7);
                        if (textView6 != null) {
                            i7 = ubh0.title;
                            TextView textView7 = (TextView) cma1.O(i7, inflate7);
                            if (textView7 != null) {
                                break;
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate7.getResources().getResourceName(i7)));
                break;
        }
        return null;
    }

    public /* synthetic */ arm0(int i, int i2) {
        this.a = i2;
    }
}
