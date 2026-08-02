package yads;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import xsna.e43;
import xsna.qoe;

/* loaded from: classes10.dex */
public final class zh1 {
    public final xh1 a = new xh1();

    public final String a(Context context) {
        Object failure;
        LocaleList applicationLocales;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                applicationLocales = qoe.a(context.getSystemService("locale")).getApplicationLocales();
                if (applicationLocales.isEmpty()) {
                    Locale locale = context.getResources().getConfiguration().locale;
                    this.a.getClass();
                    failure = xh1.a(locale);
                } else {
                    xh1 xh1Var = this.a;
                    Locale locale2 = applicationLocales.get(0);
                    xh1Var.getClass();
                    failure = xh1.a(locale2);
                }
            } else {
                Locale locale3 = context.getResources().getConfiguration().locale;
                this.a.getClass();
                failure = xh1.a(locale3);
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public final List b(Context context) {
        try {
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            ListBuilder e = e43.e();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                xh1 xh1Var = this.a;
                Locale locale = locales.get(i);
                xh1Var.getClass();
                e.add(xh1.a(locale));
            }
            return e.g();
        } catch (Throwable unused) {
            return null;
        }
    }
}
