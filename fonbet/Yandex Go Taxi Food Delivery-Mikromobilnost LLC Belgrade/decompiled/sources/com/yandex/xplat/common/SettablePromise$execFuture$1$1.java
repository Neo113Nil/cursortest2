package com.yandex.xplat.common;

import defpackage.glf0;
import defpackage.tls;
import defpackage.y4r0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class SettablePromise$execFuture$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        y4r0 y4r0Var = (y4r0) this.receiver;
        y4r0Var.d.i(new glf0(obj));
        y4r0Var.g.cancel(true);
        return zy11.a;
    }
}
