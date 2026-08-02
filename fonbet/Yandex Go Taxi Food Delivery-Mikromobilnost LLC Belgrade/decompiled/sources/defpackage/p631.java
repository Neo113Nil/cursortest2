package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class p631 implements o631 {
    public final czf0 a;
    public final jv2 b;

    public p631(czf0 czf0Var, jv2 jv2Var) {
        this.a = czf0Var;
        this.b = jv2Var;
    }

    @Override // defpackage.o631
    public final void a(long j, String str) {
        this.a.getClass();
        czf0.a(j, str);
        l(j, str);
    }

    @Override // defpackage.o631
    public final void b(long j, String str) {
        this.a.getClass();
        czf0.a(j, str);
        l(j, str);
    }

    @Override // defpackage.o631
    public final void c(long j, String str) {
        this.a.getClass();
        czf0.a(j, str);
        l(j, str);
    }

    @Override // defpackage.o631
    public final void d(long j, String str) {
        this.a.getClass();
        czf0.a(j, str);
        l(j, str);
    }

    @Override // defpackage.o631
    public final void e(long j, String str) {
        this.a.getClass();
        czf0.a(j, str);
        l(j, str);
    }

    @Override // defpackage.o631
    public final void f(int i, String str) {
        this.a.getClass();
        jst.e.getClass();
        ffx.Q(str).b(100 - i);
        l(i, str);
    }

    @Override // defpackage.o631
    public final void g(long j, String str) {
        this.a.getClass();
        czf0.a(j, str);
        l(j, str);
    }

    @Override // defpackage.o631
    public final void h(long j, String str) {
        this.a.getClass();
        czf0.a(j, str);
        l(j, str);
    }

    @Override // defpackage.o631
    public final void i(long j, String str) {
        this.a.getClass();
        czf0.a(j, str);
        l(j, str);
    }

    @Override // defpackage.o631
    public final void j(long j, String str) {
        this.a.getClass();
        czf0.a(j, str);
        l(j, str);
    }

    @Override // defpackage.o631
    public final void k(long j, String str) {
        this.a.getClass();
        czf0.a(j, str);
        l(j, str);
    }

    public final void l(long j, String str) {
        List W;
        W = evu0.W(str, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        String str2 = (String) a.R(W);
        if (str2 != null) {
            str = str2;
        }
        String o = g8e.o("BDUI.Perf.", str);
        if (cvu0.x(o, "BDUI.Perf.", false) && jl40.l(a.b0(W), "Relative")) {
            return;
        }
        List q0 = a.q0(a.J(W, 1));
        c cVar = new c(gw00.e(new Pair("value", qcx.b(Long.valueOf(j)))));
        Iterator it = q0.iterator();
        while (it.hasNext()) {
            cVar = new c(gw00.e(new Pair((String) it.next(), cVar)));
        }
        this.b.a(o, cVar);
    }
}
