package com.yandex.div.core;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivPager;
import com.yandex.div2.j3;
import com.yandex.div2.v3;
import com.yandex.div2.zd;

/* loaded from: classes7.dex */
public interface Div2Logger {
    public static final Div2Logger STUB = new Div2Logger() { // from class: com.yandex.div.core.Div2Logger.1
    };

    default void logClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull DivAction divAction) {
    }

    default void logDoubleClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull DivAction divAction) {
    }

    default void logLongClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull DivAction divAction) {
    }

    default void logViewDisappeared(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull v3 v3Var) {
    }

    default void logViewShown(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull zd zdVar) {
    }

    default void logClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull DivAction divAction, @NonNull String str) {
        logClick(div2View, expressionResolver, view, divAction);
    }

    default void logDoubleClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull DivAction divAction, @NonNull String str) {
        logDoubleClick(div2View, expressionResolver, view, divAction);
    }

    default void logLongClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull DivAction divAction, @NonNull String str) {
        logLongClick(div2View, expressionResolver, view, divAction);
    }

    default void logViewDisappeared(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull v3 v3Var, @NonNull String str) {
        logViewDisappeared(div2View, expressionResolver, view, v3Var);
    }

    default void logViewShown(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull zd zdVar, @NonNull String str) {
        logViewShown(div2View, expressionResolver, view, zdVar);
    }

    default void logGalleryScroll(Div2View div2View) {
    }

    default void logTabTitlesScroll(Div2View div2View) {
    }

    default void logFrameCancelLimitExceeded(@NonNull Div2View div2View, @NonNull String str) {
    }

    default void logFrameCancelled(@NonNull Div2View div2View, @NonNull String str) {
    }

    default void logTabPageChanged(Div2View div2View, int i) {
    }

    default void logTrigger(Div2View div2View, DivAction divAction) {
    }

    default void logSliderDrag(Div2View div2View, View view, @Nullable Float f) {
    }

    default void logActiveTabTitleClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, int i, @NonNull DivAction divAction) {
    }

    default void logImeEnter(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull DivAction divAction) {
    }

    default void logSwipedAway(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull DivAction divAction) {
    }

    default void logBindingResult(@NonNull Div2View div2View, @Nullable j3 j3Var, @Nullable j3 j3Var2, @NonNull String str, @Nullable String str2) {
    }

    default void logFocusChanged(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull DivAction divAction, boolean z) {
    }

    default void logHoverChanged(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull DivAction divAction, boolean z) {
    }

    default void logPagerChangePage(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull DivPager divPager, int i, @NonNull String str) {
    }

    default void logPopupMenuItemClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, int i, @Nullable String str, @NonNull DivAction divAction) {
    }

    default void logPressChanged(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull DivAction divAction, boolean z) {
    }

    default void logGalleryCompleteScroll(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull DivGallery divGallery, int i, int i2, @NonNull String str) {
    }
}
