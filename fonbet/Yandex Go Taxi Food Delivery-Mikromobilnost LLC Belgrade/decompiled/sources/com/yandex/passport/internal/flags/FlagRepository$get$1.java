package com.yandex.passport.internal.flags;

import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class FlagRepository$get$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((com.yandex.passport.internal.flags.experiments.b) this.receiver).a.getString((String) obj, null);
    }
}
