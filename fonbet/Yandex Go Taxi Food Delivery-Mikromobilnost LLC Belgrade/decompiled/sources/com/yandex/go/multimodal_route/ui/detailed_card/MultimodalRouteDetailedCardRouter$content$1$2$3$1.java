package com.yandex.go.multimodal_route.ui.detailed_card;

import android.view.ContextThemeWrapper;
import defpackage.avj0;
import defpackage.ks40;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class MultimodalRouteDetailedCardRouter$content$1$2$3$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        ks40 ks40Var = (ks40) this.receiver;
        avj0 avj0Var = (avj0) ks40Var.T;
        int u = tje.u(24, avj0Var.a) + intValue;
        ContextThemeWrapper contextThemeWrapper = avj0Var.a;
        int u2 = tje.u(24, contextThemeWrapper);
        ks40Var.S.q3(ks40Var, u2, tje.u(80, contextThemeWrapper), u2, u);
        return zy11.a;
    }
}
