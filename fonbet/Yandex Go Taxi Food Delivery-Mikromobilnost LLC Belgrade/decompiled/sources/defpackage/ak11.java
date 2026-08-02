package defpackage;

import com.yandex.go.shortcuts.dto.response.ShortcutIconSize;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ak11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ShortcutIconSize.values().length];
        try {
            iArr[ShortcutIconSize.BIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShortcutIconSize.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
