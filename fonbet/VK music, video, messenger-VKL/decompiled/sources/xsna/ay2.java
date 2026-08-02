package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;
import xsna.aex0;

/* compiled from: ApiErrorBottomSheetProvider.kt */
/* loaded from: classes6.dex */
public final class ay2 {
    public static void a(Context context) {
        aex0.a aVar = new aex0.a();
        aVar.a = "gf_login_issue_bottom_sheet";
        aVar.b = Integer.valueOf(R.drawable.vk_icon_error_outline_56);
        SpannableString spannableString = new SpannableString(context.getString(R.string.vk_steps_google_fit_error_title));
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.vk_black)), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString(context.getString(R.string.vk_steps_google_fit_error_subtitle));
        spannableString2.setSpan(new ForegroundColorSpan(context.getColor(R.color.vk_steel_gray_400)), 0, spannableString2.length(), 0);
        SpannableString spannableString3 = new SpannableString("\n\n");
        spannableString3.setSpan(new AbsoluteSizeSpan(6, true), 0, spannableString3.length(), 0);
        aVar.f = new SpannableString(new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString3).append((CharSequence) spannableString2));
        aVar.b(context.getString(android.R.string.ok), new a());
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.e0(aVar.a());
    }

    /* compiled from: ApiErrorBottomSheetProvider.kt */
    public static final class a implements aex0.b {
        @Override // xsna.aex0.b
        public final void a() {
        }
    }
}
