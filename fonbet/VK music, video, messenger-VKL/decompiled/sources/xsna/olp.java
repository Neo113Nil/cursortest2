package xsna;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import xsna.ylp;

/* compiled from: EngineFactory.java */
/* loaded from: classes.dex */
public final class olp<T_WRAPPER extends ylp<T_ENGINE>, T_ENGINE> {
    public static final Logger c = Logger.getLogger(olp.class.getName());
    public static final ArrayList d;
    public static final olp<ylp.a, Cipher> e;
    public static final olp<ylp.b, Mac> f;
    public final T_WRAPPER a;
    public final List<Provider> b = d;

    static {
        try {
            Class.forName("android.app.Application", false, null);
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    c.info("Provider " + str + " not available");
                }
            }
            d = arrayList;
        } catch (Exception unused) {
            d = new ArrayList();
        }
        e = new olp<>(new ylp.a());
        f = new olp<>(new ylp.b());
    }

    public olp(T_WRAPPER t_wrapper) {
        this.a = t_wrapper;
    }

    public final T_ENGINE a(String str) throws GeneralSecurityException {
        Iterator<Provider> it = this.b.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            T_WRAPPER t_wrapper = this.a;
            if (!hasNext) {
                return (T_ENGINE) t_wrapper.a(str, null);
            }
            try {
                return (T_ENGINE) t_wrapper.a(str, it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
    }
}
