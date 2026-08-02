package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import xsna.e43;

/* compiled from: StringFunctions.kt */
/* loaded from: classes7.dex */
public final class NumberDecimalFormat extends AbsDecimalFormat<Double> {
    public static final NumberDecimalFormat INSTANCE = new NumberDecimalFormat();
    private static final String name = "decimalFormat";
    private static final List<FunctionArgument> declaredArgs = e43.l(new FunctionArgument(EvaluableType.NUMBER, false, 2, null), new FunctionArgument(EvaluableType.STRING, false, 2, null));

    private NumberDecimalFormat() {
    }

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public /* bridge */ /* synthetic */ String format(DecimalFormat decimalFormat, Double d) {
        return format(decimalFormat, d.doubleValue());
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public Locale getLocale(List<? extends Object> list) {
        return Locale.getDefault();
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    public String format(DecimalFormat decimalFormat, double d) {
        return decimalFormat.format(Float.valueOf((float) d));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public Double getValue(Object obj) {
        return (Double) obj;
    }
}
