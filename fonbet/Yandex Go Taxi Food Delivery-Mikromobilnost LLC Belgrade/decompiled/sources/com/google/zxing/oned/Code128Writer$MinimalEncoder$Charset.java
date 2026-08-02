package com.google.zxing.oned;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
final class Code128Writer$MinimalEncoder$Charset {
    private static final /* synthetic */ Code128Writer$MinimalEncoder$Charset[] $VALUES;
    public static final Code128Writer$MinimalEncoder$Charset A;
    public static final Code128Writer$MinimalEncoder$Charset B;
    public static final Code128Writer$MinimalEncoder$Charset C;
    public static final Code128Writer$MinimalEncoder$Charset NONE;

    static {
        Code128Writer$MinimalEncoder$Charset code128Writer$MinimalEncoder$Charset = new Code128Writer$MinimalEncoder$Charset("A", 0);
        A = code128Writer$MinimalEncoder$Charset;
        Code128Writer$MinimalEncoder$Charset code128Writer$MinimalEncoder$Charset2 = new Code128Writer$MinimalEncoder$Charset("B", 1);
        B = code128Writer$MinimalEncoder$Charset2;
        Code128Writer$MinimalEncoder$Charset code128Writer$MinimalEncoder$Charset3 = new Code128Writer$MinimalEncoder$Charset(CA20Status.STATUS_REQUEST_C, 2);
        C = code128Writer$MinimalEncoder$Charset3;
        Code128Writer$MinimalEncoder$Charset code128Writer$MinimalEncoder$Charset4 = new Code128Writer$MinimalEncoder$Charset(JCP.RAW_PREFIX, 3);
        NONE = code128Writer$MinimalEncoder$Charset4;
        $VALUES = new Code128Writer$MinimalEncoder$Charset[]{code128Writer$MinimalEncoder$Charset, code128Writer$MinimalEncoder$Charset2, code128Writer$MinimalEncoder$Charset3, code128Writer$MinimalEncoder$Charset4};
    }

    public static Code128Writer$MinimalEncoder$Charset valueOf(String str) {
        return (Code128Writer$MinimalEncoder$Charset) Enum.valueOf(Code128Writer$MinimalEncoder$Charset.class, str);
    }

    public static Code128Writer$MinimalEncoder$Charset[] values() {
        return (Code128Writer$MinimalEncoder$Charset[]) $VALUES.clone();
    }
}
