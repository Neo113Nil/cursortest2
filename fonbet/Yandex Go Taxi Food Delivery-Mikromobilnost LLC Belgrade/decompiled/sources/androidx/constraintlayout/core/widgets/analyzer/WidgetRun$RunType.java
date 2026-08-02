package androidx.constraintlayout.core.widgets.analyzer;

import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class WidgetRun$RunType {
    private static final /* synthetic */ WidgetRun$RunType[] $VALUES;
    public static final WidgetRun$RunType CENTER;
    public static final WidgetRun$RunType END;
    public static final WidgetRun$RunType NONE;
    public static final WidgetRun$RunType START;

    static {
        WidgetRun$RunType widgetRun$RunType = new WidgetRun$RunType(JCP.RAW_PREFIX, 0);
        NONE = widgetRun$RunType;
        WidgetRun$RunType widgetRun$RunType2 = new WidgetRun$RunType("START", 1);
        START = widgetRun$RunType2;
        WidgetRun$RunType widgetRun$RunType3 = new WidgetRun$RunType("END", 2);
        END = widgetRun$RunType3;
        WidgetRun$RunType widgetRun$RunType4 = new WidgetRun$RunType("CENTER", 3);
        CENTER = widgetRun$RunType4;
        $VALUES = new WidgetRun$RunType[]{widgetRun$RunType, widgetRun$RunType2, widgetRun$RunType3, widgetRun$RunType4};
    }

    public static WidgetRun$RunType valueOf(String str) {
        return (WidgetRun$RunType) Enum.valueOf(WidgetRun$RunType.class, str);
    }

    public static WidgetRun$RunType[] values() {
        return (WidgetRun$RunType[]) $VALUES.clone();
    }
}
