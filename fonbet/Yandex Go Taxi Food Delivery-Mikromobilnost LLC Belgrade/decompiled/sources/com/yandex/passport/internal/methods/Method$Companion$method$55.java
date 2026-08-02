package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.data.network.GetTrackFromMagicRequest$State;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class Method$Companion$method$55 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$55 b = new Method$Companion$method$55(1, 0, y.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        PassportEnvironmentImpl passportEnvironmentImpl = (PassportEnvironmentImpl) g.G.b(bundle);
        String string = bundle.getString("track-id");
        if (string == null) {
            ny61.r("can't get required string track-id");
            return null;
        }
        Parcelable e = oo31.e(bundle, com.yandex.passport.internal.util.p.class, "track_from_magic_state");
        if (e != null) {
            return new y(passportEnvironmentImpl, string, (GetTrackFromMagicRequest$State) e);
        }
        ny61.r("can't get required parcelable track_from_magic_state");
        return null;
    }
}
