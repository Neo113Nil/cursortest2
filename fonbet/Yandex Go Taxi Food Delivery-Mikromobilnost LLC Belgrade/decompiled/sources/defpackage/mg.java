package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.snackbar.b;
import com.yandex.go.payments.cards.ui.CardNumberPadView;
import com.yandex.go.shortcuts.impl.view.adapter.h;
import com.yandex.go.tariffcard.ui.adapter.header.d;
import com.yandex.go.taxi.order.cancel.paid.ui.CancelledOrderCostModalView;
import com.yandex.go.taxi.order.rate.RateView;
import com.yandex.go.taxi.order.util.accordion.AccordionComponent;
import com.yandex.messaging.internal.view.timeline.c;
import com.ybsdk.navigation.NavigationFragment;
import com.ybsdk.widgets.common.MoneyInputEditView;
import com.ybsdk.widgets.common.MoneyInputView;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.CloseButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.LocationButtonIconComponent;
import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;
import ru.yandex.taxi.order.view.RatingReasonView;
import ru.yandex.taxi.order.view.RatingView;
import ru.yandex.taxi.plus.badge.CashbackAmountView;
import ru.yandex.taxi.widget.BackportNumberPicker;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.accessibility.AccessibilityLiveRegionTextView;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;

/* loaded from: classes6.dex */
public final class mg extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a;
    public final Object b;

    public mg(AnimatedListItemInputComponent animatedListItemInputComponent) {
        this.a = 3;
        this.b = animatedListItemInputComponent;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        boolean z;
        aj4 aj4Var;
        aj4 aj4Var2;
        switch (this.a) {
            case 4:
                BackportNumberPicker backportNumberPicker = (BackportNumberPicker) this.b;
                z = backportNumberPicker.mHasSelectorWheel;
                if (!z) {
                    return super.getAccessibilityNodeProvider(view);
                }
                aj4Var = backportNumberPicker.mAccessibilityNodeController;
                if (aj4Var == null) {
                    backportNumberPicker.mAccessibilityNodeController = new aj4(backportNumberPicker);
                }
                aj4Var2 = backportNumberPicker.mAccessibilityNodeController;
                return aj4Var2.a;
            default:
                return super.getAccessibilityNodeProvider(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r3.c != false) goto L15;
     */
    @Override // androidx.core.view.AccessibilityDelegateCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        r8i0 r8i0Var;
        r8i0 r8i0Var2;
        int i6 = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (i6) {
            case 4:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setClassName(view.getClass().getName());
                accessibilityEvent.setScrollable(true);
                BackportNumberPicker backportNumberPicker = (BackportNumberPicker) obj;
                i = backportNumberPicker.mMinValue;
                i2 = backportNumberPicker.mValue;
                int i7 = i2 + i;
                i3 = backportNumberPicker.mSelectorElementHeight;
                accessibilityEvent.setScrollY(i3 * i7);
                int i8 = backportNumberPicker.mMaxValue;
                i4 = backportNumberPicker.mMinValue;
                int i9 = i8 - i4;
                i5 = backportNumberPicker.mSelectorElementHeight;
                accessibilityEvent.setMaxScrollY(i5 * i9);
                break;
            case 13:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) obj).isChecked());
                break;
            case 27:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                RatingReasonView ratingReasonView = (RatingReasonView) obj;
                r8i0Var = ratingReasonView.data;
                if (r8i0Var != null) {
                    r8i0Var2 = ratingReasonView.data;
                    if (r8i0Var2 == null) {
                        r8i0Var2 = null;
                    }
                    break;
                }
                z = false;
                accessibilityEvent.setChecked(z);
                break;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        boolean z;
        String str;
        yss0 yss0Var;
        yss0 yss0Var2;
        CharSequence X;
        String str2;
        yss0 yss0Var3;
        yss0 yss0Var4;
        String str3;
        boolean hasAttachedBehavior;
        String str4;
        ibu ibuVar;
        int indexWithinVisibleButtons;
        View view2;
        MoneyInputEditView moneyInputEditView;
        TextView textView;
        View view3;
        s861 s861Var;
        r8i0 r8i0Var;
        r8i0 r8i0Var2;
        TextView textView2;
        int i = this.a;
        int i2 = 6;
        int i3 = 0;
        View view4 = null;
        String string = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                View view5 = ((ng) obj).b;
                if (view5.getImportantForAccessibility() != 1) {
                    ViewGroup viewGroup = view5 instanceof ViewGroup ? (ViewGroup) view5 : null;
                    if (viewGroup != null) {
                        while (i3 < viewGroup.getChildCount()) {
                            int i4 = i3 + 1;
                            View childAt = viewGroup.getChildAt(i3);
                            if (childAt == null) {
                                ny61.s();
                                break;
                            } else if (childAt.getImportantForAccessibility() == 1) {
                                i3 = i4;
                                view4 = childAt;
                            } else {
                                i3 = i4;
                            }
                        }
                        if (view4 != null) {
                            view5 = view4;
                        }
                    }
                }
                whVar.F(view5);
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                if (((AccessibilityLiveRegionTextView) obj).getContentDescription() != null) {
                    whVar.E(null);
                    break;
                }
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                AccordionComponent accordionComponent = (AccordionComponent) obj;
                z = accordionComponent.isCollapsed;
                if (z) {
                    str2 = accordionComponent.a11yCollapsedString;
                    yss0Var3 = accordionComponent.header;
                    String titleText = ((ListItemComponent) yss0Var3).getTitleText();
                    yss0Var4 = accordionComponent.header;
                    X = a.X(scc.g(str2, titleText, ((ListItemComponent) yss0Var4).getSubtitleText()), Extension.FIX_SPACE, null, null, null, 62);
                } else {
                    str = accordionComponent.a11yExpandedString;
                    yss0Var = accordionComponent.header;
                    String titleText2 = ((ListItemComponent) yss0Var).getTitleText();
                    yss0Var2 = accordionComponent.header;
                    X = a.X(scc.g(str, titleText2, ((ListItemComponent) yss0Var2).getSubtitleText()), Extension.FIX_SPACE, null, null, null, 62);
                }
                whVar.t(X);
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
                AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) obj;
                str3 = animatedListItemInputComponent.inputHint;
                CharSequence charSequence = (str3 == null || evu0.J(str3)) ? animatedListItemInputComponent.inputTitle : animatedListItemInputComponent.inputHint;
                CharSequence errorText = animatedListItemInputComponent.getErrorText();
                if (errorText != null && errorText.length() != 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = errorText;
                    } else {
                        charSequence = ((Object) charSequence) + Extension.FIX_SPACE + ((Object) errorText);
                    }
                }
                whVar.x(charSequence);
                break;
            case 4:
            case 26:
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                break;
            case 5:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                ((c) obj).v2.z.o(whVar);
                break;
            case 6:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.a(1048576);
                whVar.u(true);
                break;
            case 7:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) obj;
                hasAttachedBehavior = bottomSheetDragHandleView.hasAttachedBehavior();
                if (hasAttachedBehavior) {
                    CharSequence contentDescription = bottomSheetDragHandleView.getContentDescription();
                    int i5 = bottomSheetDragHandleView.bottomSheetBehavior.k0;
                    if (i5 == 3) {
                        string = bottomSheetDragHandleView.getResources().getString(kxh0.bottomsheet_state_expanded);
                    } else if (i5 == 4) {
                        string = bottomSheetDragHandleView.getResources().getString(kxh0.bottomsheet_state_collapsed);
                    } else if (i5 == 6) {
                        string = bottomSheetDragHandleView.getResources().getString(kxh0.bottomsheet_state_half_expanded);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        if (!TextUtils.isEmpty(contentDescription)) {
                            string = string + ". " + ((Object) contentDescription);
                        }
                        whVar.t(string);
                        break;
                    }
                }
                break;
            case 8:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p(ny6.class.getName());
                whVar.b(new ph(16, ((CircleButtonImageView) obj).getContext().getString(mzh0.common_close)));
                break;
            case 9:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.x(view.isEnabled() ? "" : ((CardNumberPadView) obj).getContext().getString(kyh0.check_correct_data_accessibility_text));
                break;
            case 10:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Switch");
                whVar.m(true);
                rx8 rx8Var = ((gz8) obj).U;
                if (rx8Var != null) {
                    whVar.o(rx8Var.isSelected());
                }
                if (view instanceof ViewGroup) {
                    String X2 = a.X(vng.h((ViewGroup) view), Extension.FIX_SPACE, null, null, null, 62);
                    if (X2.length() != 0) {
                        whVar.t(X2);
                        break;
                    }
                }
                break;
            case 11:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, ru.yandex.taxi.design.utils.c.G(kyh0.common_remove, ((fz8) obj).a)));
                if (view instanceof ViewGroup) {
                    String X3 = a.X(vng.h((ViewGroup) view), Extension.FIX_SPACE, null, null, null, 62);
                    if (X3.length() != 0) {
                        whVar.t(X3);
                        break;
                    }
                }
                break;
            case 12:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                CashbackAmountView cashbackAmountView = (CashbackAmountView) obj;
                Context context = cashbackAmountView.getContext();
                int i6 = a0i0.plus_sdk_badge_content_description;
                str4 = cashbackAmountView.currentText;
                whVar.t(context.getString(i6, str4));
                break;
            case 13:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                whVar.m(checkableImageButton.isCheckable());
                whVar.o(checkableImageButton.isChecked());
                break;
            case 14:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, ((CloseButtonIconComponent) obj).getContext().getString(kyh0.common_close)));
                break;
            case 15:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                z9u z9uVar = ((d) obj).q;
                if (z9uVar != null && (ibuVar = z9uVar.g) != null) {
                    whVar.q(ibuVar.a());
                    whVar.p(ibuVar.a() ? "android.widget.Button" : AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                    break;
                }
                break;
            case 16:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                oju ojuVar = (oju) obj;
                String str5 = ojuVar.a.isSelected() ? ojuVar.V : ojuVar.W;
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, str5));
                pbj pbjVar = ojuVar.s0;
                if (((String) pbjVar.w).length() == 0) {
                    oju ojuVar2 = (oju) pbjVar.B;
                    mr31 mr31Var = ojuVar2.r0;
                    View view6 = ojuVar2.a;
                    boolean z2 = mr31Var != null && pbjVar.b;
                    StringBuilder sb = new StringBuilder();
                    if (z2) {
                        pbj.c(sb, (String) pbjVar.c);
                    }
                    pbj.c(sb, cvu0.v((String) pbjVar.a, CancelledOrderCostModalView.PLACEHOLDER_TARIFF_NAME, (String) pbjVar.x, false));
                    pbj.c(sb, (String) pbjVar.y);
                    CharSequence charSequence2 = (CharSequence) pbjVar.A;
                    if (charSequence2 != null && charSequence2.length() != 0) {
                        pbj.c(sb, ru.yandex.taxi.design.utils.c.H(view6, kyh0.summary_accessibility_tariff_eta, (CharSequence) pbjVar.A));
                    }
                    pbj.c(sb, tfe.a((String) pbjVar.z, new hh8(9, view6), new w29(view6, i3)));
                    if (z2) {
                        pbj.c(sb, mr31Var.a);
                    }
                    pbjVar.w = sb.toString();
                }
                whVar.t((String) pbjVar.w);
                break;
            case 17:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.t(a.X(vng.h(((h) obj).d0), null, null, null, new l75(i2), 31));
                break;
            case 18:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, ((LocationButtonIconComponent) obj).getContext().getString(kyh0.detect_my_location_description)));
                break;
            case 19:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                indexWithinVisibleButtons = ((MaterialButtonToggleGroup) obj).getIndexWithinVisibleButtons(view);
                whVar.s(uh.a(0, 1, indexWithinVisibleButtons, 1, false, ((MaterialButton) view).isChecked()));
                break;
            case 20:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                view2 = materialCalendar.dayFrame;
                whVar.b(new ph(16, view2.getVisibility() == 0 ? materialCalendar.getString(kxh0.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(kxh0.mtrl_picker_toggle_to_day_selection)));
                break;
            case 21:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                MoneyInputView moneyInputView = (MoneyInputView) obj;
                whVar.v(moneyInputView.isEnabled());
                moneyInputEditView = moneyInputView.textInput;
                if (moneyInputEditView == null) {
                    moneyInputEditView = null;
                }
                Editable text = moneyInputEditView.getText();
                String obj2 = text != null ? text.toString() : null;
                if (obj2 == null) {
                    obj2 = "";
                }
                textView = moneyInputView.textCurrency;
                if (textView == null) {
                    textView = null;
                }
                CharSequence text2 = textView.getText();
                String obj3 = text2 != null ? text2.toString() : null;
                whVar.E(obj2 + " " + (obj3 != null ? obj3 : ""));
                break;
            case 22:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                view3 = ((MtCheckoutModalView) obj).backButton;
                whVar.F(view3);
                break;
            case 23:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                View view7 = ((y57) obj).a;
                whVar.b(new ph(16, view7.isSelected() ? ru.yandex.taxi.design.utils.c.G(kyh0.mt_routes_button_show_route, view7) : ru.yandex.taxi.design.utils.c.G(kyh0.mt_route_select_label_content_description, view7)));
                break;
            case 24:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.CheckBox");
                whVar.m(true);
                whVar.n(((mn40) obj).V.getIsChecked() ? 1 : 0);
                break;
            case 25:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                s861Var = ((NavigationFragment) obj).binding;
                whVar.a.setTraversalBefore((s861Var != null ? s861Var : null).b);
                break;
            case 27:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.CheckBox");
                whVar.m(true);
                RatingReasonView ratingReasonView = (RatingReasonView) obj;
                r8i0Var = ratingReasonView.data;
                if (r8i0Var != null) {
                    r8i0Var2 = ratingReasonView.data;
                    if ((r8i0Var2 != null ? r8i0Var2 : null).c) {
                        i3 = 1;
                    }
                }
                whVar.n(i3);
                break;
            case 28:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                RatingView ratingView = (RatingView) obj;
                String comment = ratingView.getComment();
                if (comment != null && !evu0.J(comment)) {
                    whVar.x(ratingView.getContext().getString(kyh0.comment_hint));
                    break;
                } else {
                    textView2 = ratingView.commentView;
                    CharSequence hint = textView2.getHint();
                    if (hint != null && !evu0.J(hint)) {
                        whVar.x(null);
                        break;
                    }
                }
                break;
            case 29:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                RobotoTextView robotoTextView = (RobotoTextView) obj;
                CharSequence text3 = robotoTextView.getText();
                if (text3 != null && text3.length() != 0) {
                    whVar.x(robotoTextView.getContext().getString(kyh0.comment_hint));
                    break;
                } else {
                    CharSequence hint2 = robotoTextView.getHint();
                    if (hint2 != null && hint2.length() != 0) {
                        whVar.x(null);
                        break;
                    }
                }
                break;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 7:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    ((BottomSheetDragHandleView) this.b).expandOrCollapseBottomSheetIfPossible();
                    break;
                }
                break;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 26:
                if (accessibilityEvent.getEventType() == 32768) {
                    ((RateView) this.b).lastFocusedView = view;
                }
                break;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 5:
                if (!((c) obj).v2.z.s(i)) {
                    break;
                }
                break;
            case 6:
                if (i != 1048576) {
                    break;
                } else {
                    ((com.google.android.material.snackbar.c) ((b) obj)).a(3);
                    break;
                }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    public /* synthetic */ mg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
