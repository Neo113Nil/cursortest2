package defpackage;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes.dex */
public class f2o implements j2o {
    @Override // defpackage.j2o
    public final Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
