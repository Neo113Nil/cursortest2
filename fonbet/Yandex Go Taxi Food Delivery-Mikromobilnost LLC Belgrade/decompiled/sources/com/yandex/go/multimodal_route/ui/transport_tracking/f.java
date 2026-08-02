package com.yandex.go.multimodal_route.ui.transport_tracking;

import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteButtonType;
import com.yandex.go.multimodal_route.interactors.i;
import com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteFabState;
import com.yandex.go.multimodal_route.ui.detailed_card.g;
import com.yandex.mapkit.geometry.SubpolylineHelper;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import com.yandex.mapkit.transport.masstransit.Section;
import defpackage.aa11;
import defpackage.ah00;
import defpackage.ba11;
import defpackage.bg30;
import defpackage.c21;
import defpackage.ca11;
import defpackage.cg30;
import defpackage.da11;
import defpackage.ea11;
import defpackage.es40;
import defpackage.fa11;
import defpackage.fi6;
import defpackage.ga11;
import defpackage.gh00;
import defpackage.i3y;
import defpackage.il01;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o711;
import defpackage.p711;
import defpackage.pv01;
import defpackage.q711;
import defpackage.r711;
import defpackage.r911;
import defpackage.s911;
import defpackage.u911;
import defpackage.v911;
import defpackage.w511;
import defpackage.w911;
import defpackage.x911;
import defpackage.y711;
import defpackage.y911;
import defpackage.yu40;
import defpackage.z711;
import defpackage.z911;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class f {
    public final ru.yandex.taxi.masstransit.detailedroute.ui.f a;
    public final z711 b;
    public final g c;
    public final yu40 d;
    public final ah00 e;
    public final i f;
    public final com.yandex.go.multimodal_route.interactors.a g;
    public final es40 h;
    public final i3y i = kotlin.a.a(new pv01(4, this));

    public f(ru.yandex.taxi.masstransit.detailedroute.ui.f fVar, z711 z711Var, g gVar, yu40 yu40Var, ah00 ah00Var, i iVar, com.yandex.go.multimodal_route.interactors.a aVar, es40 es40Var) {
        this.a = fVar;
        this.b = z711Var;
        this.c = gVar;
        this.d = yu40Var;
        this.e = ah00Var;
        this.f = iVar;
        this.g = aVar;
        this.h = es40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r6.f.a(r7, r10, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, r911 r911Var, o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        TransportTrackingCardUiActionInteractor$finishRoute$1 transportTrackingCardUiActionInteractor$finishRoute$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        r911 r911Var2;
        if (continuationImpl instanceof TransportTrackingCardUiActionInteractor$finishRoute$1) {
            transportTrackingCardUiActionInteractor$finishRoute$1 = (TransportTrackingCardUiActionInteractor$finishRoute$1) continuationImpl;
            int i2 = transportTrackingCardUiActionInteractor$finishRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportTrackingCardUiActionInteractor$finishRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportTrackingCardUiActionInteractor$finishRoute$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTrackingCardUiActionInteractor$finishRoute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.h.c(str, str2, MultimodalRouteAnalytics$MultimodalRouteButtonType.Finish);
                    transportTrackingCardUiActionInteractor$finishRoute$1.L$0 = str;
                    transportTrackingCardUiActionInteractor$finishRoute$1.L$1 = null;
                    transportTrackingCardUiActionInteractor$finishRoute$1.L$2 = r911Var;
                    transportTrackingCardUiActionInteractor$finishRoute$1.L$3 = null;
                    transportTrackingCardUiActionInteractor$finishRoute$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r911Var2 = (r911) transportTrackingCardUiActionInteractor$finishRoute$1.L$2;
                        str = (String) transportTrackingCardUiActionInteractor$finishRoute$1.L$0;
                        kotlin.b.b(obj);
                        r911Var2.a.r(new il01(str, 6));
                        return zy11.a;
                    }
                    r911Var = (r911) transportTrackingCardUiActionInteractor$finishRoute$1.L$2;
                    str = (String) transportTrackingCardUiActionInteractor$finishRoute$1.L$0;
                    kotlin.b.b(obj);
                }
                this.d.e(str);
                transportTrackingCardUiActionInteractor$finishRoute$1.L$0 = str;
                transportTrackingCardUiActionInteractor$finishRoute$1.L$1 = null;
                transportTrackingCardUiActionInteractor$finishRoute$1.L$2 = r911Var;
                transportTrackingCardUiActionInteractor$finishRoute$1.L$3 = null;
                transportTrackingCardUiActionInteractor$finishRoute$1.label = 2;
                if (this.g.a(str, transportTrackingCardUiActionInteractor$finishRoute$1) != coroutineSingletons) {
                    r911Var2 = r911Var;
                    r911Var2.a.r(new il01(str, 6));
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        transportTrackingCardUiActionInteractor$finishRoute$1 = new TransportTrackingCardUiActionInteractor$finishRoute$1(this, continuationImpl);
        Object obj2 = transportTrackingCardUiActionInteractor$finishRoute$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTrackingCardUiActionInteractor$finishRoute$1.label;
        if (i != 0) {
        }
        this.d.e(str);
        transportTrackingCardUiActionInteractor$finishRoute$1.L$0 = str;
        transportTrackingCardUiActionInteractor$finishRoute$1.L$1 = null;
        transportTrackingCardUiActionInteractor$finishRoute$1.L$2 = r911Var;
        transportTrackingCardUiActionInteractor$finishRoute$1.L$3 = null;
        transportTrackingCardUiActionInteractor$finishRoute$1.label = 2;
        if (this.g.a(str, transportTrackingCardUiActionInteractor$finishRoute$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x024f, code lost:
    
        if (r9.f.a(r10, r14, r0) == r1) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ga11 ga11Var, r911 r911Var, o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        TransportTrackingCardUiActionInteractor$handleAction$1 transportTrackingCardUiActionInteractor$handleAction$1;
        int i;
        String str3;
        Object obj;
        bg30 bg30Var;
        Route route;
        List<Section> sections;
        Route route2;
        RouteMetadata metadata;
        if (continuationImpl instanceof TransportTrackingCardUiActionInteractor$handleAction$1) {
            transportTrackingCardUiActionInteractor$handleAction$1 = (TransportTrackingCardUiActionInteractor$handleAction$1) continuationImpl;
            int i2 = transportTrackingCardUiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportTrackingCardUiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transportTrackingCardUiActionInteractor$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTrackingCardUiActionInteractor$handleAction$1.label;
                String str4 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean z = ga11Var instanceof u911;
                    es40 es40Var = this.h;
                    if (z) {
                        es40Var.c(str == null ? "" : str, str2, MultimodalRouteAnalytics$MultimodalRouteButtonType.ModalClose);
                        if (str == null) {
                            str = "";
                        }
                        es40Var.c(str, str2, MultimodalRouteAnalytics$MultimodalRouteButtonType.Back);
                        r911Var.a.P.a();
                    } else if (ga11Var instanceof ba11) {
                        bg30 bg30Var2 = ((ba11) ga11Var).a;
                        Route route3 = bg30Var2.a;
                        s911 s911Var = r911Var.a;
                        bg30 bg30Var3 = s911Var.T;
                        if (bg30Var3 != null && (route2 = bg30Var3.a) != null && (metadata = route2.getMetadata()) != null) {
                            str4 = metadata.getRouteId();
                        }
                        if (!jl40.l(str4, route3.getMetadata().getRouteId()) || (bg30Var = s911Var.T) == null || (route = bg30Var.a) == null || (sections = route.getSections()) == null || sections.size() != route3.getSections().size()) {
                            s911Var.T = bg30Var2;
                            cg30 cg30Var = (cg30) s911Var.H.get();
                            cg30 cg30Var2 = s911Var.S;
                            if (cg30Var2 != null) {
                                cg30Var2.i();
                            }
                            s911Var.S = cg30Var;
                            s911Var.A(cg30Var, bg30Var2, new c21());
                        }
                    } else {
                        boolean z2 = ga11Var instanceof ca11;
                        i3y i3yVar = this.i;
                        if (z2) {
                            ((y711) i3yVar.getValue()).a(new o711(((ca11) ga11Var).a), null);
                        } else if (ga11Var instanceof ea11) {
                            if (str == null) {
                                str = "";
                            }
                            es40Var.c(str, str2, MultimodalRouteAnalytics$MultimodalRouteButtonType.ThreadVariants);
                            ((y711) i3yVar.getValue()).a(new q711(((ea11) ga11Var).a), null);
                        } else if (ga11Var instanceof da11) {
                            if (str == null) {
                                str = "";
                            }
                            es40Var.c(str, str2, MultimodalRouteAnalytics$MultimodalRouteButtonType.ScheduleAndTickets);
                            ((y711) i3yVar.getValue()).a(new p711(((da11) ga11Var).a), null);
                        } else if (ga11Var instanceof fa11) {
                            if (str == null) {
                                str = "";
                            }
                            es40Var.c(str, str2, MultimodalRouteAnalytics$MultimodalRouteButtonType.MyTickets);
                            ((y711) i3yVar.getValue()).a(new r711(((fa11) ga11Var).a), null);
                        } else if (ga11Var instanceof y911) {
                            Route route4 = ((y911) ga11Var).a.a;
                            Iterator<T> it = route4.getSections().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((Section) obj).getMetadata().getData().getFitness() != null) {
                                    break;
                                }
                            }
                            Section section = (Section) obj;
                            if (section != null) {
                                fi6 fi6Var = new fi6();
                                fi6Var.d(SubpolylineHelper.subpolyline(route4.getGeometry(), section.getGeometry()));
                                ((gh00) this.e).A(fi6Var.g(), null);
                            }
                        } else {
                            boolean z3 = ga11Var instanceof z911;
                            g gVar = this.c;
                            if (!z3) {
                                if (jl40.l(ga11Var, aa11.a)) {
                                    transportTrackingCardUiActionInteractor$handleAction$1.L$0 = null;
                                    transportTrackingCardUiActionInteractor$handleAction$1.L$1 = null;
                                    transportTrackingCardUiActionInteractor$handleAction$1.L$2 = null;
                                    transportTrackingCardUiActionInteractor$handleAction$1.L$3 = null;
                                    transportTrackingCardUiActionInteractor$handleAction$1.L$4 = null;
                                    transportTrackingCardUiActionInteractor$handleAction$1.label = 1;
                                    Object a = gVar.a(transportTrackingCardUiActionInteractor$handleAction$1);
                                    if (a != coroutineSingletons) {
                                        return a;
                                    }
                                } else if (ga11Var instanceof x911) {
                                    String str5 = ((x911) ga11Var).a;
                                    transportTrackingCardUiActionInteractor$handleAction$1.L$0 = null;
                                    transportTrackingCardUiActionInteractor$handleAction$1.L$1 = null;
                                    transportTrackingCardUiActionInteractor$handleAction$1.L$2 = null;
                                    transportTrackingCardUiActionInteractor$handleAction$1.L$3 = null;
                                    transportTrackingCardUiActionInteractor$handleAction$1.L$4 = null;
                                    transportTrackingCardUiActionInteractor$handleAction$1.label = 2;
                                    Object a2 = a(str5, str2, r911Var, o2y0Var, transportTrackingCardUiActionInteractor$handleAction$1);
                                    if (a2 != coroutineSingletons) {
                                        return a2;
                                    }
                                } else if (jl40.l(ga11Var, w911.a)) {
                                    if (str == null) {
                                        str = "";
                                    }
                                    es40Var.c(str, str2, MultimodalRouteAnalytics$MultimodalRouteButtonType.EndOfModal);
                                } else {
                                    if (!(ga11Var instanceof v911)) {
                                        w511.b();
                                        return null;
                                    }
                                    if (str == null) {
                                        str = "";
                                    }
                                    es40Var.c(str, str2, MultimodalRouteAnalytics$MultimodalRouteButtonType.ModalClose);
                                    str3 = ((v911) ga11Var).a;
                                    if (str3 != null) {
                                        transportTrackingCardUiActionInteractor$handleAction$1.L$0 = null;
                                        transportTrackingCardUiActionInteractor$handleAction$1.L$1 = null;
                                        transportTrackingCardUiActionInteractor$handleAction$1.L$2 = null;
                                        transportTrackingCardUiActionInteractor$handleAction$1.L$3 = r911Var;
                                        transportTrackingCardUiActionInteractor$handleAction$1.L$4 = null;
                                        transportTrackingCardUiActionInteractor$handleAction$1.L$5 = str3;
                                        transportTrackingCardUiActionInteractor$handleAction$1.label = 3;
                                    }
                                    r911Var.a.P.a();
                                }
                                return coroutineSingletons;
                            }
                            ((gh00) gVar.a).A(((z911) ga11Var).a, null);
                            gVar.f.l(MultimodalRouteFabState.FOCUS_USER_LOCATION);
                        }
                    }
                    return zy11.a;
                }
                if (i == 1 || i == 2) {
                    kotlin.b.b(obj2);
                    return obj2;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = (String) transportTrackingCardUiActionInteractor$handleAction$1.L$5;
                r911Var = (r911) transportTrackingCardUiActionInteractor$handleAction$1.L$3;
                kotlin.b.b(obj2);
                this.d.e(str3);
                r911Var.a.P.a();
                return zy11.a;
            }
        }
        transportTrackingCardUiActionInteractor$handleAction$1 = new TransportTrackingCardUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj22 = transportTrackingCardUiActionInteractor$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTrackingCardUiActionInteractor$handleAction$1.label;
        String str42 = null;
        if (i != 0) {
        }
        this.d.e(str3);
        r911Var.a.P.a();
        return zy11.a;
    }
}
