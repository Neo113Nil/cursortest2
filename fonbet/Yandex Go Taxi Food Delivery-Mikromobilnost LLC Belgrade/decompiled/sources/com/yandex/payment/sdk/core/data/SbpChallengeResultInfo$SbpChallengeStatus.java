package com.yandex.payment.sdk.core.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/payment/sdk/core/data/SbpChallengeResultInfo$SbpChallengeStatus", "", "Lcom/yandex/payment/sdk/core/data/SbpChallengeResultInfo$SbpChallengeStatus;", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Correct", "Incorrect", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SbpChallengeResultInfo$SbpChallengeStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SbpChallengeResultInfo$SbpChallengeStatus[] $VALUES;
    public static final SbpChallengeResultInfo$SbpChallengeStatus Correct;
    public static final SbpChallengeResultInfo$SbpChallengeStatus Incorrect;
    private final String value;

    static {
        SbpChallengeResultInfo$SbpChallengeStatus sbpChallengeResultInfo$SbpChallengeStatus = new SbpChallengeResultInfo$SbpChallengeStatus("Correct", 0, "correct");
        Correct = sbpChallengeResultInfo$SbpChallengeStatus;
        SbpChallengeResultInfo$SbpChallengeStatus sbpChallengeResultInfo$SbpChallengeStatus2 = new SbpChallengeResultInfo$SbpChallengeStatus("Incorrect", 1, "incorrect");
        Incorrect = sbpChallengeResultInfo$SbpChallengeStatus2;
        SbpChallengeResultInfo$SbpChallengeStatus[] sbpChallengeResultInfo$SbpChallengeStatusArr = {sbpChallengeResultInfo$SbpChallengeStatus, sbpChallengeResultInfo$SbpChallengeStatus2};
        $VALUES = sbpChallengeResultInfo$SbpChallengeStatusArr;
        $ENTRIES = kotlin.enums.a.a(sbpChallengeResultInfo$SbpChallengeStatusArr);
    }

    public SbpChallengeResultInfo$SbpChallengeStatus(String str, int i, String str2) {
        this.value = str2;
    }

    public static SbpChallengeResultInfo$SbpChallengeStatus valueOf(String str) {
        return (SbpChallengeResultInfo$SbpChallengeStatus) Enum.valueOf(SbpChallengeResultInfo$SbpChallengeStatus.class, str);
    }

    public static SbpChallengeResultInfo$SbpChallengeStatus[] values() {
        return (SbpChallengeResultInfo$SbpChallengeStatus[]) $VALUES.clone();
    }

    public final boolean a() {
        return this == Correct;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
