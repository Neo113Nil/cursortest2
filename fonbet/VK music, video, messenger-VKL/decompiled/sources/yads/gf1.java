package yads;

import android.net.Uri;
import xsna.epx;

/* loaded from: classes10.dex */
public final class gf1 {
    public final pu a;

    public gf1(pu puVar) {
        this.a = puVar;
    }

    public final boolean a(ix1 ix1Var, String str) {
        Uri parse = Uri.parse(str);
        if (!epx.f(parse.getScheme(), "light-bundles") || !epx.f(parse.getHost(), "click")) {
            return false;
        }
        String queryParameter = parse.getQueryParameter("assetName");
        if (queryParameter == null && (queryParameter = parse.getQueryParameter("asset")) == null) {
            return false;
        }
        this.a.a(ix1Var, queryParameter);
        return true;
    }
}
