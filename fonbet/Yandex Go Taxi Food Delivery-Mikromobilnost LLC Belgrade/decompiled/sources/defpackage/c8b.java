package defpackage;

import androidx.room.util.a;
import kotlin.Pair;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class c8b {
    public final kse a;
    public final k020 b;
    public final to3 c;
    public final o1b0 d;
    public final eil0 e;
    public final meb f;
    public boolean g;

    public c8b(kse kseVar, k020 k020Var, to3 to3Var, o1b0 o1b0Var, eil0 eil0Var, at2 at2Var) {
        this.a = kseVar;
        this.b = k020Var;
        this.c = to3Var;
        this.d = o1b0Var;
        this.e = eil0Var;
        this.f = at2Var.Y();
    }

    public final void a(String str) {
        kse.a(this.a);
        if (this.g) {
            return;
        }
        this.e.b("tech_refresh_chat", gw00.e(new Pair(CRLReasonCodeExtension.REASON, str)));
        this.g = true;
        String str2 = this.d.b;
        c29 c29Var = new c29(18, this);
        to3 to3Var = this.c;
        to3Var.a.a(new io3(6, to3Var, new String[]{str2}, c29Var));
    }

    public final void b() {
        kse.a(this.a);
        l020 C = this.b.C();
        try {
            C.B.f(this.d.a);
            C.s();
            C.close();
        } finally {
        }
    }

    public final void c() {
        kse.a(this.a);
        s2b s2bVar = (s2b) a.b(this.f.a, true, false, new b5a(this.d.b, 19));
        if (s2bVar != null) {
            long j = s2bVar.a;
            if (j > 0 && s2bVar.b >= j) {
                return;
            }
        }
        a("full_info_outdated");
    }
}
