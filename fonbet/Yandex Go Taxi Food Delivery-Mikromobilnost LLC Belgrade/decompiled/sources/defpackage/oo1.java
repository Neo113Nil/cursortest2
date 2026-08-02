package defpackage;

import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationItemType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class oo1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AiWidgetEvaluationItemType.values().length];
        try {
            iArr[AiWidgetEvaluationItemType.ONBOARDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AiWidgetEvaluationItemType.EVALUATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
