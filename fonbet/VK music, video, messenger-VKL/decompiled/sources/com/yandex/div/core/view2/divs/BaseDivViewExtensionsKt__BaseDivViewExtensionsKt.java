package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.a;
import com.yandex.div2.e4;
import com.yandex.div2.hd;
import com.yandex.div2.j1;
import com.yandex.div2.o2;
import com.yandex.div2.v3;
import com.yandex.div2.x7;
import com.yandex.div2.y3;
import com.yandex.div2.y7;
import com.yandex.div2.zd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.apn;
import xsna.eon;
import xsna.g5g;
import xsna.ikn;
import xsna.izs;
import xsna.kxt0;
import xsna.mq;
import xsna.qj80;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: BaseDivViewExtensions.kt */
/* loaded from: classes7.dex */
final /* synthetic */ class BaseDivViewExtensionsKt__BaseDivViewExtensionsKt {

    /* compiled from: BaseDivViewExtensions.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            try {
                iArr[DivSizeUnit.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSizeUnit.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSizeUnit.SP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void applyAlignment(View view, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
        applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, divAlignmentVertical == DivAlignmentVertical.BASELINE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(AspectView aspectView, Double d) {
        aspectView.setAspectRatio(d != null ? (float) d.doubleValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    private static final void applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null || divLayoutParams.isBaselineAligned() == z) {
            return;
        }
        divLayoutParams.setBaselineAligned(z);
        view.requestLayout();
    }

    public static final void applyBitmapFilters(final View view, BindingContext bindingContext, final Bitmap bitmap, final List<? extends e4> list, final izs<? super Bitmap, s3q0> izsVar) {
        int i;
        List<? extends e4> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            izsVar.invoke(bitmap);
            return;
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final BitmapEffectHelper bitmapEffectHelper = bindingContext.getDivView().getDiv2Component$div_release().getBitmapEffectHelper();
        if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$applyBitmapFilters$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int i10;
                    view2.removeOnLayoutChangeListener(this);
                    float max = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (r4.getWidth() * max), (int) (max * bitmap.getHeight()), false);
                    for (e4 e4Var : list) {
                        if (e4Var instanceof e4.a) {
                            long longValue = ((e4.a) e4Var).b.a.evaluate(expressionResolver).longValue();
                            long j = longValue >> 31;
                            if (j == 0 || j == -1) {
                                i10 = (int) longValue;
                            } else {
                                KAssert kAssert = KAssert.INSTANCE;
                                if (Assert.isEnabled()) {
                                    mq.a(longValue, "Unable convert '", "' to Int");
                                }
                                i10 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                            }
                            createScaledBitmap = bitmapEffectHelper.blurBitmap(createScaledBitmap, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i10), view.getResources().getDisplayMetrics()));
                        } else if ((e4Var instanceof e4.b) && ViewsKt.isLayoutRtl(view)) {
                            createScaledBitmap = bitmapEffectHelper.mirrorBitmap(createScaledBitmap);
                        }
                    }
                    izsVar.invoke(createScaledBitmap);
                }
            });
            return;
        }
        float max = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * max), (int) (max * bitmap.getHeight()), false);
        for (e4 e4Var : list) {
            if (e4Var instanceof e4.a) {
                long longValue = ((e4.a) e4Var).b.a.evaluate(expressionResolver).longValue();
                long j = longValue >> 31;
                if (j == 0 || j == -1) {
                    i = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        mq.a(longValue, "Unable convert '", "' to Int");
                    }
                    i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                createScaledBitmap = bitmapEffectHelper.blurBitmap(createScaledBitmap, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i), view.getResources().getDisplayMetrics()));
            } else if ((e4Var instanceof e4.b) && ViewsKt.isLayoutRtl(view)) {
                createScaledBitmap = bitmapEffectHelper.mirrorBitmap(createScaledBitmap);
            }
        }
        izsVar.invoke(createScaledBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(ViewGroup viewGroup, boolean z) {
        DivHolderView divHolderView = viewGroup instanceof DivHolderView ? (DivHolderView) viewGroup : null;
        if (divHolderView != null) {
            divHolderView.setNeedClipping(z);
        }
        ViewParent parent = viewGroup.getParent();
        if (z || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).setClipChildren(false);
    }

    public static final void applyDivActions(View view, BindingContext bindingContext, DivAction divAction, List<DivAction> list, List<DivAction> list2, List<DivAction> list3, List<DivAction> list4, List<DivAction> list5, List<DivAction> list6, List<DivAction> list7, DivAnimation divAnimation, Expression<Boolean> expression) {
        DivActionBinder actionBinder = bindingContext.getDivView().getDiv2Component$div_release().getActionBinder();
        List<DivAction> list8 = list;
        if (list8 == null || list8.isEmpty()) {
            list = divAction != null ? Collections.singletonList(divAction) : null;
        }
        actionBinder.bindDivActions(bindingContext, view, list, list2, list3, list4, list5, list6, list7, divAnimation, expression);
    }

    private static final void applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getGravity() != i) {
                divLayoutParams.setGravity(i);
                view.requestLayout();
                return;
            }
            return;
        }
        Log.e("DivView", "tag=" + view.getTag() + ": Can't cast " + layoutParams + " to get gravity");
    }

    public static final void applyMargins(View view, y3 y3Var, ExpressionResolver expressionResolver) {
        int i;
        int i2;
        int i3;
        int i4;
        Integer num;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (y3Var != null) {
            DivSizeUnit evaluate = y3Var.g.evaluate(expressionResolver);
            i = BaseDivViewExtensionsKt.unitToPx(y3Var.c.evaluate(expressionResolver), displayMetrics, evaluate);
            i2 = BaseDivViewExtensionsKt.unitToPx(y3Var.f.evaluate(expressionResolver), displayMetrics, evaluate);
            i3 = BaseDivViewExtensionsKt.unitToPx(y3Var.d.evaluate(expressionResolver), displayMetrics, evaluate);
            i4 = BaseDivViewExtensionsKt.unitToPx(y3Var.a.evaluate(expressionResolver), displayMetrics, evaluate);
            Expression<Long> expression = y3Var.e;
            Integer valueOf = expression != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(expression.evaluate(expressionResolver), displayMetrics, evaluate)) : null;
            Expression<Long> expression2 = y3Var.b;
            num = expression2 != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(expression2.evaluate(expressionResolver), displayMetrics, evaluate)) : null;
            r3 = valueOf;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            num = null;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4 && ((r3 == null || marginLayoutParams.getMarginStart() == r3.intValue()) && (num == null || marginLayoutParams.getMarginEnd() == num.intValue()))) {
            return;
        }
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = i4;
        if (r3 == null && num == null) {
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i3;
        } else {
            marginLayoutParams.setMarginStart(r3 != null ? r3.intValue() : 0);
            marginLayoutParams.setMarginEnd(num != null ? num.intValue() : 0);
        }
        view.requestLayout();
    }

    public static final void applyPaddings(View view, y3 y3Var, ExpressionResolver expressionResolver) {
        if (y3Var == null) {
            view.setPadding(0, 0, 0, 0);
            return;
        }
        Expression<Long> expression = y3Var.a;
        Expression<Long> expression2 = y3Var.f;
        Expression<Long> expression3 = y3Var.b;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        DivSizeUnit evaluate = y3Var.g.evaluate(expressionResolver);
        Expression<Long> expression4 = y3Var.e;
        if (expression4 == null && expression3 == null) {
            view.setPadding(BaseDivViewExtensionsKt.toPx(y3Var.c.evaluate(expressionResolver).longValue(), evaluate, displayMetrics), BaseDivViewExtensionsKt.toPx(expression2.evaluate(expressionResolver).longValue(), evaluate, displayMetrics), BaseDivViewExtensionsKt.toPx(y3Var.d.evaluate(expressionResolver).longValue(), evaluate, displayMetrics), BaseDivViewExtensionsKt.toPx(expression.evaluate(expressionResolver).longValue(), evaluate, displayMetrics));
        } else {
            view.setPaddingRelative(expression4 != null ? BaseDivViewExtensionsKt.toPx(expression4.evaluate(expressionResolver).longValue(), evaluate, displayMetrics) : 0, BaseDivViewExtensionsKt.toPx(expression2.evaluate(expressionResolver).longValue(), evaluate, displayMetrics), expression3 != null ? BaseDivViewExtensionsKt.toPx(expression3.evaluate(expressionResolver).longValue(), evaluate, displayMetrics) : 0, BaseDivViewExtensionsKt.toPx(expression.evaluate(expressionResolver).longValue(), evaluate, displayMetrics));
        }
    }

    public static final void applyTransform(final View view, ikn iknVar, final ExpressionResolver expressionResolver) {
        s3q0 s3q0Var;
        Expression<Double> expression;
        final hd c = iknVar.c();
        if (c == null || (expression = c.c) == null) {
            s3q0Var = null;
        } else {
            view.setRotation((float) expression.evaluate(expressionResolver).doubleValue());
            s3q0Var = s3q0.a;
        }
        if (s3q0Var == null) {
            view.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (view.getWidth() == 0 && view.getHeight() == 0) {
            qj80.a(view, new Runnable() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$applyTransform$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    float pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt;
                    float pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt2;
                    View view2 = view;
                    pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt = BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view2, view2.getWidth(), c.a, expressionResolver);
                    view2.setPivotX(pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt);
                    View view3 = view;
                    pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt2 = BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view3, view3.getHeight(), c.b, expressionResolver);
                    view3.setPivotY(pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt2);
                }
            });
        } else {
            view.setPivotX(getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, view.getWidth(), c.a, expressionResolver));
            view.setPivotY(getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, view.getHeight(), c.b, expressionResolver));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindAspectRatio(final View view, j1 j1Var, j1 j1Var2, ExpressionResolver expressionResolver) {
        Expression<Double> expression;
        Expression<Double> expression2;
        if (view instanceof AspectView) {
            Disposable disposable = null;
            if (ExpressionsKt.equalsToConstant(j1Var != null ? j1Var.a : null, j1Var2 != null ? j1Var2.a : null)) {
                return;
            }
            applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((AspectView) view, (j1Var == null || (expression2 = j1Var.a) == null) ? null : expression2.evaluate(expressionResolver));
            if (ExpressionsKt.isConstantOrNull(j1Var != null ? j1Var.a : null) || !(view instanceof ExpressionSubscriber)) {
                return;
            }
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) view;
            if (j1Var != null && (expression = j1Var.a) != null) {
                disposable = expression.observe(expressionResolver, new izs<Double, s3q0>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindAspectRatio$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ s3q0 invoke(Double d) {
                        invoke(d.doubleValue());
                        return s3q0.a;
                    }

                    public final void invoke(double d) {
                        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((AspectView) view, Double.valueOf(d));
                    }
                });
            }
            expressionSubscriber.addSubscription(disposable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindClipChildren(final ViewGroup viewGroup, Expression<Boolean> expression, Expression<Boolean> expression2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(viewGroup, expression.evaluate(expressionResolver).booleanValue());
        if (ExpressionsKt.isConstant(expression)) {
            return;
        }
        DivHolderView divHolderView = viewGroup instanceof DivHolderView ? (DivHolderView) viewGroup : null;
        if (divHolderView != null) {
            divHolderView.addSubscription(expression.observe(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindClipChildren$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return s3q0.a;
                }

                public final void invoke(boolean z) {
                    BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(viewGroup, z);
                }
            }));
        }
    }

    public static final void bindItemBuilder(o2 o2Var, ExpressionResolver expressionResolver, izs<Object, s3q0> izsVar) {
        o2Var.a.observe(expressionResolver, izsVar);
        ExpressionResolver itemResolver = DivCollectionExtensionsKt.getItemResolver(o2Var, expressionResolver);
        Iterator<T> it = o2Var.c.iterator();
        while (it.hasNext()) {
            ((o2.a) it.next()).c.observe(itemResolver, izsVar);
        }
    }

    public static final void bindStates(View view, final BindingContext bindingContext, final DivBinder divBinder) {
        traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, new izs<View, Boolean>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindStates$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final Boolean invoke(View view2) {
                DivStatePath path;
                if (!(view2 instanceof DivStateLayout)) {
                    return Boolean.TRUE;
                }
                DivStateLayout divStateLayout = (DivStateLayout) view2;
                a.m div = divStateLayout.getDiv();
                if (div != null && (path = divStateLayout.getPath()) != null) {
                    DivBinder.this.bind(bindingContext, view2, div, path.parentState());
                    return Boolean.FALSE;
                }
                return Boolean.FALSE;
            }
        });
    }

    public static final void clearFocusOnClick(View view, InputFocusTracker inputFocusTracker) {
        if (view.isFocused() || !view.isInTouchMode()) {
            return;
        }
        inputFocusTracker.removeFocusFromFocusedInput();
    }

    public static final wzs<View, MotionEvent, Boolean> createAnimatedTouchListener(View view, BindingContext bindingContext, DivAnimation divAnimation, DivGestureListener divGestureListener) {
        final GestureDetector gestureDetector;
        final wzs<View, MotionEvent, s3q0> asTouchListener = divAnimation != null ? UtilsKt.asTouchListener(divAnimation, bindingContext.getExpressionResolver(), view) : null;
        if (divGestureListener != null) {
            if (((divGestureListener.getOnSingleTapListener() == null && divGestureListener.getOnDoubleTapListener() == null) ? null : divGestureListener) != null) {
                gestureDetector = new GestureDetector(bindingContext.getDivView().getContext$div_release(), divGestureListener, new Handler(Looper.getMainLooper()));
                if (asTouchListener == null || gestureDetector != null) {
                    return new wzs<View, MotionEvent, Boolean>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // xsna.wzs
                        public final Boolean invoke(View view2, MotionEvent motionEvent) {
                            wzs<View, MotionEvent, s3q0> wzsVar = asTouchListener;
                            if (wzsVar != null) {
                                wzsVar.invoke(view2, motionEvent);
                            }
                            GestureDetector gestureDetector2 = gestureDetector;
                            return Boolean.valueOf(gestureDetector2 != null ? gestureDetector2.onTouchEvent(motionEvent) : false);
                        }
                    };
                }
                return null;
            }
        }
        gestureDetector = null;
        if (asTouchListener == null) {
        }
        return new wzs<View, MotionEvent, Boolean>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // xsna.wzs
            public final Boolean invoke(View view2, MotionEvent motionEvent) {
                wzs<View, MotionEvent, s3q0> wzsVar = asTouchListener;
                if (wzsVar != null) {
                    wzsVar.invoke(view2, motionEvent);
                }
                GestureDetector gestureDetector2 = gestureDetector;
                return Boolean.valueOf(gestureDetector2 != null ? gestureDetector2.onTouchEvent(motionEvent) : false);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void drawShadow(View view, Canvas canvas) {
        DivBorderDrawer divBorderDrawer;
        int save = canvas.save();
        try {
            canvas.translate(view.getX(), view.getY());
            canvas.rotate(view.getRotation(), view.getPivotX(), view.getPivotY());
            DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
            if (divBorderSupports != null && (divBorderDrawer = divBorderSupports.getDivBorderDrawer()) != null) {
                divBorderDrawer.drawShadow(canvas);
            }
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public static final void gainAccessibilityFocus(View view) {
        view.performAccessibilityAction(64, null);
        view.sendAccessibilityEvent(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final BindingContext getBindingContext(View view) {
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        if (divHolderView != null) {
            return divHolderView.getBindingContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, int i, x7 x7Var, ExpressionResolver expressionResolver) {
        Object b = x7Var.b();
        if (!(b instanceof y7)) {
            return b instanceof eon ? (((float) ((eon) b).a.evaluate(expressionResolver).doubleValue()) / 100.0f) * i : i / 2.0f;
        }
        y7 y7Var = (y7) b;
        Expression<Long> expression = y7Var.b;
        if (expression == null) {
            return i / 2.0f;
        }
        float longValue = expression.evaluate(expressionResolver).longValue();
        int i2 = WhenMappings.$EnumSwitchMapping$0[y7Var.a.evaluate(expressionResolver).ordinal()];
        if (i2 == 1) {
            return BaseDivViewExtensionsKt.dpToPxF(Float.valueOf(longValue), view.getResources().getDisplayMetrics());
        }
        if (i2 == 2) {
            return longValue;
        }
        if (i2 == 3) {
            return BaseDivViewExtensionsKt.spToPxF(Float.valueOf(longValue), view.getResources().getDisplayMetrics());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void trackVisibilityActions(final ViewGroup viewGroup, final Div2View div2View, final List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2) {
        final DivVisibilityActionTracker visibilityActionTracker = div2View.getDiv2Component$div_release().getVisibilityActionTracker();
        List<DivItemBuilderResult> list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                g5g.y(DivUtilKt.getAllSightActions(((DivItemBuilderResult) it.next()).getDiv().b()), arrayList);
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(((apn) it2.next()).a());
            }
            for (DivItemBuilderResult divItemBuilderResult : list2) {
                List<zd> allAppearActions = DivUtilKt.getAllAppearActions(divItemBuilderResult.getDiv().b());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : allAppearActions) {
                    if (!hashSet.contains(((zd) obj).c)) {
                        arrayList2.add(obj);
                    }
                }
                List<v3> allDisappearActions = DivUtilKt.getAllDisappearActions(divItemBuilderResult.getDiv().b());
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : allDisappearActions) {
                    if (!hashSet.contains(((v3) obj2).d)) {
                        arrayList3.add(obj2);
                    }
                }
                visibilityActionTracker.trackVisibilityActionsOf(div2View, divItemBuilderResult.getExpressionResolver(), null, divItemBuilderResult.getDiv(), arrayList2, arrayList3);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$trackVisibilityActions$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                ViewGroup viewGroup2 = viewGroup;
                List list4 = list;
                kxt0 kxt0Var = new kxt0(viewGroup2);
                Iterator it3 = list4.iterator();
                while (true) {
                    if (!(kxt0Var.hasNext() && it3.hasNext())) {
                        return;
                    }
                    Pair pair = new Pair(kxt0Var.next(), it3.next());
                    View view2 = (View) pair.d();
                    DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) pair.g();
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, div2View, divItemBuilderResult2.getExpressionResolver(), view2, divItemBuilderResult2.getDiv(), null, null, 48, null);
                }
            }
        });
    }

    private static final void traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, izs<? super View, Boolean> izsVar) {
        if (izsVar.invoke(view).booleanValue() && (view instanceof ViewGroup)) {
            kxt0 kxt0Var = new kxt0((ViewGroup) view);
            while (kxt0Var.hasNext()) {
                traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(kxt0Var.next(), izsVar);
            }
        }
    }
}
