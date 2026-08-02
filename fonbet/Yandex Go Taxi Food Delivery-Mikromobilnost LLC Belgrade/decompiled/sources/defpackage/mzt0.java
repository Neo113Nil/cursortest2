package defpackage;

import com.yandex.go.flex.screens.common.flexible.layout.manager.LayoutState;

/* loaded from: classes.dex */
public abstract /* synthetic */ class mzt0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LayoutState.LayoutDirection.values().length];
        try {
            iArr[LayoutState.LayoutDirection.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LayoutState.LayoutDirection.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
