package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.xplat.payment.sdk.MobileBackendInvalidAuthorizationError;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class nf4 {
    public final Context a;
    public final Payer b;
    public final boolean c;
    public final boolean d;
    public final rwo e;
    public String f;

    public nf4(Context context, Payer payer, boolean z, boolean z2, rwo rwoVar) {
        this.a = context;
        this.b = payer;
        this.c = z;
        this.d = z2;
        this.e = rwoVar;
    }

    public final m9 a() {
        String str = this.f;
        this.f = null;
        if (this.c && str == null) {
            return zmx.c(new MobileBackendInvalidAuthorizationError("Mobile backend invalid authorization error: Token drop failure - \"Current exchanged Oauth token is not set\""));
        }
        if (str == null) {
            return zmx.d(Boolean.FALSE);
        }
        cn90 b = np90.b();
        if (b == null) {
            return zmx.c(new MobileBackendInvalidAuthorizationError("Mobile backend invalid authorization error: Token drop failure - \"Failed to perform Oauth token drop due to the missing \\\"passport\\\" library dependency.\nPlease, make sure that it is provided in your .gradle file.\n\""));
        }
        y4r0 b2 = zmx.b(new u5(this, b, str));
        ((y22) this.e).b(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Авторизационный токен недействителен", "drop_oauth_token"), b2);
        return b2;
    }

    public final md51 b() {
        Payer payer = this.b;
        return ymx.j(ooa1.d(hnb1.b(payer.getOauthToken(), payer.getUid())), new j24(1, this), null, 5);
    }
}
