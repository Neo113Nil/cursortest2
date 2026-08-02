package xsna;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
/* loaded from: classes12.dex */
public final class r601 implements Callable<String> {
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public r601(SharedPreferences sharedPreferences, String str, String str2) {
        this.b = sharedPreferences;
        this.c = str;
        this.d = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        return this.b.getString(this.c, this.d);
    }
}
