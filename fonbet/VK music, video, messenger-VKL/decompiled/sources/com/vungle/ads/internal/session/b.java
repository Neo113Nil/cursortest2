package com.vungle.ads.internal.session;

import android.content.Context;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.internal.executor.d;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.m;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.de;
import xsna.dqv;
import xsna.fpf0;
import xsna.j8y;
import xsna.li0;
import xsna.n9y;
import xsna.s1v;
import xsna.to2;
import xsna.wcy;

/* loaded from: classes7.dex */
public final class b {
    public static final j8y f = n9y.a(a.a);
    public final String a;
    public final com.vungle.ads.internal.executor.a b;
    public File c;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public boolean e;

    public b(Context context, String str, com.vungle.ads.internal.executor.a aVar, PathProvider pathProvider) {
        Object failure;
        this.a = str;
        this.b = aVar;
        this.c = pathProvider.b();
        boolean z = true;
        if (!this.c.exists()) {
            try {
                failure = Boolean.valueOf(this.c.createNewFile());
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                boolean z2 = u.a;
                StringBuilder a2 = l.a("Fail to create unclosed ad file: ");
                a2.append(a.getMessage());
                t.b("UnclosedAdDetector", a2.toString());
            }
            z = true ^ (failure instanceof Result.Failure);
        }
        this.e = z;
    }

    public final void a(r3 r3Var) {
        if (this.e) {
            r3Var.a(this.a);
            this.d.add(r3Var);
            a(this.d);
        }
    }

    public final void b(r3 r3Var) {
        if (this.e && this.d.contains(r3Var)) {
            this.d.remove(r3Var);
            a(this.d);
        }
    }

    public final List a() {
        if (!this.e) {
            return EmptyList.b;
        }
        return (List) new com.vungle.ads.internal.executor.b(((d) this.b).c().submit(new dqv(this, 1))).get(1000L, TimeUnit.MILLISECONDS);
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        if (!this.e) {
            return arrayList;
        }
        List a = a();
        if (a != null) {
            arrayList.addAll(a);
        }
        ((d) this.b).a.execute(new to2(this, 17));
        return arrayList;
    }

    public static final void b(b bVar) {
        try {
            n.b(bVar.c);
        } catch (Exception e) {
            boolean z = u.a;
            StringBuilder a = l.a("Fail to delete file ");
            a.append(e.getMessage());
            t.b("UnclosedAdDetector", a.toString());
        }
    }

    public static final List a(b bVar) {
        try {
            m mVar = n.a;
            String d = n.d(bVar.c);
            if (d != null && d.length() != 0) {
                j8y j8yVar = f;
                de deVar = j8yVar.b;
                int i = wcy.c;
                return (List) j8yVar.a(s1v.p(deVar, fpf0.f(wcy.a.a(fpf0.d(r3.class)))), d);
            }
            return new ArrayList();
        } catch (Exception e) {
            boolean z = u.a;
            StringBuilder a = l.a("Fail to read unclosed ad file ");
            a.append(e.getMessage());
            t.b("UnclosedAdDetector", a.toString());
            return new ArrayList();
        }
    }

    public final void a(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (this.e) {
            try {
                j8y j8yVar = f;
                de deVar = j8yVar.b;
                int i = wcy.c;
                ((d) this.b).c().execute(new li0(8, this, j8yVar.b(s1v.p(deVar, fpf0.f(wcy.a.a(fpf0.d(r3.class)))), copyOnWriteArrayList)));
            } catch (Throwable th) {
                boolean z = u.a;
                StringBuilder a = l.a("Fail to write unclosed ad file ");
                a.append(th.getMessage());
                t.b("UnclosedAdDetector", a.toString());
            }
        }
    }

    public static final void a(b bVar, String str) {
        m mVar = n.a;
        n.a(bVar.c, str);
    }
}
