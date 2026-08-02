package xsna;

import com.vk.knet.core.exceptions.HttpRedirectException;
import xsna.imf0;

/* compiled from: DefaultRedirect.kt */
/* loaded from: classes.dex */
public final class lll implements imf0 {
    public final boolean a;
    public final boolean b;

    public lll(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // xsna.imf0
    public final imf0.a.C3060a a(String str, ckv ckvVar) {
        if (!this.a) {
            throw new HttpRedirectException(ss9.a("All redirects disabled. Trying to redirect from origin '", ckvVar.j(), "' to '", str, "'"));
        }
        boolean k = ckvVar.k();
        boolean z = this.b;
        if (k && brm0.B(str, "https://", false) && !z) {
            throw new HttpRedirectException(ss9.a("SSL redirects disabled. Trying to redirect from origin '", ckvVar.j(), "' to '", str, "'"));
        }
        if (ckvVar.l() && brm0.B(str, "http://", false) && !z) {
            throw new HttpRedirectException(ss9.a("SSL redirects disabled. Trying to redirect from origin '", ckvVar.j(), "' to '", str, "'"));
        }
        return imf0.a.C3060a.a;
    }
}
