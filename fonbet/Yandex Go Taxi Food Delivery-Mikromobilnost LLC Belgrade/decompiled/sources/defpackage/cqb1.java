package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public abstract class cqb1 {
    public static final int a(int i, List list) {
        int i2;
        int i3 = ((cc90) a.Z(list)).c;
        if (i > ((cc90) a.Z(list)).c) {
            jxv.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            cc90 cc90Var = (cc90) list.get(i2);
            char c = cc90Var.b > i ? (char) 1 : cc90Var.c <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder t = b64.t(i2, "Found paragraph index ", " should be in range [0, ");
        t.append(list.size());
        t.append(").\nDebug info: index=");
        t.append(i);
        t.append(", paragraphs=[");
        t.append(rty.a(31, new ej40(3), null, list));
        t.append(']');
        jxv.a(t.toString());
        return i2;
    }

    public static final int b(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            cc90 cc90Var = (cc90) list.get(i3);
            char c = cc90Var.d > i ? (char) 1 : cc90Var.e <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int c(ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((cc90) a.Z(arrayList)).g) {
            return scc.f(arrayList);
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            cc90 cc90Var = (cc90) arrayList.get(i2);
            char c = cc90Var.f > f ? (char) 1 : cc90Var.g <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void d(ArrayList arrayList, long j, tls tlsVar) {
        int size = arrayList.size();
        for (int a = a(asy0.f(j), arrayList); a < size; a++) {
            cc90 cc90Var = (cc90) arrayList.get(a);
            if (cc90Var.b >= asy0.e(j)) {
                return;
            }
            if (cc90Var.b != cc90Var.c) {
                tlsVar.invoke(cc90Var);
            }
        }
    }

    public static String e(String str) {
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                char charAt = str.charAt(!z ? i : length);
                boolean z2 = (Character.isDigit(charAt) || charAt == '+') ? false : true;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String obj = str.subSequence(i, length + 1).toString();
            if (obj.length() >= 10 && (cvu0.x(obj, "+", false) || Character.isDigit(obj.charAt(0)))) {
                return str;
            }
        }
        return null;
    }
}
