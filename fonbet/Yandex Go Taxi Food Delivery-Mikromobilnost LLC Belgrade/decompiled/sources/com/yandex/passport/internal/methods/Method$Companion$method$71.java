package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.api.impl.UserIdProperties;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class Method$Companion$method$71 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$71 b = new Method$Companion$method$71(1, 0, u1.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Parcelable e = oo31.e((Bundle) obj, com.yandex.passport.internal.util.p.class, "user_id_properties");
        if (e != null) {
            return new u1((UserIdProperties) e);
        }
        ny61.r("can't get required parcelable user_id_properties");
        return null;
    }
}
