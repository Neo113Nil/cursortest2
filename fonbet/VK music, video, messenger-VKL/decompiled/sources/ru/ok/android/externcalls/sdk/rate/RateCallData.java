package ru.ok.android.externcalls.sdk.rate;

import java.util.List;

/* compiled from: RateCallData.kt */
/* loaded from: classes9.dex */
public final class RateCallData {
    private final int maxRateForQuestion;
    private final List<Question> questions;

    public RateCallData(int i, List<Question> list) {
        this.maxRateForQuestion = i;
        this.questions = list;
    }

    public final int getMaxRateForQuestion() {
        return this.maxRateForQuestion;
    }

    public final List<Question> getQuestions() {
        return this.questions;
    }
}
