package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivEvaluableType;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivEvaluableType$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivEvaluableType$Converter$FROM_STRING$1 w = new DivEvaluableType$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10 = (String) obj;
        DivEvaluableType.Converter.getClass();
        DivEvaluableType divEvaluableType = DivEvaluableType.STRING;
        str = divEvaluableType.value;
        if (jl40.l(str10, str)) {
            return divEvaluableType;
        }
        DivEvaluableType divEvaluableType2 = DivEvaluableType.INTEGER;
        str2 = divEvaluableType2.value;
        if (jl40.l(str10, str2)) {
            return divEvaluableType2;
        }
        DivEvaluableType divEvaluableType3 = DivEvaluableType.NUMBER;
        str3 = divEvaluableType3.value;
        if (jl40.l(str10, str3)) {
            return divEvaluableType3;
        }
        DivEvaluableType divEvaluableType4 = DivEvaluableType.BOOLEAN;
        str4 = divEvaluableType4.value;
        if (jl40.l(str10, str4)) {
            return divEvaluableType4;
        }
        DivEvaluableType divEvaluableType5 = DivEvaluableType.DATETIME;
        str5 = divEvaluableType5.value;
        if (jl40.l(str10, str5)) {
            return divEvaluableType5;
        }
        DivEvaluableType divEvaluableType6 = DivEvaluableType.COLOR;
        str6 = divEvaluableType6.value;
        if (jl40.l(str10, str6)) {
            return divEvaluableType6;
        }
        DivEvaluableType divEvaluableType7 = DivEvaluableType.URL;
        str7 = divEvaluableType7.value;
        if (jl40.l(str10, str7)) {
            return divEvaluableType7;
        }
        DivEvaluableType divEvaluableType8 = DivEvaluableType.DICT;
        str8 = divEvaluableType8.value;
        if (jl40.l(str10, str8)) {
            return divEvaluableType8;
        }
        DivEvaluableType divEvaluableType9 = DivEvaluableType.ARRAY;
        str9 = divEvaluableType9.value;
        if (jl40.l(str10, str9)) {
            return divEvaluableType9;
        }
        return null;
    }
}
