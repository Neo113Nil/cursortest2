package com.yandex.messaging.ui.pollinfo;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/messaging/ui/pollinfo/PollInfoAdapter$Companion$ItemType", "", "Lcom/yandex/messaging/ui/pollinfo/PollInfoAdapter$Companion$ItemType;", "Title", "PollItem", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class PollInfoAdapter$Companion$ItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PollInfoAdapter$Companion$ItemType[] $VALUES;
    public static final PollInfoAdapter$Companion$ItemType PollItem;
    public static final PollInfoAdapter$Companion$ItemType Title;

    static {
        PollInfoAdapter$Companion$ItemType pollInfoAdapter$Companion$ItemType = new PollInfoAdapter$Companion$ItemType("Title", 0);
        Title = pollInfoAdapter$Companion$ItemType;
        PollInfoAdapter$Companion$ItemType pollInfoAdapter$Companion$ItemType2 = new PollInfoAdapter$Companion$ItemType("PollItem", 1);
        PollItem = pollInfoAdapter$Companion$ItemType2;
        PollInfoAdapter$Companion$ItemType[] pollInfoAdapter$Companion$ItemTypeArr = {pollInfoAdapter$Companion$ItemType, pollInfoAdapter$Companion$ItemType2};
        $VALUES = pollInfoAdapter$Companion$ItemTypeArr;
        $ENTRIES = kotlin.enums.a.a(pollInfoAdapter$Companion$ItemTypeArr);
    }

    public static PollInfoAdapter$Companion$ItemType valueOf(String str) {
        return (PollInfoAdapter$Companion$ItemType) Enum.valueOf(PollInfoAdapter$Companion$ItemType.class, str);
    }

    public static PollInfoAdapter$Companion$ItemType[] values() {
        return (PollInfoAdapter$Companion$ItemType[]) $VALUES.clone();
    }
}
