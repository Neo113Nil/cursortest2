package com.objsys.asn1j.runtime;

/* loaded from: classes11.dex */
public class Asn1PerUtil {
    public static int getMsgBitCnt(int i, int i2) {
        if (i2 < 0) {
            return (i + 1) * 8;
        }
        return (i * 8) + (7 - i2);
    }
}
