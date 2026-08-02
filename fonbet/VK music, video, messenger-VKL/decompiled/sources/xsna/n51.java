package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import xsna.bav;
import xsna.hey;
import xsna.k51;
import xsna.p51;
import xsna.z9v;

/* compiled from: AesCtrHmacAeadKeyManager.java */
/* loaded from: classes.dex */
public final class n51 extends hey<k51> {

    /* compiled from: AesCtrHmacAeadKeyManager.java */
    /* loaded from: classes13.dex */
    public class a extends hey.a<l51, k51> {
        public a(n51 n51Var) {
            super(l51.class);
        }

        @Override // xsna.hey.a
        public final k51 a(l51 l51Var) throws GeneralSecurityException {
            l51 l51Var2 = l51Var;
            hey.b[] bVarArr = {new r51(jtw.class)};
            HashMap hashMap = new HashMap();
            for (hey.b bVar : bVarArr) {
                Class<PrimitiveT> cls = bVar.a;
                if (hashMap.containsKey(cls)) {
                    throw new IllegalArgumentException(xlg0.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                hashMap.put(cls, bVar);
            }
            if (bVarArr.length > 0) {
                GenericDeclaration genericDeclaration = bVarArr[0].a;
            }
            Collections.unmodifiableMap(hashMap);
            q51 p = l51Var2.p();
            p51.b x = p51.x();
            t51 r = p.r();
            x.l();
            p51.r((p51) x.c, r);
            byte[] a = ewe0.a(p.q());
            ByteString.g e = ByteString.e(0, a.length, a);
            x.l();
            p51.s((p51) x.c, e);
            x.l();
            p51.q((p51) x.c);
            p51 j = x.j();
            hey.b[] bVarArr2 = {new bav.a(dc00.class)};
            HashMap hashMap2 = new HashMap();
            for (hey.b bVar2 : bVarArr2) {
                Class<PrimitiveT> cls2 = bVar2.a;
                if (hashMap2.containsKey(cls2)) {
                    throw new IllegalArgumentException(xlg0.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                hashMap2.put(cls2, bVar2);
            }
            if (bVarArr2.length > 0) {
                GenericDeclaration genericDeclaration2 = bVarArr2[0].a;
            }
            Collections.unmodifiableMap(hashMap2);
            aav q = l51Var2.q();
            z9v.b x2 = z9v.x();
            x2.l();
            z9v.q((z9v) x2.c);
            cav r2 = q.r();
            x2.l();
            z9v.r((z9v) x2.c, r2);
            byte[] a2 = ewe0.a(q.q());
            ByteString.g e2 = ByteString.e(0, a2.length, a2);
            x2.l();
            z9v.s((z9v) x2.c, e2);
            z9v j2 = x2.j();
            k51.b w = k51.w();
            w.l();
            k51.r((k51) w.c, j);
            w.l();
            k51.s((k51) w.c, j2);
            w.l();
            k51.q((k51) w.c);
            return w.j();
        }

        @Override // xsna.hey.a
        public final l51 b(ByteString byteString) throws InvalidProtocolBufferException {
            return l51.r(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
        }

        @Override // xsna.hey.a
        public final void c(l51 l51Var) throws GeneralSecurityException {
            l51 l51Var2 = l51Var;
            hey.b[] bVarArr = {new r51(jtw.class)};
            HashMap hashMap = new HashMap();
            for (hey.b bVar : bVarArr) {
                Class<PrimitiveT> cls = bVar.a;
                if (hashMap.containsKey(cls)) {
                    throw new IllegalArgumentException(xlg0.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                hashMap.put(cls, bVar);
            }
            if (bVarArr.length > 0) {
                GenericDeclaration genericDeclaration = bVarArr[0].a;
            }
            Collections.unmodifiableMap(hashMap);
            q51 p = l51Var2.p();
            jjr0.a(p.q());
            t51 r = p.r();
            if (r.q() < 12 || r.q() > 16) {
                throw new GeneralSecurityException("invalid IV size");
            }
            hey.b[] bVarArr2 = {new bav.a(dc00.class)};
            HashMap hashMap2 = new HashMap();
            for (hey.b bVar2 : bVarArr2) {
                Class<PrimitiveT> cls2 = bVar2.a;
                if (hashMap2.containsKey(cls2)) {
                    throw new IllegalArgumentException(xlg0.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                hashMap2.put(cls2, bVar2);
            }
            if (bVarArr2.length > 0) {
                GenericDeclaration genericDeclaration2 = bVarArr2[0].a;
            }
            Collections.unmodifiableMap(hashMap2);
            aav q = l51Var2.q();
            if (q.q() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            bav.g(q.r());
            jjr0.a(l51Var2.p().q());
        }
    }

    @Override // xsna.hey
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // xsna.hey
    public final hey.a<?, k51> c() {
        return new a(this);
    }

    @Override // xsna.hey
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // xsna.hey
    public final k51 e(ByteString byteString) throws InvalidProtocolBufferException {
        return k51.x(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
    }

    @Override // xsna.hey
    public final void f(k51 k51Var) throws GeneralSecurityException {
        k51 k51Var2 = k51Var;
        jjr0.c(k51Var2.v());
        hey.b[] bVarArr = {new r51(jtw.class)};
        HashMap hashMap = new HashMap();
        for (hey.b bVar : bVarArr) {
            Class<PrimitiveT> cls = bVar.a;
            if (hashMap.containsKey(cls)) {
                throw new IllegalArgumentException(xlg0.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            hashMap.put(cls, bVar);
        }
        if (bVarArr.length > 0) {
            GenericDeclaration genericDeclaration = bVarArr[0].a;
        }
        Collections.unmodifiableMap(hashMap);
        s51.g(k51Var2.t());
        hey.b[] bVarArr2 = {new bav.a(dc00.class)};
        HashMap hashMap2 = new HashMap();
        hey.b bVar2 = bVarArr2[0];
        Class<PrimitiveT> cls2 = bVar2.a;
        if (hashMap2.containsKey(cls2)) {
            throw new IllegalArgumentException(xlg0.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap2.put(cls2, bVar2);
        GenericDeclaration genericDeclaration2 = bVarArr2[0].a;
        Collections.unmodifiableMap(hashMap2);
        z9v u = k51Var2.u();
        jjr0.c(u.w());
        if (u.u().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        bav.g(u.v());
    }
}
