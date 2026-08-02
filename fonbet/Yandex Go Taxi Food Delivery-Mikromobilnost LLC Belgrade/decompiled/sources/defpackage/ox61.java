package defpackage;

import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import ru.CryptoPro.JCP.KeyStore.MediaInterface;

/* loaded from: classes4.dex */
public final class ox61 implements Enumeration {
    public String a = null;
    public String b;
    public final Enumeration c;
    public final MediaInterface d;
    public IOException e;

    public ox61(String str, MediaInterface mediaInterface) {
        this.e = null;
        this.d = mediaInterface;
        try {
            this.c = (Enumeration) AccessController.doPrivileged(new as61(this, str));
        } catch (PrivilegedActionException e) {
            this.e = (IOException) e.getCause();
            this.c = null;
        }
        this.b = (String) AccessController.doPrivileged(new br61(0, this));
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        String str = this.b;
        if (str == null) {
            w511.i("Has no more elements");
            return null;
        }
        this.b = (String) AccessController.doPrivileged(new br61(0, this));
        IOException iOException = this.e;
        if (iOException == null) {
            return str;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException(iOException.getMessage());
        try {
            noSuchElementException.initCause(iOException);
            throw noSuchElementException;
        } catch (Throwable unused) {
            throw noSuchElementException;
        }
    }

    public final String toString() {
        IOException iOException = this.e;
        return iOException != null ? iOException.toString() : this.b != null ? this.a : "Has no more elements";
    }
}
