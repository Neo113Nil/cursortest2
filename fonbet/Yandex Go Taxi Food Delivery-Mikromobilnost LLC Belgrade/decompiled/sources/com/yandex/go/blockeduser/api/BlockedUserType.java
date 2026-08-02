package com.yandex.go.blockeduser.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/blockeduser/api/BlockedUserType;", "", "ID", "PHONE", "go-client-android.features.blockeduser:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BlockedUserType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BlockedUserType[] $VALUES;
    public static final BlockedUserType ID;
    public static final BlockedUserType PHONE;

    static {
        BlockedUserType blockedUserType = new BlockedUserType("ID", 0);
        ID = blockedUserType;
        BlockedUserType blockedUserType2 = new BlockedUserType("PHONE", 1);
        PHONE = blockedUserType2;
        BlockedUserType[] blockedUserTypeArr = {blockedUserType, blockedUserType2};
        $VALUES = blockedUserTypeArr;
        $ENTRIES = a.a(blockedUserTypeArr);
    }

    public static BlockedUserType valueOf(String str) {
        return (BlockedUserType) Enum.valueOf(BlockedUserType.class, str);
    }

    public static BlockedUserType[] values() {
        return (BlockedUserType[]) $VALUES.clone();
    }
}
