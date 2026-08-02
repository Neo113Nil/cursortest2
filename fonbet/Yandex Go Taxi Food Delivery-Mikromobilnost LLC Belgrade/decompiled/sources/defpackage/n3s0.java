package defpackage;

import com.yandex.go.shortcuts.perf.ShortcutsPerfMetrics$GridType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class n3s0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ShortcutsPerfMetrics$GridType.values().length];
        try {
            iArr[ShortcutsPerfMetrics$GridType.NavigationShortcuts.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShortcutsPerfMetrics$GridType.TaxiShortcuts.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
