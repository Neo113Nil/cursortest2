package com.yandex.go.places.impl.domain.interactors.map;

import android.net.Uri;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$MapObjectType;
import com.yandex.go.places.api.navigation.OrganizationCardSliderPinDisplayStrategy;
import defpackage.a4j0;
import defpackage.ag80;
import defpackage.bei;
import defpackage.bn80;
import defpackage.cg80;
import defpackage.dab1;
import defpackage.dl80;
import defpackage.dm80;
import defpackage.fr;
import defpackage.fvj;
import defpackage.h2b1;
import defpackage.hsj;
import defpackage.hvj;
import defpackage.i4b0;
import defpackage.in00;
import defpackage.iuj;
import defpackage.ivj;
import defpackage.je80;
import defpackage.jio;
import defpackage.jp;
import defpackage.jvj;
import defpackage.kn00;
import defpackage.kq;
import defpackage.kvj;
import defpackage.l76;
import defpackage.lg80;
import defpackage.lvj;
import defpackage.mg80;
import defpackage.msb1;
import defpackage.muj;
import defpackage.mvj;
import defpackage.nfc0;
import defpackage.nuj;
import defpackage.nvj;
import defpackage.ny61;
import defpackage.ouj;
import defpackage.ovj;
import defpackage.pvj;
import defpackage.qtb1;
import defpackage.ruj;
import defpackage.svj;
import defpackage.ti80;
import defpackage.u050;
import defpackage.vvb1;
import defpackage.wbc0;
import defpackage.wls;
import defpackage.xl80;
import defpackage.yp;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final class f {
    public final com.yandex.go.places.impl.domain.interactors.a a;
    public final nfc0 b;
    public final wbc0 c;
    public final com.yandex.go.places.impl.navigation.common.navigator.internal.b d;
    public final mg80 e;
    public final a4j0 f;
    public final dl80 g;
    public final u050 h;

    public f(com.yandex.go.places.impl.domain.interactors.a aVar, nfc0 nfc0Var, wbc0 wbc0Var, com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar, mg80 mg80Var, a4j0 a4j0Var, dl80 dl80Var, u050 u050Var) {
        this.a = aVar;
        this.b = nfc0Var;
        this.c = wbc0Var;
        this.d = bVar;
        this.e = mg80Var;
        this.f = a4j0Var;
        this.g = dl80Var;
        this.h = u050Var;
    }

    public static Object a(f fVar, kn00 kn00Var, wls wlsVar, SuspendLambda suspendLambda) {
        fr action = kn00Var.getAction();
        if (action != null) {
            return fVar.b(kn00Var, false, false, action, wlsVar, suspendLambda);
        }
        fVar.getClass();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.yandex.go.places.impl.domain.interactors.map.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kn00 kn00Var, boolean z, boolean z2, fr frVar, wls wlsVar, ContinuationImpl continuationImpl) {
        PlacesPinActionsInteractorImpl$handlePinAction$1 placesPinActionsInteractorImpl$handlePinAction$1;
        int i;
        boolean z3;
        fr frVar2;
        OrganizationCardSliderPinDisplayStrategy organizationCardSliderPinDisplayStrategy;
        kq kqVar;
        wls wlsVar2;
        Iterator it;
        kn00 kn00Var2 = kn00Var;
        boolean z4 = z;
        boolean z5 = z2;
        fr frVar3 = frVar;
        if (continuationImpl instanceof PlacesPinActionsInteractorImpl$handlePinAction$1) {
            placesPinActionsInteractorImpl$handlePinAction$1 = (PlacesPinActionsInteractorImpl$handlePinAction$1) continuationImpl;
            int i2 = placesPinActionsInteractorImpl$handlePinAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesPinActionsInteractorImpl$handlePinAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesPinActionsInteractorImpl$handlePinAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesPinActionsInteractorImpl$handlePinAction$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r1 = placesPinActionsInteractorImpl$handlePinAction$1.I$0;
                        organizationCardSliderPinDisplayStrategy = (OrganizationCardSliderPinDisplayStrategy) placesPinActionsInteractorImpl$handlePinAction$1.L$5;
                        frVar2 = (fr) placesPinActionsInteractorImpl$handlePinAction$1.L$3;
                        kn00 kn00Var3 = (kn00) placesPinActionsInteractorImpl$handlePinAction$1.L$0;
                        kotlin.b.b(obj);
                        z3 = r1;
                        kn00Var2 = kn00Var3;
                        c((kq) frVar2, kn00Var2.getId(), z3, organizationCardSliderPinDisplayStrategy);
                        return zy11.a;
                    }
                    boolean z6 = placesPinActionsInteractorImpl$handlePinAction$1.Z$1;
                    z4 = placesPinActionsInteractorImpl$handlePinAction$1.Z$0;
                    Iterator it2 = (Iterator) placesPinActionsInteractorImpl$handlePinAction$1.L$4;
                    wls wlsVar3 = (wls) placesPinActionsInteractorImpl$handlePinAction$1.L$2;
                    kn00 kn00Var4 = (kn00) placesPinActionsInteractorImpl$handlePinAction$1.L$0;
                    kotlin.b.b(obj);
                    z5 = z6;
                    kn00Var2 = kn00Var4;
                    it = it2;
                    wlsVar2 = wlsVar3;
                    while (it.hasNext()) {
                        fr frVar4 = (fr) it.next();
                        placesPinActionsInteractorImpl$handlePinAction$1.L$0 = kn00Var2;
                        placesPinActionsInteractorImpl$handlePinAction$1.L$1 = null;
                        placesPinActionsInteractorImpl$handlePinAction$1.L$2 = wlsVar2;
                        placesPinActionsInteractorImpl$handlePinAction$1.L$3 = null;
                        placesPinActionsInteractorImpl$handlePinAction$1.L$4 = it;
                        placesPinActionsInteractorImpl$handlePinAction$1.L$5 = null;
                        placesPinActionsInteractorImpl$handlePinAction$1.L$6 = null;
                        placesPinActionsInteractorImpl$handlePinAction$1.Z$0 = z4;
                        placesPinActionsInteractorImpl$handlePinAction$1.Z$1 = z5;
                        placesPinActionsInteractorImpl$handlePinAction$1.label = 1;
                        if (b(kn00Var2, z4, z5, frVar4, wlsVar2, placesPinActionsInteractorImpl$handlePinAction$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                kotlin.b.b(obj);
                if (frVar3 instanceof yp) {
                    wlsVar2 = wlsVar;
                    it = ((yp) frVar3).a.iterator();
                    while (it.hasNext()) {
                    }
                    return zy11.a;
                }
                nfc0 nfc0Var = this.b;
                jio jioVar = nfc0Var.a;
                String id = kn00Var2.getId();
                DiscoveryAnalytics$MapObjectType a = nfc0.a(kn00Var2);
                bn80 bn80Var = (bn80) nfc0Var.b.a.getValue();
                String str = bn80Var != null ? bn80Var.a : null;
                hsj hsjVar = jioVar.b;
                String i3 = jioVar.i();
                hsjVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("map_object", a.getEventValue());
                hashMap.put("oid", id);
                hashMap.put("source", i3);
                if (str != null) {
                    hashMap.put("geosearch_context", str);
                }
                hsjVar.a.a("Discovery.Map.Tapped", hashMap, 5, new HashMap());
                jp jpVar = frVar3 instanceof jp ? (jp) frVar3 : null;
                if (jpVar != null) {
                    Uri parse = Uri.parse(jpVar.a);
                    this.g.getClass();
                    dm80 a2 = dl80.a(parse, false, false);
                    xl80 xl80Var = a2 instanceof xl80 ? (xl80) a2 : null;
                    if (xl80Var == null) {
                        kqVar = null;
                    } else {
                        ti80 ti80Var = xl80Var.c;
                        lg80 lg80Var = xl80Var.b;
                        String str2 = xl80Var.d;
                        String str3 = xl80Var.e;
                        je80 je80Var = xl80Var.i;
                        kqVar = new kq(ti80Var, lg80Var, str2, str3, je80Var != null && je80Var.p, 32);
                    }
                    if (kqVar != null) {
                        frVar3 = kqVar;
                    }
                }
                if (frVar3 instanceof kq) {
                    in00 in00Var = kn00Var2 instanceof in00 ? (in00) kn00Var2 : null;
                    if (in00Var == null || !in00Var.b()) {
                        in00Var = null;
                    }
                    z3 = z4 || ((kq) frVar3).e;
                    kq kqVar2 = (kq) frVar3;
                    OrganizationCardSliderPinDisplayStrategy organizationCardSliderPinDisplayStrategy2 = z5 ? OrganizationCardSliderPinDisplayStrategy.SELECTED_PIN_ONLY : OrganizationCardSliderPinDisplayStrategy.ALL_PINS;
                    if (in00Var != null) {
                        placesPinActionsInteractorImpl$handlePinAction$1.L$0 = kn00Var2;
                        placesPinActionsInteractorImpl$handlePinAction$1.L$1 = null;
                        placesPinActionsInteractorImpl$handlePinAction$1.L$2 = null;
                        placesPinActionsInteractorImpl$handlePinAction$1.L$3 = frVar3;
                        placesPinActionsInteractorImpl$handlePinAction$1.L$4 = null;
                        placesPinActionsInteractorImpl$handlePinAction$1.L$5 = organizationCardSliderPinDisplayStrategy2;
                        placesPinActionsInteractorImpl$handlePinAction$1.Z$0 = z4;
                        placesPinActionsInteractorImpl$handlePinAction$1.Z$1 = z5;
                        placesPinActionsInteractorImpl$handlePinAction$1.I$0 = z3 ? 1 : 0;
                        placesPinActionsInteractorImpl$handlePinAction$1.label = 2;
                        if (wlsVar.invoke(in00Var, placesPinActionsInteractorImpl$handlePinAction$1) != coroutineSingletons) {
                            frVar2 = frVar3;
                            organizationCardSliderPinDisplayStrategy = organizationCardSliderPinDisplayStrategy2;
                            c((kq) frVar2, kn00Var2.getId(), z3, organizationCardSliderPinDisplayStrategy);
                        }
                        return coroutineSingletons;
                    }
                    c(kqVar2, null, z3, organizationCardSliderPinDisplayStrategy2);
                } else {
                    svj a3 = this.c.a();
                    this.a.a(frVar3, ((a3 instanceof hvj) || (a3 instanceof fvj)) ? null : a3 instanceof ovj ? bei.M : a3 instanceof mvj ? l76.M : a3 instanceof ivj ? qtb1.L : a3 instanceof kvj ? vvb1.L : a3.d() ? msb1.O : a3.c() ? h2b1.M : a3.b() ? bei.L : dab1.M);
                }
                return zy11.a;
            }
        }
        placesPinActionsInteractorImpl$handlePinAction$1 = new PlacesPinActionsInteractorImpl$handlePinAction$1(this, continuationImpl);
        Object obj2 = placesPinActionsInteractorImpl$handlePinAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesPinActionsInteractorImpl$handlePinAction$1.label;
        if (i == 0) {
        }
    }

    public final void c(kq kqVar, String str, boolean z, OrganizationCardSliderPinDisplayStrategy organizationCardSliderPinDisplayStrategy) {
        svj a = this.c.a();
        if (!(a instanceof hvj)) {
            a = a instanceof fvj ? nuj.b : a instanceof ovj ? pvj.b : a instanceof kvj ? lvj.b : a instanceof ivj ? jvj.b : a instanceof mvj ? nvj.b : a.d() ? ruj.b : a.c() ? ouj.b : a.b() ? iuj.b : muj.b;
        }
        svj svjVar = a;
        ti80 ti80Var = kqVar.a;
        lg80 lg80Var = kqVar.b;
        if (lg80Var == null) {
            lg80Var = this.e.a();
            if (lg80Var instanceof ag80) {
                lg80Var = null;
            }
            if (lg80Var == null) {
                lg80Var = cg80.b;
            }
        }
        com.yandex.go.places.impl.navigation.common.navigator.internal.b.c(this.d, svjVar, ti80Var, lg80Var, kqVar.c, kqVar.d, false, true, str, true, false, false, false, z, organizationCardSliderPinDisplayStrategy, new i4b0(22, this), HProv.ALG_TYPE_SECURECHANNEL);
    }
}
