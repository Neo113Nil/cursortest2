package com.yandex.div.core.actions;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.NoWhenBranchMatchedException;
import xsna.kqn;

/* compiled from: DivActionTypedUtils.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedUtilsKt {
    public static final void closeKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    public static final Integer colorIntValue(kqn kqnVar, ExpressionResolver expressionResolver) {
        if (kqnVar instanceof kqn.c) {
            return ((kqn.c) kqnVar).b.a.evaluate(expressionResolver);
        }
        return null;
    }

    public static final Double doubleValue(kqn kqnVar, ExpressionResolver expressionResolver) {
        if (kqnVar instanceof kqn.e) {
            return Double.valueOf(((kqn.e) kqnVar).b.a.evaluate(expressionResolver).longValue());
        }
        if (kqnVar instanceof kqn.f) {
            return ((kqn.f) kqnVar).b.a.evaluate(expressionResolver);
        }
        return null;
    }

    public static final Object evaluate(kqn kqnVar, ExpressionResolver expressionResolver) {
        if (kqnVar instanceof kqn.e) {
            return ((kqn.e) kqnVar).b.a.evaluate(expressionResolver);
        }
        if (kqnVar instanceof kqn.g) {
            return ((kqn.g) kqnVar).b.a.evaluate(expressionResolver);
        }
        if (kqnVar instanceof kqn.b) {
            return ((kqn.b) kqnVar).b.a.evaluate(expressionResolver);
        }
        if (kqnVar instanceof kqn.c) {
            return ((kqn.c) kqnVar).b.a.evaluate(expressionResolver);
        }
        if (kqnVar instanceof kqn.f) {
            return ((kqn.f) kqnVar).b.a.evaluate(expressionResolver);
        }
        if (kqnVar instanceof kqn.h) {
            return ((kqn.h) kqnVar).b.a.evaluate(expressionResolver);
        }
        if (kqnVar instanceof kqn.a) {
            return ((kqn.a) kqnVar).b.a.evaluate(expressionResolver);
        }
        if (kqnVar instanceof kqn.d) {
            return ((kqn.d) kqnVar).b.a.evaluate(expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void logError(Div2View div2View, Throwable th) {
        div2View.getViewComponent$div_release().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logError(th);
    }

    public static final void logWarning(Div2View div2View, Throwable th) {
        div2View.getViewComponent$div_release().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(th);
    }

    public static final Long longValue(kqn kqnVar, ExpressionResolver expressionResolver) {
        if (kqnVar instanceof kqn.e) {
            return ((kqn.e) kqnVar).b.a.evaluate(expressionResolver);
        }
        return null;
    }

    public static final void openKeyboard(DivInputView divInputView) {
        InputMethodManager inputMethodManager = (InputMethodManager) divInputView.getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(divInputView, 1);
        }
    }
}
