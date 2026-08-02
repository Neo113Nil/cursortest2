package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivInput$Autocapitalization;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivInput$Autocapitalization$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivInput$Autocapitalization$Converter$FROM_STRING$1 w = new DivInput$Autocapitalization$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = (String) obj;
        DivInput$Autocapitalization.Converter.getClass();
        DivInput$Autocapitalization divInput$Autocapitalization = DivInput$Autocapitalization.AUTO;
        str = divInput$Autocapitalization.value;
        if (jl40.l(str6, str)) {
            return divInput$Autocapitalization;
        }
        DivInput$Autocapitalization divInput$Autocapitalization2 = DivInput$Autocapitalization.NONE;
        str2 = divInput$Autocapitalization2.value;
        if (jl40.l(str6, str2)) {
            return divInput$Autocapitalization2;
        }
        DivInput$Autocapitalization divInput$Autocapitalization3 = DivInput$Autocapitalization.WORDS;
        str3 = divInput$Autocapitalization3.value;
        if (jl40.l(str6, str3)) {
            return divInput$Autocapitalization3;
        }
        DivInput$Autocapitalization divInput$Autocapitalization4 = DivInput$Autocapitalization.SENTENCES;
        str4 = divInput$Autocapitalization4.value;
        if (jl40.l(str6, str4)) {
            return divInput$Autocapitalization4;
        }
        DivInput$Autocapitalization divInput$Autocapitalization5 = DivInput$Autocapitalization.ALL_CHARACTERS;
        str5 = divInput$Autocapitalization5.value;
        if (jl40.l(str6, str5)) {
            return divInput$Autocapitalization5;
        }
        return null;
    }
}
