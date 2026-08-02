package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import xsna.e43;

/* compiled from: StringFunctions.kt */
/* loaded from: classes7.dex */
public final class IntegerDecimalFormat extends AbsDecimalFormat<Long> {
    public static final IntegerDecimalFormat INSTANCE = new IntegerDecimalFormat();
    private static final String name = "decimalFormat";
    private static final List<FunctionArgument> declaredArgs = e43.l(new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(EvaluableType.STRING, false, 2, null));

    private IntegerDecimalFormat() {
    }

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public /* bridge */ /* synthetic */ String format(DecimalFormat decimalFormat, Long l) {
        return format(decimalFormat, l.longValue());
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

    public String format(DecimalFormat decimalFormat, long j) {
        return decimalFormat.format(j);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public Long getValue(Object obj) {
        return (Long) obj;
    }
}
