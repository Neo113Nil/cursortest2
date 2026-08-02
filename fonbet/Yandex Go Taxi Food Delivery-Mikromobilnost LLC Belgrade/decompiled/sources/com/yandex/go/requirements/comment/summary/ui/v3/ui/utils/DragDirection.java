package com.yandex.go.requirements.comment.summary.ui.v3.ui.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/requirements/comment/summary/ui/v3/ui/utils/DragDirection;", "", "UP", "DOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DragDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DragDirection[] $VALUES;
    public static final DragDirection DOWN;
    public static final DragDirection UP;

    static {
        DragDirection dragDirection = new DragDirection("UP", 0);
        UP = dragDirection;
        DragDirection dragDirection2 = new DragDirection("DOWN", 1);
        DOWN = dragDirection2;
        DragDirection[] dragDirectionArr = {dragDirection, dragDirection2};
        $VALUES = dragDirectionArr;
        $ENTRIES = kotlin.enums.a.a(dragDirectionArr);
    }

    public static DragDirection valueOf(String str) {
        return (DragDirection) Enum.valueOf(DragDirection.class, str);
    }

    public static DragDirection[] values() {
        return (DragDirection[]) $VALUES.clone();
    }
}
