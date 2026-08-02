package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.internal.entities.Filter;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class Method$Companion$method$2 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$2 b = new Method$Companion$method$2(1, 0, u0.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Parcelable e = oo31.e((Bundle) obj, com.yandex.passport.internal.util.p.class, "passport-filter");
        if (e != null) {
            return new u0((Filter) e);
        }
        ny61.r("can't get required parcelable passport-filter");
        return null;
    }
}
