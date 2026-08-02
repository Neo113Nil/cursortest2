package com.yandex.div2;

import defpackage.ivk;
import defpackage.kvo;
import defpackage.qkj;

/* loaded from: classes11.dex */
public abstract class i1 {
    public static final kvo a;
    public static final qkj b;
    public static final ivk c;

    static {
        DivPatch$Mode divPatch$Mode = DivPatch$Mode.PARTIAL;
        a = new kvo(divPatch$Mode);
        b = new qkj(DivPatchJsonParser$Companion$TYPE_HELPER_MODE$1.w, divPatch$Mode);
        c = new ivk(15);
    }
}
