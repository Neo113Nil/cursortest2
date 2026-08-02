package xsna;

import android.content.DialogInterface;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: ClipsAuthorsSelectorBottomControllerImpl.kt */
/* loaded from: classes14.dex */
public final class jid implements gid {
    public dw20 a;

    @Override // xsna.gid
    public final void a(lpj lpjVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, t6 t6Var) {
        dw20 dw20Var = this.a;
        if (dw20Var != null) {
            dw20Var.hide();
        }
        pid pidVar = new pid(lpjVar);
        kid presenter = pidVar.getPresenter();
        if (presenter != null) {
            rhh0 rhh0Var = new rhh0();
            rhh0Var.b = this;
            presenter.e(rhh0Var);
        }
        dw20.b R0 = new dw20.b(lpjVar, null).v0(R.string.clips_authors_selector_modal_title).Y(new iid(this)).Z(new DialogInterface.OnDismissListener() { // from class: xsna.hid
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                jid.this.a = null;
            }
        }).t().D0(pidVar, false).f0(new rm0(5, pidVar, mobileOfficialAppsCoreNavStat$EventScreen)).h0(R.string.clips_authors_selector_list_save_btn_text, new bu1(pidVar, 12)).c(new cpo(true, 0, 4)).R0(false);
        dhr0.a.getClass();
        this.a = R0.u0(dhr0.u().c).I0("ClipsAuthorsSelectorView");
    }
}
