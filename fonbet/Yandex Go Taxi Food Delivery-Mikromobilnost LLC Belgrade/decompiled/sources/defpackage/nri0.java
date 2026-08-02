package defpackage;

import com.google.crypto.tink.KeyTemplate$OutputPrefixType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class nri0 {
    public static final AtomicReference a;
    public static final ConcurrentHashMap b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;

    static {
        Logger.getLogger(nri0.class.getName());
        a = new AtomicReference(new pix());
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        d = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        r6 = (java.util.Map.Entry) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (defpackage.nri0.d.containsKey(r6.getKey()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r6.getKey()) + " from an existing key manager of type " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        r4 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (r4.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        r5 = (java.util.Map.Entry) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (defpackage.nri0.d.containsKey(r5.getKey()) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + ((java.lang.String) r5.getKey()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (((defpackage.pix) defpackage.nri0.a.get()).a.containsKey(r4) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        r5 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r5.hasNext() == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void a(String str, Map map, boolean z) {
        synchronized (nri0.class) {
            if (z) {
                try {
                    ConcurrentHashMap concurrentHashMap = c;
                    if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                } finally {
                }
            }
        }
    }

    public static Object b(lhx lhxVar, Class cls) {
        n2f0 n2f0Var = (n2f0) fz40.b.a.get();
        n2f0Var.getClass();
        m2f0 m2f0Var = new m2f0(lhxVar.getClass(), cls);
        HashMap hashMap = n2f0Var.a;
        if (hashMap.containsKey(m2f0Var)) {
            return ((e2f0) hashMap.get(m2f0Var)).b.b(lhxVar);
        }
        yci0.u("No PrimitiveConstructor for ", m2f0Var, " available");
        return null;
    }

    public static Object c(String str, ByteString byteString, Class cls) {
        pix pixVar = (pix) a.get();
        pixVar.getClass();
        oix a2 = pixVar.a(str);
        Set keySet = ((Map) a2.a.b).keySet();
        hjv hjvVar = a2.a;
        if (!keySet.contains(cls)) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(hjvVar.getClass());
            sb.append(", supported primitives: ");
            Set<Class> keySet2 = ((Map) hjvVar.b).keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Class cls2 : keySet2) {
                if (!z) {
                    sb2.append(Extension.FIX_SPACE);
                }
                sb2.append(cls2.getCanonicalName());
                z = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!((Map) hjvVar.b).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + hjvVar.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                vt10 j = hjvVar.j(byteString);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                hjvVar.l(j);
                return hjvVar.g(j, cls);
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) hjvVar.a).getName()), e);
            }
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public static synchronized bix d(ijx ijxVar) {
        bix J;
        synchronized (nri0.class) {
            hjv hjvVar = ((pix) a.get()).a(ijxVar.C()).a;
            gp50 gp50Var = new gp50(hjvVar, (Class) hjvVar.c);
            if (!((Boolean) c.get(ijxVar.C())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + ijxVar.C());
            }
            J = gp50Var.J(ijxVar.D());
        }
        return J;
    }

    public static synchronized void e(hjv hjvVar, boolean z) {
        synchronized (nri0.class) {
            try {
                AtomicReference atomicReference = a;
                pix pixVar = new pix((pix) atomicReference.get());
                pixVar.b(hjvVar);
                String f = hjvVar.f();
                a(f, z ? hjvVar.h().g() : Collections.EMPTY_MAP, z);
                if (!((pix) atomicReference.get()).a.containsKey(f)) {
                    b.put(f, new vms(8));
                    if (z) {
                        f(f, hjvVar.h().g());
                    }
                }
                c.put(f, Boolean.valueOf(z));
                atomicReference.set(pixVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(String str, Map map) {
        OutputPrefixType outputPrefixType;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            byte[] e = ((a) ((vt10) ((ujx) entry.getValue()).a)).e();
            KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType = ((ujx) entry.getValue()).b;
            hjx E = ijx.E();
            E.e();
            ijx.x((ijx) E.b, str);
            ByteString f = ByteString.f(0, e.length, e);
            E.e();
            ijx.y((ijx) E.b, f);
            int i = gjx.b[keyTemplate$OutputPrefixType.ordinal()];
            if (i == 1) {
                outputPrefixType = OutputPrefixType.TINK;
            } else if (i == 2) {
                outputPrefixType = OutputPrefixType.LEGACY;
            } else if (i == 3) {
                outputPrefixType = OutputPrefixType.RAW;
            } else {
                if (i != 4) {
                    ny61.g("Unknown output prefix type");
                    return;
                }
                outputPrefixType = OutputPrefixType.CRUNCHY;
            }
            E.e();
            ijx.z((ijx) E.b, outputPrefixType);
            d.put(str2, new jjx((ijx) E.b()));
        }
    }

    public static synchronized void g(r2f0 r2f0Var) {
        synchronized (nri0.class) {
            fz40 fz40Var = fz40.b;
            synchronized (fz40Var) {
                l2f0 l2f0Var = new l2f0((n2f0) fz40Var.a.get());
                l2f0Var.a(r2f0Var);
                fz40Var.a.set(new n2f0(l2f0Var));
            }
        }
    }
}
