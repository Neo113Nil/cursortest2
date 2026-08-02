package xsna;

import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import xsna.hey;

/* compiled from: AeadConfig.java */
/* loaded from: classes.dex */
public final class c51 {
    static {
        hey.b[] bVarArr = {new m51(b51.class)};
        HashMap hashMap = new HashMap();
        hey.b bVar = bVarArr[0];
        Class<PrimitiveT> cls = bVar.a;
        if (hashMap.containsKey(cls)) {
            throw new IllegalArgumentException(xlg0.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap.put(cls, bVar);
        GenericDeclaration genericDeclaration = bVarArr[0].a;
        Collections.unmodifiableMap(hashMap);
        hey.b[] bVarArr2 = {new g61(b51.class)};
        HashMap hashMap2 = new HashMap();
        hey.b bVar2 = bVarArr2[0];
        Class<PrimitiveT> cls2 = bVar2.a;
        if (hashMap2.containsKey(cls2)) {
            throw new IllegalArgumentException(xlg0.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap2.put(cls2, bVar2);
        GenericDeclaration genericDeclaration2 = bVarArr2[0].a;
        Collections.unmodifiableMap(hashMap2);
        hey.b[] bVarArr3 = {new l61(b51.class)};
        HashMap hashMap3 = new HashMap();
        hey.b bVar3 = bVarArr3[0];
        Class<PrimitiveT> cls3 = bVar3.a;
        if (hashMap3.containsKey(cls3)) {
            throw new IllegalArgumentException(xlg0.a(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap3.put(cls3, bVar3);
        GenericDeclaration genericDeclaration3 = bVarArr3[0].a;
        Collections.unmodifiableMap(hashMap3);
        hey.b[] bVarArr4 = {new x51(b51.class)};
        HashMap hashMap4 = new HashMap();
        hey.b bVar4 = bVarArr4[0];
        Class<PrimitiveT> cls4 = bVar4.a;
        if (hashMap4.containsKey(cls4)) {
            throw new IllegalArgumentException(xlg0.a(cls4, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap4.put(cls4, bVar4);
        GenericDeclaration genericDeclaration4 = bVarArr4[0].a;
        Collections.unmodifiableMap(hashMap4);
        hey.b[] bVarArr5 = {new ajy(b51.class)};
        HashMap hashMap5 = new HashMap();
        hey.b bVar5 = bVarArr5[0];
        Class<PrimitiveT> cls5 = bVar5.a;
        if (hashMap5.containsKey(cls5)) {
            throw new IllegalArgumentException(xlg0.a(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap5.put(cls5, bVar5);
        GenericDeclaration genericDeclaration5 = bVarArr5[0].a;
        Collections.unmodifiableMap(hashMap5);
        hey.b[] bVarArr6 = {new hjy(b51.class)};
        HashMap hashMap6 = new HashMap();
        hey.b bVar6 = bVarArr6[0];
        Class<PrimitiveT> cls6 = bVar6.a;
        if (hashMap6.containsKey(cls6)) {
            throw new IllegalArgumentException(xlg0.a(cls6, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap6.put(cls6, bVar6);
        GenericDeclaration genericDeclaration6 = bVarArr6[0].a;
        Collections.unmodifiableMap(hashMap6);
        hey.b[] bVarArr7 = {new xqa(b51.class)};
        HashMap hashMap7 = new HashMap();
        hey.b bVar7 = bVarArr7[0];
        Class<PrimitiveT> cls7 = bVar7.a;
        if (hashMap7.containsKey(cls7)) {
            throw new IllegalArgumentException(xlg0.a(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap7.put(cls7, bVar7);
        GenericDeclaration genericDeclaration7 = bVarArr7[0].a;
        Collections.unmodifiableMap(hashMap7);
        hey.b[] bVarArr8 = {new y3y0(b51.class)};
        HashMap hashMap8 = new HashMap();
        hey.b bVar8 = bVarArr8[0];
        Class<PrimitiveT> cls8 = bVar8.a;
        if (hashMap8.containsKey(cls8)) {
            throw new IllegalArgumentException(xlg0.a(cls8, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap8.put(cls8, bVar8);
        GenericDeclaration genericDeclaration8 = bVarArr8[0].a;
        Collections.unmodifiableMap(hashMap8);
        int i = nrf0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        ec00.a();
        mrf0.f(new n51(k51.class, new m51(b51.class)), true);
        mrf0.f(new y51(v51.class, new x51(b51.class)), true);
        mrf0.f(new h61(e61.class, new g61(b51.class)), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            mrf0.f(new m61(j61.class, new l61(b51.class)), true);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        mrf0.f(new yqa(vqa.class, new xqa(b51.class)), true);
        mrf0.f(new bjy(yiy.class, new ajy(b51.class)), true);
        mrf0.f(new ijy(fjy.class, new hjy(b51.class)), true);
        mrf0.f(new z3y0(w3y0.class, new y3y0(b51.class)), true);
        mrf0.g(new d51());
    }
}
