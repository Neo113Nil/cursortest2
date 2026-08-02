package defpackage;

import java.security.PrivilegedAction;
import ru.CryptoPro.JCP.tools.LocalMutex;

/* loaded from: classes4.dex */
public final /* synthetic */ class c87 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return LocalMutex.getDefault();
    }
}
