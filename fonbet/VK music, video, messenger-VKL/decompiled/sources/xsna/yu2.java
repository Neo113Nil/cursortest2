package xsna;

import android.content.Context;

/* compiled from: AnonymousTokenProvider.kt */
/* loaded from: classes.dex */
public final class yu2 implements l6r0 {
    public final mer0 a;

    public yu2(Context context) {
        this.a = new mer0(context, "vk_anonymous_token_prefs");
        new bpn0(new xu2(0));
    }

    @Override // xsna.l6r0
    public final void a(String str) {
        this.a.a.edit().putString("vk_anonymous_token", str).apply();
    }

    @Override // xsna.l6r0
    public final String getToken() {
        String string = this.a.a.getString("vk_anonymous_token", null);
        return string == null ? new String() : string;
    }
}
