package com.yandex.go.payments.drive.navigation;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.lpm.navigation.d;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ama;
import defpackage.apf;
import defpackage.azz;
import defpackage.bjm0;
import defpackage.cda0;
import defpackage.drd;
import defpackage.dy90;
import defpackage.fl8;
import defpackage.h0a0;
import defpackage.jl40;
import defpackage.kv90;
import defpackage.l90;
import defpackage.lv90;
import defpackage.m6a0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.nem;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qaa0;
import defpackage.qqy;
import defpackage.t32;
import defpackage.tse;
import defpackage.u32;
import defpackage.uba0;
import defpackage.vem;
import defpackage.wls;
import defpackage.xku0;
import defpackage.xxc;
import defpackage.ycq0;
import defpackage.yy51;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.drive.navigation.DrivePaymentMethodsRouterImpl$onLaunch$1", f = "DrivePaymentMethodsRouterImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DrivePaymentMethodsRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ nem $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivePaymentMethodsRouterImpl$onLaunch$1(a aVar, nem nemVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = nemVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DrivePaymentMethodsRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DrivePaymentMethodsRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ad A[EDGE_INSN: B:19:0x01ad->B:20:0x01ad BREAK  A[LOOP:0: B:10:0x0198->B:17:0x0198], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0162  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f;
        Object obj2;
        lv90 lv90Var;
        Object obj3;
        dy90 dy90Var;
        ListIterator listIterator;
        qqy qqyVar;
        Iterator it;
        Object obj4;
        fl8 fl8Var;
        lv90 lv90Var2;
        PaymentMethod$Type paymentMethod$Type;
        Object obj5;
        Object obj6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            apf apfVar = this.this$0.I;
            String str = this.$payload.a;
            vem vemVar = (vem) apfVar.x;
            xku0 xku0Var = (xku0) apfVar.w;
            vemVar.a = xku0Var.a.a();
            if (str != null) {
                cda0 cda0Var = (cda0) apfVar.c;
                if (!jl40.l(xku0Var.a.a().b, str)) {
                    c cVar = (c) cda0Var;
                    ListBuilder h = cVar.h();
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator2 = h.listIterator(0);
                    while (true) {
                        qqy qqyVar2 = (qqy) listIterator2;
                        if (!qqyVar2.hasNext()) {
                            break;
                        }
                        Object next = qqyVar2.next();
                        if (next instanceof fl8) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (jl40.l(((fl8) obj2).a, str)) {
                            break;
                        }
                    }
                    fl8 fl8Var2 = (fl8) obj2;
                    if (fl8Var2 != null) {
                        kv90 kv90Var = lv90.Companion;
                        PaymentMethod$Type paymentMethod$Type2 = PaymentMethod$Type.CARD;
                        String str2 = fl8Var2.a;
                        kv90Var.getClass();
                        lv90Var = kv90.b(str2, paymentMethod$Type2);
                    } else {
                        lv90Var = null;
                    }
                    if (lv90Var == null) {
                        ListBuilder h2 = cVar.h();
                        ArrayList arrayList2 = new ArrayList();
                        ListIterator listIterator3 = h2.listIterator(0);
                        while (true) {
                            qqy qqyVar3 = (qqy) listIterator3;
                            if (!qqyVar3.hasNext()) {
                                break;
                            }
                            Object next2 = qqyVar3.next();
                            if (next2 instanceof yy51) {
                                arrayList2.add(next2);
                            }
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it3.next();
                            if (jl40.l(((yy51) obj3).a, str)) {
                                break;
                            }
                        }
                        yy51 yy51Var = (yy51) obj3;
                        if (yy51Var != null) {
                            kv90 kv90Var2 = lv90.Companion;
                            PaymentMethod$Type paymentMethod$Type3 = PaymentMethod$Type.YB_WALLET;
                            String str3 = yy51Var.a;
                            kv90Var2.getClass();
                            lv90Var = kv90.b(str3, paymentMethod$Type3);
                        } else {
                            lv90Var = null;
                        }
                    }
                    if (lv90Var != null) {
                        ((ycq0) apfVar.b).a(lv90Var);
                    }
                }
            }
            apf apfVar2 = this.this$0.G;
            boolean z = this.$payload.b;
            boolean b = ((drd) apfVar2.b).b.b();
            ((vem) apfVar2.c).b = b;
            xxc g = ((xku0) apfVar2.x).b.g();
            if (g != null) {
                if (!z && b) {
                    apfVar2.z(g);
                } else if (z && !b && g.a.e()) {
                    apfVar2.z(g);
                }
            }
            qaa0 a = this.this$0.J.a();
            if (a == null || (r2 = a.b) == null) {
                po21 po21Var = this.this$0.D;
                this.label = 1;
                f = ((e) po21Var).f(this);
                if (f == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            a aVar = this.this$0;
            nem nemVar = this.$payload;
            cda0 cda0Var2 = aVar.E;
            dy90Var = aVar.K;
            if (dy90Var == null) {
                com.yandex.go.payments.superapp.payment.b bVar = aVar.F;
                u32.a.getClass();
                dy90Var = bVar.a(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, t32.b, new l90(), uba0.g);
                aVar.K = dy90Var;
            }
            d a2 = dy90Var.a.a();
            PaymentMethod$Type paymentMethod$Type4 = PaymentMethod$Type.PERSONAL_WALLET;
            String str4 = nemVar.a;
            m6a0 m6a0Var = new m6a0(paymentMethod$Type4, str4, null);
            c cVar2 = (c) cda0Var2;
            ListBuilder h3 = cVar2.h();
            ArrayList arrayList3 = new ArrayList();
            listIterator = h3.listIterator(0);
            while (true) {
                qqyVar = (qqy) listIterator;
                if (qqyVar.hasNext()) {
                    break;
                }
                Object next3 = qqyVar.next();
                if (next3 instanceof fl8) {
                    arrayList3.add(next3);
                }
            }
            it = arrayList3.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (jl40.l(((fl8) obj4).a, str4)) {
                    break;
                }
            }
            fl8Var = (fl8) obj4;
            if (fl8Var == null) {
                kv90 kv90Var3 = lv90.Companion;
                PaymentMethod$Type paymentMethod$Type5 = PaymentMethod$Type.CARD;
                String str5 = fl8Var.a;
                kv90Var3.getClass();
                lv90Var2 = kv90.b(str5, paymentMethod$Type5);
            } else {
                lv90Var2 = null;
            }
            if (lv90Var2 == null) {
                ListBuilder h4 = cVar2.h();
                ArrayList arrayList4 = new ArrayList();
                ListIterator listIterator4 = h4.listIterator(0);
                while (true) {
                    qqy qqyVar4 = (qqy) listIterator4;
                    if (!qqyVar4.hasNext()) {
                        break;
                    }
                    Object next4 = qqyVar4.next();
                    if (next4 instanceof yy51) {
                        arrayList4.add(next4);
                    }
                }
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = it4.next();
                    if (jl40.l(((yy51) obj5).a, str4)) {
                        break;
                    }
                }
                yy51 yy51Var2 = (yy51) obj5;
                if (yy51Var2 != null) {
                    kv90 kv90Var4 = lv90.Companion;
                    PaymentMethod$Type paymentMethod$Type6 = PaymentMethod$Type.YB_WALLET;
                    String str6 = yy51Var2.a;
                    kv90Var4.getClass();
                    lv90Var2 = kv90.b(str6, paymentMethod$Type6);
                } else {
                    lv90Var2 = null;
                }
                if (lv90Var2 == null) {
                    ListBuilder h5 = cVar2.h();
                    ArrayList arrayList5 = new ArrayList();
                    ListIterator listIterator5 = h5.listIterator(0);
                    while (true) {
                        qqy qqyVar5 = (qqy) listIterator5;
                        if (!qqyVar5.hasNext()) {
                            break;
                        }
                        Object next5 = qqyVar5.next();
                        if (next5 instanceof bjm0) {
                            arrayList5.add(next5);
                        }
                    }
                    Iterator it5 = arrayList5.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj6 = null;
                            break;
                        }
                        obj6 = it5.next();
                        if (jl40.l(((bjm0) obj6).a, str4)) {
                            break;
                        }
                    }
                    bjm0 bjm0Var = (bjm0) obj6;
                    if (bjm0Var != null) {
                        kv90 kv90Var5 = lv90.Companion;
                        PaymentMethod$Type paymentMethod$Type7 = PaymentMethod$Type.SBP_TOKEN;
                        String str7 = bjm0Var.a;
                        kv90Var5.getClass();
                        lv90Var2 = kv90.b(str7, paymentMethod$Type7);
                    } else {
                        lv90Var2 = null;
                    }
                }
            }
            aVar.A(a2, new azz(PaymentsScreen.DRIVE, "no_feature", new h0a0(r2, null), (lv90Var2 != null || (paymentMethod$Type = lv90Var2.a) == null) ? null : new m6a0(paymentMethod$Type, str4, m6a0Var), true, false, null, false, false, null, null, null, null, null, null, null, null, null, 524160), new ama(1, aVar));
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        f = obj;
        zzs zzsVar = ((mo21) f).a();
        a aVar2 = this.this$0;
        nem nemVar2 = this.$payload;
        cda0 cda0Var22 = aVar2.E;
        dy90Var = aVar2.K;
        if (dy90Var == null) {
        }
        d a22 = dy90Var.a.a();
        PaymentMethod$Type paymentMethod$Type42 = PaymentMethod$Type.PERSONAL_WALLET;
        String str42 = nemVar2.a;
        m6a0 m6a0Var2 = new m6a0(paymentMethod$Type42, str42, null);
        c cVar22 = (c) cda0Var22;
        ListBuilder h32 = cVar22.h();
        ArrayList arrayList32 = new ArrayList();
        listIterator = h32.listIterator(0);
        while (true) {
            qqyVar = (qqy) listIterator;
            if (qqyVar.hasNext()) {
            }
        }
        it = arrayList32.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        fl8Var = (fl8) obj4;
        if (fl8Var == null) {
        }
        if (lv90Var2 == null) {
        }
        aVar2.A(a22, new azz(PaymentsScreen.DRIVE, "no_feature", new h0a0(zzsVar, null), (lv90Var2 != null || (paymentMethod$Type = lv90Var2.a) == null) ? null : new m6a0(paymentMethod$Type, str42, m6a0Var2), true, false, null, false, false, null, null, null, null, null, null, null, null, null, 524160), new ama(1, aVar2));
        return zy11.a;
    }
}
