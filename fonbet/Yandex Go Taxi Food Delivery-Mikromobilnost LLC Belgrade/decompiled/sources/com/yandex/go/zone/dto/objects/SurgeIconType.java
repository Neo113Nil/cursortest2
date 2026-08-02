package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.qpw0;
import defpackage.xlw0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SurgeIconType;", "", "Companion", "qpw0", "DEFAULT", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SurgeIconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SurgeIconType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final qpw0 Companion;
    public static final SurgeIconType DEFAULT;

    static {
        SurgeIconType surgeIconType = new SurgeIconType("DEFAULT", 0);
        DEFAULT = surgeIconType;
        SurgeIconType[] surgeIconTypeArr = {surgeIconType};
        $VALUES = surgeIconTypeArr;
        $ENTRIES = kotlin.enums.a.a(surgeIconTypeArr);
        Companion = new qpw0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(6));
    }

    public static SurgeIconType valueOf(String str) {
        return (SurgeIconType) Enum.valueOf(SurgeIconType.class, str);
    }

    public static SurgeIconType[] values() {
        return (SurgeIconType[]) $VALUES.clone();
    }
}
