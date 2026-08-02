package com.yandex.pulse.mvi.tracker;

import com.yandex.pulse.mvi.utils.WeakHandler;
import defpackage.ioz;
import defpackage.lwa0;
import defpackage.owj0;
import defpackage.t6f0;
import defpackage.v941;
import defpackage.zu20;

/* loaded from: classes8.dex */
public class TimeToInteractiveTracker {
    public final zu20 a;
    public final ioz b;
    public final long c;
    public final long d;
    public final boolean e;
    public lwa0 f;
    public lwa0 g;
    public final t6f0 h = new t6f0(7, this);
    public final WeakHandler i;
    public long j;
    public long k;
    private final v941 mHandlerCallback;

    public TimeToInteractiveTracker(zu20 zu20Var, ioz iozVar, long j, long j2, boolean z) {
        owj0 owj0Var = new owj0(1, this);
        this.mHandlerCallback = owj0Var;
        this.i = new WeakHandler(owj0Var);
        this.j = -1L;
        this.a = zu20Var;
        this.b = iozVar;
        this.c = j;
        this.d = j2;
        this.e = z;
    }

    public final void a() {
        this.b.a(null);
        this.i.removeMessages(0);
        this.f = null;
        this.g = null;
        this.j = -1L;
        this.k = 0L;
    }
}
