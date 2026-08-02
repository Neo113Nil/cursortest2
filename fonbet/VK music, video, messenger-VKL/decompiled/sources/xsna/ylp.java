package xsna;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: EngineWrapper.java */
/* loaded from: classes.dex */
public interface ylp<T> {

    /* compiled from: EngineWrapper.java */
    public static class a implements ylp<Cipher> {
        @Override // xsna.ylp
        public final Cipher a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper.java */
    public static class b implements ylp<Mac> {
        @Override // xsna.ylp
        public final Mac a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    T a(String str, Provider provider) throws GeneralSecurityException;
}
