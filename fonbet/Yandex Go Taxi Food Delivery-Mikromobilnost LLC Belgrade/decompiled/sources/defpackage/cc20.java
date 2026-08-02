package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.superapp.order.multi.old.provider.g;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class cc20 {
    public final Object a;
    public volatile Serializable b;

    public cc20(Context context) {
        this.a = context.getSharedPreferences("metrica_settings", 0);
    }

    public boolean a() {
        Boolean bool = (Boolean) this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = ((SharedPreferences) this.a).getBoolean("com.yandex.plus.metrica_logs_enabled", false);
        this.b = Boolean.valueOf(z);
        return z;
    }

    public cc20(g gVar) {
        this.a = gVar;
    }
}
