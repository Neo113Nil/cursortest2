package com.yandex.div.core.util;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.animation.EaseInInterpolator;
import com.yandex.div.core.animation.EaseInOutInterpolator;
import com.yandex.div.core.animation.EaseInterpolator;
import com.yandex.div.core.animation.EaseOutInterpolator;
import com.yandex.div.core.animation.ReverseInterpolatorKt;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.drawable.CircleDrawable;
import com.yandex.div.internal.drawable.RoundedRectDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.a;
import com.yandex.div2.e5;
import com.yandex.div2.j1;
import com.yandex.div2.ma;
import com.yandex.div2.q9;
import com.yandex.div2.u1;
import com.yandex.div2.v3;
import com.yandex.div2.v9;
import com.yandex.div2.va;
import com.yandex.div2.y2;
import com.yandex.div2.zd;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.apn;
import xsna.e43;
import xsna.epx;
import xsna.ikn;
import xsna.j5g;
import xsna.ukn;
import xsna.von;

/* compiled from: DivUtil.kt */
/* loaded from: classes7.dex */
public final class DivUtilKt {

    /* compiled from: DivUtil.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[DivAnimationInterpolator.values().length];
            try {
                iArr[DivAnimationInterpolator.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE_IN_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivAnimationInterpolator.SPRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivAnimationDirection.values().length];
            try {
                iArr2[DivAnimationDirection.REVERSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DivAnimationDirection.ALTERNATE_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DivAnimationDirection.ALTERNATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivAlignmentHorizontal.values().length];
            try {
                iArr3[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[DivAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[DivAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivAlignmentVertical.values().length];
            try {
                iArr4[DivAlignmentVertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[DivAlignmentVertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[DivAlignmentVertical.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[DivContentAlignmentHorizontal.values().length];
            try {
                iArr5[DivContentAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.SPACE_AROUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.SPACE_BETWEEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.SPACE_EVENLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[DivContentAlignmentVertical.values().length];
            try {
                iArr6[DivContentAlignmentVertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[DivContentAlignmentVertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[DivContentAlignmentVertical.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[DivContentAlignmentVertical.SPACE_AROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[DivContentAlignmentVertical.SPACE_BETWEEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[DivContentAlignmentVertical.SPACE_EVENLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr6[DivContentAlignmentVertical.BASELINE.ordinal()] = 7;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[DivBlendMode.values().length];
            try {
                iArr7[DivBlendMode.SOURCE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[DivBlendMode.SOURCE_ATOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr7[DivBlendMode.DARKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr7[DivBlendMode.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr7[DivBlendMode.MULTIPLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr7[DivBlendMode.SCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[DivImageScale.values().length];
            try {
                iArr8[DivImageScale.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr8[DivImageScale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr8[DivImageScale.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr8[DivImageScale.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    public static final Interpolator androidInterpolator(DivAnimationInterpolator divAnimationInterpolator, boolean z) {
        return z ? ReverseInterpolatorKt.reversed(getAndroidInterpolator(divAnimationInterpolator)) : getAndroidInterpolator(divAnimationInterpolator);
    }

    public static final boolean canBeReused(a aVar, a aVar2, ExpressionResolver expressionResolver) {
        if (!epx.f(getType(aVar), getType(aVar2))) {
            return false;
        }
        ikn b = aVar.b();
        ikn b2 = aVar2.b();
        return ((b instanceof e5) && (b2 instanceof e5)) ? epx.f(((e5) b).B.evaluate(expressionResolver), ((e5) b2).B.evaluate(expressionResolver)) : b.getBackground() == b2.getBackground();
    }

    private static final boolean canWrap(v9 v9Var, ExpressionResolver expressionResolver) {
        Expression<Boolean> expression;
        return !(v9Var instanceof v9.c) || ((expression = ((v9.c) v9Var).b.a) != null && expression.evaluate(expressionResolver).booleanValue());
    }

    public static final boolean containsStateInnerTransitions(a aVar, ExpressionResolver expressionResolver) {
        ikn b = aVar.b();
        if (b.q() != null || b.t() != null || b.k() != null) {
            return true;
        }
        if (aVar instanceof a.C2110a) {
            List<DivItemBuilderResult> buildItems = DivCollectionExtensionsKt.buildItems(((a.C2110a) aVar).c, expressionResolver);
            if (!(buildItems instanceof Collection) || !buildItems.isEmpty()) {
                for (DivItemBuilderResult divItemBuilderResult : buildItems) {
                    if (containsStateInnerTransitions(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver())) {
                        return true;
                    }
                }
            }
        } else {
            if (!(aVar instanceof a.e)) {
                if ((aVar instanceof a.p) || (aVar instanceof a.f) || (aVar instanceof a.d) || (aVar instanceof a.k) || (aVar instanceof a.g) || (aVar instanceof a.m) || (aVar instanceof a.c) || (aVar instanceof a.i) || (aVar instanceof a.o) || (aVar instanceof a.b) || (aVar instanceof a.j) || (aVar instanceof a.l) || (aVar instanceof a.q) || (aVar instanceof a.h) || (aVar instanceof a.n)) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            List<a> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(((a.e) aVar).c);
            if (!(nonNullItems instanceof Collection) || !nonNullItems.isEmpty()) {
                Iterator<T> it = nonNullItems.iterator();
                while (it.hasNext()) {
                    if (containsStateInnerTransitions((a) it.next(), expressionResolver)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int evaluateGravity(DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        int i;
        int i2 = divAlignmentHorizontal == null ? -1 : WhenMappings.$EnumSwitchMapping$2[divAlignmentHorizontal.ordinal()];
        if (i2 == 1) {
            i = 3;
        } else if (i2 != 2) {
            i = 5;
            if (i2 != 3) {
                i = (i2 == 4 || i2 != 5) ? 8388611 : 8388613;
            }
        } else {
            i = 1;
        }
        int i3 = divAlignmentVertical != null ? WhenMappings.$EnumSwitchMapping$3[divAlignmentVertical.ordinal()] : -1;
        int i4 = 48;
        if (i3 != 1) {
            if (i3 == 2) {
                i4 = 16;
            } else if (i3 == 3) {
                i4 = 80;
            }
        }
        return i4 | i;
    }

    public static final List<zd> getAllAppearActions(ikn iknVar) {
        List<zd> s = iknVar.s();
        if (s != null) {
            return s;
        }
        zd z = iknVar.z();
        List<zd> singletonList = z != null ? Collections.singletonList(z) : null;
        return singletonList == null ? EmptyList.b : singletonList;
    }

    public static final List<v3> getAllDisappearActions(ikn iknVar) {
        List<v3> u = iknVar.u();
        return u == null ? EmptyList.b : u;
    }

    public static final List<apn> getAllSightActions(ikn iknVar) {
        return j5g.u0(getAllAppearActions(iknVar), getAllDisappearActions(iknVar));
    }

    public static final Interpolator getAndroidInterpolator(DivAnimationInterpolator divAnimationInterpolator) {
        switch (WhenMappings.$EnumSwitchMapping$0[divAnimationInterpolator.ordinal()]) {
            case 1:
                return new LinearInterpolator();
            case 2:
                return new EaseInterpolator();
            case 3:
                return new EaseInInterpolator();
            case 4:
                return new EaseOutInterpolator();
            case 5:
                return new EaseInOutInterpolator();
            case 6:
                return new SpringInterpolator();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final float[] getCornerRadii(u1 u1Var, float f, float f2, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<Long> expression;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        y2 y2Var = u1Var.b;
        y2 y2Var2 = u1Var.b;
        Expression<Long> expression5 = u1Var.a;
        if (y2Var == null || (expression = y2Var.c) == null) {
            expression = expression5;
        }
        float dpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? expression.evaluate(expressionResolver) : null, displayMetrics);
        if (y2Var2 == null || (expression2 = y2Var2.d) == null) {
            expression2 = expression5;
        }
        float dpToPx2 = BaseDivViewExtensionsKt.dpToPx(expression2 != null ? expression2.evaluate(expressionResolver) : null, displayMetrics);
        if (y2Var2 == null || (expression3 = y2Var2.a) == null) {
            expression3 = expression5;
        }
        float dpToPx3 = BaseDivViewExtensionsKt.dpToPx(expression3 != null ? expression3.evaluate(expressionResolver) : null, displayMetrics);
        if (y2Var2 != null && (expression4 = y2Var2.b) != null) {
            expression5 = expression4;
        }
        float dpToPx4 = BaseDivViewExtensionsKt.dpToPx(expression5 != null ? expression5.evaluate(expressionResolver) : null, displayMetrics);
        Float f3 = (Float) Collections.min(e43.l(Float.valueOf(f / (dpToPx + dpToPx2)), Float.valueOf(f / (dpToPx3 + dpToPx4)), Float.valueOf(f2 / (dpToPx + dpToPx3)), Float.valueOf(f2 / (dpToPx2 + dpToPx4))));
        if (f3.floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3.floatValue() < 1.0f) {
            dpToPx *= f3.floatValue();
            dpToPx2 *= f3.floatValue();
            dpToPx3 *= f3.floatValue();
            dpToPx4 *= f3.floatValue();
        }
        return new float[]{dpToPx, dpToPx, dpToPx2, dpToPx2, dpToPx4, dpToPx4, dpToPx3, dpToPx3};
    }

    public static final ma.a getDefaultState(ma maVar, ExpressionResolver expressionResolver) {
        Object obj;
        Expression<String> expression = maVar.n;
        List<ma.a> list = maVar.I;
        if (expression != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((ma.a) obj).d, expression.evaluate(expressionResolver))) {
                    break;
                }
            }
            ma.a aVar = (ma.a) obj;
            if (aVar != null) {
                return aVar;
            }
        }
        return (ma.a) j5g.a0(list);
    }

    public static final boolean getHasSightActions(ikn iknVar) {
        if (iknVar.z() != null) {
            return true;
        }
        List<zd> s = iknVar.s();
        if (s != null && !s.isEmpty()) {
            return true;
        }
        List<v3> u = iknVar.u();
        return (u == null || u.isEmpty()) ? false : true;
    }

    public static final String getType(a aVar) {
        if (aVar instanceof a.p) {
            return "text";
        }
        if (aVar instanceof a.f) {
            return "image";
        }
        if (aVar instanceof a.d) {
            return "gif";
        }
        if (aVar instanceof a.k) {
            return "separator";
        }
        if (aVar instanceof a.g) {
            return "indicator";
        }
        if (aVar instanceof a.l) {
            return "slider";
        }
        if (aVar instanceof a.h) {
            return "input";
        }
        if (aVar instanceof a.q) {
            return "video";
        }
        if (aVar instanceof a.C2110a) {
            return "container";
        }
        if (aVar instanceof a.e) {
            return "grid";
        }
        if (aVar instanceof a.m) {
            return "state";
        }
        if (aVar instanceof a.c) {
            return "gallery";
        }
        if (aVar instanceof a.i) {
            return "pager";
        }
        if (aVar instanceof a.o) {
            return "tabs";
        }
        if (aVar instanceof a.b) {
            return "custom";
        }
        if (aVar instanceof a.j) {
            return "select";
        }
        if (aVar instanceof a.n) {
            return "switch";
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final float getWidthPxF(va vaVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt.unitToPxF(vaVar.d.evaluate(expressionResolver), displayMetrics, vaVar.c.evaluate(expressionResolver));
    }

    public static final boolean isAlternated(DivAnimationDirection divAnimationDirection) {
        int i = WhenMappings.$EnumSwitchMapping$1[divAnimationDirection.ordinal()];
        return i == 2 || i == 3;
    }

    public static final boolean isBranch(a aVar) {
        if ((aVar instanceof a.p) || (aVar instanceof a.f) || (aVar instanceof a.d) || (aVar instanceof a.k) || (aVar instanceof a.g) || (aVar instanceof a.l) || (aVar instanceof a.h) || (aVar instanceof a.b) || (aVar instanceof a.j) || (aVar instanceof a.q) || (aVar instanceof a.n)) {
            return false;
        }
        if ((aVar instanceof a.C2110a) || (aVar instanceof a.e) || (aVar instanceof a.c) || (aVar instanceof a.i) || (aVar instanceof a.o) || (aVar instanceof a.m)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isHorizontal(DivContainer divContainer, ExpressionResolver expressionResolver) {
        return divContainer.I.evaluate(expressionResolver) == DivContainer.Orientation.HORIZONTAL;
    }

    public static final boolean isLeaf(a aVar) {
        return !isBranch(aVar);
    }

    public static final boolean isReversed(DivAnimationDirection divAnimationDirection) {
        int i = WhenMappings.$EnumSwitchMapping$1[divAnimationDirection.ordinal()];
        return i == 1 || i == 2;
    }

    public static final boolean isWrapContainer(DivContainer divContainer, ExpressionResolver expressionResolver) {
        if (divContainer.C.evaluate(expressionResolver) != DivContainer.LayoutMode.WRAP || divContainer.I.evaluate(expressionResolver) == DivContainer.Orientation.OVERLAP) {
            return false;
        }
        if (isHorizontal(divContainer, expressionResolver)) {
            return canWrap(divContainer.b0, expressionResolver);
        }
        if (canWrap(divContainer.v, expressionResolver)) {
            return true;
        }
        j1 j1Var = divContainer.i;
        if (j1Var != null) {
            return !(((float) j1Var.a.evaluate(expressionResolver).doubleValue()) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return false;
    }

    public static final DivAlignmentHorizontal toAlignmentHorizontal(DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
        int i = WhenMappings.$EnumSwitchMapping$4[divContentAlignmentHorizontal.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? DivAlignmentHorizontal.START : DivAlignmentHorizontal.END : DivAlignmentHorizontal.START : DivAlignmentHorizontal.RIGHT : DivAlignmentHorizontal.CENTER : DivAlignmentHorizontal.LEFT;
    }

    public static final DivAlignmentVertical toAlignmentVertical(DivContentAlignmentVertical divContentAlignmentVertical) {
        int i = WhenMappings.$EnumSwitchMapping$5[divContentAlignmentVertical.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 7 ? DivAlignmentVertical.TOP : DivAlignmentVertical.BASELINE : DivAlignmentVertical.BOTTOM : DivAlignmentVertical.CENTER : DivAlignmentVertical.TOP;
    }

    public static final Drawable toDrawable(ukn uknVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (uknVar instanceof ukn.a) {
            return toDrawable(((ukn.a) uknVar).b, displayMetrics, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AspectImageView.Scale toImageScale(DivImageScale divImageScale) {
        int i = WhenMappings.$EnumSwitchMapping$7[divImageScale.ordinal()];
        if (i == 1) {
            return AspectImageView.Scale.NO_SCALE;
        }
        if (i == 2) {
            return AspectImageView.Scale.FIT;
        }
        if (i == 3) {
            return AspectImageView.Scale.FILL;
        }
        if (i == 4) {
            return AspectImageView.Scale.STRETCH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int toLayoutParamsSize(v9 v9Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ViewGroup.LayoutParams layoutParams) {
        if (v9Var == null) {
            return -2;
        }
        if (v9Var instanceof v9.b) {
            return -1;
        }
        if (v9Var instanceof v9.a) {
            return BaseDivViewExtensionsKt.toPx(((v9.a) v9Var).b, displayMetrics, expressionResolver);
        }
        if (!(v9Var instanceof v9.c)) {
            throw new NoWhenBranchMatchedException();
        }
        Expression<Boolean> expression = ((v9.c) v9Var).b.a;
        return (expression != null && expression.evaluate(expressionResolver).booleanValue() && (layoutParams instanceof DivLayoutParams)) ? -3 : -2;
    }

    public static /* synthetic */ int toLayoutParamsSize$default(v9 v9Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 4) != 0) {
            layoutParams = null;
        }
        return toLayoutParamsSize(v9Var, displayMetrics, expressionResolver, layoutParams);
    }

    public static final PorterDuff.Mode toPorterDuffMode(DivBlendMode divBlendMode) {
        switch (WhenMappings.$EnumSwitchMapping$6[divBlendMode.ordinal()]) {
            case 1:
                return PorterDuff.Mode.SRC_IN;
            case 2:
                return PorterDuff.Mode.SRC_ATOP;
            case 3:
                return PorterDuff.Mode.DARKEN;
            case 4:
                return PorterDuff.Mode.LIGHTEN;
            case 5:
                return PorterDuff.Mode.MULTIPLY;
            case 6:
                return PorterDuff.Mode.SCREEN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int evaluateGravity(DivContentAlignmentHorizontal divContentAlignmentHorizontal, DivContentAlignmentVertical divContentAlignmentVertical) {
        int i = 8388611;
        switch (divContentAlignmentHorizontal == null ? -1 : WhenMappings.$EnumSwitchMapping$4[divContentAlignmentHorizontal.ordinal()]) {
            case 1:
                i = 3;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 5;
                break;
            case 5:
                i = 8388613;
                break;
            case 6:
                i = C.DEFAULT_MUXED_BUFFER_SIZE;
                break;
            case 7:
                i = 33554432;
                break;
            case 8:
                i = 67108864;
                break;
        }
        int i2 = 48;
        switch (divContentAlignmentVertical != null ? WhenMappings.$EnumSwitchMapping$5[divContentAlignmentVertical.ordinal()] : -1) {
            case 2:
                i2 = 16;
                break;
            case 3:
                i2 = 80;
                break;
            case 4:
                i2 = 268435456;
                break;
            case 5:
                i2 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                break;
            case 6:
                i2 = 1073741824;
                break;
        }
        return i2 | i;
    }

    public static final Drawable toDrawable(von vonVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<Integer> expression;
        Expression<Integer> expression2;
        q9 q9Var = vonVar.b;
        Expression<Integer> expression3 = vonVar.a;
        va vaVar = vonVar.c;
        if (q9Var instanceof q9.b) {
            q9.b bVar = (q9.b) q9Var;
            float pxF = BaseDivViewExtensionsKt.toPxF(bVar.b.d, displayMetrics, expressionResolver);
            float pxF2 = BaseDivViewExtensionsKt.toPxF(bVar.b.c, displayMetrics, expressionResolver);
            Expression<Integer> expression4 = bVar.b.a;
            if (expression4 != null) {
                expression3 = expression4;
            }
            int intValue = expression3.evaluate(expressionResolver).intValue();
            float pxF3 = BaseDivViewExtensionsKt.toPxF(bVar.b.b, displayMetrics, expressionResolver);
            va vaVar2 = bVar.b.e;
            if (vaVar2 == null) {
                vaVar2 = vaVar;
            }
            Integer evaluate = (vaVar2 == null || (expression2 = vaVar2.a) == null) ? null : expression2.evaluate(expressionResolver);
            va vaVar3 = bVar.b.e;
            if (vaVar3 != null) {
                vaVar = vaVar3;
            }
            return new RoundedRectDrawable(new RoundedRectDrawable.Params(pxF, pxF2, intValue, pxF3, evaluate, vaVar != null ? Float.valueOf(getWidthPxF(vaVar, displayMetrics, expressionResolver)) : null));
        }
        if (!(q9Var instanceof q9.a)) {
            return null;
        }
        q9.a aVar = (q9.a) q9Var;
        float pxF4 = BaseDivViewExtensionsKt.toPxF(aVar.b.b, displayMetrics, expressionResolver);
        Expression<Integer> expression5 = aVar.b.a;
        if (expression5 != null) {
            expression3 = expression5;
        }
        int intValue2 = expression3.evaluate(expressionResolver).intValue();
        va vaVar4 = aVar.b.c;
        if (vaVar4 == null) {
            vaVar4 = vaVar;
        }
        Integer evaluate2 = (vaVar4 == null || (expression = vaVar4.a) == null) ? null : expression.evaluate(expressionResolver);
        va vaVar5 = aVar.b.c;
        if (vaVar5 != null) {
            vaVar = vaVar5;
        }
        return new CircleDrawable(new CircleDrawable.Params(pxF4, intValue2, evaluate2, vaVar != null ? Float.valueOf(getWidthPxF(vaVar, displayMetrics, expressionResolver)) : null));
    }
}
