package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.Mode;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Mode.values().length];
        b = iArr;
        try {
            iArr[Mode.KANJI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[Mode.ALPHANUMERIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[Mode.NUMERIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[Mode.BYTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[Mode.ECI.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[MinimalEncoder$VersionSize.values().length];
        a = iArr2;
        try {
            iArr2[MinimalEncoder$VersionSize.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[MinimalEncoder$VersionSize.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[MinimalEncoder$VersionSize.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
