package defpackage;

import com.yandex.delivery.utils.dialogmanager.api.DialogType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class phz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DialogType.values().length];
        try {
            iArr[DialogType.POPUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DialogType.MODAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
