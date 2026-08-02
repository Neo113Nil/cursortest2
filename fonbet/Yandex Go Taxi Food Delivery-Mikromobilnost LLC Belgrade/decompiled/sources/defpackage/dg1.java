package defpackage;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.OutputPrefixType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class dg1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[HashType.values().length];
        b = iArr;
        try {
            iArr[HashType.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[HashType.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[HashType.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[HashType.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[HashType.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[OutputPrefixType.values().length];
        a = iArr2;
        try {
            iArr2[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[OutputPrefixType.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[OutputPrefixType.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
