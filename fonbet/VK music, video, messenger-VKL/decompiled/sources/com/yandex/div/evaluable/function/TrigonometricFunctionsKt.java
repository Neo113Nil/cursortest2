package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import kotlin.KotlinNothingValueException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.fo8;

/* compiled from: TrigonometricFunctions.kt */
/* loaded from: classes7.dex */
public final class TrigonometricFunctionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object evaluateMathResult(double d, String str, double d2) {
        if (!isValidTrigonometricResult$default(d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 2, null)) {
            throwIncorrectMathValueException(str, d2);
        }
        return Double.valueOf(d);
    }

    private static final boolean isValidTrigonometricResult(double d, double d2) {
        return !Double.isNaN(d) && Math.abs(d) <= d2;
    }

    public static /* synthetic */ boolean isValidTrigonometricResult$default(double d, double d2, int i, Object obj) {
        if ((i & 2) != 0) {
            d2 = 1.0E10d;
        }
        return isValidTrigonometricResult(d, d2);
    }

    private static final void throwIncorrectMathValueException(String str, double d) {
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(str + '(' + d + ')', fo8.a(toMathFunctionDisplayName(str), " is undefined for the given value."), null, 4, null);
        throw new KotlinNothingValueException();
    }

    private static final String toMathFunctionDisplayName(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 98696) {
            if (hashCode != 2988422) {
                if (hashCode == 3003607 && str.equals("asin")) {
                    return "Arcsine";
                }
            } else if (str.equals("acos")) {
                return "Arccosine";
            }
        } else if (str.equals("cot")) {
            return "Cotangent";
        }
        return str;
    }
}
