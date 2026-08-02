package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class Method$Companion$method$34 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$34 b = new Method$Companion$method$34(1, 0, l2.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new l2(((Bundle) obj).getBoolean("is-auto-login-disabled"));
    }
}
