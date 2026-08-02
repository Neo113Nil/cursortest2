package xsna;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
/* loaded from: classes12.dex */
public final class qsz0 implements Callable<Boolean> {
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Boolean d;

    public qsz0(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.b = sharedPreferences;
        this.c = str;
        this.d = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        return Boolean.valueOf(this.b.getBoolean(this.c, this.d.booleanValue()));
    }
}
