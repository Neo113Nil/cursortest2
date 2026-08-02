package com.yandex.go.scooters.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/scooters/domain/ScootersBeginnerInteractor$ShowForBeginner", "", "Lcom/yandex/go/scooters/domain/ScootersBeginnerInteractor$ShowForBeginner;", "NOTHING", "SHOW_ONBOARDING", "SHOW_AGREEMENT", "SHOW_ONBOARDING_AND_AGREEMENT", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBeginnerInteractor$ShowForBeginner {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersBeginnerInteractor$ShowForBeginner[] $VALUES;
    public static final ScootersBeginnerInteractor$ShowForBeginner NOTHING;
    public static final ScootersBeginnerInteractor$ShowForBeginner SHOW_AGREEMENT;
    public static final ScootersBeginnerInteractor$ShowForBeginner SHOW_ONBOARDING;
    public static final ScootersBeginnerInteractor$ShowForBeginner SHOW_ONBOARDING_AND_AGREEMENT;

    static {
        ScootersBeginnerInteractor$ShowForBeginner scootersBeginnerInteractor$ShowForBeginner = new ScootersBeginnerInteractor$ShowForBeginner("NOTHING", 0);
        NOTHING = scootersBeginnerInteractor$ShowForBeginner;
        ScootersBeginnerInteractor$ShowForBeginner scootersBeginnerInteractor$ShowForBeginner2 = new ScootersBeginnerInteractor$ShowForBeginner("SHOW_ONBOARDING", 1);
        SHOW_ONBOARDING = scootersBeginnerInteractor$ShowForBeginner2;
        ScootersBeginnerInteractor$ShowForBeginner scootersBeginnerInteractor$ShowForBeginner3 = new ScootersBeginnerInteractor$ShowForBeginner("SHOW_AGREEMENT", 2);
        SHOW_AGREEMENT = scootersBeginnerInteractor$ShowForBeginner3;
        ScootersBeginnerInteractor$ShowForBeginner scootersBeginnerInteractor$ShowForBeginner4 = new ScootersBeginnerInteractor$ShowForBeginner("SHOW_ONBOARDING_AND_AGREEMENT", 3);
        SHOW_ONBOARDING_AND_AGREEMENT = scootersBeginnerInteractor$ShowForBeginner4;
        ScootersBeginnerInteractor$ShowForBeginner[] scootersBeginnerInteractor$ShowForBeginnerArr = {scootersBeginnerInteractor$ShowForBeginner, scootersBeginnerInteractor$ShowForBeginner2, scootersBeginnerInteractor$ShowForBeginner3, scootersBeginnerInteractor$ShowForBeginner4};
        $VALUES = scootersBeginnerInteractor$ShowForBeginnerArr;
        $ENTRIES = kotlin.enums.a.a(scootersBeginnerInteractor$ShowForBeginnerArr);
    }

    public static ScootersBeginnerInteractor$ShowForBeginner valueOf(String str) {
        return (ScootersBeginnerInteractor$ShowForBeginner) Enum.valueOf(ScootersBeginnerInteractor$ShowForBeginner.class, str);
    }

    public static ScootersBeginnerInteractor$ShowForBeginner[] values() {
        return (ScootersBeginnerInteractor$ShowForBeginner[]) $VALUES.clone();
    }
}
