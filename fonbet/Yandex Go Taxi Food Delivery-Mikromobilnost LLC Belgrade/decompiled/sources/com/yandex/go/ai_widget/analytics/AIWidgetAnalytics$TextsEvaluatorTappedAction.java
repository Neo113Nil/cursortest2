package com.yandex.go.ai_widget.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/ai_widget/analytics/AIWidgetAnalytics$TextsEvaluatorTappedAction", "", "Lcom/yandex/go/ai_widget/analytics/AIWidgetAnalytics$TextsEvaluatorTappedAction;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Retry", "Close", "Done", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AIWidgetAnalytics$TextsEvaluatorTappedAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AIWidgetAnalytics$TextsEvaluatorTappedAction[] $VALUES;
    public static final AIWidgetAnalytics$TextsEvaluatorTappedAction Back;
    public static final AIWidgetAnalytics$TextsEvaluatorTappedAction Close;
    public static final AIWidgetAnalytics$TextsEvaluatorTappedAction Done;
    public static final AIWidgetAnalytics$TextsEvaluatorTappedAction Retry;
    private final String eventValue;

    static {
        AIWidgetAnalytics$TextsEvaluatorTappedAction aIWidgetAnalytics$TextsEvaluatorTappedAction = new AIWidgetAnalytics$TextsEvaluatorTappedAction("Back", 0, "back");
        Back = aIWidgetAnalytics$TextsEvaluatorTappedAction;
        AIWidgetAnalytics$TextsEvaluatorTappedAction aIWidgetAnalytics$TextsEvaluatorTappedAction2 = new AIWidgetAnalytics$TextsEvaluatorTappedAction("Retry", 1, "retry");
        Retry = aIWidgetAnalytics$TextsEvaluatorTappedAction2;
        AIWidgetAnalytics$TextsEvaluatorTappedAction aIWidgetAnalytics$TextsEvaluatorTappedAction3 = new AIWidgetAnalytics$TextsEvaluatorTappedAction("Close", 2, "close");
        Close = aIWidgetAnalytics$TextsEvaluatorTappedAction3;
        AIWidgetAnalytics$TextsEvaluatorTappedAction aIWidgetAnalytics$TextsEvaluatorTappedAction4 = new AIWidgetAnalytics$TextsEvaluatorTappedAction("Done", 3, "done");
        Done = aIWidgetAnalytics$TextsEvaluatorTappedAction4;
        AIWidgetAnalytics$TextsEvaluatorTappedAction[] aIWidgetAnalytics$TextsEvaluatorTappedActionArr = {aIWidgetAnalytics$TextsEvaluatorTappedAction, aIWidgetAnalytics$TextsEvaluatorTappedAction2, aIWidgetAnalytics$TextsEvaluatorTappedAction3, aIWidgetAnalytics$TextsEvaluatorTappedAction4};
        $VALUES = aIWidgetAnalytics$TextsEvaluatorTappedActionArr;
        $ENTRIES = a.a(aIWidgetAnalytics$TextsEvaluatorTappedActionArr);
    }

    public AIWidgetAnalytics$TextsEvaluatorTappedAction(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AIWidgetAnalytics$TextsEvaluatorTappedAction valueOf(String str) {
        return (AIWidgetAnalytics$TextsEvaluatorTappedAction) Enum.valueOf(AIWidgetAnalytics$TextsEvaluatorTappedAction.class, str);
    }

    public static AIWidgetAnalytics$TextsEvaluatorTappedAction[] values() {
        return (AIWidgetAnalytics$TextsEvaluatorTappedAction[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
