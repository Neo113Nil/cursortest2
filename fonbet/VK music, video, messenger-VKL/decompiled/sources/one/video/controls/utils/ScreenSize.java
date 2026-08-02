package one.video.controls.utils;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes8.dex */
public enum ScreenSize {
    UNDEFINED(0),
    SMALL(1),
    NORMAL(2),
    LARGE(3),
    XLARGE(4);

    private static final Map<Integer, ScreenSize> intToScreenSizeMap = new HashMap();
    private final int value;

    static {
        for (ScreenSize screenSize : values()) {
            intToScreenSizeMap.put(Integer.valueOf(screenSize.value), screenSize);
        }
    }

    ScreenSize(int i) {
        this.value = i;
    }

    public static ScreenSize a(int i) {
        ScreenSize screenSize = intToScreenSizeMap.get(Integer.valueOf(i));
        return screenSize == null ? UNDEFINED : screenSize;
    }

    public final int h() {
        return this.value;
    }
}
