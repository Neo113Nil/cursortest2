package com.yandex.delivery.mapper.model.policies;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/delivery/mapper/model/policies/ShowPolicy$LimitedCount$Lifetime", "", "Lcom/yandex/delivery/mapper/model/policies/ShowPolicy$LimitedCount$Lifetime;", "PERSISTENT", "SESSION", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShowPolicy$LimitedCount$Lifetime {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShowPolicy$LimitedCount$Lifetime[] $VALUES;
    public static final ShowPolicy$LimitedCount$Lifetime PERSISTENT;
    public static final ShowPolicy$LimitedCount$Lifetime SESSION;

    static {
        ShowPolicy$LimitedCount$Lifetime showPolicy$LimitedCount$Lifetime = new ShowPolicy$LimitedCount$Lifetime("PERSISTENT", 0);
        PERSISTENT = showPolicy$LimitedCount$Lifetime;
        ShowPolicy$LimitedCount$Lifetime showPolicy$LimitedCount$Lifetime2 = new ShowPolicy$LimitedCount$Lifetime("SESSION", 1);
        SESSION = showPolicy$LimitedCount$Lifetime2;
        ShowPolicy$LimitedCount$Lifetime[] showPolicy$LimitedCount$LifetimeArr = {showPolicy$LimitedCount$Lifetime, showPolicy$LimitedCount$Lifetime2};
        $VALUES = showPolicy$LimitedCount$LifetimeArr;
        $ENTRIES = a.a(showPolicy$LimitedCount$LifetimeArr);
    }

    public static ShowPolicy$LimitedCount$Lifetime valueOf(String str) {
        return (ShowPolicy$LimitedCount$Lifetime) Enum.valueOf(ShowPolicy$LimitedCount$Lifetime.class, str);
    }

    public static ShowPolicy$LimitedCount$Lifetime[] values() {
        return (ShowPolicy$LimitedCount$Lifetime[]) $VALUES.clone();
    }
}
