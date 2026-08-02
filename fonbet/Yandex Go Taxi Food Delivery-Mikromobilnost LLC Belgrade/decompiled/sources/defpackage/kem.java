package defpackage;

import com.yandex.delivery.mapper.model.CancelType;
import com.yandex.go.drive.superapp.b;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.superapp.tracking.api.dependencies.DefaultTrackingSourceInteractor$start$$inlined$map$1$2$1;
import com.yandex.go.superapp.tracking.api.dependencies.c;
import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Cancellation$Type;
import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId;
import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class kem extends c {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public kem(tt2 tt2Var, tse tseVar, g gVar, wmh wmhVar) {
        super(tt2Var, tseVar, gVar.h(), wmhVar);
        this.g = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0292  */
    @Override // com.yandex.go.superapp.tracking.api.dependencies.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, DefaultTrackingSourceInteractor$start$$inlined$map$1$2$1 defaultTrackingSourceInteractor$start$$inlined$map$1$2$1) {
        String b;
        String str;
        qiz qizVar;
        qiz pizVar;
        oxa0 l;
        Iterator it;
        String str2;
        djz djzVar;
        vhz vhzVar;
        yiz yizVar;
        vwa0 k;
        k7x0 k7x0Var;
        wn wnVar;
        String str3;
        wiz wizVar;
        kn knVar;
        miz mizVar;
        jiz jizVar;
        LogisticsOrderTracking$Cancellation$Type logisticsOrderTracking$Cancellation$Type;
        uiz uizVar;
        tiz tizVar;
        LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId;
        int i = this.f;
        String str4 = "";
        Object obj2 = this.g;
        switch (i) {
            case 0:
                List list = ((wl40) obj).d;
                if (list.isEmpty()) {
                    b();
                    return EmptyList.a;
                }
                List<fnt> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (fnt fntVar : list2) {
                    Long e = fntVar.e();
                    long longValue = (e != null ? e.longValue() : 0L) * 1000;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                    if (longValue > 0) {
                        String f = fntVar.f();
                        Object obj3 = linkedHashMap.get(f);
                        if (obj3 == null) {
                            obj3 = new b(this.b);
                            linkedHashMap.put(f, obj3);
                        }
                        ((b) obj3).a(longValue, new t8j(8, this, fntVar));
                    } else {
                        b bVar = (b) linkedHashMap.remove(fntVar.f());
                        if (bVar != null) {
                            bVar.b();
                        }
                    }
                    String f2 = fntVar.f();
                    long currentTimeMillis = System.currentTimeMillis();
                    String d = fntVar.d();
                    String str5 = d == null ? "" : d;
                    String c = fntVar.c();
                    if (c == null) {
                        c = "";
                    }
                    if (longValue > 0) {
                        b = t7s.j(longValue);
                    } else {
                        b = fntVar.b();
                        if (b == null) {
                            b = "";
                        }
                    }
                    if (b.length() != 0) {
                        c = g8e.p(c, " ", b);
                    }
                    String str6 = c;
                    String g = fntVar.g();
                    arrayList.add(new jem(f2, f501.a, currentTimeMillis, str5, str6, g == null ? "" : g, gya1.e(fntVar), fntVar.a(), c2h0.ic_drive_car));
                }
                return arrayList;
            default:
                List list3 = ((wl40) obj).e;
                djz djzVar2 = (djz) obj2;
                ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    vhz vhzVar2 = (vhz) it2.next();
                    k7x0 k7x0Var2 = djzVar2.a;
                    vwa0 k2 = vhzVar2.k();
                    String f3 = k2 != null ? k2.f() : null;
                    vwa0 k3 = vhzVar2.k();
                    if (k3 == null || (str = k3.g()) == null || evu0.J(str)) {
                        str = null;
                    }
                    List a = vhzVar2.a();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : a) {
                        if (obj4 instanceof wn) {
                            arrayList3.add(obj4);
                        }
                    }
                    wn wnVar2 = (wn) ((nr) a.R(arrayList3));
                    String i2 = vhzVar2.i();
                    String e2 = vhzVar2.e();
                    String j = vhzVar2.j();
                    UUID h = vhzVar2.h();
                    String uuid = h != null ? h.toString() : null;
                    String n = vhzVar2.n();
                    String m = vhzVar2.m();
                    String str7 = m == null ? str4 : m;
                    zhz g2 = vhzVar2.g();
                    if (g2 instanceof xhz) {
                        pizVar = oiz.a;
                    } else if (g2 instanceof yhz) {
                        pizVar = new piz(((m7x0) k7x0Var2).a(((yhz) g2).a()));
                    } else {
                        if (g2 != null) {
                            w511.b();
                            return null;
                        }
                        qizVar = null;
                        LogisticsOrderTracking$Status logisticsOrderTracking$Status = !vhzVar2.q() ? LogisticsOrderTracking$Status.Stub : vhzVar2.o() ? LogisticsOrderTracking$Status.Cancelling : vhzVar2.p() ? LogisticsOrderTracking$Status.Completed : LogisticsOrderTracking$Status.Active;
                        l = vhzVar2.l();
                        if (l == null) {
                            Long c2 = l.c();
                            Long b2 = l.b();
                            List a2 = l.a();
                            it = it2;
                            str2 = str4;
                            djzVar = djzVar2;
                            ArrayList arrayList4 = new ArrayList(tcc.n(a2, 10));
                            Iterator it3 = a2.iterator();
                            while (it3.hasNext()) {
                                y8n y8nVar = (y8n) it3.next();
                                arrayList4.add(new xiz(y8nVar.a(), y8nVar.c(), y8nVar.b()));
                                it3 = it3;
                                vhzVar2 = vhzVar2;
                            }
                            vhzVar = vhzVar2;
                            yizVar = new yiz(c2, b2, arrayList4);
                        } else {
                            it = it2;
                            str2 = str4;
                            djzVar = djzVar2;
                            vhzVar = vhzVar2;
                            yizVar = null;
                        }
                        k = vhzVar.k();
                        if (k == null) {
                            String e3 = k.e();
                            String c3 = k.c();
                            if (c3 == null) {
                                c3 = ((m7x0) k7x0Var2).a(k.a());
                            }
                            viz vizVar = new viz(c3, k.c() != null);
                            String d2 = k.d();
                            List a3 = vhzVar.a();
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : a3) {
                                vwa0 vwa0Var = k;
                                if (obj5 instanceof zn) {
                                    arrayList5.add(obj5);
                                }
                                k = vwa0Var;
                            }
                            vwa0 vwa0Var2 = k;
                            zn znVar = (zn) ((nr) a.R(arrayList5));
                            if (znVar != null) {
                                String e4 = vhzVar.e();
                                String c4 = znVar.c();
                                boolean f4 = vhzVar.f();
                                if (e4 == null || vwa0Var2.b() == null) {
                                    k7x0Var = k7x0Var2;
                                    wnVar = wnVar2;
                                    str3 = i2;
                                } else {
                                    k7x0Var = k7x0Var2;
                                    psc d3 = znVar.d();
                                    wnVar = wnVar2;
                                    if (!(d3 instanceof msc)) {
                                        if (d3 instanceof osc) {
                                            int i3 = cjz.a[((osc) d3).a().ordinal()];
                                            str3 = i2;
                                            if (i3 == 1) {
                                                logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId = LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId.Performer;
                                            } else if (i3 == 2) {
                                                logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId = LogisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId.InApp;
                                            } else {
                                                w511.b();
                                            }
                                            tizVar = new siz(e4, logisticsOrderTracking$Performer$Communication$Method$VoiceForwardingCall$ForwardingId);
                                        } else {
                                            str3 = i2;
                                            if (!d3.equals(nsc.a)) {
                                                w511.b();
                                            }
                                        }
                                        return null;
                                    }
                                    tizVar = new riz(((msc) d3).a().a());
                                    str3 = i2;
                                    uizVar = new uiz(c4, f4, tizVar);
                                }
                                tizVar = null;
                                uizVar = new uiz(c4, f4, tizVar);
                            } else {
                                k7x0Var = k7x0Var2;
                                wnVar = wnVar2;
                                str3 = i2;
                                uizVar = null;
                            }
                            wizVar = new wiz(e3, vizVar, d2, uizVar);
                        } else {
                            k7x0Var = k7x0Var2;
                            wnVar = wnVar2;
                            str3 = i2;
                            wizVar = null;
                        }
                        ajz ajzVar = (f3 == null || str != null) ? new ajz(f3, str) : null;
                        niz nizVar = new niz(wnVar == null ? wnVar.c() : null, djz.a(wnVar == null ? wnVar.d() : null));
                        List a4 = vhzVar.a();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj6 : a4) {
                            if (obj6 instanceof kn) {
                                arrayList6.add(obj6);
                            }
                        }
                        knVar = (kn) ((nr) a.R(arrayList6));
                        if (knVar == null) {
                            String c5 = knVar.c();
                            iw7 c6 = knVar.d().c();
                            CancelType a5 = c6 != null ? c6.a() : null;
                            int i4 = a5 == null ? -1 : cjz.b[a5.ordinal()];
                            if (i4 == -1) {
                                logisticsOrderTracking$Cancellation$Type = null;
                            } else if (i4 == 1) {
                                logisticsOrderTracking$Cancellation$Type = LogisticsOrderTracking$Cancellation$Type.Free;
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                logisticsOrderTracking$Cancellation$Type = LogisticsOrderTracking$Cancellation$Type.Paid;
                            }
                            String d4 = knVar.d().d();
                            String a6 = knVar.d().a();
                            String a7 = knVar.d().b().a();
                            iw7 c7 = knVar.d().c();
                            mizVar = new miz(logisticsOrderTracking$Cancellation$Type, c5, new liz(d4, a6, a7, c7 != null ? c7.b() : null));
                        } else {
                            mizVar = null;
                        }
                        List a8 = vhzVar.a();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj7 : a8) {
                            if (obj7 instanceof eo) {
                                arrayList7.add(obj7);
                            }
                        }
                        eo eoVar = (eo) ((nr) a.R(arrayList7));
                        ziz zizVar = eoVar == null ? new ziz(eoVar.c(), eoVar.d()) : null;
                        List<dc8> d5 = vhzVar.d();
                        ArrayList arrayList8 = new ArrayList(tcc.n(d5, 10));
                        for (dc8 dc8Var : d5) {
                            nr a9 = dc8Var.a();
                            if (a9 instanceof wn) {
                                jizVar = new fiz(djz.a(((wn) a9).d()));
                            } else if (a9 instanceof on) {
                                jizVar = new eiz(((on) a9).d());
                            } else if (a9 instanceof bo) {
                                bo boVar = (bo) a9;
                                jizVar = new hiz(boVar.c(), boVar.d());
                            } else if ((a9 instanceof kn) || (a9 instanceof ln) || (a9 instanceof mn) || (a9 instanceof nn) || (a9 instanceof pn) || (a9 instanceof qn) || (a9 instanceof rn) || (a9 instanceof sn) || (a9 instanceof tn) || (a9 instanceof un) || (a9 instanceof vn) || (a9 instanceof xn) || (a9 instanceof yn) || (a9 instanceof zn) || (a9 instanceof ao) || (a9 instanceof co) || (a9 instanceof eo) || (a9 instanceof fo) || (a9 instanceof go) || (a9 instanceof ho) || jl40.l(a9, cr.a) || (a9 instanceof cx)) {
                                jizVar = iiz.a;
                            } else {
                                if (a9 != null) {
                                    w511.b();
                                    return null;
                                }
                                jizVar = giz.a;
                            }
                            String d6 = dc8Var.d();
                            String c8 = dc8Var.c();
                            String b3 = dc8Var.b();
                            arrayList8.add(new kiz(jizVar, d6, c8, b3 != null ? ((m7x0) k7x0Var).a(b3) : null));
                        }
                        ihz c9 = vhzVar.c();
                        arrayList2.add(new bjz(str3, e2, j, uuid, n, str7, qizVar, logisticsOrderTracking$Status, yizVar, wizVar, ajzVar, nizVar, zizVar, mizVar, arrayList8, f501.a, c9 == null ? new diz(c9.c(), c9.a()) : null));
                        it2 = it;
                        str4 = str2;
                        djzVar2 = djzVar;
                    }
                    qizVar = pizVar;
                    LogisticsOrderTracking$Status logisticsOrderTracking$Status2 = !vhzVar2.q() ? LogisticsOrderTracking$Status.Stub : vhzVar2.o() ? LogisticsOrderTracking$Status.Cancelling : vhzVar2.p() ? LogisticsOrderTracking$Status.Completed : LogisticsOrderTracking$Status.Active;
                    l = vhzVar2.l();
                    if (l == null) {
                    }
                    k = vhzVar.k();
                    if (k == null) {
                    }
                    if (f3 == null) {
                    }
                    niz nizVar2 = new niz(wnVar == null ? wnVar.c() : null, djz.a(wnVar == null ? wnVar.d() : null));
                    List a42 = vhzVar.a();
                    ArrayList arrayList62 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    knVar = (kn) ((nr) a.R(arrayList62));
                    if (knVar == null) {
                    }
                    List a82 = vhzVar.a();
                    ArrayList arrayList72 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    eo eoVar2 = (eo) ((nr) a.R(arrayList72));
                    if (eoVar2 == null) {
                    }
                    List<dc8> d52 = vhzVar.d();
                    ArrayList arrayList82 = new ArrayList(tcc.n(d52, 10));
                    while (r3.hasNext()) {
                    }
                    ihz c92 = vhzVar.c();
                    arrayList2.add(new bjz(str3, e2, j, uuid, n, str7, qizVar, logisticsOrderTracking$Status2, yizVar, wizVar, ajzVar, nizVar2, zizVar, mizVar, arrayList82, f501.a, c92 == null ? new diz(c92.c(), c92.a()) : null));
                    it2 = it;
                    str4 = str2;
                    djzVar2 = djzVar;
                }
                return arrayList2;
        }
    }

    public void b() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.g;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        linkedHashMap.clear();
    }

    @Override // com.yandex.go.superapp.tracking.api.dependencies.c, defpackage.q701
    public void stop() {
        switch (this.f) {
            case 0:
                super.stop();
                b();
                break;
            default:
                super.stop();
                break;
        }
    }

    public kem(tt2 tt2Var, tse tseVar, g gVar, wmh wmhVar, djz djzVar) {
        super(tt2Var, tseVar, gVar.h(), wmhVar);
        this.g = djzVar;
    }
}
