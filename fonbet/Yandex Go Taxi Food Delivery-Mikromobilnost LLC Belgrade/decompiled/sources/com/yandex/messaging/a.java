package com.yandex.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.bvf0;
import defpackage.eke;
import defpackage.h3y;
import defpackage.ike;
import defpackage.m2v;
import defpackage.q120;
import defpackage.tje;
import defpackage.x22;
import defpackage.yz10;

/* loaded from: classes15.dex */
public final class a {
    public static boolean k;
    public final Context a;
    public final eke b;
    public final h3y c;
    public final MessengerEnvironment d;
    public final SharedPreferences e;
    public final x22 f;
    public final q120 g;
    public final yz10 h;
    public final m2v i;
    public final ike j = bvf0.b();

    public a(Context context, eke ekeVar, h3y h3yVar, MessengerEnvironment messengerEnvironment, SharedPreferences sharedPreferences, x22 x22Var, q120 q120Var, yz10 yz10Var, m2v m2vVar) {
        this.a = context;
        this.b = ekeVar;
        this.c = h3yVar;
        this.d = messengerEnvironment;
        this.e = sharedPreferences;
        this.f = x22Var;
        this.g = q120Var;
        this.h = yz10Var;
        this.i = m2vVar;
    }

    public final void a() {
        tje.N(this.j, null, null, new MessengerInitLogger$reportInitialized$1(this, null), 3);
    }
}
