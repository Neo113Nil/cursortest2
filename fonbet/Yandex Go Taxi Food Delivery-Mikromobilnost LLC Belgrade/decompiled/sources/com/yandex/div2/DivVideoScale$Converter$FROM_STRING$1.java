package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivVideoScale;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivVideoScale$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivVideoScale$Converter$FROM_STRING$1 w = new DivVideoScale$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4 = (String) obj;
        DivVideoScale.Converter.getClass();
        DivVideoScale divVideoScale = DivVideoScale.FILL;
        str = divVideoScale.value;
        if (jl40.l(str4, str)) {
            return divVideoScale;
        }
        DivVideoScale divVideoScale2 = DivVideoScale.NO_SCALE;
        str2 = divVideoScale2.value;
        if (jl40.l(str4, str2)) {
            return divVideoScale2;
        }
        DivVideoScale divVideoScale3 = DivVideoScale.FIT;
        str3 = divVideoScale3.value;
        if (jl40.l(str4, str3)) {
            return divVideoScale3;
        }
        return null;
    }
}
