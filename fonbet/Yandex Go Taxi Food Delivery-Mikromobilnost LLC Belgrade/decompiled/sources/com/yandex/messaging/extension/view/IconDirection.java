package com.yandex.messaging.extension.view;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/messaging/extension/view/IconDirection;", "", "Start", "End", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IconDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IconDirection[] $VALUES;
    public static final IconDirection End;
    public static final IconDirection Start;

    static {
        IconDirection iconDirection = new IconDirection("Start", 0);
        Start = iconDirection;
        IconDirection iconDirection2 = new IconDirection("End", 1);
        End = iconDirection2;
        IconDirection[] iconDirectionArr = {iconDirection, iconDirection2};
        $VALUES = iconDirectionArr;
        $ENTRIES = a.a(iconDirectionArr);
    }

    public static IconDirection valueOf(String str) {
        return (IconDirection) Enum.valueOf(IconDirection.class, str);
    }

    public static IconDirection[] values() {
        return (IconDirection[]) $VALUES.clone();
    }
}
