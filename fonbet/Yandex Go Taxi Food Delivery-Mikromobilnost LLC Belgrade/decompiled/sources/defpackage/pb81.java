package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import yads.q63;

/* loaded from: classes7.dex */
public final class pb81 {
    public static final ExecutorService d = Executors.newCachedThreadPool(new clo(1, "YandexAds.UrlTracker"));
    public final fe81 a;
    public final v981 b;
    public final Context c;

    public pb81(Context context, fe81 fe81Var, v981 v981Var) {
        this.a = fe81Var;
        this.b = v981Var;
        this.c = context.getApplicationContext();
    }

    public final void a(String str, q63 q63Var, Map map) {
        fp71 fp71Var = new fp71(this.c, this.a, this.b, q63Var);
        if (str.length() > 0) {
            d.execute(new nk61(7, (Object) fp71Var, (Object) map, str));
        }
    }
}
