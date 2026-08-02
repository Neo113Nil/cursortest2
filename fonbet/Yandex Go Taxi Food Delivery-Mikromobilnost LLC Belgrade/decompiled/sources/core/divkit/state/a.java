package core.divkit.state;

import android.os.Handler;
import android.os.Looper;
import defpackage.c231;
import defpackage.d6x;
import defpackage.gtq0;
import defpackage.h5x;
import defpackage.i5x;
import defpackage.j5x;
import defpackage.j6x;
import defpackage.k6x;
import defpackage.m5x;
import defpackage.o6x;
import defpackage.u131;
import defpackage.v4x;
import defpackage.v6x;
import defpackage.w4x;
import defpackage.w511;
import defpackage.x131;
import defpackage.y131;
import defpackage.ycc;
import defpackage.yuf0;
import defpackage.z131;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class a {
    public final k6x a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final yuf0 c;
    public j6x d;
    public boolean e;
    public d6x f;

    public a(k6x k6xVar, com.yandex.div.core.expression.variables.a aVar) {
        this.a = k6xVar;
        this.c = new yuf0(aVar, new DivkitStateDaemon$context$1(1, this, a.class, "updateState", "updateState(Lcom/yandex/div/data/Variable;)V", 0));
    }

    public static void a(yuf0 yuf0Var, j5x j5xVar, ArrayList arrayList) {
        if (j5xVar instanceof m5x) {
            b(yuf0Var, (m5x) j5xVar, arrayList);
            return;
        }
        if (j5xVar instanceof v4x) {
            int i = 0;
            for (j5x j5xVar2 : ((v4x) j5xVar).a) {
                arrayList.add(Integer.valueOf(i));
                a(yuf0Var, j5xVar2, arrayList);
                ycc.z(arrayList);
                i++;
            }
            return;
        }
        if (j5xVar instanceof o6x) {
            String str = ((o6x) j5xVar).a;
            c231 c231Var = (c231) ((LinkedHashMap) yuf0Var.d).get(arrayList);
            if (!(c231Var instanceof z131)) {
                yuf0Var.C(arrayList, new z131(c(arrayList), str));
                return;
            } else {
                ((z131) c231Var).g(str);
                yuf0Var.D(c231Var);
                return;
            }
        }
        if (j5xVar instanceof w4x) {
            boolean z = ((w4x) j5xVar).a;
            c231 c231Var2 = (c231) ((LinkedHashMap) yuf0Var.d).get(arrayList);
            if (!(c231Var2 instanceof u131)) {
                yuf0Var.C(arrayList, new u131(c(arrayList), z));
                return;
            } else {
                ((u131) c231Var2).g(String.valueOf(z));
                yuf0Var.D(c231Var2);
                return;
            }
        }
        if (j5xVar instanceof i5x) {
            long j = ((i5x) j5xVar).a;
            c231 c231Var3 = (c231) ((LinkedHashMap) yuf0Var.d).get(arrayList);
            if (!(c231Var3 instanceof y131)) {
                yuf0Var.C(arrayList, new y131(c(arrayList), j));
                return;
            } else {
                ((y131) c231Var3).g(String.valueOf(j));
                yuf0Var.D(c231Var3);
                return;
            }
        }
        if (!(j5xVar instanceof h5x)) {
            w511.b();
            return;
        }
        double d = ((h5x) j5xVar).a;
        c231 c231Var4 = (c231) ((LinkedHashMap) yuf0Var.d).get(arrayList);
        if (!(c231Var4 instanceof x131)) {
            yuf0Var.C(arrayList, new x131(c(arrayList), d));
        } else {
            ((x131) c231Var4).g(String.valueOf(d));
            yuf0Var.D(c231Var4);
        }
    }

    public static void b(yuf0 yuf0Var, m5x m5xVar, ArrayList arrayList) {
        for (Map.Entry entry : m5xVar.a.entrySet()) {
            String str = (String) entry.getKey();
            j5x j5xVar = (j5x) entry.getValue();
            arrayList.add(str);
            a(yuf0Var, j5xVar, arrayList);
            ycc.z(arrayList);
        }
    }

    public static String c(ArrayList arrayList) {
        return kotlin.collections.a.X(arrayList, Extension.DOT_CHAR, "js.", null, null, 60);
    }

    public final void d(d6x d6xVar) {
        if (this.e) {
            this.f = d6xVar;
            return;
        }
        yuf0 yuf0Var = this.c;
        this.e = true;
        v6x m = gtq0.m(d6xVar, "sync-with-divkit");
        try {
            ((LinkedHashSet) yuf0Var.f).addAll(((LinkedHashMap) yuf0Var.c).keySet());
            b(yuf0Var, m.a, new ArrayList());
            yuf0Var.o();
            yuf0Var.n();
            yuf0Var.u();
            this.e = false;
            d6x d6xVar2 = this.f;
            if (d6xVar2 != null) {
                this.f = null;
                if (d6xVar2.equals(d6xVar)) {
                    return;
                }
                d(d6xVar2);
            }
        } catch (Throwable th) {
            yuf0Var.u();
            throw th;
        }
    }
}
