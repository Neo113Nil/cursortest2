package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.f;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.objects.UserActions;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.a3y0;
import defpackage.a78;
import defpackage.alb1;
import defpackage.bd80;
import defpackage.e78;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.h73;
import defpackage.iw00;
import defpackage.j78;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mzz;
import defpackage.n880;
import defpackage.ny61;
import defpackage.oeu;
import defpackage.q5z;
import defpackage.qa0;
import defpackage.qn11;
import defpackage.s780;
import defpackage.s8o;
import defpackage.v780;
import defpackage.vay0;
import defpackage.w68;
import defpackage.y180;
import defpackage.ysg;
import defpackage.zob1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import ru.yandex.taxi.carplates.model.CarPlatesFormatterGenerator$WrongFormatException;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class z {
    public final ysg a;
    public final bd80 b;
    public final com.yandex.go.taxi.order.performer.a c;
    public final r d;
    public final ru.yandex.taxi.order.l e;
    public final h3y f;
    public final h3y g;
    public final j78 h;
    public final com.yandex.go.taxi.order.factory.a i;
    public final com.yandex.go.taxi.order.domain.interactors.c j;
    public final ru.yandex.taxi.communications.i k;
    public final com.yandex.go.taxi.order.domain.interactors.i l;
    public final com.yandex.go.taxi.order.details.v2.core.availability.m m;
    public final a3y0 n = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "OrderStatusProvider");

    public z(ysg ysgVar, bd80 bd80Var, com.yandex.go.taxi.order.performer.a aVar, r rVar, ru.yandex.taxi.order.l lVar, h3y h3yVar, h3y h3yVar2, j78 j78Var, com.yandex.go.taxi.order.factory.a aVar2, com.yandex.go.taxi.order.domain.interactors.c cVar, ru.yandex.taxi.communications.i iVar, com.yandex.go.taxi.order.domain.interactors.i iVar2, com.yandex.go.taxi.order.details.v2.core.availability.m mVar) {
        this.a = ysgVar;
        this.b = bd80Var;
        this.c = aVar;
        this.d = rVar;
        this.e = lVar;
        this.f = h3yVar;
        this.g = h3yVar2;
        this.h = j78Var;
        this.i = aVar2;
        this.j = cVar;
        this.k = iVar;
        this.l = iVar2;
        this.m = mVar;
    }

    public final void a(OrderStatusParam orderStatusParam) {
        int i;
        String str = orderStatusParam.b;
        TaxiOrder a = this.a.a(str);
        if (a == null) {
            throw new OrderStatusProvider$IllegalDriveStateException(null);
        }
        if (alb1.g(a.h.b, a.V().k, a.V().u)) {
            if (!a.l.g && !this.e.b(false)) {
                ((y180) this.g.get()).h(a);
                synchronized (a) {
                    a.l = a.l.L();
                }
                this.a.g(a);
            }
            throw new OrderStatusProvider$IllegalDriveStateException(a);
        }
        DriveState driveState = a.h.b;
        h3y h3yVar = this.f;
        int[] iArr = n880.a;
        int i2 = iArr[driveState.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            ((vay0) h3yVar.get()).a(str).ng(driveState);
        } else {
            ((vay0) h3yVar.get()).a(str).reset();
        }
        if (a.l.A || (i = iArr[driveState.ordinal()]) == 4 || i == 5 || i == 6 || i == 1 || i == 2 || i == 3 || i == 7) {
            return;
        }
        if (i != 8 || !zob1.e(a)) {
            throw new OrderStatusProvider$IllegalDriveStateException(a);
        }
    }

    public final void b(String str, Throwable th) {
        Integer M = s8o.M(th);
        if (M != null && M.intValue() == 404) {
            throw new OrderStatusProvider$OrderNotFoundException(th, str);
        }
        if (th instanceof OrderStatusProvider$IllegalDriveStateException) {
            throw th;
        }
        this.n.b("handleError", th, new s780(11));
        if (this.a.a(str) == null) {
            throw new OrderStatusProvider$IllegalDriveStateException(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(final String str, Pair pair, ContinuationImpl continuationImpl) {
        OrderStatusProvider$handleResponse$1 orderStatusProvider$handleResponse$1;
        int i;
        a78 a78Var;
        OrderStatusInfo.AlternativeDestination alternativeDestination;
        Object obj;
        Map map;
        LinkedHashMap linkedHashMap;
        Matcher matcher;
        String obj2;
        if (continuationImpl instanceof OrderStatusProvider$handleResponse$1) {
            orderStatusProvider$handleResponse$1 = (OrderStatusProvider$handleResponse$1) continuationImpl;
            int i2 = orderStatusProvider$handleResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderStatusProvider$handleResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = orderStatusProvider$handleResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderStatusProvider$handleResponse$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    TaxiOrder taxiOrder = (TaxiOrder) orderStatusProvider$handleResponse$1.L$3;
                    kotlin.b.b(obj3);
                    return taxiOrder;
                }
                kotlin.b.b(obj3);
                final v780 v780Var = (v780) pair.c();
                final bd80 bd80Var = this.b;
                bd80Var.getClass();
                final DriveState driveState = v780Var.a.i;
                TaxiOrder c = bd80Var.a.c(str, new Supplier() { // from class: yc80
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        bd80.this.c.b("updateFromStatusInfo", new IllegalStateException("Missing order"), new s780(22));
                        f fVar = TaxiOrder.Companion;
                        Preorder preorder = new Preorder(0);
                        DriveState driveState2 = driveState;
                        if (driveState2 == null) {
                            driveState2 = DriveState.SEARCH;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        TaxiOrder b = f.b(fVar, preorder, str, driveState2, currentTimeMillis, 16);
                        b.X(v780Var);
                        return b;
                    }
                }, new qa0(16, v780Var));
                this.l.b(c);
                this.m.f(c);
                String a = ((oeu) pair.f()).a("X-YaTraceId");
                synchronized (c) {
                    TaxiOrderLocalData taxiOrderLocalData = c.l;
                    taxiOrderLocalData.getClass();
                    c.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, a, false, null, null, null, -1, 16252927);
                }
                String a2 = ((oeu) pair.f()).a("X-Yataxi-Complete-Polling-Enabled");
                boolean parseBoolean = (a2 == null || (obj2 = evu0.k0(a2).toString()) == null) ? false : Boolean.parseBoolean(obj2);
                synchronized (c) {
                    TaxiOrderLocalData taxiOrderLocalData2 = c.l;
                    taxiOrderLocalData2.getClass();
                    c.l = TaxiOrderLocalData.b(taxiOrderLocalData2, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, parseBoolean, null, null, null, -1, 15728639);
                }
                String str2 = c.V().g.d;
                String str3 = c.a;
                boolean l = jl40.l(c.V().g, Driver.v);
                OrderStatusInfo V = c.V();
                V.getClass();
                e78.Companion.getClass();
                qn11 qn11Var = e78.d;
                qn11 b = V.b(e78.class);
                if (b != null) {
                    qn11Var = b;
                }
                e78 e78Var = (e78) qn11Var;
                j78 j78Var = this.h;
                j78Var.getClass();
                mzz mzzVar = j78Var.a;
                ru.yandex.taxi.carplates.model.a aVar = (ru.yandex.taxi.carplates.model.a) mzzVar.c(str3);
                if (str2 != null && ((aVar == null || !jl40.l(aVar.a, e78Var) || !jl40.l(aVar.b, str2)) && !l)) {
                    aVar = new ru.yandex.taxi.carplates.model.a(e78Var, str2);
                    mzzVar.d(str3, aVar);
                }
                if (aVar != null) {
                    String str4 = aVar.b;
                    Iterator it = aVar.a.b.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (new Regex((String) ((Map.Entry) obj).getKey()).h(str4)) {
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry != null) {
                        String str5 = (String) entry.getKey();
                        e78.a aVar2 = (e78.a) entry.getValue();
                        String str6 = aVar2.c;
                        if (str6 != null && (map = aVar2.d) != null) {
                            try {
                                matcher = Pattern.compile(str5).matcher(str4);
                            } catch (CarPlatesFormatterGenerator$WrongFormatException e) {
                                jst.e.j(e);
                            }
                            if (matcher.matches()) {
                                h73 w = iw00.w(ru.yandex.taxi.carplates.model.a.a(matcher.groupCount(), str6));
                                linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry2 : (Iterable) w.b) {
                                    String str7 = (String) entry2.getKey();
                                    String str8 = (String) entry2.getValue();
                                    try {
                                        int parseInt = Integer.parseInt(str7);
                                        e78.b bVar = (e78.b) map.get(str7);
                                        if (bVar != null) {
                                            Matcher matcher2 = matcher;
                                            Pair pair2 = new Pair(matcher.group(parseInt) + str8, new w68(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e));
                                            linkedHashMap.put(pair2.c(), pair2.f());
                                            matcher = matcher2;
                                        }
                                    } catch (NumberFormatException e2) {
                                        jst.e.k(e2, "group is not index");
                                    }
                                }
                                if (linkedHashMap != null) {
                                    a78Var = new a78(q5z.Q(-1, aVar2.a), q5z.Q(ModalContentViewContainer.BASE_SHADOW_COLOR, aVar2.b), linkedHashMap);
                                    c.g = a78Var;
                                    this.c.b(c);
                                    alternativeDestination = v780Var.a.j0;
                                    if (alternativeDestination != null) {
                                        this.a.k(c, c.h.b != DriveState.COMPLETE || alternativeDestination.e > 0);
                                    }
                                    this.k.a(v780Var.a);
                                    com.yandex.go.taxi.order.domain.interactors.c cVar = this.j;
                                    orderStatusProvider$handleResponse$1.L$0 = null;
                                    orderStatusProvider$handleResponse$1.L$1 = null;
                                    orderStatusProvider$handleResponse$1.L$2 = null;
                                    orderStatusProvider$handleResponse$1.L$3 = c;
                                    orderStatusProvider$handleResponse$1.L$4 = null;
                                    orderStatusProvider$handleResponse$1.label = 1;
                                    return cVar.a(str, orderStatusProvider$handleResponse$1) == coroutineSingletons ? coroutineSingletons : c;
                                }
                            }
                            linkedHashMap = null;
                            if (linkedHashMap != null) {
                            }
                        }
                    }
                    a78Var = null;
                    c.g = a78Var;
                    this.c.b(c);
                    alternativeDestination = v780Var.a.j0;
                    if (alternativeDestination != null) {
                    }
                    this.k.a(v780Var.a);
                    com.yandex.go.taxi.order.domain.interactors.c cVar2 = this.j;
                    orderStatusProvider$handleResponse$1.L$0 = null;
                    orderStatusProvider$handleResponse$1.L$1 = null;
                    orderStatusProvider$handleResponse$1.L$2 = null;
                    orderStatusProvider$handleResponse$1.L$3 = c;
                    orderStatusProvider$handleResponse$1.L$4 = null;
                    orderStatusProvider$handleResponse$1.label = 1;
                    if (cVar2.a(str, orderStatusProvider$handleResponse$1) == coroutineSingletons) {
                    }
                }
                a78Var = null;
                c.g = a78Var;
                this.c.b(c);
                alternativeDestination = v780Var.a.j0;
                if (alternativeDestination != null) {
                }
                this.k.a(v780Var.a);
                com.yandex.go.taxi.order.domain.interactors.c cVar22 = this.j;
                orderStatusProvider$handleResponse$1.L$0 = null;
                orderStatusProvider$handleResponse$1.L$1 = null;
                orderStatusProvider$handleResponse$1.L$2 = null;
                orderStatusProvider$handleResponse$1.L$3 = c;
                orderStatusProvider$handleResponse$1.L$4 = null;
                orderStatusProvider$handleResponse$1.label = 1;
                if (cVar22.a(str, orderStatusProvider$handleResponse$1) == coroutineSingletons) {
                }
            }
        }
        orderStatusProvider$handleResponse$1 = new OrderStatusProvider$handleResponse$1(this, continuationImpl);
        Object obj32 = orderStatusProvider$handleResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStatusProvider$handleResponse$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:(1:(1:(1:(2:15|16)(2:18|19))(2:20|21))(6:22|23|24|25|26|27))(9:45|46|47|48|49|50|(2:52|35)|26|27))(4:55|56|57|58)|44|30|31|32|(1:35)(1:34)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(9:5|6|7|8|(6:(1:(1:(1:(1:(2:15|16)(2:18|19))(2:20|21))(6:22|23|24|25|26|27))(9:45|46|47|48|49|50|(2:52|35)|26|27))(4:55|56|57|58)|44|30|31|32|(1:35)(1:34))(9:69|(1:71)(1:85)|72|73|74|75|76|(1:78)|35)|59|60|(6:62|49|50|(0)|26|27)|35))|8|(0)(0)|59|60|(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c7, code lost:
    
        r14.L$0 = r2;
        r14.L$1 = r2;
        r14.L$2 = r2;
        r14.L$3 = r2;
        r14.L$4 = r2;
        r14.L$5 = r2;
        r14.L$6 = r2;
        r14.L$7 = r0;
        r14.L$8 = r2;
        r14.Z$0 = r5;
        r14.label = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e2, code lost:
    
        if (r3.a(r8, r14) == r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0198, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0199, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, boolean z, String str3, UserActions userActions, OrderStatusParam.OrderContact orderContact, ContinuationImpl continuationImpl) {
        OrderStatusProvider$updateStatus$1 orderStatusProvider$updateStatus$1;
        Object obj;
        int i;
        Object obj2;
        String str4;
        boolean z2;
        com.yandex.go.taxi.order.factory.a aVar;
        int i2;
        int i3;
        String str5;
        Object obj3;
        Object a;
        Object c;
        com.yandex.go.taxi.order.domain.interactors.c cVar = this.j;
        try {
            if (continuationImpl instanceof OrderStatusProvider$updateStatus$1) {
                orderStatusProvider$updateStatus$1 = (OrderStatusProvider$updateStatus$1) continuationImpl;
                int i4 = orderStatusProvider$updateStatus$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    orderStatusProvider$updateStatus$1.label = i4 - Integer.MIN_VALUE;
                    OrderStatusProvider$updateStatus$1 orderStatusProvider$updateStatus$12 = orderStatusProvider$updateStatus$1;
                    Object obj4 = orderStatusProvider$updateStatus$12.result;
                    obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = orderStatusProvider$updateStatus$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj4);
                        Map map = userActions != null ? userActions.a : null;
                        try {
                            aVar = this.i;
                            orderStatusProvider$updateStatus$12.L$0 = null;
                            orderStatusProvider$updateStatus$12.L$1 = str2;
                            orderStatusProvider$updateStatus$12.L$2 = null;
                            orderStatusProvider$updateStatus$12.L$3 = null;
                            orderStatusProvider$updateStatus$12.L$4 = null;
                            orderStatusProvider$updateStatus$12.L$5 = null;
                            orderStatusProvider$updateStatus$12.Z$0 = z;
                            orderStatusProvider$updateStatus$12.label = 1;
                            i2 = 3;
                            i3 = 2;
                            obj2 = null;
                        } catch (Throwable th) {
                            th = th;
                            obj2 = null;
                        }
                        try {
                            Object a2 = aVar.a(str, str2, str3, z, null, null, map, orderContact, orderStatusProvider$updateStatus$12);
                            if (a2 != obj) {
                                str5 = str2;
                                obj3 = a2;
                                z2 = z;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str4 = str2;
                            z2 = z;
                            b(str4, th);
                            orderStatusProvider$updateStatus$12.L$0 = obj2;
                            orderStatusProvider$updateStatus$12.L$1 = obj2;
                            orderStatusProvider$updateStatus$12.L$2 = obj2;
                            orderStatusProvider$updateStatus$12.L$3 = obj2;
                            orderStatusProvider$updateStatus$12.L$4 = obj2;
                            orderStatusProvider$updateStatus$12.L$5 = obj2;
                            orderStatusProvider$updateStatus$12.L$6 = obj2;
                            orderStatusProvider$updateStatus$12.L$7 = obj2;
                            orderStatusProvider$updateStatus$12.L$8 = obj2;
                            orderStatusProvider$updateStatus$12.Z$0 = z2;
                            orderStatusProvider$updateStatus$12.label = 4;
                            if (cVar.a(str4, orderStatusProvider$updateStatus$12) != obj) {
                            }
                        }
                    }
                    if (i == 1) {
                        z2 = orderStatusProvider$updateStatus$12.Z$0;
                        str5 = (String) orderStatusProvider$updateStatus$12.L$1;
                        try {
                            kotlin.b.b(obj4);
                            obj3 = obj4;
                            i2 = 3;
                            i3 = 2;
                            obj2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            str4 = str5;
                        }
                    } else {
                        if (i == 2) {
                            z2 = orderStatusProvider$updateStatus$12.Z$0;
                            str4 = (String) orderStatusProvider$updateStatus$12.L$1;
                            try {
                                kotlin.b.b(obj4);
                                a = obj4;
                                i2 = 3;
                                obj2 = null;
                                try {
                                    orderStatusProvider$updateStatus$12.L$0 = obj2;
                                    orderStatusProvider$updateStatus$12.L$1 = str4;
                                    orderStatusProvider$updateStatus$12.L$2 = obj2;
                                    orderStatusProvider$updateStatus$12.L$3 = obj2;
                                    orderStatusProvider$updateStatus$12.L$4 = obj2;
                                    orderStatusProvider$updateStatus$12.L$5 = obj2;
                                    orderStatusProvider$updateStatus$12.L$6 = obj2;
                                    orderStatusProvider$updateStatus$12.L$7 = obj2;
                                    orderStatusProvider$updateStatus$12.L$8 = obj2;
                                    orderStatusProvider$updateStatus$12.Z$0 = z2;
                                    orderStatusProvider$updateStatus$12.label = i2;
                                    c = c(str4, (Pair) a, orderStatusProvider$updateStatus$12);
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            if (c == obj) {
                            }
                            return (TaxiOrder) c;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                kotlin.b.b(obj4);
                                return null;
                            }
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th6 = (Throwable) orderStatusProvider$updateStatus$12.L$7;
                            kotlin.b.b(obj4);
                            throw th6;
                        }
                        z2 = orderStatusProvider$updateStatus$12.Z$0;
                        String str6 = (String) orderStatusProvider$updateStatus$12.L$1;
                        try {
                            kotlin.b.b(obj4);
                            c = obj4;
                            str4 = str6;
                            obj2 = null;
                            return (TaxiOrder) c;
                        } catch (Throwable th7) {
                            th = th7;
                            str4 = str6;
                        }
                    }
                    obj2 = null;
                    b(str4, th);
                    orderStatusProvider$updateStatus$12.L$0 = obj2;
                    orderStatusProvider$updateStatus$12.L$1 = obj2;
                    orderStatusProvider$updateStatus$12.L$2 = obj2;
                    orderStatusProvider$updateStatus$12.L$3 = obj2;
                    orderStatusProvider$updateStatus$12.L$4 = obj2;
                    orderStatusProvider$updateStatus$12.L$5 = obj2;
                    orderStatusProvider$updateStatus$12.L$6 = obj2;
                    orderStatusProvider$updateStatus$12.L$7 = obj2;
                    orderStatusProvider$updateStatus$12.L$8 = obj2;
                    orderStatusProvider$updateStatus$12.Z$0 = z2;
                    orderStatusProvider$updateStatus$12.label = 4;
                    return cVar.a(str4, orderStatusProvider$updateStatus$12) != obj ? obj : obj2;
                    OrderStatusParam orderStatusParam = (OrderStatusParam) obj3;
                    a(orderStatusParam);
                    r rVar = this.d;
                    orderStatusProvider$updateStatus$12.L$0 = obj2;
                    orderStatusProvider$updateStatus$12.L$1 = str5;
                    orderStatusProvider$updateStatus$12.L$2 = obj2;
                    orderStatusProvider$updateStatus$12.L$3 = obj2;
                    orderStatusProvider$updateStatus$12.L$4 = obj2;
                    orderStatusProvider$updateStatus$12.L$5 = obj2;
                    orderStatusProvider$updateStatus$12.L$6 = obj2;
                    orderStatusProvider$updateStatus$12.L$7 = obj2;
                    orderStatusProvider$updateStatus$12.Z$0 = z2;
                    orderStatusProvider$updateStatus$12.label = i3;
                    a = rVar.a(orderStatusParam, orderStatusProvider$updateStatus$12);
                    if (a != obj) {
                        str4 = str5;
                        orderStatusProvider$updateStatus$12.L$0 = obj2;
                        orderStatusProvider$updateStatus$12.L$1 = str4;
                        orderStatusProvider$updateStatus$12.L$2 = obj2;
                        orderStatusProvider$updateStatus$12.L$3 = obj2;
                        orderStatusProvider$updateStatus$12.L$4 = obj2;
                        orderStatusProvider$updateStatus$12.L$5 = obj2;
                        orderStatusProvider$updateStatus$12.L$6 = obj2;
                        orderStatusProvider$updateStatus$12.L$7 = obj2;
                        orderStatusProvider$updateStatus$12.L$8 = obj2;
                        orderStatusProvider$updateStatus$12.Z$0 = z2;
                        orderStatusProvider$updateStatus$12.label = i2;
                        c = c(str4, (Pair) a, orderStatusProvider$updateStatus$12);
                        if (c == obj) {
                        }
                        return (TaxiOrder) c;
                    }
                }
            }
            if (i != 0) {
            }
            OrderStatusParam orderStatusParam2 = (OrderStatusParam) obj3;
            a(orderStatusParam2);
            r rVar2 = this.d;
            orderStatusProvider$updateStatus$12.L$0 = obj2;
            orderStatusProvider$updateStatus$12.L$1 = str5;
            orderStatusProvider$updateStatus$12.L$2 = obj2;
            orderStatusProvider$updateStatus$12.L$3 = obj2;
            orderStatusProvider$updateStatus$12.L$4 = obj2;
            orderStatusProvider$updateStatus$12.L$5 = obj2;
            orderStatusProvider$updateStatus$12.L$6 = obj2;
            orderStatusProvider$updateStatus$12.L$7 = obj2;
            orderStatusProvider$updateStatus$12.Z$0 = z2;
            orderStatusProvider$updateStatus$12.label = i3;
            a = rVar2.a(orderStatusParam2, orderStatusProvider$updateStatus$12);
            if (a != obj) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        orderStatusProvider$updateStatus$1 = new OrderStatusProvider$updateStatus$1(this, continuationImpl);
        OrderStatusProvider$updateStatus$1 orderStatusProvider$updateStatus$122 = orderStatusProvider$updateStatus$1;
        Object obj42 = orderStatusProvider$updateStatus$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderStatusProvider$updateStatus$122.label;
    }
}
