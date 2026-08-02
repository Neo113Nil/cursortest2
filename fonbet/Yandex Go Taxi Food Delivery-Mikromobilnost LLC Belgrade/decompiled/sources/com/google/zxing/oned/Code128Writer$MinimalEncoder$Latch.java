package com.google.zxing.oned;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
final class Code128Writer$MinimalEncoder$Latch {
    private static final /* synthetic */ Code128Writer$MinimalEncoder$Latch[] $VALUES;
    public static final Code128Writer$MinimalEncoder$Latch A;
    public static final Code128Writer$MinimalEncoder$Latch B;
    public static final Code128Writer$MinimalEncoder$Latch C;
    public static final Code128Writer$MinimalEncoder$Latch NONE;
    public static final Code128Writer$MinimalEncoder$Latch SHIFT;

    static {
        Code128Writer$MinimalEncoder$Latch code128Writer$MinimalEncoder$Latch = new Code128Writer$MinimalEncoder$Latch("A", 0);
        A = code128Writer$MinimalEncoder$Latch;
        Code128Writer$MinimalEncoder$Latch code128Writer$MinimalEncoder$Latch2 = new Code128Writer$MinimalEncoder$Latch("B", 1);
        B = code128Writer$MinimalEncoder$Latch2;
        Code128Writer$MinimalEncoder$Latch code128Writer$MinimalEncoder$Latch3 = new Code128Writer$MinimalEncoder$Latch(CA20Status.STATUS_REQUEST_C, 2);
        C = code128Writer$MinimalEncoder$Latch3;
        Code128Writer$MinimalEncoder$Latch code128Writer$MinimalEncoder$Latch4 = new Code128Writer$MinimalEncoder$Latch("SHIFT", 3);
        SHIFT = code128Writer$MinimalEncoder$Latch4;
        Code128Writer$MinimalEncoder$Latch code128Writer$MinimalEncoder$Latch5 = new Code128Writer$MinimalEncoder$Latch(JCP.RAW_PREFIX, 4);
        NONE = code128Writer$MinimalEncoder$Latch5;
        $VALUES = new Code128Writer$MinimalEncoder$Latch[]{code128Writer$MinimalEncoder$Latch, code128Writer$MinimalEncoder$Latch2, code128Writer$MinimalEncoder$Latch3, code128Writer$MinimalEncoder$Latch4, code128Writer$MinimalEncoder$Latch5};
    }

    public static Code128Writer$MinimalEncoder$Latch valueOf(String str) {
        return (Code128Writer$MinimalEncoder$Latch) Enum.valueOf(Code128Writer$MinimalEncoder$Latch.class, str);
    }

    public static Code128Writer$MinimalEncoder$Latch[] values() {
        return (Code128Writer$MinimalEncoder$Latch[]) $VALUES.clone();
    }
}
