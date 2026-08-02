package xsna;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: KmsClients.java */
/* loaded from: classes13.dex */
public final class djy {
    public static final CopyOnWriteArrayList<cjy> a = new CopyOnWriteArrayList<>();

    public static cjy a(String str) throws GeneralSecurityException {
        Iterator<cjy> it = a.iterator();
        while (it.hasNext()) {
            cjy next = it.next();
            if (next.b(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(go9.b("No KMS client does support: ", str));
    }
}
