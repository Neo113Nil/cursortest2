package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes15.dex */
public final class h4g0 {
    public final jn3 a;
    public final w3c b;
    public final SharedPreferences c;
    public final SharedPreferences d;
    public final x22 e;
    public final vjx f;

    public h4g0(jn3 jn3Var, w3c w3cVar, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, Looper looper, x22 x22Var) {
        this.a = jn3Var;
        this.b = w3cVar;
        this.c = sharedPreferences;
        this.d = sharedPreferences2;
        this.e = x22Var;
        this.f = new vjx(new Handler(looper), sharedPreferences);
    }
}
