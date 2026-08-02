package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.ny61;
import defpackage.tls;
import defpackage.xfo;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class Method$Companion$method$29 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$29 b = new Method$Companion$method$29(1, 0, c2.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        String string = bundle.getString("from-value-key");
        if (string == null) {
            ny61.r("can't get required string from-value-key");
            return null;
        }
        Bundle bundle2 = bundle.getBundle("push-data-key");
        if (bundle2 != null) {
            return new c2(string, bundle2);
        }
        xfo.g("can't get required bundle push-data-key");
        return null;
    }
}
