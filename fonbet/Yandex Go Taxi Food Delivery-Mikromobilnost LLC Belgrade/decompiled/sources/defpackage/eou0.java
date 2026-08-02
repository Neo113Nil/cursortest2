package defpackage;

import android.net.Uri;

/* loaded from: classes10.dex */
public final class eou0 implements pb7 {
    @Override // defpackage.pb7
    public final String buildCacheKey(npg npgVar) {
        Uri uri = npgVar.a;
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!jl40.l(str, "vsid")) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return clearQuery.build().toString();
    }
}
