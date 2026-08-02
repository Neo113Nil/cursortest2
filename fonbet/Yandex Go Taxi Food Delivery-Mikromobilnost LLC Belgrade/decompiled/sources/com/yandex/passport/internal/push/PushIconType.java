package com.yandex.passport.internal.push;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/push/PushIconType;", "", "DEFAULT", "ID", "GREEN_ID", "GREEN_LOCK", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PushIconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PushIconType[] $VALUES;
    public static final PushIconType DEFAULT;
    public static final PushIconType GREEN_ID;
    public static final PushIconType GREEN_LOCK;
    public static final PushIconType ID;

    static {
        PushIconType pushIconType = new PushIconType("DEFAULT", 0);
        DEFAULT = pushIconType;
        PushIconType pushIconType2 = new PushIconType("ID", 1);
        ID = pushIconType2;
        PushIconType pushIconType3 = new PushIconType("GREEN_ID", 2);
        GREEN_ID = pushIconType3;
        PushIconType pushIconType4 = new PushIconType("GREEN_LOCK", 3);
        GREEN_LOCK = pushIconType4;
        PushIconType[] pushIconTypeArr = {pushIconType, pushIconType2, pushIconType3, pushIconType4};
        $VALUES = pushIconTypeArr;
        $ENTRIES = kotlin.enums.a.a(pushIconTypeArr);
    }

    public static PushIconType valueOf(String str) {
        return (PushIconType) Enum.valueOf(PushIconType.class, str);
    }

    public static PushIconType[] values() {
        return (PushIconType[]) $VALUES.clone();
    }
}
