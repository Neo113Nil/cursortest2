package defpackage;

import android.os.Bundle;

/* loaded from: classes10.dex */
public abstract class f4f {
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final vbb d;

    public f4f(String str, Bundle bundle, Bundle bundle2, vbb vbbVar) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = vbbVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
