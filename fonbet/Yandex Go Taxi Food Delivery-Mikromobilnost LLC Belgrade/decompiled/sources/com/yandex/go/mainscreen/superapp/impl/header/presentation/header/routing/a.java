package com.yandex.go.mainscreen.superapp.impl.header.presentation.header.routing;

import com.yandex.go.address.models.Address;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.CurrentAddressModalExperiment;
import defpackage.d6z;
import defpackage.e61;
import defpackage.evu0;
import defpackage.f6v0;
import defpackage.gv0;
import defpackage.h55;
import defpackage.h6v0;
import defpackage.jbh;
import defpackage.m2h0;
import defpackage.m950;
import defpackage.mth;
import defpackage.n4j0;
import defpackage.ny61;
import defpackage.ogu0;
import defpackage.p4g0;
import defpackage.qu;
import defpackage.rqo;
import defpackage.s6u0;
import defpackage.scc;
import defpackage.sef;
import defpackage.t6v0;
import defpackage.tef;
import defpackage.tje;
import defpackage.u6v0;
import defpackage.u9w0;
import defpackage.v6v0;
import defpackage.v9w0;
import defpackage.w6v0;
import defpackage.w9v0;
import defpackage.x9v0;
import defpackage.y9y0;
import defpackage.z5v0;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$SuggestMenu$ActionType;
import ru.yandex.taxi.experiments.q;
import ru.yandex.taxi.map_common.image.StaticMapImageConfig$MapType;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes12.dex */
public final class a extends h55 implements v9w0 {
    public final gv0 D;
    public final n4j0 E;
    public final rqo F;
    public final w6v0 G;

    public a(gv0 gv0Var, n4j0 n4j0Var, rqo rqoVar, w6v0 w6v0Var) {
        super(null);
        this.D = gv0Var;
        this.E = n4j0Var;
        this.F = rqoVar;
        this.G = w6v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, u9w0 u9w0Var, ContinuationImpl continuationImpl) {
        SuperappCurrentAddressRouterImpl$onLaunchSuspend$1 superappCurrentAddressRouterImpl$onLaunchSuspend$1;
        int i;
        u9w0 u9w0Var2;
        boolean z;
        aVar.getClass();
        if (continuationImpl instanceof SuperappCurrentAddressRouterImpl$onLaunchSuspend$1) {
            superappCurrentAddressRouterImpl$onLaunchSuspend$1 = (SuperappCurrentAddressRouterImpl$onLaunchSuspend$1) continuationImpl;
            int i2 = superappCurrentAddressRouterImpl$onLaunchSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappCurrentAddressRouterImpl$onLaunchSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappCurrentAddressRouterImpl$onLaunchSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappCurrentAddressRouterImpl$onLaunchSuspend$1.label;
                final int i3 = 1;
                if (i != 0) {
                    b.b(obj);
                    rqo rqoVar = aVar.F;
                    CurrentAddressModalExperiment.Companion.getClass();
                    q d = ((jbh) rqoVar).d(CurrentAddressModalExperiment.o);
                    superappCurrentAddressRouterImpl$onLaunchSuspend$1.L$0 = u9w0Var;
                    superappCurrentAddressRouterImpl$onLaunchSuspend$1.label = 1;
                    obj = d.b(superappCurrentAddressRouterImpl$onLaunchSuspend$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    u9w0Var2 = u9w0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u9w0Var2 = (u9w0) superappCurrentAddressRouterImpl$onLaunchSuspend$1.L$0;
                    b.b(obj);
                }
                CurrentAddressModalExperiment currentAddressModalExperiment = (CurrentAddressModalExperiment) obj;
                z = currentAddressModalExperiment.b;
                int i4 = 9;
                zy11 zy11Var = zy11.a;
                if (z) {
                    if (aVar.u()) {
                        aVar.r(new qu(i4));
                        return zy11Var;
                    }
                    aVar.i();
                    return zy11Var;
                }
                if (!currentAddressModalExperiment.f) {
                    CurrentAddressModalExperiment.OnMapClickActionType onMapClickActionType = currentAddressModalExperiment.e;
                    if (onMapClickActionType != CurrentAddressModalExperiment.OnMapClickActionType.UNDEFINED) {
                        aVar.D.a(onMapClickActionType, u9w0Var2.a);
                        if (aVar.u()) {
                            aVar.r(new qu(i4));
                            return zy11Var;
                        }
                        aVar.i();
                    }
                    return zy11Var;
                }
                m950 m950Var = (m950) aVar.E.get();
                w6v0 w6v0Var = aVar.G;
                w6v0Var.getClass();
                String Y = d6z.Y(currentAddressModalExperiment, currentAddressModalExperiment.g);
                String Y2 = d6z.Y(currentAddressModalExperiment, currentAddressModalExperiment.h);
                String Y3 = d6z.Y(currentAddressModalExperiment, currentAddressModalExperiment.i);
                String Y4 = d6z.Y(currentAddressModalExperiment, currentAddressModalExperiment.j);
                CurrentAddressModalExperiment.OnMapClickActionType onMapClickActionType2 = currentAddressModalExperiment.e;
                List list = currentAddressModalExperiment.l;
                s6u0 s6u0Var = new s6u0((Integer) kotlin.collections.a.R(list), list.size() == 2 ? (Integer) list.get(1) : null, currentAddressModalExperiment.d, StaticMapImageConfig$MapType.MAP);
                String Y5 = d6z.Y(currentAddressModalExperiment, currentAddressModalExperiment.k);
                String str = currentAddressModalExperiment.c;
                if (evu0.J(str)) {
                    str = "https://u9xb.adj.st/route?end-lat=$END_LAT$&end-lon=$END_LON$&&adj_t=ki0yjo2_ns9zpoe&ref=ki0yjo2_ns9zpoe";
                }
                final tef tefVar = new tef(Y, Y2, Y3, Y4, onMapClickActionType2, s6u0Var, new sef(Y5, str));
                List g = scc.g(new z5v0(Events$SuggestMenu$ActionType.SAVE_TO_FAVORITES, Y2, m2h0.ic_current_address_save), new z5v0(Events$SuggestMenu$ActionType.CHANGE_ADDRESS, Y3, m2h0.ic_current_address_change), new z5v0(Events$SuggestMenu$ActionType.SHARE_ADDRESS, Y4, m2h0.ic_current_address_share));
                int i5 = x9v0.P;
                final int i6 = 0;
                w9v0 w9v0Var = new w9v0(0);
                w9v0Var.H = Y;
                w9v0Var.I = g;
                w9v0Var.J = s6u0Var;
                x9v0 x9v0Var = new x9v0(w9v0Var);
                PointType pointType = PointType.SOURCE;
                final h6v0 h6v0Var = w6v0Var.a;
                h6v0Var.getClass();
                u6v0 u6v0Var = new u6v0();
                u6v0Var.d = new e61(i3, h6v0Var);
                u6v0Var.f = new f6v0(0, h6v0Var);
                u6v0Var.e = new t6v0() { // from class: g6v0
                    @Override // defpackage.t6v0
                    public final void a(Address address) {
                        int i7 = i6;
                        tef tefVar2 = tefVar;
                        h6v0 h6v0Var2 = h6v0Var;
                        switch (i7) {
                            case 0:
                                sef sefVar = tefVar2.g;
                                h6v0Var2.getClass();
                                String str2 = sefVar.a;
                                String str3 = sefVar.b;
                                zzs B = address.B();
                                q5z.b0(h6v0Var2.a, evu0.k0(str2 + "\n" + cvu0.v(cvu0.v(str3, "$END_LAT$", h6v0.a(B.a), true), "$END_LON$", h6v0.a(B.b), true)).toString());
                                break;
                            default:
                                h6v0Var2.c.a(tefVar2.e, address);
                                break;
                        }
                    }
                };
                if (onMapClickActionType2 != CurrentAddressModalExperiment.OnMapClickActionType.UNDEFINED) {
                    u6v0Var.h = new t6v0() { // from class: g6v0
                        @Override // defpackage.t6v0
                        public final void a(Address address) {
                            int i7 = i3;
                            tef tefVar2 = tefVar;
                            h6v0 h6v0Var2 = h6v0Var;
                            switch (i7) {
                                case 0:
                                    sef sefVar = tefVar2.g;
                                    h6v0Var2.getClass();
                                    String str2 = sefVar.a;
                                    String str3 = sefVar.b;
                                    zzs B = address.B();
                                    q5z.b0(h6v0Var2.a, evu0.k0(str2 + "\n" + cvu0.v(cvu0.v(str3, "$END_LAT$", h6v0.a(B.a), true), "$END_LON$", h6v0.a(B.b), true)).toString());
                                    break;
                                default:
                                    h6v0Var2.c.a(tefVar2.e, address);
                                    break;
                            }
                        }
                    };
                }
                aVar.A(m950Var, new v6v0(x9v0Var, pointType, u6v0Var.a(), new ogu0(5, new mth(((y9y0) w6v0Var.b.j.get()).f(), 6)), EntryPoint.SUPER_APP_HEADER), new p4g0(aVar, 15));
                return zy11Var;
            }
        }
        superappCurrentAddressRouterImpl$onLaunchSuspend$1 = new SuperappCurrentAddressRouterImpl$onLaunchSuspend$1(aVar, continuationImpl);
        Object obj2 = superappCurrentAddressRouterImpl$onLaunchSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappCurrentAddressRouterImpl$onLaunchSuspend$1.label;
        final int i32 = 1;
        if (i != 0) {
        }
        CurrentAddressModalExperiment currentAddressModalExperiment2 = (CurrentAddressModalExperiment) obj2;
        z = currentAddressModalExperiment2.b;
        int i42 = 9;
        zy11 zy11Var2 = zy11.a;
        if (z) {
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new SuperappCurrentAddressRouterImpl$onLaunch$1(this, (u9w0) obj, null), 3);
    }
}
