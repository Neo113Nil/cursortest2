package xsna;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: LocaleManagerCompat.java */
/* loaded from: classes11.dex */
public final class pwz {

    /* compiled from: LocaleManagerCompat.java */
    public static class a {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    public static mwz a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return mwz.a(m63.i(context));
        }
        Object systemService = context.getSystemService("locale");
        return systemService != null ? mwz.b(a.a(systemService)) : mwz.b;
    }
}
