package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Result;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class gv2 implements oo, vp2 {
    public final av2 a;
    public final wu2 b;
    public final w5 c;
    public final Context d;
    public final xy e = xy.c;

    public gv2(Context context, av2 av2Var, wu2 wu2Var, w5 w5Var) {
        this.a = av2Var;
        this.b = wu2Var;
        this.c = w5Var;
        this.d = context.getApplicationContext();
    }

    @Override // yads.uq2
    public final void a(mn3 mn3Var) {
        this.c.a(v5.m);
        wu2 wu2Var = this.b;
        xy xyVar = this.e;
        if (wu2Var.a.isActive()) {
            wu2Var.a.resumeWith(new jv2(mn3Var, xyVar));
        }
    }

    @Override // yads.vp2
    public final void b() {
        this.c.a(v5.l);
        this.c.a(v5.m, null);
    }

    @Override // yads.vq2
    public final void a(Object obj) {
        HashSet hashSet;
        Object failure;
        qu2 qu2Var = (qu2) obj;
        av2 av2Var = this.a;
        Context context = this.d;
        av2Var.getClass();
        synchronized (av2.b) {
            hashSet = new HashSet(av2Var.a.keySet());
            gx2.a().a(context, qu2Var);
            s3q0 s3q0Var = s3q0.a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ru2 ru2Var = (ru2) it.next();
            boolean z = !ru2Var.a.a.b(context);
            if (ru2Var.b.a.b()) {
                try {
                    AppMetricaLibraryAdapter.setAdvIdentifiersTracking(z);
                    failure = s3q0.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Result.a(failure);
            }
        }
        this.c.a(v5.m);
        wu2 wu2Var = this.b;
        xy xyVar = this.e;
        if (wu2Var.a.isActive()) {
            wu2Var.a.resumeWith(new kv2(qu2Var, xyVar));
        }
    }
}
