package com.yandex.go.superapp.discovery.map.impl.ui.main.v2;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.sls;
import defpackage.wyv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperAppDiscoveryMapV2ModalView$setListeners$1$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        wyv0 wyv0Var = (wyv0) this.receiver;
        CameraPosition cameraPosition = ((gh00) wyv0Var.W).e.c;
        ah00.b(wyv0Var.W, new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom(), 0.0f, cameraPosition.getTilt()), Animation.Type.SMOOTH);
        return zy11.a;
    }
}
