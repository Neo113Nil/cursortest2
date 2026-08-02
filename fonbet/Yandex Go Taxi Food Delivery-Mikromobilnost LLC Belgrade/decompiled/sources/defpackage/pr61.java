package defpackage;

import java.security.PrivilegedExceptionAction;
import java.util.Enumeration;
import ru.CryptoPro.JCP.KeyStore.CPKeyContainer;
import ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface;
import ru.CryptoPro.JCP.KeyStore.ContainerStore;
import ru.CryptoPro.JCP.KeyStore.MediaInterface;

/* loaded from: classes4.dex */
public final class pr61 implements PrivilegedExceptionAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaInterface b;
    public final /* synthetic */ String c;

    public /* synthetic */ pr61(MediaInterface mediaInterface, String str, int i) {
        this.a = i;
        this.b = mediaInterface;
        this.c = str;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        int i = this.a;
        String str = this.c;
        MediaInterface mediaInterface = this.b;
        switch (i) {
            case 0:
                Boolean bool = ContainerStore.f;
                Enumeration enumNew = mediaInterface.enumNew(str);
                String str2 = null;
                boolean z = true;
                while (enumNew.hasMoreElements() && z) {
                    str2 = (String) enumNew.nextElement();
                    ContainerReaderInterface open = mediaInterface.open(str2, false);
                    try {
                        boolean z2 = CPKeyContainer.getContainerName(open) != null;
                        open.close();
                        z = z2;
                    } catch (Throwable th) {
                        open.close();
                        throw th;
                    }
                }
                if (!z) {
                    return mediaInterface.open(str2, true);
                }
                dy31.t("Store full");
                return null;
            default:
                return mediaInterface.open(str, false);
        }
    }
}
