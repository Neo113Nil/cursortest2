package com.yandex.go.taxi.order.feedback.domain.model;

import com.yandex.div.state.db.StateEntry;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/taxi/order/feedback/domain/model/FeedbackQuestionSource;", "", "", StateEntry.COLUMN_PATH, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TAXI", "SHUTTLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FeedbackQuestionSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FeedbackQuestionSource[] $VALUES;
    public static final FeedbackQuestionSource SHUTTLE;
    public static final FeedbackQuestionSource TAXI;
    private final String path;

    static {
        FeedbackQuestionSource feedbackQuestionSource = new FeedbackQuestionSource("TAXI", 0, "/4.0/passenger-feedback/v1/feedback-proposal");
        TAXI = feedbackQuestionSource;
        FeedbackQuestionSource feedbackQuestionSource2 = new FeedbackQuestionSource("SHUTTLE", 1, "shuttle-control/v1/feedback-proposal");
        SHUTTLE = feedbackQuestionSource2;
        FeedbackQuestionSource[] feedbackQuestionSourceArr = {feedbackQuestionSource, feedbackQuestionSource2};
        $VALUES = feedbackQuestionSourceArr;
        $ENTRIES = a.a(feedbackQuestionSourceArr);
    }

    public FeedbackQuestionSource(String str, int i, String str2) {
        this.path = str2;
    }

    public static FeedbackQuestionSource valueOf(String str) {
        return (FeedbackQuestionSource) Enum.valueOf(FeedbackQuestionSource.class, str);
    }

    public static FeedbackQuestionSource[] values() {
        return (FeedbackQuestionSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getPath() {
        return this.path;
    }
}
