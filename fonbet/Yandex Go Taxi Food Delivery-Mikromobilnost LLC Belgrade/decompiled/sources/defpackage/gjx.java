package defpackage;

import com.google.crypto.tink.KeyTemplate$OutputPrefixType;
import com.google.crypto.tink.proto.OutputPrefixType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class gjx {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[KeyTemplate$OutputPrefixType.values().length];
        b = iArr;
        try {
            iArr[KeyTemplate$OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[KeyTemplate$OutputPrefixType.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[KeyTemplate$OutputPrefixType.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[KeyTemplate$OutputPrefixType.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[OutputPrefixType.values().length];
        a = iArr2;
        try {
            iArr2[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[OutputPrefixType.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[OutputPrefixType.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[OutputPrefixType.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
