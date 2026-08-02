package com.yandex.passport.internal.util;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Event;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;

/* loaded from: classes2.dex */
public class HandledMovementMethod extends LinkMovementMethod {
    private final i handler;

    public HandledMovementMethod(i iVar) {
        this.handler = iVar;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            int scrollX = textView.getScrollX() + (((int) motionEvent.getX()) - textView.getTotalPaddingLeft());
            int scrollY = textView.getScrollY() + (((int) motionEvent.getY()) - textView.getTotalPaddingTop());
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
            if (uRLSpanArr.length != 0) {
                String url = uRLSpanArr[0].getURL();
                i iVar = this.handler;
                if (iVar != null) {
                    com.yandex.passport.legacy.c cVar = (com.yandex.passport.legacy.c) iVar;
                    String str = cVar.a;
                    b0 b0Var = cVar.b;
                    String str2 = cVar.c;
                    String str3 = cVar.d;
                    String str4 = cVar.e;
                    TextView textView2 = cVar.f;
                    PassportTheme passportTheme = cVar.g;
                    if (TextUtils.equals(url, str)) {
                        b0Var.getClass();
                        b0Var.c(DomikStatefulReporter$Screen.PHONE_ENTRY, DomikStatefulReporter$Event.EULA_CLICKED);
                    } else if (TextUtils.equals(url, str2)) {
                        b0Var.getClass();
                        b0Var.c(DomikStatefulReporter$Screen.PHONE_ENTRY, DomikStatefulReporter$Event.CONFIDENTIAL_CLICKED);
                    } else if (TextUtils.equals(url, str3)) {
                        b0Var.getClass();
                        b0Var.c(DomikStatefulReporter$Screen.PHONE_ENTRY, DomikStatefulReporter$Event.MONEY_EULA_CLICKED);
                    } else if (TextUtils.equals(url, str4)) {
                        b0Var.getClass();
                        b0Var.c(DomikStatefulReporter$Screen.PHONE_ENTRY, DomikStatefulReporter$Event.TAXI_EULA_CLICKED);
                    }
                    PassportEnvironmentImpl passportEnvironmentImpl = PassportEnvironmentImpl.PRODUCTION;
                    Context context = textView2.getContext();
                    WebCaseType webCaseType = WebCaseType.VIEW_LEGAL;
                    Bundle bundle = new Bundle();
                    bundle.putString("url", url);
                    textView2.getContext().startActivity(WebViewActivity.createIntent(passportEnvironmentImpl, context, passportTheme, webCaseType, bundle));
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
