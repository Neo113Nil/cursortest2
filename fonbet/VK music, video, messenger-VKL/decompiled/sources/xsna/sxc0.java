package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.core.preference.Preference;

/* compiled from: Preference.kt */
/* loaded from: classes.dex */
public final class sxc0 {
    public static final /* synthetic */ sxc0 a = new sxc0();
    public static bpn0 b;

    public static final krl0 a() {
        bpn0 bpn0Var = b;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (krl0) bpn0Var.getValue();
    }

    public static final boolean b(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        Intent intent = ((Activity) context).getIntent();
        if (!epx.f(intent != null ? intent.getAction() : null, "android.intent.action.MAIN")) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long m = Preference.m(currentTimeMillis, "sa_pool", "__sa_pool_use_timestamp__");
        return currentTimeMillis > m && currentTimeMillis - m < 172800000;
    }

    public static final String c(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            IllegalStateException illegalStateException = new IllegalStateException(zr.a("No value for meta-data '", str, "'."));
            if (i0q0.b()) {
                throw illegalStateException;
            }
            i0q0.c(illegalStateException);
            throw illegalStateException;
        }
        String U = drm0.U(string, "string/");
        if (U.length() != 0) {
            return U;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException(zr.a("Empty value for meta-data '", str, "'."));
        if (i0q0.b()) {
            throw illegalStateException2;
        }
        i0q0.c(illegalStateException2);
        throw illegalStateException2;
    }
}
