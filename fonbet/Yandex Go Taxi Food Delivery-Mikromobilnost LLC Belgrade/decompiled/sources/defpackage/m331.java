package defpackage;

import com.yandex.go.vault.domain.prize.ActionButtonType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class m331 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActionButtonType.values().length];
        try {
            iArr[ActionButtonType.CLIPBOARD_COPY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionButtonType.DEEPLINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionButtonType.CLOSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
