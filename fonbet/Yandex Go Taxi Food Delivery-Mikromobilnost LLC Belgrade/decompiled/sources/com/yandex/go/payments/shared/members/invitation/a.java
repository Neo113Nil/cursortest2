package com.yandex.go.payments.shared.members.invitation;

import com.yandex.go.coroutines.b;
import defpackage.bpr0;
import defpackage.jey;
import defpackage.ney;
import defpackage.pzt0;
import defpackage.tje;

/* loaded from: classes8.dex */
public final class a extends jey {
    public final /* synthetic */ bpr0 a;
    public final /* synthetic */ ney b;

    public a(bpr0 bpr0Var, ney neyVar) {
        this.a = bpr0Var;
        this.b = neyVar;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onCreate() {
        bpr0 bpr0Var = this.a;
        b.g(bpr0Var.a, null, null, new SharedPaymentsInvitationController$synchronizeAccountInvitationsReadState$1(bpr0Var, null), 3);
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onDestroy() {
        ney neyVar = this.b;
        bpr0 bpr0Var = this.a;
        neyVar.d(bpr0Var);
        bpr0Var.h.removeCallbacks(bpr0Var.i);
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onPause() {
        pzt0 pzt0Var = this.a.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onResume() {
        bpr0 bpr0Var = this.a;
        pzt0 pzt0Var = bpr0Var.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bpr0Var.e = tje.N(bpr0Var.a, null, null, new SharedPaymentsInvitationController$startInvitationsMonitoring$$inlined$safeCollectIn$1(bpr0Var.c.m(), null, bpr0Var), 3);
    }
}
