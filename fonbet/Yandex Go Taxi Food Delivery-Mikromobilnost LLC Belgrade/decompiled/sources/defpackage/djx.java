package defpackage;

import ru.rt.ebs.cryptosdk.core.storage.keystore.KeyStorageType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class djx {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[KeyStorageType.values().length];
        try {
            iArr[KeyStorageType.PREFS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KeyStorageType.MEMORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
