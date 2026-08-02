package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.io.File;

/* loaded from: classes6.dex */
public abstract class jna1 {
    public static String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static File b(File file, String str) {
        String str2;
        String str3;
        int i = 0;
        z83.c(null, str.length() == 0);
        z83.h(null, file.isDirectory());
        tje.f();
        int K = evu0.K(str, '.', 0, 6);
        if (K > 0) {
            str3 = str.substring(0, K);
            str2 = str.substring(K);
        } else {
            str2 = "";
            str3 = str;
        }
        File file2 = new File(file, str);
        while (file2.exists()) {
            i++;
            file2 = new File(file, str3 + "_" + i + str2);
        }
        return file2;
    }

    public static final void c(TextView textView, boolean z) {
        Drawable drawable;
        if (z) {
            drawable = vng.t(jxg0.plus_sdk_panel_ic_arrow_forward, textView.getContext());
        } else {
            drawable = null;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    public static final do0 d(co0 co0Var) {
        String str = co0Var.a;
        Integer num = co0Var.c;
        Integer num2 = co0Var.b;
        xk0 xk0Var = co0Var.e;
        uk0 uk0Var = co0Var.d;
        ql0 ql0Var = co0Var.f;
        return new do0(uk0Var, xk0Var, co0Var.g, co0Var.h, co0Var.i, ql0Var, co0Var.j, num, num2, str);
    }
}
