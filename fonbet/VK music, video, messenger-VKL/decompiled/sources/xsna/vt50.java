package xsna;

import com.vkontakte.android.api.NameHistoryItemType;

/* compiled from: NameHistoryItemsList.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class vt50 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[NameHistoryItemType.values().length];
        try {
            iArr[NameHistoryItemType.RENAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NameHistoryItemType.CREATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NameHistoryItemType.COLLAPSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
