package com.yandex.go.ai_widget.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/ai_widget/analytics/AIWidgetAnalytics$TextsEvaluatorReaction", "", "Lcom/yandex/go/ai_widget/analytics/AIWidgetAnalytics$TextsEvaluatorReaction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Like", "Dislike", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AIWidgetAnalytics$TextsEvaluatorReaction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AIWidgetAnalytics$TextsEvaluatorReaction[] $VALUES;
    public static final AIWidgetAnalytics$TextsEvaluatorReaction Dislike;
    public static final AIWidgetAnalytics$TextsEvaluatorReaction Like;
    private final String eventValue;

    static {
        AIWidgetAnalytics$TextsEvaluatorReaction aIWidgetAnalytics$TextsEvaluatorReaction = new AIWidgetAnalytics$TextsEvaluatorReaction("Like", 0, "like");
        Like = aIWidgetAnalytics$TextsEvaluatorReaction;
        AIWidgetAnalytics$TextsEvaluatorReaction aIWidgetAnalytics$TextsEvaluatorReaction2 = new AIWidgetAnalytics$TextsEvaluatorReaction("Dislike", 1, "dislike");
        Dislike = aIWidgetAnalytics$TextsEvaluatorReaction2;
        AIWidgetAnalytics$TextsEvaluatorReaction[] aIWidgetAnalytics$TextsEvaluatorReactionArr = {aIWidgetAnalytics$TextsEvaluatorReaction, aIWidgetAnalytics$TextsEvaluatorReaction2};
        $VALUES = aIWidgetAnalytics$TextsEvaluatorReactionArr;
        $ENTRIES = a.a(aIWidgetAnalytics$TextsEvaluatorReactionArr);
    }

    public AIWidgetAnalytics$TextsEvaluatorReaction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AIWidgetAnalytics$TextsEvaluatorReaction valueOf(String str) {
        return (AIWidgetAnalytics$TextsEvaluatorReaction) Enum.valueOf(AIWidgetAnalytics$TextsEvaluatorReaction.class, str);
    }

    public static AIWidgetAnalytics$TextsEvaluatorReaction[] values() {
        return (AIWidgetAnalytics$TextsEvaluatorReaction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
