package com.objsys.asn1j.runtime;

import java.io.IOException;

/* loaded from: classes11.dex */
public class Asn1XmlUtil {
    public static void encodeReal(Asn1XerEncoder asn1XerEncoder, double d, String str, String str2) throws IOException, Asn1Exception {
        asn1XerEncoder.encodeStartElement(str, str2);
        if (isMinusZero(d)) {
            asn1XerEncoder.copy("-0");
        } else if (isNaN(d)) {
            asn1XerEncoder.encodeNamedValueElement("NaN");
        } else if (d == Double.NEGATIVE_INFINITY) {
            asn1XerEncoder.encodeNamedValueElement("-INF");
        } else if (d == Double.POSITIVE_INFINITY) {
            asn1XerEncoder.encodeNamedValueElement("INF");
        } else if (d == 0.0d) {
            asn1XerEncoder.copy("0");
        } else {
            asn1XerEncoder.copy(Asn1XerUtil.normalizedRealValueToString(d, false));
        }
        asn1XerEncoder.encodeEndElement(str);
    }

    public static double getMinusZero() {
        return Double.longBitsToDouble(Long.MIN_VALUE);
    }

    public static boolean isMinusZero(double d) {
        return Math.abs(d) == 0.0d && Double.doubleToLongBits(d) == Long.MIN_VALUE;
    }

    public static boolean isNaN(double d) {
        return Double.doubleToLongBits(d) == 9221120237041090560L;
    }
}
