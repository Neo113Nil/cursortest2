package com.yandex.go.safety.center.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mkr0;
import defpackage.ysr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/safety/center/api/SharingType;", "", "Companion", "ysr0", "ENABLED_CHECKBOX", "DISABLED_CHECKBOX", "BUTTON", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharingType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SharingType BUTTON;
    public static final ysr0 Companion;
    public static final SharingType DISABLED_CHECKBOX;
    public static final SharingType ENABLED_CHECKBOX;
    public static final SharingType UNKNOWN;

    static {
        SharingType sharingType = new SharingType("ENABLED_CHECKBOX", 0);
        ENABLED_CHECKBOX = sharingType;
        SharingType sharingType2 = new SharingType("DISABLED_CHECKBOX", 1);
        DISABLED_CHECKBOX = sharingType2;
        SharingType sharingType3 = new SharingType("BUTTON", 2);
        BUTTON = sharingType3;
        SharingType sharingType4 = new SharingType("UNKNOWN", 3);
        UNKNOWN = sharingType4;
        SharingType[] sharingTypeArr = {sharingType, sharingType2, sharingType3, sharingType4};
        $VALUES = sharingTypeArr;
        $ENTRIES = kotlin.enums.a.a(sharingTypeArr);
        Companion = new ysr0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mkr0(26));
    }

    public static SharingType valueOf(String str) {
        return (SharingType) Enum.valueOf(SharingType.class, str);
    }

    public static SharingType[] values() {
        return (SharingType[]) $VALUES.clone();
    }
}
