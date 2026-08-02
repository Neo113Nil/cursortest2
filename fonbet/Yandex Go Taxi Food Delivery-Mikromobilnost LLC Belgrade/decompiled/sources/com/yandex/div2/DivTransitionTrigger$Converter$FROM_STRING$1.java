package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivTransitionTrigger;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivTransitionTrigger$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivTransitionTrigger$Converter$FROM_STRING$1 w = new DivTransitionTrigger$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4 = (String) obj;
        DivTransitionTrigger.Converter.getClass();
        DivTransitionTrigger divTransitionTrigger = DivTransitionTrigger.DATA_CHANGE;
        str = divTransitionTrigger.value;
        if (jl40.l(str4, str)) {
            return divTransitionTrigger;
        }
        DivTransitionTrigger divTransitionTrigger2 = DivTransitionTrigger.STATE_CHANGE;
        str2 = divTransitionTrigger2.value;
        if (jl40.l(str4, str2)) {
            return divTransitionTrigger2;
        }
        DivTransitionTrigger divTransitionTrigger3 = DivTransitionTrigger.VISIBILITY_CHANGE;
        str3 = divTransitionTrigger3.value;
        if (jl40.l(str4, str3)) {
            return divTransitionTrigger3;
        }
        return null;
    }
}
