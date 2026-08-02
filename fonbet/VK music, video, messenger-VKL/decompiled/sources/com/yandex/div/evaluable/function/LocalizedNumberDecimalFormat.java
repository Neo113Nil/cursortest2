package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import xsna.e43;

/* compiled from: StringFunctions.kt */
/* loaded from: classes7.dex */
public final class LocalizedNumberDecimalFormat extends AbsDecimalFormat<Double> {
    private static final List<FunctionArgument> declaredArgs;
    public static final LocalizedNumberDecimalFormat INSTANCE = new LocalizedNumberDecimalFormat();
    private static final String name = "decimalFormat";

    static {
        FunctionArgument functionArgument = new FunctionArgument(EvaluableType.NUMBER, false, 2, null);
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = e43.l(functionArgument, new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
    }

    private LocalizedNumberDecimalFormat() {
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
        return Locale.forLanguageTag((String) list.get(2));
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
