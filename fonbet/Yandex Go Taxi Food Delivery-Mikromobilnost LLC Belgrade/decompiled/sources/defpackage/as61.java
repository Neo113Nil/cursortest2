package defpackage;

import java.io.Serializable;
import java.security.KeyStore;
import java.security.PrivilegedExceptionAction;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import ru.CryptoPro.JCP.KeyStore.CPKeyContainer;

/* loaded from: classes4.dex */
public final class as61 implements PrivilegedExceptionAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public as61(ox61 ox61Var, String str) {
        this.a = 2;
        this.c = ox61Var;
        this.b = str;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((CPKeyContainer) obj).save((char[]) obj2, true);
                return null;
            case 1:
                CallbackHandler callbackHandler = ((KeyStore.CallbackHandlerProtection) ((KeyStore.ProtectionParameter) obj)).getCallbackHandler();
                PasswordCallback passwordCallback = new PasswordCallback("Password for alias " + ((String) obj2), false);
                callbackHandler.handle(new Callback[]{passwordCallback});
                char[] password = passwordCallback.getPassword();
                passwordCallback.clearPassword();
                return password;
            default:
                return ((ox61) obj2).d.enumExisting((String) obj);
        }
    }

    public /* synthetic */ as61(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
    }
}
