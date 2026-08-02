package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivContentAlignmentVertical;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivContentAlignmentVertical$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivContentAlignmentVertical$Converter$FROM_STRING$1 w = new DivContentAlignmentVertical$Converter$FROM_STRING$1(1);

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
        DivContentAlignmentVertical.Converter.getClass();
        DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
        str = divContentAlignmentVertical.value;
        if (jl40.l(str8, str)) {
            return divContentAlignmentVertical;
        }
        DivContentAlignmentVertical divContentAlignmentVertical2 = DivContentAlignmentVertical.CENTER;
        str2 = divContentAlignmentVertical2.value;
        if (jl40.l(str8, str2)) {
            return divContentAlignmentVertical2;
        }
        DivContentAlignmentVertical divContentAlignmentVertical3 = DivContentAlignmentVertical.BOTTOM;
        str3 = divContentAlignmentVertical3.value;
        if (jl40.l(str8, str3)) {
            return divContentAlignmentVertical3;
        }
        DivContentAlignmentVertical divContentAlignmentVertical4 = DivContentAlignmentVertical.BASELINE;
        str4 = divContentAlignmentVertical4.value;
        if (jl40.l(str8, str4)) {
            return divContentAlignmentVertical4;
        }
        DivContentAlignmentVertical divContentAlignmentVertical5 = DivContentAlignmentVertical.SPACE_BETWEEN;
        str5 = divContentAlignmentVertical5.value;
        if (jl40.l(str8, str5)) {
            return divContentAlignmentVertical5;
        }
        DivContentAlignmentVertical divContentAlignmentVertical6 = DivContentAlignmentVertical.SPACE_AROUND;
        str6 = divContentAlignmentVertical6.value;
        if (jl40.l(str8, str6)) {
            return divContentAlignmentVertical6;
        }
        DivContentAlignmentVertical divContentAlignmentVertical7 = DivContentAlignmentVertical.SPACE_EVENLY;
        str7 = divContentAlignmentVertical7.value;
        if (jl40.l(str8, str7)) {
            return divContentAlignmentVertical7;
        }
        return null;
    }
}
