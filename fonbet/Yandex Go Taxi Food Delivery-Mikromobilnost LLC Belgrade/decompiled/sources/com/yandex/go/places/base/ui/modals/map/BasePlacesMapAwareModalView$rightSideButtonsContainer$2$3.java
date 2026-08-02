package com.yandex.go.places.base.ui.modals.map;

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
public final /* synthetic */ class BasePlacesMapAwareModalView$rightSideButtonsContainer$2$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        c cVar = (c) this.receiver;
        CameraPosition cameraPosition = ((gh00) cVar.z).e.c;
        ah00.b(cVar.z, new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom(), 0.0f, cameraPosition.getTilt()), Animation.Type.SMOOTH);
        return zy11.a;
    }
}
