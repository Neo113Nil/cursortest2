package com.yandex.go.taxi.order.cancel.reasons.view.v1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.go.taxi.order.cancel.reasons.analytics.CancelReasonsAnalytics$CloseReason;
import com.yandex.go.taxi.order.cancel.reasons.view.v1.CancelReasonsV1View;
import com.yandex.go.zone.dto.objects.UserCancelReasonChoice;
import defpackage.bx7;
import defpackage.ce0;
import defpackage.dn7;
import defpackage.o97;
import defpackage.p8h0;
import defpackage.qx7;
import defpackage.rk6;
import defpackage.rp31;
import defpackage.sls;
import defpackage.tje;
import defpackage.wls;
import defpackage.zkh0;
import defpackage.zy11;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.adapter.BindableAdapter;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.ListAdapterLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002-.B]\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \b\u0001\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR,\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/yandex/go/taxi/order/cancel/reasons/view/v1/CancelReasonsV1View;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lbx7;", "cancelReasonsAnalytics", "Lkotlin/Function2;", "", "", "Lzy11;", "onChoiceSelected", "Lkotlin/Function0;", "onDismiss", "Lcom/yandex/go/zone/dto/objects/UserCancelReasonChoice;", "choices", "Landroid/content/Context;", "context", "<init>", "(Lbx7;Lwls;Lsls;Ljava/util/List;Landroid/content/Context;)V", "setListeners", "()V", "reportClosedRollOff", "reportClosedOther", "onAttachedToWindow", "onDetachedFromWindow", "getComment", "()Ljava/lang/String;", "onDismissManually", "Lbx7;", "Lwls;", "Lsls;", "Lru/yandex/taxi/widget/ListAdapterLinearLayout;", "reasonsListView", "Lru/yandex/taxi/widget/ListAdapterLinearLayout;", "Lru/yandex/taxi/design/ListItemInputComponent;", "commentView", "Lru/yandex/taxi/design/ListItemInputComponent;", "Landroid/view/View;", "done", "Landroid/view/View;", "Lcom/yandex/go/taxi/order/cancel/reasons/view/v1/CancelReasonsV1View$ReasonsAdapter;", "adapter", "Lcom/yandex/go/taxi/order/cancel/reasons/view/v1/CancelReasonsV1View$ReasonsAdapter;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "ReasonsAdapter", "rx7", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelReasonsV1View extends SlideableModalView {
    public static final int $stable = 8;
    private final ReasonsAdapter adapter;
    private final bx7 cancelReasonsAnalytics;
    private final ListItemInputComponent commentView;
    private final View done;
    private final wls onChoiceSelected;
    private final sls onDismiss;
    private final ListAdapterLinearLayout reasonsListView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelReasonsV1View(bx7 bx7Var, wls wlsVar, sls slsVar, List<UserCancelReasonChoice> list, Context context) {
        super(context, 3);
        final int i = 3;
        this.cancelReasonsAnalytics = bx7Var;
        this.onChoiceSelected = wlsVar;
        this.onDismiss = slsVar;
        int i2 = p8h0.reasons;
        WeakHashMap weakHashMap = b.a;
        ListAdapterLinearLayout listAdapterLinearLayout = (ListAdapterLinearLayout) ((View) rp31.d(this, i2));
        this.reasonsListView = listAdapterLinearLayout;
        ListItemInputComponent listItemInputComponent = (ListItemInputComponent) ((View) rp31.d(this, p8h0.comment));
        this.commentView = listItemInputComponent;
        this.done = (View) rp31.d(this, p8h0.done);
        ReasonsAdapter reasonsAdapter = new ReasonsAdapter(list, context);
        this.adapter = reasonsAdapter;
        final int i3 = 0;
        setOnBackPressedListener(new Runnable(this) { // from class: px7
            public final /* synthetic */ CancelReasonsV1View b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                CancelReasonsV1View cancelReasonsV1View = this.b;
                switch (i4) {
                    case 0:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    case 1:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    case 2:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    default:
                        cancelReasonsV1View.reportClosedRollOff();
                        break;
                }
            }
        });
        final int i4 = 1;
        setOnArrowClickListener(new Runnable(this) { // from class: px7
            public final /* synthetic */ CancelReasonsV1View b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i42 = i4;
                CancelReasonsV1View cancelReasonsV1View = this.b;
                switch (i42) {
                    case 0:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    case 1:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    case 2:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    default:
                        cancelReasonsV1View.reportClosedRollOff();
                        break;
                }
            }
        });
        final int i5 = 2;
        setOnTouchOutsideListener(new Runnable(this) { // from class: px7
            public final /* synthetic */ CancelReasonsV1View b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i42 = i5;
                CancelReasonsV1View cancelReasonsV1View = this.b;
                switch (i42) {
                    case 0:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    case 1:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    case 2:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    default:
                        cancelReasonsV1View.reportClosedRollOff();
                        break;
                }
            }
        });
        setOnSlideOutListener(new Runnable(this) { // from class: px7
            public final /* synthetic */ CancelReasonsV1View b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i42 = i;
                CancelReasonsV1View cancelReasonsV1View = this.b;
                switch (i42) {
                    case 0:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    case 1:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    case 2:
                        cancelReasonsV1View.reportClosedOther();
                        break;
                    default:
                        cancelReasonsV1View.reportClosedRollOff();
                        break;
                }
            }
        });
        listAdapterLinearLayout.setAdapter(reasonsAdapter);
        KeyboardAwareRobotoEditText input = listItemInputComponent.getInput();
        listItemInputComponent.setInputVerticalPadding(tje.u(12, getContext()));
        listItemInputComponent.setOnKeyboardCloseListener(new dn7(8, input));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(KeyboardAwareRobotoEditText keyboardAwareRobotoEditText) {
        keyboardAwareRobotoEditText.clearFocus();
        keyboardAwareRobotoEditText.post(new ce0(keyboardAwareRobotoEditText, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportClosedOther() {
        this.cancelReasonsAnalytics.a(CancelReasonsAnalytics$CloseReason.OTHER, EmptyList.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportClosedRollOff() {
        this.cancelReasonsAnalytics.a(CancelReasonsAnalytics$CloseReason.ROLL_OFF, EmptyList.a);
    }

    private final void setListeners() {
        this.reasonsListView.setOnItemClickListener(new o97(1, this));
        c.z(new rk6(13, this), this.done);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$0(CancelReasonsV1View cancelReasonsV1View, AdapterView adapterView, View view, int i, long j) {
        cancelReasonsV1View.adapter.toggle(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setListeners$lambda$1(CancelReasonsV1View cancelReasonsV1View) {
        cancelReasonsV1View.onChoiceSelected.invoke(cancelReasonsV1View.adapter.getSelectedChoices(), cancelReasonsV1View.getComment());
        cancelReasonsV1View.cancelReasonsAnalytics.a(CancelReasonsAnalytics$CloseReason.DONE, cancelReasonsV1View.adapter.getSelectedChoices());
        cancelReasonsV1View.dismiss();
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return zkh0.cancel_reasons_v1;
    }

    public final String getComment() {
        Editable text = this.commentView.getText();
        String obj = text != null ? text.toString() : null;
        return obj == null ? "" : obj;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setListeners();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.adapter.clean(this.reasonsListView);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        this.onDismiss.invoke();
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J'\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\u0003¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b*\u0010+J\u0015\u0010*\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b*\u0010,J\u0015\u0010.\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001f¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0017\u00101\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0016R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\r048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/yandex/go/taxi/order/cancel/reasons/view/v1/CancelReasonsV1View$ReasonsAdapter;", "Lru/yandex/taxi/adapter/BindableAdapter;", "Lcom/yandex/go/zone/dto/objects/UserCancelReasonChoice;", "", IssuingDistributionPointExtension.REASONS, "Landroid/content/Context;", "context", "<init>", "(Ljava/util/List;Landroid/content/Context;)V", "Landroid/widget/TextView;", "view", "", "width", "", "text", "calculateTextHeight", "(Landroid/widget/TextView;ILjava/lang/String;)I", "choice", "", "isChecked", "(Lcom/yandex/go/zone/dto/objects/UserCancelReasonChoice;)Z", "getCount", "()I", "position", "getItem", "(I)Lcom/yandex/go/zone/dto/objects/UserCancelReasonChoice;", "", "getItemId", "(I)J", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "newView", "(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;)Landroid/view/View;", "item", "Lzy11;", "bindView", "(Lcom/yandex/go/zone/dto/objects/UserCancelReasonChoice;ILandroid/view/View;)V", "getSelectedChoices", "()Ljava/util/List;", "toggle", "(I)V", "(Lcom/yandex/go/zone/dto/objects/UserCancelReasonChoice;)V", "parent", "clean", "(Landroid/view/ViewGroup;)V", "Ljava/util/List;", "ANIMATOR_KEY", CA20Status.STATUS_USER_I, "getANIMATOR_KEY", "", "selectedReasons", "Ljava/util/Set;", "com/yandex/go/taxi/order/cancel/reasons/view/v1/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ReasonsAdapter extends BindableAdapter<UserCancelReasonChoice> {
        public static final int $stable = 8;
        private final int ANIMATOR_KEY;
        private final List<UserCancelReasonChoice> reasons;
        private final Set<String> selectedReasons;

        public ReasonsAdapter(List<UserCancelReasonChoice> list, Context context) {
            super(context);
            this.reasons = list;
            this.ANIMATOR_KEY = p8h0.cancel_feedback_animator;
            this.selectedReasons = new LinkedHashSet();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindView$lambda$0(int i, ListItemCheckComponent listItemCheckComponent, ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            listItemCheckComponent.subtitle().setHeight((int) (i * floatValue));
            listItemCheckComponent.subtitle().setAlpha(floatValue);
        }

        private final int calculateTextHeight(TextView view, int width, String text) {
            RobotoTextView robotoTextView = new RobotoTextView(view.getContext(), null, 0, 6, null);
            robotoTextView.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            robotoTextView.setTypeface(view.getTypeface());
            robotoTextView.setLineSpacing(view.getLineSpacingExtra(), view.getLineSpacingMultiplier());
            robotoTextView.setTextSize(0, view.getTextSize());
            robotoTextView.setText(text);
            robotoTextView.setTextAlignment(view.getTextAlignment());
            robotoTextView.setEllipsize(view.getEllipsize());
            robotoTextView.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return robotoTextView.getMeasuredHeight();
        }

        private final boolean isChecked(UserCancelReasonChoice choice) {
            return this.selectedReasons.contains(choice.b);
        }

        @Override // ru.yandex.taxi.adapter.BindableAdapter
        public void bindView(UserCancelReasonChoice item, int position, View view) {
            int height;
            ValueAnimator ofFloat;
            boolean isChecked = isChecked(item);
            final ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) view;
            boolean isChecked2 = listItemCheckComponent.getIsChecked();
            listItemCheckComponent.setChecked(isChecked);
            String str = item.c;
            String str2 = item.d;
            listItemCheckComponent.setTitle(str);
            if (isChecked2 == isChecked) {
                return;
            }
            ValueAnimator valueAnimator = (ValueAnimator) listItemCheckComponent.getTag(this.ANIMATOR_KEY);
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isChecked) {
                listItemCheckComponent.setSubtitle(str2);
                height = calculateTextHeight(listItemCheckComponent.subtitle(), listItemCheckComponent.title().getWidth(), str2);
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            } else {
                height = listItemCheckComponent.subtitle().getHeight();
                ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.taxi.order.cancel.reasons.view.v1.CancelReasonsV1View$ReasonsAdapter$bindView$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        ListItemCheckComponent.this.setSubtitle((CharSequence) null);
                    }
                });
            }
            ofFloat.addUpdateListener(new qx7(height, 0, listItemCheckComponent));
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.taxi.order.cancel.reasons.view.v1.CancelReasonsV1View$ReasonsAdapter$bindView$3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    ListItemCheckComponent.this.setTag(this.getANIMATOR_KEY(), null);
                }
            });
            ofFloat.setDuration(200L);
            listItemCheckComponent.setTag(this.ANIMATOR_KEY, ofFloat);
            ofFloat.start();
        }

        public final void clean(ViewGroup parent) {
            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = parent.getChildAt(i);
                ValueAnimator valueAnimator = (ValueAnimator) childAt.getTag(this.ANIMATOR_KEY);
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (childAt.getTag(this.ANIMATOR_KEY) != null) {
                    childAt.setTag(this.ANIMATOR_KEY, null);
                }
            }
        }

        public final int getANIMATOR_KEY() {
            return this.ANIMATOR_KEY;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.reasons.size();
        }

        @Override // ru.yandex.taxi.adapter.BindableAdapter, android.widget.Adapter
        public UserCancelReasonChoice getItem(int position) {
            return this.reasons.get(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return 0L;
        }

        public final List<String> getSelectedChoices() {
            return kotlin.collections.a.J0(this.selectedReasons);
        }

        @Override // ru.yandex.taxi.adapter.BindableAdapter
        public View newView(LayoutInflater inflater, int position, ViewGroup container) {
            View inflate = inflater.inflate(zkh0.reasons_list_item, container, false);
            inflate.setTag(new a(inflate));
            return inflate;
        }

        public final void toggle(UserCancelReasonChoice choice) {
            boolean isChecked = isChecked(choice);
            Set<String> set = this.selectedReasons;
            if (isChecked) {
                set.remove(choice.b);
            } else {
                set.add(choice.b);
            }
            notifyDataSetChanged();
        }

        public final void toggle(int position) {
            toggle(this.reasons.get(position));
        }
    }
}
