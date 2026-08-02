package com.yandex.messaging.internal.view.timeline;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.view.timeline.j;
import defpackage.e190;
import defpackage.e9h0;
import defpackage.g62;
import defpackage.i3y;
import defpackage.ip31;
import defpackage.iw10;
import defpackage.jl40;
import defpackage.jwf;
import defpackage.kb;
import defpackage.nw10;
import defpackage.olh0;
import defpackage.pj91;
import defpackage.pm5;
import defpackage.sls;
import defpackage.t190;
import defpackage.tbz0;
import defpackage.tm1;
import defpackage.tu10;
import defpackage.tzk;
import defpackage.ul6;
import defpackage.vb5;
import defpackage.w7b;
import defpackage.yab;
import defpackage.zoy0;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class j extends e {
    public static final int H0 = olh0.msg_vh_chat_other_div_stub;
    public final jwf B0;
    public final tzk C0;
    public final iw10 D0;
    public final i3y E0;
    public final a F0;
    public final com.yandex.messaging.internal.view.timeline.overlay.b G0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(jwf jwfVar) {
        super(false, r3, jwfVar);
        kb kbVar = (kb) jwfVar.M;
        e190 e190Var = (e190) jwfVar.n;
        tzk tzkVar = (tzk) jwfVar.f;
        View view = tzkVar.getView();
        final int i = 0;
        this.B0 = jwfVar;
        this.C0 = tzkVar;
        this.E0 = kotlin.a.a(new sls(this) { // from class: uzk
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                j jVar = this.b;
                switch (i2) {
                    case 0:
                        return ((ow10) jVar.B0.I).a(null, jVar.T);
                    case 1:
                        return Boolean.valueOf(((nm1) ((h3y) jVar.B0.E).get()).c);
                    case 2:
                        return Boolean.valueOf(((rbv0) ((h3y) jVar.B0.D).get()).c);
                    default:
                        try {
                            return jVar.e0();
                        } catch (IllegalStateException unused) {
                            z83.i();
                            return null;
                        }
                }
            }
        });
        final int i2 = 1;
        i3y a = kotlin.a.a(new sls(this) { // from class: uzk
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                j jVar = this.b;
                switch (i22) {
                    case 0:
                        return ((ow10) jVar.B0.I).a(null, jVar.T);
                    case 1:
                        return Boolean.valueOf(((nm1) ((h3y) jVar.B0.E).get()).c);
                    case 2:
                        return Boolean.valueOf(((rbv0) ((h3y) jVar.B0.D).get()).c);
                    default:
                        try {
                            return jVar.e0();
                        } catch (IllegalStateException unused) {
                            z83.i();
                            return null;
                        }
                }
            }
        });
        final int i3 = 2;
        i3y a2 = kotlin.a.a(new sls(this) { // from class: uzk
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                j jVar = this.b;
                switch (i22) {
                    case 0:
                        return ((ow10) jVar.B0.I).a(null, jVar.T);
                    case 1:
                        return Boolean.valueOf(((nm1) ((h3y) jVar.B0.E).get()).c);
                    case 2:
                        return Boolean.valueOf(((rbv0) ((h3y) jVar.B0.D).get()).c);
                    default:
                        try {
                            return jVar.e0();
                        } catch (IllegalStateException unused) {
                            z83.i();
                            return null;
                        }
                }
            }
        });
        View findViewById = view.findViewById(e9h0.dialog_div_container);
        if (findViewById == null || !(((Boolean) a.getValue()).booleanValue() || ((Boolean) a2.getValue()).booleanValue())) {
            this.G0 = e190Var.a((ViewGroup) view, new ip31(view), this.z0);
            return;
        }
        ul6 ul6Var = new ul6(view);
        t190 t190Var = new t190(view);
        com.yandex.messaging.internal.view.timeline.overlay.b a3 = e190Var.a((ViewGroup) view, t190Var, this.z0);
        this.G0 = a3;
        tm1 tm1Var = new tm1(kbVar.b(this, this.t0.g), kbVar.a(this));
        iw10 iw10Var = new iw10();
        this.D0 = iw10Var;
        zoy0 zoy0Var = a.i;
        pm5 pm5Var = new pm5(7, new g62[]{ul6Var, t190Var});
        final int i4 = 3;
        sls slsVar = new sls(this) { // from class: uzk
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                j jVar = this.b;
                switch (i22) {
                    case 0:
                        return ((ow10) jVar.B0.I).a(null, jVar.T);
                    case 1:
                        return Boolean.valueOf(((nm1) ((h3y) jVar.B0.E).get()).c);
                    case 2:
                        return Boolean.valueOf(((rbv0) ((h3y) jVar.B0.D).get()).c);
                    default:
                        try {
                            return jVar.e0();
                        } catch (IllegalStateException unused) {
                            z83.i();
                            return null;
                        }
                }
            }
        };
        zoy0Var.getClass();
        this.F0 = new a(findViewById, pm5Var, a3, tm1Var, iw10Var, jwfVar, slsVar);
    }

    @Override // defpackage.qdz0
    public final boolean W() {
        return this.G0.b();
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        this.O = new tbz0(yabVar.Z(), yabVar.a());
        ChatRequest chatRequest = e0().d;
        w7b w7bVar = e0().k;
        tzk tzkVar = this.C0;
        tzkVar.g(chatRequest, w7bVar);
        tzkVar.d(yabVar);
        this.G0.a(this.t0, yabVar, e0().f);
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void f0() {
        super.f0();
        this.C0.cleanup();
        this.G0.e();
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void s0() {
        super.s0();
        this.C0.f();
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void t0() {
        super.t0();
        this.C0.e();
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void u0(yab yabVar, MessageData messageData) {
        nw10 b;
        i3y i3yVar = this.E0;
        com.yandex.messaging.internal.view.timeline.translations.c cVar = (com.yandex.messaging.internal.view.timeline.translations.c) i3yVar.getValue();
        if (cVar != null) {
            cVar.a(yabVar, null, this.D0, e0());
        }
        String W = yabVar.W();
        a aVar = this.F0;
        if (W == null || !this.t0.h || this.R || aVar == null) {
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        tu10 tu10Var = new tu10(yabVar.a.getPosition(), yabVar.w0(), W, this.c0, jl40.l(messageData.persistentSuggests, Boolean.TRUE));
        ArrayList arrayList = new ArrayList();
        com.yandex.messaging.internal.view.timeline.translations.c cVar2 = (com.yandex.messaging.internal.view.timeline.translations.c) i3yVar.getValue();
        if (cVar2 != null && (b = cVar2.b(pj91.f(this.a).getLayoutInflater())) != null) {
            arrayList.add(b);
        }
        aVar.a(messageData.aiBotActions, arrayList, messageData.layoutSuggestsRows, messageData.regularSuggests, tu10Var);
    }
}
