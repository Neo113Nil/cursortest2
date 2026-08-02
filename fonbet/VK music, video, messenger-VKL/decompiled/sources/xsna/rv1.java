package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.ui.VkOAuthServiceInfo;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;

/* compiled from: AlreadyBoundModal.kt */
/* loaded from: classes15.dex */
public final class rv1 {
    public final ld20 a;
    public final String b;
    public final int c;
    public final int d = R.string.vk_auth_id_already_bound_to_another_base_modal_subtitle;
    public final a e;
    public final VkOAuthService f;

    /* compiled from: AlreadyBoundModal.kt */
    public interface a {
        void a();
    }

    public rv1(ld20 ld20Var, String str, int i, a aVar, VkOAuthService vkOAuthService) {
        this.a = ld20Var;
        this.b = str;
        this.c = i;
        this.e = aVar;
        this.f = vkOAuthService;
    }

    /* JADX WARN: Type inference failed for: r11v13, types: [T, xsna.dw20] */
    public final void a(Activity activity) {
        VkOAuthServiceInfo vkOAuthServiceInfo;
        Drawable e = enj.e(R.drawable.vk_icon_error_outline_56, R.attr.vk_ui_icon_negative, activity);
        Drawable e2 = enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary, activity);
        kcu0 kcu0Var = new kcu0(SchemeStatSak$EventScreen.ALERT_AUTH_PHONE, false, null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dw20.b bVar = new dw20.b(activity, kcu0Var);
        cbq.a(bVar);
        dw20.b b0 = ((dw20.b) bVar.N(e).F(e2, null)).b0(new s9(ref$ObjectRef, 2));
        int i = this.c;
        VkOAuthService vkOAuthService = this.f;
        if (vkOAuthService == null) {
            b0.v0(i);
        } else {
            Context context = b0.c;
            VkOAuthServiceInfo.Companion.getClass();
            if (vkOAuthService != null) {
                VkOAuthServiceInfo[] values = VkOAuthServiceInfo.values();
                int length = values.length;
                for (int i2 = 0; i2 < length; i2++) {
                    vkOAuthServiceInfo = values[i2];
                    if (vkOAuthServiceInfo.j() == vkOAuthService) {
                        break;
                    }
                }
            }
            vkOAuthServiceInfo = null;
            b0.w0(context.getString(i, vkOAuthServiceInfo != null ? vkOAuthServiceInfo.i(b0.c) : null));
        }
        ref$ObjectRef.element = ((dw20.b) dw20.a.Q(b0.M0(), this.d)).h0(R.string.vk_auth_sign_up_account_apply_new_number, new ld(this, 3)).T(R.string.vk_auth_sign_up_account_unavailable_go_to_support, new h6(this, 4)).I0(this.b);
    }
}
