package com.yandex.messaging.input;

import defpackage.ayj0;
import defpackage.e1k;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class InputDispatcher$2 extends AdaptedFunctionReference implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        c cVar = (c) this.receiver;
        ayj0 ayj0Var = cVar.j;
        if (ayj0Var != null) {
            ayj0Var.close();
        }
        cVar.j = null;
        e1k e1kVar = cVar.k;
        if (e1kVar != null) {
            e1kVar.close();
        }
        cVar.k = null;
        return zy11.a;
    }
}
