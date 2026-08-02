package com.yandex.go.navigator.ui;

import android.graphics.drawable.Drawable;
import defpackage.avj0;
import defpackage.c0c0;
import defpackage.sq00;
import defpackage.tls;
import defpackage.v2h0;
import defpackage.vng;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class NavigatorPinsController$addDestPointPlacemark$pinPlacemark$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        com.yandex.go.navigator.providers.a aVar = (com.yandex.go.navigator.providers.a) this.receiver;
        com.yandex.go.pin.api.widget.b bVar = aVar.b;
        Drawable t = vng.t(v2h0.ic_pin_dest, ((avj0) aVar.a).a);
        return bVar.e(new sq00(null, t != null ? new c0c0(t) : null, true, null, null, null, null, false, false, null, null, 0.0f, 8185), continuation);
    }
}
