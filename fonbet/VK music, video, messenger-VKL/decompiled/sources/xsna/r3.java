package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.VkText;
import com.vk.external.miniapp.net.app.WebLegalInfo;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: AboutDeveloperBottomSheetDialog.kt */
/* loaded from: classes6.dex */
public final class r3 {
    public final Context a;

    public r3(Context context) {
        this.a = context;
    }

    public final void a(WebLegalInfo webLegalInfo) {
        dw20.a c;
        Context context = this.a;
        int m = krv0.m(R.attr.vk_ui_background_modal, context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.vk_apps_about_dev_dialog, (ViewGroup) null, false);
        c = new dw20.b(context, null).D0(inflate, false).F0(true).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
        dw20 I0 = ((dw20.b) c).S(m).I0(null);
        VkText vkText = (VkText) inflate.findViewById(R.id.developer_info_text_view);
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.about_developer_cancel_button);
        StringBuilder sb = new StringBuilder();
        String str = webLegalInfo.b;
        String str2 = webLegalInfo.f;
        String str3 = webLegalInfo.e;
        String str4 = webLegalInfo.c;
        if (str != null && str.length() != 0) {
            sb.append(str);
        }
        if (str4 != null && str4.length() != 0) {
            sb.append("\n\n" + context.getString(R.string.vk_apps_install_screen_address_developer));
            sb.append(str4);
        }
        if (str3 != null && str3.length() != 0) {
            sb.append("\n\n" + context.getString(R.string.vk_apps_install_screen_inn_developer));
            sb.append(str3);
        }
        if (str2 != null && str2.length() != 0) {
            sb.append("\n\n");
            sb.append(str2);
        }
        vkText.setText(sb.toString());
        appCompatImageView.setOnClickListener(new q3(I0, 0));
    }
}
