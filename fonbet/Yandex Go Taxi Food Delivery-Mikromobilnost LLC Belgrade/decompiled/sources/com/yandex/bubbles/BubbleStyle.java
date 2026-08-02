package com.yandex.bubbles;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/bubbles/BubbleStyle;", "", "CUSTOM_BACKGROUND", "DARK", "bubbles_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BubbleStyle {
    private static final /* synthetic */ BubbleStyle[] $VALUES;
    public static final BubbleStyle CUSTOM_BACKGROUND;
    public static final BubbleStyle DARK;

    static {
        BubbleStyle bubbleStyle = new BubbleStyle("CUSTOM_BACKGROUND", 0);
        CUSTOM_BACKGROUND = bubbleStyle;
        BubbleStyle bubbleStyle2 = new BubbleStyle("DARK", 1);
        DARK = bubbleStyle2;
        $VALUES = new BubbleStyle[]{bubbleStyle, bubbleStyle2};
    }

    public static BubbleStyle valueOf(String str) {
        return (BubbleStyle) Enum.valueOf(BubbleStyle.class, str);
    }

    public static BubbleStyle[] values() {
        return (BubbleStyle[]) $VALUES.clone();
    }
}
