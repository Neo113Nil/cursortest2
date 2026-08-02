package defpackage;

import android.net.Uri;

/* loaded from: classes13.dex */
public final class m7z {
    public static zzs a(Uri uri, String str, String str2) {
        Double d = tcb1.d(uri.getQueryParameter(str));
        Double d2 = tcb1.d(uri.getQueryParameter(str2));
        if (d == null || d2 == null) {
            return null;
        }
        return new zzs(d.doubleValue(), d2.doubleValue(), 0, null, null, 28);
    }
}
