package com.yandex.go.sharing_personal_goals.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/api/domain/model/SharingPersonalGoalsDisplayContext;", "", "OFFER_CARD", "RIDE_FINISH", "DISCOVERY", "go-client-android.features.sharing_personal_goals:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsDisplayContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharingPersonalGoalsDisplayContext[] $VALUES;
    public static final SharingPersonalGoalsDisplayContext DISCOVERY;
    public static final SharingPersonalGoalsDisplayContext OFFER_CARD;
    public static final SharingPersonalGoalsDisplayContext RIDE_FINISH;

    static {
        SharingPersonalGoalsDisplayContext sharingPersonalGoalsDisplayContext = new SharingPersonalGoalsDisplayContext("OFFER_CARD", 0);
        OFFER_CARD = sharingPersonalGoalsDisplayContext;
        SharingPersonalGoalsDisplayContext sharingPersonalGoalsDisplayContext2 = new SharingPersonalGoalsDisplayContext("RIDE_FINISH", 1);
        RIDE_FINISH = sharingPersonalGoalsDisplayContext2;
        SharingPersonalGoalsDisplayContext sharingPersonalGoalsDisplayContext3 = new SharingPersonalGoalsDisplayContext("DISCOVERY", 2);
        DISCOVERY = sharingPersonalGoalsDisplayContext3;
        SharingPersonalGoalsDisplayContext[] sharingPersonalGoalsDisplayContextArr = {sharingPersonalGoalsDisplayContext, sharingPersonalGoalsDisplayContext2, sharingPersonalGoalsDisplayContext3};
        $VALUES = sharingPersonalGoalsDisplayContextArr;
        $ENTRIES = a.a(sharingPersonalGoalsDisplayContextArr);
    }

    public static SharingPersonalGoalsDisplayContext valueOf(String str) {
        return (SharingPersonalGoalsDisplayContext) Enum.valueOf(SharingPersonalGoalsDisplayContext.class, str);
    }

    public static SharingPersonalGoalsDisplayContext[] values() {
        return (SharingPersonalGoalsDisplayContext[]) $VALUES.clone();
    }
}
