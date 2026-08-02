package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.aa;
import com.yandex.div2.e4;
import com.yandex.div2.j1;
import com.yandex.div2.o2;
import com.yandex.div2.q4;
import com.yandex.div2.s3;
import com.yandex.div2.y3;
import java.util.List;
import xsna.ikn;
import xsna.izs;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes7.dex */
public final class BaseDivViewExtensionsKt {
    public static final void applyAlignment(View view, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyAlignment(view, divAlignmentHorizontal, divAlignmentVertical);
    }

    public static final void applyBitmapFilters(View view, BindingContext bindingContext, Bitmap bitmap, List<? extends e4> list, izs<? super Bitmap, s3q0> izsVar) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyBitmapFilters(view, bindingContext, bitmap, list, izsVar);
    }

    public static final void applyDivActions(View view, BindingContext bindingContext, DivAction divAction, List<DivAction> list, List<DivAction> list2, List<DivAction> list3, List<DivAction> list4, List<DivAction> list5, List<DivAction> list6, List<DivAction> list7, DivAnimation divAnimation, Expression<Boolean> expression) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyDivActions(view, bindingContext, divAction, list, list2, list3, list4, list5, list6, list7, divAnimation, expression);
    }

    public static final void applyMargins(View view, y3 y3Var, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyMargins(view, y3Var, expressionResolver);
    }

    public static final void applyPaddings(View view, y3 y3Var, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyPaddings(view, y3Var, expressionResolver);
    }

    public static final void applyTransform(View view, ikn iknVar, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyTransform(view, iknVar, expressionResolver);
    }

    public static final void bindAspectRatio(View view, j1 j1Var, j1 j1Var2, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindAspectRatio(view, j1Var, j1Var2, expressionResolver);
    }

    public static final void bindClipChildren(ViewGroup viewGroup, Expression<Boolean> expression, Expression<Boolean> expression2, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindClipChildren(viewGroup, expression, expression2, expressionResolver);
    }

    public static final void bindItemBuilder(o2 o2Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindItemBuilder(o2Var, expressionResolver, izsVar);
    }

    public static final void bindStates(View view, BindingContext bindingContext, DivBinder divBinder) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindStates(view, bindingContext, divBinder);
    }

    public static final void clearFocusOnClick(View view, InputFocusTracker inputFocusTracker) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.clearFocusOnClick(view, inputFocusTracker);
    }

    public static final wzs<View, MotionEvent, Boolean> createAnimatedTouchListener(View view, BindingContext bindingContext, DivAnimation divAnimation, DivGestureListener divGestureListener) {
        return BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.createAnimatedTouchListener(view, bindingContext, divAnimation, divGestureListener);
    }

    public static final int dpToPx(Long l, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPx(l, displayMetrics);
    }

    public static final <T extends Number> float dpToPxF(T t, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPxF(t, displayMetrics);
    }

    public static final void drawShadow(View view, Canvas canvas) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.drawShadow(view, canvas);
    }

    public static final float fontSizeToPx(long j, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.fontSizeToPx(j, divSizeUnit, displayMetrics);
    }

    public static final void gainAccessibilityFocus(View view) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.gainAccessibilityFocus(view);
    }

    public static final BindingContext getBindingContext(View view) {
        return BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getBindingContext(view);
    }

    public static final <T extends Number> int pxToDp(T t, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToDp(t, displayMetrics);
    }

    public static final <T extends Number> float pxToDpF(T t, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToDpF(t, displayMetrics);
    }

    public static final int spToPx(Long l, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPx(l, displayMetrics);
    }

    public static final <T extends Number> float spToPxF(T t, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPxF(t, displayMetrics);
    }

    public static final int toAndroidUnit(DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toAndroidUnit(divSizeUnit);
    }

    public static final int toPx(long j, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(j, divSizeUnit, displayMetrics);
    }

    public static final float toPxF(long j, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPxF(j, divSizeUnit, displayMetrics);
    }

    public static final void trackVisibilityActions(ViewGroup viewGroup, Div2View div2View, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.trackVisibilityActions(viewGroup, div2View, list, list2);
    }

    public static final int unitToPx(Long l, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPx(l, displayMetrics, divSizeUnit);
    }

    public static final <T extends Number> float unitToPxF(T t, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPxF(t, displayMetrics, divSizeUnit);
    }

    public static final <T extends Number> int dpToPx(T t, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPx(t, displayMetrics);
    }

    public static final <T extends Number> int spToPx(T t, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPx(t, displayMetrics);
    }

    public static final int toPx(s3 s3Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(s3Var, displayMetrics, expressionResolver);
    }

    public static final float toPxF(q4 q4Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPxF(q4Var, displayMetrics, expressionResolver);
    }

    public static final <T extends Number> int unitToPx(T t, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPx(t, displayMetrics, divSizeUnit);
    }

    public static final int toPx(q4 q4Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(q4Var, displayMetrics, expressionResolver);
    }

    public static final int toPx(aa aaVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(aaVar, displayMetrics, expressionResolver);
    }
}
