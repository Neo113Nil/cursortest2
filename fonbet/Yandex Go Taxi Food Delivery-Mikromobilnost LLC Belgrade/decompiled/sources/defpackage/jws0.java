package defpackage;

import androidx.compose.runtime.tooling.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.f;
import androidx.compose.ui.node.s;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public abstract class jws0 {
    public static final f6w a = new f6w(0, 0, 0, 0);
    public static final Regex b = new Regex("^f\\$\\d+$");
    public static final Regex c = new Regex("^\\$([^$]+)$|\\$\\$.*?\\$-([^$]+)\\$\\d+$");

    public static final Field a(Class cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (jl40.l(field.getName(), str)) {
                break;
            }
            i++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    public static final f6w b(n0y n0yVar) {
        LayoutNode layoutNode = (LayoutNode) n0yVar;
        f fVar = (f) layoutNode.a0.d;
        if (!layoutNode.F() || !fVar.d()) {
            return new f6w(0, 0, layoutNode.v(), layoutNode.m());
        }
        long m = fVar.m(0L);
        if ((((9223372034707292159L & m) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return new f6w(0, 0, layoutNode.v(), layoutNode.m());
        }
        long j = fVar.c;
        int b2 = m810.b(Float.intBitsToFloat((int) (m >> 32)));
        int b3 = m810.b(Float.intBitsToFloat((int) (m & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        return new f6w(b2, b3, ((int) (j >> 32)) + b2, ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + b3);
    }

    public static final vc90 c(Field field, Object obj, int i, int i2, int i3, wc90 wc90Var) {
        String substring;
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        boolean z = ((1 << i) & i2) != 0;
        int i4 = (i * 3) + 1;
        int i5 = (i3 & (7 << i4)) >> i4;
        int i6 = i5 & 3;
        boolean z2 = i6 == 3;
        boolean z3 = i6 == 0;
        boolean z4 = (i5 & 4) == 0;
        if (wc90Var == null || (substring = wc90Var.b) == null) {
            substring = field.getName().substring(1);
        }
        return new vc90(substring, obj2, z, z2, z3 && !z, wc90Var != null ? wc90Var.c : null, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList d(ArrayList arrayList, Object obj, List list) {
        boolean z;
        int intValue;
        int intValue2;
        ArrayList arrayList2;
        Iterator it;
        int i;
        Object obj2;
        List x0 = a.x0(arrayList, new hws0());
        int i2 = 0;
        if (!list.isEmpty()) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((wc90) it2.next()).b != null) {
                    }
                }
            }
            z = false;
            List A0 = !z ? a.A0(x0, list.size()) : x0;
            int size = !z ? list.size() : x0.size();
            Field field = (Field) a.S(size, x0);
            Object obj3 = field == null ? field.get(obj) : null;
            Integer num = !(obj3 instanceof Integer) ? (Integer) obj3 : null;
            intValue = num == null ? num.intValue() : 0;
            Field field2 = (Field) a.S(size + 1, x0);
            Object obj4 = field2 == null ? field2.get(obj) : null;
            Integer num2 = !(obj4 instanceof Integer) ? (Integer) obj4 : null;
            intValue2 = num2 == null ? num2.intValue() : 0;
            List list3 = A0;
            arrayList2 = new ArrayList(tcc.n(list3, 10));
            it = list3.iterator();
            while (true) {
                i = i2;
                if (it.hasNext()) {
                    return arrayList2;
                }
                Object next = it.next();
                i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                Field field3 = (Field) next;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    if (((wc90) obj2).a == i) {
                        break;
                    }
                }
                Object obj5 = obj;
                arrayList2.add(c(field3, obj5, i, intValue2, intValue, (wc90) obj2));
                obj = obj5;
            }
        }
        z = true;
        if (!z) {
        }
        if (!z) {
        }
        Field field4 = (Field) a.S(size, x0);
        if (field4 == null) {
        }
        if (!(obj3 instanceof Integer)) {
        }
        if (num == null) {
        }
        Field field22 = (Field) a.S(size + 1, x0);
        if (field22 == null) {
        }
        if (!(obj4 instanceof Integer)) {
        }
        if (num2 == null) {
        }
        List list32 = A0;
        arrayList2 = new ArrayList(tcc.n(list32, 10));
        it = list32.iterator();
        while (true) {
            i = i2;
            if (it.hasNext()) {
            }
            Object obj52 = obj;
            arrayList2.add(c(field3, obj52, i, intValue2, intValue, (wc90) obj2));
            obj = obj52;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [vc90] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Throwable] */
    public static final ArrayList e(ArrayList arrayList, Object obj, List list) {
        String str;
        Field field;
        int i;
        int i2;
        wc90 wc90Var;
        Object obj2;
        String str2;
        Object obj3 = obj;
        Class<?> cls = obj3.getClass();
        Field a2 = a(cls, "$$default");
        String str3 = null;
        Object obj4 = a2 != null ? a2.get(obj3) : null;
        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
        int i3 = 0;
        int intValue = num != null ? num.intValue() : 0;
        Field a3 = a(cls, "$$changed");
        Object obj5 = a3 != null ? a3.get(obj3) : null;
        Integer num2 = obj5 instanceof Integer ? (Integer) obj5 : null;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        List x0 = a.x0(arrayList, new iws0());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                ?? r17 = str3;
                scc.m();
                throw r17;
            }
            wc90 wc90Var2 = (wc90) a.S(i3, list);
            if (wc90Var2 == null) {
                wc90Var2 = new wc90(i3, str3, 6);
            }
            String str4 = wc90Var2.b;
            int i5 = wc90Var2.a;
            if (i5 >= arrayList.size()) {
                i = intValue;
                String str5 = str3;
                str = str5;
                str2 = str5;
            } else {
                if (str4 != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = str3;
                            obj2 = str;
                            break;
                        }
                        obj2 = it.next();
                        str = str3;
                        if (str4.equals(f((Field) obj2))) {
                            break;
                        }
                        str3 = str;
                    }
                    field = (Field) obj2;
                } else {
                    str = str3;
                    field = str;
                }
                if (field == 0) {
                    field = (Field) x0.get(i5);
                }
                if (str4 == null) {
                    wc90Var = new wc90(i5, f(field), wc90Var2.c);
                    int i6 = i3;
                    i = intValue;
                    i2 = i6;
                } else {
                    int i7 = i3;
                    i = intValue;
                    i2 = i7;
                    wc90Var = wc90Var2;
                }
                str2 = c(field, obj3, i2, i, intValue2, wc90Var);
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            obj3 = obj;
            intValue = i;
            i3 = i4;
            str3 = str;
        }
        return arrayList2;
    }

    public static final String f(Field field) {
        t610 a2;
        w610 b2 = c.b(field.getName());
        v610 v610Var = b2 != null ? b2.c : null;
        if (v610Var == null || (a2 = v610Var.a(1)) == null) {
            a2 = v610Var != null ? v610Var.a(2) : null;
        }
        if (a2 != null) {
            return a2.a;
        }
        return null;
    }

    public static final ArrayList g(Field[] fieldArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Field field : fieldArr) {
            String name = field.getName();
            if ((z ? b.h(name) : c.h(name)) && !cvu0.x(name, "$jacoco", false)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0183  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [x1u] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final x1u h(aud audVar, ddt0 ddt0Var) {
        Object obj;
        Object obj2;
        ?? r16;
        List list;
        f6w f6wVar;
        idt0 idt0Var;
        Object obj3;
        Field a2;
        int i;
        Object obj4;
        j390 j390Var;
        Object key = audVar.getKey();
        String a3 = audVar.a();
        ddt0 i2 = a3 != null ? i(a3, ddt0Var) : null;
        Object node = audVar.getNode();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ycc.r(audVar.getData(), arrayList);
        Iterator it = audVar.d().iterator();
        while (it.hasNext()) {
            arrayList2.add(h((aud) it.next(), i2));
        }
        boolean z = node instanceof n0y;
        EmptyList emptyList = EmptyList.a;
        if (z) {
            t300 t300Var = ((LayoutNode) ((n0y) node)).a0;
            v7x0 v7x0Var = (v7x0) t300Var.f;
            wz40 wz40Var = (wz40) t300Var.h;
            if (wz40Var == null) {
                obj = key;
                obj2 = node;
                list = emptyList;
                r16 = 0;
            } else {
                wz40 wz40Var2 = new wz40(new g530[wz40Var.c]);
                e530 e530Var = (e530) t300Var.g;
                int i3 = 0;
                while (e530Var != null && e530Var != v7x0Var) {
                    s coordinator$ui = e530Var.getCoordinator$ui();
                    if (coordinator$ui == null) {
                        ny61.g("getModifierInfo called on node with no coordinator");
                        return null;
                    }
                    j390 j390Var2 = coordinator$ui.h0;
                    Object obj5 = key;
                    j390 j390Var3 = ((f) t300Var.d).h0;
                    e530 child$ui = e530Var.getChild$ui();
                    if (child$ui == v7x0Var) {
                        obj4 = node;
                        if (e530Var.getCoordinator$ui() != child$ui.getCoordinator$ui()) {
                            j390Var = j390Var3;
                            if (j390Var2 != null) {
                                j390Var2 = j390Var;
                            }
                            wz40Var2.b(new g530((f530) wz40Var.a[i3], coordinator$ui, j390Var2));
                            e530Var = e530Var.getChild$ui();
                            key = obj5;
                            i3++;
                            node = obj4;
                        }
                    } else {
                        obj4 = node;
                    }
                    j390Var = null;
                    if (j390Var2 != null) {
                    }
                    wz40Var2.b(new g530((f530) wz40Var.a[i3], coordinator$ui, j390Var2));
                    e530Var = e530Var.getChild$ui();
                    key = obj5;
                    i3++;
                    node = obj4;
                }
                obj = key;
                obj2 = node;
                r16 = 0;
                list = wz40Var2.f();
            }
        } else {
            obj = key;
            obj2 = node;
            r16 = 0;
            list = emptyList;
        }
        if (z) {
            f6wVar = b((n0y) obj2);
        } else if (arrayList2.isEmpty()) {
            f6wVar = a;
        } else {
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((x1u) it2.next()).e);
            }
            Iterator it3 = arrayList3.iterator();
            if (!it3.hasNext()) {
                w511.x("Empty collection can't be reduced.");
                return r16;
            }
            Object next = it3.next();
            while (it3.hasNext()) {
                next = j((f6w) it3.next(), (f6w) next);
            }
            f6wVar = (f6w) next;
        }
        if (i2 != null && i2.g && ddt0Var != null) {
            int i4 = ddt0Var.h;
            List list2 = ddt0Var.d;
            if (i4 >= list2.size() && (i = ddt0Var.e) >= 0) {
                ddt0Var.h = i;
            }
            if (ddt0Var.h < list2.size()) {
                int i5 = ddt0Var.h;
                ddt0Var.h = i5 + 1;
                edz edzVar = (edz) list2.get(i5);
                idt0Var = new idt0(edzVar.a, edzVar.b, edzVar.c, ddt0Var.c, ddt0Var.b);
                if (obj2 == null) {
                    return new be60(obj, obj2, f6wVar, arrayList, list, arrayList2);
                }
                Object obj6 = obj;
                String str = i2 != null ? i2.a : r16;
                String str2 = i2 != null ? i2.a : r16;
                Object b2 = (str2 == null || str2.length() == 0 || (f6wVar.d - f6wVar.b <= 0 && f6wVar.c - f6wVar.a <= 0)) ? r16 : audVar.b();
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj3 = r16;
                        break;
                    }
                    obj3 = it4.next();
                    if (obj3 != null && cvu0.s(obj3.getClass().getName(), ".RecomposeScopeImpl", false)) {
                        break;
                    }
                }
                if (obj3 != null && (a2 = a(obj3.getClass(), "block")) != null) {
                    Object obj7 = a2.get(obj3);
                    EmptyList emptyList2 = r16;
                    if (obj7 != null) {
                        if (i2 != null) {
                            emptyList2 = i2.f;
                        }
                        if (emptyList2 != null) {
                            emptyList = emptyList2;
                        }
                        Class<?> cls = obj7.getClass();
                        try {
                            ArrayList g = g(cls.getDeclaredFields(), true);
                            if (g.isEmpty()) {
                                e(g(cls.getDeclaredFields(), false), obj7, emptyList);
                            } else {
                                d(g, obj7, emptyList);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                return new ph7(obj6, str, idt0Var, b2, f6wVar, arrayList, arrayList2);
            }
        }
        idt0Var = r16;
        if (obj2 == null) {
        }
    }

    public static final ddt0 i(String str, ddt0 ddt0Var) {
        int i;
        zf0 a2 = b.a(str);
        Integer num = null;
        if (a2 == null) {
            return null;
        }
        String str2 = (String) a2.c;
        String str3 = (String) a2.d;
        String str4 = str3 == null ? ddt0Var != null ? ddt0Var.b : null : str3;
        if (str3 != null) {
            String str5 = (String) a2.f;
            if (str5 != null) {
                num = bvu0.l(36, str5);
            }
        } else if (ddt0Var != null) {
            num = Integer.valueOf(ddt0Var.c);
        }
        int intValue = num != null ? num.intValue() : -1;
        List list = (List) a2.g;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((edz) it.next()).d) {
                i = i2;
                break;
            }
            i2++;
        }
        return new ddt0(str2, str4, intValue, list, i, (List) a2.e, a2.a, a2.b);
    }

    public static final f6w j(f6w f6wVar, f6w f6wVar2) {
        f6w f6wVar3 = a;
        if (jl40.l(f6wVar, f6wVar3)) {
            return f6wVar2;
        }
        if (jl40.l(f6wVar2, f6wVar3)) {
            return f6wVar;
        }
        return new f6w(Math.min(f6wVar.a, f6wVar2.a), Math.min(f6wVar.b, f6wVar2.b), Math.max(f6wVar.c, f6wVar2.c), Math.max(f6wVar.d, f6wVar2.d));
    }
}
