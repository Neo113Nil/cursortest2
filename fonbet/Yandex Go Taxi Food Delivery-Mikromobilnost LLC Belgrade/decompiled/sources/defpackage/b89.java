package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class b89 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OutputPrefixType.values().length];
        a = iArr;
        try {
            iArr[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[OutputPrefixType.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[OutputPrefixType.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
