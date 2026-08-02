package com.yandex.go.pickup_from_photo.presentation;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoModalView;
import com.yandex.go.pickup_from_photo.ui.CameraTargetView;
import com.yandex.go.pickup_from_photo.ui.CircularProgressView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ax1;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.dv31;
import defpackage.e230;
import defpackage.eob0;
import defpackage.evu0;
import defpackage.f6h0;
import defpackage.fq7;
import defpackage.g18;
import defpackage.i3y;
import defpackage.i4b0;
import defpackage.imb0;
import defpackage.ip11;
import defpackage.j73;
import defpackage.job0;
import defpackage.kmb0;
import defpackage.kyh0;
import defpackage.lmb0;
import defpackage.mqg0;
import defpackage.muh0;
import defpackage.nmb0;
import defpackage.nsz;
import defpackage.nuz;
import defpackage.ny61;
import defpackage.opb0;
import defpackage.pav;
import defpackage.ppb0;
import defpackage.q8v;
import defpackage.rg3;
import defpackage.rmb0;
import defpackage.ssz;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tse;
import defpackage.tuz;
import defpackage.uuz;
import defpackage.vnb0;
import defpackage.vng;
import defpackage.vp7;
import defpackage.w0d;
import defpackage.w130;
import defpackage.w8v;
import defpackage.wnb0;
import defpackage.x8v;
import defpackage.xnb0;
import defpackage.xtz;
import defpackage.xw31;
import defpackage.xw90;
import defpackage.z2h0;
import defpackage.z4b0;
import defpackage.zmb0;
import defpackage.zp7;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.camera.CameraPreview;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\\B7\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u001cH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010\u0011J\u000f\u0010+\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010\u0011J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010)J\u000f\u0010.\u001a\u00020\u000fH\u0002¢\u0006\u0004\b.\u0010\u0011J\u001f\u00102\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J!\u00107\u001a\u00020\u000f2\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000fH\u0002¢\u0006\u0004\b9\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010SR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020/0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020X8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lcom/yandex/go/pickup_from_photo/presentation/PickupFromPhotoModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lzmb0;", "Landroid/content/Context;", "context", "Lip11;", "typefaceDelegate", "Ltse;", "activityScope", "Lpav;", "imageLoader", "Ljob0;", "presenter", "<init>", "(Landroid/content/Context;Lip11;Ltse;Lpav;Ljob0;)V", "Lzy11;", "onBackPressed", "()V", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lzmb0;", "onAttachedToWindow", "", "applyThemeForChildrenByDefault", "()Z", "onDetachedFromWindow", "Le230;", "insetsType", "()Le230;", "Lopb0;", ClidProvider.STATE, "renderCameraButton", "(Lopb0;)V", "isDark", "onLowLightModeChanged", "(Z)V", "startCamera", "stopCamera", "flashEnabled", "updateFlashMode", "takePhoto", "Lppb0;", "oldState", "newState", "tryAnnounceForAccessibility", "(Lppb0;Lppb0;)V", "", "toolbarHint", "hintAnimationUrl", "showAnimatedHint", "(Ljava/lang/String;Ljava/lang/String;)V", "hideAnimatedHint", "Ltse;", "Lpav;", "Ljob0;", "Lcom/yandex/go/pickup_from_photo/ui/CircularProgressView;", "circularProgressView", "Lcom/yandex/go/pickup_from_photo/ui/CircularProgressView;", "Lg18;", "flashImageLoadingCancellable", "Lg18;", "Lnuz;", "Lnsz;", "hintLottieAnimationTask", "Lnuz;", "Lxtz;", "hintLottieAnimationTaskListener", "Lxtz;", "Lw8v;", "imageCapture$delegate", "Li3y;", "getImageCapture", "()Lw8v;", "imageCapture", "Lcom/yandex/go/pickup_from_photo/presentation/b;", "cameraController$delegate", "getCameraController", "()Lcom/yandex/go/pickup_from_photo/presentation/b;", "cameraController", "Ldv31;", "cameraStateHolder", "Ldv31;", "Lru/yandex/taxi/camera/CameraPreview;", "getCameraPreview", "()Lru/yandex/taxi/camera/CameraPreview;", "cameraPreview", "xnb0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PickupFromPhotoModalView extends SlideableBindingModalView<zmb0> {
    public static final int $stable = 8;
    private final tse activityScope;

    /* renamed from: cameraController$delegate, reason: from kotlin metadata */
    private final i3y cameraController;
    private final dv31 cameraStateHolder;
    private CircularProgressView circularProgressView;
    private g18 flashImageLoadingCancellable;
    private nuz hintLottieAnimationTask;
    private xtz hintLottieAnimationTaskListener;

    /* renamed from: imageCapture$delegate, reason: from kotlin metadata */
    private final i3y imageCapture;
    private final pav imageLoader;
    private final job0 presenter;

    public PickupFromPhotoModalView(Context context, ip11 ip11Var, tse tseVar, pav pavVar, job0 job0Var) {
        super(context);
        this.activityScope = tseVar;
        this.imageLoader = pavVar;
        this.presenter = job0Var;
        this.imageCapture = kotlin.a.a(new z4b0(19));
        this.cameraController = kotlin.a.a(new xw90(17, context, this));
        this.cameraStateHolder = new ax1(this, this);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        ConstraintLayout constraintLayout = getBinding().a;
        if (constraintLayout != null) {
            constraintLayout.post(new ce0(constraintLayout, 15));
        }
        int i = 0;
        ru.yandex.taxi.design.utils.c.z(new vnb0(this, i), getBinding().b);
        getBinding().b.setContentDescription(getContext().getString(kyh0.common_back));
        getBinding().j.c.setDebounceClickListener(new wnb0(i, this));
        ru.yandex.taxi.design.utils.c.z(new vnb0(this, 1), getBinding().k);
        ru.yandex.taxi.design.utils.c.z(new vnb0(this, 2), getBinding().e);
        getBinding().i.setTitleTypeface(ip11Var.b(context));
        CircularProgressView circularProgressView = new CircularProgressView(context, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(tje.u(36, circularProgressView.getContext()), tje.u(36, circularProgressView.getContext()));
        marginLayoutParams.setMargins(tje.u(10, circularProgressView.getContext()), tje.u(2, circularProgressView.getContext()), tje.u(2, circularProgressView.getContext()), tje.u(2, circularProgressView.getContext()));
        circularProgressView.setLayoutParams(marginLayoutParams);
        circularProgressView.setColors(circularProgressView.getContext().getColor(mqg0.white), circularProgressView.getContext().getColor(mqg0.white_alpha20));
        circularProgressView.setStrokeWidth(tje.w(3, circularProgressView.getContext()));
        this.circularProgressView = circularProgressView;
        getBinding().i.setTrailView(this.circularProgressView);
        RobotoTextView robotoTextView = getBinding().g;
        w0d w0dVar = new w0d();
        w0dVar.h = tje.w(100, getContext());
        w0dVar.a = getContext().getColor(mqg0.black_alpha50);
        robotoTextView.setBackground(w0dVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(PickupFromPhotoModalView pickupFromPhotoModalView) {
        pickupFromPhotoModalView.presenter.Kg(imb0.a);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(PickupFromPhotoModalView pickupFromPhotoModalView) {
        pickupFromPhotoModalView.presenter.Kg(lmb0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$2(PickupFromPhotoModalView pickupFromPhotoModalView) {
        pickupFromPhotoModalView.takePhoto();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$3(PickupFromPhotoModalView pickupFromPhotoModalView) {
        pickupFromPhotoModalView.presenter.Kg(kmb0.a);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b cameraController_delegate$lambda$0(Context context, PickupFromPhotoModalView pickupFromPhotoModalView) {
        tuz tuzVar;
        tse tseVar = pickupFromPhotoModalView.activityScope;
        CameraPreview cameraPreview = pickupFromPhotoModalView.getCameraPreview();
        w8v imageCapture = pickupFromPhotoModalView.getImageCapture();
        PickupPhotoRecognitionExperiment.NightModeSettings nightModeSettings = pickupFromPhotoModalView.presenter.E.b().n;
        if (nightModeSettings != null) {
            double d = nightModeSettings.b;
            double d2 = nightModeSettings.a;
            tuzVar = new tuz(new uuz(Math.max(d2, d), Math.min(d2, d)));
        } else {
            tuzVar = null;
        }
        return new b(context, tseVar, cameraPreview, imageCapture, tuzVar, new PickupFromPhotoModalView$cameraController$2$1(1, pickupFromPhotoModalView, PickupFromPhotoModalView.class, "onLowLightModeChanged", "onLowLightModeChanged(Z)V", 0));
    }

    private final b getCameraController() {
        return (b) this.cameraController.getValue();
    }

    private final CameraPreview getCameraPreview() {
        return getBinding().d;
    }

    private final w8v getImageCapture() {
        return (w8v) this.imageCapture.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideAnimatedHint() {
        nuz nuzVar;
        xtz xtzVar = this.hintLottieAnimationTaskListener;
        if (xtzVar != null && (nuzVar = this.hintLottieAnimationTask) != null) {
            nuzVar.d(xtzVar);
        }
        this.hintLottieAnimationTaskListener = null;
        this.hintLottieAnimationTask = null;
        getBinding().h.cancelAnimation();
        getBinding().h.setVisibility(8);
        getBinding().g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w8v imageCapture_delegate$lambda$0() {
        q8v q8vVar = new q8v();
        q8vVar.a.w(x8v.b, 1);
        return q8vVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(PickupFromPhotoModalView pickupFromPhotoModalView, t1w t1wVar) {
        xw31.E(pickupFromPhotoModalView.getBinding().f, null, Integer.valueOf(t1wVar.b), null, null);
        xw31.I(pickupFromPhotoModalView.getBinding().c, null, null, null, Integer.valueOf(tje.u(12, pickupFromPhotoModalView.getContext()) + t1wVar.g));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLowLightModeChanged(boolean isDark) {
        getBinding().a.post(new rg3(this, isDark, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLowLightModeChanged$lambda$0(PickupFromPhotoModalView pickupFromPhotoModalView, boolean z) {
        pickupFromPhotoModalView.getCameraController().b(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderCameraButton(opb0 state) {
        Drawable drawable;
        Bitmap bitmap = state.a;
        Bitmap bitmap2 = state.b;
        if (bitmap == null || bitmap2 == null) {
            drawable = vng.t(z2h0.pickup_from_photo_camera_button_background, getContext());
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{-16842910}, new BitmapDrawable(getResources(), bitmap2));
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, new BitmapDrawable(getResources(), bitmap2));
            stateListDrawable.addState(new int[0], new BitmapDrawable(getResources(), state.a));
            drawable = stateListDrawable;
        }
        getBinding().k.setImageDrawable(drawable);
        getBinding().k.setContentDescription(state.c);
        getBinding().k.setImportantForAccessibility(1);
        getBinding().k.setEnabled(state.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAnimatedHint(final String toolbarHint, String hintAnimationUrl) {
        nuz nuzVar;
        if (!isAttachedToWindow() || evu0.J(toolbarHint) || hintAnimationUrl == null || evu0.J(hintAnimationUrl)) {
            return;
        }
        xtz xtzVar = this.hintLottieAnimationTaskListener;
        if (xtzVar != null && (nuzVar = this.hintLottieAnimationTask) != null) {
            nuzVar.d(xtzVar);
        }
        nuz i = ssz.i(getContext(), hintAnimationUrl, hintAnimationUrl);
        this.hintLottieAnimationTask = i;
        xtz xtzVar2 = new xtz() { // from class: unb0
            @Override // defpackage.xtz
            public final void onResult(Object obj) {
                PickupFromPhotoModalView.showAnimatedHint$lambda$1(PickupFromPhotoModalView.this, toolbarHint, (nsz) obj);
            }
        };
        this.hintLottieAnimationTaskListener = xtzVar2;
        i.b(xtzVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAnimatedHint$lambda$1(PickupFromPhotoModalView pickupFromPhotoModalView, String str, nsz nszVar) {
        pickupFromPhotoModalView.getBinding().h.cancelAnimation();
        pickupFromPhotoModalView.getBinding().h.setComposition(nszVar);
        pickupFromPhotoModalView.getBinding().h.setRepeatCount(-1);
        pickupFromPhotoModalView.getBinding().h.setRepeatMode(1);
        pickupFromPhotoModalView.getBinding().h.setVisibility(0);
        pickupFromPhotoModalView.getBinding().h.playAnimation();
        pickupFromPhotoModalView.announceForAccessibility(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCamera() {
        cma1.J(getCameraPreview());
        b cameraController = getCameraController();
        cameraController.g.updateAndGet(new vp7(0));
        cameraController.i.b();
        CameraController$orientationListener$1 cameraController$orientationListener$1 = cameraController.l;
        if (cameraController$orientationListener$1.canDetectOrientation()) {
            cameraController$orientationListener$1.enable();
        }
        com.yandex.go.coroutines.b.g(cameraController.b, null, null, new CameraController$start$2(cameraController, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopCamera() {
        getCameraController().c();
    }

    private final void takePhoto() {
        b cameraController = getCameraController();
        cameraController.getClass();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        cameraController.g.updateAndGet(new zp7(0, ref$BooleanRef));
        if (ref$BooleanRef.element) {
            CameraTargetView.startBlinkAnimation$default(getBinding().m, 0L, 0.0f, 3, null);
            this.presenter.Kg(new nmb0(getImageCapture(), new vnb0(this, 3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 takePhoto$lambda$0(PickupFromPhotoModalView pickupFromPhotoModalView) {
        b cameraController = pickupFromPhotoModalView.getCameraController();
        Boolean bool = ((fq7) cameraController.g.getAndUpdate(new vp7(1))).d;
        if (bool != null) {
            cameraController.b(bool.booleanValue());
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryAnnounceForAccessibility(ppb0 oldState, ppb0 newState) {
        if (!((zmb0) getBinding()).k.isAccessibilityFocused() || oldState.g == newState.g) {
            return;
        }
        List A = j73.A(new String[]{newState.a, newState.b});
        ArrayList arrayList = new ArrayList();
        for (Object obj : A) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        String X = kotlin.collections.a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62);
        if (X.length() > 0) {
            announceForAccessibility(X);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFlashMode(boolean flashEnabled) {
        getCameraController().d.M(flashEnabled ? 1 : 2);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.component_black;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public zmb0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(muh0.pickup_from_photo_camera_preview, parent, false);
        int i = f6h0.back_button;
        GoImageButton goImageButton = (GoImageButton) cma1.O(i, inflate);
        if (goImageButton != null) {
            i = f6h0.camera_controls_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
            if (constraintLayout != null) {
                i = f6h0.camera_preview;
                CameraPreview cameraPreview = (CameraPreview) cma1.O(i, inflate);
                if (cameraPreview != null) {
                    i = f6h0.flash_button;
                    GoImageButton goImageButton2 = (GoImageButton) cma1.O(i, inflate);
                    if (goImageButton2 != null) {
                        i = f6h0.header;
                        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                        if (frameLayout != null) {
                            i = f6h0.headerHint;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView != null) {
                                i = f6h0.hint_animation;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) cma1.O(i, inflate);
                                if (lottieAnimationView != null) {
                                    i = f6h0.hint_item;
                                    ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                                    if (listItemComponent != null) {
                                        i = f6h0.hint_item_container;
                                        if (((FrameLayout) cma1.O(i, inflate)) != null && (O = cma1.O((i = f6h0.permissions_view), inflate)) != null) {
                                            int i2 = f6h0.go_to_settings;
                                            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, O);
                                            if (buttonComponent != null) {
                                                i2 = f6h0.permissions_subtitle;
                                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, O);
                                                if (robotoTextView2 != null) {
                                                    i2 = f6h0.permissions_title;
                                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i2, O);
                                                    if (robotoTextView3 != null) {
                                                        eob0 eob0Var = new eob0((ConstraintLayout) O, buttonComponent, robotoTextView2, robotoTextView3, 0);
                                                        i = f6h0.photo_button;
                                                        GoImageButton goImageButton3 = (GoImageButton) cma1.O(i, inflate);
                                                        if (goImageButton3 != null) {
                                                            i = f6h0.photo_view;
                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                                                            if (appCompatImageView != null) {
                                                                i = f6h0.targetView;
                                                                CameraTargetView cameraTargetView = (CameraTargetView) cma1.O(i, inflate);
                                                                if (cameraTargetView != null) {
                                                                    return new zmb0((ConstraintLayout) inflate, goImageButton, constraintLayout, cameraPreview, goImageButton2, frameLayout, robotoTextView, lottieAnimationView, listItemComponent, eob0Var, goImageButton3, appCompatImageView, cameraTargetView);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new i4b0(11, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        job0 job0Var = this.presenter;
        xnb0 xnb0Var = new xnb0(this);
        job0Var.Bg(xnb0Var);
        job0Var.y.b(job0Var, new c(job0Var, xnb0Var));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.Kg(rmb0.a);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        b cameraController = getCameraController();
        cameraController.c();
        cameraController.i.a();
        hideAnimatedHint();
        g18 g18Var = this.flashImageLoadingCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.flashImageLoadingCancellable = null;
    }
}
