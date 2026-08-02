package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.a;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: KeysetManager.java */
/* loaded from: classes.dex */
public final class ciy {
    public final a.b a;

    public ciy(a.b bVar) {
        this.a = bVar;
    }

    public static int d() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public final synchronized aiy a() throws GeneralSecurityException {
        com.google.crypto.tink.proto.a j;
        j = this.a.j();
        if (j.t() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new aiy(j);
    }

    public final synchronized boolean b(int i) {
        Iterator it = Collections.unmodifiableList(((com.google.crypto.tink.proto.a) this.a.c).u()).iterator();
        while (it.hasNext()) {
            if (((a.c) it.next()).v() == i) {
                return true;
            }
        }
        return false;
    }

    public final synchronized a.c c(dey deyVar) throws GeneralSecurityException {
        KeyData e;
        int d;
        try {
            e = mrf0.e(deyVar);
            synchronized (this) {
                d = d();
                while (b(d)) {
                    d = d();
                }
            }
            return r2.j();
        } catch (Throwable th) {
            throw th;
        }
        OutputPrefixType u = deyVar.u();
        if (u == OutputPrefixType.UNKNOWN_PREFIX) {
            u = OutputPrefixType.TINK;
        }
        a.c.C0134a z = a.c.z();
        z.o(e);
        z.p(d);
        z.r(KeyStatusType.ENABLED);
        z.q(u);
        return z.j();
    }
}
