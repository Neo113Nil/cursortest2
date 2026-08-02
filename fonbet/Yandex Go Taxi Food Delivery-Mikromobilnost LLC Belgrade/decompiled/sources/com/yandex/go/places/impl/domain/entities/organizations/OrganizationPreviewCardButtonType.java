package com.yandex.go.places.impl.domain.entities.organizations;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/places/impl/domain/entities/organizations/OrganizationPreviewCardButtonType;", "", "LEAD", "SECONDARY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationPreviewCardButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrganizationPreviewCardButtonType[] $VALUES;
    public static final OrganizationPreviewCardButtonType LEAD;
    public static final OrganizationPreviewCardButtonType SECONDARY;

    static {
        OrganizationPreviewCardButtonType organizationPreviewCardButtonType = new OrganizationPreviewCardButtonType("LEAD", 0);
        LEAD = organizationPreviewCardButtonType;
        OrganizationPreviewCardButtonType organizationPreviewCardButtonType2 = new OrganizationPreviewCardButtonType("SECONDARY", 1);
        SECONDARY = organizationPreviewCardButtonType2;
        OrganizationPreviewCardButtonType[] organizationPreviewCardButtonTypeArr = {organizationPreviewCardButtonType, organizationPreviewCardButtonType2};
        $VALUES = organizationPreviewCardButtonTypeArr;
        $ENTRIES = a.a(organizationPreviewCardButtonTypeArr);
    }

    public static OrganizationPreviewCardButtonType valueOf(String str) {
        return (OrganizationPreviewCardButtonType) Enum.valueOf(OrganizationPreviewCardButtonType.class, str);
    }

    public static OrganizationPreviewCardButtonType[] values() {
        return (OrganizationPreviewCardButtonType[]) $VALUES.clone();
    }
}
