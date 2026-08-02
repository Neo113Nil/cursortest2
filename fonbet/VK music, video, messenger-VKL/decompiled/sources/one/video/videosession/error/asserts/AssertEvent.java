package one.video.videosession.error.asserts;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AssertEvent.kt */
/* loaded from: classes8.dex */
public final class AssertEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AssertEvent[] $VALUES;
    public static final AssertEvent PROCESSOR_VIDEO_DATA_IS_NULL;

    static {
        AssertEvent assertEvent = new AssertEvent("PROCESSOR_VIDEO_DATA_IS_NULL", 0);
        PROCESSOR_VIDEO_DATA_IS_NULL = assertEvent;
        AssertEvent[] assertEventArr = {assertEvent};
        $VALUES = assertEventArr;
        $ENTRIES = new asp(assertEventArr);
    }

    public AssertEvent() {
        throw null;
    }

    public static AssertEvent valueOf(String str) {
        return (AssertEvent) Enum.valueOf(AssertEvent.class, str);
    }

    public static AssertEvent[] values() {
        return (AssertEvent[]) $VALUES.clone();
    }
}
