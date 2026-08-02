package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.internal.entities.ClientToken;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class Method$Companion$method$11 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$11 b = new Method$Companion$method$11(1, 0, l0.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new l0((ClientToken) o.w.b((Bundle) obj));
    }
}
