package com.yandex.go.places.api.navigation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/places/api/navigation/OrganizationCardExternalOverridesConfig$ConfigOption", "", "Lcom/yandex/go/places/api/navigation/OrganizationCardExternalOverridesConfig$ConfigOption;", "LOW_ANCHORED", "WITHOUT_GALLERY_ON_ANCHORED", "USES_EXTERNAL_MAP", "WITHOUT_MAP", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationCardExternalOverridesConfig$ConfigOption {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrganizationCardExternalOverridesConfig$ConfigOption[] $VALUES;
    public static final OrganizationCardExternalOverridesConfig$ConfigOption LOW_ANCHORED;
    public static final OrganizationCardExternalOverridesConfig$ConfigOption USES_EXTERNAL_MAP;
    public static final OrganizationCardExternalOverridesConfig$ConfigOption WITHOUT_GALLERY_ON_ANCHORED;
    public static final OrganizationCardExternalOverridesConfig$ConfigOption WITHOUT_MAP;

    static {
        OrganizationCardExternalOverridesConfig$ConfigOption organizationCardExternalOverridesConfig$ConfigOption = new OrganizationCardExternalOverridesConfig$ConfigOption("LOW_ANCHORED", 0);
        LOW_ANCHORED = organizationCardExternalOverridesConfig$ConfigOption;
        OrganizationCardExternalOverridesConfig$ConfigOption organizationCardExternalOverridesConfig$ConfigOption2 = new OrganizationCardExternalOverridesConfig$ConfigOption("WITHOUT_GALLERY_ON_ANCHORED", 1);
        WITHOUT_GALLERY_ON_ANCHORED = organizationCardExternalOverridesConfig$ConfigOption2;
        OrganizationCardExternalOverridesConfig$ConfigOption organizationCardExternalOverridesConfig$ConfigOption3 = new OrganizationCardExternalOverridesConfig$ConfigOption("USES_EXTERNAL_MAP", 2);
        USES_EXTERNAL_MAP = organizationCardExternalOverridesConfig$ConfigOption3;
        OrganizationCardExternalOverridesConfig$ConfigOption organizationCardExternalOverridesConfig$ConfigOption4 = new OrganizationCardExternalOverridesConfig$ConfigOption("WITHOUT_MAP", 3);
        WITHOUT_MAP = organizationCardExternalOverridesConfig$ConfigOption4;
        OrganizationCardExternalOverridesConfig$ConfigOption[] organizationCardExternalOverridesConfig$ConfigOptionArr = {organizationCardExternalOverridesConfig$ConfigOption, organizationCardExternalOverridesConfig$ConfigOption2, organizationCardExternalOverridesConfig$ConfigOption3, organizationCardExternalOverridesConfig$ConfigOption4};
        $VALUES = organizationCardExternalOverridesConfig$ConfigOptionArr;
        $ENTRIES = a.a(organizationCardExternalOverridesConfig$ConfigOptionArr);
    }

    public static OrganizationCardExternalOverridesConfig$ConfigOption valueOf(String str) {
        return (OrganizationCardExternalOverridesConfig$ConfigOption) Enum.valueOf(OrganizationCardExternalOverridesConfig$ConfigOption.class, str);
    }

    public static OrganizationCardExternalOverridesConfig$ConfigOption[] values() {
        return (OrganizationCardExternalOverridesConfig$ConfigOption[]) $VALUES.clone();
    }
}
