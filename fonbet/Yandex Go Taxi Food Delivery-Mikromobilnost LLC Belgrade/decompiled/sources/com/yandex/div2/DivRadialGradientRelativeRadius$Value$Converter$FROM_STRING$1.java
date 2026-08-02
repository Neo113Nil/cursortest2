package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivRadialGradientRelativeRadius$Value;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivRadialGradientRelativeRadius$Value$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivRadialGradientRelativeRadius$Value$Converter$FROM_STRING$1 w = new DivRadialGradientRelativeRadius$Value$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = (String) obj;
        DivRadialGradientRelativeRadius$Value.Converter.getClass();
        DivRadialGradientRelativeRadius$Value divRadialGradientRelativeRadius$Value = DivRadialGradientRelativeRadius$Value.NEAREST_CORNER;
        str = divRadialGradientRelativeRadius$Value.value;
        if (jl40.l(str5, str)) {
            return divRadialGradientRelativeRadius$Value;
        }
        DivRadialGradientRelativeRadius$Value divRadialGradientRelativeRadius$Value2 = DivRadialGradientRelativeRadius$Value.FARTHEST_CORNER;
        str2 = divRadialGradientRelativeRadius$Value2.value;
        if (jl40.l(str5, str2)) {
            return divRadialGradientRelativeRadius$Value2;
        }
        DivRadialGradientRelativeRadius$Value divRadialGradientRelativeRadius$Value3 = DivRadialGradientRelativeRadius$Value.NEAREST_SIDE;
        str3 = divRadialGradientRelativeRadius$Value3.value;
        if (jl40.l(str5, str3)) {
            return divRadialGradientRelativeRadius$Value3;
        }
        DivRadialGradientRelativeRadius$Value divRadialGradientRelativeRadius$Value4 = DivRadialGradientRelativeRadius$Value.FARTHEST_SIDE;
        str4 = divRadialGradientRelativeRadius$Value4.value;
        if (jl40.l(str5, str4)) {
            return divRadialGradientRelativeRadius$Value4;
        }
        return null;
    }
}
