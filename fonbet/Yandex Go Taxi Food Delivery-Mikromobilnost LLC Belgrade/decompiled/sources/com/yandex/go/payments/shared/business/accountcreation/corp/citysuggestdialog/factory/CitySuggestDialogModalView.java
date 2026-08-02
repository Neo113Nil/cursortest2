package com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory;

import android.view.View;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.aph0;
import defpackage.ax4;
import defpackage.b61;
import defpackage.bk;
import defpackage.c29;
import defpackage.ej6;
import defpackage.ewb;
import defpackage.fwb;
import defpackage.gwb;
import defpackage.o61;
import defpackage.t030;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.search.view.BaseAddressSearchModalView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/citysuggestdialog/factory/CitySuggestDialogModalView;", "Lru/yandex/taxi/search/view/BaseAddressSearchModalView;", "Lb61;", "Lru/yandex/taxi/search/view/AddressSearchView;", "viewBuilder", "Lej6;", "branchedAnalytics", "Lcom/yandex/go/sharedpayments/api/analytics/SharedPaymentsOpenReason;", "openReason", "<init>", "(Lb61;Lej6;Lcom/yandex/go/sharedpayments/api/analytics/SharedPaymentsOpenReason;)V", "Lzy11;", "onDismissManually", "()V", "Lax4;", "onAddressPickedListener", "setOnAddressPickedListener", "(Lax4;)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/View;", "getFocusedForAccessibilityViewOnAppear", "()Landroid/view/View;", "onTouchOutside", "Lej6;", "getBranchedAnalytics", "()Lej6;", "Lcom/yandex/go/sharedpayments/api/analytics/SharedPaymentsOpenReason;", "getOpenReason", "()Lcom/yandex/go/sharedpayments/api/analytics/SharedPaymentsOpenReason;", "Lt030;", "modalViewCompatibleDelegate", "Lt030;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "Companion", "gwb", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CitySuggestDialogModalView extends BaseAddressSearchModalView<b61, AddressSearchView> {
    public static final int $stable = 8;
    public static final gwb Companion = new gwb();
    private final ej6 branchedAnalytics;
    private final t030 modalViewCompatibleDelegate;
    private final SharedPaymentsOpenReason openReason;

    public CitySuggestDialogModalView(b61 b61Var, ej6 ej6Var, SharedPaymentsOpenReason sharedPaymentsOpenReason) {
        super(b61Var);
        this.branchedAnalytics = ej6Var;
        this.openReason = sharedPaymentsOpenReason;
        this.modalViewCompatibleDelegate = new c29(22, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(CitySuggestDialogModalView citySuggestDialogModalView, View view, boolean z) {
        if (z) {
            ej6 ej6Var = citySuggestDialogModalView.branchedAnalytics;
            SharedPaymentsOpenReason sharedPaymentsOpenReason = citySuggestDialogModalView.openReason;
            o61 o61Var = ej6Var.b;
            String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
            o61Var.getClass();
            HashMap hashMap = new HashMap();
            if (analyticsName != null) {
                hashMap.put("open_reason", analyticsName);
            }
            o61Var.a.a("CitySuggestScreen.TextFocused", hashMap, 1, new HashMap());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(CitySuggestDialogModalView citySuggestDialogModalView) {
        if (citySuggestDialogModalView.isExpanded()) {
            citySuggestDialogModalView.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDetachedFromWindow$lambda$0(View view, boolean z) {
    }

    public final ej6 getBranchedAnalytics() {
        return this.branchedAnalytics;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return aph0.address_search_modal_view;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public View getFocusedForAccessibilityViewOnAppear() {
        return getAddressSearchView().addressInput;
    }

    public final SharedPaymentsOpenReason getOpenReason() {
        return this.openReason;
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ej6 ej6Var = this.branchedAnalytics;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = this.openReason;
        o61 o61Var = ej6Var.b;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        o61Var.a.a("CitySuggestScreen.Shown", hashMap, 1, new HashMap());
        getAddressSearchView().addressInput.setOnFocusChangeListener(new bk(7, this));
        getAddressSearchView().setOnKeyboardListener(new ewb(this, 0));
        getAddressSearchView().setModalViewCompatibleDelegate(this.modalViewCompatibleDelegate);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ej6 ej6Var = this.branchedAnalytics;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = this.openReason;
        o61 o61Var = ej6Var.b;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        o61Var.a.a("CitySuggestScreen.Closed", hashMap, 1, new HashMap());
        getAddressSearchView().addressInput.setOnFocusChangeListener(new fwb(0));
        getAddressSearchView().setOnKeyboardListener(null);
        getAddressSearchView().setModalViewCompatibleDelegate(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        getAddressSearchView().onParentDismissManually();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        getAddressSearchView().onTouchOutside();
        super.onTouchOutside();
    }

    public final void setOnAddressPickedListener(ax4 onAddressPickedListener) {
        getAddressSearchView().setOnAddressPickedListener(onAddressPickedListener);
    }
}
