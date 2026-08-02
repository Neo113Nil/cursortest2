package com.yandex.messaging.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/messaging/analytics/OrganizationChangeReporter$ChangeType", "", "Lcom/yandex/messaging/analytics/OrganizationChangeReporter$ChangeType;", "", "tag", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Init", "ByUser", "ChatOpened", "AfterDeleted", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrganizationChangeReporter$ChangeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrganizationChangeReporter$ChangeType[] $VALUES;
    public static final OrganizationChangeReporter$ChangeType AfterDeleted;
    public static final OrganizationChangeReporter$ChangeType ByUser;
    public static final OrganizationChangeReporter$ChangeType ChatOpened;
    public static final OrganizationChangeReporter$ChangeType Init;
    private final String tag;

    static {
        OrganizationChangeReporter$ChangeType organizationChangeReporter$ChangeType = new OrganizationChangeReporter$ChangeType("Init", 0, "init");
        Init = organizationChangeReporter$ChangeType;
        OrganizationChangeReporter$ChangeType organizationChangeReporter$ChangeType2 = new OrganizationChangeReporter$ChangeType("ByUser", 1, "by_user");
        ByUser = organizationChangeReporter$ChangeType2;
        OrganizationChangeReporter$ChangeType organizationChangeReporter$ChangeType3 = new OrganizationChangeReporter$ChangeType("ChatOpened", 2, "chat_opened");
        ChatOpened = organizationChangeReporter$ChangeType3;
        OrganizationChangeReporter$ChangeType organizationChangeReporter$ChangeType4 = new OrganizationChangeReporter$ChangeType("AfterDeleted", 3, "after_deleted");
        AfterDeleted = organizationChangeReporter$ChangeType4;
        OrganizationChangeReporter$ChangeType[] organizationChangeReporter$ChangeTypeArr = {organizationChangeReporter$ChangeType, organizationChangeReporter$ChangeType2, organizationChangeReporter$ChangeType3, organizationChangeReporter$ChangeType4};
        $VALUES = organizationChangeReporter$ChangeTypeArr;
        $ENTRIES = kotlin.enums.a.a(organizationChangeReporter$ChangeTypeArr);
    }

    public OrganizationChangeReporter$ChangeType(String str, int i, String str2) {
        this.tag = str2;
    }

    public static OrganizationChangeReporter$ChangeType valueOf(String str) {
        return (OrganizationChangeReporter$ChangeType) Enum.valueOf(OrganizationChangeReporter$ChangeType.class, str);
    }

    public static OrganizationChangeReporter$ChangeType[] values() {
        return (OrganizationChangeReporter$ChangeType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTag() {
        return this.tag;
    }
}
