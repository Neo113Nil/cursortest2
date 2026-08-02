package org.chromium.net;

import internal.J.N;
import org.chromium.net.HttpNegotiateAuthenticator;
import xsna.dyx;

/* loaded from: classes8.dex */
class HttpNegotiateAuthenticatorJni implements HttpNegotiateAuthenticator.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static dyx sOverride;

    public static HttpNegotiateAuthenticator.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new HttpNegotiateAuthenticatorJni() : (HttpNegotiateAuthenticator.Natives) obj;
    }

    public static void setInstanceForTesting(HttpNegotiateAuthenticator.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.net.HttpNegotiateAuthenticator.Natives
    public void setResult(long j, int i, String str) {
        N.M0s8NeYn(j, i, str);
    }
}
