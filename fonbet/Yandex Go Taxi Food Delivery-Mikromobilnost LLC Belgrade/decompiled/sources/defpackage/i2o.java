package defpackage;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes.dex */
public class i2o implements j2o {
    @Override // defpackage.j2o
    public final Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
