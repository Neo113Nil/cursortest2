package com.yandex.go.taxi.order.repositories;

import android.content.Context;
import android.graphics.Color;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment;
import com.yandex.go.taxi.order.models.api.response.StateInfoTimer;
import defpackage.avj0;
import defpackage.dwh0;
import defpackage.lez0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.t7s;
import defpackage.vpr;
import defpackage.xng0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n b;
    public final /* synthetic */ TaxiOrder c;
    public final /* synthetic */ PaidWaitingTimerInCardExperiment.FreeWaiting w;

    public j(vpr vprVar, n nVar, TaxiOrder taxiOrder, PaidWaitingTimerInCardExperiment.FreeWaiting freeWaiting) {
        this.a = vprVar;
        this.b = nVar;
        this.c = taxiOrder;
        this.w = freeWaiting;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1 paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1;
        int i;
        lez0 lez0Var;
        PaidWaitingTimerInCardExperiment.FreeWaitingInTitle freeWaitingInTitle;
        PaidWaitingTimerInCardExperiment.FreeWaitingInTitle freeWaitingInTitle2;
        String a;
        long j;
        int t;
        int t2;
        String str;
        PaidWaitingTimerInCardExperiment.State state;
        String str2;
        PaidWaitingTimerInCardExperiment.State state2;
        n nVar = this.b;
        Context context = nVar.a;
        if (continuation instanceof PaidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1) {
            paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1 = (PaidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1) continuation;
            int i2 = paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    long longValue = ((Number) obj).longValue();
                    TaxiOrder taxiOrder = this.c;
                    String d = (!n.f(taxiOrder.V()).b ? (freeWaitingInTitle = n.d(taxiOrder).e) != null && freeWaitingInTitle.a && freeWaitingInTitle.c == PaidWaitingTimerInCardExperiment.FreeWaitingInTitle.TimeFormat.ABBREVIATED : taxiOrder.V().Z.b.b == StateInfoTimer.TimeFormat.ABBREVIATED) ? t7s.d(longValue, "%1$02d:%2$02d", "%1$d:%2$02d:%3$02d") : nVar.a(longValue);
                    if (!n.f(taxiOrder.V()).b ? (freeWaitingInTitle2 = n.d(taxiOrder).e) != null && freeWaitingInTitle2.a && freeWaitingInTitle2.c == PaidWaitingTimerInCardExperiment.FreeWaitingInTitle.TimeFormat.ABBREVIATED : taxiOrder.V().Z.b.b == StateInfoTimer.TimeFormat.ABBREVIATED) {
                        int i3 = (int) longValue;
                        zuj0 zuj0Var = nVar.d;
                        Pattern pattern = t7s.a;
                        int i4 = i3 / 3600;
                        int i5 = i3 - (i4 * 3600);
                        int i6 = i5 / 60;
                        int i7 = i5 - (i6 * 60);
                        StringBuilder sb = new StringBuilder();
                        j = longValue;
                        if (i4 > 0) {
                            sb.append(((avj0) zuj0Var).f(dwh0.date_format_hours_left, i4));
                            sb.append(" ");
                        }
                        if (i6 > 0) {
                            sb.append(((avj0) zuj0Var).f(dwh0.date_format_minutes_left, i6));
                            sb.append(" ");
                        }
                        sb.append(((avj0) zuj0Var).f(dwh0.date_format_in_seconds, i7));
                        a = sb.toString();
                    } else {
                        a = nVar.a(longValue);
                        j = longValue;
                    }
                    String str3 = a;
                    PaidWaitingTimerInCardExperiment.FreeWaiting freeWaiting = this.w;
                    if (((freeWaiting == null || (state2 = freeWaiting.c) == null) ? null : state2.b) != null) {
                        PaidWaitingTimerInCardExperiment.State state3 = freeWaiting.b;
                        if ((state3 != null ? state3.b : null) != null) {
                            if (j <= freeWaiting.d) {
                                PaidWaitingTimerInCardExperiment.State state4 = freeWaiting.c;
                                if (state4 != null) {
                                    str2 = state4.b;
                                    t = Color.parseColor(str2);
                                    int i8 = t;
                                    if (((freeWaiting != null || (state = freeWaiting.c) == null) ? null : state.a) != null) {
                                        PaidWaitingTimerInCardExperiment.State state5 = freeWaiting.b;
                                        if ((state5 != null ? state5.a : null) != null) {
                                            if (j <= freeWaiting.d) {
                                                PaidWaitingTimerInCardExperiment.State state6 = freeWaiting.c;
                                                if (state6 != null) {
                                                    str = state6.a;
                                                    t2 = Color.parseColor(str);
                                                    lez0Var = new lez0(i8, t2, d, str3, n.c(nVar, taxiOrder));
                                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$0 = null;
                                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$1 = null;
                                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$2 = null;
                                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$3 = null;
                                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label = 1;
                                                    if (this.a.emit(lez0Var, paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                }
                                                str = null;
                                                t2 = Color.parseColor(str);
                                                lez0Var = new lez0(i8, t2, d, str3, n.c(nVar, taxiOrder));
                                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$0 = null;
                                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$1 = null;
                                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$2 = null;
                                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$3 = null;
                                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label = 1;
                                                if (this.a.emit(lez0Var, paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1) == coroutineSingletons) {
                                                }
                                            } else {
                                                if (state5 != null) {
                                                    str = state5.a;
                                                    t2 = Color.parseColor(str);
                                                    lez0Var = new lez0(i8, t2, d, str3, n.c(nVar, taxiOrder));
                                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$0 = null;
                                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$1 = null;
                                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$2 = null;
                                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$3 = null;
                                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label = 1;
                                                    if (this.a.emit(lez0Var, paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1) == coroutineSingletons) {
                                                    }
                                                }
                                                str = null;
                                                t2 = Color.parseColor(str);
                                                lez0Var = new lez0(i8, t2, d, str3, n.c(nVar, taxiOrder));
                                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$0 = null;
                                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$1 = null;
                                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$2 = null;
                                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$3 = null;
                                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label = 1;
                                                if (this.a.emit(lez0Var, paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1) == coroutineSingletons) {
                                                }
                                            }
                                        }
                                    }
                                    t2 = qje.t(xng0.textMain, context);
                                    lez0Var = new lez0(i8, t2, d, str3, n.c(nVar, taxiOrder));
                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$0 = null;
                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$1 = null;
                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$2 = null;
                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$3 = null;
                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label = 1;
                                    if (this.a.emit(lez0Var, paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1) == coroutineSingletons) {
                                    }
                                }
                                str2 = null;
                                t = Color.parseColor(str2);
                                int i82 = t;
                                if (((freeWaiting != null || (state = freeWaiting.c) == null) ? null : state.a) != null) {
                                }
                                t2 = qje.t(xng0.textMain, context);
                                lez0Var = new lez0(i82, t2, d, str3, n.c(nVar, taxiOrder));
                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$0 = null;
                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$1 = null;
                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$2 = null;
                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$3 = null;
                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label = 1;
                                if (this.a.emit(lez0Var, paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1) == coroutineSingletons) {
                                }
                            } else {
                                if (state3 != null) {
                                    str2 = state3.b;
                                    t = Color.parseColor(str2);
                                    int i822 = t;
                                    if (((freeWaiting != null || (state = freeWaiting.c) == null) ? null : state.a) != null) {
                                    }
                                    t2 = qje.t(xng0.textMain, context);
                                    lez0Var = new lez0(i822, t2, d, str3, n.c(nVar, taxiOrder));
                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$0 = null;
                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$1 = null;
                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$2 = null;
                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$3 = null;
                                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label = 1;
                                    if (this.a.emit(lez0Var, paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1) == coroutineSingletons) {
                                    }
                                }
                                str2 = null;
                                t = Color.parseColor(str2);
                                int i8222 = t;
                                if (((freeWaiting != null || (state = freeWaiting.c) == null) ? null : state.a) != null) {
                                }
                                t2 = qje.t(xng0.textMain, context);
                                lez0Var = new lez0(i8222, t2, d, str3, n.c(nVar, taxiOrder));
                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$0 = null;
                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$1 = null;
                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$2 = null;
                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$3 = null;
                                paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label = 1;
                                if (this.a.emit(lez0Var, paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1) == coroutineSingletons) {
                                }
                            }
                        }
                    }
                    t = qje.t(xng0.bgMain, context);
                    int i82222 = t;
                    if (((freeWaiting != null || (state = freeWaiting.c) == null) ? null : state.a) != null) {
                    }
                    t2 = qje.t(xng0.textMain, context);
                    lez0Var = new lez0(i82222, t2, d, str3, n.c(nVar, taxiOrder));
                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$0 = null;
                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$1 = null;
                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$2 = null;
                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.L$3 = null;
                    paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lez0Var, paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1 = new PaidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1(this, continuation);
        Object obj22 = paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paidWaitingTimerInCardRepository$prepareTimer$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
