package com.yandex.go.summary.interactor.core;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import defpackage.b580;
import defpackage.c4r0;
import defpackage.f580;
import defpackage.fbj0;
import defpackage.fmw0;
import defpackage.g580;
import defpackage.gdv0;
import defpackage.gi;
import defpackage.iwe0;
import defpackage.jmw0;
import defpackage.jst;
import defpackage.kmw0;
import defpackage.lmw0;
import defpackage.lot0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ogj0;
import defpackage.oiv0;
import defpackage.pev0;
import defpackage.pex0;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tlx0;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vqv0;
import defpackage.vwm;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.x8;
import defpackage.yfx0;
import defpackage.zjj0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class v {
    public final pev0 a;
    public final tt2 b;
    public final vqv0 c;
    public final wiq0 d;
    public final f580 e;
    public final c4r0 f;
    public final vwm g;
    public final iwe0 h;
    public final g580 i;
    public final ogj0 j;
    public final lot0 k;
    public final yfx0 l;

    public v(pev0 pev0Var, tt2 tt2Var, vqv0 vqv0Var, wiq0 wiq0Var, f580 f580Var, c4r0 c4r0Var, vwm vwmVar, iwe0 iwe0Var, g580 g580Var, ogj0 ogj0Var, lot0 lot0Var, yfx0 yfx0Var) {
        this.a = pev0Var;
        this.b = tt2Var;
        this.c = vqv0Var;
        this.d = wiq0Var;
        this.e = f580Var;
        this.f = c4r0Var;
        this.g = vwmVar;
        this.h = iwe0Var;
        this.i = g580Var;
        this.j = ogj0Var;
        this.k = lot0Var;
        this.l = yfx0Var;
    }

    public final Object a(String str, b580 b580Var, oiv0 oiv0Var, Continuation continuation) {
        String b = this.k.b(str);
        if (b == null) {
            b = b580Var.f;
        }
        b580 a = b580.a(b580Var, null, null, b, 31);
        g580 g580Var = this.i;
        ((x8) g580Var).c(a, true);
        this.j.a.g(new fbj0(str, 4));
        ((x8) g580Var).a();
        return oiv0Var.x(null, new zjj0(str, null), (ContinuationImpl) continuation);
    }

    public final Object b(lmw0 lmw0Var, String str, oiv0 oiv0Var, ContinuationImpl continuationImpl) {
        if (lmw0Var instanceof kmw0) {
            tlx0 tlx0Var = ((kmw0) lmw0Var).h;
            return d(tlx0Var.a, tlx0Var.b, oiv0Var, true, continuationImpl);
        }
        boolean z = lmw0Var instanceof jmw0;
        zy11 zy11Var = zy11.a;
        if (!z) {
            if (lmw0Var instanceof fmw0) {
                return zy11Var;
            }
            w511.b();
            return null;
        }
        if (lmw0Var.f()) {
            return d(str, lmw0Var.getName(), oiv0Var, true, continuationImpl);
        }
        this.b.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new SummaryUiEventsInteractor$handleSingleRequirement$2(oiv0Var, lmw0Var, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11Var;
    }

    public final Object c(oiv0 oiv0Var, SummaryExpandReason summaryExpandReason, ContinuationImpl continuationImpl) {
        String str;
        com.yandex.go.taxi.tariffs.internal.repository.k kVar = (com.yandex.go.taxi.tariffs.internal.repository.k) this.d;
        pex0 m = kVar.m();
        if (m == null) {
            jst.e.k(new NullPointerException(), "Selected tariff should not be null");
            str = null;
        } else {
            str = m.b;
        }
        pex0 m2 = kVar.m();
        List f = m2 != null ? m2.f() : null;
        pex0 m3 = kVar.m();
        this.g.getClass();
        if (m3 == null || !m3.B || f == null || f.size() != 1 || str == null) {
            return this.a.a(new gdv0(summaryExpandReason), continuationImpl);
        }
        return b((lmw0) f.get(0), str, oiv0Var, continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b9, code lost:
    
        if ((r11 != null ? r11.u0(r0) : r7) == r1) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.yandex.go.summary.interactor.core.v] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [lmw0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, oiv0 oiv0Var, boolean z, ContinuationImpl continuationImpl) {
        SummaryUiEventsInteractor$redirectToTariff$1 summaryUiEventsInteractor$redirectToTariff$1;
        int i;
        String str3;
        pex0 m;
        Object c;
        pex0 m2;
        if (continuationImpl instanceof SummaryUiEventsInteractor$redirectToTariff$1) {
            summaryUiEventsInteractor$redirectToTariff$1 = (SummaryUiEventsInteractor$redirectToTariff$1) continuationImpl;
            int i2 = summaryUiEventsInteractor$redirectToTariff$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryUiEventsInteractor$redirectToTariff$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryUiEventsInteractor$redirectToTariff$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryUiEventsInteractor$redirectToTariff$1.label;
                wiq0 wiq0Var = this.d;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.taxi.tariffs.internal.repository.k kVar = (com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var;
                    pex0 m3 = kVar.m();
                    String str4 = m3 != null ? m3.b : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    this.e.d(str4, str);
                    summaryUiEventsInteractor$redirectToTariff$1.L$0 = null;
                    summaryUiEventsInteractor$redirectToTariff$1.L$1 = str2;
                    summaryUiEventsInteractor$redirectToTariff$1.L$2 = oiv0Var;
                    summaryUiEventsInteractor$redirectToTariff$1.Z$0 = z;
                    summaryUiEventsInteractor$redirectToTariff$1.label = 1;
                    pex0 m4 = kVar.m();
                    if (m4 != null && (str3 = m4.b) != null) {
                        this.h.b(str3, str);
                    }
                    pzt0 e = c4r0.e(this.f, SelectionOrigin.REDIRECT, str, null, 12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    z = summaryUiEventsInteractor$redirectToTariff$1.Z$0;
                    oiv0Var = (oiv0) summaryUiEventsInteractor$redirectToTariff$1.L$2;
                    str2 = (String) summaryUiEventsInteractor$redirectToTariff$1.L$1;
                    kotlin.b.b(obj);
                }
                m = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).m();
                if (m != null) {
                    if (z) {
                        this.l.getClass();
                        if (!yfx0.a(m).isEmpty()) {
                            SummaryExpandReason summaryExpandReason = SummaryExpandReason.AUTO_REDIRECT;
                            zjj0 zjj0Var = new zjj0(str2, null);
                            summaryUiEventsInteractor$redirectToTariff$1.L$0 = null;
                            summaryUiEventsInteractor$redirectToTariff$1.L$1 = null;
                            summaryUiEventsInteractor$redirectToTariff$1.L$2 = null;
                            summaryUiEventsInteractor$redirectToTariff$1.L$3 = null;
                            summaryUiEventsInteractor$redirectToTariff$1.Z$0 = z;
                            summaryUiEventsInteractor$redirectToTariff$1.label = 2;
                            if (oiv0Var.x(summaryExpandReason, zjj0Var, summaryUiEventsInteractor$redirectToTariff$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    jmw0 g = (str2 == null || (m2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.g.a).m()) == null) ? 0 : ru.yandex.taxi.tariffs.model.b.g(m2, str2);
                    if (g != 0) {
                        String str5 = m.b;
                        summaryUiEventsInteractor$redirectToTariff$1.L$0 = null;
                        summaryUiEventsInteractor$redirectToTariff$1.L$1 = null;
                        summaryUiEventsInteractor$redirectToTariff$1.L$2 = null;
                        summaryUiEventsInteractor$redirectToTariff$1.L$3 = null;
                        summaryUiEventsInteractor$redirectToTariff$1.L$4 = null;
                        summaryUiEventsInteractor$redirectToTariff$1.Z$0 = z;
                        summaryUiEventsInteractor$redirectToTariff$1.label = 3;
                        boolean z2 = g instanceof jmw0;
                        jmw0 jmw0Var = z2 ? g : null;
                        if (jmw0Var != null && jmw0Var.s().c.size() >= 2) {
                            c = b(g, str5, oiv0Var, summaryUiEventsInteractor$redirectToTariff$1);
                        } else if (g instanceof fmw0) {
                            fmw0 fmw0Var = (fmw0) g;
                            String str6 = fmw0Var.a;
                            c = a(str6, gi.e(str6, fmw0Var.b), oiv0Var, summaryUiEventsInteractor$redirectToTariff$1);
                        } else {
                            if (z2) {
                                jmw0 jmw0Var2 = g;
                                if (jmw0Var2.t()) {
                                    c = a(g.getName(), q5z.u(jmw0Var2, jmw0Var2.s().c), oiv0Var, summaryUiEventsInteractor$redirectToTariff$1);
                                }
                            }
                            c = c(oiv0Var, SummaryExpandReason.AUTO_UNSUPPORTED_REQUIREMENT_ON_ORDER, summaryUiEventsInteractor$redirectToTariff$1);
                        }
                        if (c != coroutineSingletons) {
                            return c;
                        }
                    }
                }
                return zy11Var;
            }
        }
        summaryUiEventsInteractor$redirectToTariff$1 = new SummaryUiEventsInteractor$redirectToTariff$1(this, continuationImpl);
        Object obj2 = summaryUiEventsInteractor$redirectToTariff$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryUiEventsInteractor$redirectToTariff$1.label;
        wiq0 wiq0Var2 = this.d;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        m = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var2).m();
        if (m != null) {
        }
        return zy11Var2;
    }
}
