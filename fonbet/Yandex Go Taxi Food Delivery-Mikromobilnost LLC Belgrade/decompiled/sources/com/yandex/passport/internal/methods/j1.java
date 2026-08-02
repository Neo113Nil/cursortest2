package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.entities.TrackId;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.oo31;
import defpackage.scc;
import defpackage.xfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class j1 extends x2 {
    public final f3 b;
    public final h3 c;
    public final List d;
    public final com.yandex.passport.biometric.ui.verification.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(Bundle bundle) {
        super(MethodRef.GetOtpByTrack);
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        Parcelable e = oo31.e(bundle, com.yandex.passport.internal.util.p.class, "track_id");
        if (e == null) {
            xfo.g("can't get required parcelable track_id");
            throw null;
        }
        f3 f3Var = new f3(passportUidImpl);
        h3 h3Var = new h3((TrackId) e);
        this.b = f3Var;
        this.c = h3Var;
        this.d = scc.g(f3Var, h3Var);
        this.e = new com.yandex.passport.biometric.ui.verification.a(3, "otp");
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.e;
    }
}
