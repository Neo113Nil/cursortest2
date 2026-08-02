package com.yandex.go.places.organization.card.impl.domain.entities.card;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/domain/entities/card/OrganizationCardPageLoadingState;", "", "LOADING", "CONTENT_LOADED", "FAILED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationCardPageLoadingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrganizationCardPageLoadingState[] $VALUES;
    public static final OrganizationCardPageLoadingState CONTENT_LOADED;
    public static final OrganizationCardPageLoadingState FAILED;
    public static final OrganizationCardPageLoadingState LOADING;

    static {
        OrganizationCardPageLoadingState organizationCardPageLoadingState = new OrganizationCardPageLoadingState("LOADING", 0);
        LOADING = organizationCardPageLoadingState;
        OrganizationCardPageLoadingState organizationCardPageLoadingState2 = new OrganizationCardPageLoadingState("CONTENT_LOADED", 1);
        CONTENT_LOADED = organizationCardPageLoadingState2;
        OrganizationCardPageLoadingState organizationCardPageLoadingState3 = new OrganizationCardPageLoadingState("FAILED", 2);
        FAILED = organizationCardPageLoadingState3;
        OrganizationCardPageLoadingState[] organizationCardPageLoadingStateArr = {organizationCardPageLoadingState, organizationCardPageLoadingState2, organizationCardPageLoadingState3};
        $VALUES = organizationCardPageLoadingStateArr;
        $ENTRIES = a.a(organizationCardPageLoadingStateArr);
    }

    public static OrganizationCardPageLoadingState valueOf(String str) {
        return (OrganizationCardPageLoadingState) Enum.valueOf(OrganizationCardPageLoadingState.class, str);
    }

    public static OrganizationCardPageLoadingState[] values() {
        return (OrganizationCardPageLoadingState[]) $VALUES.clone();
    }
}
