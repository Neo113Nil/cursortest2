package androidx.compose.foundation.text.selection;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/selection/DownResolution;", "", "Up", "Drag", "Timeout", "Cancel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class DownResolution {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DownResolution[] $VALUES;
    public static final DownResolution Cancel;
    public static final DownResolution Drag;
    public static final DownResolution Timeout;
    public static final DownResolution Up;

    static {
        DownResolution downResolution = new DownResolution("Up", 0);
        Up = downResolution;
        DownResolution downResolution2 = new DownResolution("Drag", 1);
        Drag = downResolution2;
        DownResolution downResolution3 = new DownResolution("Timeout", 2);
        Timeout = downResolution3;
        DownResolution downResolution4 = new DownResolution("Cancel", 3);
        Cancel = downResolution4;
        DownResolution[] downResolutionArr = {downResolution, downResolution2, downResolution3, downResolution4};
        $VALUES = downResolutionArr;
        $ENTRIES = kotlin.enums.a.a(downResolutionArr);
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) $VALUES.clone();
    }
}
