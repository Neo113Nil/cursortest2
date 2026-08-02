package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* compiled from: Registry.java */
/* loaded from: classes.dex */
public final class mrf0 {
    public static final Logger a = Logger.getLogger(mrf0.class.getName());
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e;

    /* compiled from: Registry.java */
    public interface a {
        Class<?> a();

        Set<Class<?>> b();

        pdy c();

        pdy d(Class cls) throws GeneralSecurityException;
    }

    static {
        new ConcurrentHashMap();
        e = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        synchronized (mrf0.class) {
            ConcurrentHashMap concurrentHashMap = b;
            if (concurrentHashMap.containsKey(str)) {
                a aVar = (a) concurrentHashMap.get(str);
                if (aVar.a().equals(cls)) {
                    if (z && !((Boolean) d.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                    return;
                }
                a.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + aVar.a().getName() + ", cannot be re-registered with " + cls.getName());
            }
        }
    }

    public static synchronized a b(String str) throws GeneralSecurityException {
        a aVar;
        synchronized (mrf0.class) {
            ConcurrentHashMap concurrentHashMap = b;
            if (!concurrentHashMap.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
            aVar = (a) concurrentHashMap.get(str);
        }
        return aVar;
    }

    public static Object c(String str, byte[] bArr) throws GeneralSecurityException {
        ByteString.g gVar = ByteString.b;
        return d(str, ByteString.e(0, bArr.length, bArr), b51.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <P> P d(String str, ByteString byteString, Class<P> cls) throws GeneralSecurityException {
        a b2 = b(str);
        if (b2.b().contains(cls)) {
            pdy d2 = b2.d(cls);
            hey<KeyProtoT> heyVar = d2.a;
            try {
                ka20 e2 = heyVar.e(byteString);
                GenericDeclaration genericDeclaration = d2.b;
                if (Void.class.equals(genericDeclaration)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                heyVar.f(e2);
                return (P) heyVar.b(e2, genericDeclaration);
            } catch (InvalidProtocolBufferException e3) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(heyVar.a.getName()), e3);
            }
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(b2.a());
        sb.append(", supported primitives: ");
        Set<Class<?>> b3 = b2.b();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : b3) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    public static synchronized KeyData e(dey deyVar) throws GeneralSecurityException {
        KeyData a2;
        synchronized (mrf0.class) {
            pdy c2 = b(deyVar.v()).c();
            if (!((Boolean) d.get(deyVar.v())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + deyVar.v());
            }
            a2 = c2.a(deyVar.w());
        }
        return a2;
    }

    public static synchronized <KeyProtoT extends ka20> void f(hey<KeyProtoT> heyVar, boolean z) throws GeneralSecurityException {
        synchronized (mrf0.class) {
            try {
                String a2 = heyVar.a();
                a(a2, heyVar.getClass(), z);
                ConcurrentHashMap concurrentHashMap = b;
                if (!concurrentHashMap.containsKey(a2)) {
                    concurrentHashMap.put(a2, new krf0(heyVar));
                    c.put(a2, new lrf0());
                }
                d.put(a2, Boolean.valueOf(z));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized <B, P> void g(obd0<B, P> obd0Var) throws GeneralSecurityException {
        synchronized (mrf0.class) {
            try {
                Class<P> a2 = obd0Var.a();
                ConcurrentHashMap concurrentHashMap = e;
                if (concurrentHashMap.containsKey(a2)) {
                    obd0 obd0Var2 = (obd0) concurrentHashMap.get(a2);
                    if (!obd0Var.getClass().equals(obd0Var2.getClass())) {
                        a.warning("Attempted overwrite of a registered SetWrapper for type " + a2);
                        throw new GeneralSecurityException("SetWrapper for primitive (" + a2.getName() + ") is already registered to be " + obd0Var2.getClass().getName() + ", cannot be re-registered with " + obd0Var.getClass().getName());
                    }
                }
                concurrentHashMap.put(a2, obd0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
