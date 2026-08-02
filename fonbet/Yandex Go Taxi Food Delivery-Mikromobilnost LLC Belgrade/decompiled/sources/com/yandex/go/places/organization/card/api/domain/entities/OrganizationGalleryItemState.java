package com.yandex.go.places.organization.card.api.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/organization/card/api/domain/entities/OrganizationGalleryItemState;", "", "SHIMMERING", "CONTENT", "ERROR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationGalleryItemState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrganizationGalleryItemState[] $VALUES;
    public static final OrganizationGalleryItemState CONTENT;
    public static final OrganizationGalleryItemState ERROR;
    public static final OrganizationGalleryItemState SHIMMERING;

    static {
        OrganizationGalleryItemState organizationGalleryItemState = new OrganizationGalleryItemState("SHIMMERING", 0);
        SHIMMERING = organizationGalleryItemState;
        OrganizationGalleryItemState organizationGalleryItemState2 = new OrganizationGalleryItemState("CONTENT", 1);
        CONTENT = organizationGalleryItemState2;
        OrganizationGalleryItemState organizationGalleryItemState3 = new OrganizationGalleryItemState("ERROR", 2);
        ERROR = organizationGalleryItemState3;
        OrganizationGalleryItemState[] organizationGalleryItemStateArr = {organizationGalleryItemState, organizationGalleryItemState2, organizationGalleryItemState3};
        $VALUES = organizationGalleryItemStateArr;
        $ENTRIES = a.a(organizationGalleryItemStateArr);
    }

    public static OrganizationGalleryItemState valueOf(String str) {
        return (OrganizationGalleryItemState) Enum.valueOf(OrganizationGalleryItemState.class, str);
    }

    public static OrganizationGalleryItemState[] values() {
        return (OrganizationGalleryItemState[]) $VALUES.clone();
    }
}
