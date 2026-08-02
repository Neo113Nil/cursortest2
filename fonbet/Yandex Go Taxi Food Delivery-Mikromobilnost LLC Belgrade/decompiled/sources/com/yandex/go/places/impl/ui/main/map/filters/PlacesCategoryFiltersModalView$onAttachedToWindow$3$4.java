package com.yandex.go.places.impl.ui.main.map.filters;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class PlacesCategoryFiltersModalView$onAttachedToWindow$3$4 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        f fVar = (f) this.receiver;
        CameraPosition cameraPosition = ((gh00) fVar.M).e.c;
        ah00.b(fVar.M, new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom(), 0.0f, cameraPosition.getTilt()), Animation.Type.SMOOTH);
        return zy11.a;
    }
}
