package com.objsys.asn1j.runtime;

import java.io.IOException;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes11.dex */
public class Asn1XerUtil {
    private static final double M_LG2 = 0.3010299956639812d;

    public static void encodeReal(Asn1XerEncoder asn1XerEncoder, double d, String str) throws IOException, Asn1Exception {
        if (str != null) {
            asn1XerEncoder.encodeStartElement(str);
        }
        if (d == 0.0d) {
            asn1XerEncoder.copy("0");
        } else if (d == Double.NEGATIVE_INFINITY) {
            asn1XerEncoder.encodeNamedValueElement("MINUS-INFINITY");
        } else if (d == Double.POSITIVE_INFINITY) {
            asn1XerEncoder.encodeNamedValueElement("PLUS-INFINITY");
        } else {
            asn1XerEncoder.copy(normalizedRealValueToString(d, true));
        }
        if (str != null) {
            asn1XerEncoder.encodeEndElement(str);
        }
    }

    public static String normalizedRealValueToString(double d, boolean z) {
        if (d == 0.0d) {
            return "0";
        }
        long doubleToLongBits = Double.doubleToLongBits(d);
        char c = (doubleToLongBits >> 63) == 0 ? (char) 1 : (char) 65535;
        int i = ((int) ((doubleToLongBits >> 52) & 2047)) - 1075;
        long j = doubleToLongBits & 4503599627370495L;
        long j2 = i == 0 ? j << 1 : j | 4503599627370496L;
        double d2 = i * M_LG2;
        int i2 = (int) d2;
        double pow = Math.pow(10.0d, d2 - i2) * j2;
        while (pow >= 10.0d) {
            pow /= 10.0d;
            i2++;
        }
        StringBuffer stringBuffer = new StringBuffer();
        double d3 = pow + 5.0E-15d;
        int i3 = (int) d3;
        if (c < 0) {
            stringBuffer.append(LicenseUtility.SEPARATOR);
        }
        stringBuffer.append(String.valueOf(i3));
        stringBuffer.append('.');
        int length = stringBuffer.length();
        int i4 = 0;
        int i5 = 0;
        while (d3 != 0.0d && i4 < 14) {
            d3 = (d3 - i3) * 10.0d;
            int i6 = (int) d3;
            if (i6 == 0 && i3 != 0) {
                i5 = i4;
            }
            stringBuffer.append((char) (i6 + 48));
            i4++;
            i3 = i6;
        }
        if (i5 == 0) {
            i5++;
        }
        stringBuffer.setLength(i5 + length);
        stringBuffer.append('E');
        stringBuffer.append(String.valueOf(i2));
        return stringBuffer.toString();
    }
}
