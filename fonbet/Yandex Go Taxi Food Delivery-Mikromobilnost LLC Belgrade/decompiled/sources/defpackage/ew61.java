package defpackage;

import java.security.PrivilegedExceptionAction;
import ru.CryptoPro.JCP.Random.CertifiedRandom;
import ru.CryptoPro.JCP.tools.LocalMutex;

/* loaded from: classes4.dex */
public final class ew61 implements PrivilegedExceptionAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocalMutex b;
    public final /* synthetic */ CertifiedRandom c;

    public /* synthetic */ ew61(CertifiedRandom certifiedRandom, LocalMutex localMutex, int i) {
        this.a = i;
        this.c = certifiedRandom;
        this.b = localMutex;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        int i = this.a;
        LocalMutex localMutex = this.b;
        switch (i) {
            case 0:
                localMutex.lock();
                break;
            default:
                localMutex.lock();
                break;
        }
        return null;
    }
}
