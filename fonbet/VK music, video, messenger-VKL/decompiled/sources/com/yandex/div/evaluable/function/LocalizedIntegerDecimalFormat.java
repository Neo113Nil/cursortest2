package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import xsna.e43;

/* compiled from: StringFunctions.kt */
/* loaded from: classes7.dex */
public final class LocalizedIntegerDecimalFormat extends AbsDecimalFormat<Long> {
    private static final List<FunctionArgument> declaredArgs;
    public static final LocalizedIntegerDecimalFormat INSTANCE = new LocalizedIntegerDecimalFormat();
    private static final String name = "decimalFormat";

    static {
        FunctionArgument functionArgument = new FunctionArgument(EvaluableType.INTEGER, false, 2, null);
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = e43.l(functionArgument, new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
    }

    private LocalizedIntegerDecimalFormat() {
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
        return Locale.forLanguageTag((String) list.get(2));
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
