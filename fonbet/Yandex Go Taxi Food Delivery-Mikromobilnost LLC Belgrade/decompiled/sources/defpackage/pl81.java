package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes7.dex */
public final class pl81 {
    public static String a(Context context) {
        Object failure;
        LocaleList applicationLocales;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                applicationLocales = o6u0.b(context.getSystemService("locale")).getApplicationLocales();
                failure = applicationLocales.isEmpty() ? ef81.a(context.getResources().getConfiguration().locale) : ef81.a(applicationLocales.get(0));
            } else {
                failure = ef81.a(context.getResources().getConfiguration().locale);
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public static ListBuilder b(Context context) {
        try {
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            ListBuilder a = rcc.a();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                a.add(ef81.a(locales.get(i)));
            }
            return a.j();
        } catch (Throwable unused) {
            return null;
        }
    }
}
