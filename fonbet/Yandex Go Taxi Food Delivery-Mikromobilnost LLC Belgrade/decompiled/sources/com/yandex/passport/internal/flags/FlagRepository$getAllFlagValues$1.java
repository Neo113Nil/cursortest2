package com.yandex.passport.internal.flags;

import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class FlagRepository$getAllFlagValues$1 extends FunctionReferenceImpl implements tls {
    public FlagRepository$getAllFlagValues$1(Object obj) {
        super(1, obj, com.yandex.passport.internal.flags.experiments.b.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((com.yandex.passport.internal.flags.experiments.b) this.receiver).a.getString((String) obj, null);
    }
}
