package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.address.models.Address;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.ybsdk.widgets.common.CircleButtonsListView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.chip.ChipListView;
import java.util.Collections;
import java.util.Set;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final /* synthetic */ class jiz0 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ jiz0(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                View inflate = ((LayoutInflater) obj).inflate(rmh0.ybsdk_item_title, (ViewGroup) obj2, false);
                if (inflate != null) {
                    return new y261((TextView) inflate);
                }
                ny61.t("rootView");
                return null;
            case 1:
                return zy11Var;
            case 2:
                return Boolean.valueOf(((x701) obj).getClass() == ((x701) obj2).getClass());
            case 3:
                View inflate2 = ((LayoutInflater) obj).inflate(loh0.ybsdk_item_transaction_error, (ViewGroup) obj2, false);
                int i2 = ach0.refreshButton;
                YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, inflate2);
                if (ybButtonView != null) {
                    return new z261((LinearLayout) inflate2, ybButtonView);
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                return null;
            case 4:
                View inflate3 = ((LayoutInflater) obj).inflate(loh0.ybsdk_item_transaction_loader, (ViewGroup) obj2, false);
                int i3 = ach0.leading_icon;
                if (((ImageView) cma1.O(i3, inflate3)) != null) {
                    return new l7n((ConstraintLayout) inflate3, 7);
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i3)));
                return null;
            case 5:
                return a361.o((LayoutInflater) obj, (ViewGroup) obj2);
            case 6:
                View inflate4 = ((LayoutInflater) obj).inflate(umh0.ybsdk_transfer_main_buttons_list, (ViewGroup) obj2, false);
                int i4 = mah0.buttons;
                CircleButtonsListView circleButtonsListView = (CircleButtonsListView) cma1.O(i4, inflate4);
                if (circleButtonsListView != null) {
                    return new u961((ConstraintLayout) inflate4, circleButtonsListView);
                }
                ny61.t("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i4)));
                return null;
            case 7:
                return d261.o((LayoutInflater) obj, (ViewGroup) obj2);
            case 8:
                View inflate5 = ((LayoutInflater) obj).inflate(noh0.ybsdk_transfer_item_requisite_radio_button, (ViewGroup) obj2, false);
                int i5 = cch0.requisiteRadioButton;
                ImageView imageView = (ImageView) cma1.O(i5, inflate5);
                if (imageView != null) {
                    i5 = cch0.requisiteRadioButtonLabel;
                    TextView textView = (TextView) cma1.O(i5, inflate5);
                    if (textView != null) {
                        return new s961((ConstraintLayout) inflate5, imageView, textView);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i5)));
                return null;
            case 9:
                View inflate6 = ((LayoutInflater) obj).inflate(noh0.ybsdk_transfer_item_requisite_field, (ViewGroup) obj2, false);
                if (inflate6 != null) {
                    return new r961((LoadableInput) inflate6);
                }
                ny61.t("rootView");
                return null;
            case 10:
                View inflate7 = ((LayoutInflater) obj).inflate(noh0.ybsdk_transfer_item_requisite_chips, (ViewGroup) obj2, false);
                int i6 = cch0.requisiteChips;
                ChipListView chipListView = (ChipListView) cma1.O(i6, inflate7);
                if (chipListView != null) {
                    i6 = cch0.requisiteChipsLabel;
                    TextView textView2 = (TextView) cma1.O(i6, inflate7);
                    if (textView2 != null) {
                        return new q961((LinearLayout) inflate7, chipListView, textView2);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate7.getResources().getResourceName(i6)));
                return null;
            case 11:
                View inflate8 = ((LayoutInflater) obj).inflate(noh0.ybsdk_transfer_result_quick_action_item, (ViewGroup) obj2, false);
                int i7 = cch0.transferQuickActionIcon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i7, inflate8);
                if (appCompatImageView != null) {
                    i7 = cch0.transferQuickActionTitle;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i7, inflate8);
                    if (appCompatTextView != null) {
                        return new da61((ConstraintLayout) inflate8, appCompatImageView, appCompatTextView);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate8.getResources().getResourceName(i7)));
                return null;
            case 12:
                View inflate9 = ((LayoutInflater) obj).inflate(uqh0.mt_transfer_stop_view_holder, (ViewGroup) obj2, false);
                int i8 = reh0.content_layout;
                if (((LinearLayout) cma1.O(i8, inflate9)) != null) {
                    i8 = reh0.exit;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i8, inflate9);
                    if (robotoTextView != null) {
                        i8 = reh0.icon;
                        GoImageView goImageView = (GoImageView) cma1.O(i8, inflate9);
                        if (goImageView != null) {
                            i8 = reh0.subtitle;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i8, inflate9);
                            if (robotoTextView2 != null) {
                                i8 = reh0.time;
                                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i8, inflate9);
                                if (robotoTextView3 != null) {
                                    i8 = reh0.title;
                                    RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i8, inflate9);
                                    if (robotoTextView4 != null) {
                                        return new pr1(new aj40((ConstraintLayout) inflate9, robotoTextView, goImageView, robotoTextView2, robotoTextView3, robotoTextView4));
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate9.getResources().getResourceName(i8)));
                return null;
            case 13:
                ((Integer) obj2).getClass();
                ptb1.a((fid) obj, vng.O(1));
                return zy11Var;
            case 14:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (pair2.c() != null) {
                    Address address = (Address) pair2.c();
                    String zoneName = address != null ? address.getZoneName() : null;
                    Address address2 = (Address) pair.c();
                    if (!jl40.l(zoneName, address2 != null ? address2.getZoneName() : null)) {
                        r4 = false;
                    }
                }
                return Boolean.valueOf(r4);
            case 15:
                ((Integer) obj).intValue();
                return ((h711) obj2).getId();
            case 16:
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                hub1.a((fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                return Boolean.valueOf(z81.a((Address) obj, (Address) obj2));
            case 19:
                ((Integer) obj2).getClass();
                jub1.b((fid) obj, vng.O(1));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                ew11.a((fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                View inflate10 = ((LayoutInflater) obj).inflate(uqh0.mt_boarding_positions_view_holder, (ViewGroup) obj2, false);
                int i9 = reh0.first_segment;
                GoImageView goImageView2 = (GoImageView) cma1.O(i9, inflate10);
                if (goImageView2 != null) {
                    i9 = reh0.last_segment;
                    GoImageView goImageView3 = (GoImageView) cma1.O(i9, inflate10);
                    if (goImageView3 != null) {
                        i9 = reh0.lead;
                        GoView goView = (GoView) cma1.O(i9, inflate10);
                        if (goView != null) {
                            i9 = reh0.middle_segment;
                            GoImageView goImageView4 = (GoImageView) cma1.O(i9, inflate10);
                            if (goImageView4 != null) {
                                i9 = reh0.near_first_segment;
                                GoImageView goImageView5 = (GoImageView) cma1.O(i9, inflate10);
                                if (goImageView5 != null) {
                                    i9 = reh0.near_last_segment;
                                    GoImageView goImageView6 = (GoImageView) cma1.O(i9, inflate10);
                                    if (goImageView6 != null) {
                                        i9 = reh0.start;
                                        if (((GoImageView) cma1.O(i9, inflate10)) != null) {
                                            i9 = reh0.train;
                                            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i9, inflate10);
                                            if (goLinearLayout != null) {
                                                return new pr1(new bd30((GoLinearLayout) inflate10, goImageView2, goImageView3, goView, goImageView4, goImageView5, goImageView6, goLinearLayout));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate10.getResources().getResourceName(i9)));
                return null;
            case 22:
                Set set = (Set) obj2;
                return set != null ? v4r0.i(set, "UnifiedPollingRepositoryImpl:SPECIAL_ONE_TIME_ID") : Collections.singleton("UnifiedPollingRepositoryImpl:SPECIAL_ONE_TIME_ID");
            case 23:
                Set set2 = (Set) obj2;
                return v4r0.h(Collections.singleton("UnifiedPollingRepositoryImpl:SPECIAL_ONE_TIME_ID"), set2 != null ? set2 : EmptySet.a);
            case 24:
                View inflate11 = ((LayoutInflater) obj).inflate(qmh0.ybsdk_item_upgrade_loadable_input, (ViewGroup) obj2, false);
                if (inflate11 != null) {
                    LoadableInput loadableInput = (LoadableInput) inflate11;
                    return new b361(loadableInput, loadableInput);
                }
                ny61.t("rootView");
                return null;
            case 25:
                View inflate12 = ((LayoutInflater) obj).inflate(qmh0.ybsdk_item_upgrade_loading, (ViewGroup) obj2, false);
                int i10 = jah0.underline;
                View O = cma1.O(i10, inflate12);
                if (O != null) {
                    return new c361((ConstraintLayout) inflate12, O);
                }
                ny61.t("Missing required view with ID: ".concat(inflate12.getResources().getResourceName(i10)));
                return null;
            case 26:
                View inflate13 = ((LayoutInflater) obj).inflate(qmh0.ybsdk_item_upgrade_suggest, (ViewGroup) obj2, false);
                if (inflate13 != null) {
                    TextView textView3 = (TextView) inflate13;
                    return new d361(textView3, textView3);
                }
                ny61.t("rootView");
                return null;
            case 27:
                gru o = gru.o((LayoutInflater) obj, (ViewGroup) obj2);
                ConstraintLayout constraintLayout = o.a;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = tje.r(tsg0.shortcut_item_usual_width, constraintLayout.getContext());
                constraintLayout.setLayoutParams(layoutParams);
                o.b.setRotationY(r1.getResources().getInteger(ojh0.rtl_support_angle_for_image_mirrored));
                return new vv21(o, 2);
            case 28:
                ((Integer) obj).intValue();
                return ((zxu) obj2).a;
            default:
                return Boolean.valueOf(((Integer) obj2).intValue() != ((s6y) obj).n - 1);
        }
    }

    public /* synthetic */ jiz0(int i, int i2) {
        this.a = i2;
    }
}
