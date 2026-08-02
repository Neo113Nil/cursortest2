package com.yandex.passport.internal.ui.domik.samlsso;

import android.net.Uri;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.util.l;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class g extends com.yandex.passport.internal.ui.domik.base.b {
    public final LoginProperties B;
    public final com.yandex.passport.internal.network.client.c C;
    public final com.yandex.passport.internal.usecase.authorize.b D;
    public final f E;
    public Uri F;
    public AuthTrack G;
    public final l H = new l();
    public final l I = new l();

    public g(LoginProperties loginProperties, com.yandex.passport.internal.e eVar, com.yandex.passport.internal.network.client.c cVar, com.yandex.passport.internal.usecase.authorize.b bVar, f fVar) {
        this.B = loginProperties;
        this.C = cVar;
        this.D = bVar;
        this.E = fVar;
        new Locale(eVar.a());
    }
}
