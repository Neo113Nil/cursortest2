package com.yandex.messaging.ui.timeline;

import defpackage.k4o;
import defpackage.u6b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/ui/timeline/ChatOpenTarget;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "u6b", "IMAGE_PICKER", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatOpenTarget {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChatOpenTarget[] $VALUES;
    public static final u6b Companion;
    public static final ChatOpenTarget IMAGE_PICKER;
    private final String value = "image_picker";

    static {
        ChatOpenTarget chatOpenTarget = new ChatOpenTarget();
        IMAGE_PICKER = chatOpenTarget;
        ChatOpenTarget[] chatOpenTargetArr = {chatOpenTarget};
        $VALUES = chatOpenTargetArr;
        $ENTRIES = kotlin.enums.a.a(chatOpenTargetArr);
        Companion = new u6b();
    }

    public static ChatOpenTarget valueOf(String str) {
        return (ChatOpenTarget) Enum.valueOf(ChatOpenTarget.class, str);
    }

    public static ChatOpenTarget[] values() {
        return (ChatOpenTarget[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
