package xsna;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class h3r0 {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static h3r0 d;
    public final yfb a;

    public h3r0(yfb yfbVar) {
        this.a = yfbVar;
    }

    public final boolean a(@NonNull com.google.firebase.installations.local.a aVar) {
        if (TextUtils.isEmpty(aVar.d)) {
            return true;
        }
        long j = aVar.f + aVar.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
