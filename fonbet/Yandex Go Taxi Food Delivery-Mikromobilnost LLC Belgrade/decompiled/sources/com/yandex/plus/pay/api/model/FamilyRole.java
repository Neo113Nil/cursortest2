package com.yandex.plus.pay.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/model/FamilyRole;", "", "<init>", "(Ljava/lang/String;I)V", "PARENT", "CHILD", JCP.RAW_PREFIX, "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FamilyRole {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FamilyRole[] $VALUES;
    public static final FamilyRole PARENT = new FamilyRole("PARENT", 0);
    public static final FamilyRole CHILD = new FamilyRole("CHILD", 1);
    public static final FamilyRole NONE = new FamilyRole(JCP.RAW_PREFIX, 2);

    private static final /* synthetic */ FamilyRole[] $values() {
        return new FamilyRole[]{PARENT, CHILD, NONE};
    }

    static {
        FamilyRole[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private FamilyRole(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static FamilyRole valueOf(String str) {
        return (FamilyRole) Enum.valueOf(FamilyRole.class, str);
    }

    public static FamilyRole[] values() {
        return (FamilyRole[]) $VALUES.clone();
    }
}
