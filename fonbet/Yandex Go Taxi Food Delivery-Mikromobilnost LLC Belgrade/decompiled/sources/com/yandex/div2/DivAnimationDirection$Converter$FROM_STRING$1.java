package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivAnimationDirection;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivAnimationDirection$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivAnimationDirection$Converter$FROM_STRING$1 w = new DivAnimationDirection$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = (String) obj;
        DivAnimationDirection.Converter.getClass();
        DivAnimationDirection divAnimationDirection = DivAnimationDirection.NORMAL;
        str = divAnimationDirection.value;
        if (jl40.l(str5, str)) {
            return divAnimationDirection;
        }
        DivAnimationDirection divAnimationDirection2 = DivAnimationDirection.REVERSE;
        str2 = divAnimationDirection2.value;
        if (jl40.l(str5, str2)) {
            return divAnimationDirection2;
        }
        DivAnimationDirection divAnimationDirection3 = DivAnimationDirection.ALTERNATE;
        str3 = divAnimationDirection3.value;
        if (jl40.l(str5, str3)) {
            return divAnimationDirection3;
        }
        DivAnimationDirection divAnimationDirection4 = DivAnimationDirection.ALTERNATE_REVERSE;
        str4 = divAnimationDirection4.value;
        if (jl40.l(str5, str4)) {
            return divAnimationDirection4;
        }
        return null;
    }
}
