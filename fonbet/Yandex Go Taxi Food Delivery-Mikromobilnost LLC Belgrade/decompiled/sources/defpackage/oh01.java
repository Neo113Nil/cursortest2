package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.common.TransferContactsUtils$Companion$ElementsType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class oh01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferContactsUtils$Companion$ElementsType.values().length];
        try {
            iArr[TransferContactsUtils$Companion$ElementsType.TRANSFERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferContactsUtils$Companion$ElementsType.MOBILE_PROVIDERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
