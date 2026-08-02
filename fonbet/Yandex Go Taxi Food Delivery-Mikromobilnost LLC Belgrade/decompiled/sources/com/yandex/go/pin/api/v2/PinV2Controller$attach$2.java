package com.yandex.go.pin.api.v2;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PinV2Controller$attach$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((PinV2Component) this.receiver).updateControlState((SourceOnMapControl.a) obj);
        return zy11.a;
    }
}
