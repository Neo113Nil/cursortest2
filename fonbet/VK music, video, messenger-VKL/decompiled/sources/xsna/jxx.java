package xsna;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: JavaBigIntegerFromCharSequence.java */
/* loaded from: classes12.dex */
public final class jxx extends bg {
    public static BigInteger c(CharSequence charSequence, int i, int i2, boolean z) {
        int i3 = i2 - i;
        if (i3 <= 18) {
            int i4 = (i3 & 7) + i;
            long D = gcd0.D(i, i4, charSequence);
            boolean z2 = D >= 0;
            while (i4 < i2) {
                int B = gcd0.B(i4, charSequence);
                z2 &= B >= 0;
                D = (D * 100000000) + B;
                i4 += 8;
            }
            if (!z2) {
                throw new NumberFormatException("illegal syntax");
            }
            if (z) {
                D = -D;
            }
            return BigInteger.valueOf(D);
        }
        while (i < i2 && charSequence.charAt(i) == '0') {
            i++;
        }
        if (i2 - i > 646456993) {
            throw new NumberFormatException("value exceeds limits");
        }
        BigInteger bigInteger = alq.a;
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.valueOf(5L));
        treeMap.put(16, alq.c);
        alq.c(treeMap, i, i2);
        for (Map.Entry entry : treeMap.entrySet()) {
            entry.setValue(((BigInteger) entry.getValue()).shiftLeft(((Integer) entry.getKey()).intValue()));
        }
        BigInteger r = hpt0.r(charSequence, i, i2, treeMap);
        return z ? r.negate() : r;
    }
}
