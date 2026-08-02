package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.internal.properties.AuthorizationUrlProperties;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class Method$Companion$method$14 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$14 b = new Method$Companion$method$14(1, 0, x0.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new x0((AuthorizationUrlProperties) g.x.b((Bundle) obj));
    }
}
