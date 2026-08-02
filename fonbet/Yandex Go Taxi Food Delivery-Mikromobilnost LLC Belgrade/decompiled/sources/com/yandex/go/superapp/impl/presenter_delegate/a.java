package com.yandex.go.superapp.impl.presenter_delegate;

import android.net.Uri;
import com.yandex.go.superapp.model.Action;
import defpackage.a1p;
import defpackage.dke;
import defpackage.eh70;
import defpackage.evu0;
import defpackage.g1p;
import defpackage.jfn;
import defpackage.jhd;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k3p;
import defpackage.l3p;
import defpackage.m3p;
import defpackage.n3p;
import defpackage.o3p;
import defpackage.rnc;
import defpackage.tje;
import defpackage.w511;
import defpackage.xby;
import defpackage.y3p;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import ru.yandex.taxi.eatskit.Controller$State;

/* loaded from: classes14.dex */
public final class a {
    public final y3p a;
    public final ru.yandex.taxi.eatskit.c b;
    public final g1p c;

    public a(y3p y3pVar, ru.yandex.taxi.eatskit.c cVar, g1p g1pVar) {
        this.a = y3pVar;
        this.b = cVar;
        this.c = g1pVar;
    }

    public final void a() {
        List list;
        y3p y3pVar = this.a;
        o3p o3pVar = y3pVar.a;
        o3p o3pVar2 = y3pVar.b;
        try {
            boolean l = jl40.l(o3pVar, o3pVar2);
            ru.yandex.taxi.eatskit.c cVar = this.b;
            if (l) {
                if (!cVar.m && o3pVar2.a == Action.SHOW_ORDER) {
                    eh70 eh70Var = o3pVar2.c;
                    cVar.w = eh70Var != null ? new jfn(eh70Var.a, eh70Var.b) : null;
                }
                if (o3pVar == o3pVar2) {
                    return;
                } else {
                    list = o3pVar.e;
                }
            } else {
                Action action = o3pVar2.a;
                if ((action == Action.SHOW_RELATIVE_PATH || action == Action.FORCE_RELATIVE_PATH) && o3pVar.a != action) {
                    g1p g1pVar = this.c;
                    tje.N(g1pVar.c, null, null, new ExternalServiceCommonHeadersDelegateImpl$reloadWithHeaders$1(g1pVar, null), 3);
                }
                Action action2 = o3pVar.a;
                String str = o3pVar.d;
                int i = a1p.a[action2.ordinal()];
                if (i == 1) {
                    eh70 eh70Var2 = o3pVar.c;
                    cVar.w = eh70Var2 != null ? new jfn(eh70Var2.a, eh70Var2.b) : null;
                } else if (i == 2) {
                    cVar.i = null;
                    cVar.r(null, false);
                } else if (i != 3) {
                    if (i == 4) {
                        c(str);
                    } else if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!jl40.l(str, o3pVar2.d)) {
                    c(str);
                }
                if (o3pVar == o3pVar2) {
                    return;
                } else {
                    list = o3pVar.e;
                }
            }
            b(list);
            y3pVar.b = o3pVar;
        } catch (Throwable th) {
            if (o3pVar != o3pVar2) {
                b(o3pVar.e);
                y3pVar.b = o3pVar;
            }
            throw th;
        }
    }

    public final void b(List list) {
        ru.yandex.taxi.eatskit.internal.e eVar = this.b.q;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k3p k3pVar = (k3p) it.next();
            if (k3pVar instanceof n3p) {
                eVar.a(new ru.yandex.taxi.eatskit.internal.d(((n3p) k3pVar).a));
            } else if (k3pVar instanceof l3p) {
                eVar.a(new ru.yandex.taxi.eatskit.internal.d(((l3p) k3pVar).a));
            } else if (!(k3pVar instanceof m3p)) {
                w511.b();
                return;
            } else {
                m3p m3pVar = (m3p) k3pVar;
                eVar.a(new ru.yandex.taxi.eatskit.internal.c(m3pVar.a, m3pVar.b));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str) {
        String str2;
        Object failure;
        Throwable a;
        Uri parse;
        if (str == null || evu0.J(str)) {
            str2 = null;
        } else {
            try {
                parse = Uri.parse(str);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                failure = new Result.Failure(e2);
            }
            if (parse.getPathSegments().isEmpty()) {
                if (parse.getQueryParameterNames().isEmpty()) {
                    failure = null;
                    a = Result.a(failure);
                    if (a != null) {
                        xby.l(jst.e, "EATSKIT:ACTION:LOAD", null, a, "Incorrect relativePath: ".concat(str), 2);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    str2 = (String) failure;
                }
            }
            failure = str;
            a = Result.a(failure);
            if (a != null) {
            }
            if (failure instanceof Result.Failure) {
            }
            str2 = (String) failure;
        }
        if (str2 == null) {
            str2 = "/";
        }
        ru.yandex.taxi.eatskit.c cVar = this.b;
        cVar.g = null;
        cVar.i = str2;
        jhd jhdVar = new jhd(14, cVar, str2);
        cVar.u(Controller$State.LOADING);
        ((rnc) cVar.b.a).i(false, new dke(2, cVar, jhdVar));
    }
}
