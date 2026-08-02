package com.yandex.messaging.miniapps.js;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/miniapps/js/ChannelEventType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Null", "Notify", "SetHeight", "SetSize", "Commit", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChannelEventType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChannelEventType[] $VALUES;
    public static final ChannelEventType Commit;
    public static final ChannelEventType Notify;
    public static final ChannelEventType Null;
    public static final ChannelEventType SetHeight;
    public static final ChannelEventType SetSize;
    private final String value;

    static {
        ChannelEventType channelEventType = new ChannelEventType("Null", 0, "");
        Null = channelEventType;
        ChannelEventType channelEventType2 = new ChannelEventType("Notify", 1, "notify");
        Notify = channelEventType2;
        ChannelEventType channelEventType3 = new ChannelEventType("SetHeight", 2, "setHeight");
        SetHeight = channelEventType3;
        ChannelEventType channelEventType4 = new ChannelEventType("SetSize", 3, "setSize");
        SetSize = channelEventType4;
        ChannelEventType channelEventType5 = new ChannelEventType("Commit", 4, "commit");
        Commit = channelEventType5;
        ChannelEventType[] channelEventTypeArr = {channelEventType, channelEventType2, channelEventType3, channelEventType4, channelEventType5};
        $VALUES = channelEventTypeArr;
        $ENTRIES = a.a(channelEventTypeArr);
    }

    public ChannelEventType(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelEventType valueOf(String str) {
        return (ChannelEventType) Enum.valueOf(ChannelEventType.class, str);
    }

    public static ChannelEventType[] values() {
        return (ChannelEventType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
