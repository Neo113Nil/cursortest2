package org.chromium.base;

import internal.J.N;
import org.chromium.base.Token;
import xsna.dyx;

/* loaded from: classes8.dex */
public class TokenJni implements Token.Natives {
    private static dyx sOverride;

    public static Token.Natives get() {
        Object obj;
        dyx dyxVar = sOverride;
        return (dyxVar == null || (obj = dyxVar.a) == null) ? new TokenJni() : (Token.Natives) obj;
    }

    public static void setInstanceForTesting(Token.Natives natives) {
        if (sOverride == null) {
            sOverride = dyx.a();
        }
        sOverride.a = natives;
    }

    @Override // org.chromium.base.Token.Natives
    public Token createRandom() {
        return (Token) N.MnpYy_DE();
    }
}
