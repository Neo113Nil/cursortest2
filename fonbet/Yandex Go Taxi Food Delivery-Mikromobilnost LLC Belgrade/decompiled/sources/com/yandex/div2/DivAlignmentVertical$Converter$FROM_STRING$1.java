package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivAlignmentVertical;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivAlignmentVertical$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivAlignmentVertical$Converter$FROM_STRING$1 w = new DivAlignmentVertical$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = (String) obj;
        DivAlignmentVertical.Converter.getClass();
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
        str = divAlignmentVertical.value;
        if (jl40.l(str5, str)) {
            return divAlignmentVertical;
        }
        DivAlignmentVertical divAlignmentVertical2 = DivAlignmentVertical.CENTER;
        str2 = divAlignmentVertical2.value;
        if (jl40.l(str5, str2)) {
            return divAlignmentVertical2;
        }
        DivAlignmentVertical divAlignmentVertical3 = DivAlignmentVertical.BOTTOM;
        str3 = divAlignmentVertical3.value;
        if (jl40.l(str5, str3)) {
            return divAlignmentVertical3;
        }
        DivAlignmentVertical divAlignmentVertical4 = DivAlignmentVertical.BASELINE;
        str4 = divAlignmentVertical4.value;
        if (jl40.l(str5, str4)) {
            return divAlignmentVertical4;
        }
        return null;
    }
}
