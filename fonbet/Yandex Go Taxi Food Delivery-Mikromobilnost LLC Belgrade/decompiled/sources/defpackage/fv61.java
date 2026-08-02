package defpackage;

import javax.security.auth.Destroyable;
import ru.CryptoPro.CAdES.EncryptionKeyAlgorithm;
import ru.CryptoPro.JCP.Key.SpecKey;

/* loaded from: classes4.dex */
public final class fv61 implements Destroyable {
    public final Object a;
    public final EncryptionKeyAlgorithm b;
    public boolean c = false;

    public fv61(Object obj, EncryptionKeyAlgorithm encryptionKeyAlgorithm) {
        this.a = obj;
        this.b = encryptionKeyAlgorithm;
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        boolean z;
        Object obj = this.a;
        if (obj instanceof SpecKey) {
            ((SpecKey) obj).clear();
            z = true;
        } else {
            z = false;
        }
        this.c = z;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.c;
    }
}
