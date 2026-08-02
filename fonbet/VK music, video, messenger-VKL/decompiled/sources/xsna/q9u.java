package xsna;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.credentials.CustomCredential;

/* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.0 */
/* loaded from: classes13.dex */
public final class q9u extends CustomCredential {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q9u(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, Uri uri, String str6) {
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", r0);
        Bundle b = qr.b("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        b.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        b.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        b.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        b.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        b.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
    }
}
