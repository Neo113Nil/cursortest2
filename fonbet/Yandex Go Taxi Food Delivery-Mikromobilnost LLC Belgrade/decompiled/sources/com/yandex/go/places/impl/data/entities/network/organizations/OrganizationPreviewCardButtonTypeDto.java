package com.yandex.go.places.impl.data.entities.network.organizations;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tj80;
import defpackage.yi80;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/OrganizationPreviewCardButtonTypeDto;", "", "Companion", "tj80", "LEAD", "SECONDARY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationPreviewCardButtonTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrganizationPreviewCardButtonTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final tj80 Companion;
    public static final OrganizationPreviewCardButtonTypeDto LEAD;
    public static final OrganizationPreviewCardButtonTypeDto SECONDARY;

    static {
        OrganizationPreviewCardButtonTypeDto organizationPreviewCardButtonTypeDto = new OrganizationPreviewCardButtonTypeDto("LEAD", 0);
        LEAD = organizationPreviewCardButtonTypeDto;
        OrganizationPreviewCardButtonTypeDto organizationPreviewCardButtonTypeDto2 = new OrganizationPreviewCardButtonTypeDto("SECONDARY", 1);
        SECONDARY = organizationPreviewCardButtonTypeDto2;
        OrganizationPreviewCardButtonTypeDto[] organizationPreviewCardButtonTypeDtoArr = {organizationPreviewCardButtonTypeDto, organizationPreviewCardButtonTypeDto2};
        $VALUES = organizationPreviewCardButtonTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(organizationPreviewCardButtonTypeDtoArr);
        Companion = new tj80();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(9));
    }

    public static OrganizationPreviewCardButtonTypeDto valueOf(String str) {
        return (OrganizationPreviewCardButtonTypeDto) Enum.valueOf(OrganizationPreviewCardButtonTypeDto.class, str);
    }

    public static OrganizationPreviewCardButtonTypeDto[] values() {
        return (OrganizationPreviewCardButtonTypeDto[]) $VALUES.clone();
    }
}
