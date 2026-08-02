package xsna;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
/* loaded from: classes12.dex */
public final class g501 implements Callable<Long> {
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Long d;

    public g501(SharedPreferences sharedPreferences, String str, Long l) {
        this.b = sharedPreferences;
        this.c = str;
        this.d = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Long call() throws Exception {
        return Long.valueOf(this.b.getLong(this.c, this.d.longValue()));
    }
}
