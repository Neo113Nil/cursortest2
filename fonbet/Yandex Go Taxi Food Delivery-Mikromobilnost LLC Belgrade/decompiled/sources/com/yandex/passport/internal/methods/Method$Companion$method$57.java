package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import defpackage.ny61;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class Method$Companion$method$57 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$57 b = new Method$Companion$method$57(1, 0, q1.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) g.G.b(bundle);
        String string = bundle.getString("track-id");
        if (string == null) {
            ny61.r("can't get required string track-id");
            return null;
        }
        String string2 = bundle.getString("crsf_token");
        if (string2 != null) {
            return new q1(passportEnvironmentImpl, string, string2);
        }
        ny61.r("can't get required string crsf_token");
        return null;
    }
}
