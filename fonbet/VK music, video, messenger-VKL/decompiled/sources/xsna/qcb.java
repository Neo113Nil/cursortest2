package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.X3;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.tzp0;

/* compiled from: ChannelSettingsModalDialog.kt */
/* loaded from: classes16.dex */
public final class qcb extends dw20 implements m0q0, fcn {
    public static final /* synthetic */ int h1 = 0;
    public ecb f1;
    public final io.reactivex.rxjava3.disposables.b g1 = new io.reactivex.rxjava3.disposables.b();

    public qcb() {
        this.D = true;
        this.K0 = true;
        this.I0 = 0;
        this.H0 = 0;
        this.F = false;
        this.b1 = true;
        this.E = true;
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
        ecb ecbVar = this.f1;
        if (ecbVar == null) {
            ecbVar = null;
        }
        if (!ecbVar.X0()) {
            return false;
        }
        rcb rcbVar = ecbVar.j;
        bzb0 bzb0Var = rcbVar.f;
        if (bzb0Var == null) {
            return true;
        }
        bzb0.d(bzb0Var, e1h0.l, new ic(rcbVar, 18), new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(rcbVar, 20), null, 24);
        return true;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        super.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        ecb ecbVar = this.f1;
        if (ecbVar == null) {
            ecbVar = null;
        }
        ecbVar.getClass();
        if (i2 == -1 && i == 389490) {
            pua puaVar = ecbVar.k;
            puaVar.getClass();
            if (intent == null || (str = intent.getStringExtra(X3.i.b)) == null) {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                puaVar.b(str);
                return;
            }
            Uri uri = intent != null ? (Uri) intent.getParcelableExtra("output") : null;
            if (uri != null) {
                puaVar.b(uri.toString());
            }
        }
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ecb ecbVar = this.f1;
        if (ecbVar == null) {
            ecbVar = null;
        }
        ecbVar.getClass();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long j = requireArguments().getLong("channel_id");
        int i = 0;
        kkm kkmVar = new kkm(0);
        ucp ucpVar = ucp.a;
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        this.f1 = new ecb(this, kkmVar, a1wVar, g2v.c(), new bc6(requireContext(), new ncb(this, i)), j);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.g1.e();
        ecb ecbVar = this.f1;
        if (ecbVar == null) {
            ecbVar = null;
        }
        ecbVar.G0();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ecb ecbVar = this.f1;
        if (ecbVar == null) {
            ecbVar = null;
        }
        ecbVar.H0();
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
            ecb ecbVar = this.f1;
            (ecbVar != null ? ecbVar : null).W0();
        } else {
            ecb ecbVar2 = this.f1;
            (ecbVar2 != null ? ecbVar2 : null).V0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ecb ecbVar = this.f1;
        if (ecbVar == null) {
            ecbVar = null;
        }
        ecbVar.W0();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ecb ecbVar = this.f1;
        if (ecbVar == null) {
            ecbVar = null;
        }
        ecbVar.V0();
    }

    @Override // xsna.dw20, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ecb ecbVar = this.f1;
        if (ecbVar == null) {
            ecbVar = null;
        }
        ecbVar.getClass();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        ecb ecbVar = this.f1;
        if (ecbVar == null) {
            ecbVar = null;
        }
        ecbVar.O0(bundle);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNEL_SETTINGS;
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        ecb ecbVar = this.f1;
        if (ecbVar == null) {
            ecbVar = null;
        }
        View D0 = ecbVar.D0(requireContext(), null, null, bundle);
        D0.setClipToOutline(true);
        D0.setOutlineProvider(new t0w0(4, cn70.a() * 12.0f, false, false));
        this.e0 = new d5j(D0);
        this.f0 = new ocb(D0, 0);
        dw20.Rn(this, D0, 6);
        Dialog yn = super.yn(bundle);
        yn.setOnShowListener(new pcb(this, 0));
        return yn;
    }
}
