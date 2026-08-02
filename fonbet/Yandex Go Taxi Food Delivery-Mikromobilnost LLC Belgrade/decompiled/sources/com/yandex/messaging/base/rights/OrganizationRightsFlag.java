package com.yandex.messaging.base.rights;

import defpackage.by4;
import defpackage.k4o;
import defpackage.kgx;
import defpackage.ok80;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/base/rights/OrganizationRightsFlag;", "Lby4;", "Lok80;", "", "", "flagName", "Ljava/lang/String;", "getFlagName", "()Ljava/lang/String;", "", "ordinalValue", CA20Status.STATUS_USER_I, "p", "()I", "CanCreateChat", "CanHaveSavedMessages", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrganizationRightsFlag implements by4 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrganizationRightsFlag[] $VALUES;
    public static final OrganizationRightsFlag CanCreateChat;
    public static final OrganizationRightsFlag CanHaveSavedMessages;
    private final String flagName;
    private final int ordinalValue = ordinal();

    static {
        OrganizationRightsFlag organizationRightsFlag = new OrganizationRightsFlag("CanCreateChat", 0, "can_create_chat");
        CanCreateChat = organizationRightsFlag;
        OrganizationRightsFlag organizationRightsFlag2 = new OrganizationRightsFlag("CanHaveSavedMessages", 1, "can_have_saved_messages");
        CanHaveSavedMessages = organizationRightsFlag2;
        OrganizationRightsFlag[] organizationRightsFlagArr = {organizationRightsFlag, organizationRightsFlag2};
        $VALUES = organizationRightsFlagArr;
        $ENTRIES = a.a(organizationRightsFlagArr);
    }

    public OrganizationRightsFlag(String str, int i, String str2) {
        this.flagName = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static OrganizationRightsFlag valueOf(String str) {
        return (OrganizationRightsFlag) Enum.valueOf(OrganizationRightsFlag.class, str);
    }

    public static OrganizationRightsFlag[] values() {
        return (OrganizationRightsFlag[]) $VALUES.clone();
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        return Boolean.valueOf(((1 << ordinal()) & ((ok80) obj).b) > 0);
    }

    @Override // defpackage.by4
    /* renamed from: p, reason: from getter */
    public final int getOrdinalValue() {
        return this.ordinalValue;
    }
}
