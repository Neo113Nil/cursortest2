package defpackage;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes.dex */
public class e2o implements j2o {
    @Override // defpackage.j2o
    public final Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
