package com.ybsdk.feature.autotopup.api.domain.model;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/domain/model/SettingStatus;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ENABLED", "DISABLED", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SettingStatus[] $VALUES;
    private final String value;
    public static final SettingStatus ENABLED = new SettingStatus("ENABLED", 0, BackendConfig.Restrictions.ENABLED);
    public static final SettingStatus DISABLED = new SettingStatus("DISABLED", 1, BackendConfig.Restrictions.DISABLED);

    private static final /* synthetic */ SettingStatus[] $values() {
        return new SettingStatus[]{ENABLED, DISABLED};
    }

    static {
        SettingStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SettingStatus(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SettingStatus valueOf(String str) {
        return (SettingStatus) Enum.valueOf(SettingStatus.class, str);
    }

    public static SettingStatus[] values() {
        return (SettingStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
