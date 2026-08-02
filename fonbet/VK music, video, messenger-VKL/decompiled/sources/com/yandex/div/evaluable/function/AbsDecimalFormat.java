package com.yandex.div.evaluable.function;

import com.vk.dto.common.ImageSizeKey;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import io.jsonwebtoken.JwtParser;
import java.lang.Number;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import xsna.izs;
import xsna.j5g;
import xsna.rl3;
import xsna.zcl;
import xsna.zr;

/* compiled from: StringFunctions.kt */
/* loaded from: classes7.dex */
public abstract class AbsDecimalFormat<T extends Number> extends Function {
    private static final Companion Companion = new Companion(null);
    private static final Set<Character> SUPPORTED_FORMAT_SYMBOLS = rl3.y0(new Character[]{'#', Character.valueOf(ImageSizeKey.SIZE_KEY_UNDEFINED), ',', Character.valueOf(JwtParser.SEPARATOR_CHAR)});
    private final EvaluableType resultType = EvaluableType.STRING;
    private final boolean isPure = true;

    /* compiled from: StringFunctions.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    private final String formatCallReference(List<? extends Object> list, boolean z) {
        return j5g.g0(j5g.S(list, z ? 1 : 0), null, getName() + '(', ")", 0, new izs<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.AbsDecimalFormat$formatCallReference$callReference$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.izs
            public final CharSequence invoke(Object obj) {
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 25);
    }

    /* renamed from: throwIllegalFormatException-ec-iVKA, reason: not valid java name */
    private final Void m144throwIllegalFormatExceptioneciVKA(Evaluable evaluable, List<? extends Object> list, Exception exc) {
        throw new EvaluableException(zr.a("Failed to evaluate [", formatCallReference(list, evaluable instanceof Evaluable.MethodCall), "]. Incorrect format pattern."), exc);
    }

    /* renamed from: throwIllegalFormatException-ec-iVKA$default, reason: not valid java name */
    public static /* synthetic */ Void m145throwIllegalFormatExceptioneciVKA$default(AbsDecimalFormat absDecimalFormat, Evaluable evaluable, List list, Exception exc, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throwIllegalFormatException-ec-iVKA");
        }
        if ((i & 4) != 0) {
            exc = null;
        }
        return absDecimalFormat.m144throwIllegalFormatExceptioneciVKA(evaluable, list, exc);
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: evaluate-ex6DHhM */
    public Object mo114evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        T value = getValue(list.get(0));
        String str = (String) list.get(1);
        Locale locale = getLocale(list);
        if (str.length() == 0) {
            m145throwIllegalFormatExceptioneciVKA$default(this, evaluable, list, null, 4, null);
            throw new KotlinNothingValueException();
        }
        for (int i = 0; i < str.length(); i++) {
            if (!SUPPORTED_FORMAT_SYMBOLS.contains(Character.valueOf(str.charAt(i)))) {
                m145throwIllegalFormatExceptioneciVKA$default(this, evaluable, list, null, 4, null);
                throw new KotlinNothingValueException();
            }
        }
        try {
            return format(new DecimalFormat(str, DecimalFormatSymbols.getInstance(locale)), value);
        } catch (Exception e) {
            m144throwIllegalFormatExceptioneciVKA(evaluable, list, e);
            throw new KotlinNothingValueException();
        }
    }

    public abstract String format(DecimalFormat decimalFormat, T t);

    public abstract Locale getLocale(List<? extends Object> list);

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    public abstract T getValue(Object obj);

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
