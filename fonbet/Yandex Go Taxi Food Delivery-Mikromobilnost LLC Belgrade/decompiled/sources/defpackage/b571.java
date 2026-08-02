package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class b571 {
    public final d881 a;
    public final ge71 b;
    public boolean c;
    public boolean d;
    public boolean e;

    public b571(Context context, d881 d881Var, v981 v981Var) {
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        this.a = d881Var;
        this.b = b;
        this.c = true;
        this.d = true;
        this.e = true;
    }

    public final void a(String str) {
        HashMap h = b.h(new Pair("event_type", str));
        this.b.c(new zj71("multibanner_event", new LinkedHashMap(h), this.a.i));
    }
}
