package com.yandex.div2;

import defpackage.kvo;
import defpackage.qkj;
import defpackage.tlk;

/* loaded from: classes.dex */
public abstract class z {
    public static final kvo a;
    public static final qkj b;
    public static final tlk c;

    static {
        DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
        a = new kvo(divTransitionSelector);
        b = new qkj(DivDataJsonParser$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1.w, divTransitionSelector);
        c = new tlk(4);
    }
}
