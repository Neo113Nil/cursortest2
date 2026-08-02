package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivActionVideo$Action;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivActionVideo$Action$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivActionVideo$Action$Converter$FROM_STRING$1 w = new DivActionVideo$Action$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        DivActionVideo$Action.Converter.getClass();
        DivActionVideo$Action divActionVideo$Action = DivActionVideo$Action.START;
        str = divActionVideo$Action.value;
        if (jl40.l(str3, str)) {
            return divActionVideo$Action;
        }
        DivActionVideo$Action divActionVideo$Action2 = DivActionVideo$Action.PAUSE;
        str2 = divActionVideo$Action2.value;
        if (jl40.l(str3, str2)) {
            return divActionVideo$Action2;
        }
        return null;
    }
}
