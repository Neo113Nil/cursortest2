package com.yandex.go.payments.addmethod.ui.home;

import defpackage.ah0;
import defpackage.bh0;
import defpackage.ch0;
import defpackage.dh0;
import defpackage.eh0;
import defpackage.fh0;
import defpackage.g9a0;
import defpackage.gg0;
import defpackage.gh0;
import defpackage.h0;
import defpackage.hh0;
import defpackage.ih0;
import defpackage.jh0;
import defpackage.jl40;
import defpackage.kk0;
import defpackage.p0;
import defpackage.qh0;
import defpackage.qu;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.yfd;
import defpackage.zy11;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gg0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(gg0 gg0Var, yfd yfdVar) {
        this.b = gg0Var;
        this.c = yfdVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        gg0 gg0Var = this.b;
        Object obj2 = this.c;
        int i2 = 3;
        switch (i) {
            case 0:
                kk0 kk0Var = gg0Var.J;
                g9a0 g9a0Var = gg0Var.H;
                yfd yfdVar = (yfd) obj2;
                final jh0 jh0Var = (jh0) obj;
                if (jh0Var instanceof eh0) {
                    if (!((eh0) jh0Var).b.isEmpty()) {
                        tje.N(gg0Var.o(), null, null, new AddPaymentHomeComposeRouter$content$1$2$1(jh0Var, gg0Var, null), 3);
                        return zy11Var;
                    }
                    final int i3 = 0;
                    gg0Var.r(new tls() { // from class: fg0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            int i4 = i3;
                            zy11 zy11Var2 = zy11.a;
                            jh0 jh0Var2 = jh0Var;
                            kg0 kg0Var = (kg0) obj3;
                            switch (i4) {
                                case 0:
                                    kg0Var.D0(((eh0) jh0Var2).a);
                                    break;
                                case 1:
                                    kg0Var.O(((fh0) jh0Var2).a);
                                    break;
                                default:
                                    kg0Var.h0(((hh0) jh0Var2).a);
                                    break;
                            }
                            return zy11Var2;
                        }
                    });
                    return zy11Var;
                }
                final int i4 = 1;
                if (jh0Var instanceof ah0) {
                    g9a0Var.getClass();
                    g9a0Var.a.a("PaymentMethods.YapeToken.Info", new HashMap(), 1, new HashMap());
                    kk0Var.a(((ah0) jh0Var).a);
                    return zy11Var;
                }
                if (jl40.l(jh0Var, bh0.a)) {
                    g9a0Var.getClass();
                    g9a0Var.a.a("PaymentMethods.YapeToken.Close", new HashMap(), 1, new HashMap());
                    gg0Var.r(new qu(9));
                    return zy11Var;
                }
                if (jl40.l(jh0Var, dh0.a)) {
                    tje.N(gg0Var.o(), null, null, new AddPaymentHomeComposeRouter$content$1$2$3(gg0Var, null), 3);
                    return zy11Var;
                }
                if (jh0Var instanceof ih0) {
                    tje.N(gg0Var.o(), null, null, new AddPaymentHomeComposeRouter$content$1$2$4(gg0Var, jh0Var, yfdVar, null), 3);
                    return zy11Var;
                }
                if (jh0Var instanceof fh0) {
                    gg0Var.r(new tls() { // from class: fg0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            int i42 = i4;
                            zy11 zy11Var2 = zy11.a;
                            jh0 jh0Var2 = jh0Var;
                            kg0 kg0Var = (kg0) obj3;
                            switch (i42) {
                                case 0:
                                    kg0Var.D0(((eh0) jh0Var2).a);
                                    break;
                                case 1:
                                    kg0Var.O(((fh0) jh0Var2).a);
                                    break;
                                default:
                                    kg0Var.h0(((hh0) jh0Var2).a);
                                    break;
                            }
                            return zy11Var2;
                        }
                    });
                    return zy11Var;
                }
                if (jh0Var instanceof gh0) {
                    kk0Var.b(((gh0) jh0Var).a);
                    return zy11Var;
                }
                if (jh0Var instanceof ch0) {
                    gg0Var.r(new p0(20));
                    return zy11Var;
                }
                if (!(jh0Var instanceof hh0)) {
                    w511.b();
                    return null;
                }
                final int i5 = 2;
                gg0Var.r(new tls() { // from class: fg0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        int i42 = i5;
                        zy11 zy11Var2 = zy11.a;
                        jh0 jh0Var2 = jh0Var;
                        kg0 kg0Var = (kg0) obj3;
                        switch (i42) {
                            case 0:
                                kg0Var.D0(((eh0) jh0Var2).a);
                                break;
                            case 1:
                                kg0Var.O(((fh0) jh0Var2).a);
                                break;
                            default:
                                kg0Var.h0(((hh0) jh0Var2).a);
                                break;
                        }
                        return zy11Var2;
                    }
                });
                return zy11Var;
            default:
                qh0 qh0Var = (qh0) obj2;
                String str = (String) obj;
                if (qh0Var != null) {
                    tje.N(gg0Var.o(), null, null, new AddPaymentHomeComposeRouter$content$1$2$1$1$1(gg0Var, qh0Var, str, null), 3);
                } else {
                    gg0Var.r(new h0(str, i2));
                }
                return zy11Var;
        }
    }

    public /* synthetic */ b(qh0 qh0Var, gg0 gg0Var) {
        this.c = qh0Var;
        this.b = gg0Var;
    }
}
