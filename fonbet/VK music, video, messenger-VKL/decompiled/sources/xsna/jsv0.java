package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.vk.superapp.verification.account.VerificationFlow;
import com.vkontakte.android.R;

/* compiled from: VkTinkoffVerificationActivityDeps.kt */
/* loaded from: classes4.dex */
public final class jsv0 extends isv0 {
    public final bpn0 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jsv0(Context context, VerificationFlow verificationFlow) {
        super(context, new gc4(sxc0.c(r0, "com.vk.oauth.tinkoff.VERIFICATION_CLIENT_ID"), new Uri.Builder().scheme(sxc0.c(r0, "com.vk.oauth.tinkoff.VERIFICATION_DEEPLINK_SCHEME")).authority(context.getString(R.string.vk_tinkoff_deeplink_host)).build().toString()));
        Bundle a = gnj.a(context);
        this.h = new bpn0(new yy0(context, this, verificationFlow, 12));
    }

    @Override // xsna.isv0
    public final syo0 b() {
        return (syo0) this.h.getValue();
    }
}
