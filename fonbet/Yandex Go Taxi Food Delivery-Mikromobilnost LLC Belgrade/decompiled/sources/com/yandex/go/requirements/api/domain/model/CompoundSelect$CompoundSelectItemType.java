package com.yandex.go.requirements.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/requirements/api/domain/model/CompoundSelect$CompoundSelectItemType", "", "Lcom/yandex/go/requirements/api/domain/model/CompoundSelect$CompoundSelectItemType;", "DEFAULT", "CHILD_SEATS", "go-client-android.features.requirements:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompoundSelect$CompoundSelectItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CompoundSelect$CompoundSelectItemType[] $VALUES;
    public static final CompoundSelect$CompoundSelectItemType CHILD_SEATS;
    public static final CompoundSelect$CompoundSelectItemType DEFAULT;

    static {
        CompoundSelect$CompoundSelectItemType compoundSelect$CompoundSelectItemType = new CompoundSelect$CompoundSelectItemType("DEFAULT", 0);
        DEFAULT = compoundSelect$CompoundSelectItemType;
        CompoundSelect$CompoundSelectItemType compoundSelect$CompoundSelectItemType2 = new CompoundSelect$CompoundSelectItemType("CHILD_SEATS", 1);
        CHILD_SEATS = compoundSelect$CompoundSelectItemType2;
        CompoundSelect$CompoundSelectItemType[] compoundSelect$CompoundSelectItemTypeArr = {compoundSelect$CompoundSelectItemType, compoundSelect$CompoundSelectItemType2};
        $VALUES = compoundSelect$CompoundSelectItemTypeArr;
        $ENTRIES = a.a(compoundSelect$CompoundSelectItemTypeArr);
    }

    public static CompoundSelect$CompoundSelectItemType valueOf(String str) {
        return (CompoundSelect$CompoundSelectItemType) Enum.valueOf(CompoundSelect$CompoundSelectItemType.class, str);
    }

    public static CompoundSelect$CompoundSelectItemType[] values() {
        return (CompoundSelect$CompoundSelectItemType[]) $VALUES.clone();
    }
}
