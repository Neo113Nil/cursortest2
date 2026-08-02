package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivContentAlignmentHorizontal;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivContentAlignmentHorizontal$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivContentAlignmentHorizontal$Converter$FROM_STRING$1 w = new DivContentAlignmentHorizontal$Converter$FROM_STRING$1(1);

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
        String str9 = (String) obj;
        DivContentAlignmentHorizontal.Converter.getClass();
        DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.LEFT;
        str = divContentAlignmentHorizontal.value;
        if (jl40.l(str9, str)) {
            return divContentAlignmentHorizontal;
        }
        DivContentAlignmentHorizontal divContentAlignmentHorizontal2 = DivContentAlignmentHorizontal.CENTER;
        str2 = divContentAlignmentHorizontal2.value;
        if (jl40.l(str9, str2)) {
            return divContentAlignmentHorizontal2;
        }
        DivContentAlignmentHorizontal divContentAlignmentHorizontal3 = DivContentAlignmentHorizontal.RIGHT;
        str3 = divContentAlignmentHorizontal3.value;
        if (jl40.l(str9, str3)) {
            return divContentAlignmentHorizontal3;
        }
        DivContentAlignmentHorizontal divContentAlignmentHorizontal4 = DivContentAlignmentHorizontal.START;
        str4 = divContentAlignmentHorizontal4.value;
        if (jl40.l(str9, str4)) {
            return divContentAlignmentHorizontal4;
        }
        DivContentAlignmentHorizontal divContentAlignmentHorizontal5 = DivContentAlignmentHorizontal.END;
        str5 = divContentAlignmentHorizontal5.value;
        if (jl40.l(str9, str5)) {
            return divContentAlignmentHorizontal5;
        }
        DivContentAlignmentHorizontal divContentAlignmentHorizontal6 = DivContentAlignmentHorizontal.SPACE_BETWEEN;
        str6 = divContentAlignmentHorizontal6.value;
        if (jl40.l(str9, str6)) {
            return divContentAlignmentHorizontal6;
        }
        DivContentAlignmentHorizontal divContentAlignmentHorizontal7 = DivContentAlignmentHorizontal.SPACE_AROUND;
        str7 = divContentAlignmentHorizontal7.value;
        if (jl40.l(str9, str7)) {
            return divContentAlignmentHorizontal7;
        }
        DivContentAlignmentHorizontal divContentAlignmentHorizontal8 = DivContentAlignmentHorizontal.SPACE_EVENLY;
        str8 = divContentAlignmentHorizontal8.value;
        if (jl40.l(str9, str8)) {
            return divContentAlignmentHorizontal8;
        }
        return null;
    }
}
