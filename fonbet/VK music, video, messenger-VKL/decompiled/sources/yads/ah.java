package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import xsna.fo8;

/* loaded from: classes10.dex */
public final class ah {
    public static final String c = "Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 7.14.3 (inclusive) and the maximum supported version is 8.0.0 (exclusive). Please, check your AppMetrica integration.";
    public static final String d = "Incorrect AppMetrica Version. The minimum supported version of AppMetrica SDK is 7.14.3 (inclusive) and the maximum supported version is 8.0.0 (exclusive). And the current version of AppMetrica SDK is ";
    public final te3 a;
    public final fh b;

    public /* synthetic */ ah(Context context) {
        this(new te3(), pg.a(context));
    }

    public final void a() {
        String str;
        this.b.getClass();
        try {
            str = AppMetrica.getLibraryVersion();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            String str2 = c;
            throw new xb1(str2, str2);
        }
        this.a.getClass();
        se3 a = te3.a("7.14.3");
        if (a == null) {
            return;
        }
        this.a.getClass();
        se3 a2 = te3.a("8.0.0");
        if (a2 == null) {
            return;
        }
        this.a.getClass();
        se3 a3 = te3.a(str);
        if (a3 == null || a3.compareTo(a) < 0 || a3.compareTo(a2) >= 0) {
            String a4 = a(str);
            throw new xb1(a4, a4);
        }
    }

    public ah(te3 te3Var, fh fhVar) {
        this.a = te3Var;
        this.b = fhVar;
    }

    public static String a(String str) {
        return fo8.a(d, str);
    }
}
