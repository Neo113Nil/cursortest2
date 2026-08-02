package com.yandex.go.chargers.qr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanButtonName;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanState;
import com.yandex.go.chargers.qr.data.model.ChargersQrMode;
import com.yandex.go.design.widget.qr.QrBackButtonComponent;
import defpackage.a60;
import defpackage.bk;
import defpackage.bma;
import defpackage.boa;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.co7;
import defpackage.coa;
import defpackage.e230;
import defpackage.eoa;
import defpackage.foa;
import defpackage.goa;
import defpackage.joa;
import defpackage.jpa;
import defpackage.k1a;
import defpackage.kpa;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.od9;
import defpackage.ooa;
import defpackage.poa;
import defpackage.pw0;
import defpackage.pya;
import defpackage.qp7;
import defpackage.qu;
import defpackage.t1w;
import defpackage.tje;
import defpackage.toa;
import defpackage.tse;
import defpackage.uhh0;
import defpackage.uoa;
import defpackage.ush0;
import defpackage.uz;
import defpackage.v1h0;
import defpackage.vng;
import defpackage.w130;
import defpackage.woa;
import defpackage.xd2;
import defpackage.xw31;
import defpackage.zna;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.common_models.net.TextMetaStyle;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003YZ[BK\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J/\u0010'\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001cH\u0014¢\u0006\u0004\b)\u0010\u001eJ\u000f\u0010*\u001a\u00020\u001cH\u0014¢\u0006\u0004\b*\u0010\u001eJ\u000f\u0010+\u001a\u00020\u001cH\u0014¢\u0006\u0004\b+\u0010\u001eJ\u0019\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010,\u001a\u00020\"H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001cH\u0002¢\u0006\u0004\b0\u0010\u001eJ\u000f\u00101\u001a\u00020\u001cH\u0002¢\u0006\u0004\b1\u0010\u001eJ\u000f\u00102\u001a\u00020\u001cH\u0002¢\u0006\u0004\b2\u0010\u001eJ\u000f\u00103\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u0010\u001eJ\u0017\u00106\u001a\u00020\u001c2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u001c2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001cH\u0002¢\u0006\u0004\b<\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010=R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010>R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010?R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010AR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR\u0016\u0010U\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010SR\u0016\u0010V\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006\\"}, d2 = {"Lcom/yandex/go/chargers/qr/ChargersQrModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lwoa;", "Landroid/content/Context;", "context", "Ltse;", "activityScope", "Lpya;", "chargersTypefaceDelegate", "Lcoa;", "chargersQrMlVisionDetectorFactory", "Lzna;", "chargersQrAnalyticsProxy", "Lkpa;", "chargersSearchMode", "Lpoa;", "chargersQrPresenter", "<init>", "(Landroid/content/Context;Ltse;Lpya;Lcoa;Lzna;Lkpa;Lpoa;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwoa;", "Lzy11;", "onAttachedToWindow", "()V", "", "isArrowsPermanentlyHidden", "()Z", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDetachedFromWindow", "onBackPressed", "onSlideOut", "drawableId", "Landroid/graphics/drawable/Drawable;", "drawable", "(I)Landroid/graphics/drawable/Drawable;", "setupListeners", "setupListenersForPermissionsViews", "setupListenersForManualEnterViews", "refreshErrorState", "Luoa;", ClidProvider.STATE, "applyManualOrQrViewState", "(Luoa;)V", "", "newText", "refreshButtonState", "(Ljava/lang/String;)V", "initCloseButton", "Ltse;", "Lpya;", "Lcoa;", "Lzna;", "Lkpa;", "Lpoa;", "Looa;", "qrPhotoStateBinding", "Looa;", "Lbma;", "permissionsViewBinding", "Lbma;", "Lboa;", "qrManualEnterStateBinding", "Lboa;", "Ljava/lang/Runnable;", "leaveGrabbedQrRectRunnable", "Ljava/lang/Runnable;", "Lru/yandex/taxi/camera/ml/c;", "mlCameraController", "Lru/yandex/taxi/camera/ml/c;", "numberLength", CA20Status.STATUS_USER_I, "validNumberMinLength", "offerCardBottomOffset", "hasError", "Z", "Companion", "com/yandex/go/chargers/qr/b", "goa", "ioa", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersQrModalView extends SlideableBindingModalView<woa> {
    public static final goa Companion = new goa();
    private static final int DEFAULT_RESOLUTION_HEIGHT = 2080;
    private static final int DEFAULT_RESOLUTION_WIDTH = 1080;
    private final tse activityScope;
    private final zna chargersQrAnalyticsProxy;
    private final coa chargersQrMlVisionDetectorFactory;
    private final poa chargersQrPresenter;
    private final kpa chargersSearchMode;
    private final pya chargersTypefaceDelegate;
    private boolean hasError;
    private final Runnable leaveGrabbedQrRectRunnable;
    private final ru.yandex.taxi.camera.ml.c mlCameraController;
    private int numberLength;
    private int offerCardBottomOffset;
    private final bma permissionsViewBinding;
    private final boa qrManualEnterStateBinding;
    private final ooa qrPhotoStateBinding;
    private int validNumberMinLength;

    public ChargersQrModalView(Context context, tse tseVar, pya pyaVar, coa coaVar, zna znaVar, kpa kpaVar, poa poaVar) {
        super(context);
        View O;
        View O2;
        this.activityScope = tseVar;
        this.chargersTypefaceDelegate = pyaVar;
        this.chargersQrMlVisionDetectorFactory = coaVar;
        this.chargersQrAnalyticsProxy = znaVar;
        this.chargersSearchMode = kpaVar;
        this.chargersQrPresenter = poaVar;
        ConstraintLayout constraintLayout = getBinding().a;
        int i = uhh0.enter_number_manually;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, constraintLayout);
        if (buttonComponent != null) {
            i = uhh0.flash_light_btn;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) cma1.O(i, constraintLayout);
            if (appCompatImageButton != null) {
                i = uhh0.photo_buttons_group;
                Group group = (Group) cma1.O(i, constraintLayout);
                if (group != null) {
                    i = uhh0.qr_state_back_button;
                    QrBackButtonComponent qrBackButtonComponent = (QrBackButtonComponent) cma1.O(i, constraintLayout);
                    if (qrBackButtonComponent != null) {
                        i = uhh0.text_hint;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, constraintLayout);
                        if (robotoTextView != null) {
                            this.qrPhotoStateBinding = new ooa(constraintLayout, buttonComponent, appCompatImageButton, group, qrBackButtonComponent, robotoTextView);
                            ConstraintLayout constraintLayout2 = getBinding().a;
                            int i2 = uhh0.go_to_settings;
                            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i2, constraintLayout2);
                            if (buttonComponent2 != null) {
                                i2 = uhh0.manual_enter;
                                ButtonComponent buttonComponent3 = (ButtonComponent) cma1.O(i2, constraintLayout2);
                                if (buttonComponent3 != null) {
                                    i2 = uhh0.permission_subtitle;
                                    if (((RobotoTextView) cma1.O(i2, constraintLayout2)) != null) {
                                        i2 = uhh0.permission_title;
                                        if (((RobotoTextView) cma1.O(i2, constraintLayout2)) != null && (O = cma1.O((i2 = uhh0.permissions_background), constraintLayout2)) != null) {
                                            i2 = uhh0.permissions_group;
                                            Group group2 = (Group) cma1.O(i2, constraintLayout2);
                                            if (group2 != null) {
                                                this.permissionsViewBinding = new bma(constraintLayout2, buttonComponent2, buttonComponent3, O, group2);
                                                ConstraintLayout constraintLayout3 = getBinding().a;
                                                int i3 = uhh0.back_to_camera;
                                                ButtonComponent buttonComponent4 = (ButtonComponent) cma1.O(i3, constraintLayout3);
                                                if (buttonComponent4 != null) {
                                                    i3 = uhh0.close_button;
                                                    AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) cma1.O(i3, constraintLayout3);
                                                    if (appCompatImageButton2 != null) {
                                                        i3 = uhh0.error_title;
                                                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, constraintLayout3);
                                                        if (robotoTextView2 != null && (O2 = cma1.O((i3 = uhh0.manual_enter_back_ground), constraintLayout3)) != null) {
                                                            i3 = uhh0.manual_enter_done;
                                                            ButtonComponent buttonComponent5 = (ButtonComponent) cma1.O(i3, constraintLayout3);
                                                            if (buttonComponent5 != null) {
                                                                i3 = uhh0.manual_enter_group;
                                                                Group group3 = (Group) cma1.O(i3, constraintLayout3);
                                                                if (group3 != null) {
                                                                    i3 = uhh0.manual_enter_text_hint;
                                                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i3, constraintLayout3);
                                                                    if (robotoTextView3 != null) {
                                                                        i3 = uhh0.number_edit_text;
                                                                        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = (KeyboardAwareRobotoEditText) cma1.O(i3, constraintLayout3);
                                                                        if (keyboardAwareRobotoEditText != null) {
                                                                            this.qrManualEnterStateBinding = new boa(constraintLayout3, buttonComponent4, appCompatImageButton2, robotoTextView2, O2, buttonComponent5, group3, robotoTextView3, keyboardAwareRobotoEditText);
                                                                            this.leaveGrabbedQrRectRunnable = new foa(this, 0);
                                                                            this.mlCameraController = new ru.yandex.taxi.camera.ml.c(context, getBinding().b, tseVar);
                                                                            setCardMode(SlideableModalView.CardMode.FULLSCREEN);
                                                                            initCloseButton();
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                ny61.t("Missing required view with ID: ".concat(constraintLayout3.getResources().getResourceName(i3)));
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            }
                            ny61.t("Missing required view with ID: ".concat(constraintLayout2.getResources().getResourceName(i2)));
                            throw null;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(constraintLayout.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyManualOrQrViewState(uoa state) {
        this.permissionsViewBinding.e.setVisibility(8);
        boolean z = state instanceof toa;
        this.chargersQrAnalyticsProxy.a(z ? ChargersAnalytics$ChargersQrScanState.ManualEnter : ChargersAnalytics$ChargersQrScanState.Camera);
        getBinding().b.setActive(!z);
        this.qrManualEnterStateBinding.g.setVisibility(z ? 0 : 8);
        this.qrPhotoStateBinding.d.setVisibility(z ? 8 : 0);
        boolean z2 = this.chargersSearchMode instanceof jpa;
        ooa ooaVar = this.qrPhotoStateBinding;
        if (z2) {
            ooaVar.b.setVisibility(z ? 8 : 0);
        } else {
            ooaVar.b.setVisibility(4);
        }
        boa boaVar = this.qrManualEnterStateBinding;
        if (z) {
            boaVar.i.requestFocus();
        } else {
            boaVar.i.clearFocus();
            requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable drawable(int drawableId) {
        return vng.t(drawableId, getContext());
    }

    private final void initCloseButton() {
        ru.yandex.taxi.design.utils.c.z(new eoa(this, 0), this.qrPhotoStateBinding.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initCloseButton$lambda$0(ChargersQrModalView chargersQrModalView) {
        chargersQrModalView.chargersQrAnalyticsProxy.b(ChargersAnalytics$ChargersQrScanButtonName.Back);
        chargersQrModalView.chargersQrAnalyticsProxy.d = ChargersAnalytics$ChargersQrScanCloseReason.Back;
        ((k1a) chargersQrModalView.chargersQrPresenter.F.a).r(new qu(9));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ChargersQrModalView chargersQrModalView, t1w t1wVar) {
        xw31.E(chargersQrModalView.qrPhotoStateBinding.f, null, Integer.valueOf(tje.r(mrg0.go_design_m_space, chargersQrModalView.getContext()) + t1wVar.b), null, null);
        xw31.E(chargersQrModalView.qrManualEnterStateBinding.h, null, Integer.valueOf(tje.r(mrg0.go_design_m_space, chargersQrModalView.getContext()) + t1wVar.b), null, null);
        Guideline guideline = chargersQrModalView.getBinding().c;
        int i = chargersQrModalView.offerCardBottomOffset;
        int i2 = t1wVar.g;
        guideline.setGuidelineEnd(Math.max(i, i2));
        Guideline guideline2 = chargersQrModalView.getBinding().c;
        guideline2.setPadding(guideline2.getPaddingLeft(), guideline2.getPaddingTop(), guideline2.getPaddingRight(), i2);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void leaveGrabbedQrRectRunnable$lambda$0(ChargersQrModalView chargersQrModalView) {
        chargersQrModalView.getBinding().b.leaveQrRect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshButtonState(String newText) {
        this.qrManualEnterStateBinding.f.setEnabled(newText.length() >= this.validNumberMinLength);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshErrorState() {
        if (this.hasError) {
            this.qrManualEnterStateBinding.i.setBackground(drawable(v1h0.chargers_manual_enter_bg));
            this.qrManualEnterStateBinding.d.setText((CharSequence) null);
            this.qrManualEnterStateBinding.d.setVisibility(8);
            this.hasError = false;
        }
    }

    private final void setupListeners() {
        ru.yandex.taxi.design.utils.c.z(new eoa(this, 1), this.qrPhotoStateBinding.c);
        ru.yandex.taxi.design.utils.c.z(new eoa(this, 2), this.qrManualEnterStateBinding.c);
        setupListenersForPermissionsViews();
        setupListenersForManualEnterViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListeners$lambda$0(ChargersQrModalView chargersQrModalView) {
        qp7 b;
        chargersQrModalView.chargersQrAnalyticsProxy.b(ChargersAnalytics$ChargersQrScanButtonName.Torch);
        chargersQrModalView.qrPhotoStateBinding.c.setSelected(!r0.isSelected());
        co7 co7Var = chargersQrModalView.mlCameraController.i;
        if (co7Var != null && (b = co7Var.b()) != null) {
            b.f(chargersQrModalView.qrPhotoStateBinding.c.isSelected());
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListeners$lambda$1(ChargersQrModalView chargersQrModalView) {
        chargersQrModalView.chargersQrAnalyticsProxy.b(ChargersAnalytics$ChargersQrScanButtonName.Back);
        chargersQrModalView.chargersQrAnalyticsProxy.d = ChargersAnalytics$ChargersQrScanCloseReason.Back;
        ((k1a) chargersQrModalView.chargersQrPresenter.F.a).r(new qu(9));
        return zy11.a;
    }

    private final void setupListenersForManualEnterViews() {
        boolean z = this.chargersSearchMode instanceof jpa;
        ooa ooaVar = this.qrPhotoStateBinding;
        if (z) {
            ooaVar.b.setDebounceClickListener(new foa(this, 1));
        } else {
            ooaVar.b.setVisibility(8);
        }
        int i = 2;
        this.qrManualEnterStateBinding.b.setDebounceClickListener(new foa(this, i));
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.qrManualEnterStateBinding.i;
        pya pyaVar = this.chargersTypefaceDelegate;
        Context context = getContext();
        pyaVar.getClass();
        TextMetaStyle textMetaStyle = TextMetaStyle.CondensedTitle1;
        keyboardAwareRobotoEditText.setTypeface(pyaVar.a(context, textMetaStyle, 46.0f).a);
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText2 = this.qrManualEnterStateBinding.i;
        pya pyaVar2 = this.chargersTypefaceDelegate;
        Context context2 = getContext();
        pyaVar2.getClass();
        keyboardAwareRobotoEditText2.setTextSize(pyaVar2.a(context2, textMetaStyle, 46.0f).b);
        this.qrManualEnterStateBinding.i.setOnCloseListener(new pw0(i, this));
        this.qrManualEnterStateBinding.i.setOnFocusChangeListener(new bk(6, this));
        this.qrManualEnterStateBinding.f.setDebounceClickListener(new foa(this, 3));
        this.qrManualEnterStateBinding.i.addTextChangedListener(new TextWatcher() { // from class: com.yandex.go.chargers.qr.ChargersQrModalView$setupListenersForManualEnterViews$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                ChargersQrModalView.this.refreshButtonState(String.valueOf(s));
                ChargersQrModalView.this.refreshErrorState();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListenersForManualEnterViews$lambda$0(ChargersQrModalView chargersQrModalView) {
        chargersQrModalView.chargersQrAnalyticsProxy.b(ChargersAnalytics$ChargersQrScanButtonName.ManualEnter);
        joa joaVar = chargersQrModalView.chargersQrPresenter.C;
        joaVar.a.l(ChargersQrMode.MANUAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListenersForManualEnterViews$lambda$1(ChargersQrModalView chargersQrModalView) {
        chargersQrModalView.chargersQrAnalyticsProxy.b(ChargersAnalytics$ChargersQrScanButtonName.BackToCamera);
        joa joaVar = chargersQrModalView.chargersQrPresenter.C;
        joaVar.a.l(ChargersQrMode.QR_SCAN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListenersForManualEnterViews$lambda$2(ChargersQrModalView chargersQrModalView) {
        chargersQrModalView.qrManualEnterStateBinding.i.clearFocus();
        chargersQrModalView.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListenersForManualEnterViews$lambda$3(ChargersQrModalView chargersQrModalView, View view, boolean z) {
        if (z) {
            KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = chargersQrModalView.qrManualEnterStateBinding.i;
            keyboardAwareRobotoEditText.post(new xd2(keyboardAwareRobotoEditText, 1));
        } else {
            KeyboardAwareRobotoEditText keyboardAwareRobotoEditText2 = chargersQrModalView.qrManualEnterStateBinding.i;
            keyboardAwareRobotoEditText2.post(new ce0(keyboardAwareRobotoEditText2, 15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListenersForManualEnterViews$lambda$4(ChargersQrModalView chargersQrModalView) {
        chargersQrModalView.chargersQrAnalyticsProxy.b(ChargersAnalytics$ChargersQrScanButtonName.ManualEnterDone);
        String valueOf = String.valueOf(chargersQrModalView.qrManualEnterStateBinding.i.getText());
        poa poaVar = chargersQrModalView.chargersQrPresenter;
        tje.N(poaVar.Jg(), null, null, new ChargersQrPresenter$onManuallyEntered$1(poaVar, valueOf, null), 3);
    }

    private final void setupListenersForPermissionsViews() {
        this.permissionsViewBinding.b.setDebounceClickListener(new foa(this, 4));
        this.permissionsViewBinding.c.setDebounceClickListener(new foa(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListenersForPermissionsViews$lambda$0(ChargersQrModalView chargersQrModalView) {
        chargersQrModalView.chargersQrAnalyticsProxy.b(ChargersAnalytics$ChargersQrScanButtonName.GoToSettings);
        ((a60) chargersQrModalView.chargersQrPresenter.y).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListenersForPermissionsViews$lambda$1(ChargersQrModalView chargersQrModalView) {
        chargersQrModalView.chargersQrAnalyticsProxy.b(ChargersAnalytics$ChargersQrScanButtonName.ManualEnter);
        joa joaVar = chargersQrModalView.chargersQrPresenter.C;
        joaVar.a.l(ChargersQrMode.MANUAL);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public woa bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(ush0.chargers_qr_view, parent, false);
        int i = uhh0.camera_preview;
        ChargersQrCameraPreview chargersQrCameraPreview = (ChargersQrCameraPreview) cma1.O(i, inflate);
        if (chargersQrCameraPreview != null) {
            i = uhh0.offer_card_offset_guideline;
            Guideline guideline = (Guideline) cma1.O(i, inflate);
            if (guideline != null) {
                return new woa((ConstraintLayout) inflate, chargersQrCameraPreview, guideline);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new od9(13, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getIsArrowHidden() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        setupListeners();
        poa poaVar = this.chargersQrPresenter;
        b bVar = new b(this);
        poaVar.Bg(bVar);
        poaVar.z.b(poaVar, new c(poaVar));
        tje.N(poaVar.Jg(), null, null, new ChargersQrPresenter$attachView$$inlined$collectLatestIn$1(kotlinx.coroutines.flow.e.d(poaVar.C.a), null, bVar), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.chargersQrAnalyticsProxy.b(ChargersAnalytics$ChargersQrScanButtonName.Back);
        this.chargersQrAnalyticsProxy.d = ChargersAnalytics$ChargersQrScanCloseReason.Back;
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.leaveGrabbedQrRectRunnable);
        this.chargersQrPresenter.Cg();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        OneShotPreDrawListener.add(getContent(), new uz(15, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        this.chargersQrAnalyticsProxy.d = ChargersAnalytics$ChargersQrScanCloseReason.Back;
        super.onSlideOut();
    }
}
