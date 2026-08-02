package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/ChallengeState;", "", "UNKNOWN", "REQUIRED", "PASSED", "DENIED", "NOT_NEEDED", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChallengeState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChallengeState[] $VALUES;
    public static final ChallengeState DENIED;
    public static final ChallengeState NOT_NEEDED;
    public static final ChallengeState PASSED;
    public static final ChallengeState REQUIRED;
    public static final ChallengeState UNKNOWN;

    static {
        ChallengeState challengeState = new ChallengeState("UNKNOWN", 0);
        UNKNOWN = challengeState;
        ChallengeState challengeState2 = new ChallengeState("REQUIRED", 1);
        REQUIRED = challengeState2;
        ChallengeState challengeState3 = new ChallengeState("PASSED", 2);
        PASSED = challengeState3;
        ChallengeState challengeState4 = new ChallengeState("DENIED", 3);
        DENIED = challengeState4;
        ChallengeState challengeState5 = new ChallengeState("NOT_NEEDED", 4);
        NOT_NEEDED = challengeState5;
        ChallengeState[] challengeStateArr = {challengeState, challengeState2, challengeState3, challengeState4, challengeState5};
        $VALUES = challengeStateArr;
        $ENTRIES = kotlin.enums.a.a(challengeStateArr);
    }

    public static ChallengeState valueOf(String str) {
        return (ChallengeState) Enum.valueOf(ChallengeState.class, str);
    }

    public static ChallengeState[] values() {
        return (ChallengeState[]) $VALUES.clone();
    }
}
