package defpackage;

import android.net.Uri;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes3.dex */
public abstract class l970 {
    public static final Uri b(vop0 vop0Var, Uri uri, Uri uri2) {
        String o = bzk0.o(uri, SdkUri$QueryParam.ADD_SVC_RETPATH);
        if (o == null) {
            return uri2;
        }
        Uri.Builder buildUpon = uri2.buildUpon();
        buildUpon.appendQueryParameter(SdkUri$QueryParam.RETPATH.getParamValue(), vop0Var.a(o));
        return buildUpon.build();
    }

    public static final boolean c(String str, boolean z) {
        if (jl40.l(str, "light")) {
            return true;
        }
        if (jl40.l(str, "dark")) {
            return false;
        }
        if (str == null) {
            return z;
        }
        d(SdkUri$QueryParam.STATUSBAR_STYLE.getParamValue(), str);
        return z;
    }

    public static final void d(String str, String str2) {
        x4c.g("Error while parsing", null, b64.l("Path /open_web, Parameter ", str, ": Unknown value ", str2), null, 10);
    }
}
