package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.dw20;
import xsna.tzp0;

/* compiled from: PreviewProfileModalDialog.kt */
/* loaded from: classes2.dex */
public final class g5d0 extends dw20 implements m0q0, fcn {
    public static final /* synthetic */ qcy<Object>[] k1;
    public e5d0 f1;
    public final io.reactivex.rxjava3.disposables.b g1 = new io.reactivex.rxjava3.disposables.b();
    public final ras h1 = xo9.v("peer_id");
    public final a1w i1;
    public final o0r0 j1;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(g5d0.class, "peer", "getPeer()Lcom/vk/dto/common/Peer;", 0);
        fpf0.a.getClass();
        k1 = new qcy[]{propertyReference1Impl};
    }

    public g5d0() {
        a1w a1wVar = q1w.a;
        this.i1 = a1wVar == null ? null : a1wVar;
        this.j1 = xwk.e();
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

    @Override // xsna.dw20
    public final boolean a0() {
        e5d0 e5d0Var = this.f1;
        if (e5d0Var == null) {
            e5d0Var = null;
        }
        e5d0Var.getClass();
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        super.dismiss();
    }

    public final void close() {
        super.dismiss();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e5d0 e5d0Var = this.f1;
        if (e5d0Var == null) {
            e5d0Var = null;
        }
        e5d0Var.getClass();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qcy<Object> qcyVar = k1[0];
        this.f1 = new e5d0((Peer) this.h1.a(this), kn(), this.i1, this.j1, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.g1.e();
        e5d0 e5d0Var = this.f1;
        if (e5d0Var == null) {
            e5d0Var = null;
        }
        e5d0Var.G0();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        e5d0 e5d0Var = this.f1;
        if (e5d0Var == null) {
            e5d0Var = null;
        }
        e5d0Var.H0();
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
            e5d0 e5d0Var = this.f1;
            (e5d0Var != null ? e5d0Var : null).W0();
        } else {
            e5d0 e5d0Var2 = this.f1;
            (e5d0Var2 != null ? e5d0Var2 : null).V0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        e5d0 e5d0Var = this.f1;
        if (e5d0Var == null) {
            e5d0Var = null;
        }
        e5d0Var.W0();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        e5d0 e5d0Var = this.f1;
        if (e5d0Var == null) {
            e5d0Var = null;
        }
        e5d0Var.V0();
    }

    @Override // xsna.dw20, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        e5d0 e5d0Var = this.f1;
        if (e5d0Var == null) {
            e5d0Var = null;
        }
        e5d0Var.getClass();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        e5d0 e5d0Var = this.f1;
        if (e5d0Var == null) {
            e5d0Var = null;
        }
        e5d0Var.O0(bundle);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        e5d0 e5d0Var = this.f1;
        if (e5d0Var == null) {
            e5d0Var = null;
        }
        dw20.Rn(this, e5d0Var.D0(requireContext(), null, null, bundle), 6);
        return super.yn(bundle);
    }

    /* compiled from: PreviewProfileModalDialog.kt */
    public static final class a extends dw20.a<a, g5d0> {
        public Peer e;

        @Override // xsna.dw20.a
        public final g5d0 f() {
            g5d0 g5d0Var = new g5d0();
            g5d0Var.setArguments(yfb.b(new Pair("peer_id", this.e)));
            d0(new jz70(g5d0Var, 11));
            return g5d0Var;
        }

        @Override // xsna.dw20.a
        public final a g() {
            return this;
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
