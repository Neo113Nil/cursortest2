package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import com.yandex.messaging.data.e;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class o150 {
    public final lqo a;
    public final e b;
    public final ike c;
    public final boolean d;
    public boolean e;
    public final LinkedHashMap f = new LinkedHashMap();

    public o150(wff0 wff0Var, vse vseVar, lqo lqoVar, SharedPreferences sharedPreferences, Looper looper, e eVar) {
        this.a = lqoVar;
        this.b = eVar;
        this.c = vseVar.c(true);
        this.d = sharedPreferences.getBoolean("key_user_seen_banner_or_itself", false);
        wff0Var.a(new fn3(10, this));
    }
}
