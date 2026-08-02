package com.yandex.messaging.internal.displayname;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/internal/displayname/AvatarType;", "", "ICON", "PLACEHOLDER", "EMPTY", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AvatarType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AvatarType[] $VALUES;
    public static final AvatarType EMPTY;
    public static final AvatarType ICON;
    public static final AvatarType PLACEHOLDER;

    static {
        AvatarType avatarType = new AvatarType("ICON", 0);
        ICON = avatarType;
        AvatarType avatarType2 = new AvatarType("PLACEHOLDER", 1);
        PLACEHOLDER = avatarType2;
        AvatarType avatarType3 = new AvatarType("EMPTY", 2);
        EMPTY = avatarType3;
        AvatarType[] avatarTypeArr = {avatarType, avatarType2, avatarType3};
        $VALUES = avatarTypeArr;
        $ENTRIES = kotlin.enums.a.a(avatarTypeArr);
    }

    public static AvatarType valueOf(String str) {
        return (AvatarType) Enum.valueOf(AvatarType.class, str);
    }

    public static AvatarType[] values() {
        return (AvatarType[]) $VALUES.clone();
    }
}
