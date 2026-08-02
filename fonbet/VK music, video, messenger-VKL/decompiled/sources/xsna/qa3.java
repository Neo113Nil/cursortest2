package xsna;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class qa3 {

    @NonNull
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;

    @Nullable
    public final PendingIntent g;

    @Nullable
    public final PendingIntent h;
    public boolean i = false;

    public qa3(@NonNull String str, int i, int i2, int i3, long j, long j2, long j3, long j4, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4, HashMap hashMap) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = pendingIntent;
        this.h = pendingIntent2;
    }

    @Nullable
    public final PendingIntent a(zr01 zr01Var) {
        PendingIntent pendingIntent;
        int i = zr01Var.a;
        if (i == 0) {
            PendingIntent pendingIntent2 = this.h;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i != 1 || (pendingIntent = this.g) == null) {
            return null;
        }
        return pendingIntent;
    }
}
