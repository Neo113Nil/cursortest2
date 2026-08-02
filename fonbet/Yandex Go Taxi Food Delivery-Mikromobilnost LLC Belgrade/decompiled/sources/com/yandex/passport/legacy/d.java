package com.yandex.passport.legacy;

import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.util.HandledMovementMethod;
import defpackage.oyr;
import defpackage.unr0;
import java.util.Locale;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public abstract class d {
    public static void a(b0 b0Var, p pVar, TextView textView, PassportTheme passportTheme) {
        Context context = textView.getContext();
        String string = context.getString(R.string.passport_use_eula_agreement);
        String d = d(context, pVar, false);
        String e = e(context, pVar, false);
        String string2 = context.getString(R.string.passport_eula_wallet_license_url);
        String string3 = context.getString(R.string.passport_eula_taxi_agreement_url_override);
        String string4 = context.getString(R.string.passport_eula_user_agreement_text);
        String string5 = context.getString(R.string.passport_eula_privacy_policy_text);
        SpannableString spannableString = new SpannableString(Html.fromHtml(TariffOrderFlow.ORDER_FLOW_TAXI_KEY.equalsIgnoreCase(context.getString(R.string.passport_use_eula_agreement)) ? context.getString(R.string.passport_eula_reg_taxi_format_android, h(i(string3, context.getString(R.string.passport_eula_taxi_agreement_text_override))), h(i(d, string4)), h(i(e, string5))) : (context.getPackageName().startsWith("ru.yandex.money") || "money".equalsIgnoreCase(string)) ? context.getString(R.string.passport_eula_reg_money_format_android, h(i(d, string4)), h(i(e, string5)), h(i(string2, context.getString(R.string.passport_eula_wallet_license_text)))) : context.getString(R.string.passport_eula_reg_format_android, h(i(d, string4)), h(i(e, string5)))));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            final String url = uRLSpan.getURL();
            spannableString.setSpan(new URLSpan(url) { // from class: com.yandex.passport.legacy.UiUtil$URLSpanNoUnderline
                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }
            }, spanStart, spanEnd, 0);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(new HandledMovementMethod(new c(d, b0Var, e, string2, string3, textView, passportTheme)));
    }

    public static void b(Context context, ProgressBar progressBar, int i) {
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(context.getColor(i)));
    }

    public static int c(int i, Context context) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static String d(Context context, p pVar, boolean z) {
        String str = pVar.k;
        return (str == null || TextUtils.isEmpty(str)) ? context.getString(R.string.passport_eula_user_agreement_url) : j(str, z);
    }

    public static String e(Context context, p pVar, boolean z) {
        String str = pVar.l;
        return (str == null || TextUtils.isEmpty(str)) ? context.getString(R.string.passport_eula_privacy_policy_url) : j(str, z);
    }

    public static void f(View view) {
        InputMethodManager inputMethodManager;
        Context context = view.getContext();
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static boolean g(View view) {
        return view.getResources().getConfiguration().orientation == 2;
    }

    public static String h(String str) {
        return oyr.p("<b>", str, "</b>");
    }

    public static String i(String str, String str2) {
        return unr0.p("<a href='", str, "'>", str2, "</a>");
    }

    public static String j(String str, boolean z) {
        Uri parse = Uri.parse(str.toLowerCase(Locale.US));
        Uri.Builder fragment = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(TextUtils.isEmpty(parse.getPath()) ? "/" : parse.getPath()).fragment(parse.getFragment());
        if (z) {
            fragment.encodedQuery(parse.getEncodedQuery());
        } else {
            fragment.query(parse.getQuery());
        }
        return fragment.build().toString();
    }

    public static void k(int i, View view) {
        if (view instanceof ProgressBar) {
            b(view.getContext(), (ProgressBar) view, i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                k(i, viewGroup.getChildAt(i2));
            }
        }
    }

    public static void l(TextView textView, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = c(i, textView.getContext());
        textView.setLayoutParams(marginLayoutParams);
    }

    public static void m(final View view, final TextView textView) {
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        ResultReceiver resultReceiver = new ResultReceiver(handler) { // from class: com.yandex.passport.legacy.UiUtil$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (textView != null) {
                    View view2 = view;
                    if (view2 != null) {
                        view2.sendAccessibilityEvent(65536);
                    }
                    textView.requestFocus();
                    TextView textView2 = textView;
                    if (textView2 != null) {
                        textView2.sendAccessibilityEvent(32768);
                    }
                    if (textView2 != null) {
                        textView2.announceForAccessibility(textView2.getText());
                    }
                }
            }
        };
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        view.requestFocus();
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 0, resultReceiver);
        }
    }
}
