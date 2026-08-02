package xsna;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.superapp.qr.web2app.QrWebToAppComponent;
import com.vk.superapp.qr.web2app.data.CheckSignInOpenArguments;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.k1c;
import xsna.mk50;

/* compiled from: CheckSignInBottomSheet.kt */
/* loaded from: classes6.dex */
public final class a1c extends tl50<g1c, l1c, y0c> {
    public static final /* synthetic */ int k1 = 0;
    public CheckSignInOpenArguments i1;
    public androidx.appcompat.app.d j1;

    /* compiled from: CheckSignInBottomSheet.kt */
    public static final class a extends dw20.b {
        public final CheckSignInOpenArguments e;

        public a(CheckSignInOpenArguments checkSignInOpenArguments, FragmentActivity fragmentActivity) {
            super(fragmentActivity, null);
            this.e = checkSignInOpenArguments;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            int i = a1c.k1;
            a1c a1cVar = new a1c();
            CheckSignInOpenArguments checkSignInOpenArguments = this.e;
            a1cVar.setArguments(yfb.b(new Pair("check_sign_in_args", checkSignInOpenArguments)));
            Drawable e = enj.e(R.drawable.vk_icon_laptop_outline_56, R.attr.vk_ui_icon_accent, this.c);
            String string = this.c.getString(R.string.vk_qr_web_to_app_check_sign_in_title);
            String string2 = this.c.getString(R.string.vk_qr_web_to_app_check_sign_in_subtitle, checkSignInOpenArguments.e);
            String string3 = this.c.getString(R.string.vk_qr_web_to_app_error_dialog_cancel);
            cbq.a(this);
            N(e);
            e.a aVar = this.d;
            aVar.h0 = string3;
            aVar.g1 = null;
            H(new com.vk.movika.sdk.base.logic.interactor.p(a1cVar, 20));
            q(false);
            p(false);
            o();
            w0(string);
            s0(string2);
            M0();
            return a1cVar;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        l1c l1cVar = (l1c) getFeature().c.g();
        new View(requireContext());
        gm50.a.b(this, l1cVar.b, new yx0(this, 24));
        return mk50.a.a;
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((l1c) ao50Var).b, new yx0(this, 24));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((g1c) vk50Var).l.a(new wg1(1, this, a1c.class, "dispatchSideEffect", "dispatchSideEffect(Lcom/vk/superapp/qr/web2app/modal/mvi/CheckSignInSideEffects;)V", 0, 3), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        androidx.appcompat.app.d dVar = this.j1;
        if (dVar != null) {
            dVar.hide();
        }
        this.j1 = null;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        this.i1 = (CheckSignInOpenArguments) bundle.getParcelable("check_sign_in_args");
        return new g1c(requireContext().getApplicationContext(), this.i1, ((QrWebToAppComponent) m7m.d(this).a(fpf0.a(QrWebToAppComponent.class))).c(), ((SessionManagementComponent) m7m.d(this).a(fpf0.a(SessionManagementComponent.class))).J2(), new i1c(new b1c(requireContext()), k1c.b.b));
    }
}
