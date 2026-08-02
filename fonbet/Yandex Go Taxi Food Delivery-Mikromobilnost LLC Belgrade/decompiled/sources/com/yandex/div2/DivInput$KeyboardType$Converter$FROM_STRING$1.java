package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivInput$KeyboardType;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivInput$KeyboardType$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivInput$KeyboardType$Converter$FROM_STRING$1 w = new DivInput$KeyboardType$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = (String) obj;
        DivInput$KeyboardType.Converter.getClass();
        DivInput$KeyboardType divInput$KeyboardType = DivInput$KeyboardType.SINGLE_LINE_TEXT;
        str = divInput$KeyboardType.value;
        if (jl40.l(str8, str)) {
            return divInput$KeyboardType;
        }
        DivInput$KeyboardType divInput$KeyboardType2 = DivInput$KeyboardType.MULTI_LINE_TEXT;
        str2 = divInput$KeyboardType2.value;
        if (jl40.l(str8, str2)) {
            return divInput$KeyboardType2;
        }
        DivInput$KeyboardType divInput$KeyboardType3 = DivInput$KeyboardType.PHONE;
        str3 = divInput$KeyboardType3.value;
        if (jl40.l(str8, str3)) {
            return divInput$KeyboardType3;
        }
        DivInput$KeyboardType divInput$KeyboardType4 = DivInput$KeyboardType.NUMBER;
        str4 = divInput$KeyboardType4.value;
        if (jl40.l(str8, str4)) {
            return divInput$KeyboardType4;
        }
        DivInput$KeyboardType divInput$KeyboardType5 = DivInput$KeyboardType.EMAIL;
        str5 = divInput$KeyboardType5.value;
        if (jl40.l(str8, str5)) {
            return divInput$KeyboardType5;
        }
        DivInput$KeyboardType divInput$KeyboardType6 = DivInput$KeyboardType.URI;
        str6 = divInput$KeyboardType6.value;
        if (jl40.l(str8, str6)) {
            return divInput$KeyboardType6;
        }
        DivInput$KeyboardType divInput$KeyboardType7 = DivInput$KeyboardType.PASSWORD;
        str7 = divInput$KeyboardType7.value;
        if (jl40.l(str8, str7)) {
            return divInput$KeyboardType7;
        }
        return null;
    }
}
