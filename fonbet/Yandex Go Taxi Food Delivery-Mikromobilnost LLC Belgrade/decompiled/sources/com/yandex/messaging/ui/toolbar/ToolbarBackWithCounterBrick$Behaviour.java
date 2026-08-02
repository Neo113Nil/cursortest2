package com.yandex.messaging.ui.toolbar;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/messaging/ui/toolbar/ToolbarBackWithCounterBrick$Behaviour", "", "Lcom/yandex/messaging/ui/toolbar/ToolbarBackWithCounterBrick$Behaviour;", "BACK", "UP_TO_CHAT_LIST", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ToolbarBackWithCounterBrick$Behaviour {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ToolbarBackWithCounterBrick$Behaviour[] $VALUES;
    public static final ToolbarBackWithCounterBrick$Behaviour BACK;
    public static final ToolbarBackWithCounterBrick$Behaviour UP_TO_CHAT_LIST;

    static {
        ToolbarBackWithCounterBrick$Behaviour toolbarBackWithCounterBrick$Behaviour = new ToolbarBackWithCounterBrick$Behaviour("BACK", 0);
        BACK = toolbarBackWithCounterBrick$Behaviour;
        ToolbarBackWithCounterBrick$Behaviour toolbarBackWithCounterBrick$Behaviour2 = new ToolbarBackWithCounterBrick$Behaviour("UP_TO_CHAT_LIST", 1);
        UP_TO_CHAT_LIST = toolbarBackWithCounterBrick$Behaviour2;
        ToolbarBackWithCounterBrick$Behaviour[] toolbarBackWithCounterBrick$BehaviourArr = {toolbarBackWithCounterBrick$Behaviour, toolbarBackWithCounterBrick$Behaviour2};
        $VALUES = toolbarBackWithCounterBrick$BehaviourArr;
        $ENTRIES = kotlin.enums.a.a(toolbarBackWithCounterBrick$BehaviourArr);
    }

    public static ToolbarBackWithCounterBrick$Behaviour valueOf(String str) {
        return (ToolbarBackWithCounterBrick$Behaviour) Enum.valueOf(ToolbarBackWithCounterBrick$Behaviour.class, str);
    }

    public static ToolbarBackWithCounterBrick$Behaviour[] values() {
        return (ToolbarBackWithCounterBrick$Behaviour[]) $VALUES.clone();
    }
}
