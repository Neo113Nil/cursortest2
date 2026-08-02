package xsna;

import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import xsna.bav;
import xsna.hey;

/* compiled from: MacConfig.java */
/* loaded from: classes.dex */
public final class ec00 {
    static {
        hey.b[] bVarArr = {new bav.a(dc00.class)};
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
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        mrf0.f(new bav(z9v.class, new bav.a(dc00.class)), true);
        mrf0.f(new i51(f51.class, new h51(dc00.class)), true);
        mrf0.g(new fc00());
    }
}
