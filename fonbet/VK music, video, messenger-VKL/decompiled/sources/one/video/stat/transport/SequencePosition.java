package one.video.stat.transport;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SequencePosition.kt */
/* loaded from: classes8.dex */
public final class SequencePosition {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SequencePosition[] $VALUES;
    public static final SequencePosition FIRST;
    public static final SequencePosition LAST;
    public static final SequencePosition MIDDLE;

    static {
        SequencePosition sequencePosition = new SequencePosition("FIRST", 0);
        FIRST = sequencePosition;
        SequencePosition sequencePosition2 = new SequencePosition("MIDDLE", 1);
        MIDDLE = sequencePosition2;
        SequencePosition sequencePosition3 = new SequencePosition("LAST", 2);
        LAST = sequencePosition3;
        SequencePosition[] sequencePositionArr = {sequencePosition, sequencePosition2, sequencePosition3};
        $VALUES = sequencePositionArr;
        $ENTRIES = new asp(sequencePositionArr);
    }

    public SequencePosition() {
        throw null;
    }

    public static SequencePosition valueOf(String str) {
        return (SequencePosition) Enum.valueOf(SequencePosition.class, str);
    }

    public static SequencePosition[] values() {
        return (SequencePosition[]) $VALUES.clone();
    }
}
