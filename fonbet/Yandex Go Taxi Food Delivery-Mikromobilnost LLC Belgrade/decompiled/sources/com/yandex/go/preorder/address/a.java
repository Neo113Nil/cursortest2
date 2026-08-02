package com.yandex.go.preorder.address;

import android.telephony.TelephonyManager;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.Address;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import com.yandex.go.parks.nearest.data.models.NotSupportedAddressException;
import com.yandex.go.preorder.address.a;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import defpackage.ac60;
import defpackage.ah00;
import defpackage.avj0;
import defpackage.c9l0;
import defpackage.cc60;
import defpackage.cey;
import defpackage.dqe0;
import defpackage.e400;
import defpackage.eux0;
import defpackage.fy01;
import defpackage.gh00;
import defpackage.git0;
import defpackage.h3y;
import defpackage.jg7;
import defpackage.jst;
import defpackage.k20;
import defpackage.ket0;
import defpackage.kg7;
import defpackage.kyh0;
import defpackage.nwx0;
import defpackage.oep0;
import defpackage.ogt0;
import defpackage.q521;
import defpackage.s8o;
import defpackage.s8z;
import defpackage.set0;
import defpackage.srj0;
import defpackage.tft0;
import defpackage.tls;
import defpackage.tpb0;
import defpackage.tzt;
import defpackage.unr0;
import defpackage.wit0;
import defpackage.xx70;
import defpackage.yb60;
import defpackage.yit0;
import defpackage.yvf0;
import defpackage.zb60;
import defpackage.zzs;
import java.util.HashMap;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.h;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.preorder.source.domain.s;

/* loaded from: classes13.dex */
public final class a {
    public final ah00 a;
    public final h b;
    public final dqe0 c;
    public final tpb0 d;
    public final eux0 e;
    public final h3y f;
    public final jg7 g;
    public final yit0 h;
    public final com.yandex.go.navigation.screen.c i;
    public final srj0 j;
    public final c9l0 k;
    public final AddressResolveRepository l;
    public final yvf0 m;
    public final oep0 n;
    public final h3y o;
    public final fy01 p;
    public final ogt0 q;
    public final ket0 r;
    public final ru.yandex.taxi.routeselector.a s;
    public final set0 t;
    public final git0 u;
    public final h3y v;
    public final tft0 w;
    public ru.yandex.taxi.statebar.router.a x;

    public a(ah00 ah00Var, h hVar, dqe0 dqe0Var, tpb0 tpb0Var, eux0 eux0Var, h3y h3yVar, jg7 jg7Var, yit0 yit0Var, com.yandex.go.navigation.screen.c cVar, srj0 srj0Var, c9l0 c9l0Var, AddressResolveRepository addressResolveRepository, yvf0 yvf0Var, oep0 oep0Var, h3y h3yVar2, fy01 fy01Var, ogt0 ogt0Var, ket0 ket0Var, ru.yandex.taxi.routeselector.a aVar, set0 set0Var, git0 git0Var, h3y h3yVar3, tft0 tft0Var) {
        this.a = ah00Var;
        this.b = hVar;
        this.c = dqe0Var;
        this.d = tpb0Var;
        this.e = eux0Var;
        this.f = h3yVar;
        this.g = jg7Var;
        this.h = yit0Var;
        this.i = cVar;
        this.j = srj0Var;
        this.k = c9l0Var;
        this.l = addressResolveRepository;
        this.m = yvf0Var;
        this.n = oep0Var;
        this.o = h3yVar2;
        this.p = fy01Var;
        this.q = ogt0Var;
        this.r = ket0Var;
        this.s = aVar;
        this.t = set0Var;
        this.u = git0Var;
        this.v = h3yVar3;
        this.w = tft0Var;
    }

    public static boolean a(Throwable th, tls tlsVar) {
        Throwable cause;
        return ((Boolean) tlsVar.invoke(th)).booleanValue() || ((cause = th.getCause()) != null && ((Boolean) tlsVar.invoke(cause)).booleanValue());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [i5u] */
    /* JADX WARN: Type inference failed for: r5v0, types: [i5u] */
    public final void b(Throwable th, boolean z) {
        final int i = 0;
        final int i2 = 1;
        if (th instanceof NotSupportedAddressException) {
            NotSupportedAddressException notSupportedAddressException = (NotSupportedAddressException) th;
            ((gh00) this.a).G(notSupportedAddressException.getAddress().B());
            nwx0 nwx0Var = (nwx0) this.p;
            nwx0Var.a.c().C1();
            this.l.b(AddressResolveRepository.State.UNSUPPORTED);
            Address address = notSupportedAddressException.getAddress();
            NearestZoneResponse nearestZoneResponse = notSupportedAddressException.getNearestZoneResponse();
            com.yandex.go.navigation.screen.c cVar = this.i;
            if (cVar.g()) {
                this.h.a(MapPositionAction.DEFAULT);
            }
            if (this.k.b()) {
                this.s.i();
            }
            ket0 ket0Var = this.r;
            ket0Var.e.a.g(new q521(address, nearestZoneResponse, new Runnable(this) { // from class: i5u
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i;
                    a aVar = this.b;
                    switch (i3) {
                        case 0:
                            ((s) aVar.v.get()).c();
                            break;
                        case 1:
                            tpb0 tpb0Var = aVar.d;
                            tpb0Var.getClass();
                            tpb0Var.a.a("pickup_location.Main.ChangeAddress", new HashMap(), 1, new HashMap());
                            set0 set0Var = aVar.t;
                            set0Var.g.a(new pet0(set0Var, 2));
                            break;
                        default:
                            ru.yandex.taxi.statebar.router.a aVar2 = aVar.x;
                            if (aVar2 != null) {
                                aVar2.i();
                                break;
                            }
                            break;
                    }
                }
            }, new Runnable(this) { // from class: i5u
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    a aVar = this.b;
                    switch (i3) {
                        case 0:
                            ((s) aVar.v.get()).c();
                            break;
                        case 1:
                            tpb0 tpb0Var = aVar.d;
                            tpb0Var.getClass();
                            tpb0Var.a.a("pickup_location.Main.ChangeAddress", new HashMap(), 1, new HashMap());
                            set0 set0Var = aVar.t;
                            set0Var.g.a(new pet0(set0Var, 2));
                            break;
                        default:
                            ru.yandex.taxi.statebar.router.a aVar2 = aVar.x;
                            if (aVar2 != null) {
                                aVar2.i();
                                break;
                            }
                            break;
                    }
                }
            }));
            e400 e400Var = ket0Var.b;
            zzs B = address.B();
            HashMap hashMap = new HashMap();
            hashMap.put("lat", Double.valueOf(B.a));
            hashMap.put("lon", Double.valueOf(B.b));
            int i3 = B.c;
            if (i3 > 0) {
                hashMap.put("acc", Integer.valueOf(i3));
            }
            e400Var.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("coordinate", hashMap);
            e400Var.a.a("Main.RegionNotSupportedShown", hashMap2, 1, new HashMap());
            if (cVar.h()) {
                nwx0Var.a.c();
                return;
            }
            return;
        }
        if (!a(th, HandleAddressListeningErrorInteractor$handle$1.b)) {
            if (a(th, HandleAddressListeningErrorInteractor$handle$2.b)) {
                this.h.a(MapPositionAction.DEFAULT);
                ru.yandex.taxi.statebar.router.a aVar = (ru.yandex.taxi.statebar.router.a) this.m.get();
                this.x = aVar;
                final int i4 = 2;
                k20 b = cey.b(this.u.a, Lifecycle.Event.ON_STOP, new Runnable(this) { // from class: i5u
                    public final /* synthetic */ a b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i4;
                        a aVar2 = this.b;
                        switch (i32) {
                            case 0:
                                ((s) aVar2.v.get()).c();
                                break;
                            case 1:
                                tpb0 tpb0Var = aVar2.d;
                                tpb0Var.getClass();
                                tpb0Var.a.a("pickup_location.Main.ChangeAddress", new HashMap(), 1, new HashMap());
                                set0 set0Var = aVar2.t;
                                set0Var.g.a(new pet0(set0Var, 2));
                                break;
                            default:
                                ru.yandex.taxi.statebar.router.a aVar22 = aVar2.x;
                                if (aVar22 != null) {
                                    aVar22.i();
                                    break;
                                }
                                break;
                        }
                    }
                });
                oep0.b(this.n, new xx70(5, aVar, new tzt(i4, b)));
                return;
            }
            if (z) {
                return;
            }
            ((s8z) this.o.get()).getClass();
            s8z.a("errorWhileSourceAddressChangeListening", th);
            ket0 ket0Var2 = this.r;
            ((nwx0) ket0Var2.c).a.c().d2(((avj0) ket0Var2.a).h(kyh0.address_resolving_error));
            this.l.b(AddressResolveRepository.State.ERROR);
            return;
        }
        c(false);
        if (this.i.g()) {
            this.h.a(MapPositionAction.DEFAULT);
        }
        if (s8o.A(th)) {
            d();
        } else if (th.getCause() == null || !s8o.A(th.getCause())) {
            String str = this.c.a.Q;
            if (str != null && str.length() != 0) {
                unr0.C(new Object[]{str}, 1, "Error on nearestposition with zoneMode='%s'", jst.e);
                this.j.a();
                return;
            } else {
                jst.e.getClass();
                ket0 ket0Var3 = this.r;
                ((nwx0) ket0Var3.c).a.c().d2(((avj0) ket0Var3.a).h(kyh0.address_resolving_error));
                this.l.b(AddressResolveRepository.State.ERROR);
            }
        } else {
            d();
        }
        this.q.b = true;
    }

    public final void c(boolean z) {
        ogt0 ogt0Var = this.q;
        if (ogt0Var.a == z) {
            return;
        }
        if (ogt0Var.b && z) {
            ((ru.yandex.taxi.startup.launch.c) this.f.get()).b("sourcePoint.networkRestore", true);
            ogt0Var.b = false;
            ((wit0) this.w.a(true)).c(((gh00) this.a).e.b(), "auto", PositionInitAction.MAP);
        }
        if (z) {
            this.r.d.b.g(yb60.a);
        }
        ogt0Var.a = z;
    }

    public final void d() {
        TelephonyManager telephonyManager;
        String networkOperator;
        if (this.u.a.w.compareTo(Lifecycle.State.STARTED) <= 0) {
            return;
        }
        String b = ((kg7) this.g).b();
        boolean z = (b == null || b.length() == 0 || (telephonyManager = (TelephonyManager) this.b.a.getSystemService(TelephonyManager.class)) == null || telephonyManager.getPhoneType() == 0 || telephonyManager.getSimState() == 1 || (networkOperator = telephonyManager.getNetworkOperator()) == null || networkOperator.length() == 0) ? false : true;
        cc60 cc60Var = this.r.d;
        avj0 avj0Var = (avj0) cc60Var.a;
        cc60Var.b.g(z ? new ac60(avj0Var.h(kyh0.common_error_no_internet_connection_title), avj0Var.h(kyh0.common_error_no_internet_connection_description)) : zb60.a);
        this.l.b(AddressResolveRepository.State.ERROR);
        if (z) {
            eux0 eux0Var = this.e;
            eux0Var.getClass();
            eux0Var.a.a("TaxiByPhoneButtonShown", new HashMap(), 1, new HashMap());
        }
    }
}
