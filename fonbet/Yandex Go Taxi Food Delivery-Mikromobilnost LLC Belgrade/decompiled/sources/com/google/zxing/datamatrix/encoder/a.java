package com.google.zxing.datamatrix.encoder;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SymbolShapeHint.values().length];
        b = iArr;
        try {
            iArr[SymbolShapeHint.FORCE_SQUARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[SymbolShapeHint.FORCE_RECTANGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[MinimalEncoder$Mode.values().length];
        a = iArr2;
        try {
            iArr2[MinimalEncoder$Mode.ASCII.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[MinimalEncoder$Mode.B256.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[MinimalEncoder$Mode.C40.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[MinimalEncoder$Mode.TEXT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[MinimalEncoder$Mode.X12.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[MinimalEncoder$Mode.EDF.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
