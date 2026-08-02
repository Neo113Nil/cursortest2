package xsna;

import android.os.Bundle;
import xsna.lgc;

/* compiled from: ClassifiedsCatalogSearchGetClassifiedsRequestFactory.kt */
/* loaded from: classes18.dex */
public final class igc extends lgc {
    public final String t;
    public final z3n u;

    public igc(wba wbaVar, kca kcaVar, Bundle bundle, String str) {
        super(wbaVar, new lgc.a(kcaVar), bundle);
        this.t = str;
        this.u = new z3n();
    }

    @Override // xsna.lgc
    public final io.reactivex.rxjava3.core.x s(Bundle bundle, String str) {
        String str2 = this.t;
        if (str2 == null) {
            str2 = "search";
        }
        return rsg0.w0(yfb.x(this.u.a(str2, str, bundle))).l(new pj4(new e5(this, 23), 13));
    }
}
