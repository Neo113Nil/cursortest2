package defpackage;

import android.net.Uri;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class h7 implements igv {
    public final String a;

    public h7(String str) {
        this.a = str;
    }

    @Override // defpackage.igv
    public final hgv a(Uri uri) {
        String scheme = uri.getScheme();
        if (jl40.l(scheme != null ? scheme.toLowerCase(Locale.ROOT) : null, "div-load-image") && jl40.l(uri.getHost(), this.a)) {
            return b(uri);
        }
        return null;
    }

    public abstract hgv b(Uri uri);
}
