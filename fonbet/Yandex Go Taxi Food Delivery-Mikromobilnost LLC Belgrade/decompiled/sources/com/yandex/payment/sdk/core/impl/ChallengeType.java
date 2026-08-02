package com.yandex.payment.sdk.core.impl;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/payment/sdk/core/impl/ChallengeType;", "", "", "challengeName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CHALLENGE_3DS", "CHALLENGE_CVV", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChallengeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChallengeType[] $VALUES;
    public static final ChallengeType CHALLENGE_3DS;
    public static final ChallengeType CHALLENGE_CVV;
    private final String challengeName;

    static {
        ChallengeType challengeType = new ChallengeType("CHALLENGE_3DS", 0, "3ds");
        CHALLENGE_3DS = challengeType;
        ChallengeType challengeType2 = new ChallengeType("CHALLENGE_CVV", 1, "cvv");
        CHALLENGE_CVV = challengeType2;
        ChallengeType[] challengeTypeArr = {challengeType, challengeType2};
        $VALUES = challengeTypeArr;
        $ENTRIES = a.a(challengeTypeArr);
    }

    public ChallengeType(String str, int i, String str2) {
        this.challengeName = str2;
    }

    public static ChallengeType valueOf(String str) {
        return (ChallengeType) Enum.valueOf(ChallengeType.class, str);
    }

    public static ChallengeType[] values() {
        return (ChallengeType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getChallengeName() {
        return this.challengeName;
    }
}
