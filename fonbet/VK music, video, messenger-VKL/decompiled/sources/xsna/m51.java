package xsna;

import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.bav;
import xsna.hey;

/* compiled from: AesCtrHmacAeadKeyManager.java */
/* loaded from: classes.dex */
public final class m51 extends hey.b<b51, k51> {
    @Override // xsna.hey.b
    public final Object a(ka20 ka20Var) throws GeneralSecurityException {
        k51 k51Var = (k51) ka20Var;
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
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        p51 t = k51Var.t();
        hey.b bVar2 = (hey.b) unmodifiableMap.get(jtw.class);
        if (bVar2 == null) {
            throw new IllegalArgumentException("Requested primitive class " + jtw.class.getCanonicalName() + " not supported.");
        }
        jtw jtwVar = (jtw) bVar2.a(t);
        hey.b[] bVarArr2 = {new bav.a(dc00.class)};
        HashMap hashMap2 = new HashMap();
        for (hey.b bVar3 : bVarArr2) {
            Class<PrimitiveT> cls2 = bVar3.a;
            if (hashMap2.containsKey(cls2)) {
                throw new IllegalArgumentException(xlg0.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            hashMap2.put(cls2, bVar3);
        }
        if (bVarArr2.length > 0) {
            GenericDeclaration genericDeclaration2 = bVarArr2[0].a;
        }
        Map unmodifiableMap2 = Collections.unmodifiableMap(hashMap2);
        z9v u = k51Var.u();
        hey.b bVar4 = (hey.b) unmodifiableMap2.get(dc00.class);
        if (bVar4 != null) {
            return new jjp(jtwVar, (dc00) bVar4.a(u), k51Var.u().v().r());
        }
        throw new IllegalArgumentException("Requested primitive class " + dc00.class.getCanonicalName() + " not supported.");
    }
}
