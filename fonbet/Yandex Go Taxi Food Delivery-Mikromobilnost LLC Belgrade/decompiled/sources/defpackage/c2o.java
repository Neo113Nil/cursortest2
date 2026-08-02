package defpackage;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public class c2o implements j2o {
    @Override // defpackage.j2o
    public final Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
