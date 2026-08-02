package com.yandex.passport.common.core;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/common/core/FrontendUrlType;", "", "PASSPORT", "ID", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FrontendUrlType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FrontendUrlType[] $VALUES;
    public static final FrontendUrlType ID;
    public static final FrontendUrlType PASSPORT;

    static {
        FrontendUrlType frontendUrlType = new FrontendUrlType("PASSPORT", 0);
        PASSPORT = frontendUrlType;
        FrontendUrlType frontendUrlType2 = new FrontendUrlType("ID", 1);
        ID = frontendUrlType2;
        FrontendUrlType[] frontendUrlTypeArr = {frontendUrlType, frontendUrlType2};
        $VALUES = frontendUrlTypeArr;
        $ENTRIES = kotlin.enums.a.a(frontendUrlTypeArr);
    }

    public static FrontendUrlType valueOf(String str) {
        return (FrontendUrlType) Enum.valueOf(FrontendUrlType.class, str);
    }

    public static FrontendUrlType[] values() {
        return (FrontendUrlType[]) $VALUES.clone();
    }
}
