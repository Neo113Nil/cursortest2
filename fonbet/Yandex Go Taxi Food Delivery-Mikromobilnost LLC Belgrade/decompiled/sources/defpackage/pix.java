package defpackage;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class pix {
    public static final Logger b = Logger.getLogger(pix.class.getName());
    public final ConcurrentHashMap a;

    public pix(pix pixVar) {
        this.a = new ConcurrentHashMap(pixVar.a);
    }

    public final synchronized oix a(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (oix) this.a.get(str);
    }

    public final synchronized void b(hjv hjvVar) {
        if (!hjvVar.e().a()) {
            throw new GeneralSecurityException("failed to register key manager " + hjvVar.getClass() + " as it is not FIPS compatible.");
        }
        c(new oix(hjvVar));
    }

    public final synchronized void c(oix oixVar) {
        hjv hjvVar = oixVar.a;
        Class cls = (Class) hjvVar.c;
        if (!((Map) hjvVar.b).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException("Given internalKeyMananger " + hjvVar.toString() + " does not support primitive class " + cls.getName());
        }
        String f = hjvVar.f();
        oix oixVar2 = (oix) this.a.get(f);
        if (oixVar2 != null && !oixVar2.a.getClass().equals(oixVar.a.getClass())) {
            b.warning("Attempted overwrite of a registered key manager for key type ".concat(f));
            throw new GeneralSecurityException("typeUrl (" + f + ") is already registered with " + oixVar2.a.getClass().getName() + ", cannot be re-registered with " + oixVar.a.getClass().getName());
        }
        this.a.putIfAbsent(f, oixVar);
    }

    public pix() {
        this.a = new ConcurrentHashMap();
    }
}
