package com.yandex.go.flex.main_screen.api.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/flex/main_screen/api/data/SupermapInteractionState;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "IDLE", "MOVING", "DRAGGING", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SupermapInteractionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupermapInteractionState[] $VALUES;
    public static final SupermapInteractionState DRAGGING;
    public static final SupermapInteractionState IDLE;
    public static final SupermapInteractionState MOVING;
    private final String rawValue;

    static {
        SupermapInteractionState supermapInteractionState = new SupermapInteractionState("IDLE", 0, "idle");
        IDLE = supermapInteractionState;
        SupermapInteractionState supermapInteractionState2 = new SupermapInteractionState("MOVING", 1, "moving");
        MOVING = supermapInteractionState2;
        SupermapInteractionState supermapInteractionState3 = new SupermapInteractionState("DRAGGING", 2, "dragging");
        DRAGGING = supermapInteractionState3;
        SupermapInteractionState[] supermapInteractionStateArr = {supermapInteractionState, supermapInteractionState2, supermapInteractionState3};
        $VALUES = supermapInteractionStateArr;
        $ENTRIES = kotlin.enums.a.a(supermapInteractionStateArr);
    }

    public SupermapInteractionState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static SupermapInteractionState valueOf(String str) {
        return (SupermapInteractionState) Enum.valueOf(SupermapInteractionState.class, str);
    }

    public static SupermapInteractionState[] values() {
        return (SupermapInteractionState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
