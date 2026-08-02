package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.syu;
import defpackage.w0v;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubOnboardingType;", "", "Companion", "w0v", "ONLY_EXPANDED", "FULL", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubOnboardingType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HubOnboardingType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final w0v Companion;
    public static final HubOnboardingType FULL;
    public static final HubOnboardingType ONLY_EXPANDED;
    public static final HubOnboardingType UNKNOWN;

    static {
        HubOnboardingType hubOnboardingType = new HubOnboardingType("ONLY_EXPANDED", 0);
        ONLY_EXPANDED = hubOnboardingType;
        HubOnboardingType hubOnboardingType2 = new HubOnboardingType("FULL", 1);
        FULL = hubOnboardingType2;
        HubOnboardingType hubOnboardingType3 = new HubOnboardingType("UNKNOWN", 2);
        UNKNOWN = hubOnboardingType3;
        HubOnboardingType[] hubOnboardingTypeArr = {hubOnboardingType, hubOnboardingType2, hubOnboardingType3};
        $VALUES = hubOnboardingTypeArr;
        $ENTRIES = kotlin.enums.a.a(hubOnboardingTypeArr);
        Companion = new w0v();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new syu(5));
    }

    public static HubOnboardingType valueOf(String str) {
        return (HubOnboardingType) Enum.valueOf(HubOnboardingType.class, str);
    }

    public static HubOnboardingType[] values() {
        return (HubOnboardingType[]) $VALUES.clone();
    }
}
