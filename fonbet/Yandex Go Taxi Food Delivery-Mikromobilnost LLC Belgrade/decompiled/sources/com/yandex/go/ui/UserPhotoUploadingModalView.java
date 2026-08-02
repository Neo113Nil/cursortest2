package com.yandex.go.ui;

import android.content.Context;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.agreement.trackable.analitycs.EULAAnalytics$AcceptanceTapAction;
import defpackage.ar21;
import defpackage.br21;
import defpackage.c230;
import defpackage.cma1;
import defpackage.cr21;
import defpackage.dr21;
import defpackage.eq21;
import defpackage.evu0;
import defpackage.ggh0;
import defpackage.gsh0;
import defpackage.hg;
import defpackage.hjb0;
import defpackage.i3y;
import defpackage.ip11;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.mth;
import defpackage.ny61;
import defpackage.nzm;
import defpackage.pav;
import defpackage.qdb1;
import defpackage.qzm;
import defpackage.r40;
import defpackage.seb1;
import defpackage.sje;
import defpackage.t601;
import defpackage.tje;
import defpackage.win;
import defpackage.wx11;
import defpackage.xw31;
import defpackage.y7z0;
import defpackage.z30;
import defpackage.zmh;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u000f*\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u000f*\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0014¢\u0006\u0004\b&\u0010\u0011J\u000f\u0010'\u001a\u00020\u000fH\u0014¢\u0006\u0004\b'\u0010\u0011J\u0017\u0010*\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/yandex/go/ui/UserPhotoUploadingModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ldr21;", "Landroid/content/Context;", "context", "Lcom/yandex/go/ui/d;", "presenter", "Lip11;", "typefaceDelegate", "Leq21;", "analytics", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lcom/yandex/go/ui/d;Lip11;Leq21;Lpav;)V", "Lzy11;", "backPressed", "()V", "touchOutside", "Lru/yandex/taxi/widget/RobotoTextView;", "", "eulaText", "updateLinkText", "(Lru/yandex/taxi/widget/RobotoTextView;Ljava/lang/CharSequence;)V", "charSequence", "setTextAnimated", "", "settlingLayoutChanges", "()Z", "Lc230;", "insetsType", "()Lc230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ldr21;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/yandex/go/ui/d;", "Lip11;", "Leq21;", "Lru/yandex/taxi/widget/text/method/LinkMovementMethod;", "linkMovementMethod$delegate", "Li3y;", "getLinkMovementMethod", "()Lru/yandex/taxi/widget/text/method/LinkMovementMethod;", "linkMovementMethod", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateChangeListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "cr21", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UserPhotoUploadingModalView extends SlideableBindingModalView<dr21> {
    private final eq21 analytics;

    /* renamed from: linkMovementMethod$delegate, reason: from kotlin metadata */
    private final i3y linkMovementMethod;
    private final d presenter;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
    private final ip11 typefaceDelegate;

    public UserPhotoUploadingModalView(Context context, d dVar, ip11 ip11Var, eq21 eq21Var, pav pavVar) {
        super(context);
        this.presenter = dVar;
        this.typefaceDelegate = ip11Var;
        this.analytics = eq21Var;
        int i = 0;
        this.linkMovementMethod = kotlin.a.a(new ar21(this, i));
        this.touchExplorationStateChangeListener = new sje(5, this);
        qdb1.c(this, new br21(this, i));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        ((CircleLoadingImageView) getBinding().b.h).init(pavVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void backPressed() {
        this.analytics.d("back_button");
        this.presenter.close();
    }

    private final LinkMovementMethod getLinkMovementMethod() {
        return (LinkMovementMethod) this.linkMovementMethod.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(UserPhotoUploadingModalView userPhotoUploadingModalView) {
        return userPhotoUploadingModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkMovementMethod linkMovementMethod_delegate$lambda$0(UserPhotoUploadingModalView userPhotoUploadingModalView) {
        return seb1.a(new wx11(15, userPhotoUploadingModalView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 linkMovementMethod_delegate$lambda$0$0(UserPhotoUploadingModalView userPhotoUploadingModalView, String str) {
        d dVar = userPhotoUploadingModalView.presenter;
        String str2 = dVar.O;
        if (str2 != null) {
            ((com.yandex.go.agreement.photoupload.a) dVar.I).c.b(str2, EULAAnalytics$AcceptanceTapAction.Deeplink, str);
        }
        ((hjb0) dVar.J).a(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextAnimated(RobotoTextView robotoTextView, CharSequence charSequence) {
        if (jl40.l(charSequence, robotoTextView.getText())) {
            return;
        }
        cma1.b(0.0f, robotoTextView).withEndAction(new t601(19, robotoTextView, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTextAnimated$lambda$0(RobotoTextView robotoTextView, CharSequence charSequence) {
        robotoTextView.setText(charSequence);
        if (charSequence == null || evu0.J(charSequence)) {
            cma1.L(robotoTextView);
        } else {
            cma1.J(robotoTextView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateChangeListener$lambda$0(UserPhotoUploadingModalView userPhotoUploadingModalView, boolean z) {
        RobotoTextView robotoTextView = (RobotoTextView) userPhotoUploadingModalView.getBinding().b.e;
        userPhotoUploadingModalView.updateLinkText(robotoTextView, robotoTextView.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void touchOutside() {
        this.analytics.d("out_of_screen");
        this.presenter.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLinkText(RobotoTextView robotoTextView, CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        URLSpan uRLSpan;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        String url = (spanned == null || (uRLSpanArr = (URLSpan[]) spanned.getSpans(0, ((Spanned) charSequence).length(), URLSpan.class)) == null || (uRLSpan = (URLSpan) j73.D(uRLSpanArr)) == null) ? null : uRLSpan.getURL();
        if (url == null) {
            robotoTextView.setMovementMethod(null);
            robotoTextView.setOnClickListener(null);
            androidx.core.view.b.p(robotoTextView, null);
        } else if (tje.L(robotoTextView.getContext())) {
            robotoTextView.setMovementMethod(null);
            robotoTextView.setOnClickListener(new y7z0(13, this, url));
            hg.a(robotoTextView);
        } else {
            robotoTextView.setOnClickListener(null);
            androidx.core.view.b.p(robotoTextView, null);
            robotoTextView.setMovementMethod(getLinkMovementMethod());
        }
        setTextAnimated(robotoTextView, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateLinkText$lambda$0(UserPhotoUploadingModalView userPhotoUploadingModalView, String str, View view) {
        d dVar = userPhotoUploadingModalView.presenter;
        String str2 = dVar.O;
        if (str2 != null) {
            ((com.yandex.go.agreement.photoupload.a) dVar.I).c.b(str2, EULAAnalytics$AcceptanceTapAction.Deeplink, str);
        }
        ((hjb0) dVar.J).a(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public dr21 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(gsh0.user_photo_uploading_modal_view, parent, false);
        int i = ggh0.user_photo_content;
        View O = cma1.O(i, inflate);
        if (O != null) {
            int i2 = ggh0.buttons;
            LinearLayout linearLayout = (LinearLayout) cma1.O(i2, O);
            if (linearLayout != null) {
                i2 = ggh0.eula_consent;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, O);
                if (robotoTextView != null) {
                    i2 = ggh0.status;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, O);
                    if (robotoTextView2 != null) {
                        i2 = ggh0.subtitle;
                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i2, O);
                        if (robotoTextView3 != null) {
                            i2 = ggh0.title;
                            RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i2, O);
                            if (robotoTextView4 != null) {
                                i2 = ggh0.user_photo;
                                CircleLoadingImageView circleLoadingImageView = (CircleLoadingImageView) cma1.O(i2, O);
                                if (circleLoadingImageView != null) {
                                    qzm qzmVar = new qzm((ConstraintLayout) O, linearLayout, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4, circleLoadingImageView);
                                    i = ggh0.user_photo_error;
                                    View O2 = cma1.O(i, inflate);
                                    if (O2 != null) {
                                        int i3 = ggh0.button_reload;
                                        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i3, O2);
                                        if (buttonComponent != null) {
                                            i3 = ggh0.error_text;
                                            if (((RobotoTextView) cma1.O(i3, O2)) != null) {
                                                i3 = ggh0.error_view;
                                                if (((AppCompatImageView) cma1.O(i3, O2)) != null) {
                                                    nzm nzmVar = new nzm(buttonComponent, 13, (ConstraintLayout) O2);
                                                    int i4 = ggh0.user_photo_loading;
                                                    View O3 = cma1.O(i4, inflate);
                                                    if (O3 != null) {
                                                        return new dr21((FrameLayout) inflate, qzmVar, nzmVar, new win(2, (FrameLayout) O3));
                                                    }
                                                    i = i4;
                                                }
                                            }
                                        }
                                        ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i3)));
                                        return null;
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
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new ar21(this, 1), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchOutsideListener(new br21(this, 1));
        setOnBackPressedListener(new br21(this, 2));
        tje.B(getContext()).addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        d dVar = this.presenter;
        cr21 cr21Var = new cr21(this);
        dVar.Bg(cr21Var);
        com.yandex.go.domain.interactor.d dVar2 = dVar.z;
        r40 r40Var = null;
        int i = 3;
        tje.N(dVar.Jg(), null, null, new UserPhotoUploadingPresenter$attachView$$inlined$collectIn$1(dVar2.b.l, null, dVar), 3);
        tje.N(dVar.Jg(), null, null, new UserPhotoUploadingPresenter$attachView$2(dVar, null), 3);
        tje.N(dVar.Jg(), null, null, new UserPhotoUploadingPresenter$attachView$$inlined$collectIn$2(new jqr(e.t(new o(e.n(dVar2.b.j, e.d(dVar.M), e.d(dVar.L), new UserPhotoUploadingPresenter$attachView$3(dVar, null)), new UserPhotoUploadingPresenter$attachView$4(dVar, null))), new UserPhotoUploadingPresenter$attachView$5(2, dVar, d.class, "reportEulaShownIfNeeded", "reportEulaShownIfNeeded(Lcom/yandex/go/ui/UserPhotoUploadingState;)V", 4), i), null, cr21Var), 3);
        g gVar = dVar.C;
        e.H(dVar.Jg(), new jqr(gVar.a(HProv.PP_DELETE_SAVED_PASSWD), new UserPhotoUploadingPresenter$attachView$7(2, dVar, d.class, "checkIsPermissionChanged", "checkIsPermissionChanged(Lru/yandex/taxi/activity/ActivityResult;)V", 4), i));
        e.H(dVar.Jg(), new jqr(gVar.a(HProv.PP_FAST_CODE), new UserPhotoUploadingPresenter$attachView$8(dVar, null), i));
        e.H(dVar.Jg(), new jqr(new mth(new ru.yandex.taxi.activity.d(new ru.yandex.taxi.activity.b(gVar.d, HProv.PP_CONTAINER_EXTENSION)), 6), new UserPhotoUploadingPresenter$attachView$9(dVar, null), i));
        AtomicReference atomicReference = gVar.a;
        r40 r40Var2 = (r40) atomicReference.get();
        if (r40Var2 != null && r40Var2.b == 131) {
            r40Var = (r40) atomicReference.getAndSet(null);
        }
        if (r40Var != null) {
            dVar.Og(r40Var);
        }
        z30 b = gVar.b(HProv.PP_CONTAINER_EXTENSION);
        if (b != null) {
            dVar.Ng(b);
        }
        RobotoTextView robotoTextView = (RobotoTextView) getBinding().b.g;
        ip11 ip11Var = this.typefaceDelegate;
        getContext();
        robotoTextView.setTypeface(((zmh) ip11Var).d(), 1);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tje.B(getContext()).removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public boolean settlingLayoutChanges() {
        return false;
    }
}
