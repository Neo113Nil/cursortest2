package defpackage;

import android.content.Context;
import java.util.UUID;

/* loaded from: classes.dex */
public final class kpr0 {
    public static final j0d b;
    public final Context a;

    static {
        g0d b2 = j0d.b(kpr0.class);
        b2.a(vwi.b(qk20.class));
        b2.a(vwi.b(Context.class));
        b2.g = new e1d() { // from class: anb1
            @Override // defpackage.e1d
            public final Object k(yuf0 yuf0Var) {
                return new kpr0((Context) yuf0Var.a(Context.class));
            }
        };
        b = b2.c();
    }

    public kpr0(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        String string = this.a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
