package xsna;

import java.security.GeneralSecurityException;
import xsna.hey;

/* compiled from: KmsEnvelopeAeadKeyManager.java */
/* loaded from: classes.dex */
public final class hjy extends hey.b<b51, fjy> {
    @Override // xsna.hey.b
    public final Object a(ka20 ka20Var) throws GeneralSecurityException {
        fjy fjyVar = (fjy) ka20Var;
        String r = fjyVar.s().r();
        return new ejy(fjyVar.s().q(), djy.a(r).a(r));
    }
}
