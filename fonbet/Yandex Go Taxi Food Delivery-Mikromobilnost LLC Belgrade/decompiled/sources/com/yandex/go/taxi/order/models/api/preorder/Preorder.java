package com.yandex.go.taxi.order.models.api.preorder;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.models.api.preorder.delivery.RouteDeliveryInfo;
import com.yandex.go.taxi.order.models.api.preorder.extraphone.ExtraPhoneContact;
import com.yandex.go.taxi.order.models.api.preorder.intercity.IntercityPreorderInfo;
import com.yandex.go.taxi.order.models.api.preorder.intercity.RawOrderdraftInfo;
import com.yandex.go.taxi.order.models.api.preorder.requirements.RequirementAddressRouteInfo;
import com.yandex.go.taxi.order.models.api.response.NearestDrivers;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.d0l0;
import defpackage.e4a0;
import defpackage.gsq0;
import defpackage.h5l0;
import defpackage.hst;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.jst;
import defpackage.ksq0;
import defpackage.lv90;
import defpackage.ny61;
import defpackage.pv70;
import defpackage.rpe0;
import defpackage.wqd;
import defpackage.zzk0;
import defpackage.zzs;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/Preorder;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/preorder/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Preorder implements Cloneable {
    public static final a Companion = new a();
    public static final i3y[] j0;
    public String A;
    public final Map B;
    public volatile String C;
    public volatile String D;
    public volatile ServiceLevel.QueueOnSearchDisplayInfo E;
    public double F;
    public volatile d0l0 G;
    public RouteDeliveryInfo H;
    public volatile RawOrderdraftInfo I;
    public volatile IntercityPreorderInfo J;
    public RequirementAddressRouteInfo K;
    public long L;
    public pv70 M;
    public ExtraPhoneContact N;
    public volatile SelectedTariffInfo O;
    public volatile TariffOrderFlow P;
    public volatile String Q;
    public volatile String R;
    public final ScheduledOrder S;
    public volatile Transfer T;
    public jsq0 U;
    public volatile String V;
    public volatile String W;
    public volatile boolean Z;
    public String a;
    public volatile boolean a0;
    public String b;
    public volatile String b0;
    public volatile wqd c;
    public volatile boolean c0;
    public volatile TollRoads d0;
    public boolean e0;
    public volatile String f0;
    public boolean g0;
    public boolean h0;
    public NearestDrivers i0;
    public lv90 w;
    public volatile List x;
    public String y;
    public String z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j0 = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new rpe0(0)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new rpe0(1)), null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new rpe0(2)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new rpe0(3)), null, null, null, null, null, null, null, null, null, null, null};
    }

    public Preorder(int i, int i2, String str, String str2, wqd wqdVar, lv90 lv90Var, List list, String str3, String str4, String str5, Map map, String str6, String str7, ServiceLevel.QueueOnSearchDisplayInfo queueOnSearchDisplayInfo, double d, d0l0 d0l0Var, RouteDeliveryInfo routeDeliveryInfo, IntercityPreorderInfo intercityPreorderInfo, RequirementAddressRouteInfo requirementAddressRouteInfo, long j, pv70 pv70Var, ExtraPhoneContact extraPhoneContact, SelectedTariffInfo selectedTariffInfo, TariffOrderFlow tariffOrderFlow, String str8, String str9, ScheduledOrder scheduledOrder, Transfer transfer, jsq0 jsq0Var, String str10, String str11, boolean z, boolean z2, String str12, boolean z3, TollRoads tollRoads, boolean z4, String str13, boolean z5, boolean z6) {
        d0l0 d0l0Var2;
        SelectedTariffInfo selectedTariffInfo2;
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = wqdVar;
        }
        if ((i & 8) == 0) {
            this.w = null;
        } else {
            this.w = lv90Var;
        }
        if ((i & 16) == 0) {
            this.x = EmptyList.a;
        } else {
            this.x = list;
        }
        if ((i & 32) == 0) {
            this.y = null;
        } else {
            this.y = str3;
        }
        if ((i & 64) == 0) {
            this.z = null;
        } else {
            this.z = str4;
        }
        if ((i & 128) == 0) {
            this.A = null;
        } else {
            this.A = str5;
        }
        if ((i & 256) == 0) {
            this.B = Collections.synchronizedMap(new LinkedHashMap());
        } else {
            this.B = map;
        }
        if ((i & 512) == 0) {
            this.C = null;
        } else {
            this.C = str6;
        }
        if ((i & 1024) == 0) {
            this.D = null;
        } else {
            this.D = str7;
        }
        if ((i & 2048) == 0) {
            this.E = null;
        } else {
            this.E = queueOnSearchDisplayInfo;
        }
        this.F = (i & 4096) == 0 ? -1.0d : d;
        if ((i & 8192) == 0) {
            d0l0.Companion.getClass();
            d0l0Var2 = h5l0.a;
        } else {
            d0l0Var2 = d0l0Var;
        }
        this.G = d0l0Var2;
        if ((i & 16384) == 0) {
            this.H = null;
        } else {
            this.H = routeDeliveryInfo;
        }
        this.I = null;
        if ((32768 & i) == 0) {
            this.J = null;
        } else {
            this.J = intercityPreorderInfo;
        }
        if ((65536 & i) == 0) {
            this.K = null;
        } else {
            this.K = requirementAddressRouteInfo;
        }
        this.L = (131072 & i) == 0 ? System.currentTimeMillis() : j;
        if ((262144 & i) == 0) {
            this.M = null;
        } else {
            this.M = pv70Var;
        }
        if ((524288 & i) == 0) {
            this.N = null;
        } else {
            this.N = extraPhoneContact;
        }
        if ((1048576 & i) == 0) {
            SelectedTariffInfo.Companion.getClass();
            selectedTariffInfo2 = SelectedTariffInfo.e;
        } else {
            selectedTariffInfo2 = selectedTariffInfo;
        }
        this.O = selectedTariffInfo2;
        if ((2097152 & i) == 0) {
            this.P = null;
        } else {
            this.P = tariffOrderFlow;
        }
        if ((4194304 & i) == 0) {
            this.Q = null;
        } else {
            this.Q = str8;
        }
        if ((8388608 & i) == 0) {
            this.R = null;
        } else {
            this.R = str9;
        }
        this.S = (16777216 & i) == 0 ? new ScheduledOrder(0) : scheduledOrder;
        if ((33554432 & i) == 0) {
            this.T = null;
        } else {
            this.T = transfer;
        }
        this.U = (67108864 & i) == 0 ? ksq0.a : jsq0Var;
        this.V = (134217728 & i) == 0 ? "" : str10;
        if ((268435456 & i) == 0) {
            this.W = null;
        } else {
            this.W = str11;
        }
        if ((536870912 & i) == 0) {
            this.Z = false;
        } else {
            this.Z = z;
        }
        if ((1073741824 & i) == 0) {
            this.a0 = false;
        } else {
            this.a0 = z2;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.b0 = null;
        } else {
            this.b0 = str12;
        }
        if ((i2 & 1) == 0) {
            this.c0 = false;
        } else {
            this.c0 = z3;
        }
        if ((i2 & 2) == 0) {
            this.d0 = null;
        } else {
            this.d0 = tollRoads;
        }
        if ((i2 & 4) == 0) {
            this.e0 = false;
        } else {
            this.e0 = z4;
        }
        if ((i2 & 8) == 0) {
            this.f0 = null;
        } else {
            this.f0 = str13;
        }
        if ((i2 & 16) == 0) {
            this.g0 = false;
        } else {
            this.g0 = z5;
        }
        if ((i2 & 32) == 0) {
            this.h0 = false;
        } else {
            this.h0 = z6;
        }
        NearestDrivers.Companion.getClass();
        this.i0 = NearestDrivers.c;
    }

    public final boolean a(d0l0 d0l0Var) {
        if (jl40.l(this.G, d0l0Var)) {
            return false;
        }
        this.G = d0l0Var;
        return true;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Preorder clone() {
        try {
            return (Preorder) super.clone();
        } catch (CloneNotSupportedException e) {
            ny61.j(e);
            return null;
        }
    }

    public final lv90 c() {
        wqd wqdVar = this.c;
        if (wqdVar != null) {
            lv90 lv90Var = wqdVar.a;
            if (lv90Var == null) {
                lv90.Companion.getClass();
                lv90Var = lv90.g;
            }
            if (lv90Var != null) {
                return lv90Var;
            }
        }
        lv90.Companion.getClass();
        return lv90.g;
    }

    public final String d() {
        String str = this.z;
        return (str == null || str.length() == 0) ? this.A : this.z;
    }

    public final lv90 e() {
        wqd wqdVar = this.c;
        if (wqdVar != null) {
            return wqdVar.b;
        }
        return null;
    }

    public final String f(String str) {
        return (String) this.B.get(str);
    }

    public final Calendar g() {
        Calendar calendar = this.S.a;
        if (calendar == null) {
            return null;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeZone(calendar.getTimeZone());
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public final e4a0 h() {
        lv90 lv90Var;
        wqd wqdVar = this.c;
        if (wqdVar != null) {
            lv90Var = wqdVar.a;
            if (lv90Var == null) {
                lv90.Companion.getClass();
                lv90Var = lv90.g;
            }
        } else {
            lv90Var = null;
        }
        lv90.Companion.getClass();
        PaymentMethod$Type paymentMethod$Type = lv90Var != null ? lv90Var.a : null;
        return paymentMethod$Type != null ? paymentMethod$Type : e4a0.R3;
    }

    public final synchronized void i(lv90 lv90Var) {
        try {
            wqd wqdVar = this.c;
            if (wqdVar == null) {
                this.c = new wqd(lv90Var, null);
            } else {
                this.c = new wqd(lv90Var, wqdVar.b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(lv90 lv90Var) {
        try {
            wqd wqdVar = this.c;
            if (wqdVar == null) {
                lv90.Companion.getClass();
                this.c = new wqd(lv90.g, lv90Var);
            } else {
                if (lv90Var == null && wqdVar.b != null) {
                    jst.e.a(10, "CompositePayment: reset in preorder", new Throwable(), null);
                }
                lv90 lv90Var2 = wqdVar.a;
                if (lv90Var2 == null) {
                    lv90.Companion.getClass();
                    lv90Var2 = lv90.g;
                }
                this.c = new wqd(lv90Var2, lv90Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(d0l0 d0l0Var) {
        d0l0 d0l0Var2 = this.G;
        zzk0 zzk0Var = d0l0.Companion;
        zzs zzsVar = d0l0Var2.d(false, false).isEmpty() ? null : (zzs) this.G.d(false, false).get(0);
        zzs zzsVar2 = d0l0Var.d(false, false).isEmpty() ? null : (zzs) d0l0Var.d(false, false).get(0);
        Address h = d0l0Var.h();
        if (!jl40.l(zzsVar, zzsVar2) && h != null) {
            List W0 = h.W0();
            jsq0 jsq0Var = ksq0.a;
            this.U = new jsq0(W0);
        }
        this.G = d0l0Var;
    }

    public final void m(SelectedTariffInfo selectedTariffInfo) {
        hst hstVar = jst.e;
        String str = selectedTariffInfo.a;
        Objects.toString(selectedTariffInfo.b);
        hstVar.getClass();
        this.O = selectedTariffInfo;
    }

    public final boolean o(ZoneAddress zoneAddress) {
        Address h = this.G.h();
        if (!jl40.l(h != null ? h.B() : null, zoneAddress.a.B())) {
            List W0 = zoneAddress.a.W0();
            jsq0 jsq0Var = ksq0.a;
            this.U = new jsq0(W0);
        }
        if (!a(this.G.l(zoneAddress))) {
            return false;
        }
        this.A = zoneAddress.a.b1();
        return true;
    }

    public final boolean p(List list) {
        return a(this.G.k(list));
    }

    public Preorder() {
        this(0);
    }

    public Preorder(int i) {
        EmptyList emptyList = EmptyList.a;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        d0l0.Companion.getClass();
        d0l0 d0l0Var = h5l0.a;
        long currentTimeMillis = System.currentTimeMillis();
        SelectedTariffInfo.Companion.getClass();
        SelectedTariffInfo selectedTariffInfo = SelectedTariffInfo.e;
        ScheduledOrder scheduledOrder = new ScheduledOrder(0);
        jsq0 jsq0Var = ksq0.a;
        this.a = null;
        this.b = null;
        this.c = null;
        this.w = null;
        this.x = emptyList;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = synchronizedMap;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = -1.0d;
        this.G = d0l0Var;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = currentTimeMillis;
        this.M = null;
        this.N = null;
        this.O = selectedTariffInfo;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = scheduledOrder;
        this.T = null;
        this.U = jsq0Var;
        this.V = "";
        this.W = null;
        this.Z = false;
        this.a0 = false;
        this.b0 = null;
        this.c0 = false;
        this.d0 = null;
        this.e0 = false;
        this.f0 = null;
        this.g0 = false;
        this.h0 = false;
        NearestDrivers.Companion.getClass();
        this.i0 = NearestDrivers.c;
    }
}
