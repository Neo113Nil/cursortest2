package com.yandex.delivery.mapper.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/delivery/mapper/model/SelectDestinationPolicy;", "", "REQUIRED", "SKIP", "SKIP_IF_PRESELECTED", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectDestinationPolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectDestinationPolicy[] $VALUES;
    public static final SelectDestinationPolicy REQUIRED;
    public static final SelectDestinationPolicy SKIP;
    public static final SelectDestinationPolicy SKIP_IF_PRESELECTED;

    static {
        SelectDestinationPolicy selectDestinationPolicy = new SelectDestinationPolicy("REQUIRED", 0);
        REQUIRED = selectDestinationPolicy;
        SelectDestinationPolicy selectDestinationPolicy2 = new SelectDestinationPolicy("SKIP", 1);
        SKIP = selectDestinationPolicy2;
        SelectDestinationPolicy selectDestinationPolicy3 = new SelectDestinationPolicy("SKIP_IF_PRESELECTED", 2);
        SKIP_IF_PRESELECTED = selectDestinationPolicy3;
        SelectDestinationPolicy[] selectDestinationPolicyArr = {selectDestinationPolicy, selectDestinationPolicy2, selectDestinationPolicy3};
        $VALUES = selectDestinationPolicyArr;
        $ENTRIES = a.a(selectDestinationPolicyArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static SelectDestinationPolicy valueOf(String str) {
        return (SelectDestinationPolicy) Enum.valueOf(SelectDestinationPolicy.class, str);
    }

    public static SelectDestinationPolicy[] values() {
        return (SelectDestinationPolicy[]) $VALUES.clone();
    }
}
