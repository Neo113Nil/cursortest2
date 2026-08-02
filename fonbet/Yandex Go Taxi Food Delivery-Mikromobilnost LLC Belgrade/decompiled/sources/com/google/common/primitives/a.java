package com.google.common.primitives;

import defpackage.joz;
import defpackage.ny61;
import defpackage.shb1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class a {
    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new Ints$IntArrayAsList(iArr, 0, iArr.length);
    }

    public static int b(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        ny61.g(shb1.c("Out of range: %s", Long.valueOf(j)));
        return 0;
    }

    public static int c(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int d(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] e(Collection collection) {
        if (collection instanceof Ints$IntArrayAsList) {
            Ints$IntArrayAsList ints$IntArrayAsList = (Ints$IntArrayAsList) collection;
            return Arrays.copyOfRange(ints$IntArrayAsList.array, ints$IntArrayAsList.start, ints$IntArrayAsList.end);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static Integer f(String str) {
        byte b;
        Long valueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    b = joz.a[charAt];
                } else {
                    byte[] bArr = joz.a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt2 = str.charAt(i2);
                            if (charAt2 < 128) {
                                b2 = joz.a[charAt2];
                            } else {
                                byte[] bArr2 = joz.a;
                                b2 = -1;
                            }
                            if (b2 < 0 || b2 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = b2;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i2 = i3;
                        } else if (i != 0) {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }
}
