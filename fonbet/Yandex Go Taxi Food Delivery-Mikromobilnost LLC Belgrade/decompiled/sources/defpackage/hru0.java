package defpackage;

import androidx.camera.core.impl.SessionConfig$SessionError;
import androidx.camera.core.j;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final /* synthetic */ class hru0 implements fyq0 {
    public final /* synthetic */ iru0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xi21 d;
    public final /* synthetic */ lru0 e;
    public final /* synthetic */ lru0 f;

    public /* synthetic */ hru0(iru0 iru0Var, String str, String str2, xi21 xi21Var, lru0 lru0Var, lru0 lru0Var2) {
        this.a = iru0Var;
        this.b = str;
        this.c = str2;
        this.d = xi21Var;
        this.e = lru0Var;
        this.f = lru0Var2;
    }

    @Override // defpackage.fyq0
    public final void a(jyq0 jyq0Var, SessionConfig$SessionError sessionConfig$SessionError) {
        iru0 iru0Var = this.a;
        if (iru0Var.e() == null) {
            return;
        }
        iru0Var.H();
        iru0Var.G(iru0Var.I(this.b, this.c, this.d, this.e, this.f));
        iru0Var.s();
        ax31 ax31Var = iru0Var.r;
        ax31Var.getClass();
        tob1.b();
        Iterator it = ax31Var.a.iterator();
        while (it.hasNext()) {
            ax31Var.p((j) it.next());
        }
    }
}
