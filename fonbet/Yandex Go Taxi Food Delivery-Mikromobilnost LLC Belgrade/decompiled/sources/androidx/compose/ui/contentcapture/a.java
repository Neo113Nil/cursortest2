package androidx.compose.ui.contentcapture;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ContentCaptureEventType.values().length];
        try {
            iArr[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
