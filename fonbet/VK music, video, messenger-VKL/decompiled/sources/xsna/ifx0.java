package xsna;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: WebAppUiImageBridge.kt */
/* loaded from: classes11.dex */
public final class ifx0 {
    public final bpn0 b;
    public final bpn0 a = new bpn0(new b55(18));
    public final bpn0 c = new bpn0(new qb8(15));
    public final bpn0 d = new bpn0(new k03(23));

    public ifx0(bpn0 bpn0Var) {
        this.b = new bpn0(new cia(bpn0Var, 15));
    }

    public static Intent c(Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(uri != null ? "image/*" : "text/plain");
        intent.setPackage("com.instagram.android");
        if (uri != null) {
            intent.putExtra("android.intent.extra.STREAM", uri);
        }
        if (str.length() > 0) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        intent.addFlags(268435456);
        return intent;
    }

    public final v9r0<View> a() {
        return (v9r0) this.b.getValue();
    }

    public final bcr0<View> b() {
        return (bcr0) this.a.getValue();
    }

    public final ign0 d() {
        return (ign0) this.d.getValue();
    }
}
