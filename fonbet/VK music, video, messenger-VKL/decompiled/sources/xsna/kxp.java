package xsna;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;

/* compiled from: EsiaAccountNotConfirmedModal.kt */
/* loaded from: classes15.dex */
public final class kxp {
    public final ld20 a;

    public kxp(ld20 ld20Var) {
        this.a = ld20Var;
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [T, xsna.dw20] */
    public final void a(Activity activity) {
        Drawable e = enj.e(R.drawable.vk_icon_cancel_circle_outline_56, R.attr.vk_ui_icon_negative, activity);
        Drawable e2 = enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary, activity);
        kcu0 kcu0Var = new kcu0(SchemeStatSak$EventScreen.EXTERNAL_INVALID_PROFILE, false, null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dw20.b bVar = new dw20.b(activity, kcu0Var);
        cbq.a(bVar);
        dw20.b bVar2 = (dw20.b) dw20.a.R(((dw20.b) bVar.N(e).F(e2, null)).b0(new x2e(ref$ObjectRef, 16)).v0(R.string.vk_auth_esia_account_not_confirmed_modal_title).M0().X(new k6k(activity, 8)), activity.getString(R.string.vk_auth_esia_account_not_confirmed_modal_subtitle), 0, 0, 6);
        ref$ObjectRef.element = bVar2.h(bVar2.c.getString(R.string.vk_auth_esia_account_not_confirmed_modal_positive_button_text), new cw20(new j9k(activity, 9))).h0(R.string.vk_auth_esia_account_not_confirmed_modal_negative_button_text, new akh(this, 14)).I0("EsiaAccountNotConfirmed");
    }
}
