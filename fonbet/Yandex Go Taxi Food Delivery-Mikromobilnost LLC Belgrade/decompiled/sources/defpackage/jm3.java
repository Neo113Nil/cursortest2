package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.yandex.messenger.websdk.api.Authentication;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class jm3 implements Authentication {
    public final vh60 a;
    public final vit b;
    public final ew2 c;
    public volatile String d;
    public final wk2 e;
    public final Handler f;
    public final HashSet g;

    public jm3(qh41 qh41Var) {
        Looper looper = (Looper) qh41Var.n.getValue();
        this.a = (vh60) qh41Var.m.getValue();
        SharedPreferences sharedPreferences = (SharedPreferences) qh41Var.o.getValue();
        this.b = new vit(qh41Var);
        ew2 ew2Var = qh41Var.r;
        this.c = ew2Var;
        this.e = new wk2(sharedPreferences, ew2Var);
        new Handler(Looper.getMainLooper());
        this.f = new Handler(looper);
        this.g = new HashSet();
    }

    public final void a() {
        if (this.d == null) {
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((xdb) it.next()).a();
        }
    }

    public final void b() {
        jl40.m();
        this.c.b("wm_auth_token_reset");
        jl40.m();
        this.d = null;
        a();
        wk2 wk2Var = this.e;
        if ((wk2Var.d + 2592000000L > System.currentTimeMillis() ? wk2Var.c : null) != null) {
            vh60 vh60Var = this.a;
            vh60Var.i.post(new ssu(15, vh60Var));
        }
    }

    public final void c(String str) {
        jl40.m();
        String concat = "OAuth ".concat(str);
        this.c.c("wm_auth_token_set", gw00.e(new Pair("isNew", Boolean.valueOf(!jl40.l(this.d, concat)))));
        if (jl40.l(this.d, concat)) {
            return;
        }
        jl40.m();
        this.d = concat;
        a();
        vh60 vh60Var = this.a;
        vh60Var.i.post(new ssu(15, vh60Var));
    }
}
