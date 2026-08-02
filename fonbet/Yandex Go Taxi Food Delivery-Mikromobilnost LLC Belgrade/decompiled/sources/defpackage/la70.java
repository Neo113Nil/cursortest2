package defpackage;

import com.yandex.go.payments.data.model.response.ActionButton;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class la70 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActionButton.ActionType.values().length];
        try {
            iArr[ActionButton.ActionType.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionButton.ActionType.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionButton.ActionType.START_BINDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
