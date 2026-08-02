package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivBlendMode;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivBlendMode$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivBlendMode$Converter$FROM_STRING$1 w = new DivBlendMode$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = (String) obj;
        DivBlendMode.Converter.getClass();
        DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
        str = divBlendMode.value;
        if (jl40.l(str7, str)) {
            return divBlendMode;
        }
        DivBlendMode divBlendMode2 = DivBlendMode.SOURCE_ATOP;
        str2 = divBlendMode2.value;
        if (jl40.l(str7, str2)) {
            return divBlendMode2;
        }
        DivBlendMode divBlendMode3 = DivBlendMode.DARKEN;
        str3 = divBlendMode3.value;
        if (jl40.l(str7, str3)) {
            return divBlendMode3;
        }
        DivBlendMode divBlendMode4 = DivBlendMode.LIGHTEN;
        str4 = divBlendMode4.value;
        if (jl40.l(str7, str4)) {
            return divBlendMode4;
        }
        DivBlendMode divBlendMode5 = DivBlendMode.MULTIPLY;
        str5 = divBlendMode5.value;
        if (jl40.l(str7, str5)) {
            return divBlendMode5;
        }
        DivBlendMode divBlendMode6 = DivBlendMode.SCREEN;
        str6 = divBlendMode6.value;
        if (jl40.l(str7, str6)) {
            return divBlendMode6;
        }
        return null;
    }
}
