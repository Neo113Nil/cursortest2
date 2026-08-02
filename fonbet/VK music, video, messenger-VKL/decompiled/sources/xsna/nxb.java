package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverScopedComponent;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import xsna.tzp0;

/* compiled from: ChatProfileSettingsModalDialog.kt */
/* loaded from: classes2.dex */
public final class nxb extends dw20 implements m0q0, fcn {
    public static final /* synthetic */ int k1 = 0;
    public DialogExt f1;
    public uwb g1;
    public alm h1;
    public final Object i1 = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.processor.actions.g(this, 17));
    public final io.reactivex.rxjava3.disposables.b j1 = new io.reactivex.rxjava3.disposables.b();

    public nxb() {
        this.D = true;
        this.K0 = true;
        this.I0 = 0;
        this.H0 = 0;
        this.F = false;
        this.b1 = true;
        this.x = new tzp0.c.a(this, false);
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    public final void Yn(boolean z) {
        if (this.s != null) {
            Qn(z);
        }
    }

    @Override // xsna.dw20
    public final boolean a0() {
        uwb uwbVar = this.g1;
        if (uwbVar == null) {
            uwbVar = null;
        }
        if (!uwbVar.a1()) {
            return false;
        }
        xwb xwbVar = uwbVar.n;
        bzb0 bzb0Var = xwbVar.f;
        if (bzb0Var == null) {
            return true;
        }
        bzb0.d(bzb0Var, e1h0.l, new ic(xwbVar, 18), new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(xwbVar, 20), null, 24);
        return true;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        super.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        uwb uwbVar = this.g1;
        if (uwbVar == null) {
            uwbVar = null;
        }
        uwbVar.getClass();
        if (i2 == -1 && i == 389489) {
            uwbVar.p.b(intent);
        }
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        uwb uwbVar = this.g1;
        if (uwbVar == null) {
            uwbVar = null;
        }
        uwbVar.getClass();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        a1w a1wVar;
        super.onCreate(bundle);
        Bundle bundle2 = requireArguments().getBundle("dialog_ext_state");
        Peer peer = (Peer) bundle2.getParcelable("dialog_id");
        long j = peer != null ? peer.b : 0L;
        DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
        if (dialogExt == null) {
            dialogExt = new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
        }
        this.f1 = dialogExt;
        Peer peer2 = (Peer) this.i1.getValue();
        if (!BuildInfo.s() || !peer2.Ab(Peer.Type.GROUP) ? (a1wVar = q1w.a) == null : (a1wVar = q1w.b) == null) {
            a1wVar = null;
        }
        zdw zdwVar = i7o0.b;
        dhr0 dhr0Var = (zdwVar != null ? zdwVar : null).f;
        if (zdwVar == null) {
            zdwVar = null;
        }
        cew cewVar = zdwVar.u;
        DialogExt dialogExt2 = this.f1;
        if (dialogExt2 == null) {
            dialogExt2 = null;
        }
        alm almVar = new alm(dhr0Var, a1wVar, cewVar, dialogExt2);
        almVar.c(getLifecycle());
        this.h1 = almVar;
        Context requireContext = requireContext();
        alm almVar2 = this.h1;
        if (almVar2 == null) {
            almVar2 = null;
        }
        kkm kkmVar = almVar2.g;
        ucp ucpVar = ucp.a;
        DialogExt dialogExt3 = this.f1;
        DialogExt dialogExt4 = dialogExt3 != null ? dialogExt3 : null;
        l7m d = m7m.d(this);
        f1w b0 = ((ImConfigurationScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) this.i1.getValue(), d).a(fpf0.a(ImConfigurationScopedComponent.class))).b0();
        l7m d2 = m7m.d(this);
        lzv g = ((ImCmdRxExecutorScopedComponent) xq.f((ImFeatureScopeProviderComponent) d2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) this.i1.getValue(), d2).a(fpf0.a(ImCmdRxExecutorScopedComponent.class))).g();
        l7m d3 = m7m.d(this);
        this.g1 = new uwb(requireContext, dialogExt4, this, kkmVar, b0, g, ((ImRxEventObserverScopedComponent) xq.f((ImFeatureScopeProviderComponent) d3.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) this.i1.getValue(), d3).a(fpf0.a(ImRxEventObserverScopedComponent.class))).l(), g2v.c(), new bc6(requireContext(), new lk1(this, 2)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.j1.e();
        uwb uwbVar = this.g1;
        if (uwbVar == null) {
            uwbVar = null;
        }
        uwbVar.G0();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        uwb uwbVar = this.g1;
        if (uwbVar == null) {
            uwbVar = null;
        }
        uwbVar.H0();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ww50<?> Y;
        super.onDismiss(dialogInterface);
        Object mo2getContext = mo2getContext();
        ey50 ey50Var = mo2getContext instanceof ey50 ? (ey50) mo2getContext : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null) {
            return;
        }
        Y.H(this);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            uwb uwbVar = this.g1;
            (uwbVar != null ? uwbVar : null).W0();
        } else {
            uwb uwbVar2 = this.g1;
            (uwbVar2 != null ? uwbVar2 : null).V0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        uwb uwbVar = this.g1;
        if (uwbVar == null) {
            uwbVar = null;
        }
        uwbVar.W0();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        uwb uwbVar = this.g1;
        if (uwbVar == null) {
            uwbVar = null;
        }
        uwbVar.V0();
    }

    @Override // xsna.dw20, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        uwb uwbVar = this.g1;
        if (uwbVar == null) {
            uwbVar = null;
        }
        uwbVar.P0(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        uwb uwbVar = this.g1;
        if (uwbVar == null) {
            uwbVar = null;
        }
        uwbVar.O0(bundle);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT_SETTINGS;
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        uwb uwbVar = this.g1;
        if (uwbVar == null) {
            uwbVar = null;
        }
        View D0 = uwbVar.D0(requireContext(), null, null, bundle);
        D0.setClipToOutline(true);
        D0.setOutlineProvider(new t0w0(4, cn70.a() * 12.0f, false, false));
        this.e0 = new d5j(D0);
        this.f0 = new ocb(D0, 1);
        dw20.Rn(this, D0, 6);
        Dialog yn = super.yn(bundle);
        yn.setOnShowListener(new pcb(this, 1));
        return yn;
    }
}
