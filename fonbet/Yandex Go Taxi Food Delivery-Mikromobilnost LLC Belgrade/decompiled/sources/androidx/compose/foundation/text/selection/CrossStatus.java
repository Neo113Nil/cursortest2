package androidx.compose.foundation.text.selection;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/CrossStatus;", "", "CROSSED", "NOT_CROSSED", "COLLAPSED", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CrossStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CrossStatus[] $VALUES;
    public static final CrossStatus COLLAPSED;
    public static final CrossStatus CROSSED;
    public static final CrossStatus NOT_CROSSED;

    static {
        CrossStatus crossStatus = new CrossStatus("CROSSED", 0);
        CROSSED = crossStatus;
        CrossStatus crossStatus2 = new CrossStatus("NOT_CROSSED", 1);
        NOT_CROSSED = crossStatus2;
        CrossStatus crossStatus3 = new CrossStatus("COLLAPSED", 2);
        COLLAPSED = crossStatus3;
        CrossStatus[] crossStatusArr = {crossStatus, crossStatus2, crossStatus3};
        $VALUES = crossStatusArr;
        $ENTRIES = kotlin.enums.a.a(crossStatusArr);
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) $VALUES.clone();
    }
}
