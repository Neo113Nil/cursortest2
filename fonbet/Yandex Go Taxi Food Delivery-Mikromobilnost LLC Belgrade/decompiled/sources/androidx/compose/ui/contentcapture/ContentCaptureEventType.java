package androidx.compose.ui.contentcapture;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "", "VIEW_APPEAR", "VIEW_DISAPPEAR", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ContentCaptureEventType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContentCaptureEventType[] $VALUES;
    public static final ContentCaptureEventType VIEW_APPEAR;
    public static final ContentCaptureEventType VIEW_DISAPPEAR;

    static {
        ContentCaptureEventType contentCaptureEventType = new ContentCaptureEventType("VIEW_APPEAR", 0);
        VIEW_APPEAR = contentCaptureEventType;
        ContentCaptureEventType contentCaptureEventType2 = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);
        VIEW_DISAPPEAR = contentCaptureEventType2;
        ContentCaptureEventType[] contentCaptureEventTypeArr = {contentCaptureEventType, contentCaptureEventType2};
        $VALUES = contentCaptureEventTypeArr;
        $ENTRIES = kotlin.enums.a.a(contentCaptureEventTypeArr);
    }

    public static ContentCaptureEventType valueOf(String str) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, str);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) $VALUES.clone();
    }
}
