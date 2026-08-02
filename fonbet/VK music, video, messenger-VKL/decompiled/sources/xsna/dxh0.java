package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: SearchParamsDialogSheet.kt */
/* loaded from: classes5.dex */
public final class dxh0 {
    public final om6<?> a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public final dw20 c;

    public dxh0(Activity activity, om6<?> om6Var) {
        this.a = om6Var;
        dw20.b m = new dw20.b(activity, null).D0(om6Var, false).v0(R.string.vk_discover_search_params_title).G(R.string.vk_discover_search_params_clear).c(new cpo(false, 0, 7)).I(true).m(R.attr.vk_ui_background_content);
        if (!om6Var.e()) {
            m.h0(R.string.vk_discover_search_show_result, new ag20(this, 28));
        }
        this.c = m.H(new q130(this, 26)).d0(new ofc0(this, 3)).a0(new x750(this, 19)).a();
    }

    public final void a(FragmentManager fragmentManager) {
        om6<?> om6Var = this.a;
        exh0 sasVar = om6Var instanceof nv90 ? new sas(fragmentManager) : new gxh0(fragmentManager);
        om6Var.setDialogNavigator(sasVar);
        sasVar.a(this.c);
    }
}
