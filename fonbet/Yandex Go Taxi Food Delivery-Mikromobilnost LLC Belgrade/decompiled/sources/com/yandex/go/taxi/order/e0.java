package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$TaxiOrderStatus;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.objects.UserActions;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import defpackage.a3y0;
import defpackage.a880;
import defpackage.h780;
import defpackage.hst;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.p780;
import defpackage.pzt0;
import defpackage.q880;
import defpackage.s780;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.ysg;
import defpackage.yxx0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.exception.UnauthorizedUserException;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.object.TaxiOrderFeedbackFlow;

/* loaded from: classes14.dex */
public final class e0 implements q880 {
    public static final AtomicInteger n = new AtomicInteger();
    public final tse a;
    public final tt2 b;
    public final String c;
    public final z d;
    public final com.yandex.go.taxi.order.analytics.a e;
    public final h780 f;
    public final ysg g;
    public final ru.yandex.taxi.launch.c h;
    public final a880 i;
    public final a0 j;
    public volatile pzt0 l;
    public final a3y0 k = new a3y0(TaxiOrderLogGroup.TOTW_UPDATING.getTag(), "OrderStatusTotwUpdater");
    public final b0 m = new b0(this);

    public e0(tse tseVar, tt2 tt2Var, String str, z zVar, com.yandex.go.taxi.order.analytics.a aVar, h780 h780Var, ysg ysgVar, ru.yandex.taxi.launch.c cVar, a880 a880Var, a0 a0Var) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = str;
        this.d = zVar;
        this.e = aVar;
        this.f = h780Var;
        this.g = ysgVar;
        this.h = cVar;
        this.i = a880Var;
        this.j = a0Var;
        a3y0.h(new String[]{"init"});
        hst hstVar = jst.e;
    }

    public final void a(TaxiOrder taxiOrder, a0 a0Var, long j) {
        TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus;
        this.f.c = taxiOrder;
        FeedbackDto feedbackDto = taxiOrder.V().D;
        boolean z = (feedbackDto != null ? feedbackDto.e : null) == TaxiOrderFeedbackFlow.TRACKING_ONLY;
        synchronized (taxiOrder) {
            taxiOrder.l = taxiOrder.l.W(z);
        }
        DriveState driveState = taxiOrder.l.H;
        DriveState driveState2 = taxiOrder.h.b;
        if (taxiOrder.l.H != taxiOrder.h.b) {
            com.yandex.go.taxi.order.analytics.a aVar = this.e;
            String str = taxiOrder.a;
            DriveState driveState3 = taxiOrder.h.b;
            yxx0 yxx0Var = aVar.b;
            switch (p780.a[driveState3.ordinal()]) {
                case 1:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.Preorder;
                    break;
                case 2:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.Search;
                    break;
                case 3:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.Scheduling;
                    break;
                case 4:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.Scheduled;
                    break;
                case 5:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.CheckIn;
                    break;
                case 6:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.Driving;
                    break;
                case 7:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.Waiting;
                    break;
                case 8:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.Transporting;
                    break;
                case 9:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.Complete;
                    break;
                case 10:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.Cancelled;
                    break;
                case 11:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.Failed;
                    break;
                case 12:
                    taxiOrderAnalytics$TaxiOrderStatus = TaxiOrderAnalytics$TaxiOrderStatus.Expired;
                    break;
                default:
                    w511.b();
                    return;
            }
            yxx0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(ACSPConstants.STATUS, taxiOrderAnalytics$TaxiOrderStatus.getEventValue());
            hashMap.put("order_id", str);
            yxx0Var.a.a("TaxiOrder.StatusChanged", hashMap, 1, new HashMap());
        }
        a0Var.a(taxiOrder, driveState2 != driveState, this.m, j);
        synchronized (taxiOrder) {
            TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
            taxiOrderLocalData.getClass();
            taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, driveState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1, 16777213);
        }
        this.g.g(taxiOrder);
    }

    public final void b() {
        this.k.getClass();
        a3y0.h(new String[]{"logUpdateCompleted"});
        hst hstVar = jst.e;
    }

    public final void c(Throwable th) {
        this.k.b("logUpdateFailed", th, new s780(12));
    }

    public final void d() {
        pzt0 pzt0Var = this.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(2:3|(17:5|6|7|8|(1:(1:(1:(2:13|14)(2:16|17))(9:18|19|20|21|22|23|(1:25)(3:29|(1:31)|32)|26|27))(3:60|61|62))(7:88|89|90|91|92|(1:94)|45)|63|64|65|(1:84)|69|(1:71)(1:83)|(1:73)(1:82)|(1:75)(1:81)|76|77|(6:79|22|23|(0)(0)|26|27)|45))|8|(0)(0)|63|64|65|(1:67)|84|69|(0)(0)|(0)(0)|(0)(0)|76|77|(0)|45) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00b2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0073, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa A[Catch: all -> 0x0100, CancellationException -> 0x0189, TryCatch #0 {all -> 0x0100, blocks: (B:23:0x00f6, B:25:0x00fa, B:26:0x0116, B:29:0x0103, B:31:0x010f), top: B:22:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103 A[Catch: all -> 0x0100, CancellationException -> 0x0189, TryCatch #0 {all -> 0x0100, blocks: (B:23:0x00f6, B:25:0x00fa, B:26:0x0116, B:29:0x0103, B:31:0x010f), top: B:22:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9 A[Catch: all -> 0x00b2, CancellationException -> 0x0189, TryCatch #2 {all -> 0x00b2, blocks: (B:65:0x00a6, B:67:0x00aa, B:71:0x00b9, B:77:0x00d6, B:81:0x00d2, B:82:0x00c4), top: B:64:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2 A[Catch: all -> 0x00b2, CancellationException -> 0x0189, TryCatch #2 {all -> 0x00b2, blocks: (B:65:0x00a6, B:67:0x00aa, B:71:0x00b9, B:77:0x00d6, B:81:0x00d2, B:82:0x00c4), top: B:64:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c4 A[Catch: all -> 0x00b2, CancellationException -> 0x0189, TryCatch #2 {all -> 0x00b2, blocks: (B:65:0x00a6, B:67:0x00aa, B:71:0x00b9, B:77:0x00d6, B:81:0x00d2, B:82:0x00c4), top: B:64:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j, ContinuationImpl continuationImpl) {
        OrderStatusTotwUpdater$update$1 orderStatusTotwUpdater$update$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        long j2;
        long j3;
        Object b;
        TaxiOrder a;
        int i2;
        UserActions userActions;
        long j4;
        TaxiOrder taxiOrder;
        try {
            if (continuationImpl instanceof OrderStatusTotwUpdater$update$1) {
                orderStatusTotwUpdater$update$1 = (OrderStatusTotwUpdater$update$1) continuationImpl;
                int i3 = orderStatusTotwUpdater$update$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    orderStatusTotwUpdater$update$1.label = i3 - Integer.MIN_VALUE;
                    OrderStatusTotwUpdater$update$1 orderStatusTotwUpdater$update$12 = orderStatusTotwUpdater$update$1;
                    obj = orderStatusTotwUpdater$update$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = orderStatusTotwUpdater$update$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        try {
                            int andIncrement = n.getAndIncrement();
                            this.e.d(andIncrement, this.c);
                            a = this.g.a(this.c);
                            ru.yandex.taxi.launch.c cVar = this.h;
                            orderStatusTotwUpdater$update$12.L$0 = a;
                            j2 = j;
                            orderStatusTotwUpdater$update$12.J$0 = j2;
                            orderStatusTotwUpdater$update$12.I$0 = andIncrement;
                            orderStatusTotwUpdater$update$12.label = 1;
                            Object c = cVar.c(orderStatusTotwUpdater$update$12);
                            if (c != coroutineSingletons) {
                                i2 = andIncrement;
                                obj = c;
                            }
                        } catch (Throwable th) {
                            th = th;
                            j2 = j;
                            j3 = j2;
                            a0 a0Var = this.j;
                            String str = this.c;
                            orderStatusTotwUpdater$update$12.L$0 = null;
                            orderStatusTotwUpdater$update$12.L$1 = null;
                            orderStatusTotwUpdater$update$12.L$2 = null;
                            orderStatusTotwUpdater$update$12.L$3 = null;
                            orderStatusTotwUpdater$update$12.L$4 = null;
                            orderStatusTotwUpdater$update$12.J$0 = j3;
                            orderStatusTotwUpdater$update$12.label = 3;
                            a0Var.getClass();
                            if (!(th instanceof OrderStatusProvider$IllegalDriveStateException)) {
                            }
                            if (b != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        int i4 = orderStatusTotwUpdater$update$12.I$0;
                        j2 = orderStatusTotwUpdater$update$12.J$0;
                        a = (TaxiOrder) orderStatusTotwUpdater$update$12.L$0;
                        kotlin.b.b(obj);
                        i2 = i4;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return null;
                        }
                        int i5 = orderStatusTotwUpdater$update$12.I$0;
                        long j5 = orderStatusTotwUpdater$update$12.J$0;
                        try {
                            kotlin.b.b(obj);
                            i2 = i5;
                            j4 = j5;
                            try {
                                taxiOrder = (TaxiOrder) obj;
                                if (taxiOrder == null) {
                                    a(taxiOrder, this.j, j4);
                                } else {
                                    String str2 = this.c;
                                    a0 a0Var2 = this.j;
                                    TaxiOrder a2 = this.g.a(str2);
                                    if (a2 != null) {
                                        a0Var2.a(a2, false, this.m, j4);
                                    }
                                    taxiOrder = a2;
                                }
                                this.e.g(i2, this.c);
                                return taxiOrder;
                            } catch (Throwable th2) {
                                th = th2;
                                j3 = j4;
                                a0 a0Var3 = this.j;
                                String str3 = this.c;
                                orderStatusTotwUpdater$update$12.L$0 = null;
                                orderStatusTotwUpdater$update$12.L$1 = null;
                                orderStatusTotwUpdater$update$12.L$2 = null;
                                orderStatusTotwUpdater$update$12.L$3 = null;
                                orderStatusTotwUpdater$update$12.L$4 = null;
                                orderStatusTotwUpdater$update$12.J$0 = j3;
                                orderStatusTotwUpdater$update$12.label = 3;
                                a0Var3.getClass();
                                if (!(th instanceof OrderStatusProvider$IllegalDriveStateException)) {
                                    OrderStatusProvider$IllegalDriveStateException orderStatusProvider$IllegalDriveStateException = (OrderStatusProvider$IllegalDriveStateException) th;
                                    TaxiOrder taxiOrder2 = orderStatusProvider$IllegalDriveStateException.a;
                                    if (taxiOrder2 == null) {
                                        a0Var3.h.n(0L, str3, "missingOrder");
                                        throw orderStatusProvider$IllegalDriveStateException;
                                    }
                                    if (taxiOrder2.G() || taxiOrder2.I()) {
                                        a0Var3.h.n(0L, taxiOrder2.a, "illegalOrTerminalDriveState");
                                    }
                                    a0Var3.b.b(taxiOrder2.a, taxiOrder2.h.b);
                                    b = zy11.a;
                                } else {
                                    if (!(th instanceof OrderStatusProvider$OrderNotFoundException)) {
                                        if (th instanceof UnauthorizedUserException) {
                                            a0Var3.h.n(0L, str3, "UnauthorizedUserException");
                                        }
                                        throw th;
                                    }
                                    b = a0Var3.b((OrderStatusProvider$OrderNotFoundException) th, orderStatusTotwUpdater$update$12);
                                }
                                if (b != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                return null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j3 = j5;
                            a0 a0Var32 = this.j;
                            String str32 = this.c;
                            orderStatusTotwUpdater$update$12.L$0 = null;
                            orderStatusTotwUpdater$update$12.L$1 = null;
                            orderStatusTotwUpdater$update$12.L$2 = null;
                            orderStatusTotwUpdater$update$12.L$3 = null;
                            orderStatusTotwUpdater$update$12.L$4 = null;
                            orderStatusTotwUpdater$update$12.J$0 = j3;
                            orderStatusTotwUpdater$update$12.label = 3;
                            a0Var32.getClass();
                            if (!(th instanceof OrderStatusProvider$IllegalDriveStateException)) {
                            }
                            if (b != coroutineSingletons) {
                            }
                        }
                    }
                    j3 = j2;
                    String str4 = (String) obj;
                    boolean z = a == null && a.J();
                    String str5 = a == null ? a.h.c : null;
                    if (a != null) {
                        userActions = null;
                    } else {
                        userActions = a.e;
                        a.e = null;
                        this.g.g(a);
                    }
                    OrderStatusParam.OrderContact orderContact = a != null ? null : a.f;
                    UserActions userActions2 = userActions;
                    z zVar = this.d;
                    String str6 = this.c;
                    orderStatusTotwUpdater$update$12.L$0 = null;
                    orderStatusTotwUpdater$update$12.L$1 = null;
                    orderStatusTotwUpdater$update$12.L$2 = null;
                    orderStatusTotwUpdater$update$12.L$3 = null;
                    orderStatusTotwUpdater$update$12.L$4 = null;
                    orderStatusTotwUpdater$update$12.J$0 = j3;
                    orderStatusTotwUpdater$update$12.I$0 = i2;
                    orderStatusTotwUpdater$update$12.I$1 = z ? 1 : 0;
                    orderStatusTotwUpdater$update$12.label = 2;
                    obj = zVar.d(str4, str6, z, str5, userActions2, orderContact, orderStatusTotwUpdater$update$12);
                    if (obj != coroutineSingletons) {
                        j4 = j3;
                        taxiOrder = (TaxiOrder) obj;
                        if (taxiOrder == null) {
                        }
                        this.e.g(i2, this.c);
                        return taxiOrder;
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            j3 = j2;
            String str42 = (String) obj;
            boolean z2 = a == null && a.J();
            if (a == null) {
            }
            if (a != null) {
            }
            if (a != null) {
            }
            UserActions userActions22 = userActions;
            z zVar2 = this.d;
            String str62 = this.c;
            orderStatusTotwUpdater$update$12.L$0 = null;
            orderStatusTotwUpdater$update$12.L$1 = null;
            orderStatusTotwUpdater$update$12.L$2 = null;
            orderStatusTotwUpdater$update$12.L$3 = null;
            orderStatusTotwUpdater$update$12.L$4 = null;
            orderStatusTotwUpdater$update$12.J$0 = j3;
            orderStatusTotwUpdater$update$12.I$0 = i2;
            orderStatusTotwUpdater$update$12.I$1 = z2 ? 1 : 0;
            orderStatusTotwUpdater$update$12.label = 2;
            obj = zVar2.d(str42, str62, z2, str5, userActions22, orderContact, orderStatusTotwUpdater$update$12);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
        orderStatusTotwUpdater$update$1 = new OrderStatusTotwUpdater$update$1(this, continuationImpl);
        OrderStatusTotwUpdater$update$1 orderStatusTotwUpdater$update$122 = orderStatusTotwUpdater$update$1;
        obj = orderStatusTotwUpdater$update$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStatusTotwUpdater$update$122.label;
    }

    public final void f() {
        pzt0 pzt0Var = this.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        tse tseVar = this.a;
        this.b.getClass();
        sjh sjhVar = uyj.a;
        this.l = tje.N(tseVar, mdh.b, null, new OrderStatusTotwUpdater$updateAsync$5(this, null), 2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(4:20|(1:22)|23|(1:25))|11|(1:13)|15|16))|30|6|7|(0)(0)|11|(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        c(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0028, CancellationException -> 0x0053, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0053, all -> 0x0028, blocks: (B:10:0x0024, B:11:0x0045, B:13:0x0049, B:23:0x003a), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j, ContinuationImpl continuationImpl) {
        OrderStatusTotwUpdater$updateStatus$1 orderStatusTotwUpdater$updateStatus$1;
        Object obj;
        int i;
        if (continuationImpl instanceof OrderStatusTotwUpdater$updateStatus$1) {
            orderStatusTotwUpdater$updateStatus$1 = (OrderStatusTotwUpdater$updateStatus$1) continuationImpl;
            int i2 = orderStatusTotwUpdater$updateStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStatusTotwUpdater$updateStatus$1.label = i2 - Integer.MIN_VALUE;
                obj = orderStatusTotwUpdater$updateStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStatusTotwUpdater$updateStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pzt0 pzt0Var = this.l;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    orderStatusTotwUpdater$updateStatus$1.J$0 = j;
                    orderStatusTotwUpdater$updateStatus$1.label = 1;
                    obj = e(j, orderStatusTotwUpdater$updateStatus$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((TaxiOrder) obj) != null) {
                    b();
                }
                return zy11.a;
            }
        }
        orderStatusTotwUpdater$updateStatus$1 = new OrderStatusTotwUpdater$updateStatus$1(this, continuationImpl);
        obj = orderStatusTotwUpdater$updateStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStatusTotwUpdater$updateStatus$1.label;
        if (i != 0) {
        }
        if (((TaxiOrder) obj) != null) {
        }
        return zy11.a;
    }
}
