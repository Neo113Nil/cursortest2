package com.yandex.messaging;

import defpackage.k4o;
import defpackage.x2g0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/PushPriority;", "", "", "value", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "x2g0", "Unknown", "High", "Normal", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PushPriority {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PushPriority[] $VALUES;
    public static final x2g0 Companion;
    public static final PushPriority High;
    public static final PushPriority Normal;
    public static final PushPriority Unknown;
    private final int value;

    static {
        PushPriority pushPriority = new PushPriority("Unknown", 0, 0);
        Unknown = pushPriority;
        PushPriority pushPriority2 = new PushPriority("High", 1, 1);
        High = pushPriority2;
        PushPriority pushPriority3 = new PushPriority("Normal", 2, 2);
        Normal = pushPriority3;
        PushPriority[] pushPriorityArr = {pushPriority, pushPriority2, pushPriority3};
        $VALUES = pushPriorityArr;
        $ENTRIES = kotlin.enums.a.a(pushPriorityArr);
        Companion = new x2g0();
    }

    public PushPriority(String str, int i, int i2) {
        this.value = i2;
    }

    public static PushPriority valueOf(String str) {
        return (PushPriority) Enum.valueOf(PushPriority.class, str);
    }

    public static PushPriority[] values() {
        return (PushPriority[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
