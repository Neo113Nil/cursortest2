package com.ybsdk.feature.kyc.internal.screens.photov2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.navigation.BaseNavigationActivity;
import com.ybsdk.core.permissions.MultiplePermissionAllowance;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.kyc.internal.screens.photo.views.CaptionButtonView;
import com.ybsdk.feature.kyc.internal.screens.photo.views.MainPageGuideView;
import com.ybsdk.feature.kyc.internal.screens.photo.views.SelfieGuideView;
import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2Fragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.e;
import defpackage.b0b0;
import defpackage.bnx;
import defpackage.bwg0;
import defpackage.cnx;
import defpackage.cua1;
import defpackage.dcs;
import defpackage.dnx;
import defpackage.dzh0;
import defpackage.e761;
import defpackage.eja1;
import defpackage.enx;
import defpackage.gob1;
import defpackage.gza0;
import defpackage.hox;
import defpackage.iox;
import defpackage.jl40;
import defpackage.jox;
import defpackage.k751;
import defpackage.kao;
import defpackage.kox;
import defpackage.lfx;
import defpackage.mob1;
import defpackage.n751;
import defpackage.nox;
import defpackage.npx;
import defpackage.ny61;
import defpackage.oox;
import defpackage.pox;
import defpackage.ptw;
import defpackage.qas0;
import defpackage.qox;
import defpackage.rbv;
import defpackage.rje;
import defpackage.rox;
import defpackage.sls;
import defpackage.sox;
import defpackage.t7j;
import defpackage.tdr;
import defpackage.tje;
import defpackage.tox;
import defpackage.tya0;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.unx;
import defpackage.uu4;
import defpackage.v4b1;
import defpackage.vh91;
import defpackage.vsn;
import defpackage.w511;
import defpackage.wnx;
import defpackage.wq7;
import defpackage.wrt;
import defpackage.y8f;
import defpackage.yow;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.z8i0;
import defpackage.zmg;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001N\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0014¢\u0006\u0004\b%\u0010&J!\u0010+\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u0010/J\u0017\u00105\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b5\u0010/J\u0017\u00106\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u0010/J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b7\u0010/J\u0017\u00108\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b8\u0010/J\u0017\u00109\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b9\u0010/J\u0017\u0010;\u001a\u00020\u000e2\u0006\u00101\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u000e2\u0006\u00101\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/screens/photov2/KycPhotoV2Fragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Le761;", "Ltox;", "Lcom/ybsdk/feature/kyc/internal/screens/photov2/b;", "Ltdr;", "Lhox;", "factoryOfViewModel", "Lnpx;", "preferencesProvider", "<init>", "(Lhox;Lnpx;)V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "onPause", "onDestroyView", "onDetach", "", "fitsSystemWindow", "()Z", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "createViewModel", "()Lcom/ybsdk/feature/kyc/internal/screens/photov2/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Le761;", "viewState", "render", "(Ltox;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "renderPhotoArea", "renderTip", "renderError", "renderStatus", "renderToolbar", "renderButtons", "Ljox;", "changeFrontalLight", "(Ljox;)V", "Liox;", "showBottomSheet", "(Liox;)V", "Lgza0;", "createCameraPermissionRequest", "()Lgza0;", "Lhox;", "Lwq7;", "cameraHelper", "Lwq7;", "Ltya0;", "cameraPermissionManager", "Ltya0;", "Lz1x0;", "systemBarColorTransparent", "Lz1x0;", "systemBarDefaultBackgroundColor", "wnx", "keyEventsListener", "Lwnx;", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class KycPhotoV2Fragment extends BaseMvvmFragment<e761, tox, b> implements tdr {
    private wq7 cameraHelper;
    private final tya0 cameraPermissionManager;
    private final hox factoryOfViewModel;
    private final wnx keyEventsListener;
    private final z1x0 systemBarColorTransparent;
    private final z1x0 systemBarDefaultBackgroundColor;

    public KycPhotoV2Fragment(hox hoxVar, npx npxVar) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.factoryOfViewModel = hoxVar;
        this.cameraPermissionManager = vh91.c(this, createCameraPermissionRequest(), ((uu4) npxVar).a());
        this.systemBarColorTransparent = new z1x0(new ColorModel.Raw(0), mob1.c(true, true));
        this.systemBarDefaultBackgroundColor = new z1x0(new ColorModel.Attr(ung0.ybColor_background_primary));
        this.keyEventsListener = new wnx(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void changeFrontalLight(jox sideEffect) {
        ((e761) getBinding()).h.setVisibility(sideEffect.a() ? 0 : 8);
        Window window = requireActivity().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = sideEffect.a() ? 1.0f : -1.0f;
        window.setAttributes(attributes);
    }

    private final gza0 createCameraPermissionRequest() {
        List singletonList = Collections.singletonList("android.permission.CAMERA");
        return new gza0(new b0b0(singletonList, singletonList, MultiplePermissionAllowance.ALL_MANDATORY), new z8i0(unr0.h(Text.Companion, dzh0.ybsdk_transfer_permission_access_required_title), new Text.Resource(dzh0.ybsdk_kyc_permission_description_subtitle), new Text.Resource(dzh0.ybsdk_transfer_contacts_rationale_accept), new Text.Resource(dzh0.ybsdk_transfer_contacts_rationale_reject), null, null, 48), (wrt) null, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$11$lambda$10(KycPhotoV2Fragment kycPhotoV2Fragment, e761 e761Var, View view) {
        kycPhotoV2Fragment.getViewModel().i0();
        e761Var.b.performHapticFeedback(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$11$lambda$9(KycPhotoV2Fragment kycPhotoV2Fragment, View view) {
        kycPhotoV2Fragment.getViewModel().j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final PreviewView onViewCreated$lambda$1(KycPhotoV2Fragment kycPhotoV2Fragment) {
        return ((e761) kycPhotoV2Fragment.getBinding()).e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderButtons(tox viewState) {
        qox qoxVar = viewState instanceof qox ? (qox) viewState : null;
        if (qoxVar == null) {
            return;
        }
        ((e761) getBinding()).b.setVisibility(qoxVar.a() == null ? 0 : 8);
        ((e761) getBinding()).b.render(qoxVar.c());
        ((e761) getBinding()).c.setVisibility(qoxVar.d() == null ? 8 : 0);
        oox d = qoxVar.d();
        if (d != null) {
            ((e761) getBinding()).c.setEnabled(d.a());
            v4b1.k(d.b(), ((e761) getBinding()).c, null, null, 6);
        }
        ((e761) getBinding()).d.setVisibility(qoxVar.a() != null ? 0 : 8);
        YbButtonViewGroup.b a = qoxVar.a();
        if (a != null) {
            ((e761) getBinding()).d.render(a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderError(tox viewState) {
        rox roxVar = viewState instanceof rox ? (rox) viewState : null;
        kao a = roxVar != null ? roxVar.a() : null;
        ((e761) getBinding()).f.render(a);
        ((e761) getBinding()).f.setVisibility(a == null ? 8 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderPhotoArea(tox viewState) {
        qox qoxVar = viewState instanceof qox ? (qox) viewState : null;
        if (qoxVar == null) {
            return;
        }
        wq7 wq7Var = this.cameraHelper;
        if (wq7Var != null) {
            wq7Var.b(qoxVar.b());
        }
        rbv f = qoxVar.f();
        if (f != null) {
            v4b1.k(f, ((e761) getBinding()).i, null, null, 6);
        }
        ((e761) getBinding()).i.setVisibility(qoxVar.f() == null ? 8 : 0);
        ((e761) getBinding()).g.setVisibility(qoxVar.e() != null ? 0 : 8);
        rbv e = qoxVar.e();
        if (e != null) {
            v4b1.k(e, ((e761) getBinding()).g, null, null, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderStatus(tox viewState) {
        sox soxVar = viewState instanceof sox ? (sox) viewState : null;
        e a = soxVar != null ? soxVar.a() : null;
        ((e761) getBinding()).j.setVisibility(a == null ? 8 : 0);
        if (a != null) {
            ((e761) getBinding()).j.render(a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderTip(tox viewState) {
        qox qoxVar = viewState instanceof qox ? (qox) viewState : null;
        pox g = qoxVar != null ? qoxVar.g() : null;
        if (g == null) {
            com.ybsdk.core.utils.ext.view.b.c(((e761) getBinding()).k, false, 0L, 0, 0L, null, 30);
            return;
        }
        CharSequence a = d.a(requireContext(), g.c());
        if (jl40.l(a, ((e761) getBinding()).m.getText())) {
            return;
        }
        com.ybsdk.core.utils.ext.view.b.a(((e761) getBinding()).k, new t7j(25, this, a, g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderTip$lambda$12(KycPhotoV2Fragment kycPhotoV2Fragment, CharSequence charSequence, pox poxVar) {
        ((e761) kycPhotoV2Fragment.getBinding()).m.setText(charSequence);
        v4b1.k(poxVar.b(), ((e761) kycPhotoV2Fragment.getBinding()).l, null, null, 6);
        gob1.b(((e761) kycPhotoV2Fragment.getBinding()).k, poxVar.a());
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderToolbar(tox viewState) {
        qox qoxVar = viewState instanceof qox ? (qox) viewState : null;
        if (qoxVar != null) {
            ((e761) getBinding()).n.render(qoxVar.h());
        }
    }

    private final void showBottomSheet(iox sideEffect) {
        com.ybsdk.widgets.common.bottomsheet.d aVar;
        com.ybsdk.widgets.common.bottomsheet.d eVar;
        setNavigationBarColorModel(this.systemBarDefaultBackgroundColor);
        enx a = sideEffect.a();
        int i = 3;
        if (a instanceof cnx) {
            MainPageGuideView mainPageGuideView = new MainPageGuideView(requireContext(), null, 0, 6, null);
            mainPageGuideView.render(((cnx) sideEffect.a()).b());
            eVar = new com.ybsdk.widgets.common.bottomsheet.e(null, null, new yow(8, mainPageGuideView), 3);
        } else {
            if (!(a instanceof dnx)) {
                if (!(a instanceof bnx)) {
                    w511.b();
                    return;
                }
                aVar = new BottomSheetDialogView.State.a(((bnx) sideEffect.a()).c(), ((bnx) sideEffect.a()).b(), null, null, null, null, HProv.PP_SAME_MEDIA);
                com.ybsdk.widgets.common.bottomsheet.a.a(BottomSheetDialogView.Companion, requireActivity(), requireContext(), new BottomSheetDialogView.State(aVar, sideEffect.a().a().c(), sideEffect.a().a().d(), null, null, null, null, sideEffect.a().a().b(), null, 118776), new vsn(20, this, sideEffect), new unx(this, 1), new ptw(i, this), 4);
            }
            SelfieGuideView selfieGuideView = new SelfieGuideView(requireContext(), null, 0, 6, null);
            selfieGuideView.render(((dnx) sideEffect.a()).b());
            eVar = new com.ybsdk.widgets.common.bottomsheet.e(null, null, new yow(9, selfieGuideView), 3);
        }
        aVar = eVar;
        com.ybsdk.widgets.common.bottomsheet.a.a(BottomSheetDialogView.Companion, requireActivity(), requireContext(), new BottomSheetDialogView.State(aVar, sideEffect.a().a().c(), sideEffect.a().a().d(), null, null, null, null, sideEffect.a().a().b(), null, 118776), new vsn(20, this, sideEffect), new unx(this, 1), new ptw(i, this), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View showBottomSheet$lambda$19(MainPageGuideView mainPageGuideView) {
        return mainPageGuideView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View showBottomSheet$lambda$21(SelfieGuideView selfieGuideView) {
        return selfieGuideView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBottomSheet$lambda$22(KycPhotoV2Fragment kycPhotoV2Fragment, iox ioxVar, View view) {
        kycPhotoV2Fragment.getViewModel().f0(ioxVar.a().getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBottomSheet$lambda$23(KycPhotoV2Fragment kycPhotoV2Fragment, View view) {
        kycPhotoV2Fragment.getViewModel().g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showBottomSheet$lambda$24(KycPhotoV2Fragment kycPhotoV2Fragment, boolean z) {
        kycPhotoV2Fragment.setNavigationBarColorModel(kycPhotoV2Fragment.systemBarColorTransparent);
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof kox) {
            wq7 wq7Var = this.cameraHelper;
            if (wq7Var != null) {
                kox koxVar = (kox) sideEffect;
                wq7Var.a(koxVar.a(), koxVar.b());
                return;
            }
            return;
        }
        if (sideEffect instanceof jox) {
            changeFrontalLight((jox) sideEffect);
            return;
        }
        if (sideEffect.equals(zmg.f)) {
            cua1.d(this);
        } else if (sideEffect instanceof iox) {
            showBottomSheet((iox) sideEffect);
        } else {
            super.consumeSideEffect(sideEffect);
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
        return ((nox) this.factoryOfViewModel).a((KycPhotoV2Params) dcs.a(this));
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
    public e761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        e761 o = e761.o(inflater, container);
        ToolbarView toolbarView = o.n;
        toolbarView.setOnImageClickListener(new KycPhotoV2Fragment$getViewBinding$1$1(getViewModel()));
        toolbarView.setOnCloseButtonClickListener(new KycPhotoV2Fragment$getViewBinding$1$2(getViewModel()));
        FullscreenStatusView fullscreenStatusView = o.j;
        fullscreenStatusView.setCloseButtonAction(new KycPhotoV2Fragment$getViewBinding$1$3(getViewModel()));
        fullscreenStatusView.setPrimaryButtonAction(new KycPhotoV2Fragment$getViewBinding$1$4(getViewModel()));
        ErrorView errorView = o.f;
        errorView.setCloseButtonClickListener(new KycPhotoV2Fragment$getViewBinding$1$5(getViewModel()));
        errorView.setPrimaryButtonOnClickListener(new KycPhotoV2Fragment$getViewBinding$1$6(getViewModel()));
        o.c.setOnClickListener(new unx(this, 0));
        o.b.setOnClickListener(new vsn(19, this, o));
        YbButtonViewGroup ybButtonViewGroup = o.d;
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new KycPhotoV2Fragment$getViewBinding$1$9(getViewModel()));
        ybButtonViewGroup.setSecondaryButtonClickListener(new KycPhotoV2Fragment$getViewBinding$1$10(getViewModel()));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        k751 k751Var = insets.a;
        int i = k751Var.h(2).d;
        int i2 = k751Var.h(1).b;
        ToolbarView toolbarView = ((e761) getBinding()).n;
        ViewGroup.LayoutParams layoutParams = toolbarView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i2;
        toolbarView.setLayoutParams(marginLayoutParams);
        YbButtonViewGroup ybButtonViewGroup = ((e761) getBinding()).d;
        ViewGroup.LayoutParams layoutParams2 = ybButtonViewGroup.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = i;
        ybButtonViewGroup.setLayoutParams(marginLayoutParams2);
        CaptionButtonView captionButtonView = ((e761) getBinding()).b;
        ViewGroup.LayoutParams layoutParams3 = captionButtonView.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.bottomMargin = rje.d(bwg0.ybsdk_margin_bottom_caption, requireContext()) + i;
        captionButtonView.setLayoutParams(marginLayoutParams3);
        LinearLayout linearLayout = ((e761) getBinding()).k;
        ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
        if (layoutParams4 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams4.bottomMargin = rje.d(bwg0.ybsdk_margin_bottom_tip, requireContext()) + i;
        linearLayout.setLayoutParams(marginLayoutParams4);
        PreviewView previewView = ((e761) getBinding()).e;
        ViewGroup.LayoutParams layoutParams5 = previewView.getLayoutParams();
        if (layoutParams5 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.bottomMargin = rje.d(bwg0.ybsdk_margin_bottom_camera_preview, requireContext()) + i;
        previewView.setLayoutParams(marginLayoutParams5);
        ErrorView errorView = ((e761) getBinding()).f;
        errorView.setPadding(errorView.getPaddingLeft(), errorView.getPaddingTop(), errorView.getPaddingRight(), i);
        FullscreenStatusView fullscreenStatusView = ((e761) getBinding()).j;
        fullscreenStatusView.setPadding(fullscreenStatusView.getPaddingLeft(), fullscreenStatusView.getPaddingTop(), fullscreenStatusView.getPaddingRight(), i);
        return insets;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity requireActivity = requireActivity();
        BaseNavigationActivity baseNavigationActivity = requireActivity instanceof BaseNavigationActivity ? (BaseNavigationActivity) requireActivity : null;
        if (baseNavigationActivity != null) {
            baseNavigationActivity.addListener(this.keyEventsListener);
        }
        ((com.ybsdk.core.permissions.a) this.cameraPermissionManager).d(getViewModel().d0());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tje.N(eja1.s(this), null, null, new KycPhotoV2Fragment$onCreate$1(this, null), 3);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.cameraHelper = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        FragmentActivity requireActivity = requireActivity();
        BaseNavigationActivity baseNavigationActivity = requireActivity instanceof BaseNavigationActivity ? (BaseNavigationActivity) requireActivity : null;
        if (baseNavigationActivity != null) {
            baseNavigationActivity.removeListener(this.keyEventsListener);
        }
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
        getViewModel().h0(((com.ybsdk.core.permissions.a) this.cameraPermissionManager).a());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setStatusBarColorModel(this.systemBarColorTransparent);
        setNavigationBarColorModel(this.systemBarColorTransparent);
        final int i = 0;
        final int i2 = 1;
        this.cameraHelper = new wq7(requireActivity(), getViewModel().c0(), new sls(this) { // from class: vnx
            public final /* synthetic */ KycPhotoV2Fragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                pey viewLifecycleOwner;
                PreviewView onViewCreated$lambda$1;
                int i3 = i;
                KycPhotoV2Fragment kycPhotoV2Fragment = this.b;
                switch (i3) {
                    case 0:
                        viewLifecycleOwner = kycPhotoV2Fragment.getViewLifecycleOwner();
                        return viewLifecycleOwner;
                    default:
                        onViewCreated$lambda$1 = KycPhotoV2Fragment.onViewCreated$lambda$1(kycPhotoV2Fragment);
                        return onViewCreated$lambda$1;
                }
            }
        }, new sls(this) { // from class: vnx
            public final /* synthetic */ KycPhotoV2Fragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                pey viewLifecycleOwner;
                PreviewView onViewCreated$lambda$1;
                int i3 = i2;
                KycPhotoV2Fragment kycPhotoV2Fragment = this.b;
                switch (i3) {
                    case 0:
                        viewLifecycleOwner = kycPhotoV2Fragment.getViewLifecycleOwner();
                        return viewLifecycleOwner;
                    default:
                        onViewCreated$lambda$1 = KycPhotoV2Fragment.onViewCreated$lambda$1(kycPhotoV2Fragment);
                        return onViewCreated$lambda$1;
                }
            }
        });
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(tox viewState) {
        renderTip(viewState);
        renderError(viewState);
        renderStatus(viewState);
        renderToolbar(viewState);
        renderButtons(viewState);
        renderPhotoArea(viewState);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
