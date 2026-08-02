package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.playlists.ClipsPlaylistContentLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.bre;
import xsna.mk50;
import xsna.tzp0;
import xsna.yre;

/* compiled from: ClipsPlaylistUiBottomSheet.kt */
/* loaded from: classes16.dex */
public final class bre extends tl50<nre, yre, zqe> {
    public final nf3 i1 = new nf3();
    public final nf3 j1 = new nf3();
    public final bpn0 k1 = new bpn0(new com.vk.movika.sdk.base.logic.processor.actions.g(this, 29));
    public final Object l1;
    public final Object m1;
    public final Object n1;
    public final nf3 o1;
    public final d p1;
    public final Object q1;
    public final Object r1;
    public static final /* synthetic */ qcy<Object>[] t1 = {new MutablePropertyReference1Impl(bre.class, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "getContent()Lcom/vk/clips/playlists/playlist_ui/ClipsPlaylistUiContentView;", 0), p5j.a(0, bre.class, "overlayContent", "getOverlayContent()Lcom/vk/clips/playlists/playlist_ui/ClipsPlaylistUiOverlay;", fpf0.a), new MutablePropertyReference1Impl(bre.class, "renderHolder", "getRenderHolder()Lcom/vk/mvi/compose/render/ComposeStateRenderHolder;", 0)};
    public static final b s1 = new b();
    public static final int u1 = (int) (iah0.f().heightPixels * 0.8f);

    /* compiled from: ClipsPlaylistUiBottomSheet.kt */
    public static final class a extends wpi {
        public final ClipsPlaylistContentLaunchParams g;

        public a(Context context, ClipsPlaylistContentLaunchParams clipsPlaylistContentLaunchParams, tzp0.c.a aVar) {
            super(context, aVar);
            this.g = clipsPlaylistContentLaunchParams;
            cpo cpoVar = new cpo(false, 0, 7);
            bre.s1.getClass();
            cpoVar.e = bre.u1;
            c(cpoVar);
            F0(true);
            x(0);
            B(iah0.b(12.0f), true, true);
            I(true);
            if (clipsPlaylistContentLaunchParams.d) {
                dhr0.a.getClass();
                u0(dhr0.u().c);
            }
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            bre breVar = new bre();
            Bundle bundle = new Bundle();
            bundle.putParcelable("input_params", this.g);
            breVar.setArguments(bundle);
            return breVar;
        }
    }

    /* compiled from: ClipsPlaylistUiBottomSheet.kt */
    public static final class b {
    }

    /* compiled from: ClipsPlaylistUiBottomSheet.kt */
    public static final class c extends nw20 {
        @Override // xsna.nw20, xsna.b33, xsna.y8i, android.app.Dialog
        public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
            super.setContentView(view, layoutParams);
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = this.i;
            if (modalBottomSheetBehavior != null) {
                modalBottomSheetBehavior.D = false;
            }
        }
    }

    /* compiled from: ClipsPlaylistUiBottomSheet.kt */
    public static final class d implements fcn {
        public d() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            b bVar = bre.s1;
            bre breVar = bre.this;
            if (breVar.N0) {
                return;
            }
            breVar.dismiss();
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    public bre() {
        com.vk.movika.sdk.base.logic.processor.actions.h hVar = new com.vk.movika.sdk.base.logic.processor.actions.h(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l1 = msy.a(lazyThreadSafetyMode, hVar);
        this.m1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.i(this, 19));
        this.n1 = msy.a(lazyThreadSafetyMode, new bu1(this, 15));
        this.o1 = new nf3();
        this.p1 = new d();
        this.q1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.h(this, 19));
        this.r1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.b(this, 26));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        qcy<Object>[] qcyVarArr = t1;
        ere ereVar = new ere((xqi) this.o1.getValue(this, qcyVarArr[2]), this, requireContext(), co(), u1);
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = ereVar;
        return new mk50.c(((ere) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new c(context, i);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        yre yreVar = (yre) ao50Var;
        qcy<Object>[] qcyVarArr = t1;
        qre qreVar = new qre((xqi) this.o1.getValue(this, qcyVarArr[2]), this, requireContext(), co());
        qcy<Object> qcyVar = qcyVarArr[1];
        nf3 nf3Var = this.j1;
        nf3Var.c = qreVar;
        ((qre) nf3Var.getValue(this, qcyVar)).f(yreVar, new ee8(1, this, bre.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 4));
        ((ere) this.i1.getValue(this, qcyVarArr[0])).f(yreVar, new gy(1, this, bre.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 8));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        nre nreVar = (nre) vk50Var;
        cm50<VS, P, S> cm50Var = nreVar.c;
        xqi xqiVar = new xqi(yre.a.c.a, this, e43.l(((yre) cm50Var.g()).a, ((yre) cm50Var.g()).b, ((yre) cm50Var.g()).c));
        qcy<Object> qcyVar = t1[2];
        this.o1.c = xqiVar;
        nreVar.m.a(new dg(this, 24), this);
        nreVar.n.a(new i4e(this, 4), this);
    }

    public final void bo() {
        Qn(true);
        hide();
        hg1.a(io.reactivex.rxjava3.core.x.t(500L, TimeUnit.MILLISECONDS).q(asu0.a.d()).subscribe(new kl6(new jm0(this, 15), 7)), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean co() {
        return ((Boolean) this.r1.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsPlaylistContentLaunchParams eo() {
        return (ClipsPlaylistContentLaunchParams) this.q1.getValue();
    }

    public final ClipsPlaylistsComponentImpl fo() {
        return (ClipsPlaylistsComponentImpl) this.k1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.addContentView(((qre) this.j1.getValue(this, t1[1])).d, new ViewGroup.LayoutParams(-1, -1));
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ww50 v;
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null && (v = s200.v(mo2getContext)) != null) {
            v.H(this.p1);
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        ClipsPlaylistContentLaunchParams eo = eo();
        kue Ef = fo().Ef();
        cse Df = fo().Df();
        vve Ff = fo().Ff();
        s2f e0 = ((ClipsViewerAdapterComponent) this.l1.getValue()).e0();
        mhd mhdVar = (mhd) this.m1.getValue();
        ((BridgeComponent) this.n1.getValue()).x().h().getClass();
        return new nre(eo, Ef, Df, Ff, e0, mhdVar, true);
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        final b33 b33Var = (b33) yn;
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.are
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                bre.b bVar = bre.s1;
                ww50 v = s200.v(b33.this.getContext());
                if (v != null) {
                    v.S(this.p1);
                }
            }
        });
        return yn;
    }
}
