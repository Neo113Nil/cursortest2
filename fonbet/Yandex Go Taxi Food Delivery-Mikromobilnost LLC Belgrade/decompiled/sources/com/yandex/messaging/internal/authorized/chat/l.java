package com.yandex.messaging.internal.authorized.chat;

import android.content.Context;
import android.os.Looper;
import defpackage.at2;
import defpackage.h3t0;
import defpackage.h3y;
import defpackage.o1b0;
import defpackage.oeb;
import defpackage.p150;
import defpackage.rol0;
import defpackage.rp21;
import defpackage.sb7;
import defpackage.z5z;

/* loaded from: classes15.dex */
public final class l extends p150 {
    public final o1b0 l;
    public final sb7 m;
    public final Looper n;

    public l(Context context, o1b0 o1b0Var, at2 at2Var, sb7 sb7Var, oeb oebVar, rp21 rp21Var, z5z z5zVar, h3y h3yVar) {
        super(context, o1b0Var, at2Var, oebVar, rp21Var, z5zVar, h3yVar);
        this.l = o1b0Var;
        this.m = sb7Var;
        this.n = Looper.myLooper();
    }

    public final rol0 j(h3t0 h3t0Var) {
        return new rol0(new NameController$flow$1(this, h3t0Var, null));
    }
}
