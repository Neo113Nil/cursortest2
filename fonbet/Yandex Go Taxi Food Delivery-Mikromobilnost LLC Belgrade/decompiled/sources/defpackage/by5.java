package defpackage;

import android.os.Build;
import android.text.TextUtils;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public class by5 {
    public CharSequence a = null;
    public CharSequence b = null;
    public boolean c = true;
    public int d = 0;

    public final cy5 a() {
        if (TextUtils.isEmpty(this.a)) {
            ny61.g("Title must be set and non-empty.");
            return null;
        }
        if (!p1b1.e(this.d)) {
            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(Extension.COLON_SPACE);
            int i = this.d;
            sb.append(i != 15 ? i != 255 ? i != 32768 ? i != 32783 ? i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = this.d;
        boolean d = i2 != 0 ? p1b1.d(i2) : false;
        if (TextUtils.isEmpty(this.b) && !d) {
            ny61.g("Negative text must be set and non-empty.");
            return null;
        }
        if (TextUtils.isEmpty(this.b) || !d) {
            return new cy5(this.d, this.a, this.b, this.c);
        }
        ny61.g("Negative text must not be set if device credential authentication is allowed.");
        return null;
    }
}
