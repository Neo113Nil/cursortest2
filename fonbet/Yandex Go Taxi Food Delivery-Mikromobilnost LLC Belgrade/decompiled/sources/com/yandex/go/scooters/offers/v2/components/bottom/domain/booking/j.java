package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import android.content.Context;
import com.yandex.go.scooters.super_passes.upsale_on_book.data.model.ScootersUpsaleSuperPassOnBookExperiment;
import defpackage.a2p0;
import defpackage.abo0;
import defpackage.b3n0;
import defpackage.b4p0;
import defpackage.bvf0;
import defpackage.c0g;
import defpackage.dvw;
import defpackage.f9s;
import defpackage.g7n0;
import defpackage.h7n0;
import defpackage.j18;
import defpackage.jl40;
import defpackage.jwf;
import defpackage.k2p0;
import defpackage.k6p0;
import defpackage.l0p0;
import defpackage.lrm0;
import defpackage.m2p0;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.p2p0;
import defpackage.p7g;
import defpackage.pwy0;
import defpackage.q4o0;
import defpackage.q5z;
import defpackage.qco0;
import defpackage.qxm0;
import defpackage.r95;
import defpackage.rco0;
import defpackage.rqo;
import defpackage.sco0;
import defpackage.t2n0;
import defpackage.tj60;
import defpackage.tt2;
import defpackage.uem;
import defpackage.w030;
import defpackage.w1p0;
import defpackage.w20;
import defpackage.w511;
import defpackage.wz1;
import defpackage.x1p0;
import defpackage.xvf0;
import defpackage.xzt0;
import defpackage.y1p0;
import defpackage.y5n0;
import defpackage.y5p0;
import defpackage.yp2;
import defpackage.z1p0;
import defpackage.z2o0;
import defpackage.znn0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

/* loaded from: classes13.dex */
public final class j extends r95 {
    public final Context b;
    public final ru.yandex.taxi.widget.c c;
    public final n6n0 d;
    public final tj60 e;
    public final y5p0 f;
    public final znn0 g;
    public final b3n0 h;
    public final z2o0 i;
    public final com.yandex.go.scooters.passes.domain.i j;
    public final com.yandex.go.scooters.offers.v2.components.bottom.data.a k;
    public final com.yandex.go.scooters.passes.domain.g l;
    public final com.yandex.go.scooters.super_passes.upsale_on_book.data.a m;
    public final k6p0 n;

    public j(Context context, ru.yandex.taxi.widget.c cVar, n6n0 n6n0Var, tj60 tj60Var, y5p0 y5p0Var, znn0 znn0Var, b3n0 b3n0Var, z2o0 z2o0Var, com.yandex.go.scooters.passes.domain.i iVar, com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar, com.yandex.go.scooters.passes.domain.g gVar, com.yandex.go.scooters.super_passes.upsale_on_book.data.a aVar2, k6p0 k6p0Var) {
        this.b = context;
        this.c = cVar;
        this.d = n6n0Var;
        this.e = tj60Var;
        this.f = y5p0Var;
        this.g = znn0Var;
        this.h = b3n0Var;
        this.i = z2o0Var;
        this.j = iVar;
        this.k = aVar;
        this.l = gVar;
        this.m = aVar2;
        this.n = k6p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(j jVar, ContinuationImpl continuationImpl) {
        ScootersSuperPassesUpsaleBookHandler$showSuccessNotification$1 scootersSuperPassesUpsaleBookHandler$showSuccessNotification$1;
        int i;
        FormattedText e;
        jVar.getClass();
        if (continuationImpl instanceof ScootersSuperPassesUpsaleBookHandler$showSuccessNotification$1) {
            scootersSuperPassesUpsaleBookHandler$showSuccessNotification$1 = (ScootersSuperPassesUpsaleBookHandler$showSuccessNotification$1) continuationImpl;
            int i2 = scootersSuperPassesUpsaleBookHandler$showSuccessNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSuperPassesUpsaleBookHandler$showSuccessNotification$1.label = i2 - Integer.MIN_VALUE;
                ScootersSuperPassesUpsaleBookHandler$showSuccessNotification$1 scootersSuperPassesUpsaleBookHandler$showSuccessNotification$12 = scootersSuperPassesUpsaleBookHandler$showSuccessNotification$1;
                Object obj = scootersSuperPassesUpsaleBookHandler$showSuccessNotification$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSuperPassesUpsaleBookHandler$showSuccessNotification$12.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k6p0 k6p0Var = jVar.n;
                    scootersSuperPassesUpsaleBookHandler$showSuccessNotification$12.label = 1;
                    obj = k6p0Var.a.b(scootersSuperPassesUpsaleBookHandler$showSuccessNotification$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        final CharSequence charSequence = (CharSequence) obj;
                        final Context context = jVar.b;
                        NotificationTimedItemComponent<ListItemComponent> notificationTimedItemComponent = new NotificationTimedItemComponent<ListItemComponent>(context, charSequence) { // from class: com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.ScootersSuperPassesUpsaleBookHandler$SuperPassPurchaseSuccessNotification
                            {
                                super(context, null, 0, 6, null);
                                ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
                                listItemComponent.setTitle(charSequence);
                                setChild(listItemComponent);
                            }

                            @Override // ru.yandex.taxi.design.NotificationItemComponent
                            public String getNotificationId() {
                                return "SUPER_PASS_PURCHASE_SUCCESS_NOTIFICATION_ID";
                            }

                            @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
                            /* renamed from: provideDurationTime */
                            public long getDuration() {
                                return z1p0.a;
                            }
                        };
                        notificationTimedItemComponent.setExpiresListener(new wz1(17, jVar));
                        jVar.e.d(notificationTimedItemComponent);
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                ScootersUpsaleSuperPassOnBookExperiment scootersUpsaleSuperPassOnBookExperiment = (ScootersUpsaleSuperPassOnBookExperiment) obj;
                e = f9s.e(scootersUpsaleSuperPassOnBookExperiment.d, scootersUpsaleSuperPassOnBookExperiment);
                if (!e.a.isEmpty()) {
                    return zy11Var;
                }
                ru.yandex.taxi.widget.c cVar = jVar.c;
                scootersSuperPassesUpsaleBookHandler$showSuccessNotification$12.L$0 = null;
                scootersSuperPassesUpsaleBookHandler$showSuccessNotification$12.L$1 = null;
                scootersSuperPassesUpsaleBookHandler$showSuccessNotification$12.label = 2;
                obj = ru.yandex.taxi.widget.c.e(cVar, e, null, false, scootersSuperPassesUpsaleBookHandler$showSuccessNotification$12, 30);
            }
        }
        scootersSuperPassesUpsaleBookHandler$showSuccessNotification$1 = new ScootersSuperPassesUpsaleBookHandler$showSuccessNotification$1(jVar, continuationImpl);
        ScootersSuperPassesUpsaleBookHandler$showSuccessNotification$1 scootersSuperPassesUpsaleBookHandler$showSuccessNotification$122 = scootersSuperPassesUpsaleBookHandler$showSuccessNotification$1;
        Object obj2 = scootersSuperPassesUpsaleBookHandler$showSuccessNotification$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesUpsaleBookHandler$showSuccessNotification$122.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        ScootersUpsaleSuperPassOnBookExperiment scootersUpsaleSuperPassOnBookExperiment2 = (ScootersUpsaleSuperPassOnBookExperiment) obj2;
        e = f9s.e(scootersUpsaleSuperPassOnBookExperiment2.d, scootersUpsaleSuperPassOnBookExperiment2);
        if (!e.a.isEmpty()) {
        }
    }

    public static String d(rco0 rco0Var) {
        String str;
        x1p0 x1p0Var;
        p2p0 p2p0Var = rco0Var.j;
        if (p2p0Var == null || (str = p2p0Var.a) == null || (x1p0Var = rco0Var.h) == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) x1p0Var.d.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (jl40.l(((w1p0) it.next()).a, str)) {
                return str;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0218, code lost:
    
        if (r2 == r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0216, code lost:
    
        if (r2 == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d0, code lost:
    
        if (r1 != r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:
    
        if (r1 == r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c3, code lost:
    
        if (r1 == r4) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0232 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0233 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.r95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersSuperPassesUpsaleBookHandler$handle$1 scootersSuperPassesUpsaleBookHandler$handle$1;
        rco0 rco0Var;
        com.yandex.go.scooters.super_passes.upsale_on_book.data.a aVar;
        rco0 rco0Var2;
        p2p0 p2p0Var;
        j18 j18Var;
        Object obj;
        Object obj2;
        Object n;
        Object obj3 = zy11.a;
        if (continuationImpl instanceof ScootersSuperPassesUpsaleBookHandler$handle$1) {
            scootersSuperPassesUpsaleBookHandler$handle$1 = (ScootersSuperPassesUpsaleBookHandler$handle$1) continuationImpl;
            int i = scootersSuperPassesUpsaleBookHandler$handle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scootersSuperPassesUpsaleBookHandler$handle$1.label = i - Integer.MIN_VALUE;
                Object obj4 = scootersSuperPassesUpsaleBookHandler$handle$1.result;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (scootersSuperPassesUpsaleBookHandler$handle$1.label) {
                    case 0:
                        kotlin.b.b(obj4);
                        b4p0 a = this.f.a();
                        y5n0 a2 = this.i.a();
                        sco0 sco0Var = a2 != null ? a2.j.a : null;
                        qco0 qco0Var = sco0Var instanceof qco0 ? (qco0) sco0Var : null;
                        if (qco0Var == null || (rco0Var = qco0Var.i) == null) {
                            rco0Var = sco0Var instanceof rco0 ? (rco0) sco0Var : null;
                        }
                        if (a != null && rco0Var != null) {
                            scootersSuperPassesUpsaleBookHandler$handle$1.L$0 = null;
                            scootersSuperPassesUpsaleBookHandler$handle$1.L$1 = rco0Var;
                            scootersSuperPassesUpsaleBookHandler$handle$1.label = 1;
                            obj4 = e(a, rco0Var, scootersSuperPassesUpsaleBookHandler$handle$1);
                            break;
                        }
                        obj2 = null;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$0 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$1 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$2 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.label = 6;
                        Object a3 = super.a(scootersSuperPassesUpsaleBookHandler$handle$1);
                        return a3 != obj5 ? obj5 : a3;
                    case 1:
                        rco0 rco0Var3 = (rco0) scootersSuperPassesUpsaleBookHandler$handle$1.L$1;
                        kotlin.b.b(obj4);
                        rco0Var = rco0Var3;
                        if (((Boolean) obj4).booleanValue()) {
                            this.g.a = false;
                            aVar = this.m;
                            k6p0 k6p0Var = this.n;
                            scootersSuperPassesUpsaleBookHandler$handle$1.L$0 = null;
                            scootersSuperPassesUpsaleBookHandler$handle$1.L$1 = rco0Var;
                            scootersSuperPassesUpsaleBookHandler$handle$1.L$2 = aVar;
                            scootersSuperPassesUpsaleBookHandler$handle$1.label = 2;
                            obj4 = k6p0Var.a.b(scootersSuperPassesUpsaleBookHandler$handle$1);
                            break;
                        }
                        obj2 = null;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$0 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$1 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$2 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.label = 6;
                        Object a32 = super.a(scootersSuperPassesUpsaleBookHandler$handle$1);
                        if (a32 != obj5) {
                        }
                        break;
                    case 2:
                        aVar = (com.yandex.go.scooters.super_passes.upsale_on_book.data.a) scootersSuperPassesUpsaleBookHandler$handle$1.L$2;
                        rco0Var = (rco0) scootersSuperPassesUpsaleBookHandler$handle$1.L$1;
                        kotlin.b.b(obj4);
                        String str = ((ScootersUpsaleSuperPassOnBookExperiment) obj4).e;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$0 = null;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$1 = rco0Var;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$2 = null;
                        scootersSuperPassesUpsaleBookHandler$handle$1.label = 3;
                        if (aVar.e(str, scootersSuperPassesUpsaleBookHandler$handle$1) != obj5) {
                            rco0Var2 = rco0Var;
                            scootersSuperPassesUpsaleBookHandler$handle$1.L$0 = null;
                            scootersSuperPassesUpsaleBookHandler$handle$1.L$1 = rco0Var2;
                            scootersSuperPassesUpsaleBookHandler$handle$1.label = 4;
                            j18 j18Var2 = new j18(1, dvw.b(scootersSuperPassesUpsaleBookHandler$handle$1));
                            j18Var2.u();
                            p2p0Var = rco0Var2.j;
                            if (p2p0Var != null) {
                                j18Var = j18Var2;
                                obj = obj3;
                            } else {
                                n6n0 n6n0Var = this.d;
                                uem uemVar = new uem(j18Var2, 15);
                                uem uemVar2 = new uem(j18Var2, 16);
                                uem uemVar3 = new uem(j18Var2, 17);
                                h7n0 h7n0Var = (h7n0) n6n0Var;
                                com.yandex.go.scooters.offers.v2.g gVar = h7n0Var.b;
                                jwf T = gVar.T(h7n0Var.a);
                                p7g p7gVar = (p7g) T.k;
                                tt2 Z1 = ((c0g) p7gVar.a).Z1();
                                q5z.h(Z1);
                                j18Var = j18Var2;
                                c0g c0gVar = (c0g) p7gVar.a;
                                pwy0 c3 = c0gVar.c3();
                                q5z.h(c3);
                                q4o0 q4o0Var = (q4o0) ((xvf0) T.d).get();
                                obj = obj3;
                                yp2 yp2Var = (yp2) c0gVar.z.kk.get();
                                q5z.h(yp2Var);
                                ru.yandex.taxi.widget.c r2 = c0gVar.r2();
                                q5z.h(r2);
                                abo0 abo0Var = new abo0(yp2Var, r2);
                                rqo l2 = c0gVar.l2();
                                q5z.h(l2);
                                m2p0 m2p0Var = new m2p0(Z1, c3, q4o0Var, abo0Var, new l0p0(l2));
                                k2p0 k2p0Var = new k2p0((qxm0) p7gVar.g0.get());
                                Context e2 = c0gVar.e2();
                                q5z.h(e2);
                                w030 C2 = c0gVar.C2();
                                q5z.h(C2);
                                gVar.A(new lrm0(m2p0Var, k2p0Var, e2, C2, p7gVar.N), new a2p0(p2p0Var), new g7n0(uemVar2, uemVar3, uemVar));
                            }
                            obj4 = j18Var.s();
                            break;
                        }
                    case 3:
                        rco0Var2 = (rco0) scootersSuperPassesUpsaleBookHandler$handle$1.L$1;
                        kotlin.b.b(obj4);
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$0 = null;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$1 = rco0Var2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.label = 4;
                        j18 j18Var22 = new j18(1, dvw.b(scootersSuperPassesUpsaleBookHandler$handle$1));
                        j18Var22.u();
                        p2p0Var = rco0Var2.j;
                        if (p2p0Var != null) {
                        }
                        obj4 = j18Var.s();
                        break;
                    case 4:
                        rco0Var2 = (rco0) scootersSuperPassesUpsaleBookHandler$handle$1.L$1;
                        kotlin.b.b(obj4);
                        obj = obj3;
                        y1p0 y1p0Var = (y1p0) obj4;
                        if (jl40.l(y1p0Var, y1p0.b)) {
                            return obj;
                        }
                        if (jl40.l(y1p0Var, y1p0.a)) {
                            obj2 = null;
                        } else {
                            if (!jl40.l(y1p0Var, y1p0.c)) {
                                w511.b();
                                return null;
                            }
                            obj2 = null;
                            scootersSuperPassesUpsaleBookHandler$handle$1.L$0 = null;
                            scootersSuperPassesUpsaleBookHandler$handle$1.L$1 = null;
                            scootersSuperPassesUpsaleBookHandler$handle$1.L$2 = null;
                            scootersSuperPassesUpsaleBookHandler$handle$1.label = 5;
                            String d = d(rco0Var2);
                            if (d != null) {
                                r0 r0Var = this.h.a;
                                t2n0 t2n0Var = t2n0.a;
                                r0Var.getClass();
                                r0Var.m(null, t2n0Var);
                                n = bvf0.n(new ScootersSuperPassesUpsaleBookHandler$doSuperPassPurchaseAndBook$2(this, d, null), scootersSuperPassesUpsaleBookHandler$handle$1);
                                break;
                            }
                            n = obj;
                            break;
                        }
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$0 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$1 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$2 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.label = 6;
                        Object a322 = super.a(scootersSuperPassesUpsaleBookHandler$handle$1);
                        if (a322 != obj5) {
                        }
                        break;
                    case 5:
                        kotlin.b.b(obj4);
                        obj2 = null;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$0 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$1 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.L$2 = obj2;
                        scootersSuperPassesUpsaleBookHandler$handle$1.label = 6;
                        Object a3222 = super.a(scootersSuperPassesUpsaleBookHandler$handle$1);
                        if (a3222 != obj5) {
                        }
                        break;
                    case 6:
                        kotlin.b.b(obj4);
                        return obj4;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        scootersSuperPassesUpsaleBookHandler$handle$1 = new ScootersSuperPassesUpsaleBookHandler$handle$1(this, continuationImpl);
        Object obj42 = scootersSuperPassesUpsaleBookHandler$handle$1.result;
        Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (scootersSuperPassesUpsaleBookHandler$handle$1.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005b, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(b4p0 b4p0Var, rco0 rco0Var, ContinuationImpl continuationImpl) {
        ScootersSuperPassesUpsaleBookHandler$needToShow$1 scootersSuperPassesUpsaleBookHandler$needToShow$1;
        int i;
        if (continuationImpl instanceof ScootersSuperPassesUpsaleBookHandler$needToShow$1) {
            scootersSuperPassesUpsaleBookHandler$needToShow$1 = (ScootersSuperPassesUpsaleBookHandler$needToShow$1) continuationImpl;
            int i2 = scootersSuperPassesUpsaleBookHandler$needToShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSuperPassesUpsaleBookHandler$needToShow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSuperPassesUpsaleBookHandler$needToShow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSuperPassesUpsaleBookHandler$needToShow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k6p0 k6p0Var = this.n;
                    scootersSuperPassesUpsaleBookHandler$needToShow$1.L$0 = b4p0Var;
                    scootersSuperPassesUpsaleBookHandler$needToShow$1.L$1 = rco0Var;
                    scootersSuperPassesUpsaleBookHandler$needToShow$1.label = 1;
                    obj = k6p0Var.a.b(scootersSuperPassesUpsaleBookHandler$needToShow$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    rco0Var = (rco0) scootersSuperPassesUpsaleBookHandler$needToShow$1.L$1;
                    b4p0Var = (b4p0) scootersSuperPassesUpsaleBookHandler$needToShow$1.L$0;
                    kotlin.b.b(obj);
                }
                ScootersUpsaleSuperPassOnBookExperiment scootersUpsaleSuperPassOnBookExperiment = (ScootersUpsaleSuperPassOnBookExperiment) obj;
                if (this.g.a) {
                    w20 w20Var = rco0Var.g;
                    List list = w20Var != null ? w20Var.c : null;
                    if ((list == null || list.isEmpty()) && rco0Var.j != null && (b4p0Var instanceof xzt0) && scootersUpsaleSuperPassOnBookExperiment.b && d(rco0Var) != null) {
                        com.yandex.go.scooters.super_passes.upsale_on_book.data.a aVar = this.m;
                        String str = scootersUpsaleSuperPassOnBookExperiment.e;
                        List list2 = scootersUpsaleSuperPassOnBookExperiment.f;
                        scootersSuperPassesUpsaleBookHandler$needToShow$1.L$0 = null;
                        scootersSuperPassesUpsaleBookHandler$needToShow$1.L$1 = null;
                        scootersSuperPassesUpsaleBookHandler$needToShow$1.L$2 = null;
                        scootersSuperPassesUpsaleBookHandler$needToShow$1.label = 2;
                        Object c = aVar.c(str, list2, scootersSuperPassesUpsaleBookHandler$needToShow$1);
                        return c == coroutineSingletons ? coroutineSingletons : c;
                    }
                }
                return Boolean.FALSE;
            }
        }
        scootersSuperPassesUpsaleBookHandler$needToShow$1 = new ScootersSuperPassesUpsaleBookHandler$needToShow$1(this, continuationImpl);
        Object obj2 = scootersSuperPassesUpsaleBookHandler$needToShow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSuperPassesUpsaleBookHandler$needToShow$1.label;
        if (i != 0) {
        }
        ScootersUpsaleSuperPassOnBookExperiment scootersUpsaleSuperPassOnBookExperiment2 = (ScootersUpsaleSuperPassOnBookExperiment) obj2;
        if (this.g.a) {
        }
        return Boolean.FALSE;
    }
}
