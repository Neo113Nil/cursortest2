package defpackage;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class d6f extends f4f {
    public final String e;
    public final String f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d6f(String str, String str2) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", r2, new Bundle(), r0);
        vbb vbbVar = new vbb(str, (String) null);
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str);
        bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str2);
        this.e = str;
        this.f = str2;
        if (str2.length() > 0) {
            return;
        }
        ny61.g("password should not be empty");
        throw null;
    }
}
