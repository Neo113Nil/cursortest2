package xsna;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ao70;
import xsna.dw20;

/* compiled from: MailRuAlreadyBoundModal.kt */
/* loaded from: classes15.dex */
public final class xc00 {
    public final String a;
    public final ao70.a b;

    public xc00(String str, ao70.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [T, xsna.dw20] */
    public final void a(Activity activity) {
        Drawable e = enj.e(R.drawable.vk_icon_mail_outline_56, R.attr.vk_ui_icon_accent, activity);
        Drawable e2 = enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary, activity);
        kcu0 kcu0Var = new kcu0(SchemeStatSak$EventScreen.MAIL_LINKED_ANOTHER_ACCOUNT, false, new ArrayList(Collections.singletonList(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.OAUTH_NAME, "", "", VkOAuthService.MAILRU.i()))));
        String str = this.a;
        String string = activity.getString(R.string.vk_auth_id_already_bound_to_another_mail_modal_subtitle, str);
        int K = drm0.K(0, 6, string, str, false);
        int length = str.length() + K;
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new TextAppearanceSpan(activity, R.style.VkUiTypography_Headline1Normal), K, length, 33);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dw20.b bVar = new dw20.b(activity, kcu0Var);
        cbq.a(bVar);
        ref$ObjectRef.element = ((dw20.b) dw20.a.R(((dw20.b) bVar.N(e).F(e2, null)).b0(new vc00(ref$ObjectRef, 0)).v0(R.string.vk_auth_id_already_bound_to_another_mail_modal_title).M0(), spannableString, 0, 0, 6)).h0(R.string.vk_auth_id_already_bound_to_another_mail_button_text, new wnh(this, 24)).a0(new wc00(activity, 0)).I0("MailVkIdAlreadyBound");
    }
}
