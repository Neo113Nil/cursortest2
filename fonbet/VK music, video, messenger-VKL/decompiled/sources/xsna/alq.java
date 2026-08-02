package xsna;

import java.math.BigInteger;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: FastIntegerMath.java */
/* loaded from: classes12.dex */
public final class alq {
    public static final BigInteger a = BigInteger.valueOf(5);
    public static final BigInteger b = BigInteger.valueOf(10000000000000000L);
    public static final BigInteger c = BigInteger.valueOf(152587890625L);
    public static final BigInteger[] d = {BigInteger.ONE, BigInteger.TEN, BigInteger.valueOf(100), BigInteger.valueOf(1000), BigInteger.valueOf(10000), BigInteger.valueOf(100000), BigInteger.valueOf(1000000), BigInteger.valueOf(10000000), BigInteger.valueOf(100000000), BigInteger.valueOf(1000000000), BigInteger.valueOf(10000000000L), BigInteger.valueOf(100000000000L), BigInteger.valueOf(1000000000000L), BigInteger.valueOf(10000000000000L), BigInteger.valueOf(100000000000000L), BigInteger.valueOf(1000000000000000L)};

    /* compiled from: FastIntegerMath.java */
    public static class a {
        public final long a;

        public a(long j) {
            this.a = j;
        }
    }

    public static BigInteger a(NavigableMap<Integer, BigInteger> navigableMap, int i) {
        BigInteger[] bigIntegerArr = d;
        if (i < bigIntegerArr.length) {
            return bigIntegerArr[i];
        }
        if (navigableMap == null) {
            return a.pow(i).shiftLeft(i);
        }
        Map.Entry<Integer, BigInteger> floorEntry = navigableMap.floorEntry(Integer.valueOf(i));
        Integer key = floorEntry.getKey();
        return key.intValue() == i ? floorEntry.getValue() : x6r.k(floorEntry.getValue(), a(navigableMap, i - key.intValue()));
    }

    public static BigInteger b(TreeMap treeMap, int i) {
        int i2 = i & (-16);
        Map.Entry floorEntry = treeMap.floorEntry(Integer.valueOf(i2));
        int intValue = ((Integer) floorEntry.getKey()).intValue();
        BigInteger bigInteger = (BigInteger) floorEntry.getValue();
        if (intValue == i2) {
            return bigInteger;
        }
        int i3 = i2 - intValue;
        BigInteger bigInteger2 = (BigInteger) treeMap.get(Integer.valueOf(i3));
        if (bigInteger2 == null) {
            bigInteger2 = b(treeMap, i3);
            treeMap.put(Integer.valueOf(i3), bigInteger2);
        }
        return x6r.k(bigInteger, bigInteger2);
    }

    public static void c(TreeMap treeMap, int i, int i2) {
        if (i2 - i <= 18) {
            return;
        }
        int i3 = i2 - ((((i2 - ((i + i2) >>> 1)) + 15) >> 4) << 4);
        int i4 = i2 - i3;
        if (treeMap.containsKey(Integer.valueOf(i4))) {
            return;
        }
        c(treeMap, i, i3);
        c(treeMap, i3, i2);
        treeMap.put(Integer.valueOf(i4), b(treeMap, i4));
    }

    public static a d(long j, long j2) {
        long j3 = j & 4294967295L;
        long j4 = j >>> 32;
        long j5 = j2 & 4294967295L;
        long j6 = j2 >>> 32;
        long j7 = j4 * j6;
        long j8 = j6 * j3;
        return new a(j7 + ((((j4 * j5) + ((j3 * j5) >>> 32)) + (4294967295L & j8)) >>> 32) + (j8 >>> 32));
    }
}
