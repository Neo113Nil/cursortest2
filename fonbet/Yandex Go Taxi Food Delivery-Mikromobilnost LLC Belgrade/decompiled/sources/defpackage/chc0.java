package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.model.PlainButtonModel$Style;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class chc0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlainButtonModel$Style.values().length];
        try {
            iArr[PlainButtonModel$Style.OUTLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlainButtonModel$Style.GRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlainButtonModel$Style.CONTROL_MINOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
