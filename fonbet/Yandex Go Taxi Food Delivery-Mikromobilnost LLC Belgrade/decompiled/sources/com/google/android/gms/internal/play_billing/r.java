package com.google.android.gms.internal.play_billing;

import defpackage.g8e;
import defpackage.kxa1;
import defpackage.pia1;
import defpackage.q7a1;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public abstract class r {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, HexString.CHAR_SPACE);
    }

    public static String a(p pVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(pVar, sb, 0);
        return sb.toString();
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(sb, i);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(kxa1.e(new zzgi(((String) obj).getBytes(q7a1.a))));
            sb.append(OpenList.CHAR_QUOTE);
            return;
        }
        if (obj instanceof zzgk) {
            sb.append(": \"");
            sb.append(kxa1.e((zzgk) obj));
            sb.append(OpenList.CHAR_QUOTE);
            return;
        }
        if (obj instanceof p) {
            sb.append(" {");
            d((p) obj, sb, i + 2);
            sb.append("\n");
            c(sb, i);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(Extension.COLON_SPACE);
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb, i3, "key", entry.getKey());
        b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        c(sb, i);
        sb.append("}");
    }

    public static void c(StringBuilder sb, int i) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void d(p pVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = pVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    b(sb, i, substring.substring(0, substring.length() - 4), p.l(method2, pVar, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i, substring.substring(0, substring.length() - 3), p.l(method, pVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object l = p.l(method4, pVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) p.l(method5, pVar, new Object[0])).booleanValue()) {
                        }
                        b(sb, i, substring, l);
                    } else if (l instanceof Boolean) {
                        if (!((Boolean) l).booleanValue()) {
                        }
                        b(sb, i, substring, l);
                    } else if (l instanceof Integer) {
                        if (((Integer) l).intValue() == 0) {
                        }
                        b(sb, i, substring, l);
                    } else if (l instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) l).floatValue()) == 0) {
                        }
                        b(sb, i, substring, l);
                    } else if (l instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) l).doubleValue()) == 0) {
                        }
                        b(sb, i, substring, l);
                    } else {
                        if (l instanceof String) {
                            equals = l.equals("");
                        } else if (l instanceof zzgk) {
                            equals = l.equals(zzgk.a);
                        } else if (l instanceof m) {
                            if (l == ((p) ((p) ((m) l)).g(6))) {
                            }
                            b(sb, i, substring, l);
                        } else {
                            if ((l instanceof Enum) && ((Enum) l).ordinal() == 0) {
                            }
                            b(sb, i, substring, l);
                        }
                        if (equals) {
                        }
                        b(sb, i, substring, l);
                    }
                }
            }
            i2 = i3;
        }
        if (pVar instanceof o) {
            Iterator c = ((o) pVar).zzb.c();
            if (c.hasNext()) {
                throw g8e.j((Map.Entry) c.next());
            }
        }
        pia1 pia1Var = pVar.zzc;
        if (pia1Var != null) {
            for (int i5 = 0; i5 < pia1Var.a; i5++) {
                b(sb, i, String.valueOf(pia1Var.b[i5] >>> 3), pia1Var.c[i5]);
            }
        }
    }
}
