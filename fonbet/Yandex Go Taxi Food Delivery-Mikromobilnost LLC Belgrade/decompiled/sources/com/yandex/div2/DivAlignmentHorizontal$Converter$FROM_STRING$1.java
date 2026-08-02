package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivAlignmentHorizontal;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivAlignmentHorizontal$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivAlignmentHorizontal$Converter$FROM_STRING$1 w = new DivAlignmentHorizontal$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = (String) obj;
        DivAlignmentHorizontal.Converter.getClass();
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.LEFT;
        str = divAlignmentHorizontal.value;
        if (jl40.l(str6, str)) {
            return divAlignmentHorizontal;
        }
        DivAlignmentHorizontal divAlignmentHorizontal2 = DivAlignmentHorizontal.CENTER;
        str2 = divAlignmentHorizontal2.value;
        if (jl40.l(str6, str2)) {
            return divAlignmentHorizontal2;
        }
        DivAlignmentHorizontal divAlignmentHorizontal3 = DivAlignmentHorizontal.RIGHT;
        str3 = divAlignmentHorizontal3.value;
        if (jl40.l(str6, str3)) {
            return divAlignmentHorizontal3;
        }
        DivAlignmentHorizontal divAlignmentHorizontal4 = DivAlignmentHorizontal.START;
        str4 = divAlignmentHorizontal4.value;
        if (jl40.l(str6, str4)) {
            return divAlignmentHorizontal4;
        }
        DivAlignmentHorizontal divAlignmentHorizontal5 = DivAlignmentHorizontal.END;
        str5 = divAlignmentHorizontal5.value;
        if (jl40.l(str6, str5)) {
            return divAlignmentHorizontal5;
        }
        return null;
    }
}
