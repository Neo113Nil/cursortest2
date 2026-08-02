package com.google.zxing.oned;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Code128Writer$MinimalEncoder$Charset.values().length];
        b = iArr;
        try {
            iArr[Code128Writer$MinimalEncoder$Charset.A.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[Code128Writer$MinimalEncoder$Charset.B.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[Code128Writer$MinimalEncoder$Charset.C.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[Code128Writer$MinimalEncoder$Latch.values().length];
        a = iArr2;
        try {
            iArr2[Code128Writer$MinimalEncoder$Latch.A.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[Code128Writer$MinimalEncoder$Latch.B.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[Code128Writer$MinimalEncoder$Latch.C.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[Code128Writer$MinimalEncoder$Latch.SHIFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
