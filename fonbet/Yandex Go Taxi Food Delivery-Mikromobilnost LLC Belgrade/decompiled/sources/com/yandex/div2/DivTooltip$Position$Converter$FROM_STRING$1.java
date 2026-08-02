package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivTooltip$Position;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivTooltip$Position$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivTooltip$Position$Converter$FROM_STRING$1 w = new DivTooltip$Position$Converter$FROM_STRING$1(1);

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
        DivTooltip$Position.Converter.getClass();
        DivTooltip$Position divTooltip$Position = DivTooltip$Position.LEFT;
        str = divTooltip$Position.value;
        if (jl40.l(str10, str)) {
            return divTooltip$Position;
        }
        DivTooltip$Position divTooltip$Position2 = DivTooltip$Position.TOP_LEFT;
        str2 = divTooltip$Position2.value;
        if (jl40.l(str10, str2)) {
            return divTooltip$Position2;
        }
        DivTooltip$Position divTooltip$Position3 = DivTooltip$Position.TOP;
        str3 = divTooltip$Position3.value;
        if (jl40.l(str10, str3)) {
            return divTooltip$Position3;
        }
        DivTooltip$Position divTooltip$Position4 = DivTooltip$Position.TOP_RIGHT;
        str4 = divTooltip$Position4.value;
        if (jl40.l(str10, str4)) {
            return divTooltip$Position4;
        }
        DivTooltip$Position divTooltip$Position5 = DivTooltip$Position.RIGHT;
        str5 = divTooltip$Position5.value;
        if (jl40.l(str10, str5)) {
            return divTooltip$Position5;
        }
        DivTooltip$Position divTooltip$Position6 = DivTooltip$Position.BOTTOM_RIGHT;
        str6 = divTooltip$Position6.value;
        if (jl40.l(str10, str6)) {
            return divTooltip$Position6;
        }
        DivTooltip$Position divTooltip$Position7 = DivTooltip$Position.BOTTOM;
        str7 = divTooltip$Position7.value;
        if (jl40.l(str10, str7)) {
            return divTooltip$Position7;
        }
        DivTooltip$Position divTooltip$Position8 = DivTooltip$Position.BOTTOM_LEFT;
        str8 = divTooltip$Position8.value;
        if (jl40.l(str10, str8)) {
            return divTooltip$Position8;
        }
        DivTooltip$Position divTooltip$Position9 = DivTooltip$Position.CENTER;
        str9 = divTooltip$Position9.value;
        if (jl40.l(str10, str9)) {
            return divTooltip$Position9;
        }
        return null;
    }
}
