package com.ybsdk.feature.card.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/feature/card/api/CardManagementSettingStatus;", "", "queryPrefix", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getQueryPrefix", "()Ljava/lang/String;", "LANDING", "IN_PROGRESS", "SUCCESS", "ERROR", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardManagementSettingStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardManagementSettingStatus[] $VALUES;
    private final String queryPrefix;
    public static final CardManagementSettingStatus LANDING = new CardManagementSettingStatus("LANDING", 0, "");
    public static final CardManagementSettingStatus IN_PROGRESS = new CardManagementSettingStatus("IN_PROGRESS", 1, "_in_progress");
    public static final CardManagementSettingStatus SUCCESS = new CardManagementSettingStatus("SUCCESS", 2, "_success");
    public static final CardManagementSettingStatus ERROR = new CardManagementSettingStatus("ERROR", 3, "_error");

    private static final /* synthetic */ CardManagementSettingStatus[] $values() {
        return new CardManagementSettingStatus[]{LANDING, IN_PROGRESS, SUCCESS, ERROR};
    }

    static {
        CardManagementSettingStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CardManagementSettingStatus(String str, int i, String str2) {
        this.queryPrefix = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardManagementSettingStatus valueOf(String str) {
        return (CardManagementSettingStatus) Enum.valueOf(CardManagementSettingStatus.class, str);
    }

    public static CardManagementSettingStatus[] values() {
        return (CardManagementSettingStatus[]) $VALUES.clone();
    }

    public final String getQueryPrefix() {
        return this.queryPrefix;
    }
}
