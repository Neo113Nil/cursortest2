package com.yandex.go.places.impl.ui.discovery.map;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.an91;
import defpackage.ch00;
import defpackage.g8c;
import defpackage.gh00;
import defpackage.go10;
import defpackage.jiu;
import defpackage.ldc0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PlacesDiscoveryMapSocialPinsPresenter$attachPins$1$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        g8c g8cVar = (g8c) obj;
        d dVar = (d) this.receiver;
        an91 an91Var = dVar.D.h;
        boolean z = false;
        if ((an91Var instanceof ldc0 ? (ldc0) an91Var : null) != null) {
            go10 go10Var = (go10) dVar.W;
            Point xyToWorld = ((Projection) go10Var.a.getValue()).xyToWorld(new XYPoint(go10Var.a() * g8cVar.d, go10Var.a() * g8cVar.e), 0);
            com.yandex.mapkit.maps.core.geometry.Point invoke = com.yandex.mapkit.maps.core.geometry.Point.INSTANCE.invoke(xyToWorld.getLatitude(), xyToWorld.getLongitude());
            com.yandex.go.places.impl.domain.interactors.common.a aVar = dVar.N;
            Point point = new Point(invoke.getLat(), invoke.getLon());
            float f = r0.a + 0.1f;
            jiu jiuVar = new jiu(13);
            aVar.getClass();
            ((gh00) aVar.a).g.k(new CameraPosition(point, f, 0.0f, 0.0f), 500.0f, Animation.Type.SMOOTH, new ch00(1, jiuVar));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
