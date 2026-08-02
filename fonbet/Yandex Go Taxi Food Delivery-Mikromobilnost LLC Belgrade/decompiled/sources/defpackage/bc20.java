package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class bc20 implements ped0 {
    public static final Pair e = new Pair("transport", "metrica");
    public final rgo a;
    public final pcj b;
    public final w8o c;
    public final b3u0 d;

    public bc20(rgo rgoVar, pcj pcjVar, w8o w8oVar, b3u0 b3u0Var) {
        this.a = rgoVar;
        this.b = pcjVar;
        this.c = w8oVar;
        this.d = b3u0Var;
    }

    @Override // defpackage.ped0
    public final void a() {
        w8o w8oVar = this.c;
        if (w8oVar != null) {
            w8oVar.a();
        }
    }

    @Override // defpackage.ped0
    public final void b(tbd0 tbd0Var) {
        Map f;
        String str = tbd0Var.b;
        sbd0 sbd0Var = tbd0Var.c;
        int i = zb20.a[tbd0Var.a.ordinal()];
        if (i == 1 || i == 2) {
            boolean z = sbd0Var instanceof qbd0;
            rgo rgoVar = this.a;
            if (z) {
                if (rgoVar != null) {
                    rgoVar.reportEvent(str, ((qbd0) sbd0Var).a);
                    return;
                }
                return;
            } else if (!(sbd0Var instanceof rbd0)) {
                w511.b();
                return;
            } else {
                if (rgoVar != null) {
                    rgoVar.reportEvent(str, ((rbd0) sbd0Var).a());
                    return;
                }
                return;
            }
        }
        if (i == 3) {
            pcj pcjVar = this.b;
            if (pcjVar == null) {
                return;
            }
            if (sbd0Var instanceof qbd0) {
                f = ((qbd0) sbd0Var).a;
                if (f == null) {
                    f = b.f();
                }
            } else if (!(sbd0Var instanceof rbd0)) {
                w511.b();
                return;
            } else {
                String a = ((rbd0) sbd0Var).a();
                Map z2 = a != null ? g8e.z("value", a) : null;
                f = z2 == null ? b.f() : z2;
            }
            pcjVar.reportDiagnosticEvent(str, b.o(f, e));
            return;
        }
        if (i == 4) {
            Throwable th = tbd0Var.d;
            boolean z3 = sbd0Var instanceof qbd0;
            w8o w8oVar = this.c;
            if (z3) {
                if (w8oVar != null) {
                    w8oVar.reportError(str, null, th);
                    return;
                }
                return;
            } else if (!(sbd0Var instanceof rbd0)) {
                w511.b();
                return;
            } else {
                if (w8oVar != null) {
                    w8oVar.reportError(str, ((rbd0) sbd0Var).a(), th);
                    return;
                }
                return;
            }
        }
        if (i != 5) {
            w511.b();
            return;
        }
        boolean z4 = sbd0Var instanceof qbd0;
        b3u0 b3u0Var = this.d;
        if (z4) {
            if (b3u0Var != null) {
                b3u0Var.reportStatboxEvent(str, ((qbd0) sbd0Var).a);
            }
        } else if (!(sbd0Var instanceof rbd0)) {
            w511.b();
        } else if (b3u0Var != null) {
            b3u0Var.reportStatboxEvent(str, ((rbd0) sbd0Var).a());
        }
    }
}
