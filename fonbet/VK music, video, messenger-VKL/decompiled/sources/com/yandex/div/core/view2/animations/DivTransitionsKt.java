package com.yandex.div.core.view2.animations;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.j3;
import com.yandex.div2.ma;
import java.util.List;

/* compiled from: DivTransitions.kt */
/* loaded from: classes7.dex */
public final class DivTransitionsKt {

    /* compiled from: DivTransitions.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivTransitionSelector.values().length];
            try {
                iArr[DivTransitionSelector.DATA_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivTransitionSelector.ANY_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivTransitionSelector.STATE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean allowsTransitionsOnDataChange(DivTransitionSelector divTransitionSelector) {
        int i = WhenMappings.$EnumSwitchMapping$0[divTransitionSelector.ordinal()];
        return i == 1 || i == 2;
    }

    public static final boolean allowsTransitionsOnStateChange(DivTransitionSelector divTransitionSelector) {
        int i = WhenMappings.$EnumSwitchMapping$0[divTransitionSelector.ordinal()];
        return i == 2 || i == 3;
    }

    public static final boolean allowsTransitionsOnVisibilityChange(List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.VISIBILITY_CHANGE);
    }

    public static final boolean allowsTransitionsOnDataChange(List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.DATA_CHANGE);
    }

    public static final boolean allowsTransitionsOnStateChange(List<? extends DivTransitionTrigger> list) {
        return list.contains(DivTransitionTrigger.STATE_CHANGE);
    }

    public static final boolean allowsTransitionsOnDataChange(j3 j3Var, ExpressionResolver expressionResolver) {
        return allowsTransitionsOnDataChange(j3Var.e.evaluate(expressionResolver));
    }

    public static final boolean allowsTransitionsOnStateChange(ma maVar, ExpressionResolver expressionResolver) {
        return allowsTransitionsOnStateChange(maVar.L.evaluate(expressionResolver));
    }
}
