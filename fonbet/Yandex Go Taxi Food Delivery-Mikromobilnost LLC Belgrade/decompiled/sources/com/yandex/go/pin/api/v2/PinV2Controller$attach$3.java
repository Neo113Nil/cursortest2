package com.yandex.go.pin.api.v2;

import defpackage.i1c0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PinV2Controller$attach$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((PinV2Component) this.receiver).updateControlStyle((i1c0) obj);
        return zy11.a;
    }
}
