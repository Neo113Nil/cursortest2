package com.ybsdk.core.common.domain.entities.cache;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/core/common/domain/entities/cache/ExpireableEntity$Behaviour", "", "Lcom/ybsdk/core/common/domain/entities/cache/ExpireableEntity$Behaviour;", "<init>", "(Ljava/lang/String;I)V", "OPTIONAL", "REQUIRED", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExpireableEntity$Behaviour {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExpireableEntity$Behaviour[] $VALUES;
    public static final ExpireableEntity$Behaviour OPTIONAL = new ExpireableEntity$Behaviour("OPTIONAL", 0);
    public static final ExpireableEntity$Behaviour REQUIRED = new ExpireableEntity$Behaviour("REQUIRED", 1);

    private static final /* synthetic */ ExpireableEntity$Behaviour[] $values() {
        return new ExpireableEntity$Behaviour[]{OPTIONAL, REQUIRED};
    }

    static {
        ExpireableEntity$Behaviour[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ExpireableEntity$Behaviour(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ExpireableEntity$Behaviour valueOf(String str) {
        return (ExpireableEntity$Behaviour) Enum.valueOf(ExpireableEntity$Behaviour.class, str);
    }

    public static ExpireableEntity$Behaviour[] values() {
        return (ExpireableEntity$Behaviour[]) $VALUES.clone();
    }
}
