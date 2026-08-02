package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PushPlatform;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class Method$Companion$method$30 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$30 b = new Method$Companion$method$30(1, 0, b2.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        return new b2((PushPlatform) g3.w.c(bundle), bundle.getString("token-value", null));
    }
}
