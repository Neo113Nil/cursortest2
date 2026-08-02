package com.yandex.go.ai_widget.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ko1;
import defpackage.pn0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationItemType;", "", "Companion", "ko1", "ONBOARDING", "EVALUATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AiWidgetEvaluationItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AiWidgetEvaluationItemType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ko1 Companion;
    public static final AiWidgetEvaluationItemType EVALUATION;
    public static final AiWidgetEvaluationItemType ONBOARDING;

    static {
        AiWidgetEvaluationItemType aiWidgetEvaluationItemType = new AiWidgetEvaluationItemType("ONBOARDING", 0);
        ONBOARDING = aiWidgetEvaluationItemType;
        AiWidgetEvaluationItemType aiWidgetEvaluationItemType2 = new AiWidgetEvaluationItemType("EVALUATION", 1);
        EVALUATION = aiWidgetEvaluationItemType2;
        AiWidgetEvaluationItemType[] aiWidgetEvaluationItemTypeArr = {aiWidgetEvaluationItemType, aiWidgetEvaluationItemType2};
        $VALUES = aiWidgetEvaluationItemTypeArr;
        $ENTRIES = kotlin.enums.a.a(aiWidgetEvaluationItemTypeArr);
        Companion = new ko1();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(29));
    }

    public static AiWidgetEvaluationItemType valueOf(String str) {
        return (AiWidgetEvaluationItemType) Enum.valueOf(AiWidgetEvaluationItemType.class, str);
    }

    public static AiWidgetEvaluationItemType[] values() {
        return (AiWidgetEvaluationItemType[]) $VALUES.clone();
    }
}
