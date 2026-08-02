package com.yandex.div2;

import defpackage.kvo;
import defpackage.qkj;

/* loaded from: classes11.dex */
public abstract class l {
    public static final kvo a;
    public static final qkj b;

    static {
        DivActionSubmit$Request$Method divActionSubmit$Request$Method = DivActionSubmit$Request$Method.POST;
        a = new kvo(divActionSubmit$Request$Method);
        b = new qkj(DivActionSubmitRequestJsonParser$Companion$TYPE_HELPER_METHOD$1.w, divActionSubmit$Request$Method);
    }
}
