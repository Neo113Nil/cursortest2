package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivPager$ItemAlignment;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivPager$ItemAlignment$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivPager$ItemAlignment$Converter$FROM_STRING$1 w = new DivPager$ItemAlignment$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4 = (String) obj;
        DivPager$ItemAlignment.Converter.getClass();
        DivPager$ItemAlignment divPager$ItemAlignment = DivPager$ItemAlignment.START;
        str = divPager$ItemAlignment.value;
        if (jl40.l(str4, str)) {
            return divPager$ItemAlignment;
        }
        DivPager$ItemAlignment divPager$ItemAlignment2 = DivPager$ItemAlignment.CENTER;
        str2 = divPager$ItemAlignment2.value;
        if (jl40.l(str4, str2)) {
            return divPager$ItemAlignment2;
        }
        DivPager$ItemAlignment divPager$ItemAlignment3 = DivPager$ItemAlignment.END;
        str3 = divPager$ItemAlignment3.value;
        if (jl40.l(str4, str3)) {
            return divPager$ItemAlignment3;
        }
        return null;
    }
}
