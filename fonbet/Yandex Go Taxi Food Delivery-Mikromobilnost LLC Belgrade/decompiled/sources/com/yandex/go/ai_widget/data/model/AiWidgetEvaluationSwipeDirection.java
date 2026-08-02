package com.yandex.go.ai_widget.data.model;

import defpackage.ep1;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ro1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationSwipeDirection;", "", "Companion", "ep1", "RIGHT", "LEFT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AiWidgetEvaluationSwipeDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AiWidgetEvaluationSwipeDirection[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ep1 Companion;
    public static final AiWidgetEvaluationSwipeDirection LEFT;
    public static final AiWidgetEvaluationSwipeDirection RIGHT;

    static {
        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection = new AiWidgetEvaluationSwipeDirection("RIGHT", 0);
        RIGHT = aiWidgetEvaluationSwipeDirection;
        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection2 = new AiWidgetEvaluationSwipeDirection("LEFT", 1);
        LEFT = aiWidgetEvaluationSwipeDirection2;
        AiWidgetEvaluationSwipeDirection[] aiWidgetEvaluationSwipeDirectionArr = {aiWidgetEvaluationSwipeDirection, aiWidgetEvaluationSwipeDirection2};
        $VALUES = aiWidgetEvaluationSwipeDirectionArr;
        $ENTRIES = kotlin.enums.a.a(aiWidgetEvaluationSwipeDirectionArr);
        Companion = new ep1();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(2));
    }

    public static AiWidgetEvaluationSwipeDirection valueOf(String str) {
        return (AiWidgetEvaluationSwipeDirection) Enum.valueOf(AiWidgetEvaluationSwipeDirection.class, str);
    }

    public static AiWidgetEvaluationSwipeDirection[] values() {
        return (AiWidgetEvaluationSwipeDirection[]) $VALUES.clone();
    }
}
