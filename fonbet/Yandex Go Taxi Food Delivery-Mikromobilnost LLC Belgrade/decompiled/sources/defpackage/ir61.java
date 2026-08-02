package defpackage;

import java.security.PrivilegedExceptionAction;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageMedia;
import ru.CryptoPro.JCP.KeyStore.MutexException;
import ru.CryptoPro.JCP.tools.License;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes4.dex */
public final class ir61 implements PrivilegedExceptionAction {
    public final /* synthetic */ int a;

    public /* synthetic */ ir61(int i) {
        this.a = i;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        switch (this.a) {
            case 0:
                try {
                    HDImageMedia.c.lock();
                    return null;
                } catch (Exception e) {
                    MutexException mutexException = new MutexException(e.toString());
                    mutexException.initCause(e);
                    throw mutexException;
                }
            case 1:
                LicenseUtility.constructLicenseObject(License.class).checkHashOnly();
                return null;
            default:
                new License().check();
                return null;
        }
    }
}
