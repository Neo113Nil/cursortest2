package com.yandex.go.taxi.order.chat.data;

import defpackage.a3y0;
import defpackage.e3n;
import defpackage.g18;
import defpackage.hst;
import defpackage.jqr;
import defpackage.jst;
import defpackage.kp50;
import defpackage.o430;
import defpackage.pzt0;
import defpackage.tje;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class a implements g18 {
    public final AtomicInteger a = new AtomicInteger();
    public pzt0 b;
    public pzt0 c;
    public final /* synthetic */ b w;

    public a(b bVar) {
        this.w = bVar;
    }

    public final synchronized void a() {
        pzt0 pzt0Var;
        pzt0 pzt0Var2 = this.w.w;
        if (!(pzt0Var2 != null && pzt0Var2.isActive())) {
            pzt0 pzt0Var3 = this.b;
            if (!(pzt0Var3 != null && pzt0Var3.isActive()) && ((pzt0Var = this.c) == null || !pzt0Var.isActive())) {
                this.w.i.getClass();
                a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                hst hstVar = jst.e;
                b bVar = this.w;
                this.c = tje.N(bVar.a, bVar.g, null, new TaxiOrderChatRepository$AutoPolling$makeFirstPull$2(bVar, null), 2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000e, B:11:0x0019), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(long j) {
        boolean z;
        if (this.a.get() > 0) {
            pzt0 pzt0Var = this.b;
            if (pzt0Var != null) {
                z = true;
                if (pzt0Var.isActive()) {
                    if (!z) {
                        this.w.i.getClass();
                        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                        hst hstVar = jst.e;
                        o430 o430Var = e3n.b;
                        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                        this.b = e.H(this.w.a, e.F(new jqr(com.yandex.go.coroutines.b.m(kp50.V(j, durationUnit), kp50.V(j, durationUnit)), new TaxiOrderChatRepository$AutoPolling$nextPull$2(this.w, null), 3), this.w.g));
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
    }

    @Override // defpackage.g18
    public final void cancel() {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c = null;
        b bVar = this.w;
        pzt0 pzt0Var2 = bVar.w;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        bVar.w = null;
        pzt0 pzt0Var3 = this.b;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.b = null;
    }
}
