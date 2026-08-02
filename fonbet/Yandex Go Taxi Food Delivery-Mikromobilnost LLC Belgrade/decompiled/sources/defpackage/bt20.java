package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.common.MobileProvidersListItemData$Contact$Type;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class bt20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MobileProvidersListItemData$Contact$Type.values().length];
        try {
            iArr[MobileProvidersListItemData$Contact$Type.CLIPBOARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MobileProvidersListItemData$Contact$Type.MYSELF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MobileProvidersListItemData$Contact$Type.CONTACT_LIST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
