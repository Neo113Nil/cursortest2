package com.yandex.div.core.view2.divs;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.aa;
import com.yandex.div2.q4;
import com.yandex.div2.s3;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.mq;

/* compiled from: SizeUnitUtils.kt */
/* loaded from: classes7.dex */
final /* synthetic */ class BaseDivViewExtensionsKt__SizeUnitUtilsKt {

    /* compiled from: SizeUnitUtils.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            try {
                iArr[DivSizeUnit.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSizeUnit.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSizeUnit.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T extends Number> int dpToPx(T t, DisplayMetrics displayMetrics) {
        return an10.b(BaseDivViewExtensionsKt.dpToPxF(t, displayMetrics));
    }

    public static final <T extends Number> float dpToPxF(T t, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, t != null ? t.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, displayMetrics);
    }

    public static final float fontSizeToPx(long j, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        Number valueOf;
        int i = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i == 1) {
            valueOf = Integer.valueOf(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), displayMetrics));
        } else if (i == 2) {
            valueOf = Integer.valueOf(BaseDivViewExtensionsKt.spToPx(Long.valueOf(j), displayMetrics));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf = Long.valueOf(j);
        }
        return valueOf.floatValue();
    }

    public static final <T extends Number> int pxToDp(T t, DisplayMetrics displayMetrics) {
        return an10.b(BaseDivViewExtensionsKt.pxToDpF(t, displayMetrics));
    }

    public static final <T extends Number> float pxToDpF(T t, DisplayMetrics displayMetrics) {
        float deriveDimension;
        int i = Build.VERSION.SDK_INT;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i < 34) {
            if (t != null) {
                f = t.floatValue();
            }
            return f / displayMetrics.density;
        }
        if (t != null) {
            f = t.floatValue();
        }
        deriveDimension = TypedValue.deriveDimension(1, f, displayMetrics);
        return deriveDimension;
    }

    public static final <T extends Number> int spToPx(T t, DisplayMetrics displayMetrics) {
        return an10.b(BaseDivViewExtensionsKt.spToPxF(t, displayMetrics));
    }

    public static final <T extends Number> float spToPxF(T t, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, t != null ? t.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, displayMetrics);
    }

    public static final int toAndroidUnit(DivSizeUnit divSizeUnit) {
        int i = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 0;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return i2;
    }

    public static final int toPx(long j, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        int i = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i == 1) {
            return BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), displayMetrics);
        }
        if (i == 2) {
            return BaseDivViewExtensionsKt.spToPx(Long.valueOf(j), displayMetrics);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        long j2 = j >> 31;
        if (j2 == 0 || j2 == -1) {
            return (int) j;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            mq.a(j, "Unable convert '", "' to Int");
        }
        return j > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final float toPxF(q4 q4Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt.toPxF(q4Var.b.evaluate(expressionResolver).longValue(), q4Var.a.evaluate(expressionResolver), displayMetrics);
    }

    public static final <T extends Number> int unitToPx(T t, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        return an10.b(BaseDivViewExtensionsKt.unitToPxF(t, displayMetrics, divSizeUnit));
    }

    public static final <T extends Number> float unitToPxF(T t, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        return TypedValue.applyDimension(BaseDivViewExtensionsKt.toAndroidUnit(divSizeUnit), t != null ? t.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, displayMetrics);
    }

    public static final int dpToPx(Long l, DisplayMetrics displayMetrics) {
        Integer num;
        int i;
        if (l != null) {
            long longValue = l.longValue();
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
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        return BaseDivViewExtensionsKt.dpToPx(num, displayMetrics);
    }

    public static final int spToPx(Long l, DisplayMetrics displayMetrics) {
        Integer num;
        int i;
        if (l != null) {
            long longValue = l.longValue();
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
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        return BaseDivViewExtensionsKt.spToPx(num, displayMetrics);
    }

    public static final float toPxF(long j, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        int i = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i == 1) {
            return BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(j), displayMetrics);
        }
        if (i == 2) {
            return BaseDivViewExtensionsKt.spToPxF(Long.valueOf(j), displayMetrics);
        }
        if (i == 3) {
            return j;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int unitToPx(Long l, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        Integer num;
        int i;
        if (l != null) {
            long longValue = l.longValue();
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
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        return BaseDivViewExtensionsKt.unitToPx(num, displayMetrics, divSizeUnit);
    }

    public static final int toPx(q4 q4Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<DivSizeUnit> expression = q4Var.a;
        Expression<Long> expression2 = q4Var.b;
        int i = WhenMappings.$EnumSwitchMapping$0[expression.evaluate(expressionResolver).ordinal()];
        if (i == 1) {
            return BaseDivViewExtensionsKt.dpToPx(expression2.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 2) {
            return BaseDivViewExtensionsKt.spToPx(expression2.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 3) {
            long longValue = expression2.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                return (int) longValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                mq.a(longValue, "Unable convert '", "' to Int");
            }
            return longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int toPx(aa aaVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<DivSizeUnit> expression = aaVar.a;
        Expression<Long> expression2 = aaVar.b;
        int i = WhenMappings.$EnumSwitchMapping$0[expression.evaluate(expressionResolver).ordinal()];
        if (i == 1) {
            return BaseDivViewExtensionsKt.dpToPx(expression2.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 2) {
            return BaseDivViewExtensionsKt.spToPx(expression2.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 3) {
            long longValue = expression2.evaluate(expressionResolver).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                return (int) longValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                mq.a(longValue, "Unable convert '", "' to Int");
            }
            return longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int toPx(s3 s3Var, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<DivSizeUnit> expression = s3Var.a;
        Expression<Double> expression2 = s3Var.b;
        int i = WhenMappings.$EnumSwitchMapping$0[expression.evaluate(expressionResolver).ordinal()];
        if (i == 1) {
            return BaseDivViewExtensionsKt.dpToPx(expression2.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 2) {
            return BaseDivViewExtensionsKt.spToPx(expression2.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 3) {
            return (int) expression2.evaluate(expressionResolver).doubleValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
