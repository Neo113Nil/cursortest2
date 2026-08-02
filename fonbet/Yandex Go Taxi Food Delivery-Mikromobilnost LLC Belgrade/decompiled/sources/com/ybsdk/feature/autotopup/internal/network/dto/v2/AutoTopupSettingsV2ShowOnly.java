package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ShowOnly;", "", "<init>", "(Ljava/lang/String;I)V", "AT", "AF", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSettingsV2ShowOnly {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupSettingsV2ShowOnly[] $VALUES;
    public static final AutoTopupSettingsV2ShowOnly AT = new AutoTopupSettingsV2ShowOnly("AT", 0);
    public static final AutoTopupSettingsV2ShowOnly AF = new AutoTopupSettingsV2ShowOnly("AF", 1);

    private static final /* synthetic */ AutoTopupSettingsV2ShowOnly[] $values() {
        return new AutoTopupSettingsV2ShowOnly[]{AT, AF};
    }

    static {
        AutoTopupSettingsV2ShowOnly[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutoTopupSettingsV2ShowOnly(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupSettingsV2ShowOnly valueOf(String str) {
        return (AutoTopupSettingsV2ShowOnly) Enum.valueOf(AutoTopupSettingsV2ShowOnly.class, str);
    }

    public static AutoTopupSettingsV2ShowOnly[] values() {
        return (AutoTopupSettingsV2ShowOnly[]) $VALUES.clone();
    }
}
