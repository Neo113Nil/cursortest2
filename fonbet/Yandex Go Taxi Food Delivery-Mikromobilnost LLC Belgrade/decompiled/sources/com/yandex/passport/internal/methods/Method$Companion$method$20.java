package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class Method$Companion$method$20 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$20 b = new Method$Companion$method$20(1, 0, r2.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new r2((AutoLoginProperties) g.y.b((Bundle) obj));
    }
}
