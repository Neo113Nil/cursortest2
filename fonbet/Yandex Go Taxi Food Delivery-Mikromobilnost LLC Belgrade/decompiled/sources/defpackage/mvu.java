package defpackage;

import android.net.Uri;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class mvu implements igv {
    @Override // defpackage.igv
    public final hgv a(Uri uri) {
        Set set = nvu.a;
        String scheme = uri.getScheme();
        if (!a.G(set, scheme != null ? scheme.toLowerCase(Locale.ROOT) : null)) {
            uri = null;
        }
        if (uri != null) {
            return new fgv(new qbv(uri.toString()));
        }
        return null;
    }
}
