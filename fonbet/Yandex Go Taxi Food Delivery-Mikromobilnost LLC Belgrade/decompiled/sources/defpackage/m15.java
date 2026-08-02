package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class m15 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ItemType.values().length];
        try {
            iArr[ItemType.ACCOUNT_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ItemType.BIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ItemType.MIDDLE_NAME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
