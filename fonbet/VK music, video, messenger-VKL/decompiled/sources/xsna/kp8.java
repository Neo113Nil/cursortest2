package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: ButtonCommerceThemeExt.kt */
/* loaded from: classes6.dex */
public final class kp8 {
    public static final boolean a(Context context) {
        int a;
        if (context instanceof l7s) {
            return true;
        }
        if (context instanceof lpj) {
            lpj lpjVar = (lpj) context;
            if (lpjVar.getThemeResId() != 0) {
                int themeResId = lpjVar.getThemeResId();
                TypedValue typedValue = krv0.a;
                Integer b = krv0.b();
                if (b == null || themeResId != b.intValue()) {
                    return true;
                }
            }
        }
        if (!(context instanceof ContextThemeWrapper) || (a = npj.a((ContextWrapper) context)) <= 0) {
            return false;
        }
        TypedValue typedValue2 = krv0.a;
        Integer b2 = krv0.b();
        return b2 == null || b2.intValue() != a;
    }
}
