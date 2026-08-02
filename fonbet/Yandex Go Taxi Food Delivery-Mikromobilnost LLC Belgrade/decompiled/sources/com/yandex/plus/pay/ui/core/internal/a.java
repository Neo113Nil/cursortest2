package com.yandex.plus.pay.ui.core.internal;

import com.yandex.plus.home.common.utils.c;
import defpackage.bvf0;
import defpackage.mpd0;
import defpackage.tt20;
import defpackage.wyj;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a {
    public final mpd0 a;
    public final com.yandex.plus.pay.ui.core.internal.common.a b;

    public a(tt20 tt20Var, r0 r0Var, com.yandex.plus.pay.ui.core.internal.common.a aVar) {
        this.a = tt20Var;
        this.b = aVar;
        c.e(r0Var, bvf0.a(wyj.c), new PlusPayUIImpl$1(this, null));
    }
}
