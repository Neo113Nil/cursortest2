package one.video.statistics.onelog.interative;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClickType.kt */
/* loaded from: classes8.dex */
public final class ClickType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClickType[] $VALUES;
    public static final ClickType GRAPH_HIDE;
    public static final ClickType GRAPH_SHOW;
    public static final ClickType NEXT_CHAPTER_AREA;
    public static final ClickType NEXT_CHAPTER_BTN;
    public static final ClickType WATCH_AGAIN_BTN;
    private final String value;

    static {
        ClickType clickType = new ClickType("GRAPH_SHOW", 0, "iGraphShow");
        GRAPH_SHOW = clickType;
        ClickType clickType2 = new ClickType("GRAPH_HIDE", 1, "iGraphHide");
        GRAPH_HIDE = clickType2;
        ClickType clickType3 = new ClickType("NEXT_CHAPTER_AREA", 2, "iNextChapterArea");
        NEXT_CHAPTER_AREA = clickType3;
        ClickType clickType4 = new ClickType("NEXT_CHAPTER_BTN", 3, "iNextChapterBtn");
        NEXT_CHAPTER_BTN = clickType4;
        ClickType clickType5 = new ClickType("WATCH_AGAIN_BTN", 4, "iWatchAgainBtn");
        WATCH_AGAIN_BTN = clickType5;
        ClickType[] clickTypeArr = {clickType, clickType2, clickType3, clickType4, clickType5};
        $VALUES = clickTypeArr;
        $ENTRIES = new asp(clickTypeArr);
    }

    public ClickType(String str, int i, String str2) {
        this.value = str2;
    }

    public static ClickType valueOf(String str) {
        return (ClickType) Enum.valueOf(ClickType.class, str);
    }

    public static ClickType[] values() {
        return (ClickType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
