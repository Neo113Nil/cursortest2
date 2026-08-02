package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.superapp.qr.web2app.QrWebToAppComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import kotlin.LazyThreadSafetyMode;
import xsna.gm50;
import xsna.mk50;

/* compiled from: LoaderFragment.kt */
/* loaded from: classes6.dex */
public final class krz extends yk50<jsz, nsz, fsz> {
    public androidx.appcompat.app.d i;
    public androidx.appcompat.app.d j;
    public String k;

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.c(new View(requireContext()));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        nsz nszVar = (nsz) ao50Var;
        getFeature().l.a(new com.vk.repository.internal.repos.stickers.suggests.a(1, this, krz.class, "dispatchSideEffect", "dispatchSideEffect(Lcom/vk/superapp/qr/web2app/loader/mvi/LoaderSideEffects;)V", 0, 8), getViewOwner());
        gm50.a.b(this, nszVar.a, new cvh(this, 18));
        gm50.a.b(this, nszVar.b, new qqe(this, 29));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        androidx.appcompat.app.d dVar = this.i;
        if (dVar != null) {
            dVar.cancel();
        }
        this.i = null;
        androidx.appcompat.app.d dVar2 = this.j;
        if (dVar2 != null) {
            dVar2.hide();
        }
        this.j = null;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Uri uri = (Uri) bundle.getParcelable("uri_key");
        msy.a(LazyThreadSafetyMode.NONE, new cy20(10));
        String queryParameter = uri == null ? null : uri.getQueryParameter(CampaignEx.JSON_KEY_AD_Q);
        this.k = queryParameter;
        noe0 c = ((QrWebToAppComponent) m7m.d(this).a(fpf0.a(QrWebToAppComponent.class))).c();
        qoe0 qoe0Var = new qoe0(requireContext());
        lsz lszVar = new lsz(new gsz(requireContext()));
        mui0 J2 = ((SessionManagementComponent) m7m.d(this).a(fpf0.a(SessionManagementComponent.class))).J2();
        r55 r55Var = r55.a;
        to10 to10Var = r55.f().b;
        return new jsz(queryParameter, c, qoe0Var, J2, lszVar);
    }
}
