package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.vkontakte.android.R;

/* compiled from: VerificationSberSettings.kt */
/* loaded from: classes4.dex */
public final class hnr0 extends m2h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d = "openid mobile name gender birthdate verified";

    public hnr0(Context context) {
        Bundle a = gnj.a(context);
        this.a = sxc0.c(a, "com.vk.oauth.sber.VERIFICATION_CLIENT_ID");
        this.b = sxc0.c(a, "com.vk.oauth.sberid.VERIFICATION_CLIENT_ID");
        this.c = new Uri.Builder().scheme(sxc0.c(a, "com.vk.oauth.sber.VERIFICATION_DEEPLINK_SCHEME")).authority(context.getString(R.string.vk_sber_deeplink_host)).build().toString();
    }

    @Override // xsna.m2h0
    public final String a() {
        return this.c;
    }

    @Override // xsna.m2h0
    public final String b() {
        return this.a;
    }

    @Override // xsna.m2h0
    public final String c() {
        return this.b;
    }

    @Override // xsna.m2h0
    public final String d() {
        return this.d;
    }
}
