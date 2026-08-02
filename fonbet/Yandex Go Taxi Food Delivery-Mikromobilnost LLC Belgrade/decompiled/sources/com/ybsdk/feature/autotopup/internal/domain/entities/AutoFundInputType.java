package com.ybsdk.feature.autotopup.internal.domain.entities;

import defpackage.k4o;
import defpackage.txz0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutoFundInputType;", "Ltxz0;", "", "<init>", "(Ljava/lang/String;I)V", "AUTOFUND_MONEY", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoFundInputType implements txz0 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoFundInputType[] $VALUES;
    public static final AutoFundInputType AUTOFUND_MONEY = new AutoFundInputType("AUTOFUND_MONEY", 0);

    private static final /* synthetic */ AutoFundInputType[] $values() {
        return new AutoFundInputType[]{AUTOFUND_MONEY};
    }

    static {
        AutoFundInputType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutoFundInputType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoFundInputType valueOf(String str) {
        return (AutoFundInputType) Enum.valueOf(AutoFundInputType.class, str);
    }

    public static AutoFundInputType[] values() {
        return (AutoFundInputType[]) $VALUES.clone();
    }
}
