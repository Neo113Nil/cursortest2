package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivActionSubmit$Request$Method;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivActionSubmit$Request$Method$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivActionSubmit$Request$Method$Converter$FROM_STRING$1 w = new DivActionSubmit$Request$Method$Converter$FROM_STRING$1(1);

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
        DivActionSubmit$Request$Method.Converter.getClass();
        DivActionSubmit$Request$Method divActionSubmit$Request$Method = DivActionSubmit$Request$Method.GET;
        str = divActionSubmit$Request$Method.value;
        if (jl40.l(str8, str)) {
            return divActionSubmit$Request$Method;
        }
        DivActionSubmit$Request$Method divActionSubmit$Request$Method2 = DivActionSubmit$Request$Method.POST;
        str2 = divActionSubmit$Request$Method2.value;
        if (jl40.l(str8, str2)) {
            return divActionSubmit$Request$Method2;
        }
        DivActionSubmit$Request$Method divActionSubmit$Request$Method3 = DivActionSubmit$Request$Method.PUT;
        str3 = divActionSubmit$Request$Method3.value;
        if (jl40.l(str8, str3)) {
            return divActionSubmit$Request$Method3;
        }
        DivActionSubmit$Request$Method divActionSubmit$Request$Method4 = DivActionSubmit$Request$Method.PATCH;
        str4 = divActionSubmit$Request$Method4.value;
        if (jl40.l(str8, str4)) {
            return divActionSubmit$Request$Method4;
        }
        DivActionSubmit$Request$Method divActionSubmit$Request$Method5 = DivActionSubmit$Request$Method.DELETE;
        str5 = divActionSubmit$Request$Method5.value;
        if (jl40.l(str8, str5)) {
            return divActionSubmit$Request$Method5;
        }
        DivActionSubmit$Request$Method divActionSubmit$Request$Method6 = DivActionSubmit$Request$Method.HEAD;
        str6 = divActionSubmit$Request$Method6.value;
        if (jl40.l(str8, str6)) {
            return divActionSubmit$Request$Method6;
        }
        DivActionSubmit$Request$Method divActionSubmit$Request$Method7 = DivActionSubmit$Request$Method.OPTIONS;
        str7 = divActionSubmit$Request$Method7.value;
        if (jl40.l(str8, str7)) {
            return divActionSubmit$Request$Method7;
        }
        return null;
    }
}
