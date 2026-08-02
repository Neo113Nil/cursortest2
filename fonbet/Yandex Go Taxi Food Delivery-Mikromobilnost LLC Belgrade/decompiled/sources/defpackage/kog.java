package defpackage;

import android.net.Uri;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Locale;

/* loaded from: classes.dex */
public final class kog implements igv {
    @Override // defpackage.igv
    public final hgv a(Uri uri) {
        String scheme = uri.getScheme();
        if (!jl40.l(scheme != null ? scheme.toLowerCase(Locale.ROOT) : null, Constants.KEY_DATA)) {
            uri = null;
        }
        if (uri != null) {
            return new fgv(new gbv(uri));
        }
        return null;
    }
}
