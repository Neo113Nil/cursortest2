package defpackage;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public class d2o implements j2o {
    @Override // defpackage.j2o
    public final Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
