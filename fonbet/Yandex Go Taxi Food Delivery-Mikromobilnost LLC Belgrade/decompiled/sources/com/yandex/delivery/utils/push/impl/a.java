package com.yandex.delivery.utils.push.impl;

import com.squareup.moshi.Moshi;
import defpackage.bvf0;
import defpackage.ffx;
import defpackage.fse;
import defpackage.i3y;
import defpackage.ike;
import defpackage.st2;
import defpackage.t7i;
import defpackage.tje;
import defpackage.tse;
import java.util.Set;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class a implements tse {
    public final /* synthetic */ ike a;
    public final Set b;
    public final st2 c;
    public final Moshi w;
    public final i3y x = kotlin.a.a(new t7i(this, 1));
    public final n0 y = ffx.c(0, 0, null, 7);

    public a(Set set, st2 st2Var, Moshi moshi) {
        this.a = bvf0.a(st2Var.c);
        this.b = set;
        this.c = st2Var;
        this.w = moshi;
    }

    public final void a(String str) {
        tje.N(this, this.c.c, null, new DeliveryPushListenerImpl$onPush$1(this, str, null), 2);
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.a.a;
    }
}
