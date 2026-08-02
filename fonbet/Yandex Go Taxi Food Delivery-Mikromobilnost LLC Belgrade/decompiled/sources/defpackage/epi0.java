package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter$FilterResult;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class epi0 implements ol11 {
    public final tis0 a;
    public final uxq b;
    public final dko c;
    public final ubx w;
    public final List x;

    public epi0(tis0 tis0Var, uxq uxqVar, dko dkoVar, ubx ubxVar, List list) {
        this.a = tis0Var;
        this.b = uxqVar;
        this.c = dkoVar;
        this.w = ubxVar;
        this.x = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!toi0.a.a(obj, accessibleObject)) {
            throw new JsonIOException(xoi0.d(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + xoi0.c(field) + " and " + xoi0.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00eb  */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cpi0 c(u3u u3uVar, TypeToken typeToken, Class cls, boolean z, boolean z2) {
        boolean z3;
        Method method;
        ysq0 ysq0Var;
        List asList;
        String str;
        boolean z4;
        ArrayList<String> arrayList;
        String str2;
        JsonAdapter jsonAdapter;
        u3u u3uVar2;
        int i;
        Field field;
        nl11 nl11Var;
        int i2;
        Field field2;
        zoi0 zoi0Var;
        if (cls.isInterface()) {
            return cpi0.c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TypeToken typeToken2 = typeToken;
        boolean z5 = z;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            boolean z6 = true;
            if (cls2 != cls && declaredFields.length > 0) {
                ReflectionAccessFilter$FilterResult a = hia1.a(this.x);
                if (a == ReflectionAccessFilter$FilterResult.BLOCK_ALL) {
                    throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls2 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z5 = a == ReflectionAccessFilter$FilterResult.BLOCK_INACCESSIBLE;
            }
            boolean z7 = z5;
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                Field field3 = declaredFields[i3];
                boolean d = d(field3, z6);
                boolean d2 = d(field3, false);
                if (d || d2) {
                    if (!z2) {
                        z3 = d2;
                    } else if (Modifier.isStatic(field3.getModifiers())) {
                        z3 = false;
                    } else {
                        Method c = xoi0.a.c(cls2, field3);
                        if (!z7) {
                            xoi0.f(c);
                        }
                        if (c.getAnnotation(ysq0.class) != null && field3.getAnnotation(ysq0.class) == null) {
                            throw new JsonIOException(oyr.p("@SerializedName on ", xoi0.d(c, false), " is not supported"));
                        }
                        z3 = d2;
                        method = c;
                        if (!z7 && method == null) {
                            xoi0.f(field3);
                        }
                        Type o = si91.o(typeToken2.getType(), cls2, field3.getGenericType(), new HashMap());
                        ysq0Var = (ysq0) field3.getAnnotation(ysq0.class);
                        if (ysq0Var != null) {
                            str = this.b.a(field3);
                            asList = Collections.EMPTY_LIST;
                        } else {
                            String value = ysq0Var.value();
                            asList = Arrays.asList(ysq0Var.alternate());
                            str = value;
                        }
                        if (asList.isEmpty()) {
                            z4 = z6;
                            ArrayList arrayList2 = new ArrayList(asList.size() + 1);
                            arrayList2.add(str);
                            arrayList2.addAll(asList);
                            arrayList = arrayList2;
                        } else {
                            z4 = z6;
                            arrayList = Collections.singletonList(str);
                        }
                        str2 = (String) arrayList.get(0);
                        TypeToken<?> typeToken3 = TypeToken.get(o);
                        Class<? super Object> rawType = typeToken3.getRawType();
                        boolean z8 = (rawType == null && rawType.isPrimitive()) ? z4 : false;
                        int modifiers = field3.getModifiers();
                        boolean z9 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? false : z4;
                        jsonAdapter = (JsonAdapter) field3.getAnnotation(JsonAdapter.class);
                        if (jsonAdapter == null) {
                            field = field3;
                            i = i3;
                            u3uVar2 = u3uVar;
                            nl11Var = this.w.a(this.a, u3uVar2, typeToken3, jsonAdapter, false);
                        } else {
                            u3uVar2 = u3uVar;
                            i = i3;
                            field = field3;
                            nl11Var = null;
                        }
                        boolean z10 = nl11Var == null ? z4 : false;
                        if (nl11Var == null) {
                            nl11Var = u3uVar2.e(typeToken3);
                        }
                        nl11 h7xVar = d ? nl11Var : z10 ? nl11Var : new h7x(u3uVar2, nl11Var, typeToken3.getType());
                        i2 = length;
                        zoi0 zoi0Var2 = new zoi0(str2, field, z7, method, h7xVar, nl11Var, z8, z9);
                        field2 = field;
                        if (z3) {
                            for (String str3 : arrayList) {
                                zoi0 zoi0Var3 = (zoi0) linkedHashMap.put(str3, zoi0Var2);
                                if (zoi0Var3 != null) {
                                    b(cls, str3, zoi0Var3.b, field2);
                                    throw null;
                                }
                            }
                        }
                        if (d && (zoi0Var = (zoi0) linkedHashMap2.put(str2, zoi0Var2)) != null) {
                            b(cls, str2, zoi0Var.b, field2);
                            throw null;
                        }
                    }
                    method = null;
                    if (!z7) {
                        xoi0.f(field3);
                    }
                    Type o2 = si91.o(typeToken2.getType(), cls2, field3.getGenericType(), new HashMap());
                    ysq0Var = (ysq0) field3.getAnnotation(ysq0.class);
                    if (ysq0Var != null) {
                    }
                    if (asList.isEmpty()) {
                    }
                    str2 = (String) arrayList.get(0);
                    TypeToken<?> typeToken32 = TypeToken.get(o2);
                    Class<? super Object> rawType2 = typeToken32.getRawType();
                    if (rawType2 == null) {
                    }
                    int modifiers2 = field3.getModifiers();
                    if (Modifier.isStatic(modifiers2)) {
                    }
                    jsonAdapter = (JsonAdapter) field3.getAnnotation(JsonAdapter.class);
                    if (jsonAdapter == null) {
                    }
                    if (nl11Var == null) {
                    }
                    if (nl11Var == null) {
                    }
                    if (d) {
                    }
                    i2 = length;
                    zoi0 zoi0Var22 = new zoi0(str2, field, z7, method, h7xVar, nl11Var, z8, z9);
                    field2 = field;
                    if (z3) {
                    }
                    if (d) {
                        b(cls, str2, zoi0Var.b, field2);
                        throw null;
                    }
                    continue;
                } else {
                    i = i3;
                    z4 = z6;
                    i2 = length;
                }
                i3 = i + 1;
                z6 = z4;
                length = i2;
            }
            typeToken2 = TypeToken.get(si91.o(typeToken2.getType(), cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = typeToken2.getRawType();
            z5 = z7;
        }
        return new cpi0(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    @Override // defpackage.ol11
    public final nl11 create(u3u u3uVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        lia1 lia1Var = xoi0.a;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new yoi0();
        }
        ReflectionAccessFilter$FilterResult a = hia1.a(this.x);
        if (a == ReflectionAccessFilter$FilterResult.BLOCK_ALL) {
            throw new JsonIOException(qv10.m(rawType, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z = a == ReflectionAccessFilter$FilterResult.BLOCK_INACCESSIBLE;
        return xoi0.a.h(rawType) ? new dpi0(rawType, c(u3uVar, typeToken, rawType, z, true), z) : new bpi0(this.a.J(typeToken, true), c(u3uVar, typeToken, rawType, z, false));
    }

    public final boolean d(Field field, boolean z) {
        boolean z2;
        dko dkoVar = this.c;
        dkoVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || dkoVar.a(z, field.getType())) {
            z2 = true;
        } else {
            List list = z ? dkoVar.a : dkoVar.b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw unr0.i(it);
                }
            }
            z2 = false;
        }
        return !z2;
    }
}
