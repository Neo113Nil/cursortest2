package com.yandex.go.places.impl.ui.bookings;

import com.yandex.go.places.webview.api.navigation.PlacesWebAuthType;
import defpackage.f28;
import defpackage.l5c0;
import defpackage.m950;
import defpackage.qgc0;
import defpackage.tls;
import defpackage.ugc0;
import defpackage.v5c0;
import defpackage.y5c0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class PlacesBookingsModalView$bookingsAdapter$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        v5c0 v5c0Var = ((y5c0) this.receiver).y;
        String str = ((l5c0) obj).e;
        f28 f28Var = (f28) v5c0Var.b;
        f28Var.A((m950) ((yvf0) f28Var.I).get(), new ugc0(str, PlacesWebAuthType.OAUTH, false, 12), qgc0.U3);
        return zy11.a;
    }
}
