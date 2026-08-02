package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WidgetRun$RunType.values().length];
        a = iArr;
        try {
            iArr[WidgetRun$RunType.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[WidgetRun$RunType.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[WidgetRun$RunType.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
