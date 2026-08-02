package androidx.work.impl;

import android.content.Context;
import androidx.room.j;
import defpackage.ch20;
import defpackage.dai0;
import defpackage.jog0;
import defpackage.jrj0;
import defpackage.n2x0;
import defpackage.p0c;
import defpackage.r6f0;
import defpackage.t951;
import defpackage.tpx;
import defpackage.u0e;
import defpackage.v201;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {
    public static final b a(Context context, u0e u0eVar) {
        j l;
        t951 t951Var = new t951(u0eVar.c);
        Context applicationContext = context.getApplicationContext();
        n2x0 n2x0Var = u0eVar.d;
        if (context.getResources().getBoolean(jog0.workmanager_test_configuration)) {
            l = new j(applicationContext, WorkDatabase.class, null);
            l.i = true;
        } else {
            l = dai0.l(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            l.h = new tpx(applicationContext);
        }
        l.f = t951Var.a;
        l.d.add(new p0c(n2x0Var));
        l.a(ch20.h);
        l.a(new jrj0(applicationContext, 2, 3));
        l.a(ch20.i);
        l.a(ch20.j);
        l.a(new jrj0(applicationContext, 5, 6));
        l.a(ch20.k);
        l.a(ch20.l);
        l.a(ch20.m);
        l.a(new jrj0(applicationContext));
        l.a(new jrj0(applicationContext, 10, 11));
        l.a(ch20.d);
        l.a(ch20.e);
        l.a(ch20.f);
        l.a(ch20.g);
        l.a(new jrj0(applicationContext, 21, 22));
        l.p = false;
        l.q = true;
        l.r = true;
        WorkDatabase workDatabase = (WorkDatabase) l.b();
        v201 v201Var = new v201(context.getApplicationContext(), t951Var);
        r6f0 r6f0Var = new r6f0(context.getApplicationContext(), u0eVar, t951Var, workDatabase);
        return new b(context.getApplicationContext(), u0eVar, t951Var, workDatabase, (List) WorkManagerImplExtKt$WorkManagerImpl$1.b.invoke(context, u0eVar, t951Var, workDatabase, v201Var, r6f0Var), r6f0Var, v201Var);
    }
}
