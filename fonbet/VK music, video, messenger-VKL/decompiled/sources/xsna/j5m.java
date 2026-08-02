package xsna;

import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import xsna.hey;

/* compiled from: DeterministicAeadConfig.java */
/* loaded from: classes.dex */
public final class j5m {
    public static final /* synthetic */ int a = 0;

    static {
        hey.b[] bVarArr = {new q61(i5m.class)};
        HashMap hashMap = new HashMap();
        hey.b bVar = bVarArr[0];
        Class<PrimitiveT> cls = bVar.a;
        if (hashMap.containsKey(cls)) {
            throw new IllegalArgumentException(xlg0.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap.put(cls, bVar);
        GenericDeclaration genericDeclaration = bVarArr[0].a;
        Collections.unmodifiableMap(hashMap);
        int i = nrf0.CONFIG_NAME_FIELD_NUMBER;
        try {
            mrf0.f(new r61(o61.class, new q61(i5m.class)), true);
            mrf0.g(new k5m());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
