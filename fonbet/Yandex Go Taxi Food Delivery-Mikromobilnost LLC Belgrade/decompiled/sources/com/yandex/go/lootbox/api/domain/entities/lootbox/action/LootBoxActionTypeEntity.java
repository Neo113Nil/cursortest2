package com.yandex.go.lootbox.api.domain.entities.lootbox.action;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/lootbox/api/domain/entities/lootbox/action/LootBoxActionTypeEntity;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "UNKNOWN", "MODAL_VIEW", "DEEPLINK", "WEB_VIEW", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LootBoxActionTypeEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LootBoxActionTypeEntity[] $VALUES;
    public static final LootBoxActionTypeEntity DEEPLINK;
    public static final LootBoxActionTypeEntity MODAL_VIEW;
    public static final LootBoxActionTypeEntity UNKNOWN;
    public static final LootBoxActionTypeEntity WEB_VIEW;
    private final String analyticsName;

    static {
        LootBoxActionTypeEntity lootBoxActionTypeEntity = new LootBoxActionTypeEntity("UNKNOWN", 0, "unknown");
        UNKNOWN = lootBoxActionTypeEntity;
        LootBoxActionTypeEntity lootBoxActionTypeEntity2 = new LootBoxActionTypeEntity("MODAL_VIEW", 1, "modal_view");
        MODAL_VIEW = lootBoxActionTypeEntity2;
        LootBoxActionTypeEntity lootBoxActionTypeEntity3 = new LootBoxActionTypeEntity("DEEPLINK", 2, Constants.DEEPLINK);
        DEEPLINK = lootBoxActionTypeEntity3;
        LootBoxActionTypeEntity lootBoxActionTypeEntity4 = new LootBoxActionTypeEntity("WEB_VIEW", 3, "web_view");
        WEB_VIEW = lootBoxActionTypeEntity4;
        LootBoxActionTypeEntity[] lootBoxActionTypeEntityArr = {lootBoxActionTypeEntity, lootBoxActionTypeEntity2, lootBoxActionTypeEntity3, lootBoxActionTypeEntity4};
        $VALUES = lootBoxActionTypeEntityArr;
        $ENTRIES = a.a(lootBoxActionTypeEntityArr);
    }

    public LootBoxActionTypeEntity(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static LootBoxActionTypeEntity valueOf(String str) {
        return (LootBoxActionTypeEntity) Enum.valueOf(LootBoxActionTypeEntity.class, str);
    }

    public static LootBoxActionTypeEntity[] values() {
        return (LootBoxActionTypeEntity[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
