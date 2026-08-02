package com.yandex.xplat.common;

import defpackage.cvu0;
import defpackage.d6w;
import defpackage.evu0;
import defpackage.kbs;
import defpackage.lu91;
import defpackage.y6i0;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class c {
    public static final long a(Number number) {
        int byteValue;
        if (number instanceof Long) {
            return number.longValue();
        }
        if (number instanceof Integer) {
            byteValue = number.intValue();
        } else {
            if (!(number instanceof Byte)) {
                throw new Error("Unsupported type in `int64` function: " + number);
            }
            byteValue = number.byteValue();
        }
        return byteValue;
    }

    public static final void b(Object obj) {
        if (obj != null) {
            return;
        }
        kbs.g("Got unexpected null");
    }

    public static final String c(int i, String str) {
        if (str.length() > i) {
            return str;
        }
        int length = i - str.length();
        return d(0, Integer.valueOf(length), i > 1 ? cvu0.u(length + 1, "*") : "*").concat(str);
    }

    public static final String d(int i, Integer num, String str) {
        int length = str.length();
        if (i < 0) {
            i = Math.max(0, i + length);
        }
        if (num != null) {
            int intValue = num.intValue();
            int intValue2 = num.intValue();
            length = intValue >= 0 ? Math.min(intValue2, length) : intValue2 + length;
        }
        if (i >= length) {
            return "";
        }
        d6w n = y6i0.n(i, length);
        return n.isEmpty() ? "" : str.substring(n.a, n.b + 1);
    }

    public static final ArrayList e(String str, String str2) {
        return lu91.b(evu0.W(str, new String[]{str2}, Integer.MAX_VALUE), ExtraKt$split$1.b);
    }

    public static final String f(int i, Integer num, String str) {
        int length = str.length();
        if (i < 0) {
            i = Math.max(i + length, 0);
        }
        int min = Math.min(Math.max(num.intValue(), 0), length - i);
        if (min <= 0) {
            return "";
        }
        d6w n = y6i0.n(i, min + i);
        return n.isEmpty() ? "" : str.substring(n.a, n.b + 1);
    }

    public static final String g(int i, Integer num, String str) {
        int length = str.length();
        int intValue = num.intValue();
        int d = y6i0.d(i, 0, length);
        int d2 = y6i0.d(intValue, 0, length);
        d6w n = y6i0.n(Math.min(d, d2), Math.max(d, d2));
        return n.isEmpty() ? "" : str.substring(n.a, n.b + 1);
    }
}
