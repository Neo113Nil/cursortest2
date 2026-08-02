package com.yandex.passport.common.time;

/* loaded from: classes11.dex */
public final class b {
    public final Object a;
    public int b = 1;

    public b(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        Object obj2 = this.a;
        Class<?> cls = obj2.getClass();
        b bVar = (b) obj;
        Object obj3 = bVar.a;
        if (cls.equals(obj3.getClass()) && this.b == bVar.b) {
            return obj2 instanceof StringBuilder ? ((StringBuilder) obj2).toString().equals(obj3.toString()) : obj2 instanceof Number ? obj2.equals(obj3) : obj2 == obj3;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str;
        String obj = this.a.toString();
        int i = this.b;
        if (obj == null) {
            return null;
        }
        if (i > 0) {
            int length = obj.length();
            if (i == 1 || length == 0) {
                return obj;
            }
            if (length != 1 || i > 8192) {
                int i2 = length * i;
                if (length != 1) {
                    if (length != 2) {
                        StringBuilder sb = new StringBuilder(i2);
                        for (int i3 = 0; i3 < i; i3++) {
                            sb.append(obj);
                        }
                        return sb.toString();
                    }
                    char charAt = obj.charAt(0);
                    char charAt2 = obj.charAt(1);
                    char[] cArr = new char[i2];
                    for (int i4 = (i * 2) - 2; i4 >= 0; i4 -= 2) {
                        cArr[i4] = charAt;
                        cArr[i4 + 1] = charAt2;
                    }
                    return new String(cArr);
                }
                char charAt3 = obj.charAt(0);
                if (i > 0) {
                    char[] cArr2 = new char[i];
                    for (int i5 = i - 1; -1 < i5; i5--) {
                        cArr2[i5] = charAt3;
                    }
                    str = new String(cArr2);
                    return str;
                }
            } else {
                char charAt4 = obj.charAt(0);
                if (i > 0) {
                    char[] cArr3 = new char[i];
                    for (int i6 = i - 1; -1 < i6; i6--) {
                        cArr3[i6] = charAt4;
                    }
                    str = new String(cArr3);
                    return str;
                }
            }
        }
        return " ";
    }
}
