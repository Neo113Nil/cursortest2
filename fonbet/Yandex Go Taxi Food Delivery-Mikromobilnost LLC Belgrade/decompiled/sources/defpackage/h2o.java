package defpackage;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes.dex */
public class h2o implements j2o {
    @Override // defpackage.j2o
    public final Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
