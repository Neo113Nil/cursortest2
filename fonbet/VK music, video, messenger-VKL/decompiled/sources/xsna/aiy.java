package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import xsna.nbd0;
import xsna.sjk;

/* compiled from: KeysetHandle.java */
/* loaded from: classes.dex */
public final class aiy {
    public final com.google.crypto.tink.proto.a a;

    public aiy(com.google.crypto.tink.proto.a aVar) {
        this.a = aVar;
    }

    public static final aiy b(maj0 maj0Var, ha2 ha2Var) throws GeneralSecurityException, IOException {
        mjp u = mjp.u(maj0Var.a(), com.google.crypto.tink.shaded.protobuf.k.a());
        if (u.s().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            com.google.crypto.tink.proto.a x = com.google.crypto.tink.proto.a.x(ha2Var.b(u.s().m(), new byte[0]), com.google.crypto.tink.shaded.protobuf.k.a());
            if (x.t() > 0) {
                return new aiy(x);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final <P> P a(Class<P> cls) throws GeneralSecurityException {
        byte[] array;
        obd0 obd0Var = (obd0) mrf0.e.get(cls);
        Class c = obd0Var == null ? null : obd0Var.c();
        if (c == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i = t2r0.a;
        com.google.crypto.tink.proto.a aVar = this.a;
        int v = aVar.v();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (a.c cVar : aVar.u()) {
            if (cVar.x() == KeyStatusType.ENABLED) {
                if (!cVar.y()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.v())));
                }
                if (cVar.w() == OutputPrefixType.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.v())));
                }
                if (cVar.x() == KeyStatusType.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.v())));
                }
                if (cVar.v() == v) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (cVar.u().u() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        nbd0 nbd0Var = new nbd0(c);
        for (a.c cVar2 : aVar.u()) {
            KeyStatusType x = cVar2.x();
            KeyStatusType keyStatusType = KeyStatusType.ENABLED;
            if (x == keyStatusType) {
                Object d = mrf0.d(cVar2.u().v(), cVar2.u().w(), c);
                if (cVar2.x() != keyStatusType) {
                    throw new GeneralSecurityException("only ENABLED key is allowed");
                }
                int i3 = sjk.a.a[cVar2.w().ordinal()];
                if (i3 == 1 || i3 == 2) {
                    array = ByteBuffer.allocate(5).put((byte) 0).putInt(cVar2.v()).array();
                } else if (i3 == 3) {
                    array = ByteBuffer.allocate(5).put((byte) 1).putInt(cVar2.v()).array();
                } else {
                    if (i3 != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    array = sjk.a;
                }
                nbd0.a<P> aVar2 = new nbd0.a<>(d, array, cVar2.x(), cVar2.w());
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar2);
                nbd0.b bVar = new nbd0.b(aVar2.a());
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                ConcurrentHashMap concurrentHashMap = nbd0Var.a;
                List list = (List) concurrentHashMap.put(bVar, unmodifiableList);
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(aVar2);
                    concurrentHashMap.put(bVar, Collections.unmodifiableList(arrayList2));
                }
                if (cVar2.v() != aVar.v()) {
                    continue;
                } else {
                    if (aVar2.c != keyStatusType) {
                        throw new IllegalArgumentException("the primary entry has to be ENABLED");
                    }
                    if (nbd0Var.a(aVar2.a()).isEmpty()) {
                        throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                    }
                    nbd0Var.b = aVar2;
                }
            }
        }
        obd0 obd0Var2 = (obd0) mrf0.e.get(cls);
        Class<P> cls2 = nbd0Var.c;
        if (obd0Var2 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
        }
        if (obd0Var2.c().equals(cls2)) {
            return (P) obd0Var2.b(nbd0Var);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + obd0Var2.c() + ", got " + cls2);
    }

    public final String toString() {
        return t2r0.a(this.a).toString();
    }
}
