package com.ybsdk.feature.kyc.internal.screens.photo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Space;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.e;
import androidx.core.view.OneShotPreDrawListener;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.permissions.MultiplePermissionAllowance;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.kyc.api.KycGeoRequest;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.apx;
import defpackage.b0b0;
import defpackage.b9z;
import defpackage.bpx;
import defpackage.bwg0;
import defpackage.c761;
import defpackage.cpx;
import defpackage.cua1;
import defpackage.d0b0;
import defpackage.d761;
import defpackage.dcs;
import defpackage.dpx;
import defpackage.dzh0;
import defpackage.eja1;
import defpackage.fpx;
import defpackage.gpx;
import defpackage.gza0;
import defpackage.hpx;
import defpackage.i3y;
import defpackage.if8;
import defpackage.ipx;
import defpackage.jla1;
import defpackage.jnh0;
import defpackage.k50;
import defpackage.k751;
import defpackage.knx;
import defpackage.kpx;
import defpackage.lfx;
import defpackage.lpx;
import defpackage.lz;
import defpackage.m50;
import defpackage.mqu;
import defpackage.n751;
import defpackage.npx;
import defpackage.ny61;
import defpackage.onx;
import defpackage.opx;
import defpackage.p61;
import defpackage.ptw;
import defpackage.pz40;
import defpackage.qas0;
import defpackage.rbv;
import defpackage.rje;
import defpackage.tdr;
import defpackage.tje;
import defpackage.tya0;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.uu4;
import defpackage.v4b1;
import defpackage.v50;
import defpackage.vh91;
import defpackage.vix;
import defpackage.vsn;
import defpackage.w511;
import defpackage.wq7;
import defpackage.wrt;
import defpackage.xj2;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yi6;
import defpackage.yox;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.z8i0;
import defpackage.zgv;
import defpackage.zmg;
import defpackage.zox;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000É\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u00019\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0015H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0015H\u0016¢\u0006\u0004\b.\u0010)J\u0017\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000203H\u0002¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0015H\u0002¢\u0006\u0004\b7\u0010)J\u000f\u00108\u001a\u00020\u0015H\u0002¢\u0006\u0004\b8\u0010)J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00032\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00032\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b@\u0010?J\u0013\u0010A\u001a\u00020<*\u00020<H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0015H\u0002¢\u0006\u0004\bC\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\"\u0010Y\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010W0W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010]\u001a\u0004\bh\u0010iR\u001b\u0010m\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010]\u001a\u0004\bl\u0010iR\u001b\u0010p\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010]\u001a\u0004\bo\u0010i¨\u0006q"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/screens/photo/KycPhotoFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lc761;", "Llpx;", "Lcom/ybsdk/feature/kyc/internal/screens/photo/b;", "Ltdr;", "Lopx;", "remoteConfig", "Lyox;", "factoryOfViewModel", "Lnpx;", "preferencesProvider", "<init>", "(Lopx;Lyox;Lnpx;)V", "createViewModel", "()Lcom/ybsdk/feature/kyc/internal/screens/photo/b;", "", "fitsSystemWindow", "()Z", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lc761;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "onResume", "()V", "onPause", "viewState", "render", "(Llpx;)V", "onDetach", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lgza0;", "createCameraPermissionRequest", "()Lgza0;", "createLocationPermissionRequest", "initializeOrientationListener", "destroyOrientationListener", "com/ybsdk/feature/kyc/internal/screens/photo/KycPhotoFragment$createOrientationListener$1", "createOrientationListener", "()Lcom/ybsdk/feature/kyc/internal/screens/photo/KycPhotoFragment$createOrientationListener$1;", "", "rotationAngle", "updateRotation", "(Llpx;I)V", "setRotation", "flipLandscapeRotationAngle", "(I)I", "updatePunchHole", "Lopx;", "Lyox;", "Lwq7;", "cameraHelper", "Lwq7;", "Lxj2;", "animationsHelper", "Lxj2;", "navBarHeightPx", CA20Status.STATUS_USER_I, "statusBarHeightPx", "Landroid/view/OrientationEventListener;", "orientationListener", "Landroid/view/OrientationEventListener;", "Ltya0;", "cameraPermissionManager", "Ltya0;", "locationPermissionManager", "Lm50;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "activityResultLauncher", "Lm50;", "Lcom/ybsdk/core/utils/ColorModel$Raw;", "navBarColorTransparent$delegate", "Li3y;", "getNavBarColorTransparent", "()Lcom/ybsdk/core/utils/ColorModel$Raw;", "navBarColorTransparent", "Lcom/ybsdk/core/utils/ColorModel$Attr;", "navBarDefaultBackgroundColor$delegate", "getNavBarDefaultBackgroundColor", "()Lcom/ybsdk/core/utils/ColorModel$Attr;", "navBarDefaultBackgroundColor", "Landroidx/constraintlayout/widget/e;", "constraintSetPortrait$delegate", "getConstraintSetPortrait", "()Landroidx/constraintlayout/widget/e;", "constraintSetPortrait", "constraintSetLandscape90$delegate", "getConstraintSetLandscape90", "constraintSetLandscape90", "constraintSetLandscape270$delegate", "getConstraintSetLandscape270", "constraintSetLandscape270", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class KycPhotoFragment extends BaseMvvmFragment<c761, lpx, b> implements tdr {
    private final m50 activityResultLauncher;
    private final xj2 animationsHelper;
    private wq7 cameraHelper;
    private final tya0 cameraPermissionManager;

    /* renamed from: constraintSetLandscape270$delegate, reason: from kotlin metadata */
    private final i3y constraintSetLandscape270;

    /* renamed from: constraintSetLandscape90$delegate, reason: from kotlin metadata */
    private final i3y constraintSetLandscape90;

    /* renamed from: constraintSetPortrait$delegate, reason: from kotlin metadata */
    private final i3y constraintSetPortrait;
    private final yox factoryOfViewModel;
    private final tya0 locationPermissionManager;

    /* renamed from: navBarColorTransparent$delegate, reason: from kotlin metadata */
    private final i3y navBarColorTransparent;

    /* renamed from: navBarDefaultBackgroundColor$delegate, reason: from kotlin metadata */
    private final i3y navBarDefaultBackgroundColor;
    private int navBarHeightPx;
    private OrientationEventListener orientationListener;
    private final opx remoteConfig;
    private int statusBarHeightPx;

    public KycPhotoFragment(opx opxVar, yox yoxVar, npx npxVar) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.remoteConfig = opxVar;
        this.factoryOfViewModel = yoxVar;
        this.animationsHelper = new xj2();
        uu4 uu4Var = (uu4) npxVar;
        this.cameraPermissionManager = vh91.c(this, createCameraPermissionRequest(), uu4Var.a());
        this.locationPermissionManager = vh91.c(this, createLocationPermissionRequest(), uu4Var.a());
        int i = 3;
        this.activityResultLauncher = registerForActivityResult(new k50(), new v50(i, this));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        int i2 = 4;
        this.navBarColorTransparent = kotlin.a.b(lazyThreadSafetyMode, new vix(i2));
        this.navBarDefaultBackgroundColor = kotlin.a.b(lazyThreadSafetyMode, new vix(5));
        this.constraintSetPortrait = kotlin.a.b(lazyThreadSafetyMode, new knx(this, i));
        this.constraintSetLandscape90 = kotlin.a.b(lazyThreadSafetyMode, new knx(this, i2));
        this.constraintSetLandscape270 = kotlin.a.b(lazyThreadSafetyMode, new knx(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ c761 access$getBinding(KycPhotoFragment kycPhotoFragment) {
        return (c761) kycPhotoFragment.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activityResultLauncher$lambda$0(KycPhotoFragment kycPhotoFragment, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            kycPhotoFragment.getViewModel().k0();
        } else {
            kycPhotoFragment.getViewModel().m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e constraintSetLandscape270_delegate$lambda$8(KycPhotoFragment kycPhotoFragment) {
        e eVar = new e();
        eVar.f(jnh0.ybsdk_screen_kyc_photo_landscape_270, kycPhotoFragment.requireContext());
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e constraintSetLandscape90_delegate$lambda$6(KycPhotoFragment kycPhotoFragment) {
        e eVar = new e();
        eVar.f(jnh0.ybsdk_screen_kyc_photo_landscape_90, kycPhotoFragment.requireContext());
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final e constraintSetPortrait_delegate$lambda$4(KycPhotoFragment kycPhotoFragment) {
        e eVar = new e();
        eVar.f(jnh0.ybsdk_screen_kyc_photo_portrait, kycPhotoFragment.requireContext());
        eVar.j(((c761) kycPhotoFragment.getBinding()).c.g.getId(), 4, 0, 4, kycPhotoFragment.navBarHeightPx);
        eVar.j(((c761) kycPhotoFragment.getBinding()).c.n.getId(), 3, 0, 3, kycPhotoFragment.statusBarHeightPx);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View consumeSideEffect$lambda$20(KycPhotoFragment kycPhotoFragment, qas0 qas0Var) {
        CommunicationFullScreenView communicationFullScreenView = new CommunicationFullScreenView(kycPhotoFragment.requireContext(), null, 0, 6, null);
        communicationFullScreenView.render(((zox) qas0Var).a().b());
        return communicationFullScreenView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumeSideEffect$lambda$21(KycPhotoFragment kycPhotoFragment, View view) {
        kycPhotoFragment.getViewModel().h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 consumeSideEffect$lambda$22(KycPhotoFragment kycPhotoFragment, boolean z) {
        kycPhotoFragment.setNavigationBarColorModel(new z1x0(kycPhotoFragment.getNavBarColorTransparent()));
        return zy11.a;
    }

    private final gza0 createCameraPermissionRequest() {
        List singletonList = Collections.singletonList("android.permission.CAMERA");
        return new gza0(new b0b0(kotlin.collections.a.m0(((if8) this.remoteConfig).b() == KycGeoRequest.OPTIONAL ? b9z.a() : EmptyList.a, singletonList), singletonList, MultiplePermissionAllowance.ALL_MANDATORY), new z8i0(unr0.h(Text.Companion, dzh0.ybsdk_transfer_permission_access_required_title), new Text.Resource(dzh0.ybsdk_kyc_permission_description_subtitle), new Text.Resource(dzh0.ybsdk_transfer_contacts_rationale_accept), new Text.Resource(dzh0.ybsdk_transfer_contacts_rationale_reject), null, null, 48), (wrt) null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final gza0 createLocationPermissionRequest() {
        MultiplePermissionAllowance multiplePermissionAllowance = null;
        return new gza0((d0b0) new b0b0(b9z.a(), multiplePermissionAllowance, 6), new z8i0(unr0.h(Text.Companion, dzh0.ybsdk_kyc_location_demand_title), new Text.Resource(dzh0.ybsdk_kyc_location_demand_subtitle), new Text.Resource(dzh0.ybsdk_transfer_contacts_rationale_accept), new Text.Resource(dzh0.ybsdk_transfer_contacts_rationale_reject), null, null, 48), (wrt) (0 == true ? 1 : 0), 12);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment$createOrientationListener$1] */
    private final KycPhotoFragment$createOrientationListener$1 createOrientationListener() {
        final Context requireContext = requireContext();
        return new OrientationEventListener(requireContext) { // from class: com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment$createOrientationListener$1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                b viewModel;
                r0 r0Var;
                Object value;
                viewModel = KycPhotoFragment.this.getViewModel();
                viewModel.getClass();
                int i = (225 > orientation || orientation >= 315) ? (135 > orientation || orientation >= 225) ? (45 > orientation || orientation >= 135) ? 0 : SubsamplingScaleImageView.ORIENTATION_270 : SubsamplingScaleImageView.ORIENTATION_180 : 90;
                pz40 Y = viewModel.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, onx.a((onx) value, null, null, null, null, false, i, false, 191)));
            }
        };
    }

    private final void destroyOrientationListener() {
        OrientationEventListener orientationEventListener;
        OrientationEventListener orientationEventListener2 = this.orientationListener;
        if (orientationEventListener2 != null && orientationEventListener2.canDetectOrientation() && (orientationEventListener = this.orientationListener) != null) {
            orientationEventListener.disable();
        }
        this.orientationListener = null;
    }

    private final int flipLandscapeRotationAngle(int i) {
        if (i == 90) {
            return SubsamplingScaleImageView.ORIENTATION_270;
        }
        if (i != 270) {
            return i;
        }
        return 90;
    }

    private final e getConstraintSetLandscape270() {
        return (e) this.constraintSetLandscape270.getValue();
    }

    private final e getConstraintSetLandscape90() {
        return (e) this.constraintSetLandscape90.getValue();
    }

    private final e getConstraintSetPortrait() {
        return (e) this.constraintSetPortrait.getValue();
    }

    private final ColorModel.Raw getNavBarColorTransparent() {
        return (ColorModel.Raw) this.navBarColorTransparent.getValue();
    }

    private final ColorModel.Attr getNavBarDefaultBackgroundColor() {
        return (ColorModel.Attr) this.navBarDefaultBackgroundColor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$10$lambda$9(KycPhotoFragment kycPhotoFragment, c761 c761Var, View view) {
        kycPhotoFragment.getViewModel().j0();
        c761Var.c.b.performHapticFeedback(1);
    }

    private final void initializeOrientationListener() {
        OrientationEventListener orientationEventListener;
        if (this.orientationListener != null) {
            return;
        }
        KycPhotoFragment$createOrientationListener$1 createOrientationListener = createOrientationListener();
        this.orientationListener = createOrientationListener;
        if (createOrientationListener == null || !createOrientationListener.canDetectOrientation() || (orientationEventListener = this.orientationListener) == null) {
            return;
        }
        orientationEventListener.enable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorModel.Raw navBarColorTransparent_delegate$lambda$1() {
        return new ColorModel.Raw(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorModel.Attr navBarDefaultBackgroundColor_delegate$lambda$2() {
        return new ColorModel.Attr(ung0.ybColor_background_primary);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final PreviewView onViewCreated$lambda$12(KycPhotoFragment kycPhotoFragment) {
        return ((c761) kycPhotoFragment.getBinding()).b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setRotation(lpx viewState, int rotationAngle) {
        rbv f;
        int c = viewState.c();
        e constraintSetPortrait = c != 90 ? c != 180 ? c != 270 ? getConstraintSetPortrait() : getConstraintSetLandscape270() : getConstraintSetPortrait() : getConstraintSetLandscape90();
        ((c761) getBinding()).g.setAngle(rotationAngle);
        gpx gpxVar = viewState instanceof gpx ? (gpx) viewState : null;
        if (gpxVar != null && (f = gpxVar.f()) != null) {
            v4b1.k(f, ((c761) getBinding()).c.c, null, null, 6);
        }
        constraintSetPortrait.b(((c761) getBinding()).c.o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updatePunchHole() {
        if (((if8) this.remoteConfig).c() && ((c761) getBinding()).c.k.getHoleBorders() == null) {
            AppCompatImageView appCompatImageView = ((c761) getBinding()).c.c;
            OneShotPreDrawListener.add(appCompatImageView, new lz(18, appCompatImageView, appCompatImageView, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateRotation(lpx viewState, int rotationAngle) {
        boolean z = viewState instanceof gpx;
        if (viewState.b() && z) {
            this.animationsHelper.a((c761) getBinding(), rotationAngle, new p61(this, viewState, rotationAngle, 6));
        } else {
            setRotation(viewState, rotationAngle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateRotation$lambda$23(KycPhotoFragment kycPhotoFragment, lpx lpxVar, int i) {
        kycPhotoFragment.setRotation(lpxVar, i);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof cpx) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((cpx) sideEffect).a(), null, 12);
            return;
        }
        if (sideEffect instanceof dpx) {
            wq7 wq7Var = this.cameraHelper;
            if (wq7Var != null) {
                dpx dpxVar = (dpx) sideEffect;
                wq7Var.a(dpxVar.a(), dpxVar.b());
                return;
            }
            return;
        }
        if (sideEffect instanceof bpx) {
            bpx bpxVar = (bpx) sideEffect;
            ((c761) getBinding()).e.setVisibility(bpxVar.a() ? 0 : 8);
            Window window = requireActivity().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = bpxVar.a() ? 1.0f : -1.0f;
            window.setAttributes(attributes);
            return;
        }
        if (sideEffect.equals(zmg.g)) {
            cua1.d(this);
            return;
        }
        if (sideEffect.equals(zmg.h)) {
            tje.N(eja1.s(this), null, null, new KycPhotoFragment$consumeSideEffect$2(this, null), 3);
            return;
        }
        if (sideEffect instanceof apx) {
            jla1.i(this.activityResultLauncher, new yi6(((apx) sideEffect).a()).c());
        } else if (!(sideEffect instanceof zox)) {
            super.consumeSideEffect(sideEffect);
        } else {
            setNavigationBarColorModel(new z1x0(getNavBarDefaultBackgroundColor()));
            com.ybsdk.widgets.common.bottomsheet.a.a(BottomSheetDialogView.Companion, requireActivity(), requireContext(), new BottomSheetDialogView.State(new com.ybsdk.widgets.common.bottomsheet.e(null, null, new mqu(16, this, sideEffect), 3), ((zox) sideEffect).a().a(), null, null, null, null, null, null, null, 131068), new zgv(4, this), null, new ptw(2, this), 36);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((fpx) this.factoryOfViewModel).a((KycPhotoParams) dcs.a(this));
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public c761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        c761 o = c761.o(inflater, container);
        d761 d761Var = o.c;
        ToolbarView toolbarView = d761Var.n;
        toolbarView.setOnImageClickListener(new KycPhotoFragment$getViewBinding$1$1(getViewModel()));
        toolbarView.setOnCloseButtonClickListener(new KycPhotoFragment$getViewBinding$1$2(getViewModel()));
        FullscreenStatusView fullscreenStatusView = o.h;
        fullscreenStatusView.setCloseButtonAction(new KycPhotoFragment$getViewBinding$1$3(getViewModel()));
        fullscreenStatusView.setPrimaryButtonAction(new KycPhotoFragment$getViewBinding$1$4(getViewModel()));
        o.d.setPrimaryButtonOnClickListener(new KycPhotoFragment$getViewBinding$1$5(getViewModel()));
        d761Var.b.setOnClickListener(new vsn(18, this, o));
        YbButtonViewGroup ybButtonViewGroup = d761Var.j;
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new KycPhotoFragment$getViewBinding$1$7(getViewModel()));
        ybButtonViewGroup.setSecondaryButtonClickListener(new KycPhotoFragment$getViewBinding$1$8(getViewModel()));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        k751 k751Var = insets.a;
        this.navBarHeightPx = k751Var.h(2).d;
        this.statusBarHeightPx = rje.d(bwg0.ybsdk_toolbar_margin_top, requireContext()) + k751Var.h(1).b;
        ToolbarView toolbarView = ((c761) getBinding()).c.n;
        ViewGroup.LayoutParams layoutParams = toolbarView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = this.statusBarHeightPx;
        toolbarView.setLayoutParams(marginLayoutParams);
        Space space = ((c761) getBinding()).c.g;
        ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = this.navBarHeightPx;
        space.setLayoutParams(marginLayoutParams2);
        ErrorView errorView = ((c761) getBinding()).d;
        errorView.setPadding(errorView.getPaddingLeft(), errorView.getPaddingTop(), errorView.getPaddingRight(), this.navBarHeightPx);
        FullscreenStatusView fullscreenStatusView = ((c761) getBinding()).h;
        fullscreenStatusView.setPadding(fullscreenStatusView.getPaddingLeft(), fullscreenStatusView.getPaddingTop(), fullscreenStatusView.getPaddingRight(), this.navBarHeightPx);
        return insets;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        eja1.s(this).b(new KycPhotoFragment$onAttach$1(this, null));
        ((com.ybsdk.core.permissions.a) this.locationPermissionManager).d(getViewModel().e0());
        ((com.ybsdk.core.permissions.a) this.cameraPermissionManager).d(getViewModel().f0());
        setStatusBarColorModel(new z1x0(new ColorModel.Raw(0)));
        setNavigationBarColorModel(new z1x0(getNavBarColorTransparent()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.cameraHelper = null;
        destroyOrientationListener();
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        Window window = requireActivity().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = -1.0f;
        window.setAttributes(attributes);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().l0(((com.ybsdk.core.permissions.a) this.locationPermissionManager).a());
        getViewModel().i0(((com.ybsdk.core.permissions.a) this.cameraPermissionManager).a());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.cameraHelper = new wq7(requireActivity(), getViewModel().d0(), new knx(this, 1), new knx(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(lpx viewState) {
        rbv f;
        boolean z = viewState instanceof kpx;
        if (z) {
            ((c761) getBinding()).d.render(((kpx) viewState).e());
        } else if (viewState instanceof gpx) {
            wq7 wq7Var = this.cameraHelper;
            if (wq7Var != null) {
                wq7Var.b(((gpx) viewState).e());
            }
            xty0.d(((c761) getBinding()).c.d, ((gpx) viewState).g());
        } else if (viewState instanceof ipx) {
            ipx ipxVar = (ipx) viewState;
            v4b1.k(ipxVar.f(), ((c761) getBinding()).c.h, null, null, 6);
            xty0.d(((c761) getBinding()).c.m, ipxVar.g());
            ((c761) getBinding()).c.j.render(ipxVar.e());
        } else if (!(viewState instanceof hpx)) {
            w511.b();
            return;
        } else {
            com.ybsdk.widgets.common.e e = ((hpx) viewState).e();
            if (e != null) {
                ((c761) getBinding()).h.render(e);
            }
        }
        int flipLandscapeRotationAngle = flipLandscapeRotationAngle(viewState.c());
        if (((c761) getBinding()).g.getAngle() != flipLandscapeRotationAngle) {
            updateRotation(viewState, flipLandscapeRotationAngle);
        } else {
            gpx gpxVar = viewState instanceof gpx ? (gpx) viewState : null;
            if (gpxVar != null && (f = gpxVar.f()) != null) {
                v4b1.k(f, ((c761) getBinding()).c.c, null, null, 6);
            }
        }
        ((c761) getBinding()).c.n.render(viewState.d());
        ((c761) getBinding()).d.setVisibility(z ? 0 : 8);
        ((c761) getBinding()).h.setVisibility(viewState instanceof hpx ? 0 : 8);
        ((c761) getBinding()).c.e.setVisibility(viewState instanceof gpx ? 0 : 8);
        if (((c761) getBinding()).c.e.getVisibility() == 0) {
            updatePunchHole();
        }
        boolean z2 = viewState instanceof ipx;
        ((c761) getBinding()).c.h.setVisibility(z2 ? 0 : 8);
        ((c761) getBinding()).c.l.setVisibility(z2 ? 0 : 8);
        ((c761) getBinding()).c.k.setVisibility((z2 && ((if8) this.remoteConfig).c()) ? 0 : 8);
        if (((c761) getBinding()).c.h.getVisibility() == 8) {
            ((c761) getBinding()).c.h.setImageDrawable(null);
        }
        if (viewState.a()) {
            initializeOrientationListener();
        } else {
            destroyOrientationListener();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
