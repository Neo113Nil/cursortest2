package defpackage;

import java.security.PrivilegedExceptionAction;
import ru.CryptoPro.JCP.KeyStore.CPKeyContainer;
import ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface;

/* loaded from: classes4.dex */
public final class gs61 implements PrivilegedExceptionAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContainerReaderInterface b;
    public final /* synthetic */ String c;

    public /* synthetic */ gs61(ContainerReaderInterface containerReaderInterface, String str, int i) {
        this.a = i;
        this.b = containerReaderInterface;
        this.c = str;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        int i = this.a;
        String str = this.c;
        ContainerReaderInterface containerReaderInterface = this.b;
        switch (i) {
            case 0:
                CPKeyContainer.delete(containerReaderInterface, str);
                break;
            default:
                CPKeyContainer.delete(containerReaderInterface, str);
                break;
        }
        return null;
    }
}
