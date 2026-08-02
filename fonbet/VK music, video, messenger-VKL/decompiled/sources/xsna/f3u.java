package xsna;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class f3u {
    public final String a;

    @Nullable
    public final String b;

    public f3u(@NonNull String str, @Nullable String str2) {
        exc0.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        this.b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public final void a(@NonNull String str) {
        String str2;
        if (!Log.isLoggable(this.a, 5) || (str2 = this.b) == null) {
            return;
        }
        str2.concat(str);
    }
}
