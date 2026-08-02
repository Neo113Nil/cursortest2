package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.multimodal_route.network.models.TaxiFeedbackDto;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.geometry.SubpolylineHelper;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Section;
import defpackage.ief;
import defpackage.kub1;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.qq80;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.u611;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ TaxiTransportInfoResponseDto b;
    public final /* synthetic */ Route c;
    public final /* synthetic */ s w;
    public final /* synthetic */ String x;

    public o(vpr vprVar, TaxiTransportInfoResponseDto taxiTransportInfoResponseDto, Route route, s sVar, String str) {
        this.a = vprVar;
        this.b = taxiTransportInfoResponseDto;
        this.c = route;
        this.w = sVar;
        this.x = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0256, code lost:
    
        if (r13.emit(r1, r12) == r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01f4, code lost:
    
        if (r1 == r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0106, code lost:
    
        if (r1 == r3) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1 transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1;
        int i;
        u611 u611Var;
        vpr vprVar;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        u611 u611Var2;
        vpr vprVar2;
        CharSequence charSequence3;
        Object i2;
        vpr vprVar3;
        Section section;
        u611 u611Var3;
        String str;
        Subpolyline geometry;
        Polyline subpolyline;
        List<Point> points;
        Point point;
        tpr g;
        Object b;
        vpr vprVar4;
        TaxiFeedbackDto taxiFeedbackDto = this.b.h;
        if (continuation instanceof TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1) {
            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1 = (TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1) continuation;
            int i3 = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1 transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12 = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1;
                Object obj2 = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.label;
                s sVar = this.w;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    u611Var = (u611) obj;
                    vprVar = this.a;
                    if (u611Var == null) {
                        obj2 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$0 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$1 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$2 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$3 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$5 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$7 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$8 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$9 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.label = 5;
                    } else {
                        if (taxiFeedbackDto == null || (formattedText = taxiFeedbackDto.a) == null) {
                            charSequence = null;
                            if (taxiFeedbackDto == null) {
                                charSequence2 = charSequence;
                                u611Var2 = u611Var;
                                vprVar2 = vprVar;
                                charSequence3 = null;
                                Route route = this.c;
                                section = (Section) kotlin.collections.a.R(route.getSections());
                                if (section != null) {
                                }
                                u611Var3 = u611Var2;
                                str = null;
                                CharSequence charSequence4 = charSequence2;
                                vpr vprVar5 = vprVar2;
                                CharSequence charSequence5 = charSequence3;
                                com.yandex.go.multimodal_route.interactors.d dVar = sVar.d;
                                String str2 = this.x;
                                if (str2 != null) {
                                }
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$0 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$1 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$2 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$3 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4 = vprVar5;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$5 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$7 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$8 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$9 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.label = 4;
                                b = com.yandex.go.multimodal_route.interactors.d.b(dVar, r5, str, charSequence4, charSequence5, u611Var3, null, null, transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12, 96);
                                if (b != coroutineSingletons) {
                                }
                                return coroutineSingletons;
                            }
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$0 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$1 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$2 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$3 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4 = vprVar;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$5 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6 = u611Var;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$7 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$8 = charSequence;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.label = 2;
                            sVar.getClass();
                            FormattedText formattedText2 = taxiFeedbackDto.b;
                            if (!formattedText2.d()) {
                                formattedText2 = null;
                            }
                            if (formattedText2 == null) {
                                i2 = null;
                            } else {
                                ief iefVar = taxiFeedbackDto.h;
                                List<Object> list = formattedText2.a;
                                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                                for (Object obj3 : list) {
                                    if (obj3 instanceof FormattedText.h) {
                                        FormattedText.h hVar = (FormattedText.h) obj3;
                                        obj3 = FormattedText.h.e(hVar, kub1.e(sVar.s, iefVar, hVar.a), null, null, 2046);
                                    }
                                    arrayList.add(obj3);
                                }
                                i2 = ru.yandex.taxi.widget.c.i(sVar.e, new FormattedText(arrayList), null, transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12, 30);
                            }
                            if (i2 != coroutineSingletons) {
                                Object obj4 = i2;
                                charSequence2 = charSequence;
                                obj2 = obj4;
                                vprVar3 = vprVar;
                                vprVar2 = vprVar3;
                                u611Var2 = u611Var;
                                charSequence3 = (CharSequence) obj2;
                                Route route2 = this.c;
                                section = (Section) kotlin.collections.a.R(route2.getSections());
                                if (section != null) {
                                }
                                u611Var3 = u611Var2;
                                str = null;
                                CharSequence charSequence42 = charSequence2;
                                vpr vprVar52 = vprVar2;
                                CharSequence charSequence52 = charSequence3;
                                com.yandex.go.multimodal_route.interactors.d dVar2 = sVar.d;
                                String str22 = this.x;
                                if (str22 != null) {
                                }
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$0 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$1 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$2 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$3 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4 = vprVar52;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$5 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$7 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$8 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$9 = null;
                                transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.label = 4;
                                b = com.yandex.go.multimodal_route.interactors.d.b(dVar2, r5, str, charSequence42, charSequence52, u611Var3, null, null, transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12, 96);
                                if (b != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        ru.yandex.taxi.widget.c cVar = sVar.e;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$0 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$1 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$2 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$3 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4 = vprVar;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$5 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6 = u611Var;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$7 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.label = 1;
                        obj2 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12, 30);
                    }
                } else if (i == 1) {
                    u611Var = (u611) transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6;
                    vprVar = (vpr) transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4;
                    kotlin.b.b(obj2);
                } else if (i == 2) {
                    charSequence2 = (CharSequence) transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$8;
                    u611Var = (u611) transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6;
                    vprVar3 = (vpr) transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4;
                    kotlin.b.b(obj2);
                    vprVar2 = vprVar3;
                    u611Var2 = u611Var;
                    charSequence3 = (CharSequence) obj2;
                    Route route22 = this.c;
                    section = (Section) kotlin.collections.a.R(route22.getSections());
                    if (section != null || (geometry = section.getGeometry()) == null || (subpolyline = SubpolylineHelper.subpolyline(route22.getGeometry(), geometry)) == null || (points = subpolyline.getPoints()) == null || (point = (Point) kotlin.collections.a.R(points)) == null) {
                        u611Var3 = u611Var2;
                        str = null;
                        CharSequence charSequence422 = charSequence2;
                        vpr vprVar522 = vprVar2;
                        CharSequence charSequence522 = charSequence3;
                        com.yandex.go.multimodal_route.interactors.d dVar22 = sVar.d;
                        String str222 = this.x;
                        if (str222 != null) {
                        }
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$0 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$1 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$2 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$3 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4 = vprVar522;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$5 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$7 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$8 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$9 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.label = 4;
                        b = com.yandex.go.multimodal_route.interactors.d.b(dVar22, r5, str, charSequence422, charSequence522, u611Var3, null, null, transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12, 96);
                        if (b != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    g = ((ru.yandex.taxi.search.suggest.i) sVar.h).g(new zzs(point.getLatitude(), point.getLongitude(), 0, null, null, 28), "", RoutePointType.POINT_A, true, false, qq80.b, null);
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$0 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$1 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$2 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$3 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4 = vprVar2;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$5 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6 = u611Var2;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$7 = charSequence3;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$8 = charSequence2;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$9 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.label = 3;
                    obj2 = kotlinx.coroutines.flow.e.y(g, transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12);
                } else {
                    if (i == 3) {
                        charSequence2 = (CharSequence) transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$8;
                        charSequence3 = (CharSequence) transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$7;
                        u611Var2 = (u611) transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6;
                        vprVar2 = (vpr) transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4;
                        kotlin.b.b(obj2);
                        u611Var3 = u611Var2;
                        str = ((pv0) obj2).a.getAddress().f;
                        CharSequence charSequence4222 = charSequence2;
                        vpr vprVar5222 = vprVar2;
                        CharSequence charSequence5222 = charSequence3;
                        com.yandex.go.multimodal_route.interactors.d dVar222 = sVar.d;
                        String str2222 = this.x;
                        String str3 = str2222 != null ? str2222 : "";
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$0 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$1 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$2 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$3 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4 = vprVar5222;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$5 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$7 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$8 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$9 = null;
                        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.label = 4;
                        b = com.yandex.go.multimodal_route.interactors.d.b(dVar222, str3, str, charSequence4222, charSequence5222, u611Var3, null, null, transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12, 96);
                        if (b != coroutineSingletons) {
                            obj2 = b;
                            vprVar4 = vprVar5222;
                            vprVar = vprVar4;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$0 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$1 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$2 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$3 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$5 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$7 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$8 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$9 = null;
                            transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.label = 5;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar4 = (vpr) transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4;
                    kotlin.b.b(obj2);
                    vprVar = vprVar4;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$0 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$1 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$2 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$3 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$4 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$5 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$6 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$7 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$8 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.L$9 = null;
                    transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$12.label = 5;
                }
                charSequence = (CharSequence) obj2;
                if (taxiFeedbackDto == null) {
                }
            }
        }
        transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1 = new TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1(this, continuation);
        TransportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1 transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$122 = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$1;
        Object obj22 = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportTrackingCardUiStateInteractor$uiState$lambda$1$$inlined$map$1$2$122.label;
        s sVar2 = this.w;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj22;
        if (taxiFeedbackDto == null) {
        }
    }
}
