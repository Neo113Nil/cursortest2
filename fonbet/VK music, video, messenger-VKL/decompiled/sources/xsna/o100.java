package xsna;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class o100 {

    @NonNull
    public final String a;
    public final boolean b;
    public final String c;

    public o100(@NonNull String str, @NonNull String str2) {
        exc0.g(str, "The log tag cannot be null or empty.");
        this.a = str;
        this.c = str2;
        this.b = str.length() <= 23;
    }

    public final void a(@NonNull String str, @NonNull Object... objArr) {
        if (!Build.TYPE.equals("user") && this.b && Log.isLoggable(this.a, 3)) {
            c(str, objArr);
        }
    }

    public final void b(@NonNull String str, @NonNull Object... objArr) {
        if (!Build.TYPE.equals("user") && this.b && Log.isLoggable(this.a, 3)) {
            c(str, objArr);
        }
    }

    @NonNull
    public final String c(@NonNull String str, @NonNull Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.c;
        String a = TextUtils.isEmpty(str2) ? "" : zr.a(X3.j.d, str2, "] ");
        return !TextUtils.isEmpty(a) ? a.concat(String.valueOf(str)) : str;
    }
}
