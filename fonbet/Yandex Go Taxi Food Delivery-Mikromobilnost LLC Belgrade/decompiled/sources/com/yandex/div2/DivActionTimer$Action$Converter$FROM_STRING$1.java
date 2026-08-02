package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivActionTimer$Action;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivActionTimer$Action$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivActionTimer$Action$Converter$FROM_STRING$1 w = new DivActionTimer$Action$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = (String) obj;
        DivActionTimer$Action.Converter.getClass();
        DivActionTimer$Action divActionTimer$Action = DivActionTimer$Action.START;
        str = divActionTimer$Action.value;
        if (jl40.l(str7, str)) {
            return divActionTimer$Action;
        }
        DivActionTimer$Action divActionTimer$Action2 = DivActionTimer$Action.STOP;
        str2 = divActionTimer$Action2.value;
        if (jl40.l(str7, str2)) {
            return divActionTimer$Action2;
        }
        DivActionTimer$Action divActionTimer$Action3 = DivActionTimer$Action.PAUSE;
        str3 = divActionTimer$Action3.value;
        if (jl40.l(str7, str3)) {
            return divActionTimer$Action3;
        }
        DivActionTimer$Action divActionTimer$Action4 = DivActionTimer$Action.RESUME;
        str4 = divActionTimer$Action4.value;
        if (jl40.l(str7, str4)) {
            return divActionTimer$Action4;
        }
        DivActionTimer$Action divActionTimer$Action5 = DivActionTimer$Action.CANCEL;
        str5 = divActionTimer$Action5.value;
        if (jl40.l(str7, str5)) {
            return divActionTimer$Action5;
        }
        DivActionTimer$Action divActionTimer$Action6 = DivActionTimer$Action.RESET;
        str6 = divActionTimer$Action6.value;
        if (jl40.l(str7, str6)) {
            return divActionTimer$Action6;
        }
        return null;
    }
}
