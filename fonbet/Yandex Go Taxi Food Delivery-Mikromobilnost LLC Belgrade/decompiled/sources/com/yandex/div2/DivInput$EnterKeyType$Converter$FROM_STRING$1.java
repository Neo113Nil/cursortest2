package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivInput$EnterKeyType;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivInput$EnterKeyType$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivInput$EnterKeyType$Converter$FROM_STRING$1 w = new DivInput$EnterKeyType$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = (String) obj;
        DivInput$EnterKeyType.Converter.getClass();
        DivInput$EnterKeyType divInput$EnterKeyType = DivInput$EnterKeyType.DEFAULT;
        str = divInput$EnterKeyType.value;
        if (jl40.l(str6, str)) {
            return divInput$EnterKeyType;
        }
        DivInput$EnterKeyType divInput$EnterKeyType2 = DivInput$EnterKeyType.GO;
        str2 = divInput$EnterKeyType2.value;
        if (jl40.l(str6, str2)) {
            return divInput$EnterKeyType2;
        }
        DivInput$EnterKeyType divInput$EnterKeyType3 = DivInput$EnterKeyType.SEARCH;
        str3 = divInput$EnterKeyType3.value;
        if (jl40.l(str6, str3)) {
            return divInput$EnterKeyType3;
        }
        DivInput$EnterKeyType divInput$EnterKeyType4 = DivInput$EnterKeyType.SEND;
        str4 = divInput$EnterKeyType4.value;
        if (jl40.l(str6, str4)) {
            return divInput$EnterKeyType4;
        }
        DivInput$EnterKeyType divInput$EnterKeyType5 = DivInput$EnterKeyType.DONE;
        str5 = divInput$EnterKeyType5.value;
        if (jl40.l(str6, str5)) {
            return divInput$EnterKeyType5;
        }
        return null;
    }
}
