package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivTransitionSelector;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivTransitionSelector$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivTransitionSelector$Converter$FROM_STRING$1 w = new DivTransitionSelector$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = (String) obj;
        DivTransitionSelector.Converter.getClass();
        DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
        str = divTransitionSelector.value;
        if (jl40.l(str5, str)) {
            return divTransitionSelector;
        }
        DivTransitionSelector divTransitionSelector2 = DivTransitionSelector.DATA_CHANGE;
        str2 = divTransitionSelector2.value;
        if (jl40.l(str5, str2)) {
            return divTransitionSelector2;
        }
        DivTransitionSelector divTransitionSelector3 = DivTransitionSelector.STATE_CHANGE;
        str3 = divTransitionSelector3.value;
        if (jl40.l(str5, str3)) {
            return divTransitionSelector3;
        }
        DivTransitionSelector divTransitionSelector4 = DivTransitionSelector.ANY_CHANGE;
        str4 = divTransitionSelector4.value;
        if (jl40.l(str5, str4)) {
            return divTransitionSelector4;
        }
        return null;
    }
}
