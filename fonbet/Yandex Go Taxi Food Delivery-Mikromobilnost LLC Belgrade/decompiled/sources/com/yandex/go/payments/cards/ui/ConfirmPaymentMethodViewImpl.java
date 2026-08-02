package com.yandex.go.payments.cards.ui;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.payments.cards.verification.confirm.ConfirmCardModalView;
import defpackage.a350;
import defpackage.b90;
import defpackage.bia0;
import defpackage.ca0;
import defpackage.ci;
import defpackage.da0;
import defpackage.e6h0;
import defpackage.erw;
import defpackage.g3e;
import defpackage.gyc;
import defpackage.io9;
import defpackage.j6i0;
import defpackage.j831;
import defpackage.jj8;
import defpackage.jj91;
import defpackage.luh0;
import defpackage.lyc;
import defpackage.m2v;
import defpackage.n3e;
import defpackage.r3e;
import defpackage.rp31;
import defpackage.s3e;
import defpackage.se8;
import defpackage.t3e;
import defpackage.wjh;
import defpackage.xqw;
import defpackage.z80;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001IB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0015¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0015¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u000eJ\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010\u000eJ\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010B\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010=R\u0014\u0010C\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010@R\u0014\u0010D\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010G¨\u0006J"}, d2 = {"Lcom/yandex/go/payments/cards/ui/ConfirmPaymentMethodViewImpl;", "Lcom/yandex/go/payments/cards/ui/ConfirmPaymentMethodView;", "Landroid/content/Context;", "context", "Lcom/yandex/go/payments/cards/ui/c;", "presenter", "Lbia0;", "paymentResourceProvider", "Lse8;", "cardDisplayNameProvider", "<init>", "(Landroid/content/Context;Lcom/yandex/go/payments/cards/ui/c;Lbia0;Lse8;)V", "Lzy11;", "resume", "()V", "pause", "", "onDismiss", "()Z", "Lr3e;", "delegate", "setToolbarDelegate", "(Lr3e;)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "onResume", "(Landroid/app/Activity;)V", "onBackPressed", "La350;", "getOrCreateRandomAmountViewHolder", "()La350;", "Ln3e;", "getOrCreateConfirmCvnViewHolder", "()Ln3e;", "onConfirm", "", "title", "showToolbar", "(Ljava/lang/String;)V", "Lcom/yandex/go/payments/cards/ui/c;", "Lbia0;", "Lse8;", "Lcom/yandex/go/payments/cards/ui/AddCardStatus;", "addCardStatus", "Lcom/yandex/go/payments/cards/ui/AddCardStatus;", "inProgress", "Z", "confirmPaymentViewHolder", "La350;", "extToolbarDelegate", "Lr3e;", "Landroid/view/View;", "statusLayout", "Landroid/view/View;", "Landroid/widget/TextView;", "statusTitleView", "Landroid/widget/TextView;", "statusTextView", "spinnerLayout", "confirmButton", "progressText", "Landroid/view/ViewStub;", "randomAmountLayoutStub", "Landroid/view/ViewStub;", "confirmCardCvnLayoutStub", "t3e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConfirmPaymentMethodViewImpl extends ConfirmPaymentMethodView {
    public static final int $stable = 8;
    private AddCardStatus addCardStatus;
    private final se8 cardDisplayNameProvider;
    private final TextView confirmButton;
    private final ViewStub confirmCardCvnLayoutStub;
    private a350 confirmPaymentViewHolder;
    private r3e extToolbarDelegate;
    private boolean inProgress;
    private final bia0 paymentResourceProvider;
    private final c presenter;
    private final TextView progressText;
    private final ViewStub randomAmountLayoutStub;
    private final View spinnerLayout;
    private final View statusLayout;
    private final TextView statusTextView;
    private final TextView statusTitleView;

    public ConfirmPaymentMethodViewImpl(Context context, c cVar, bia0 bia0Var, se8 se8Var) {
        super(context);
        this.presenter = cVar;
        this.paymentResourceProvider = bia0Var;
        this.cardDisplayNameProvider = se8Var;
        this.addCardStatus = AddCardStatus.SUCCESS;
        ru.yandex.taxi.design.utils.c.q(this, luh0.confirm_card_view, true);
        setFocusable(true);
        setImportantForAccessibility(1);
        int i = e6h0.status_layout;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.statusLayout = (View) rp31.d(this, i);
        this.statusTitleView = (TextView) ((View) rp31.d(this, e6h0.status_title));
        this.statusTextView = (TextView) ((View) rp31.d(this, e6h0.status_text));
        this.spinnerLayout = (View) rp31.d(this, e6h0.spinner_layout);
        this.confirmButton = (TextView) ((View) rp31.d(this, e6h0.done));
        this.progressText = (TextView) ((View) rp31.d(this, e6h0.status));
        this.randomAmountLayoutStub = (ViewStub) ((View) rp31.d(this, e6h0.random_amount_stub));
        this.confirmCardCvnLayoutStub = (ViewStub) ((View) rp31.d(this, e6h0.confirm_card_cvn_stub));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getActivity() {
        return jj91.b(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n3e getOrCreateConfirmCvnViewHolder() {
        a350 a350Var = this.confirmPaymentViewHolder;
        if (a350Var instanceof n3e) {
            return (n3e) a350Var;
        }
        n3e n3eVar = new n3e(this.confirmCardCvnLayoutStub.inflate(), new s3e(this, 1), new d(this), this.paymentResourceProvider, this.cardDisplayNameProvider);
        if (isAttachedToWindow()) {
            n3eVar.b();
        }
        this.confirmPaymentViewHolder = n3eVar;
        return n3eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a350 getOrCreateRandomAmountViewHolder() {
        a350 a350Var = this.confirmPaymentViewHolder;
        if (a350Var instanceof j6i0) {
            return a350Var;
        }
        j6i0 j6i0Var = new j6i0(this.randomAmountLayoutStub.inflate(), new s3e(this, 0), new io9(this));
        if (isAttachedToWindow()) {
            j6i0Var.b();
        }
        this.confirmPaymentViewHolder = j6i0Var;
        return j6i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl) {
        confirmPaymentMethodViewImpl.onConfirm();
        return zy11.a;
    }

    private final void onBackPressed() {
        a350 a350Var = this.confirmPaymentViewHolder;
        if (a350Var == null || a350Var.d() != ConfirmationType.RANDOM_AMOUNT) {
            return;
        }
        c cVar = this.presenter;
        j831 j831Var = ((b90) cVar.A).e;
        cVar.E.l(j831Var != null ? j831Var.a.b : null);
    }

    private final void onConfirm() {
        g3e g3eVar;
        g3e g3eVar2;
        c cVar = this.presenter;
        AddCardStatus addCardStatus = this.addCardStatus;
        erw erwVar = cVar.A;
        gyc gycVar = cVar.C;
        cVar.O = false;
        if (addCardStatus == AddCardStatus.FAILED_CVV_MISSING) {
            g3eVar2 = ((ConfirmCardModalView) gycVar.a).confirmCardNavigator;
            ((da0) ((io9) g3eVar2).a).r(new ca0(erwVar, 2));
            return;
        }
        int i = 1;
        boolean z = addCardStatus == AddCardStatus.SUCCESS;
        b90 b90Var = (b90) erwVar;
        m2v m2vVar = b90Var.g;
        xqw xqwVar = b90Var.k;
        m2vVar.getClass();
        z80 z80Var = new z80(m2vVar, z, null, xqwVar);
        g3eVar = ((ConfirmCardModalView) gycVar.a).confirmCardNavigator;
        ((da0) ((io9) g3eVar).a).r(new jj8(z80Var, i));
    }

    private final void onResume(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            OneShotPreDrawListener.add(currentFocus, new ci(currentFocus, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showToolbar(String title) {
        r3e r3eVar = this.extToolbarDelegate;
        if (r3eVar != null) {
            r3eVar.a(title);
            return;
        }
        a350 a350Var = this.confirmPaymentViewHolder;
        if (a350Var != null) {
            a350Var.a(title);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        super.dispatchTouchEvent(ev);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ru.yandex.taxi.design.utils.c.z(new lyc(10, this), this.confirmButton);
        a350 a350Var = this.confirmPaymentViewHolder;
        if (a350Var != null && !a350Var.c) {
            a350Var.b();
        }
        c cVar = this.presenter;
        t3e t3eVar = new t3e(this);
        cVar.Bg(t3eVar);
        wjh wjhVar = (wjh) cVar.D;
        wjhVar.getClass();
        wjh.b.add(cVar);
        wjhVar.a.getWindow().setFlags(8192, 8192);
        t3eVar.rf(false);
        this.presenter.resume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.pause();
        this.presenter.Cg();
        this.confirmButton.setOnClickListener(null);
        a350 a350Var = this.confirmPaymentViewHolder;
        if (a350Var != null) {
            a350Var.c();
        }
    }

    @Override // com.yandex.go.payments.cards.ui.ConfirmPaymentMethodView
    public boolean onDismiss() {
        if (this.inProgress) {
            return true;
        }
        if (this.addCardStatus != AddCardStatus.SUCCESS) {
            onConfirm();
            return true;
        }
        onBackPressed();
        return false;
    }

    @Override // com.yandex.go.payments.cards.ui.ConfirmPaymentMethodView
    public void pause() {
    }

    @Override // com.yandex.go.payments.cards.ui.ConfirmPaymentMethodView
    public void resume() {
        Activity activity = getActivity();
        if (activity != null) {
            onResume(activity);
        }
    }

    @Override // com.yandex.go.payments.cards.ui.ConfirmPaymentMethodView
    public void setToolbarDelegate(r3e delegate) {
        this.extToolbarDelegate = delegate;
    }
}
