package defpackage;

import ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class gni0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition.values().length];
        try {
            iArr[OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition.Always.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition.OnSelection.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition.OnSelectionAndWhenReferenceAppears.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
