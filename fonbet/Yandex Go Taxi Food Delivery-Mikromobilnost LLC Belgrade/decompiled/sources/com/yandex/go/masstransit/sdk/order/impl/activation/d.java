package com.yandex.go.masstransit.sdk.order.impl.activation;

import defpackage.bvf0;
import defpackage.ctb1;
import defpackage.ffx;
import defpackage.fl10;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.o370;
import defpackage.p1z0;
import defpackage.pzt0;
import defpackage.s1z0;
import defpackage.t1z0;
import defpackage.t960;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.xby;
import defpackage.yt11;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class d implements yt11 {
    public final o370 a;
    public final fl10 b;
    public final r0 c;
    public final r0 d;
    public final n0 e;
    public final n0 f;
    public String g;
    public String h;
    public String i;
    public Boolean j;
    public pzt0 k;

    public d(o370 o370Var, fl10 fl10Var) {
        this.a = o370Var;
        this.b = fl10Var;
        r0 c = bvf0.c(s1z0.a);
        this.c = c;
        this.d = c;
        n0 c2 = ffx.c(0, 1, null, 5);
        this.e = c2;
        this.f = c2;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.d;
    }

    public final void b(String str) {
        r0 r0Var;
        Object value;
        xby.d.c("[TicketActivation] NFC Error: " + str);
        do {
            r0Var = this.c;
            value = r0Var.getValue();
        } while (!r0Var.k(value, p1z0.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        TicketActivationScanUiStateInteractor$requestPermission$1 ticketActivationScanUiStateInteractor$requestPermission$1;
        int i;
        if (continuationImpl instanceof TicketActivationScanUiStateInteractor$requestPermission$1) {
            ticketActivationScanUiStateInteractor$requestPermission$1 = (TicketActivationScanUiStateInteractor$requestPermission$1) continuationImpl;
            int i2 = ticketActivationScanUiStateInteractor$requestPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ticketActivationScanUiStateInteractor$requestPermission$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ticketActivationScanUiStateInteractor$requestPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ticketActivationScanUiStateInteractor$requestPermission$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ticketActivationScanUiStateInteractor$requestPermission$1.label = 1;
                    obj = ((com.yandex.go.permission.b) ((v7j0) this.a.a)).d(3, ticketActivationScanUiStateInteractor$requestPermission$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object t1z0Var = !((Boolean) obj).booleanValue() ? new t1z0(0) : s1z0.a;
                r0 r0Var = this.c;
                r0Var.getClass();
                r0Var.m(null, t1z0Var);
                return zy11.a;
            }
        }
        ticketActivationScanUiStateInteractor$requestPermission$1 = new TicketActivationScanUiStateInteractor$requestPermission$1(this, continuationImpl);
        Object obj2 = ticketActivationScanUiStateInteractor$requestPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ticketActivationScanUiStateInteractor$requestPermission$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        r0 r0Var2 = this.c;
        r0Var2.getClass();
        r0Var2.m(null, t1z0Var);
        return zy11.a;
    }

    public final void d(tse tseVar) {
        t1z0 t1z0Var = new t1z0(null, false);
        r0 r0Var = this.c;
        r0Var.getClass();
        r0Var.m(null, t1z0Var);
        tje.N(tseVar, null, null, new TicketActivationScanUiStateInteractor$resumeQrScan$1(this, null), 3);
    }

    public final void e() {
        pzt0 pzt0Var = this.k;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.k = null;
        try {
            i3y i3yVar = t960.d;
            t960.a(ctb1.b(), null, null);
        } catch (Exception e) {
            xby.d.i("[TicketActivation] Error stopping ValidationProvider", e);
        }
    }
}
