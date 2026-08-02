package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes.dex */
public final class gg21 implements qkx {
    @Override // defpackage.qkx
    public final String a(Object obj, qg70 qg70Var) {
        Uri uri = (Uri) obj;
        if (!jl40.l(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append(LicenseUtility.SEPARATOR);
        Configuration configuration = qg70Var.c().getResources().getConfiguration();
        Bitmap.Config[] configArr = m.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
