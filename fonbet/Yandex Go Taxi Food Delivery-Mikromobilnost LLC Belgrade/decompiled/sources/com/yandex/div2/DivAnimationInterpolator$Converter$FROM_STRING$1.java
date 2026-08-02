package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivAnimationInterpolator;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivAnimationInterpolator$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivAnimationInterpolator$Converter$FROM_STRING$1 w = new DivAnimationInterpolator$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = (String) obj;
        DivAnimationInterpolator.Converter.getClass();
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
        str = divAnimationInterpolator.value;
        if (jl40.l(str7, str)) {
            return divAnimationInterpolator;
        }
        DivAnimationInterpolator divAnimationInterpolator2 = DivAnimationInterpolator.EASE;
        str2 = divAnimationInterpolator2.value;
        if (jl40.l(str7, str2)) {
            return divAnimationInterpolator2;
        }
        DivAnimationInterpolator divAnimationInterpolator3 = DivAnimationInterpolator.EASE_IN;
        str3 = divAnimationInterpolator3.value;
        if (jl40.l(str7, str3)) {
            return divAnimationInterpolator3;
        }
        DivAnimationInterpolator divAnimationInterpolator4 = DivAnimationInterpolator.EASE_OUT;
        str4 = divAnimationInterpolator4.value;
        if (jl40.l(str7, str4)) {
            return divAnimationInterpolator4;
        }
        DivAnimationInterpolator divAnimationInterpolator5 = DivAnimationInterpolator.EASE_IN_OUT;
        str5 = divAnimationInterpolator5.value;
        if (jl40.l(str7, str5)) {
            return divAnimationInterpolator5;
        }
        DivAnimationInterpolator divAnimationInterpolator6 = DivAnimationInterpolator.SPRING;
        str6 = divAnimationInterpolator6.value;
        if (jl40.l(str7, str6)) {
            return divAnimationInterpolator6;
        }
        return null;
    }
}
