package com.yandex.div2;

import defpackage.kvo;
import defpackage.qkj;
import defpackage.yhl;

/* loaded from: classes.dex */
public abstract class a3 {
    public static final kvo a;
    public static final qkj b;
    public static final yhl c;

    static {
        DivTrigger$Mode divTrigger$Mode = DivTrigger$Mode.ON_CONDITION;
        a = new kvo(divTrigger$Mode);
        b = new qkj(DivTriggerJsonParser$Companion$TYPE_HELPER_MODE$1.w, divTrigger$Mode);
        c = new yhl(3);
    }
}
