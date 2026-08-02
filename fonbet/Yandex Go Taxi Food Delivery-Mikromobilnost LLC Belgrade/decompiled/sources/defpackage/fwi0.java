package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.net.URL;

/* loaded from: classes.dex */
public final class fwi0 {
    public final d03 a;
    public final fse b;

    public fwi0(d03 d03Var, fse fseVar) {
        this.a = d03Var;
        this.b = fseVar;
    }

    public static final URL a(fwi0 fwi0Var) {
        fwi0Var.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme(Constants.SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(ConstantDeviceInfo.APP_PLATFORM).appendPath("gmp");
        d03 d03Var = fwi0Var.a;
        Uri.Builder appendPath2 = appendPath.appendPath(d03Var.a).appendPath("settings");
        n72 n72Var = d03Var.c;
        return new URL(appendPath2.appendQueryParameter("build_version", n72Var.c).appendQueryParameter("display_version", n72Var.b).build().toString());
    }
}
