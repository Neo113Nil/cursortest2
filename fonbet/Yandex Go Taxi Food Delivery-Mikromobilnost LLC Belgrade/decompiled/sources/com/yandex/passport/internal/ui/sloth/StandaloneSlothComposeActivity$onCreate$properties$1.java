package com.yandex.passport.internal.ui.sloth;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vng;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class StandaloneSlothComposeActivity$onCreate$properties$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        ((z) this.receiver).getClass();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(bundle, StandaloneSlothProperties.class, StandaloneSlothProperties.KEY_STANDALONE_SLOTH_PROPERTIES) : bundle.getParcelable(StandaloneSlothProperties.KEY_STANDALONE_SLOTH_PROPERTIES);
        if (parcelable != null) {
            return (StandaloneSlothProperties) parcelable;
        }
        ny61.r("can't get required parcelable StandaloneSlothProperties");
        return null;
    }
}
