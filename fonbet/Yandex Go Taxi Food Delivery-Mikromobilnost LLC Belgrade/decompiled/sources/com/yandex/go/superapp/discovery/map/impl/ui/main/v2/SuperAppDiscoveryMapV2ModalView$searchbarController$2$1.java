package com.yandex.go.superapp.discovery.map.impl.ui.main.v2;

import defpackage.a60;
import defpackage.hxx;
import defpackage.lgw0;
import defpackage.m950;
import defpackage.o4w0;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tls;
import defpackage.v4w0;
import defpackage.v770;
import defpackage.w4w0;
import defpackage.w511;
import defpackage.wyv0;
import defpackage.x4w0;
import defpackage.y4w0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperAppDiscoveryMapV2ModalView$searchbarController$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        y4w0 y4w0Var = (y4w0) obj;
        com.yandex.go.superapp.discovery.map.impl.navigation.main.v2.a aVar = (com.yandex.go.superapp.discovery.map.impl.navigation.main.v2.a) ((wyv0) this.receiver).A.a;
        if (y4w0Var instanceof v4w0) {
            aVar.r(new qu(9));
        } else if (y4w0Var instanceof x4w0) {
            o4w0 o4w0Var = aVar.P.a;
            o4w0Var.E((m950) o4w0Var.Q.get(), lgw0.a, sy60.Q2, hxx.a);
        } else {
            if (!(y4w0Var instanceof w4w0)) {
                w511.b();
                return null;
            }
            ((a60) aVar.O).c(((w4w0) y4w0Var).a, v770.c);
        }
        return zy11.a;
    }
}
