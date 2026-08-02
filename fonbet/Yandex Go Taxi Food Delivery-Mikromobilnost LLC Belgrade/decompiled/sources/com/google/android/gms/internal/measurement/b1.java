package com.google.android.gms.internal.measurement;

import defpackage.dya1;
import defpackage.f1b1;
import defpackage.g8e;
import defpackage.i9b1;
import defpackage.p5b1;
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
public abstract class b1 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, HexString.CHAR_SPACE);
    }

    public static String a(a1 a1Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(a1Var, sb, 0);
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
        d(sb, i);
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
            zzlh zzlhVar = zzlh.a;
            sb.append(dya1.g(new zzlg(((String) obj).getBytes(f1b1.a))));
            sb.append(OpenList.CHAR_QUOTE);
            return;
        }
        if (obj instanceof zzlh) {
            sb.append(": \"");
            sb.append(dya1.g((zzlh) obj));
            sb.append(OpenList.CHAR_QUOTE);
            return;
        }
        if (obj instanceof a1) {
            sb.append(" {");
            c((a1) obj, sb, i + 2);
            sb.append("\n");
            d(sb, i);
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
        d(sb, i);
        sb.append("}");
    }

    public static void c(a1 a1Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = a1Var.getClass().getDeclaredMethods();
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
                    b(sb, i, substring.substring(0, substring.length() - 4), a1.p(method2, a1Var, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i, substring.substring(0, substring.length() - 3), a1.p(method, a1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object p = a1.p(method4, a1Var, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) a1.p(method5, a1Var, new Object[0])).booleanValue()) {
                        }
                        b(sb, i, substring, p);
                    } else if (p instanceof Boolean) {
                        if (!((Boolean) p).booleanValue()) {
                        }
                        b(sb, i, substring, p);
                    } else if (p instanceof Integer) {
                        if (((Integer) p).intValue() == 0) {
                        }
                        b(sb, i, substring, p);
                    } else if (p instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) p).floatValue()) == 0) {
                        }
                        b(sb, i, substring, p);
                    } else if (p instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) p).doubleValue()) == 0) {
                        }
                        b(sb, i, substring, p);
                    } else {
                        if (p instanceof String) {
                            equals = p.equals("");
                        } else if (p instanceof zzlh) {
                            equals = p.equals(zzlh.a);
                        } else if (p instanceof p5b1) {
                            if (p == ((a1) ((a1) ((p5b1) p)).q(6))) {
                            }
                            b(sb, i, substring, p);
                        } else {
                            if ((p instanceof Enum) && ((Enum) p).ordinal() == 0) {
                            }
                            b(sb, i, substring, p);
                        }
                        if (equals) {
                        }
                        b(sb, i, substring, p);
                    }
                }
            }
            i2 = i3;
        }
        if (a1Var instanceof z0) {
            Iterator c = ((z0) a1Var).zzb.c();
            if (c.hasNext()) {
                throw g8e.j((Map.Entry) c.next());
            }
        }
        i9b1 i9b1Var = a1Var.zzc;
        if (i9b1Var != null) {
            for (int i5 = 0; i5 < i9b1Var.a; i5++) {
                b(sb, i, String.valueOf(i9b1Var.b[i5] >>> 3), i9b1Var.c[i5]);
            }
        }
    }

    public static void d(StringBuilder sb, int i) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }
}
