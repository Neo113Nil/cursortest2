package xsna;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
/* loaded from: classes12.dex */
public final class g101 implements Callable<Integer> {
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Integer d;

    public g101(SharedPreferences sharedPreferences, String str, Integer num) {
        this.b = sharedPreferences;
        this.c = str;
        this.d = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() throws Exception {
        return Integer.valueOf(this.b.getInt(this.c, this.d.intValue()));
    }
}
