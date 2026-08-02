package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import xsna.dzb0;
import xsna.jw5;
import xsna.on00;
import xsna.u69;

/* loaded from: classes10.dex */
public final class bu1 implements jp2 {
    public static final Object e = new Object();
    public final jp2 a;
    public final boolean b;
    public final Executor c;
    public final Lazy d;

    public bu1(gh ghVar, Lazy lazy, boolean z, Executor executor) {
        this.a = ghVar;
        this.b = z;
        this.c = executor;
        this.d = lazy;
    }

    public static void a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), xsna.rl3.u0((Object[]) entry.getValue()));
        }
        linkedHashMap.toString();
    }

    @Override // yads.jp2
    public final void reportAnr(Map map) {
        if (this.a != null) {
            this.c.execute(new xsna.e0(10, this, map));
        }
    }

    @Override // yads.sm0
    public final void reportError(String str, Throwable th) {
        if (!this.b || this.a == null) {
            return;
        }
        this.c.execute(new dzb0(this, str, th, 3));
    }

    @Override // yads.jp2
    public final void reportUnhandledException(Throwable th) {
        if (this.a != null) {
            this.c.execute(new xsna.h0(5, this, th));
        }
    }

    public static void a(String str, Throwable th) {
        Objects.toString(th);
    }

    public static void a(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object[] objArr = {entry.getValue()};
            StringBuilder sb = new StringBuilder(7);
            jw5.d(objArr, sb, new ArrayList());
            linkedHashMap.put(key, sb.toString());
        }
        linkedHashMap.toString();
    }

    public static void a(Throwable th) {
        Objects.toString(th);
    }

    public static final void a(bu1 bu1Var, Map map) {
        try {
            bu1Var.getClass();
            a(map);
            bu1Var.a.reportAnr(map);
        } catch (Throwable unused) {
        }
    }

    public static final void a(bu1 bu1Var, String str, Throwable th) {
        try {
            bu1Var.getClass();
            a(str, th);
            bu1Var.a.reportError(str, th);
        } catch (Throwable unused) {
        }
    }

    @Override // yads.jp2
    public final void a(fp2 fp2Var) {
        if (this.a != null) {
            this.c.execute(new u69(10, this, fp2Var));
        }
    }

    public static final void a(bu1 bu1Var, fp2 fp2Var) {
        try {
            bd3.a((sv3) bu1Var.d.getValue(), fp2Var);
            a(fp2Var.a, fp2Var.b);
            bu1Var.a.a(fp2Var);
        } catch (Throwable unused) {
        }
    }

    public static final void a(bu1 bu1Var, Throwable th) {
        try {
            bu1Var.getClass();
            a(th);
            bu1Var.a.reportUnhandledException(th);
        } catch (Throwable unused) {
        }
    }
}
